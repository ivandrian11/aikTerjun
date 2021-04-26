package com.ivandriancode.aikterjun.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.ivandriancode.aikterjun.R
import com.ivandriancode.aikterjun.model.Waterfall

class DetailActivity : AppCompatActivity() {
    lateinit var imgPhoto: ImageView
    lateinit var placeName: TextView
    lateinit var placeLocation: TextView
    lateinit var placeDetail: TextView
    lateinit var reviewButton: Button

    companion object {
        const val EXTRA_WATERFALL = "extra_waterfall"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        imgPhoto = findViewById(R.id.foto_detail)
        placeName = findViewById(R.id.nama_detail)
        placeLocation = findViewById(R.id.lokasi_detail)
        placeDetail = findViewById(R.id.detail_detail)
        reviewButton = findViewById(R.id.review_button)

        val waterfall = intent.getParcelableExtra<Waterfall>(EXTRA_WATERFALL) as Waterfall
        Glide.with(this)
            .load(waterfall.foto)
            .apply(RequestOptions().override(350, 550))
            .into(imgPhoto)
        placeName.text = waterfall.nama
        placeLocation.text = waterfall.lokasi
        placeDetail.text = waterfall.detail
        reviewButton.setOnClickListener {
            val reviewIntent = Intent(this, ReviewActivity::class.java)
            startActivity(reviewIntent)
        }

        supportActionBar?.title = "Detail ${waterfall.nama}"
    }
}