package com.saad.myapplication.home.ui

import androidx.recyclerview.widget.RecyclerView
import java.text.FieldPosition

interface ItemTouchHelperListener {
    fun onItemMove(recyclerView: RecyclerView, fromPosition: Int, toPosition: Int): Boolean
}