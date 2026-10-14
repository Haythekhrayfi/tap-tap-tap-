package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.H3;

/* JADX INFO: loaded from: classes.dex */
public class J3<T extends H3> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final I3<T> f14271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final G3<T> f14272b;

    public static final class b<T extends H3> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final I3<T> f14273a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public G3<T> f14274b;

        public b(I3<T> i10) {
            this.f14273a = i10;
        }

        public b<T> a(G3<T> g10) {
            this.f14274b = g10;
            return this;
        }

        public J3<T> a() {
            return new J3<>(this);
        }
    }

    private J3(b bVar) {
        this.f14271a = bVar.f14273a;
        this.f14272b = bVar.f14274b;
    }

    public static <T extends H3> b<T> a(I3<T> i10) {
        return new b<>(i10);
    }

    public final boolean a(H3 h10) {
        G3<T> g10 = this.f14272b;
        if (g10 == null) {
            return false;
        }
        return g10.a(h10);
    }

    public void b(H3 h10) {
        this.f14271a.a(h10);
    }
}
