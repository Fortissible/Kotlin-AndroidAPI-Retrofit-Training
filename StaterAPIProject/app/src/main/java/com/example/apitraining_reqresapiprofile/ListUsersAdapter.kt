package com.example.apitraining_reqresapiprofile

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.apitraining_reqresapiprofile.databinding.UserCardItemBinding
import java.util.*

class ListUsersAdapter(private val usersData: List<Objects>): RecyclerView.Adapter<ListUsersAdapter.ViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    class ViewHolder(var binding: UserCardItemBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = UserCardItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val userData = usersData[position]

        //use glide and viewbinding to attach data and add click callback to the view

    }

    override fun getItemCount(): Int = usersData.size

    interface OnItemClickCallback {
        fun onItemClicked(userData: Objects)
    }
}