package com.saad.myapplication.home.ui

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

const val FIRST_POSITION = 0

class SpacingItemDecorator(private val spacingVertical: Int, private val spacingHorizontal: Int) :
    RecyclerView.ItemDecoration() {

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        val position = parent.getChildAdapterPosition(view)

        outRect.apply {
            right = spacingHorizontal
            left = spacingHorizontal

            if (position != FIRST_POSITION) {
                bottom = spacingVertical
            }

            if(position != state.itemCount - 1 || position != FIRST_POSITION){
                top = spacingVertical
            }
        }
    }
}