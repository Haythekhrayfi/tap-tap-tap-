package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ui, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2011ui {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f17546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f17547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f17548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f17549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f17550e;

    public C2011ui(String str, int i10, int i11, boolean z10, boolean z11) {
        this.f17546a = str;
        this.f17547b = i10;
        this.f17548c = i11;
        this.f17549d = z10;
        this.f17550e = z11;
    }

    public final int a() {
        return this.f17548c;
    }

    public final int b() {
        return this.f17547b;
    }

    public final String c() {
        return this.f17546a;
    }

    public final boolean d() {
        return this.f17549d;
    }

    public final boolean e() {
        return this.f17550e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2011ui)) {
            return false;
        }
        C2011ui c2011ui = (C2011ui) obj;
        return fd.j0.d(this.f17546a, c2011ui.f17546a) && this.f17547b == c2011ui.f17547b && this.f17548c == c2011ui.f17548c && this.f17549d == c2011ui.f17549d && this.f17550e == c2011ui.f17550e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        String str = this.f17546a;
        int iHashCode = (((((str != null ? str.hashCode() : 0) * 31) + this.f17547b) * 31) + this.f17548c) * 31;
        boolean z10 = this.f17549d;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = (iHashCode + r10) * 31;
        boolean z11 = this.f17550e;
        return i10 + (z11 ? 1 : z11);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("EgressConfig(url=");
        sbA.append(this.f17546a);
        sbA.append(", repeatedDelay=");
        sbA.append(this.f17547b);
        sbA.append(", randomDelayWindow=");
        sbA.append(this.f17548c);
        sbA.append(", isBackgroundAllowed=");
        sbA.append(this.f17549d);
        sbA.append(", isDiagnosticsEnabled=");
        sbA.append(this.f17550e);
        sbA.append(")");
        return sbA.toString();
    }
}
