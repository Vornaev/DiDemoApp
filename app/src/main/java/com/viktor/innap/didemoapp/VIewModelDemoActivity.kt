package com.viktor.innap.didemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import com.viktor.innap.didemoapp.main.MainViewModel
import kotlinx.android.synthetic.main.activity_v_iew_model_demo.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class VIewModelDemoActivity : AppCompatActivity() {

    private val myViewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_v_iew_model_demo)

        myViewModel.loginUserResponse.observe(this, Observer {
            Toast.makeText(this, "success", Toast.LENGTH_LONG).show()
        })

        logButton.setOnClickListener {
            myViewModel.loginUser("vmanev", "12345")
        }

    }
}
