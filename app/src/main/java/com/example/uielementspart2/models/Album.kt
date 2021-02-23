package com.example.uielementspart2.models

import android.text.format.DateFormat
import java.util.*

class Album (var id: Int = 0 , var albumTitle: String , var releaseDate : String ) {
    override fun toString(): String {
        return "$albumTitle"
    }
}