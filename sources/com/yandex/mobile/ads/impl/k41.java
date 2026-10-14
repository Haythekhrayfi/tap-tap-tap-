package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class k41 extends hu0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final wf.a<k41> f22251d = dp1.f19958q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f22252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f22253c;

    public k41(int i10) {
        pa.a("maxStars must be a positive integer", i10 > 0);
        this.f22252b = i10;
        this.f22253c = -1.0f;
    }

    public k41(int i10, float f10) {
        pa.a("maxStars must be a positive integer", i10 > 0);
        pa.a("starRating is out of range [0, maxStars]", f10 >= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && f10 <= ((float) i10));
        this.f22252b = i10;
        this.f22253c = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static k41 b(Bundle bundle) {
        pa.a(bundle.getInt(Integer.toString(0, 36), -1) == 2);
        int i10 = bundle.getInt(Integer.toString(1, 36), 5);
        float f10 = bundle.getFloat(Integer.toString(2, 36), -1.0f);
        return f10 == -1.0f ? new k41(i10) : new k41(i10, f10);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k41)) {
            return false;
        }
        k41 k41Var = (k41) obj;
        return this.f22252b == k41Var.f22252b && this.f22253c == k41Var.f22253c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f22252b), Float.valueOf(this.f22253c)});
    }
}
