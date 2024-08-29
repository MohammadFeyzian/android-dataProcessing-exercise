package com.fadenai.dataprocessing.ui.home

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.fadenai.dataprocessing.ui.theme.DataProcessingTheme

class HomeActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DataProcessingTheme {
                HomeListView { item ->
                    item.destination?.let { destination ->
                        startActivity(
                            Intent(
                                this,
                                destination
                            )
                        )
                    }
                }
            }
        }
    }
}