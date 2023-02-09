// Generated by view binder compiler. Do not edit!
package com.example.practica2.databinding;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.viewbinding.ViewBinding;
import android.viewbinding.ViewBindings;
import android.widget.TextView;
import com.example.practica2.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityHorarioNullBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView horarioNotFoundTV;

  @NonNull
  public final Toolbar toolbarHorario;

  private ActivityHorarioNullBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView horarioNotFoundTV, @NonNull Toolbar toolbarHorario) {
    this.rootView = rootView;
    this.horarioNotFoundTV = horarioNotFoundTV;
    this.toolbarHorario = toolbarHorario;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityHorarioNullBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityHorarioNullBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_horario_null, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityHorarioNullBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.horarioNotFoundTV;
      TextView horarioNotFoundTV = ViewBindings.findChildViewById(rootView, id);
      if (horarioNotFoundTV == null) {
        break missingId;
      }

      id = R.id.toolbarHorario;
      Toolbar toolbarHorario = ViewBindings.findChildViewById(rootView, id);
      if (toolbarHorario == null) {
        break missingId;
      }

      return new ActivityHorarioNullBinding((ConstraintLayout) rootView, horarioNotFoundTV,
          toolbarHorario);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
