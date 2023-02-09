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
import android.widget.Button;
import android.widget.ImageView;
import com.example.practica2.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnMusica;

  @NonNull
  public final Button button;

  @NonNull
  public final Button button3;

  @NonNull
  public final Button button4;

  @NonNull
  public final Button button5;

  @NonNull
  public final FloatingActionButton floatingActionButtonMain;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final Button profesores;

  @NonNull
  public final Toolbar toolbarAgenda;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnMusica,
      @NonNull Button button, @NonNull Button button3, @NonNull Button button4,
      @NonNull Button button5, @NonNull FloatingActionButton floatingActionButtonMain,
      @NonNull ImageView imageView2, @NonNull Button profesores, @NonNull Toolbar toolbarAgenda) {
    this.rootView = rootView;
    this.btnMusica = btnMusica;
    this.button = button;
    this.button3 = button3;
    this.button4 = button4;
    this.button5 = button5;
    this.floatingActionButtonMain = floatingActionButtonMain;
    this.imageView2 = imageView2;
    this.profesores = profesores;
    this.toolbarAgenda = toolbarAgenda;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_musica;
      Button btnMusica = ViewBindings.findChildViewById(rootView, id);
      if (btnMusica == null) {
        break missingId;
      }

      id = R.id.button;
      Button button = ViewBindings.findChildViewById(rootView, id);
      if (button == null) {
        break missingId;
      }

      id = R.id.button3;
      Button button3 = ViewBindings.findChildViewById(rootView, id);
      if (button3 == null) {
        break missingId;
      }

      id = R.id.button4;
      Button button4 = ViewBindings.findChildViewById(rootView, id);
      if (button4 == null) {
        break missingId;
      }

      id = R.id.button5;
      Button button5 = ViewBindings.findChildViewById(rootView, id);
      if (button5 == null) {
        break missingId;
      }

      id = R.id.floatingActionButtonMain;
      FloatingActionButton floatingActionButtonMain = ViewBindings.findChildViewById(rootView, id);
      if (floatingActionButtonMain == null) {
        break missingId;
      }

      id = R.id.imageView2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.profesores;
      Button profesores = ViewBindings.findChildViewById(rootView, id);
      if (profesores == null) {
        break missingId;
      }

      id = R.id.toolbarAgenda;
      Toolbar toolbarAgenda = ViewBindings.findChildViewById(rootView, id);
      if (toolbarAgenda == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, btnMusica, button, button3,
          button4, button5, floatingActionButtonMain, imageView2, profesores, toolbarAgenda);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
