package com.example.paramfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.example.paramfragment.databinding.FragmentBBinding


class BFragment : Fragment() {

    private lateinit var binding:FragmentBBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_b,container,false)

        val args: BFragmentArgs by navArgs()
        val name = args.studentName

        binding.tvResult.text = name

        return binding.root
    }

}