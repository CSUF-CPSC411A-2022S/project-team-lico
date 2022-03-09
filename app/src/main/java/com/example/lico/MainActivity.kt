package com.example.lico

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: ArrayAdapter<*>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = ArrayAdapter(context = this, android.R.layout.simple_list_item_1, resources.getStringArray(R.array.resourceTitles))
        lv_listView.adapter = adapter
        lv_listView



    }

}

