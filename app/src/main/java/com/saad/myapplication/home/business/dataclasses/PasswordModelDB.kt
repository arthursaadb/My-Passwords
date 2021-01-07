package com.saad.myapplication.home.business.dataclasses

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "list_passwords")
data class PasswordModelDB(
    @ColumnInfo(name = "id") @PrimaryKey(autoGenerate = true) val id: Long,
    @ColumnInfo(name = "password_name") val passwordName: String,
    @ColumnInfo(name = "password_value") val passwordValue: String
)
