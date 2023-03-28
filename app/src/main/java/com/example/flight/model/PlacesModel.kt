package com.example.flight.model


import com.google.gson.annotations.SerializedName

data class PlacesModel(
    @SerializedName("cities")
    val cities: CitiesModel? = CitiesModel()
)