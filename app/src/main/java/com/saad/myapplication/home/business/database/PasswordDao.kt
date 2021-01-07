package com.saad.myapplication.home.business.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.saad.myapplication.home.business.dataclasses.PasswordModelDB

@Dao
interface PasswordDao {

    @Query("SELECT * from list_passwords")
    fun getAllPassword(): List<PasswordModelDB>

    @Insert
    fun savePassword(password: PasswordModelDB)

}