package com.example.lico

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.lico.databinding.FragmentHomepageBinding

/**
 * A simple [Fragment] subclass.
 * Use the [Homepage.newInstance] factory method to
 * create an instance of this fragment.
 */
class Homepage : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentHomepageBinding.inflate((layoutInflater))
        // Inflate the layout for this fragment
        // TODO: Assign the address value from TestProfile to the address EditText view

        /**
         * TODO: Do not implement unless working on 6.1 Model 2
         * Add setOnClickListener to the Modify button that navigates from Profile to Modified
         * fragment.
         */

        /**
         * Do not implement unless working on 6.2 Model 1
         * Modify the navigation action by first check for changes in any of the profile data using
         * the EditText elements of the fragment. If there are changes, navigate to Modified
         * fragment, otherwise navigate to the NotModified fragment.
         */

        /**
         * Do not implement unless working on 6.2 Model 2
         * Replace resource ID of the navigation actions with method calls using the
         * ProfileDirections object. Pass parameters accordingly.
         */
        binding.modify.setOnClickListener { view: View ->
            view.findNavController()
                .navigate(R.id.action_homepage_to_discount)
        }

        // Return a link to the layout root
        return binding.root
    }

}