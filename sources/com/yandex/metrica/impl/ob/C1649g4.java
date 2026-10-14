package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.List;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.g4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1649g4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f16165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f16166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f16167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1549c4 f16168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final X3.a f16169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Wi f16170f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Qi f16171g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C1736jh.e f16172h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C1792ln f16173i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final InterfaceExecutorC1966sn f16174j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C1845o1 f16175k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f16176l;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.g4$a */
    public class a implements C1997u4.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C1796m2 f16177a;

        public a(C1649g4 c1649g4, C1796m2 c1796m2) {
            this.f16177a = c1796m2;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.g4$b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f16178a;

        public b(String str) {
            this.f16178a = str;
        }

        public C2095xm a() {
            return AbstractC2145zm.a(this.f16178a);
        }

        public Im b() {
            return AbstractC2145zm.b(this.f16178a);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.g4$c */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C1549c4 f16179a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Qa f16180b;

        public c(Context context, C1549c4 c1549c4) {
            this(c1549c4, Qa.a(context));
        }

        public c(C1549c4 c1549c4, Qa qa2) {
            this.f16179a = c1549c4;
            this.f16180b = qa2;
        }

        public G9 a() {
            return new G9(this.f16180b.b(this.f16179a));
        }

        public E9 b() {
            return new E9(this.f16180b.b(this.f16179a));
        }
    }

    public C1649g4(Context context, C1549c4 c1549c4, X3.a aVar, Wi wi, Qi qi, C1736jh.e eVar, InterfaceExecutorC1966sn interfaceExecutorC1966sn, int i10, C1845o1 c1845o1) {
        this(context, c1549c4, aVar, wi, qi, eVar, interfaceExecutorC1966sn, new C1792ln(), i10, new b(aVar.f15452d), new c(context, c1549c4), c1845o1);
    }

    public C1649g4(Context context, C1549c4 c1549c4, X3.a aVar, Wi wi, Qi qi, C1736jh.e eVar, InterfaceExecutorC1966sn interfaceExecutorC1966sn, C1792ln c1792ln, int i10, b bVar, c cVar, C1845o1 c1845o1) {
        this.f16167c = context;
        this.f16168d = c1549c4;
        this.f16169e = aVar;
        this.f16170f = wi;
        this.f16171g = qi;
        this.f16172h = eVar;
        this.f16174j = interfaceExecutorC1966sn;
        this.f16173i = c1792ln;
        this.f16176l = i10;
        this.f16165a = bVar;
        this.f16166b = cVar;
        this.f16175k = c1845o1;
    }

    public P a(G9 g10) {
        return new P(this.f16167c, g10);
    }

    public Sb a(C1976t8 c1976t8) {
        return new Sb(c1976t8);
    }

    public Vb a(List<Tb> list, Wb wb2) {
        return new Vb(list, wb2);
    }

    public Xb a(C1976t8 c1976t8, C1972t4 c1972t4) {
        return new Xb(c1976t8, c1972t4);
    }

    public C1650g5<AbstractC1948s5, C1624f4> a(C1624f4 c1624f4, C1575d5 c1575d5) {
        return new C1650g5<>(c1575d5, c1624f4);
    }

    public C1651g6 a() {
        return new C1651g6(this.f16167c, this.f16168d, this.f16176l);
    }

    public C1972t4 a(C1624f4 c1624f4) {
        return new C1972t4(new C1736jh.c(c1624f4, this.f16172h), this.f16171g, new C1736jh.a(this.f16169e));
    }

    public C1997u4 a(G9 g10, I8 i10, C2024v6 c2024v6, C1976t8 c1976t8, A a10, C1796m2 c1796m2) {
        return new C1997u4(g10, i10, c2024v6, c1976t8, a10, this.f16173i, this.f16176l, new a(this, c1796m2), new C1699i4(i10, new C9(i10)), new Nm());
    }

    public C2024v6 a(C1624f4 c1624f4, I8 i10, C2024v6.a aVar) {
        return new C2024v6(c1624f4, new C1999u6(i10), aVar);
    }

    public b b() {
        return this.f16165a;
    }

    public C1976t8 b(C1624f4 c1624f4) {
        return new C1976t8(c1624f4, Qa.a(this.f16167c).c(this.f16168d), new C1951s8(c1624f4.s()));
    }

    public C1575d5 c(C1624f4 c1624f4) {
        return new C1575d5(c1624f4);
    }

    public c c() {
        return this.f16166b;
    }

    public I8 d() {
        return P0.i().y().a(this.f16168d.a());
    }

    public C1599e4.b d(C1624f4 c1624f4) {
        return new C1599e4.b(c1624f4);
    }

    public C1796m2<C1624f4> e(C1624f4 c1624f4) {
        C1796m2<C1624f4> c1796m2 = new C1796m2<>(c1624f4, this.f16170f.a(), this.f16174j);
        this.f16175k.a(c1796m2);
        return c1796m2;
    }
}
