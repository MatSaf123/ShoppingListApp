package com.matsaf123.shoppinglistapp

import android.app.Application
import com.matsaf123.shoppinglistapp.data.db.ShoppingDatabase
import com.matsaf123.shoppinglistapp.data.repositories.ShoppingRepository
import com.matsaf123.shoppinglistapp.ui.shoppinglist.ShoppingViewModelFactory
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.androidXModule
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton

class ShoppingApplication : Application(), KodeinAware {

    override val kodein: Kodein = Kodein.lazy {
        //  lazy means that inside this block we can use application context during binding time
        import(androidXModule(this@ShoppingApplication))
        bind() from singleton { ShoppingDatabase(instance()) }      // had to add some code in build.gradle
        bind() from singleton { ShoppingRepository(instance()) }
        bind() from provider {
            ShoppingViewModelFactory(instance())
        }

    }
}