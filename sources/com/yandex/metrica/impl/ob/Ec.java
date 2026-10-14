package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public class Ec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2111yd f13902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Dc f13903b;

    public Ec(C2111yd c2111yd, Dc dc2) {
        this.f13902a = c2111yd;
        this.f13903b = dc2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Ec.class != obj.getClass()) {
            return false;
        }
        Ec ec2 = (Ec) obj;
        if (!this.f13902a.equals(ec2.f13902a)) {
            return false;
        }
        Dc dc2 = this.f13903b;
        Dc dc3 = ec2.f13903b;
        if (dc2 != null) {
            return dc2.equals(dc3);
        }
        return dc3 == null;
    }

    public int hashCode() {
        int iHashCode = this.f13902a.hashCode() * 31;
        Dc dc2 = this.f13903b;
        return iHashCode + (dc2 != null ? dc2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("ForcedCollectingConfig{providerAccessFlags=");
        sbA.append(this.f13902a);
        sbA.append(", arguments=");
        sbA.append(this.f13903b);
        sbA.append('}');
        return sbA.toString();
    }
}
