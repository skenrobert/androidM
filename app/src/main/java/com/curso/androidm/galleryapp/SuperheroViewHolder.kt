package com.curso.androidm.galleryapp

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.curso.androidm.databinding.ItemSuperheroBinding
import com.squareup.picasso.Picasso

class SuperheroViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemSuperheroBinding.bind(view) //the view

    fun bind(superheroItemResponse: SuperheroItemResponse, onItemSelected: (String) -> Unit) {// after adapter, send id in onItemSelected, this fun bind is each view that gallery
        binding.tvSuperheroName.text = superheroItemResponse.name
        Picasso.get().load(superheroItemResponse.superheroImage.url).into(binding.ivSuperhero)
        binding.root.setOnClickListener { onItemSelected(superheroItemResponse.superheroId) }// root(each) is element complete, send id when onclick in this element, open detail superhero
    }
}