package com.applovin.exoplayer2;

import android.os.Bundle;
import com.applovin.exoplayer2.common.base.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class x extends aq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g.a<x> f8241a = com.applovin.exoplayer2.a.p.D;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f8242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f8243d;

    public x() {
        this.f8242c = false;
        this.f8243d = false;
    }

    public x(boolean z10) {
        this.f8242c = true;
        this.f8243d = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static x a(Bundle bundle) {
        com.applovin.exoplayer2.l.a.a(bundle.getInt(a(0), -1) == 0);
        return bundle.getBoolean(a(1), false) ? new x(bundle.getBoolean(a(2), false)) : new x();
    }

    private static String a(int i10) {
        return Integer.toString(i10, 36);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f8243d == xVar.f8243d && this.f8242c == xVar.f8242c;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.f8242c), Boolean.valueOf(this.f8243d));
    }
}
