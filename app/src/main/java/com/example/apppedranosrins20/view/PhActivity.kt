package com.example.apppedranosrins20.view

import android.os.Bundle
import android.widget.ProgressBar
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import androidx.appcompat.app.AppCompatActivity
import com.example.apppedranosrins20.databinding.ActivityPhdaurinaBinding

class PhActivity : AppCompatActivity(){

    private lateinit var binding: ActivityPhdaurinaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPhdaurinaBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.seekBarPh.setOnSeekBarChangeListener(object : OnSeekBarChangeListener) {

        }
    }
}

private fun ProgressBar.setOnSeekBarChangeListener(
    onSeekBarChangeListener: OnSeekBarChangeListener,
    function: () -> Unit
) {
    /*fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean){

    }*/
}

