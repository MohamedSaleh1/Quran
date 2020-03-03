package com.goquran.labs.androidquran.dao.bookmark

import com.goquran.labs.androidquran.dao.Tag
import com.goquran.labs.androidquran.ui.helpers.QuranRow

data class BookmarkResult(val rows: List<QuranRow>, val tagMap: Map<Long, Tag>)
