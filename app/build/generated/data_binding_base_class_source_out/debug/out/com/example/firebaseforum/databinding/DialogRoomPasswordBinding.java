// Generated by view binder compiler. Do not edit!
package com.example.firebaseforum.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.firebaseforum.R;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogRoomPasswordBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final Button dialogNegativeButton;

  @NonNull
  public final Button dialogPositiveButton;

  @NonNull
  public final TextInputLayout roomPassword;

  private DialogRoomPasswordBinding(@NonNull CardView rootView,
      @NonNull Button dialogNegativeButton, @NonNull Button dialogPositiveButton,
      @NonNull TextInputLayout roomPassword) {
    this.rootView = rootView;
    this.dialogNegativeButton = dialogNegativeButton;
    this.dialogPositiveButton = dialogPositiveButton;
    this.roomPassword = roomPassword;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogRoomPasswordBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogRoomPasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_room_password, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogRoomPasswordBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.dialog_negative_button;
      Button dialogNegativeButton = ViewBindings.findChildViewById(rootView, id);
      if (dialogNegativeButton == null) {
        break missingId;
      }

      id = R.id.dialog_positive_button;
      Button dialogPositiveButton = ViewBindings.findChildViewById(rootView, id);
      if (dialogPositiveButton == null) {
        break missingId;
      }

      id = R.id.room_password;
      TextInputLayout roomPassword = ViewBindings.findChildViewById(rootView, id);
      if (roomPassword == null) {
        break missingId;
      }

      return new DialogRoomPasswordBinding((CardView) rootView, dialogNegativeButton,
          dialogPositiveButton, roomPassword);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}