package com.example.lico
import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.lico.database.DiscountDao
import com.example.lico.database.ProfileDao
import com.example.lico.discountitems.DiscountItemViewModel

/**
 * Generates an IntersectionViewModel tied to the database. It uses the provided intersection ID to
 * to create the IntersectionItemViewModel.
 */
class ProfileViewModelFactory(
    private val profileId: Long,
    private val dataSource: ProfileDao, // Data access object
    private val application: Application
): ViewModelProvider.Factory {

    /**
     * Creates the ProfileViewModel
     */
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ProfileViewModel::class.java)) { // ViewModel class
            return ProfileViewModel(profileId, dataSource, application) as T // Call ViewModel constructor
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}