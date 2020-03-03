package com.goquran.labs.androidquran.dao.bookmark

import com.goquran.labs.androidquran.dao.RecentPage
import com.goquran.labs.androidquran.dao.Tag
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BookmarkData(val tags: List<Tag> = emptyList(),
                        val bookmarks: List<Bookmark> = emptyList(),
                        val recentPages: List<RecentPage> = emptyList())
