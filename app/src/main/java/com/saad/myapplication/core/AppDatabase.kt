package com.saad.myapplication.core

import androidx.room.Database
import androidx.room.RoomDatabase
import com.saad.myapplication.home.business.database.PasswordDao
import com.saad.myapplication.home.business.dataclasses.PasswordModelDB

@Database(entities = [PasswordModelDB::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun providePasswordDao(): PasswordDao
}