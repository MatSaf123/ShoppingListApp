package com.matsaf123.shoppinglistapp.ui.shoppinglist

import com.matsaf123.shoppinglistapp.data.db.entities.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item : ShoppingItem)
}