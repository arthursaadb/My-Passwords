package com.saad.myapplication.home.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.ItemTouchHelper
import com.saad.myapplication.R
import com.saad.myapplication.databinding.HomeFragmentBinding
import com.saad.myapplication.home.business.Password
import com.saad.myapplication.home.ui.adapter.ItemPasswordAdapter

class HomeFragment : Fragment() {
    private lateinit var viewModel: HomeViewModel
    private var _binding: HomeFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = HomeFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        configRecyclerView()
    }

    private fun configRecyclerView() {
        val spacingInPixels = resources.getDimensionPixelSize(R.dimen.default_margin)
        val lineHeight = resources.getDimensionPixelSize(R.dimen.line_divider)
        val lineColor = ContextCompat.getColor(requireContext(), R.color.black)
        val dividerItemDecoration = DividerItemDecoration(lineHeight, lineColor)
        val spacingItemDecorator = SpacingItemDecorator(spacingInPixels, spacingInPixels)
        val list: List<Password> = listOf(Password(1, "a", "b"), Password(1, "a", "b"))
        val itemPasswordAdapter = ItemPasswordAdapter(list)
        val itemTouchHelper = ItemTouchHelper(ItemTouchHelperCallback(itemPasswordAdapter))

        itemTouchHelper.attachToRecyclerView(binding.recyclerViewPasswords)

        binding.recyclerViewPasswords.apply {
            adapter = itemPasswordAdapter
            addItemDecoration(spacingItemDecorator)
        }
    }

    private fun setupItemTouchHelper() {

    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        fun newInstance() = HomeFragment()
    }
}