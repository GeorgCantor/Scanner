package com.georgcantor.scanner.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.georgcantor.scanner.databinding.ActivityMainBinding
import com.georgcantor.scanner.util.NetworkUtils.getNetworkLiveData
import com.georgcantor.scanner.util.viewBinding

class MainActivity : AppCompatActivity() {

    private val binding by viewBinding(ActivityMainBinding::inflate)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        getNetworkLiveData(applicationContext).observe(this) {
//            binding.noInternetWarning.setVisibility(!it)
        }
    }
}