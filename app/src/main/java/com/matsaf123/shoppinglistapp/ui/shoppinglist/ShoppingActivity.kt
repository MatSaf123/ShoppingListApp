package com.matsaf123.shoppinglistapp.ui.shoppinglist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.matsaf123.shoppinglistapp.R
import com.matsaf123.shoppinglistapp.data.db.ShoppingDatabase
import com.matsaf123.shoppinglistapp.data.db.entities.ShoppingItem
import com.matsaf123.shoppinglistapp.data.repositories.ShoppingRepository
import com.matsaf123.shoppinglistapp.other.ShoppingItemAdapter
import kotlinx.android.synthetic.main.activity_shopping.*

class ShoppingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping)

        val database = ShoppingDatabase(this)   // bad practice, will be replaced later
        val repository = ShoppingRepository(database)
        val factory = ShoppingViewModelFactory(repository)

        val viewModel = ViewModelProvider(this, factory).get(ShoppingViewModel::class.java)

        val adapter = ShoppingItemAdapter(listOf(), viewModel)
        rvShoppingItems.layoutManager = LinearLayoutManager(this)
        rvShoppingItems.adapter = adapter

        viewModel.getAllShoppingItems().observe(this, Observer {
            adapter.items = it
            adapter.notifyDataSetChanged()
        })  // observe method from LiveData (ShoppingDao); whenever database changes, observe method will be called and code inside the method will be executed

        fab.setOnClickListener{
            AddShoppingItemDialog(this,
            object : AddDialogListener {
                override fun onAddButtonClicked(item: ShoppingItem) {
                    viewModel.upsert(item)  //insert item into DB
                }
            }).show()
        }
    }
}
