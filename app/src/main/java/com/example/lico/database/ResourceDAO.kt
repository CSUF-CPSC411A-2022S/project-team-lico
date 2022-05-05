package com.example.lico.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface ResourceDAO {

    @Query("SELECT * from resource_table WHERE resourceid = :key")
    fun get(key: Long): LiveData<ResourceEntity>?

    // Custom query for retrieving all Discount entities from a table in the database.
    // Data is stored to a List LiveData. We don't use suspend because LiveData objects
    // are already designed to work asynchronously.
    @Query("SELECT * from resource_table ORDER BY resourceId DESC")
    fun getAllResources(): LiveData<List<ResourceEntity>>
}