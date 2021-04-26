package com.ivandriancode.aikterjun.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.ivandriancode.aikterjun.R

class ReviewInputFragment : Fragment() {

    lateinit var etReview: EditText
    lateinit var sendButton: Button


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_review_input, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        sendButton = view.findViewById(R.id.backButton)
        etReview = view.findViewById(R.id.yourReview)
        sendButton.setOnClickListener {
            val mShowReviewFragment = ReviewShowFragment()

            val mBundle = Bundle()
            mBundle.putString(ReviewShowFragment.EXTRA_REVIEW, etReview.text.toString())
            mShowReviewFragment.arguments = mBundle

            val mFragmentManager = fragmentManager
            mFragmentManager?.beginTransaction()?.apply {
                replace(
                    R.id.frame_container,
                    mShowReviewFragment,
                    ReviewShowFragment::class.java.simpleName
                )
                addToBackStack(null)
                commit()
            }
        }
    }
}