package com.example.android.minipaint

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val customCanvasView = CustomCanvasView(this).apply {
            systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
            contentDescription = getString(R.string.canvas_content_description)
        }
        setContentView(customCanvasView)
    }
}