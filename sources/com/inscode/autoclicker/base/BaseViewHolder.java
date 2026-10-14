package com.inscode.autoclicker.base;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class BaseViewHolder extends RecyclerView.c0 {
    private final View view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseViewHolder(View view) {
        super(view);
        j0.i(view, "view");
        this.view = view;
    }

    public final View getView() {
        return this.view;
    }
}
