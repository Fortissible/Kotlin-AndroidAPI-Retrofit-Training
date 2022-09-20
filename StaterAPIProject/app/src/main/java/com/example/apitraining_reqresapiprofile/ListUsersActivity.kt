package com.example.apitraining_reqresapiprofile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.apitraining_reqresapiprofile.databinding.ActivityListUsersBinding
import java.util.*

class ListUsersActivity : AppCompatActivity() {
    private lateinit var listUsersActivityBinding: ActivityListUsersBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        listUsersActivityBinding = ActivityListUsersBinding.inflate(layoutInflater)
        setContentView(listUsersActivityBinding.root)

        listUsersActivityBinding.listUsersRv.setHasFixedSize(true)
    }

    private fun showRecyclerView(data : List<Objects>){
        val rvAdapter = ListUsersAdapter(data)
        listUsersActivityBinding.listUsersRv.layoutManager = GridLayoutManager(this,2)
        listUsersActivityBinding.listUsersRv.adapter = rvAdapter

        //add item clickcallback and intent the data to userdetail activity
    }

    companion object {
        const val RV_ITEM_ID = "RV_ITEM_ID"
    }
}
