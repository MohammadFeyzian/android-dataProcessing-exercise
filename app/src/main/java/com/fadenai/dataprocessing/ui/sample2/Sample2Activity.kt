package com.fadenai.dataprocessing.ui.sample2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.fadenai.dataprocessing.ui.sample2.compose.Sample2UIEntry

class Sample2Activity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Sample2UIEntry(
                onBack = {
                    onBackPressedDispatcher.onBackPressed()
                }
            )
        }
    }
}