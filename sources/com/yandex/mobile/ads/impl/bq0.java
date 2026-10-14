package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class bq0 extends hu0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final wf.a<bq0> f19309c = dp1.f19949h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f19310b;

    public bq0() {
        this.f19310b = -1.0f;
    }

    public bq0(float f10) {
        pa.a("percent must be in the range of [0, 100]", f10 >= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && f10 <= 100.0f);
        this.f19310b = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static bq0 b(Bundle bundle) {
        pa.a(bundle.getInt(Integer.toString(0, 36), -1) == 1);
        float f10 = bundle.getFloat(Integer.toString(1, 36), -1.0f);
        return f10 == -1.0f ? new bq0() : new bq0(f10);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bq0) && this.f19310b == ((bq0) obj).f19310b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f19310b)});
    }
}
