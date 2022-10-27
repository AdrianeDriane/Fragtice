package com.adrianedilao.fragtice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.adrianedilao.fragtice.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentFirstBinding.inflate(inflater, container, false)
        binding.textView1.setOnClickListener{ Navigation.findNavController(binding.root)
            .navigate(R.id.navigate_to_second_fragment) }

        return binding.root
    }

}