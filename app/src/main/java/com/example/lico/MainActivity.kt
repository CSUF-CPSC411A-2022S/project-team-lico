package com.example.lico

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.example.lico.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        /**
         * Remove comments only when working on 6.1 Model 3.
         * navController refers to our navigation fragment. The setupActionBarWithnavController
         * method connects our navController to the ActionBar that maintains the "back stack" which
         * is the succession of fragments that were opened. Pressing the Up button will display the
         * fragment that opened the current fragment, thereby back tracking its way to the first
         * fragment.
         */
         navController= Navigation.findNavController(this, R.id.nav_host)
        setupWithNavController(binding.bottomNavigationView, navController)
    }

    // create a database (the hardest part according to prof)
    // create multiple tables for the same database
    // resource table, etc
    // for each class needs its own entity
    // if we have a view that needs data from multiple tables can just get it

    // when the app runs it would build that database a fill the table then when it runs
    // again it checks if it's built

    // same function to check database
    // in mainActivity
    // getallresources
    // if FALSE
    // then load
    // else cont.


    // can load an sql file, but can be harder, so better to have some functions that loads all the
    // data into DB


    // can start setting up how list of resources would look like and the view of the resource for now
    // will be the same for each resource, the values would change with liveData
    // can start building entity and data access object

    /*
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

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
         val navController = this.findNavController(R.id.nav_host)
         NavigationUI.setupActionBarWithNavController(this,navController)
    }
    */

}