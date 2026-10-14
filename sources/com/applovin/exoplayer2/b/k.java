package com.applovin.exoplayer2.b;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f4497b;

    public k(int i10, float f10) {
        this.f4496a = i10;
        this.f4497b = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return this.f4496a == kVar.f4496a && Float.compare(kVar.f4497b, this.f4497b) == 0;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f4497b) + ((527 + this.f4496a) * 31);
    }
}
