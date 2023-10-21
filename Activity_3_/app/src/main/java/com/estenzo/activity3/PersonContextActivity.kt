package com.estenzo.activity3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.estenzo.activity3.databinding.ActivityPersonContextBinding

class PersonContextActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPersonContextBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPersonContextBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        val subject = intent.getStringExtra("subject")
        val content = intent.getStringExtra("content")

        binding.nameTextView.text = name
        binding.subjectTextView.text = subject
        binding.contentTextView.text = content
    }
}