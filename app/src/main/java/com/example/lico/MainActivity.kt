package com.example.lico

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // need to add fragment into activity main assign ID to android.navhost...enables navigation(findNavController)
        binding.button.setOnClickListener { view: View ->
            view.findNavController()
                .navigate(R.id.action_nav_host_to_homePage2)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean{
        menuInflater.inflate(R.menu.nav_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item:MenuItem): Boolean{
        when(item.itemId){
            R.id.nav_favorite -> Toast.makeText(this,"Favorite Selected",Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }

}

