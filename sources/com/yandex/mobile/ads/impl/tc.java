package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class tc implements ut {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f25320c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private uc f25322e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f25325h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private sh f25326i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f25330m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f25331n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mp0 f25318a = new mp0(12);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f25319b = new b(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private wt f25321d = new ar();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private sh[] f25324g = new sh[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f25328k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f25329l = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f25327j = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f25323f = -9223372036854775807L;

    public class a implements p01 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f25332a;

        public a(long j10) {
            this.f25332a = j10;
        }

        @Override // com.yandex.mobile.ads.impl.p01
        public final p01.a b(long j10) {
            p01.a aVarB = tc.this.f25324g[0].b(j10);
            for (int i10 = 1; i10 < tc.this.f25324g.length; i10++) {
                p01.a aVarB2 = tc.this.f25324g[i10].b(j10);
                if (aVarB2.f23940a.f24584b < aVarB.f23940a.f24584b) {
                    aVarB = aVarB2;
                }
            }
            return aVarB;
        }

        @Override // com.yandex.mobile.ads.impl.p01
        public final boolean b() {
            return true;
        }

        @Override // com.yandex.mobile.ads.impl.p01
        public final long c() {
            return this.f25332a;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f25334a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f25335b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f25336c;

        private b() {
        }

        public /* synthetic */ b(int i10) {
            this();
        }
    }

    private boolean a(xn xnVar, cs0 cs0Var) throws IOException {
        boolean z10;
        if (this.f25325h != -1) {
            long position = xnVar.getPosition();
            long j10 = this.f25325h;
            if (j10 < position || j10 > 262144 + position) {
                cs0Var.f19623a = j10;
                z10 = true;
            } else {
                xnVar.a((int) (j10 - position));
                z10 = false;
            }
        } else {
            z10 = false;
        }
        this.f25325h = -1L;
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0262  */
    /* JADX WARN: Code duplicated, block: B:114:0x027f  */
    /* JADX WARN: Code duplicated, block: B:119:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:126:0x02be  */
    /* JADX WARN: Code duplicated, block: B:132:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:134:0x02d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:135:0x02db  */
    /* JADX WARN: Code duplicated, block: B:136:0x02de  */
    /* JADX WARN: Code duplicated, block: B:138:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:142:0x030f  */
    /* JADX WARN: Code duplicated, block: B:149:0x0323  */
    /* JADX WARN: Code duplicated, block: B:152:0x0330  */
    /* JADX WARN: Code duplicated, block: B:156:0x0336  */
    /* JADX WARN: Code duplicated, block: B:158:0x0358  */
    /* JADX WARN: Code duplicated, block: B:162:0x0372  */
    /* JADX WARN: Code duplicated, block: B:197:0x028e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x0279 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x02ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x02cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x031e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b7  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v9 com.yandex.mobile.ads.impl.sc, still in use, count: 2, list:
          (r5v9 com.yandex.mobile.ads.impl.sc) from 0x0256: INVOKE (r5v9 com.yandex.mobile.ads.impl.sc) VIRTUAL call: java.lang.Object.getClass():java.lang.Class A[MD:():java.lang.Class<?> (c), WRAPPED]
          (r5v9 com.yandex.mobile.ads.impl.sc) from 0x025e: PHI (r5 I:??) = (r5v3 com.yandex.mobile.ads.impl.sc), (r5v9 com.yandex.mobile.ads.impl.sc) binds: [B:108:0x025d, B:194:0x025e] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // com.yandex.mobile.ads.impl.ut
    public final int a(com.yandex.mobile.ads.impl.vt r21, com.yandex.mobile.ads.impl.cs0 r22) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1058
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.tc.a(com.yandex.mobile.ads.impl.vt, com.yandex.mobile.ads.impl.cs0):int");
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final void a(long j10, long j11) {
        this.f25325h = -1L;
        this.f25326i = null;
        for (sh shVar : this.f25324g) {
            shVar.c(j10);
        }
        if (j10 != 0) {
            this.f25320c = 6;
        } else if (this.f25324g.length == 0) {
            this.f25320c = 0;
        } else {
            this.f25320c = 3;
        }
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final void a(wt wtVar) {
        this.f25320c = 0;
        this.f25321d = wtVar;
        this.f25325h = -1L;
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final boolean a(vt vtVar) throws IOException {
        ((xn) vtVar).b(this.f25318a.c(), 0, 12, false);
        this.f25318a.e(0);
        if (this.f25318a.k() != 1179011410) {
            return false;
        }
        this.f25318a.f(4);
        return this.f25318a.k() == 541677121;
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final void release() {
    }
}
