package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.model.BiddingSettings;

/* JADX INFO: loaded from: classes3.dex */
final class ik implements hk {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f21735c = new a(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    private static final Object f21736d = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b90 f21737b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(int i10) {
            this();
        }

        public static final Boolean a(a aVar, b90 b90Var, String str) {
            if (!b90Var.contains(str)) {
                b90Var = null;
            }
            if (b90Var != null) {
                return Boolean.valueOf(b90Var.getBoolean(str, false));
            }
            return null;
        }

        public static final void a(a aVar, b90 b90Var, String str, Boolean bool) {
            if (bool != null) {
                b90Var.putBoolean(str, bool.booleanValue());
            } else {
                b90Var.remove(str);
            }
        }

        public static final void a(a aVar, b90 b90Var, String str, Integer num) {
            if (num != null) {
                b90Var.a(num.intValue(), str);
            } else {
                b90Var.remove(str);
            }
        }

        public static final void a(a aVar, b90 b90Var, String str, Long l10) {
            if (l10 != null) {
                b90Var.putLong(str, l10.longValue());
            } else {
                b90Var.remove(str);
            }
        }

        public static final Integer b(a aVar, b90 b90Var, String str) {
            if (!b90Var.contains(str)) {
                b90Var = null;
            }
            if (b90Var != null) {
                return Integer.valueOf(b90Var.b(0, str));
            }
            return null;
        }

        public static final Long c(a aVar, b90 b90Var, String str) {
            if (!b90Var.contains(str)) {
                b90Var = null;
            }
            if (b90Var != null) {
                return Long.valueOf(b90Var.a(str));
            }
            return null;
        }
    }

    public ik(b90 b90Var) {
        fd.j0.i(b90Var, "localStorage");
        this.f21737b = b90Var;
    }

    @Override // com.yandex.mobile.ads.impl.hk
    public final nz0 a() {
        nz0 nz0VarA;
        synchronized (f21736d) {
            long jA = this.f21737b.a(jk.a(1));
            a aVar = f21735c;
            Boolean boolA = a.a(aVar, this.f21737b, jk.a(8));
            if (jA != 0) {
                Integer numB = a.b(aVar, this.f21737b, jk.a(21));
                Integer numB2 = a.b(aVar, this.f21737b, jk.a(22));
                Long lC = a.c(aVar, this.f21737b, jk.a(6));
                boolean z10 = this.f21737b.getBoolean(jk.a(7), false);
                int iB = this.f21737b.b(0, jk.a(5));
                int iB2 = this.f21737b.b(0, jk.a(31));
                Boolean boolA2 = a.a(aVar, this.f21737b, jk.a(10));
                boolean z11 = this.f21737b.getBoolean(jk.a(12), false);
                boolean z12 = this.f21737b.getBoolean(jk.a(13), false);
                boolean z13 = this.f21737b.getBoolean(jk.a(14), false);
                boolean z14 = this.f21737b.getBoolean(jk.a(15), false);
                Boolean boolA3 = a.a(aVar, this.f21737b, jk.a(16));
                String strB = this.f21737b.b(jk.a(9));
                String strB2 = this.f21737b.b(jk.a(46));
                String strB3 = this.f21737b.b(jk.a(47));
                String strB4 = this.f21737b.b(jk.a(43));
                String strB5 = this.f21737b.b(jk.a(2));
                String strB6 = this.f21737b.b(jk.a(3));
                boolean z15 = this.f21737b.getBoolean(jk.a(4), false);
                boolean z16 = this.f21737b.getBoolean(jk.a(11), false);
                boolean z17 = this.f21737b.getBoolean(jk.a(44), false);
                boolean z18 = this.f21737b.getBoolean(jk.a(18), false);
                boolean z19 = this.f21737b.getBoolean(jk.a(17), false);
                boolean z20 = this.f21737b.getBoolean(jk.a(19), false);
                boolean z21 = this.f21737b.getBoolean(jk.a(20), false);
                boolean z22 = this.f21737b.getBoolean(jk.a(25), false);
                boolean z23 = this.f21737b.getBoolean(jk.a(26), false);
                boolean z24 = this.f21737b.getBoolean(jk.a(23), false);
                boolean z25 = this.f21737b.getBoolean(jk.a(24), false);
                boolean z26 = this.f21737b.getBoolean(jk.a(28), false);
                boolean z27 = this.f21737b.getBoolean(jk.a(29), false);
                boolean z28 = this.f21737b.getBoolean(jk.a(39), false);
                boolean z29 = this.f21737b.getBoolean(jk.a(30), false);
                BiddingSettings biddingSettingsA = ye.a(this.f21737b);
                String strB7 = this.f21737b.b(jk.a(32));
                String strB8 = this.f21737b.b(jk.a(27));
                Integer numB3 = a.b(aVar, this.f21737b, jk.a(33));
                boolean z30 = this.f21737b.getBoolean(jk.a(34), false);
                boolean z31 = this.f21737b.getBoolean(jk.a(35), false);
                boolean z32 = this.f21737b.getBoolean(jk.a(37), false);
                boolean z33 = this.f21737b.getBoolean(jk.a(38), false);
                boolean z34 = this.f21737b.getBoolean(jk.a(40), false);
                boolean z35 = this.f21737b.getBoolean(jk.a(36), false);
                boolean z36 = this.f21737b.getBoolean(jk.a(41), false);
                boolean z37 = this.f21737b.getBoolean(jk.a(42), false);
                boolean z38 = this.f21737b.getBoolean(jk.a(48), false);
                Boolean boolA4 = a.a(aVar, this.f21737b, jk.a(45));
                boolean z39 = this.f21737b.getBoolean(jk.a(49), false);
                boolean z40 = this.f21737b.getBoolean(jk.a(50), false);
                boolean z41 = this.f21737b.getBoolean(jk.a(51), false);
                boolean z42 = this.f21737b.getBoolean(jk.a(52), false);
                Long lC2 = a.c(aVar, this.f21737b, jk.a(53));
                long jLongValue = lC2 != null ? lC2.longValue() : 0L;
                Long lC3 = a.c(aVar, this.f21737b, jk.a(54));
                long jLongValue2 = lC3 != null ? lC3.longValue() : 0L;
                nz0.a aVarI = new nz0.a().h(strB).c(boolA3).a(jA).a(numB).b(numB2).a(lC).a(z10).a(iB).b(iB2).b(boolA2).g(z11).l(z12).u(z13).b(z14).B(z16).m(z17).f(strB5).g(strB6).f(z15).d(boolA).q(z18).r(z19).y(z20).z(z21).D(z22).C(z23).n(z24).d(z35).p(z25).e(strB8).j(z26).a(biddingSettingsA).e(z30).o(z31).h(z32).v(z29).G(z33).x(z27).t(z28).a(boolA4).s(z34).i(z36).a(strB2).d(strB3).A(z37).c(strB4).c(z38).k(z39).w(z40).F(z41).E(z42).b(jLongValue).c(jLongValue2).b(this.f21737b.b(jk.a(55))).i(this.f21737b.b(jk.a(56)));
                fd.j0.h(aVarI, "Builder()\n              …upVersion(startupVersion)");
                if (strB7 != null && numB3 != null) {
                    aVarI.a(new tr(numB3.intValue(), strB7));
                }
                nz0VarA = aVarI.a();
            } else {
                nz0VarA = null;
            }
        }
        return nz0VarA;
    }

    @Override // com.yandex.mobile.ads.impl.hk
    public final void a(nz0 nz0Var) {
        fd.j0.i(nz0Var, "sdkConfiguration");
        synchronized (f21736d) {
            this.f21737b.putString(jk.a(9), nz0Var.r());
            this.f21737b.putString(jk.a(43), nz0Var.g());
            this.f21737b.putBoolean(jk.a(11), nz0Var.W());
            this.f21737b.putBoolean(jk.a(44), nz0Var.G());
            this.f21737b.putLong(jk.a(1), nz0Var.j());
            this.f21737b.putString(jk.a(2), nz0Var.n());
            this.f21737b.putString(jk.a(3), nz0Var.p());
            this.f21737b.putString(jk.a(27), nz0Var.m());
            this.f21737b.putBoolean(jk.a(4), nz0Var.z());
            this.f21737b.putBoolean(jk.a(25), nz0Var.d0());
            this.f21737b.putBoolean(jk.a(26), nz0Var.c0());
            this.f21737b.a(nz0Var.c(), jk.a(5));
            this.f21737b.putBoolean(jk.a(23), nz0Var.H());
            this.f21737b.putBoolean(jk.a(24), nz0Var.J());
            this.f21737b.putBoolean(jk.a(34), nz0Var.y());
            this.f21737b.putBoolean(jk.a(35), nz0Var.I());
            this.f21737b.putBoolean(jk.a(37), nz0Var.B());
            this.f21737b.putBoolean(jk.a(36), nz0Var.x());
            this.f21737b.putBoolean(jk.a(38), nz0Var.Z());
            this.f21737b.putBoolean(jk.a(39), nz0Var.N());
            this.f21737b.putBoolean(jk.a(40), nz0Var.M());
            this.f21737b.putBoolean(jk.a(41), nz0Var.C());
            this.f21737b.putBoolean(jk.a(42), nz0Var.V());
            this.f21737b.a(nz0Var.o(), jk.a(31));
            this.f21737b.putString(jk.a(46), nz0Var.b());
            this.f21737b.putString(jk.a(47), nz0Var.h());
            this.f21737b.putString(jk.a(55), nz0Var.e());
            Long lA = nz0Var.a();
            boolean zU = nz0Var.u();
            Boolean boolB0 = nz0Var.b0();
            Boolean boolP = nz0Var.P();
            boolean zA = nz0Var.A();
            boolean zF = nz0Var.F();
            boolean zO = nz0Var.O();
            boolean zV = nz0Var.v();
            Boolean boolA0 = nz0Var.a0();
            boolean zK = nz0Var.K();
            boolean zL = nz0Var.L();
            boolean zT = nz0Var.T();
            boolean zU2 = nz0Var.U();
            boolean zD = nz0Var.D();
            boolean zS = nz0Var.S();
            boolean zQ = nz0Var.Q();
            Integer numD = nz0Var.d();
            Integer numQ = nz0Var.q();
            BiddingSettings biddingSettingsF = nz0Var.f();
            boolean zX = nz0Var.x();
            boolean zV2 = nz0Var.V();
            Boolean boolT = nz0Var.t();
            boolean zW = nz0Var.w();
            boolean zE = nz0Var.E();
            boolean zR = nz0Var.R();
            boolean zY = nz0Var.Y();
            boolean zX2 = nz0Var.X();
            long jK = nz0Var.k();
            long jL = nz0Var.l();
            a aVar = f21735c;
            a.a(aVar, this.f21737b, jk.a(6), lA);
            a.a(aVar, this.f21737b, jk.a(7), Boolean.valueOf(zU));
            a.a(aVar, this.f21737b, jk.a(8), boolB0);
            a.a(aVar, this.f21737b, jk.a(10), boolP);
            a.a(aVar, this.f21737b, jk.a(12), Boolean.valueOf(zA));
            a.a(aVar, this.f21737b, jk.a(13), Boolean.valueOf(zF));
            a.a(aVar, this.f21737b, jk.a(14), Boolean.valueOf(zO));
            a.a(aVar, this.f21737b, jk.a(15), Boolean.valueOf(zV));
            a.a(aVar, this.f21737b, jk.a(16), boolA0);
            a.a(aVar, this.f21737b, jk.a(18), Boolean.valueOf(zK));
            a.a(aVar, this.f21737b, jk.a(17), Boolean.valueOf(zL));
            a.a(aVar, this.f21737b, jk.a(19), Boolean.valueOf(zT));
            a.a(aVar, this.f21737b, jk.a(20), Boolean.valueOf(zU2));
            a.a(aVar, this.f21737b, jk.a(36), Boolean.valueOf(zX));
            a.a(aVar, this.f21737b, jk.a(28), Boolean.valueOf(zD));
            a.a(aVar, this.f21737b, jk.a(29), Boolean.valueOf(zS));
            a.a(aVar, this.f21737b, jk.a(30), Boolean.valueOf(zQ));
            a.a(aVar, this.f21737b, jk.a(45), boolT);
            a.a(aVar, this.f21737b, jk.a(48), Boolean.valueOf(zW));
            a.a(aVar, this.f21737b, jk.a(21), numD);
            a.a(aVar, this.f21737b, jk.a(22), numQ);
            if (biddingSettingsF != null) {
                ye.a(this.f21737b, biddingSettingsF);
            } else {
                ye.b(this.f21737b);
            }
            tr trVarI = nz0Var.i();
            if (trVarI != null) {
                this.f21737b.putString(jk.a(32), trVarI.a());
                this.f21737b.a(trVarI.b(), jk.a(33));
            }
            a.a(aVar, this.f21737b, jk.a(42), Boolean.valueOf(zV2));
            this.f21737b.putLong(jk.a(53), jK);
            this.f21737b.putBoolean(jk.a(49), zE);
            this.f21737b.putBoolean(jk.a(50), zR);
            this.f21737b.putBoolean(jk.a(51), zY);
            this.f21737b.putBoolean(jk.a(52), zX2);
            this.f21737b.putLong(jk.a(54), jL);
            this.f21737b.putString(jk.a(56), nz0Var.s());
        }
    }
}
