package com.example.lico

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.NavHost
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragmentDirections
import androidx.navigation.ui.NavigationUI
import com.example.lico.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /**
         * Remove comments only when working on 6.1 Model 3.
         * navController refers to our navigation fragment. The setupActionBarWithnavController
         * method connects our navController to the ActionBar that maintains the "back stack" which
         * is the succession of fragments that were opened. Pressing the Up button will display the
         * fragment that opened the current fragment, thereby back tracking its way to the first
         * fragment.
         */
//        val navController = this.findNavController(R.id.nav_host)
//        NavigationUI.setupActionBarWithNavController(this, navController)

//        binding.button.setOnClickListener { view: View ->
//            view.findNavController()
//                .navigate(ActivityMainFragmentDirections.actionNavHostToHomePage2())
//
//        }
        binding.button.setOnClickListener { view: View ->
            view.findNavController()
                .navigate(R.id.action_nav_host_to_homePage2)
        }

    }


}