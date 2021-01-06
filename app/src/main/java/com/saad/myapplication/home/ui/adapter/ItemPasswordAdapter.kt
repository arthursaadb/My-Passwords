package com.saad.myapplication.home.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.saad.myapplication.R
import com.saad.myapplication.databinding.ItemPasswordBinding
import com.saad.myapplication.home.business.Password

class ItemPasswordAdapter(val passwords: List<Password>) :
    RecyclerView.Adapter<ItemPasswordAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_password,
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) =
        holder.onBind(passwords[position])

    override fun getItemCount(): Int = passwords.size

    inner class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val binding = ItemPasswordBinding.bind(view)

        fun onBind(password: Password) {
            setIcon(password.icon)
            setName(password.name)
            setPassword(password.valuePassword)
            setOnClick()
        }

        fun setIcon(icon: Int) {

        }

        fun setName(name: String) {
            binding.itemName.text = name
        }

        fun setPassword(password: String) {
            binding.itemPassword.text = password
        }

        fun setOnClick() {
            binding.itemIcon.setOnClickListener {
                Toast.makeText(
                    binding.root.context,
                    "Olá, eu cliquei no item bosta",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}