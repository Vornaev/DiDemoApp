package com.viktor.innap.didemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.viktor.innap.didemoapp.di.MainRepository
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.get
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private val mainRepository: MainRepository = get()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onStart() {
        super.onStart()

        loginButton.setOnClickListener {
            val token = mainRepository.loginUser("vmanev@melon", "droid04")
            token.let {
                Toast.makeText(this, "successfully login", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
