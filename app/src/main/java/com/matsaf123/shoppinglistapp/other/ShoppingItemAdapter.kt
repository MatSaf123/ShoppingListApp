package com.matsaf123.shoppinglistapp.other

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.matsaf123.shoppinglistapp.R
import com.matsaf123.shoppinglistapp.data.db.entities.ShoppingItem
import com.matsaf123.shoppinglistapp.ui.shoppinglist.ShoppingViewModel
import kotlinx.android.synthetic.main.shopping_item.view.*

class ShoppingItemAdapter(
    var items : List<ShoppingItem>,
    private val viewModel : ShoppingViewModel

) : RecyclerView.Adapter<ShoppingItemAdapter.ShoppingViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShoppingViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.shopping_item, parent, false)
        return ShoppingViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ShoppingViewHolder, position: Int) {
        val currShoppingItem = items[position]

        holder.itemView.tvName.text = currShoppingItem.name
        holder.itemView.tvAmount.text = "${currShoppingItem.amount}"

        holder.itemView.ivDelete.setOnClickListener {
            viewModel.delete(currShoppingItem)
        }

        holder.itemView.ivPlus.setOnClickListener {
            if(currShoppingItem.amount<Int.MAX_VALUE)
                currShoppingItem.amount++
            viewModel.upsert(currShoppingItem)
        }

        holder.itemView.ivMinus.setOnClickListener {
            if(currShoppingItem.amount>0)
                currShoppingItem.amount--
            viewModel.upsert(currShoppingItem)
        }
    }

    inner class ShoppingViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView)

}