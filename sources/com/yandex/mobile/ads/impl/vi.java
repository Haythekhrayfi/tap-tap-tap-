package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final class vi extends og1<TextView, ti> {
    public vi(TextView textView) {
        super(textView);
    }

    public static boolean a(TextView textView, ti tiVar) {
        if (1 == tiVar.b()) {
            return textView.getText().toString().equals(tiVar.a());
        }
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.og1
    public final void a(View view) {
        TextView textView = (TextView) view;
        textView.setText("");
        super.a(textView);
    }

    @Override // com.yandex.mobile.ads.impl.og1
    public final /* bridge */ /* synthetic */ boolean a(View view, ti tiVar) {
        return a((TextView) view, tiVar);
    }

    @Override // com.yandex.mobile.ads.impl.og1
    public final void b(View view, ti tiVar) {
        TextView textView = (TextView) view;
        ti tiVar2 = tiVar;
        if (1 == tiVar2.b()) {
            textView.setText(tiVar2.a());
        }
    }
}
