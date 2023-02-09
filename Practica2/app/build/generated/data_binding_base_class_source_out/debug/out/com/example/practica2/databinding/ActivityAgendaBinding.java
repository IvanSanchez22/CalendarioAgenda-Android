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
import android.widget.Button;
import android.widget.EditText;
import com.example.practica2.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAgendaBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText TxtCorreo;

  @NonNull
  public final EditText TxtNombre;

  @NonNull
  public final EditText TxtPhone;

  @NonNull
  public final Button botonListado;

  @NonNull
  public final Button btnGuardar;

  @NonNull
  public final Toolbar toolbarAgenda;

  private ActivityAgendaBinding(@NonNull ConstraintLayout rootView, @NonNull EditText TxtCorreo,
      @NonNull EditText TxtNombre, @NonNull EditText TxtPhone, @NonNull Button botonListado,
      @NonNull Button btnGuardar, @NonNull Toolbar toolbarAgenda) {
    this.rootView = rootView;
    this.TxtCorreo = TxtCorreo;
    this.TxtNombre = TxtNombre;
    this.TxtPhone = TxtPhone;
    this.botonListado = botonListado;
    this.btnGuardar = btnGuardar;
    this.toolbarAgenda = toolbarAgenda;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAgendaBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAgendaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_agenda, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAgendaBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.TxtCorreo;
      EditText TxtCorreo = ViewBindings.findChildViewById(rootView, id);
      if (TxtCorreo == null) {
        break missingId;
      }

      id = R.id.TxtNombre;
      EditText TxtNombre = ViewBindings.findChildViewById(rootView, id);
      if (TxtNombre == null) {
        break missingId;
      }

      id = R.id.TxtPhone;
      EditText TxtPhone = ViewBindings.findChildViewById(rootView, id);
      if (TxtPhone == null) {
        break missingId;
      }

      id = R.id.botonListado;
      Button botonListado = ViewBindings.findChildViewById(rootView, id);
      if (botonListado == null) {
        break missingId;
      }

      id = R.id.btnGuardar;
      Button btnGuardar = ViewBindings.findChildViewById(rootView, id);
      if (btnGuardar == null) {
        break missingId;
      }

      id = R.id.toolbarAgenda;
      Toolbar toolbarAgenda = ViewBindings.findChildViewById(rootView, id);
      if (toolbarAgenda == null) {
        break missingId;
      }

      return new ActivityAgendaBinding((ConstraintLayout) rootView, TxtCorreo, TxtNombre, TxtPhone,
          botonListado, btnGuardar, toolbarAgenda);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}