package com.example.practice_navigation_component_android_jetpack

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.practice_navigation_component_android_jetpack.databinding.FragmentCBinding

class CFragment : Fragment() {

    lateinit var binding: FragmentCBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?
                              , savedInstanceState: Bundle?): View {
        binding = FragmentCBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNavToD.setOnClickListener { v ->
            Navigation.findNavController(v).navigate(R.id.action_CFragment_to_DFragment)
        }
    }
}