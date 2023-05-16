package com.example.modulopedidospollossilver

import android.os.Parcel
import android.os.Parcelable

data class Product (
    val name: String,
    val price: String,
    val imageResId: Int
    ):Parcelable{
        constructor(parcel: Parcel?):this(
            parcel?.readString() ?:"",
            parcel?.readString() ?:"",
            parcel!!.readInt()
        )

    override fun writeToParcel(parcel: Parcel, p1: Int) {
        parcel.writeString(name)
        parcel.writeString(price)
        parcel.writeInt(imageResId)
    }

    override fun describeContents(): Int {
        return 0
    }
    companion object CREATOR:Parcelable.Creator<Product>{
        override fun createFromParcel(parcel: Parcel?): Product {
            return Product(parcel)

        }
        override fun newArray(size: Int): Array<Product?> {
            return arrayOfNulls(size)
        }
    }
    }