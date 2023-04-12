package com.curso.androidm.galleryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.SearchView
import com.curso.androidm.R
import com.curso.androidm.databinding.ActivitySuperHeroListBinding

class SuperHeroListActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySuperHeroListBinding
//    private lateinit var retrofit: Retrofit
//
//    private lateinit var adapter: SuperheroAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySuperHeroListBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        retrofit = getRetrofit()
        initUI()
    }

    private fun initUI() {
        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
//                searchByName(query.orEmpty())
                return false
            }

            override fun onQueryTextChange(newText: String?) = false
        })

//        adapter = SuperheroAdapter { superheroId ->  navigateToDetail(superheroId) }
//        binding.rvSuperhero.setHasFixedSize(true)
//        binding.rvSuperhero.layoutManager = LinearLayoutManager(this)
//        binding.rvSuperhero.adapter = adapter
    }

//    private fun searchByName(query: String) {
//        binding.progressBar.isVisible = true
//        CoroutineScope(Dispatchers.IO).launch {
//            val myResponse: Response<SuperHeroDataResponse> =
//                retrofit.create(ApiService::class.java).getSuperheroes(query)
//            if (myResponse.isSuccessful) {
//                Log.i("aristidevs", "funciona :)")
//                val response: SuperHeroDataResponse? = myResponse.body()
//                if (response != null) {
//                    Log.i("aristidevs", response.toString())
//                    runOnUiThread {
//                        adapter.updateList(response.superheroes)
//                        binding.progressBar.isVisible = false
//                    }
//                }
//            } else {
//                Log.i("aristidevs", "No funciona :(")
//            }
//        }
//    }
//
//    private fun getRetrofit(): Retrofit {
//        return Retrofit
//            .Builder()
//            .baseUrl("https://superheroapi.com/")
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//    }
//
//    private fun navigateToDetail(id: String) {
//        val intent = Intent(this, DetailSuperheroActivity::class.java)
//        intent.putExtra(EXTRA_ID, id)
//        startActivity(intent)
//    }
}