package com.matsaf123.shoppinglistapp.ui.shoppinglist

import androidx.lifecycle.ViewModel
import com.matsaf123.shoppinglistapp.data.db.entities.ShoppingItem
import com.matsaf123.shoppinglistapp.data.repositories.ShoppingRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class  ShoppingViewModel(
    private val repository : ShoppingRepository
) : ViewModel() {

    fun upsert(item : ShoppingItem) =  CoroutineScope(Dispatchers.Main).launch {
        repository.upsert(item)
    }

    fun delete(item : ShoppingItem) = CoroutineScope(Dispatchers.Main).launch {
        repository.delete(item)
    }

    fun deleteAllFromTable() = CoroutineScope(Dispatchers.Main).launch {
        repository.deleteAllFromTable()
    }

    fun getAllShoppingItems() = repository.getAllShoppingItems()
}