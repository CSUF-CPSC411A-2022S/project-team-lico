package com.example.lico.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

/**
 * Data access object for the Discount entity. The class describes how data is
 * stored, updated, retrieved, or deleted from the database.
 */
@Dao
interface ProfileDao {
    // Add an discount entity to a table in the database.
    // We use suspend to run the function asynchronously (coroutine).
    @Insert
    suspend fun insert(profile: Profile)

    // Update an discount entity to a table in the database. Often uses the primary key
    // We use suspend to run the function asynchronously (coroutine).
    @Update
    suspend fun update(profile: Profile)

    // Custom query for retrieving a single Discount from a table in the database using
    // its discount id. We don't use suspend because LiveData objects are already designed
    // to work asynchronous.
    @Query("SELECT * from profile_table WHERE profileId = :key")
    fun get(key: Long): LiveData<Profile>?

    // Custom query for retrieving all Discount entities from a table in the database.
    // Data is stored to a List LiveData. We don't use suspend because LiveData objects
    // are already designed to work asynchronously.
    @Query("SELECT * from profile_table ORDER BY profileId DESC")
    fun getAllDiscounts(): LiveData<List<Profile>>

    // Custom query for deleting all entities on a table in the database
    // We use suspend to run the function asynchronously (coroutine).
    @Query("DELETE from profile_table")
    suspend fun clear()
}