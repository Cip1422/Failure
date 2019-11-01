package com.example.persistancesapp

import android.os.Parcel
import android.os.Parcelable

class User (val name :String, val phone :String): Parcelable {
    constructor(parcel: Parcel) : this(
    parcel.readString().toString(),
    parcel.readString().toString()

    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(phone)

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<User> {
        override fun createFromParcel(parcel: Parcel): User {
            return User(parcel)
        }

        override fun newArray(size: Int): Array<User?> {
            return arrayOfNulls(size)
        }
    }
}