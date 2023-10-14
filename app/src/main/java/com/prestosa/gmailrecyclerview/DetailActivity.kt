package com.prestosa.gmailrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.prestosa.gmailrecyclerview.databinding.ActivityDetailAcivityBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailAcivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailAcivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.detailName.text =  intent.getStringExtra("NAME_PARAMS")
        binding.detailSubject.text =  intent.getStringExtra("SUBJECT_PARAMS")
        binding.detailMessage.text =  intent.getStringExtra("MESSAGE_PARAMS")
    }
}