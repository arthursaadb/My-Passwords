package com.saad.myapplication

import android.app.Application
import androidx.room.Room
import com.saad.myapplication.core.AppDatabase

class MyPasswordsApplication : Application() {
    companion object {
        var database: AppDatabase? = null
    }

    override fun onCreate() {
        super.onCreate()

        MyPasswordsApplication.database = Room.databaseBuilder(
            this, AppDatabase::class.java,
            "my-passwords-db"
        ).build()
    }
}