package com.goquran.labs.androidquran.extension

import com.goquran.labs.androidquran.data.SuraAyah

fun SuraAyah.requiresBasmallah(): Boolean {
  return ayah == 1 && sura != 1 && sura != 9
}
