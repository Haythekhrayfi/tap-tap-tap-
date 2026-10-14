package com.yandex.metrica.impl.ob;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
class Ad implements InterfaceC1832nd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f13637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Qi f13638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Uc f13639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final B8 f13640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final A8 f13641e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Om f13642f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Od f13643g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C2047w f13644h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C2047w.c f13645i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final InterfaceExecutorC1966sn f13646j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f13647k;

    public class a implements C2047w.c {
        public a() {
        }

        @Override // com.yandex.metrica.impl.ob.C2047w.c
        public void a() {
            Ad.this.f13647k = true;
            Ad.this.b();
        }
    }

    public Ad(Context context, Qi qi, Uc uc2, B8 b10, A8 a10, InterfaceExecutorC1966sn interfaceExecutorC1966sn) {
        this(context, qi, uc2, b10, a10, interfaceExecutorC1966sn, new Nm(), new Od(), P0.i().a());
    }

    public Ad(Context context, Qi qi, Uc uc2, B8 b10, A8 a10, InterfaceExecutorC1966sn interfaceExecutorC1966sn, Om om, Od od2, C2047w c2047w) {
        this.f13647k = false;
        this.f13637a = context;
        this.f13639c = uc2;
        this.f13638b = qi;
        this.f13640d = b10;
        this.f13641e = a10;
        this.f13646j = interfaceExecutorC1966sn;
        this.f13642f = om;
        this.f13643g = od2;
        this.f13644h = c2047w;
        this.f13645i = new a();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    /* JADX WARN: Code duplicated, block: B:22:0x003b  */
    private boolean a(AbstractC1926r8 abstractC1926r8) {
        boolean z10;
        boolean z11;
        if (this.f13639c != null) {
            Uc uc2 = this.f13639c;
            if (uc2 != null) {
                if (abstractC1926r8.c() >= ((long) uc2.f15139c)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            if (z10) {
                return true;
            }
            Uc uc3 = this.f13639c;
            if (uc3 != null) {
                if (this.f13642f.a() - abstractC1926r8.b() > uc3.f15141e) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
            if (z11) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        R1 r1L = P0.i().l();
        Uc uc2 = this.f13639c;
        if (uc2 == null || r1L == null) {
            return;
        }
        r1L.b(this.f13643g.a(this.f13637a, this.f13638b, uc2, this));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1832nd
    public void a() {
        if (a(this.f13640d) || a(this.f13641e)) {
            if (this.f13647k) {
                b();
            } else {
                this.f13644h.a(C2047w.f17740c, this.f13646j, this.f13645i);
            }
        }
    }

    public void a(Qi qi) {
        this.f13638b = qi;
    }

    public void a(Uc uc2) {
        this.f13639c = uc2;
    }
}
