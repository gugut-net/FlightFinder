package com.example.flight.model


import com.google.gson.annotations.SerializedName

data class FlightResponseModel(
    @SerializedName("places")
    val places: PlacesModel? = PlacesModel(),
    @SerializedName("status")
    val status: String? = ""
)