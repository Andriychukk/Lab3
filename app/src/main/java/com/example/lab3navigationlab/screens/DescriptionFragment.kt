package com.example.lab3navigationlab.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.lab3navigationlab.MAIN
import com.example.lab3navigationlab.R
import com.example.lab3navigationlab.databinding.FragmentDescriptionBinding

class DescriptionFragment : Fragment() {
    private lateinit var binding: FragmentDescriptionBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDescriptionBinding.inflate(layoutInflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnBack.setOnClickListener {
            MAIN.navController.navigate(R.id.action_DescriptionFragment_to_PlayersListFragment)
        }
        val tv = view.findViewById<TextView>(R.id.player_desc)
        tv.text = arguments?.getString("description")

    }



}