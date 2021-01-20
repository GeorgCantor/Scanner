package com.georgcantor.scanner.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.georgcantor.scanner.R
import com.georgcantor.scanner.databinding.FragmentHomeBinding
import com.georgcantor.scanner.util.viewBinding

class HomeFragment : Fragment(R.layout.fragment_home) {

    private val binding by viewBinding(FragmentHomeBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}