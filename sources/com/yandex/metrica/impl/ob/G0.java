package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public final class G0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f14023a;

    public G0(long j10) {
        this.f14023a = j10;
    }

    public final long a() {
        return this.f14023a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof G0) && this.f14023a == ((G0) obj).f14023a;
        }
        return true;
    }

    public int hashCode() {
        long j10 = this.f14023a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public String toString() {
        return android.support.v4.media.session.e.a(defpackage.a.a("EasyCollectingConfig(firstLaunchDelaySeconds="), this.f14023a, ")");
    }
}
