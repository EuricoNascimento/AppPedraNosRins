package com.example.apppedranosrins20.view

import android.os.Bundle
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.apppedranosrins20.databinding.ActivityPhdaurinaBinding
import com.example.apppedranosrins20.repository.PhRepository
import com.example.apppedranosrins20.viewmodel.PhViewModel
import android.widget.SeekBar.OnSeekBarChangeListener as OnSeekBarChangeListener1


class PhActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPhdaurinaBinding
    private lateinit var viewModel: PhViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPhdaurinaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(
            this,
            PhViewModel.PhViewModelFactory(PhRepository())
        ).get(PhViewModel::class.java)

        binding.seekBarPh.setOnSeekBarChangeListener(object : OnSeekBarChangeListener1 {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                var textNumber = (p1.toFloat() / 10).toString()

                binding.textIndex.text = textNumber
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                return
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                return
            }

        })

    }

    companion object {
        private var TAG = PhActivity::class.java.simpleName.toString()
    }

}

