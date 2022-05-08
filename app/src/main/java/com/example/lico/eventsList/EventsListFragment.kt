package com.example.lico.eventsList

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.lico.R
import com.example.lico.database.LicoDatabase
import com.example.lico.databinding.FragmentEventsListBinding
import com.example.lico.eventsList.EventsListFragmentDirections
import com.example.lico.eventsList.EventsViewModel
import com.example.lico.eventsList.EventsViewModelFactory

/**
 * Fragment that displays the input text fields and Discount list
 */
class EventsListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Create data binding
        val binding: FragmentEventsListBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_events_list, container, false)

        // Get reference to the application
        val application = requireNotNull(this.activity).application

        // Retrieve Discount data access object.
        val dataSource = LicoDatabase.getInstance(application).eventsDao

        // Create a factory that generates DiscountViewModels connected to the database.
        val viewModelFactory = EventsViewModelFactory(dataSource, application)

        // Generate an DiscountViewModel using the factory.
        val eventsViewModel =
            ViewModelProvider(
                this, viewModelFactory).get(EventsViewModel::class.java)

        // Connect the DiscountViewModel with the variable in the layout
        binding.eventsViewModel = EventsViewModel
        // Assign the lifecycle owner to the activity so it manages the data accordingly.
        binding.lifecycleOwner = this

        // Provide a lambda function that is called when the RecyclerView item is selected.
        var eventsAdapter = EventsListAdapter(EventsListener {
                eventsId ->
            // Navigate to the Discount view and provide the id of the Discount referenced
            // by the select RecyclerView item.

            this.findNavController().navigate(
                EventsListFragmentDirections
                    .actionEventsListFragmentToEventsItemFragment(eventsId)
            )
        })
        // Attach discount adapter.
        binding.eventsRecyclerview.adapter = eventsAdapter

        // Submit an updated list to the discount listAdapter whenever it changes. Take note
        // discountList is a LiveData object.
        eventsViewModel.eventsList.observe(viewLifecycleOwner, Observer {
            it?.let {
                eventsAdapter.submitList(it)
            }
        })
        return binding.root
    }
}