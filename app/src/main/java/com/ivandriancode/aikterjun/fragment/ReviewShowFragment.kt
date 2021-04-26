package com.ivandriancode.aikterjun.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.ivandriancode.aikterjun.R
import com.ivandriancode.aikterjun.activity.MainActivity

class ReviewShowFragment : Fragment() {

    lateinit var backBtn: Button
    lateinit var tvReview: TextView

    companion object {
        var EXTRA_REVIEW = "extra_review"
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_review_show, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        backBtn = view.findViewById(R.id.backButton)
        tvReview = view.findViewById(R.id.showReview)

        backBtn.setOnClickListener {
            val intent = Intent(view.context, MainActivity::class.java)
            startActivity(intent)
            activity?.finishAffinity()
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        if (arguments != null) {
            val review = arguments?.getString(EXTRA_REVIEW)
            tvReview.text = review
        } else {
            tvReview.text = "Anda tidak memasukkan review"
        }
    }

}