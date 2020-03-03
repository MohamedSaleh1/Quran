package com.goquran.labs.androidquran.dao.translation

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Translation(val id: Int,
                       val minimumVersion: Int,
                       val currentVersion: Int,
                       val displayName: String,
                       val downloadType: String,
                       val fileName: String,
                       val fileUrl: String,
                       val saveTo: String,
                       val languageCode: String,
                       val translator: String? = "",
                       val translatorNameLocalized: String? = "") {

  fun withSchema(schema: Int) = copy(minimumVersion = schema)
}