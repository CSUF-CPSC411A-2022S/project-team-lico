package com.example.lico.resourceItems


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
import com.example.lico.database.ResourceEntity
import com.example.lico.database.databinding.ResourceItemBinding
import com.example.lico.discountitems.ResourceItemViewModelFactory


class Resource:Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: ResourceItemBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_resource, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

    }

}