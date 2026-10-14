package com.yandex.metrica.impl.ob;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class P3 implements C0<a, a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f14691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<a> f14692b;

    public static final class a implements F0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<String, String> f14693a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final E0 f14694b;

        public a(Map<String, String> map, E0 e10) {
            this.f14693a = map;
            this.f14694b = e10;
        }

        @Override // com.yandex.metrica.impl.ob.F0
        public E0 a() {
            return this.f14694b;
        }

        public final Map<String, String> b() {
            return this.f14693a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return fd.j0.d(this.f14693a, aVar.f14693a) && fd.j0.d(this.f14694b, aVar.f14694b);
        }

        public int hashCode() {
            Map<String, String> map = this.f14693a;
            int iHashCode = (map != null ? map.hashCode() : 0) * 31;
            E0 e10 = this.f14694b;
            return iHashCode + (e10 != null ? e10.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("Candidate(clids=");
            sbA.append(this.f14693a);
            sbA.append(", source=");
            sbA.append(this.f14694b);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public P3(a aVar, List<a> list) {
        this.f14691a = aVar;
        this.f14692b = list;
    }

    @Override // com.yandex.metrica.impl.ob.C0
    public List<a> a() {
        return this.f14692b;
    }

    @Override // com.yandex.metrica.impl.ob.C0
    public a b() {
        return this.f14691a;
    }

    public a c() {
        return this.f14691a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P3)) {
            return false;
        }
        P3 p10 = (P3) obj;
        return fd.j0.d(this.f14691a, p10.f14691a) && fd.j0.d(this.f14692b, p10.f14692b);
    }

    public int hashCode() {
        a aVar = this.f14691a;
        int iHashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        List<a> list = this.f14692b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("ClidsInfo(chosen=");
        sbA.append(this.f14691a);
        sbA.append(", candidates=");
        sbA.append(this.f14692b);
        sbA.append(")");
        return sbA.toString();
    }
}
