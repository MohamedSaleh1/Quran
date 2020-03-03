package com.goquran.labs.androidquran.dao.audio

import com.goquran.labs.androidquran.data.SuraAyah

data class AudioPlaybackInfo(val currentAyah: SuraAyah,
                             val timesPlayed: Int = 1,
                             val rangePlayedTimes: Int = 1,
                             val shouldPlayBasmallah: Boolean = false)
