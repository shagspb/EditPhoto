package com.hoanganhtuan95ptit.editphoto.ui.activity;

public interface OnPermissionFeedbackListener {

  void accept(int requestCode);

  void reject(int requestCode);
}
