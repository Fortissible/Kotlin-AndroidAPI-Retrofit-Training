package com.example.apitraining_reqresapiprofile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.apitraining_reqresapiprofile.databinding.ActivityUserBinding
import java.util.*

class UserActivity : AppCompatActivity() {
    private lateinit var activityUserBinding: ActivityUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityUserBinding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(activityUserBinding.root)

        // get intent data from list user activity
        // attach data to the view via viewbinding and glide
    }
}