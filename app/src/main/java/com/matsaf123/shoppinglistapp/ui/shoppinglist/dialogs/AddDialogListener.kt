package com.matsaf123.shoppinglistapp.ui.shoppinglist.dialogs

import com.matsaf123.shoppinglistapp.data.db.entities.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item : ShoppingItem)
}