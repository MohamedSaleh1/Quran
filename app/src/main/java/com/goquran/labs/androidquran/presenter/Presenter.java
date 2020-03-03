package com.goquran.labs.androidquran.presenter;

public interface Presenter<T> {
  void bind(T what);
  void unbind(T what);
}
