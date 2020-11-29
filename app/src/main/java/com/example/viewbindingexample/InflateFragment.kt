package com.example.viewbindingexample

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewbindingexample.databinding.FragmentInflateBinding


class InflateFragment : Fragment() {

    private var binding: FragmentInflateBinding? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentInflateBinding.inflate(layoutInflater)
        changeTheDefaultWelcomeMessage()
        return binding?.root
    }

    private fun changeTheDefaultWelcomeMessage() {
        Handler().postDelayed({
            binding?.welcomeMessage?.text = getString(R.string.inflate_fragment_binding_message)
        }, 2500)
    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }
}