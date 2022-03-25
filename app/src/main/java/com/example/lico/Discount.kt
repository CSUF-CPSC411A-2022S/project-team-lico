package com.example.lico

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lico.databinding.FragmentDiscountBinding
import com.example.lico.databinding.FragmentHomepageBinding


/**
 * A simple [Fragment] subclass.
 * Use the [Discount.newInstance] factory method to
 * create an instance of this fragment.
 */
class Discount : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentDiscountBinding.inflate((layoutInflater))
        // Inflate the layout for this fragment
        return binding.root
    }

}