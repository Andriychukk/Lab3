package com.example.lab3navigationlab.adapter


import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.lab3navigationlab.R
import com.example.lab3navigationlab.model.Model
import com.example.lab3navigationlab.screens.PlayersListFragment
import kotlinx.android.synthetic.main.profile_item.view.*
import kotlinx.android.synthetic.main.fragment_description.view.*
import kotlinx.android.synthetic.main.fragment_list.view.*


class Adapter(private val context: PlayersListFragment) :RecyclerView.Adapter<Adapter.FilmViewHolder>() {

    private var filmsList = emptyList<Model>()

    class FilmViewHolder(view: View):RecyclerView.ViewHolder(view){
        var image: ImageView

        init {
            this.image = itemView.findViewById(R.id.sportsman_image)
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.profile_item, parent, false)
        return FilmViewHolder(view)
    }

    override fun onBindViewHolder(holder: FilmViewHolder, position: Int) {

        holder.itemView.name.text = filmsList[position].name
        Glide.with(context).load(filmsList[position].image).into(holder.image)

        val bundle = bundleOf("description" to filmsList[position].description)
        holder.itemView.setOnClickListener{view-> view.findNavController().navigate(R.id.main_nav2,bundle)}


    }

    override fun getItemCount(): Int {
        return filmsList.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<Model>){
        filmsList = list
        notifyDataSetChanged()
    }
}