package com.goquran.labs.androidquran.extension

import java.io.Closeable

fun Closeable?.closeQuietly() {
    try {
      this?.close()
    } catch (e: Exception) {
      // no op
    }
}
