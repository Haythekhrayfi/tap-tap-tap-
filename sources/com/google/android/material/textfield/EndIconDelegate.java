package com.google.android.material.textfield;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: loaded from: classes2.dex */
abstract class EndIconDelegate {
    public Context context;
    public final int customEndIcon;
    public CheckableImageButton endIconView;
    public TextInputLayout textInputLayout;

    public EndIconDelegate(TextInputLayout textInputLayout, int i10) {
        this.textInputLayout = textInputLayout;
        this.context = textInputLayout.getContext();
        this.endIconView = textInputLayout.getEndIconView();
        this.customEndIcon = i10;
    }

    public abstract void initialize();

    public boolean isBoxBackgroundModeSupported(int i10) {
        return true;
    }

    public void onSuffixVisibilityChanged(boolean z10) {
    }

    public boolean shouldTintIconOnError() {
        return false;
    }
}
