package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public class Ci {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13776b;

    public Ci(int i10, int i11) {
        this.f13775a = i10;
        this.f13776b = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Ci.class != obj.getClass()) {
            return false;
        }
        Ci ci = (Ci) obj;
        return this.f13775a == ci.f13775a && this.f13776b == ci.f13776b;
    }

    public int hashCode() {
        return (this.f13775a * 31) + this.f13776b;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("RetryPolicyConfig{maxIntervalSeconds=");
        sbA.append(this.f13775a);
        sbA.append(", exponentialMultiplier=");
        return h0.f.a(sbA, this.f13776b, '}');
    }
}
