package com.ivandriancode.aikterjun.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.ivandriancode.aikterjun.R
import com.ivandriancode.aikterjun.fragment.ReviewInputFragment

class ReviewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_review)

        supportActionBar?.title = "Review"

        val mFragmentManager = supportFragmentManager
        val mReviewInputFragment = ReviewInputFragment()
        val fragment = mFragmentManager.findFragmentByTag(mReviewInputFragment::class.java.simpleName)
        if (fragment !is ReviewInputFragment) {
            Log.d("Text Fragment", "Fragment Name :" + mReviewInputFragment::class.java.simpleName)
            mFragmentManager
                .beginTransaction()
                .add(R.id.frame_container, mReviewInputFragment, ReviewInputFragment::class.java.simpleName)
                .commit()
        }
    }
}