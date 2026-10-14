package com.applovin.exoplayer2;

import android.os.Bundle;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes.dex */
public final class am implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final am f4251a = new am(1.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g.a<am> f4252d = k0.f7557h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f4253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f4254c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f4255e;

    public am(float f10) {
        this(f10, 1.0f);
    }

    public am(float f10, float f11) {
        com.applovin.exoplayer2.l.a.a(f10 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        com.applovin.exoplayer2.l.a.a(f11 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        this.f4253b = f10;
        this.f4254c = f11;
        this.f4255e = Math.round(f10 * 1000.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ am a(Bundle bundle) {
        return new am(bundle.getFloat(a(0), 1.0f), bundle.getFloat(a(1), 1.0f));
    }

    private static String a(int i10) {
        return Integer.toString(i10, 36);
    }

    public long a(long j10) {
        return j10 * ((long) this.f4255e);
    }

    public am a(float f10) {
        return new am(f10, this.f4254c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || am.class != obj.getClass()) {
            return false;
        }
        am amVar = (am) obj;
        return this.f4253b == amVar.f4253b && this.f4254c == amVar.f4254c;
    }

    public int hashCode() {
        return Float.floatToRawIntBits(this.f4254c) + ((Float.floatToRawIntBits(this.f4253b) + 527) * 31);
    }

    public String toString() {
        return com.applovin.exoplayer2.l.ai.a("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f4253b), Float.valueOf(this.f4254c));
    }
}
