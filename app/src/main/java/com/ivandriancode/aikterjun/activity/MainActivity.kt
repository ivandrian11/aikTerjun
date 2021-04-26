package com.ivandriancode.aikterjun.activity

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ivandriancode.aikterjun.R
import com.ivandriancode.aikterjun.data.WaterfallData
import com.ivandriancode.aikterjun.data.adapter.CardViewAdapter
import com.ivandriancode.aikterjun.model.Waterfall


class MainActivity : AppCompatActivity() {
    private lateinit var rvWaterfalls: RecyclerView
    private var list: ArrayList<Waterfall> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title = "Home"

        rvWaterfalls = findViewById(R.id.rv_heroes)
        rvWaterfalls.setHasFixedSize(true)

        list.addAll(WaterfallData.listData)
        showRecyclerCardView()
    }

    private fun showRecyclerCardView() {
        rvWaterfalls.layoutManager = LinearLayoutManager(this)
        val cardViewHeroAdapter = CardViewAdapter(list)
        rvWaterfalls.adapter = cardViewHeroAdapter

        cardViewHeroAdapter.setOnItemClickCallback(object : CardViewAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Waterfall) {
                val moveWithObjectIntent = Intent(this@MainActivity, DetailActivity::class.java)
                moveWithObjectIntent.putExtra(DetailActivity.EXTRA_WATERFALL, data)
                startActivity(moveWithObjectIntent)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.about, menu)
        return super.onCreateOptionsMenu(menu)
    }

    // handle button activities
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.about) {
            val aboutIntent = Intent(this@MainActivity, AboutActivity::class.java)
            startActivity(aboutIntent)
        }
        return super.onOptionsItemSelected(item)
    }
}