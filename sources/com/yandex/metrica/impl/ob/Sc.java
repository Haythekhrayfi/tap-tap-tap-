package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public class Sc extends AbstractC2060wc {

    public class a implements Oc {
        public a() {
        }

        @Override // com.yandex.metrica.impl.ob.Oc
        public long a() {
            return Sc.this.f17772a.e(0L);
        }

        @Override // com.yandex.metrica.impl.ob.Oc
        public void a(long j10) {
            Sc.this.f17772a.j(j10);
        }
    }

    public Sc(C1757kd c1757kd, I9 i10) {
        this(c1757kd, i10, new C1497a2());
    }

    public Sc(C1757kd c1757kd, I9 i10, C1497a2 c1497a2) {
        super(c1757kd, i10, c1497a2);
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2060wc
    public Oc a() {
        return new a();
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2060wc
    public InterfaceC1659ge a(C1634fe c1634fe) {
        return this.f17774c.a(c1634fe);
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2060wc
    public String b() {
        return "network";
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2060wc
    public String c() {
        return "lbs";
    }
}
