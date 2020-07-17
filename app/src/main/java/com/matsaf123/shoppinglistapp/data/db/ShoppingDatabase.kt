package com.matsaf123.shoppinglistapp

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.matsaf123.shoppinglistapp.data.ShoppingItem

@Database(
    entities = [ShoppingItem::class],
    version = 1
)
abstract class ShoppingDatabase : RoomDatabase() {

    abstract fun getShoppingDao() : ShoppingDao

    companion object {

        @Volatile

        private var instance : ShoppingDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context : Context) = instance
            ?: synchronized(LOCK) {
            if (instance == null) createDatabase(
                context
            )
                .also { instance = it }
        }

        private fun createDatabase(context : Context) =
            Room.databaseBuilder(
                context.applicationContext,
                ShoppingDatabase::class.java,
                "ShoppingDB.db")
                .build()
    }
}