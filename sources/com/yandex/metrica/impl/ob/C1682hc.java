package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.hc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1682hc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z9.c f16272b;

    public C1682hc(String str, z9.c cVar) {
        this.f16271a = str;
        this.f16272b = cVar;
    }

    public final String a() {
        return this.f16271a;
    }

    public final z9.c b() {
        return this.f16272b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1682hc)) {
            return false;
        }
        C1682hc c1682hc = (C1682hc) obj;
        return fd.j0.d(this.f16271a, c1682hc.f16271a) && fd.j0.d(this.f16272b, c1682hc.f16272b);
    }

    public int hashCode() {
        String str = this.f16271a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        z9.c cVar = this.f16272b;
        return iHashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("AppSetId(id=");
        sbA.append(this.f16271a);
        sbA.append(", scope=");
        sbA.append(this.f16272b);
        sbA.append(")");
        return sbA.toString();
    }
}
