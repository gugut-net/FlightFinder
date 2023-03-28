package com.example.flight.model


import com.google.gson.annotations.SerializedName

data class CoordinatesModel(
    @SerializedName("latitude")
    val latitude: Double? = 0.0,
    @SerializedName("longitude")
    val longitude: Double? = 0.0
)