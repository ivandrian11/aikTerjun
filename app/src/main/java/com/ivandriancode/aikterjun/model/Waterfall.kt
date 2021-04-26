package com.ivandriancode.aikterjun.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Waterfall(
    var nama: String = "",
    var lokasi: String = "",
    var detail: String = "",
    var foto: Int = 0
) : Parcelable