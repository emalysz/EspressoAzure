package com.sample.browserstack.samplecalculator.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityMainBinding extends ViewDataBinding {
  @NonNull
  public final RelativeLayout activityMain;

  @NonNull
  public final Button buttonAdd;

  @NonNull
  public final Button buttonClear;

  @NonNull
  public final Button buttonDivide;

  @NonNull
  public final Button buttonDot;

  @NonNull
  public final Button buttonEight;

  @NonNull
  public final Button buttonEqual;

  @NonNull
  public final Button buttonFive;

  @NonNull
  public final Button buttonFour;

  @NonNull
  public final Button buttonMultiply;

  @NonNull
  public final Button buttonNine;

  @NonNull
  public final Button buttonOne;

  @NonNull
  public final Button buttonSeven;

  @NonNull
  public final Button buttonSix;

  @NonNull
  public final Button buttonSubtract;

  @NonNull
  public final Button buttonThree;

  @NonNull
  public final Button buttonTwo;

  @NonNull
  public final Button buttonZero;

  @NonNull
  public final EditText editText;

  @NonNull
  public final TextView infoTextView;

  protected ActivityMainBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RelativeLayout activityMain, Button buttonAdd, Button buttonClear, Button buttonDivide,
      Button buttonDot, Button buttonEight, Button buttonEqual, Button buttonFive,
      Button buttonFour, Button buttonMultiply, Button buttonNine, Button buttonOne,
      Button buttonSeven, Button buttonSix, Button buttonSubtract, Button buttonThree,
      Button buttonTwo, Button buttonZero, EditText editText, TextView infoTextView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.activityMain = activityMain;
    this.buttonAdd = buttonAdd;
    this.buttonClear = buttonClear;
    this.buttonDivide = buttonDivide;
    this.buttonDot = buttonDot;
    this.buttonEight = buttonEight;
    this.buttonEqual = buttonEqual;
    this.buttonFive = buttonFive;
    this.buttonFour = buttonFour;
    this.buttonMultiply = buttonMultiply;
    this.buttonNine = buttonNine;
    this.buttonOne = buttonOne;
    this.buttonSeven = buttonSeven;
    this.buttonSix = buttonSix;
    this.buttonSubtract = buttonSubtract;
    this.buttonThree = buttonThree;
    this.buttonTwo = buttonTwo;
    this.buttonZero = buttonZero;
    this.editText = editText;
    this.infoTextView = infoTextView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_main, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityMainBinding>inflateInternal(inflater, com.sample.browserstack.samplecalculator.R.layout.activity_main, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_main, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityMainBinding>inflateInternal(inflater, com.sample.browserstack.samplecalculator.R.layout.activity_main, null, false, component);
  }

  public static ActivityMainBinding bind(@NonNull View view) {
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
  public static ActivityMainBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityMainBinding)bind(component, view, com.sample.browserstack.samplecalculator.R.layout.activity_main);
  }
}
