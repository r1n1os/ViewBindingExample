package com.example.viewbindingexample

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewbindingexample.databinding.FragmentBindBinding

class BindFragment : Fragment() {

    private  var binding: FragmentBindBinding? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_bind, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentBindBinding.bind(view)
        changeTheDefaultWelcomeMessage()
    }

    private fun changeTheDefaultWelcomeMessage() {
        Handler().postDelayed({
            binding?.welcomeMessage?.text = getString(R.string.binding_fragment_binding_message)
        }, 2500)
    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }
}