package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f14110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f14111b;

    public enum a {
        ACTIVE,
        WORKING_SET,
        FREQUENT,
        RARE,
        RESTRICTED
    }

    public H(a aVar, Boolean bool) {
        this.f14110a = aVar;
        this.f14111b = bool;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || H.class != obj.getClass()) {
            return false;
        }
        H h10 = (H) obj;
        if (this.f14110a != h10.f14110a) {
            return false;
        }
        Boolean bool = this.f14111b;
        Boolean bool2 = h10.f14111b;
        if (bool != null) {
            return bool.equals(bool2);
        }
        return bool2 == null;
    }

    public int hashCode() {
        a aVar = this.f14110a;
        int iHashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        Boolean bool = this.f14111b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }
}
