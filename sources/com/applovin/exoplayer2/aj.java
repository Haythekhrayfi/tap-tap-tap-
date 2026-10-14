package com.applovin.exoplayer2;

import android.os.Bundle;
import com.applovin.exoplayer2.common.base.Objects;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes.dex */
public final class aj extends aq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g.a<aj> f4226a = k0.f7556g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f4227c;

    public aj() {
        this.f4227c = -1.0f;
    }

    public aj(float f10) {
        com.applovin.exoplayer2.l.a.a(f10 >= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && f10 <= 100.0f, "percent must be in the range of [0, 100]");
        this.f4227c = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static aj a(Bundle bundle) {
        com.applovin.exoplayer2.l.a.a(bundle.getInt(a(0), -1) == 1);
        float f10 = bundle.getFloat(a(1), -1.0f);
        return f10 == -1.0f ? new aj() : new aj(f10);
    }

    private static String a(int i10) {
        return Integer.toString(i10, 36);
    }

    public boolean equals(Object obj) {
        return (obj instanceof aj) && this.f4227c == ((aj) obj).f4227c;
    }

    public int hashCode() {
        return Objects.hashCode(Float.valueOf(this.f4227c));
    }
}
