package com.kotlinhva.studentportal

import android.net.Uri
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Portal(
    val title: String,
    val url: String
) : Parcelable