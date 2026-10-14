package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import p0.a;
import q0.c;

/* JADX INFO: loaded from: classes2.dex */
class ClickActionDelegate extends a {
    private final c.a clickAction;

    public ClickActionDelegate(Context context, int i10) {
        this.clickAction = new c.a(16, context.getString(i10));
    }

    @Override // p0.a
    public void onInitializeAccessibilityNodeInfo(View view, c cVar) {
        super.onInitializeAccessibilityNodeInfo(view, cVar);
        cVar.a(this.clickAction);
    }
}
