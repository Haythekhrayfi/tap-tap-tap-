package com.yandex.mobile.ads.impl;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class qr implements oi {
    @Override // com.yandex.mobile.ads.impl.oi
    public final void a(View view) {
        view.setAlpha(0.4f);
        view.setEnabled(false);
    }

    @Override // com.yandex.mobile.ads.impl.oi
    public final void b(View view) {
        view.animate().alpha(1.0f).setDuration(200L);
        view.setEnabled(true);
    }
}
