package com.example.apppedranosrins20.view

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import com.example.apppedranosrins20.databinding.ActivityPhdaurinaBinding
import android.widget.SeekBar.OnSeekBarChangeListener as OnSeekBarChangeListener1


class PhActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPhdaurinaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPhdaurinaBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.seekBarPh.setOnSeekBarChangeListener(object : OnSeekBarChangeListener1 {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                var textoEurico = (p1.toFloat() / 10).toString()

                binding.textIndex.text = textoEurico
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

