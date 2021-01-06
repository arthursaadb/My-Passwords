package com.saad.myapplication.home.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
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

        val list: List<Password> = listOf(Password(1, "a", "b"), Password(1, "a", "b"))
        val adapter = ItemPasswordAdapter(list)

        binding.recyclerViewPasswords.adapter = adapter
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        fun newInstance() = HomeFragment()
    }
}