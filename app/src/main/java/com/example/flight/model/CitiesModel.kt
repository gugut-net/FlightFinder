package com.example.flight.model


import com.google.gson.annotations.SerializedName

data class CitiesModel(
    @SerializedName("coordinates")
    val coordinates: CoordinatesModel? = CoordinatesModel(),
    @SerializedName("entityId")
    val entityId: String? = "",
    @SerializedName("iata")
    val iata: String? = "",
    @SerializedName("name")
    val name: String? = "",
    @SerializedName("parentId")
    val parentId: String? = "",
    @SerializedName("type")
    val type: String? = ""
)