package com.matsaf123.shoppinglistapp.other

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.matsaf123.shoppinglistapp.R
import com.matsaf123.shoppinglistapp.data.db.entities.ShoppingItem
import com.matsaf123.shoppinglistapp.ui.shoppinglist.dialogs.AddDialogListener
import com.matsaf123.shoppinglistapp.ui.shoppinglist.dialogs.AddShoppingItemDialog
import com.matsaf123.shoppinglistapp.ui.shoppinglist.ShoppingViewModel
import kotlinx.android.synthetic.main.shopping_item.view.*

class ShoppingItemAdapter(
    var items : List<ShoppingItem>,
    private val viewModel : ShoppingViewModel

) : RecyclerView.Adapter<ShoppingItemAdapter.ShoppingViewHolder>() {

    val TAG = "ShoppingItemAdapter"

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

        holder.itemView.ivUp.setOnClickListener {
            if(currShoppingItem.id != items[0].id) {

                Log.d(TAG,"currShoppingItem.id="+currShoppingItem.id)

                val itemToGoUp = currShoppingItem
                val itemToGoDown = items[position-1]

                val temp = itemToGoDown.id
                itemToGoDown.id = itemToGoUp.id
                itemToGoUp.id = temp

                viewModel.upsert(itemToGoUp)
                viewModel.upsert(itemToGoDown)
            }
        }

        holder.itemView.ivDown.setOnClickListener {
            if(currShoppingItem.id != items[itemCount-1].id) {
                val itemToGoDown = currShoppingItem
                val itemToGoUp = items[position+1]

                val temp = itemToGoDown.id
                itemToGoDown.id = itemToGoUp.id
                itemToGoUp.id = temp

                viewModel.upsert(itemToGoUp)
                viewModel.upsert(itemToGoDown)
            }
        }

        holder.itemView.tvName.setOnClickListener {
            AddShoppingItemDialog(
                it.context,
                object :
                    AddDialogListener {
                    override fun onAddButtonClicked(item: ShoppingItem) {
                        item.id = currShoppingItem.id
                        viewModel.upsert(item)
                    }
                }).show()
        }
    }

    inner class ShoppingViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView)

}