package com.example.lico

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.lico.fragments.AddFragment
import com.example.lico.fragments.DashboardFragment
import com.example.lico.fragments.ViewFragment

class MainActivity : AppCompatActivity() {

    private val dashboardFragment = DashboardFragment()
    private val addFragment = AddFragment()
    private val viewFragment = ViewFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragment(dashboardFragment)

        bottom_navigation.setOnNavigationItemSelectedListener{
            when(it.itemId){
                R.id.ic_dashboard -> replaceFragment(dashboardFragment)
                R.id.ic_add -> replaceFragment(addFragment)
                R.id.ic_view -> replaceFragment(viewFragment)
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment){
        if(fragment !=null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragment)
            transaction.commit()
        }
    }
}