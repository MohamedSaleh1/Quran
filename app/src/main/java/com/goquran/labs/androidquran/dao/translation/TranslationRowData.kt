package com.goquran.labs.androidquran.dao.translation

interface TranslationRowData {
  fun isSeparator(): Boolean
  fun name(): String
  fun needsUpgrade(): Boolean
}
