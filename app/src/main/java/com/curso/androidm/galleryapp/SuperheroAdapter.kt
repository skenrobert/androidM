package com.curso.androidm.galleryapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curso.androidm.R

class SuperheroAdapter( //create recycle view
    var superheroList: List<SuperheroItemResponse> = emptyList(),
    private val onItemSelected: (String) -> Unit //call back o fun landa return id
) :
    RecyclerView.Adapter<SuperheroViewHolder>() {

    fun updateList(list: List<SuperheroItemResponse>) {
        superheroList = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperheroViewHolder {
        return SuperheroViewHolder(//call recycle view
            LayoutInflater.from(parent.context).inflate(R.layout.item_superhero, parent, false)
        )
    }

    override fun onBindViewHolder(viewholder: SuperheroViewHolder, position: Int) {// paint view an send onItenSelected  is fun with id element
        viewholder.bind(superheroList[position],onItemSelected)
    }

    override fun getItemCount() = superheroList.size


}