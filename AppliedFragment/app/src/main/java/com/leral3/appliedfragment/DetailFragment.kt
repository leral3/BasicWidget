package com.leral3.appliedfragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.leral3.appliedfragment.databinding.FragmentDetailBinding


class DetailFragment : Fragment() {

    var mainActivity: MainActivity? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentDetailBinding.inflate(inflater, container, false)
        binding.btnFragmentA.setOnClickListener {mainActivity?.goBack()}
        return binding.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        mainActivity = context as MainActivity
    }
}