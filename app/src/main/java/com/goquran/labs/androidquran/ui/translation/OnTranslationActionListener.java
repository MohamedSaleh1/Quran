package com.goquran.labs.androidquran.ui.translation;

import com.goquran.labs.androidquran.common.LocalTranslation;
import com.goquran.labs.androidquran.common.QuranAyahInfo;

public interface OnTranslationActionListener {
  void onTranslationAction(QuranAyahInfo ayah, LocalTranslation[] translations, int actionId);
}
