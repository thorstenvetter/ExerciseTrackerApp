// Generated by data binding compiler. Do not edit!
package com.example.android.exercisetracker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.example.android.exercisetracker.R;
import com.example.android.exercisetracker.screens.list.ListViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentListBinding extends ViewDataBinding {
  @NonNull
  public final Button clearButton;

  @NonNull
  public final Button exerciseButton;

  @NonNull
  public final RecyclerView recyclerview;

  @Bindable
  protected ListViewModel mListViewModel;

  protected FragmentListBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button clearButton, Button exerciseButton, RecyclerView recyclerview) {
    super(_bindingComponent, _root, _localFieldCount);
    this.clearButton = clearButton;
    this.exerciseButton = exerciseButton;
    this.recyclerview = recyclerview;
  }

  public abstract void setListViewModel(@Nullable ListViewModel listViewModel);

  @Nullable
  public ListViewModel getListViewModel() {
    return mListViewModel;
  }

  @NonNull
  public static FragmentListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_list, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentListBinding>inflateInternal(inflater, R.layout.fragment_list, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_list, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentListBinding>inflateInternal(inflater, R.layout.fragment_list, null, false, component);
  }

  public static FragmentListBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentListBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentListBinding)bind(component, view, R.layout.fragment_list);
  }
}