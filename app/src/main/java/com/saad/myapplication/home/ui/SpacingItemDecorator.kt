package com.saad.myapplication.home.ui

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class SpacingItemDecorator(private val spacingVertical: Int, private val spacingHorizontal: Int) :
    RecyclerView.ItemDecoration() {

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        outRect.apply {
            right = spacingHorizontal
            left = spacingHorizontal
            top = spacingVertical
            bottom = spacingVertical
        }
    }
}