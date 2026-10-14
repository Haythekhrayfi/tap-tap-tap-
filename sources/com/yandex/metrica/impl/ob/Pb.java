package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public final class Pb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C2011ui f14698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Mb f14699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final E f14700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Nb f14701d;

    public static final class a implements E.b {
        public a() {
        }

        @Override // com.yandex.metrica.impl.ob.E.b
        public final void a(E.a aVar) {
            Pb.this.b();
        }
    }

    public Pb(E e10, Nb nb2) {
        this.f14700c = e10;
        this.f14701d = nb2;
    }

    private final boolean a() {
        boolean zD;
        C2011ui c2011ui = this.f14698a;
        if (c2011ui == null) {
            return false;
        }
        E.a aVarC = this.f14700c.c();
        fd.j0.h(aVarC, "applicationStateProvider.currentState");
        if (!(c2011ui.c().length() > 0)) {
            return false;
        }
        int iOrdinal = aVarC.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            zD = c2011ui.d();
        } else {
            if (iOrdinal != 2) {
                throw new jc.g();
            }
            zD = true;
        }
        return zD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void b() {
        C2011ui c2011ui;
        boolean z10 = this.f14699b != null;
        if (a() == z10) {
            return;
        }
        if (!z10) {
            if (this.f14699b == null && (c2011ui = this.f14698a) != null) {
                this.f14699b = this.f14701d.a(c2011ui);
            }
        } else {
            Mb mb2 = this.f14699b;
            if (mb2 != null) {
                mb2.a();
            }
            this.f14699b = null;
        }
    }

    public final synchronized void a(Qi qi) {
        this.f14698a = qi.n();
        this.f14700c.a(new a());
        b();
    }

    public synchronized void b(Qi qi) {
        C2011ui c2011ui;
        if (!fd.j0.d(qi.n(), this.f14698a)) {
            this.f14698a = qi.n();
            Mb mb2 = this.f14699b;
            if (mb2 != null) {
                mb2.a();
            }
            this.f14699b = null;
            if (a() && this.f14699b == null && (c2011ui = this.f14698a) != null) {
                this.f14699b = this.f14701d.a(c2011ui);
            }
        }
    }
}
