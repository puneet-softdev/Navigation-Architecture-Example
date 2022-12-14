package com.learnwithpuneet.understand_navigation_architecture

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.learnwithpuneet.understand_navigation_architecture.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {
    private lateinit var fragmentDetailBinding: FragmentDetailBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentDetailBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_detail, container,false)
        return fragmentDetailBinding.root
    }
}