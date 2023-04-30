package com.example.practice_navigation_component_android_jetpack

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.practice_navigation_component_android_jetpack.databinding.FragmentDBinding

class DFragment : Fragment() {

    private lateinit var binding: FragmentDBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?
                              , savedInstanceState: Bundle?): View {
        binding = FragmentDBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnBackToC.setOnClickListener { v ->
            v.findNavController().popBackStack()   ///extension function from ktx
//            Navigation.findNavController(v).popBackStack()
        }
    }
}