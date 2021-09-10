package com.example.myapplication

import android.os.Parcel
import android.os.Parcelable

class Combustivel(var precoGas:Double, var precoAlc:Double) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readDouble(),
        parcel.readDouble()
    ) {
    }

    fun calcular():String{
        var result = this.precoAlc/this.precoGas;

        if (result>0.73){
            return "Abasteça com gasolina"
        }else{
            return "Abasteça com alcool!"
        }
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeDouble(precoGas)
        parcel.writeDouble(precoAlc)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Combustivel> {
        override fun createFromParcel(parcel: Parcel): Combustivel {
            return Combustivel(parcel)
        }

        override fun newArray(size: Int): Array<Combustivel?> {
            return arrayOfNulls(size)
        }
    }


}