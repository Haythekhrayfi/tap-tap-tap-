package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public class Jc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2111yd f14316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Hc f14317b;

    public Jc(C2111yd c2111yd, Hc hc2) {
        this.f14316a = c2111yd;
        this.f14317b = hc2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Jc.class != obj.getClass()) {
            return false;
        }
        Jc jc2 = (Jc) obj;
        if (!this.f14316a.equals(jc2.f14316a)) {
            return false;
        }
        Hc hc2 = this.f14317b;
        Hc hc3 = jc2.f14317b;
        if (hc2 != null) {
            return hc2.equals(hc3);
        }
        return hc3 == null;
    }

    public int hashCode() {
        int iHashCode = this.f14316a.hashCode() * 31;
        Hc hc2 = this.f14317b;
        return iHashCode + (hc2 != null ? hc2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("GplCollectingConfig{providerAccessFlags=");
        sbA.append(this.f14316a);
        sbA.append(", arguments=");
        sbA.append(this.f14317b);
        sbA.append('}');
        return sbA.toString();
    }
}
