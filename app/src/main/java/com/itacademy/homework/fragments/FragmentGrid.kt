package com.itacademy.homework.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.itacademy.homework.Constants
import com.itacademy.homework.R
import com.itacademy.homework.adapters.GridAdapter
import com.itacademy.homework.databinding.FragmentGridBinding

class FragmentGrid : Fragment() {

    private var _binding: FragmentGridBinding? = null

    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentGridBinding.inflate(inflater, container, false)
        binding.gridRecyclerView.layoutManager = GridLayoutManager(requireActivity(), 2)
        binding.gridRecyclerView.adapter = GridAdapter(Constants.array, requireActivity())

        return binding.root

    }
}