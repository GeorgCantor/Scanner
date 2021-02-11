package com.georgcantor.scanner.ui.fragment.scanner

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.georgcantor.scanner.R
import com.georgcantor.scanner.databinding.FragmentScannerBinding
import com.georgcantor.scanner.util.viewBinding

class ScannerFragment : Fragment(R.layout.fragment_scanner) {

    private val binding by viewBinding(FragmentScannerBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}