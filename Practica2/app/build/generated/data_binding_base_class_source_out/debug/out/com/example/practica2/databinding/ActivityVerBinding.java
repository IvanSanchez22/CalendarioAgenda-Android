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
import android.widget.EditText;
import android.widget.TextView;
import com.example.practica2.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityVerBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnGuardar;

  @NonNull
  public final FloatingActionButton fabEditar;

  @NonNull
  public final FloatingActionButton fabEliminar;

  @NonNull
  public final Toolbar toolbarTarea;

  @NonNull
  public final EditText txtCorreoElectronico;

  @NonNull
  public final EditText txtNombre;

  @NonNull
  public final EditText txtTelefono;

  @NonNull
  public final TextView viewCorreo;

  @NonNull
  public final TextView viewNombre;

  @NonNull
  public final TextView viewTelefono;

  private ActivityVerBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnGuardar,
      @NonNull FloatingActionButton fabEditar, @NonNull FloatingActionButton fabEliminar,
      @NonNull Toolbar toolbarTarea, @NonNull EditText txtCorreoElectronico,
      @NonNull EditText txtNombre, @NonNull EditText txtTelefono, @NonNull TextView viewCorreo,
      @NonNull TextView viewNombre, @NonNull TextView viewTelefono) {
    this.rootView = rootView;
    this.btnGuardar = btnGuardar;
    this.fabEditar = fabEditar;
    this.fabEliminar = fabEliminar;
    this.toolbarTarea = toolbarTarea;
    this.txtCorreoElectronico = txtCorreoElectronico;
    this.txtNombre = txtNombre;
    this.txtTelefono = txtTelefono;
    this.viewCorreo = viewCorreo;
    this.viewNombre = viewNombre;
    this.viewTelefono = viewTelefono;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityVerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityVerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_ver, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityVerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnGuardar;
      Button btnGuardar = ViewBindings.findChildViewById(rootView, id);
      if (btnGuardar == null) {
        break missingId;
      }

      id = R.id.fab_editar;
      FloatingActionButton fabEditar = ViewBindings.findChildViewById(rootView, id);
      if (fabEditar == null) {
        break missingId;
      }

      id = R.id.fabEliminar;
      FloatingActionButton fabEliminar = ViewBindings.findChildViewById(rootView, id);
      if (fabEliminar == null) {
        break missingId;
      }

      id = R.id.toolbarTarea;
      Toolbar toolbarTarea = ViewBindings.findChildViewById(rootView, id);
      if (toolbarTarea == null) {
        break missingId;
      }

      id = R.id.txtCorreoElectronico;
      EditText txtCorreoElectronico = ViewBindings.findChildViewById(rootView, id);
      if (txtCorreoElectronico == null) {
        break missingId;
      }

      id = R.id.txtNombre;
      EditText txtNombre = ViewBindings.findChildViewById(rootView, id);
      if (txtNombre == null) {
        break missingId;
      }

      id = R.id.txtTelefono;
      EditText txtTelefono = ViewBindings.findChildViewById(rootView, id);
      if (txtTelefono == null) {
        break missingId;
      }

      id = R.id.viewCorreo;
      TextView viewCorreo = ViewBindings.findChildViewById(rootView, id);
      if (viewCorreo == null) {
        break missingId;
      }

      id = R.id.viewNombre;
      TextView viewNombre = ViewBindings.findChildViewById(rootView, id);
      if (viewNombre == null) {
        break missingId;
      }

      id = R.id.viewTelefono;
      TextView viewTelefono = ViewBindings.findChildViewById(rootView, id);
      if (viewTelefono == null) {
        break missingId;
      }

      return new ActivityVerBinding((ConstraintLayout) rootView, btnGuardar, fabEditar, fabEliminar,
          toolbarTarea, txtCorreoElectronico, txtNombre, txtTelefono, viewCorreo, viewNombre,
          viewTelefono);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}