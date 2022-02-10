package com.itacademy.homework.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.itacademy.homework.Constants
import com.itacademy.homework.R
import com.itacademy.homework.adapters.GridAdapter
import com.itacademy.homework.databinding.FragmentLinearBinding

class FragmentLinear : Fragment() {

    private var _binding: FragmentLinearBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLinearBinding.inflate(inflater, container, false)
        binding.linearRecyclerView.adapter = GridAdapter(Constants.array, requireActivity())
        return binding.root
    }

}