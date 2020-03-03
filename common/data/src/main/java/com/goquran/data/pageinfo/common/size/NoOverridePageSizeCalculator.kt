package com.goquran.data.pageinfo.common.size

import com.goquran.data.source.DisplaySize

class NoOverridePageSizeCalculator(displaySize: DisplaySize) :
    DefaultPageSizeCalculator(displaySize) {

  override fun setOverrideParameter(parameter: String) {
    // override parameter is irrelevant for these pages
  }

  override fun getTabletWidthParameter(): String {
    // use the same size for tablet landscape
    return getWidthParameter()
  }
}
