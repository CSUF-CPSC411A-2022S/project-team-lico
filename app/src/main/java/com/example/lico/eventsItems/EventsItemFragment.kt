package com.example.lico.eventsItems

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.lico.R
import com.example.lico.database.LicoDatabase
import com.example.lico.databinding.FragmentEventsItemBinding
import com.example.lico.eventsList.EventsViewModel
import com.example.lico.eventsList.EventsViewModelFactory

/**
 * Fragment that displays a single discount.
 */
class EventsItemFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Retrieve arguments passed from the RecyclerView
        val args = EventsItemFragmentArgs.fromBundle(
            requireArguments()
        )

        // Create data binding
        val binding: FragmentEventsItemBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_events_item, container, false)

        // Get reference to this application
        val application = requireNotNull(this.activity).application

        // Retrieve Discount data access object.
        val dataSource = LicoDatabase.getInstance(application).eventsDao

        // Create a factory that generates an DiscountViewModel connected to the database. The
        // discountId passed from the RecyclerView is used to display the corresponding
        // information.
        val viewModelFactory =
            EventsItemViewModelFactory(args.eventsId, dataSource, application)

        // Generate an DiscountViewModel using the factory.
        val eventsItemViewModel =
            ViewModelProvider(
                this, viewModelFactory
            ).get(EventsItemViewModel::class.java)

        // Connect the DiscountViewModel with the variable in the layout
        binding.eventsItemViewModel = eventsItemViewModel
        // Assign the lifecycle owner to the activity so it manages the data accordingly.
        binding.lifecycleOwner = this

        return binding.root
    }
}