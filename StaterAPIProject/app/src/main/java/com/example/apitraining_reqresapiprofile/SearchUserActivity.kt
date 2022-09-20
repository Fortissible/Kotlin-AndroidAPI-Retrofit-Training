package com.example.apitraining_reqresapiprofile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SearchView
import com.example.apitraining_reqresapiprofile.databinding.ActivitySearchUserBinding

class SearchUserActivity : AppCompatActivity() {
    private lateinit var searchUserBinding: ActivitySearchUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        searchUserBinding = ActivitySearchUserBinding.inflate(layoutInflater)
        setContentView(searchUserBinding.root)

        searchUserBinding.searchUserInput.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                //do action when search query
                return true
            }
            override fun onQueryTextChange(newText: String?): Boolean {
                return false
            }
        })
    }
}