package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public final class K7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O7 f14341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f14342b;

    /* JADX WARN: Multi-variable type inference failed */
    public K7() {
        this(null, 0 == true ? 1 : 0, 3);
    }

    public K7(O7 o10, String str) {
        this.f14341a = o10;
        this.f14342b = str;
    }

    public /* synthetic */ K7(O7 o10, String str, int i10) {
        this((i10 & 1) != 0 ? O7.UNKNOWN : null, null);
    }

    public final String a() {
        return this.f14342b;
    }

    public final O7 b() {
        return this.f14341a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K7)) {
            return false;
        }
        K7 k10 = (K7) obj;
        return fd.j0.d(this.f14341a, k10.f14341a) && fd.j0.d(this.f14342b, k10.f14342b);
    }

    public int hashCode() {
        O7 o10 = this.f14341a;
        int iHashCode = (o10 != null ? o10.hashCode() : 0) * 31;
        String str = this.f14342b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("NativeCrashHandlerDescription(source=");
        sbA.append(this.f14341a);
        sbA.append(", handlerVersion=");
        return androidx.activity.k.a(sbA, this.f14342b, ")");
    }
}
