// Generated by view binder compiler. Do not edit!
package com.example.practica2.databinding;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.viewbinding.ViewBinding;
import android.viewbinding.ViewBindings;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.example.practica2.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDiaBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final FloatingActionButton floatingActionButtonDia;

  @NonNull
  public final ScrollView scrollView;

  @NonNull
  public final LinearLayout scrollViewLinearLayout;

  @NonNull
  public final Toolbar toolbarDia;

  private ActivityDiaBinding(@NonNull ConstraintLayout rootView,
      @NonNull FloatingActionButton floatingActionButtonDia, @NonNull ScrollView scrollView,
      @NonNull LinearLayout scrollViewLinearLayout, @NonNull Toolbar toolbarDia) {
    this.rootView = rootView;
    this.floatingActionButtonDia = floatingActionButtonDia;
    this.scrollView = scrollView;
    this.scrollViewLinearLayout = scrollViewLinearLayout;
    this.toolbarDia = toolbarDia;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDiaBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDiaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_dia, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDiaBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.floatingActionButtonDia;
      FloatingActionButton floatingActionButtonDia = ViewBindings.findChildViewById(rootView, id);
      if (floatingActionButtonDia == null) {
        break missingId;
      }

      id = R.id.scroll_view;
      ScrollView scrollView = ViewBindings.findChildViewById(rootView, id);
      if (scrollView == null) {
        break missingId;
      }

      id = R.id.scroll_view_linear_layout;
      LinearLayout scrollViewLinearLayout = ViewBindings.findChildViewById(rootView, id);
      if (scrollViewLinearLayout == null) {
        break missingId;
      }

      id = R.id.toolbarDia;
      Toolbar toolbarDia = ViewBindings.findChildViewById(rootView, id);
      if (toolbarDia == null) {
        break missingId;
      }

      return new ActivityDiaBinding((ConstraintLayout) rootView, floatingActionButtonDia,
          scrollView, scrollViewLinearLayout, toolbarDia);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
