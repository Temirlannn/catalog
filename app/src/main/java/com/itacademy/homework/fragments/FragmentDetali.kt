package com.itacademy.homework.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.itacademy.homework.data.Models
import com.itacademy.homework.databinding.FragmentDetaliBinding

class FragmentDetali : Fragment() {

    private var _binding: FragmentDetaliBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetaliBinding.inflate(inflater,container,false)
        val item = arguments?.getSerializable("MAMA") as Models
        Glide.with(requireContext()).load(item.image).into(binding.imageDetail)
        binding.nameDetail.text = item.name
        binding.shortDescription.text = item.description
        binding.detailDescription.text = item.detailDescription

        return binding.root
    }

}