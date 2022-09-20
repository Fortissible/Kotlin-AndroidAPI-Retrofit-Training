package com.example.apitraining_reqresapiprofile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.apitraining_reqresapiprofile.databinding.ActivityUploadUserBinding

class UploadUserActivity : AppCompatActivity() {
    private lateinit var uploadUserBinding: ActivityUploadUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        uploadUserBinding = ActivityUploadUserBinding.inflate(layoutInflater)
        setContentView(uploadUserBinding.root)

        uploadUserBinding.uploadDataUserBtn.setOnClickListener {
            // do action when button is clicked
        }
    }
}