package com.goquran.labs.androidquran.common

import com.goquran.labs.androidquran.data.SuraAyah

data class TranslationMetadata(val sura: Int,
                               val ayah: Int,
                               val text: CharSequence,
                               val link: SuraAyah? = null)
