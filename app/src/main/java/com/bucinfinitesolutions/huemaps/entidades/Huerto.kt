package com.bucinfinitesolutions.huemaps.entidades

data class Huerto(
    //@Json(name = "No")
    val no: String,

//    @Json(name = "NOMBRE DEL PRODUCTOR")
    val nombreDelProductor: String,

//    @Json(name = "NOMBRE DEL HUERTO")
    val nombreDelHuerto: String,

//    @Json(name = "SUPERFICIE")
    val superficie: String,

//    @Json(name = "CARTILLA")
    val cartilla: String,

//    @Json(name = "REG. SADER")
    val regSader: String,

//    @Json(name = "LOCALIDAD")
    val localidad: String,

//    @Json(name = "LATITUD")
    val latitud: String,

//    @Json(name = "LONGITUD")
    val longitud: String,

//    @Json(name = "ASNM")
    val asnm: String,

    val undefined: String
)
