package com.applovin.exoplayer2;

/* JADX INFO: loaded from: classes.dex */
public final class at {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final at f4294a = new at(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4295b;

    public at(boolean z10) {
        this.f4295b = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && at.class == obj.getClass() && this.f4295b == ((at) obj).f4295b;
    }

    public int hashCode() {
        return !this.f4295b ? 1 : 0;
    }
}
