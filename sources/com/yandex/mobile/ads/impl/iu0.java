package com.yandex.mobile.ads.impl;

import android.view.View;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.yandex.mobile.ads.nativeads.Rating;

/* JADX INFO: loaded from: classes3.dex */
public final class iu0<V extends View & Rating> extends og1<V, String> {
    public iu0(V v10) {
        super(v10);
    }

    @Override // com.yandex.mobile.ads.impl.og1
    public final void a(V v10) {
        v10.setRating(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        super.a(v10);
    }

    @Override // com.yandex.mobile.ads.impl.og1
    public final /* bridge */ /* synthetic */ boolean a(View view, String str) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.mobile.ads.impl.og1
    public final void b(View view, String str) {
        String str2 = str;
        try {
            ((Rating) view).setRating(Math.max(Float.parseFloat(str2), StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD));
        } catch (NumberFormatException e10) {
            x60.a(e10, String.format("Could not parse rating value. Rating value is %s", str2), new Object[0]);
        }
    }
}
