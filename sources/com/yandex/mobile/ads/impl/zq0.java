package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class zq0 implements wf {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zq0 f27397d = new zq0(1.0f, 1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f27398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f27399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f27400c;

    static {
        kq1 kq1Var = kq1.f22497c;
    }

    public zq0(float f10, float f11) {
        pa.a(f10 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        pa.a(f11 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        this.f27398a = f10;
        this.f27399b = f11;
        this.f27400c = Math.round(f10 * 1000.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zq0 a(Bundle bundle) {
        return new zq0(bundle.getFloat(Integer.toString(0, 36), 1.0f), bundle.getFloat(Integer.toString(1, 36), 1.0f));
    }

    public final long a(long j10) {
        return j10 * ((long) this.f27400c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zq0.class != obj.getClass()) {
            return false;
        }
        zq0 zq0Var = (zq0) obj;
        return this.f27398a == zq0Var.f27398a && this.f27399b == zq0Var.f27399b;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f27399b) + ((Float.floatToRawIntBits(this.f27398a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f27398a), Float.valueOf(this.f27399b)};
        int i10 = da1.f19803a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
