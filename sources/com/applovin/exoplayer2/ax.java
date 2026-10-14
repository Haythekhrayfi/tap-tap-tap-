package com.applovin.exoplayer2;

import android.os.Bundle;
import com.applovin.exoplayer2.common.base.Objects;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes.dex */
public final class ax extends aq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g.a<ax> f4359a = k0.f7559j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f4360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f4361d;

    public ax(int i10) {
        com.applovin.exoplayer2.l.a.a(i10 > 0, "maxStars must be a positive integer");
        this.f4360c = i10;
        this.f4361d = -1.0f;
    }

    public ax(int i10, float f10) {
        com.applovin.exoplayer2.l.a.a(i10 > 0, "maxStars must be a positive integer");
        com.applovin.exoplayer2.l.a.a(f10 >= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && f10 <= ((float) i10), "starRating is out of range [0, maxStars]");
        this.f4360c = i10;
        this.f4361d = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ax a(Bundle bundle) {
        com.applovin.exoplayer2.l.a.a(bundle.getInt(a(0), -1) == 2);
        int i10 = bundle.getInt(a(1), 5);
        float f10 = bundle.getFloat(a(2), -1.0f);
        return f10 == -1.0f ? new ax(i10) : new ax(i10, f10);
    }

    private static String a(int i10) {
        return Integer.toString(i10, 36);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ax)) {
            return false;
        }
        ax axVar = (ax) obj;
        return this.f4360c == axVar.f4360c && this.f4361d == axVar.f4361d;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f4360c), Float.valueOf(this.f4361d));
    }
}
