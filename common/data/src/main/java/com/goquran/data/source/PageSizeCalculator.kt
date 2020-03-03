package com.goquran.data.source

interface PageSizeCalculator {
  fun getWidthParameter(): String
  fun getTabletWidthParameter(): String
  fun setOverrideParameter(parameter: String)
}
