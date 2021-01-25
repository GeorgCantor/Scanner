package com.georgcantor.scanner.ui.fragment.scanner

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.georgcantor.scanner.R
import com.georgcantor.scanner.databinding.ScannerFragmentBinding
import com.georgcantor.scanner.util.viewBinding

class ScannerFragment : Fragment(R.layout.scanner_fragment) {

    private val binding by viewBinding(ScannerFragmentBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}