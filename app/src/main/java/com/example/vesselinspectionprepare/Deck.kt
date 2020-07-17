package com.example.vesselinspectionprepare

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable

class Deck() : AppCompatActivity(), Parcelable {

    constructor(parcel: Parcel) : this() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.deck_1)
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Deck> {
        override fun createFromParcel(parcel: Parcel): Deck {
            return Deck(parcel)
        }

        override fun newArray(size: Int): Array<Deck?> {
            return arrayOfNulls(size)
        }
    }
}
