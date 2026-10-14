package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public class Lc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final I9 f14390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1757kd f14391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Oc f14392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Ic f14393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Gc f14394e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Kc f14395f;

    public class a implements Oc {
        public a() {
        }

        @Override // com.yandex.metrica.impl.ob.Oc
        public long a() {
            return Lc.this.f14390a.b(0L);
        }

        @Override // com.yandex.metrica.impl.ob.Oc
        public void a(long j10) {
            Lc.this.f14390a.g(j10);
        }
    }

    public Lc(C1757kd c1757kd, I9 i10, C2086xd c2086xd) {
        this.f14391b = c1757kd;
        this.f14390a = i10;
        Oc ocB = b();
        this.f14392c = ocB;
        this.f14394e = a(ocB);
        this.f14393d = a();
        this.f14395f = a(c2086xd);
    }

    private Gc a(Oc oc2) {
        return new Gc(oc2, new R2());
    }

    private Ic a() {
        return new Ic(this.f14391b.f16576a.f18016b);
    }

    private Kc a(C2086xd c2086xd) {
        C2135zc c2135zc = this.f14391b.f16576a;
        return new Kc(c2135zc.f18015a, c2086xd, c2135zc.f18016b, c2135zc.f18017c);
    }

    private Oc b() {
        return new a();
    }

    public C1807md<Jc> a(Jc jc2) {
        return new C1807md<>(this.f14395f, this.f14394e, new C2030vc(this.f14392c, new Nm()), this.f14393d, jc2);
    }
}
