package com.learnwithpuneet.understand_navigation_architecture

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.learnwithpuneet.understand_navigation_architecture.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var homeBinding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        homeBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container,false)

        // without args
        /* homeBinding.btnDetail.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_detailFragment)
        }
         */

        // with args
        homeBinding.btnDetail.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToDetailFragment("Puneet Grover")
            it.findNavController().navigate(action)
        }
        return homeBinding.root
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) = HomeFragment()
    }
}