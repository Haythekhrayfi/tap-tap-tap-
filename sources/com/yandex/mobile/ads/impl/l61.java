package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final class l61 extends og1<TextView, String> {
    public l61(TextView textView) {
        super(textView);
    }

    @Override // com.yandex.mobile.ads.impl.og1
    public final void a(View view) {
        TextView textView = (TextView) view;
        textView.setText("");
        super.a(textView);
    }

    @Override // com.yandex.mobile.ads.impl.og1
    public final boolean a(View view, String str) {
        return ((TextView) view).getText().toString().equalsIgnoreCase(str);
    }

    @Override // com.yandex.mobile.ads.impl.og1
    public final void b(View view, String str) {
        ((TextView) view).setText(str);
    }
}
