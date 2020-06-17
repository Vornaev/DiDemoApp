package org.melon.internal.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class BaseModuleMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base_module_main)
    }
}
