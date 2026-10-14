package com.yandex.mobile.ads.impl;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.google.android.gms.common.Scopes;
import com.yandex.mobile.ads.exo.video.PlaceholderSurface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class qb0 extends kb0 {

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    private static final rb0 f24397q1 = ot0.h();

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    private static final int[] f24398r1 = {1920, 1600, DateTimeConstants.MINUTES_PER_DAY, 1280, 960, 854, 640, 540, 480};

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    private static boolean f24399s1;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    private static boolean f24400t1;
    private final Context H0;
    private final ye1 I0;
    private final sf1.a J0;
    private final long K0;
    private final int L0;
    private final boolean M0;
    private a N0;
    private boolean O0;
    private boolean P0;
    private Surface Q0;
    private PlaceholderSurface R0;
    private boolean S0;
    private int T0;
    private boolean U0;
    private boolean V0;
    private boolean W0;
    private long X0;
    private long Y0;
    private long Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private int f24401a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private int f24402b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private int f24403c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private long f24404d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private long f24405e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private long f24406f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private int f24407g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    private int f24408h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    private int f24409i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    private int f24410j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    private float f24411k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    private wf1 f24412l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    private boolean f24413m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    private int f24414n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public b f24415o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private xe1 f24416p1;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f24417a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f24418b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f24419c;

        public a(int i10, int i11, int i12) {
            this.f24417a = i10;
            this.f24418b = i11;
            this.f24419c = i12;
        }
    }

    public final class b implements eb0.c, Handler.Callback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Handler f24420b;

        public b(eb0 eb0Var) {
            Handler handlerA = da1.a((Handler.Callback) this);
            this.f24420b = handlerA;
            eb0Var.a(this, handlerA);
        }

        @Override // com.yandex.mobile.ads.impl.eb0.c
        public final void a(long j10) {
            if (da1.f19803a < 30) {
                this.f24420b.sendMessageAtFrontOfQueue(Message.obtain(this.f24420b, 0, (int) (j10 >> 32), (int) j10));
                return;
            }
            qb0 qb0Var = qb0.this;
            if (this != qb0Var.f24415o1) {
                return;
            }
            if (j10 == RecyclerView.FOREVER_NS) {
                qb0.a(qb0Var);
                return;
            }
            try {
                qb0Var.e(j10);
            } catch (ns e10) {
                qb0.this.a(e10);
            }
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            int i10 = message.arg1;
            int i11 = message.arg2;
            int i12 = da1.f19803a;
            long j10 = ((((long) i10) & 4294967295L) << 32) | (4294967295L & ((long) i11));
            qb0 qb0Var = qb0.this;
            if (this != qb0Var.f24415o1) {
                return true;
            }
            if (j10 == RecyclerView.FOREVER_NS) {
                qb0.a(qb0Var);
                return true;
            }
            try {
                qb0Var.e(j10);
                return true;
            } catch (ns e10) {
                qb0.this.a(e10);
                return true;
            }
        }
    }

    public qb0(Context context, go goVar, mb0 mb0Var, Handler handler, sf1 sf1Var) {
        super(2, goVar, mb0Var, 30.0f);
        this.K0 = 5000L;
        this.L0 = 50;
        Context applicationContext = context.getApplicationContext();
        this.H0 = applicationContext;
        this.I0 = new ye1(applicationContext);
        this.J0 = new sf1.a(handler, sf1Var);
        this.M0 = T();
        this.Y0 = -9223372036854775807L;
        this.f24408h1 = -1;
        this.f24409i1 = -1;
        this.f24411k1 = -1.0f;
        this.T0 = 1;
        this.f24414n1 = 0;
        S();
    }

    private void R() {
        eb0 eb0VarC;
        this.U0 = false;
        if (da1.f19803a < 23 || !this.f24413m1 || (eb0VarC = C()) == null) {
            return;
        }
        this.f24415o1 = new b(eb0VarC);
    }

    private void S() {
        this.f24412l1 = null;
    }

    private static boolean T() {
        return f24397q1.Z0().equals(da1.f19805c);
    }

    private static boolean U() {
        int i10 = da1.f19803a;
        if (i10 <= 28) {
            rb0 rb0Var = f24397q1;
            String strR = rb0Var.r();
            String str = da1.f19804b;
            if (strR.equals(str) || rb0Var.I().equals(str) || rb0Var.K().equals(str) || rb0Var.J().equals(str) || rb0Var.Q0().equals(str) || rb0Var.P0().equals(str) || rb0Var.d1().equals(str) || rb0Var.e1().equals(str)) {
                return true;
            }
        }
        if (i10 <= 27 && f24397q1.w0().equals(da1.f19804b)) {
            return true;
        }
        if (i10 > 26) {
            return false;
        }
        rb0 rb0Var2 = f24397q1;
        String strA = rb0Var2.a();
        String str2 = da1.f19804b;
        if (!strA.equals(str2) && !rb0Var2.b().equals(str2) && !rb0Var2.c().equals(str2) && !rb0Var2.d().equals(str2) && !rb0Var2.e().equals(str2) && !rb0Var2.f().equals(str2) && !rb0Var2.g().equals(str2) && !rb0Var2.h().equals(str2) && !rb0Var2.i().equals(str2) && !rb0Var2.j().equals(str2) && !rb0Var2.k().equals(str2) && !rb0Var2.l().equals(str2) && !rb0Var2.m().equals(str2) && !rb0Var2.s().equals(str2) && !rb0Var2.t().equals(str2) && !rb0Var2.u().equals(str2) && !rb0Var2.v().equals(str2) && !rb0Var2.w().equals(str2) && !rb0Var2.y().equals(str2) && !rb0Var2.z().equals(str2) && !rb0Var2.A().equals(str2) && !rb0Var2.B().equals(str2) && !rb0Var2.C().equals(str2) && !rb0Var2.D().equals(str2) && !rb0Var2.E().equals(str2) && !rb0Var2.F().equals(str2) && !rb0Var2.G().equals(str2) && !rb0Var2.H().equals(str2) && !rb0Var2.L().equals(str2) && !rb0Var2.M().equals(str2) && !rb0Var2.N().equals(str2) && !rb0Var2.O().equals(str2) && !rb0Var2.P().equals(str2) && !rb0Var2.Q().equals(str2) && !rb0Var2.R().equals(str2) && !rb0Var2.S().equals(str2) && !rb0Var2.T().equals(str2) && !rb0Var2.U().equals(str2) && !rb0Var2.V().equals(str2) && !rb0Var2.W().equals(str2) && !rb0Var2.X().equals(str2) && !rb0Var2.Y().equals(str2) && !rb0Var2.Z().equals(str2) && !rb0Var2.a0().equals(str2) && !rb0Var2.b0().equals(str2) && !rb0Var2.c0().equals(str2) && !rb0Var2.d0().equals(str2) && !rb0Var2.e0().equals(str2) && !rb0Var2.f0().equals(str2) && !rb0Var2.g0().equals(str2) && !rb0Var2.h0().equals(str2) && !rb0Var2.i0().equals(str2) && !rb0Var2.j0().equals(str2) && !rb0Var2.k0().equals(str2) && !rb0Var2.l0().equals(str2) && !rb0Var2.m0().equals(str2) && !rb0Var2.n0().equals(str2) && !rb0Var2.o0().equals(str2) && !rb0Var2.p0().equals(str2) && !rb0Var2.q0().equals(str2) && !rb0Var2.r0().equals(str2) && !rb0Var2.s0().equals(str2) && !rb0Var2.t0().equals(str2) && !rb0Var2.u0().equals(str2) && !rb0Var2.v0().equals(str2) && !rb0Var2.x0().equals(str2) && !rb0Var2.y0().equals(str2) && !rb0Var2.z0().equals(str2) && !rb0Var2.A0().equals(str2) && !rb0Var2.B0().equals(str2) && !rb0Var2.C0().equals(str2) && !rb0Var2.D0().equals(str2) && !rb0Var2.E0().equals(str2) && !rb0Var2.F0().equals(str2) && !rb0Var2.H0().equals(str2) && !rb0Var2.I0().equals(str2) && !rb0Var2.K0().equals(str2) && !rb0Var2.L0().equals(str2) && !rb0Var2.M0().equals(str2) && !rb0Var2.N0().equals(str2) && !rb0Var2.O0().equals(str2) && !rb0Var2.R0().equals(str2) && !rb0Var2.S0().equals(str2) && !rb0Var2.T0().equals(str2) && !rb0Var2.U0().equals(str2) && !rb0Var2.V0().equals(str2) && !rb0Var2.W0().equals(str2) && !rb0Var2.X0().equals(str2) && !rb0Var2.Y0().equals(str2) && !rb0Var2.a1().equals(str2) && !rb0Var2.b1().equals(str2) && !rb0Var2.f1().equals(str2) && !rb0Var2.g1().equals(str2) && !rb0Var2.h1().equals(str2) && !rb0Var2.i1().equals(str2) && !rb0Var2.j1().equals(str2) && !rb0Var2.k1().equals(str2) && !rb0Var2.l1().equals(str2) && !rb0Var2.m1().equals(str2) && !rb0Var2.n1().equals(str2) && !rb0Var2.o1().equals(str2) && !rb0Var2.p1().equals(str2) && !rb0Var2.q1().equals(str2) && !rb0Var2.r1().equals(str2) && !rb0Var2.s1().equals(str2) && !rb0Var2.t1().equals(str2) && !rb0Var2.u1().equals(str2) && !rb0Var2.v1().equals(str2) && !rb0Var2.w1().equals(str2) && !rb0Var2.x1().equals(str2) && !rb0Var2.y1().equals(str2) && !rb0Var2.z1().equals(str2) && !rb0Var2.A1().equals(str2) && !rb0Var2.B1().equals(str2) && !rb0Var2.C1().equals(str2) && !rb0Var2.D1().equals(str2) && !rb0Var2.E1().equals(str2) && !rb0Var2.G1().equals(str2) && !rb0Var2.H1().equals(str2) && !rb0Var2.I1().equals(str2) && !rb0Var2.F1().equals(str2) && !rb0Var2.J1().equals(str2) && !rb0Var2.K1().equals(str2) && !rb0Var2.L1().equals(str2) && !rb0Var2.M1().equals(str2) && !rb0Var2.N1().equals(str2) && !rb0Var2.O1().equals(str2) && !rb0Var2.P1().equals(str2) && !rb0Var2.Q1().equals(str2) && !rb0Var2.R1().equals(str2) && !rb0Var2.S1().equals(str2) && !rb0Var2.T1().equals(str2) && !rb0Var2.U1().equals(str2) && !rb0Var2.V1().equals(str2) && !rb0Var2.W1().equals(str2) && !rb0Var2.X1().equals(str2) && !rb0Var2.Y1().equals(str2) && !rb0Var2.Z1().equals(str2) && !rb0Var2.a2().equals(str2) && !rb0Var2.b2().equals(str2)) {
            String strN = rb0Var2.n();
            String str3 = da1.f19806d;
            if (!strN.equals(str3) && !rb0Var2.o().equals(str3) && !rb0Var2.G0().equals(str3)) {
                return false;
            }
        }
        return true;
    }

    private void V() {
        int i10 = this.f24408h1;
        if (i10 == -1 && this.f24409i1 == -1) {
            return;
        }
        wf1 wf1Var = this.f24412l1;
        if (wf1Var != null && wf1Var.f26269a == i10 && wf1Var.f26270b == this.f24409i1 && wf1Var.f26271c == this.f24410j1 && wf1Var.f26272d == this.f24411k1) {
            return;
        }
        wf1 wf1Var2 = new wf1(this.f24408h1, this.f24409i1, this.f24410j1, this.f24411k1);
        this.f24412l1 = wf1Var2;
        this.J0.b(wf1Var2);
    }

    public static int a(yv yvVar, ib0 ib0Var) {
        int iA;
        int iIntValue;
        int i10 = yvVar.f27120q;
        int i11 = yvVar.f27121r;
        if (i10 == -1 || i11 == -1) {
            return -1;
        }
        String str = yvVar.f27115l;
        if ("video/dolby-vision".equals(str)) {
            Pair<Integer, Integer> pairB = nb0.b(yvVar);
            str = (pairB == null || !((iIntValue = ((Integer) pairB.first).intValue()) == 512 || iIntValue == 1 || iIntValue == 2)) ? "video/hevc" : "video/avc";
        }
        Objects.requireNonNull(str);
        int i12 = 4;
        switch (str) {
            case "video/3gpp":
            case "video/av01":
            case "video/mp4v-es":
            case "video/x-vnd.on2.vp8":
                iA = i10 * i11;
                i12 = 2;
                return (iA * 3) / (i12 * 2);
            case "video/hevc":
            case "video/x-vnd.on2.vp9":
                iA = i10 * i11;
                return (iA * 3) / (i12 * 2);
            case "video/avc":
                rb0 rb0Var = f24397q1;
                String strX = rb0Var.x();
                String str2 = da1.f19806d;
                if (strX.equals(str2) || (rb0Var.q().equals(da1.f19805c) && (rb0Var.J0().equals(str2) || (rb0Var.p().equals(str2) && ib0Var.f21672f)))) {
                    return -1;
                }
                iA = da1.a(i11, 16) * da1.a(i10, 16) * 16 * 16;
                i12 = 2;
                return (iA * 3) / (i12 * 2);
            default:
                return -1;
        }
    }

    private static com.yandex.mobile.ads.embedded.guava.collect.p a(mb0 mb0Var, yv yvVar, boolean z10, boolean z11) throws nb0.b {
        String str = yvVar.f27115l;
        if (str == null) {
            return com.yandex.mobile.ads.embedded.guava.collect.p.i();
        }
        List<ib0> listA = mb0Var.a(str, z10, z11);
        String strA = nb0.a(yvVar);
        if (strA == null) {
            return com.yandex.mobile.ads.embedded.guava.collect.p.a((Collection) listA);
        }
        List<ib0> listA2 = mb0Var.a(strA, z10, z11);
        int i10 = com.yandex.mobile.ads.embedded.guava.collect.p.f18374c;
        return new com.yandex.mobile.ads.embedded.guava.collect.p.a().b((List) listA).b((List) listA2).a();
    }

    public static void a(qb0 qb0Var) {
        qb0Var.P();
    }

    public static int b(yv yvVar, ib0 ib0Var) {
        if (yvVar.f27116m == -1) {
            return a(yvVar, ib0Var);
        }
        int size = yvVar.f27117n.size();
        int length = 0;
        for (int i10 = 0; i10 < size; i10++) {
            length += yvVar.f27117n.get(i10).length;
        }
        return yvVar.f27116m + length;
    }

    private boolean b(ib0 ib0Var) {
        boolean z10;
        if (da1.f19803a >= 23 && !this.f24413m1) {
            if (ib0Var.f21667a.startsWith(f24397q1.c1())) {
                z10 = false;
            } else {
                synchronized (qb0.class) {
                    if (!f24399s1) {
                        f24400t1 = U();
                        f24399s1 = true;
                    }
                }
                z10 = f24400t1;
            }
            if (!z10 && (!ib0Var.f21672f || PlaceholderSurface.a(this.H0))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.kb0
    public final boolean E() {
        return this.f24413m1 && da1.f19803a < 23;
    }

    @Override // com.yandex.mobile.ads.impl.kb0
    public final void J() {
        R();
    }

    @Override // com.yandex.mobile.ads.impl.kb0
    public final void N() {
        super.N();
        this.f24403c1 = 0;
    }

    @Override // com.yandex.mobile.ads.impl.kb0
    public final float a(float f10, yv[] yvVarArr) {
        float fMax = -1.0f;
        for (yv yvVar : yvVarArr) {
            float f11 = yvVar.f27122s;
            if (f11 != -1.0f) {
                fMax = Math.max(fMax, f11);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.mobile.ads.impl.kb0
    public final int a(mb0 mb0Var, yv yvVar) throws nb0.b {
        boolean z10;
        int i10 = 0;
        if (!te0.d(yvVar.f27115l)) {
            return qv0.a(0);
        }
        boolean z11 = yvVar.f27118o != null;
        com.yandex.mobile.ads.embedded.guava.collect.p pVarA = a(mb0Var, yvVar, z11, false);
        if (z11 && pVarA.isEmpty()) {
            pVarA = a(mb0Var, yvVar, false, false);
        }
        if (pVarA.isEmpty()) {
            return qv0.a(1);
        }
        int i11 = yvVar.E;
        if (!(i11 == 0 || i11 == 2)) {
            return qv0.a(2);
        }
        ib0 ib0Var = (ib0) pVarA.get(0);
        boolean zA = ib0Var.a(yvVar);
        if (!zA) {
            int i12 = 1;
            while (true) {
                if (i12 >= pVarA.size()) {
                    z10 = true;
                    break;
                }
                ib0 ib0Var2 = (ib0) pVarA.get(i12);
                if (ib0Var2.a(yvVar)) {
                    z10 = false;
                    zA = true;
                    ib0Var = ib0Var2;
                    break;
                }
                i12++;
            }
        } else {
            z10 = true;
            break;
        }
        int i13 = zA ? 4 : 3;
        int i14 = ib0Var.b(yvVar) ? 16 : 8;
        int i15 = ib0Var.f21673g ? 64 : 0;
        int i16 = z10 ? 128 : 0;
        if (zA) {
            com.yandex.mobile.ads.embedded.guava.collect.p pVarA2 = a(mb0Var, yvVar, z11, true);
            if (!pVarA2.isEmpty()) {
                ib0 ib0Var3 = (ib0) nb0.a(pVarA2, yvVar).get(0);
                if (ib0Var3.a(yvVar) && ib0Var3.b(yvVar)) {
                    i10 = 32;
                }
            }
        }
        return i13 | i14 | i10 | i15 | i16;
    }

    @Override // com.yandex.mobile.ads.impl.kb0
    public final cn a(ib0 ib0Var, yv yvVar, yv yvVar2) {
        cn cnVarA = ib0Var.a(yvVar, yvVar2);
        int i10 = cnVarA.f19561e;
        int i11 = yvVar2.f27120q;
        a aVar = this.N0;
        if (i11 > aVar.f24417a || yvVar2.f27121r > aVar.f24418b) {
            i10 |= 256;
        }
        if (b(yvVar2, ib0Var) > this.N0.f24419c) {
            i10 |= 64;
        }
        int i12 = i10;
        return new cn(ib0Var.f21667a, yvVar, yvVar2, i12 != 0 ? 0 : cnVarA.f19560d, i12);
    }

    @Override // com.yandex.mobile.ads.impl.kb0
    public final cn a(zv zvVar) throws ns {
        cn cnVarA = super.a(zvVar);
        this.J0.a(zvVar.f27433b, cnVarA);
        return cnVarA;
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0141  */
    /* JADX WARN: Instruction removed from duplicated block: B:78:0x0141, please report this as an issue */
    @Override // com.yandex.mobile.ads.impl.kb0
    @TargetApi(17)
    public final eb0.a a(ib0 ib0Var, yv yvVar, MediaCrypto mediaCrypto, float f10) {
        String str;
        a aVar;
        Point point;
        boolean z10;
        Pair<Integer, Integer> pairB;
        int iA;
        PlaceholderSurface placeholderSurface = this.R0;
        if (placeholderSurface != null && placeholderSurface.f18731a != ib0Var.f21672f) {
            if (this.Q0 == placeholderSurface) {
                this.Q0 = null;
            }
            placeholderSurface.release();
            this.R0 = null;
        }
        String str2 = ib0Var.f21669c;
        yv[] yvVarArrS = s();
        int iMax = yvVar.f27120q;
        int iMax2 = yvVar.f27121r;
        int iB = b(yvVar, ib0Var);
        if (yvVarArrS.length == 1) {
            if (iB != -1 && (iA = a(yvVar, ib0Var)) != -1) {
                iB = Math.min((int) (iB * 1.5f), iA);
            }
            aVar = new a(iMax, iMax2, iB);
            str = str2;
        } else {
            int length = yvVarArrS.length;
            boolean z11 = false;
            for (int i10 = 0; i10 < length; i10++) {
                yv yvVarA = yvVarArrS[i10];
                if (yvVar.f27127x != null && yvVarA.f27127x == null) {
                    yvVarA = yvVarA.a().a(yvVar.f27127x).a();
                }
                if (ib0Var.a(yvVar, yvVarA).f19560d != 0) {
                    int i11 = yvVarA.f27120q;
                    z11 |= i11 == -1 || yvVarA.f27121r == -1;
                    iMax = Math.max(iMax, i11);
                    iMax2 = Math.max(iMax2, yvVarA.f27121r);
                    iB = Math.max(iB, b(yvVarA, ib0Var));
                }
            }
            if (z11) {
                p90.d("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                int i12 = yvVar.f27121r;
                int i13 = yvVar.f27120q;
                boolean z12 = i12 > i13;
                int i14 = z12 ? i12 : i13;
                if (z12) {
                    i12 = i13;
                }
                float f11 = i12 / i14;
                int[] iArr = f24398r1;
                int length2 = iArr.length;
                int i15 = 0;
                while (true) {
                    if (i15 < length2) {
                        int i16 = length2;
                        int i17 = iArr[i15];
                        int[] iArr2 = iArr;
                        int i18 = (int) (i17 * f11);
                        if (i17 > i14 && i18 > i12) {
                            int i19 = i12;
                            float f12 = f11;
                            if (da1.f19803a >= 21) {
                                int i20 = z12 ? i18 : i17;
                                if (!z12) {
                                    i17 = i18;
                                }
                                Point pointA = ib0Var.a(i20, i17);
                                str = str2;
                                if (ib0Var.a(pointA.x, pointA.y, yvVar.f27122s)) {
                                    point = pointA;
                                } else {
                                    i15++;
                                    length2 = i16;
                                    iArr = iArr2;
                                    i12 = i19;
                                    f11 = f12;
                                    str2 = str;
                                }
                            } else {
                                str = str2;
                                try {
                                    int iA2 = da1.a(i17, 16) * 16;
                                    int iA3 = da1.a(i18, 16) * 16;
                                    if (iA2 * iA3 <= nb0.a()) {
                                        int i21 = z12 ? iA3 : iA2;
                                        if (!z12) {
                                            iA2 = iA3;
                                        }
                                        point = new Point(i21, iA2);
                                    } else {
                                        i15++;
                                        length2 = i16;
                                        iArr = iArr2;
                                        i12 = i19;
                                        f11 = f12;
                                        str2 = str;
                                    }
                                } catch (nb0.b unused) {
                                    point = null;
                                }
                            }
                        }
                        if (point != null) {
                            iMax = Math.max(iMax, point.x);
                            iMax2 = Math.max(iMax2, point.y);
                            iB = Math.max(iB, a(yvVar.a().q(iMax).g(iMax2).a(), ib0Var));
                            p90.d("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                        }
                    }
                    str = str2;
                    point = null;
                    if (point != null) {
                        iMax = Math.max(iMax, point.x);
                        iMax2 = Math.max(iMax2, point.y);
                        iB = Math.max(iB, a(yvVar.a().q(iMax).g(iMax2).a(), ib0Var));
                        p90.d("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                    }
                }
            } else {
                str = str2;
            }
            aVar = new a(iMax, iMax2, iB);
        }
        this.N0 = aVar;
        boolean z13 = this.M0;
        int i22 = this.f24413m1 ? this.f24414n1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", yvVar.f27120q);
        mediaFormat.setInteger("height", yvVar.f27121r);
        List<byte[]> list = yvVar.f27117n;
        for (int i23 = 0; i23 < list.size(); i23++) {
            mediaFormat.setByteBuffer(u60.a("csd-", i23), ByteBuffer.wrap(list.get(i23)));
        }
        float f13 = yvVar.f27122s;
        if (f13 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f13);
        }
        ac0.a(mediaFormat, "rotation-degrees", yvVar.f27123t);
        nj njVar = yvVar.f27127x;
        if (njVar != null) {
            ac0.a(mediaFormat, "color-transfer", njVar.f23398c);
            ac0.a(mediaFormat, "color-standard", njVar.f23396a);
            ac0.a(mediaFormat, "color-range", njVar.f23397b);
            byte[] bArr = njVar.f23399d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(yvVar.f27115l) && (pairB = nb0.b(yvVar)) != null) {
            ac0.a(mediaFormat, Scopes.PROFILE, ((Integer) pairB.first).intValue());
        }
        mediaFormat.setInteger("max-width", aVar.f24417a);
        mediaFormat.setInteger("max-height", aVar.f24418b);
        ac0.a(mediaFormat, "max-input-size", aVar.f24419c);
        if (da1.f19803a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (z13) {
            z10 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z10 = true;
        }
        if (i22 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z10);
            mediaFormat.setInteger("audio-session-id", i22);
        }
        if (this.Q0 == null) {
            if (!b(ib0Var)) {
                throw new IllegalStateException();
            }
            if (this.R0 == null) {
                this.R0 = PlaceholderSurface.a(this.H0, ib0Var.f21672f);
            }
            this.Q0 = this.R0;
        }
        return eb0.a.a(ib0Var, mediaFormat, yvVar, this.Q0, mediaCrypto);
    }

    @Override // com.yandex.mobile.ads.impl.kb0
    public final hb0 a(IllegalStateException illegalStateException, ib0 ib0Var) {
        return new pb0(illegalStateException, ib0Var, this.Q0);
    }

    @Override // com.yandex.mobile.ads.impl.kb0
    public final ArrayList a(mb0 mb0Var, yv yvVar, boolean z10) throws nb0.b {
        return nb0.a(a(mb0Var, yvVar, z10, this.f24413m1), yvVar);
    }

    @Override // com.yandex.mobile.ads.impl.kb0, com.yandex.mobile.ads.impl.pv0
    public final void a(float f10, float f11) throws ns {
        super.a(f10, f11);
        this.I0.b(f10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.yandex.mobile.ads.impl.eb0] */
    /* JADX WARN: Type inference failed for: r5v7, types: [com.yandex.mobile.ads.impl.ye1] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r6v9, types: [com.yandex.mobile.ads.exo.video.PlaceholderSurface] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.yandex.mobile.ads.impl.me, com.yandex.mobile.ads.impl.hr0.b
    public final void a(int i10, Object obj) throws ns {
        ?? A;
        Surface surface;
        if (i10 != 1) {
            if (i10 == 7) {
                this.f24416p1 = (xe1) obj;
                return;
            }
            if (i10 == 10) {
                int iIntValue = ((Integer) obj).intValue();
                if (this.f24414n1 != iIntValue) {
                    this.f24414n1 = iIntValue;
                    if (this.f24413m1) {
                        L();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i10 != 4) {
                if (i10 != 5) {
                    return;
                }
                this.I0.a(((Integer) obj).intValue());
                return;
            } else {
                this.T0 = ((Integer) obj).intValue();
                eb0 eb0VarC = C();
                if (eb0VarC != null) {
                    eb0VarC.a(this.T0);
                    return;
                }
                return;
            }
        }
        if (obj instanceof Surface) {
            surface = (Surface) obj;
        } else {
            A = 0;
        }
        if (A == 0) {
            PlaceholderSurface placeholderSurface = this.R0;
            if (placeholderSurface != null) {
                A = surface;
                A = placeholderSurface;
            } else {
                ib0 ib0VarD = D();
                if (ib0VarD != null && b(ib0VarD)) {
                    A = surface;
                    A = PlaceholderSurface.a(this.H0, ib0VarD.f21672f);
                    this.R0 = A;
                }
            }
        }
        A = surface;
        A = surface;
        A = surface;
        if (this.Q0 == A) {
            if (A == 0 || A == this.R0) {
                return;
            }
            wf1 wf1Var = this.f24412l1;
            if (wf1Var != null) {
                this.J0.b(wf1Var);
            }
            if (this.S0) {
                this.J0.a(this.Q0);
                return;
            }
            return;
        }
        this.Q0 = A;
        this.I0.a(A);
        this.S0 = false;
        int iC = c();
        ?? C = C();
        if (C != 0) {
            if (da1.f19803a < 23 || A == 0 || this.O0) {
                L();
                I();
            } else {
                C.a(A);
            }
        }
        if (A == 0 || A == this.R0) {
            this.f24412l1 = null;
            R();
            return;
        }
        wf1 wf1Var2 = this.f24412l1;
        if (wf1Var2 != null) {
            this.J0.b(wf1Var2);
        }
        R();
        if (iC == 2) {
            this.Y0 = this.K0 > 0 ? SystemClock.elapsedRealtime() + this.K0 : -9223372036854775807L;
        }
    }

    @Override // com.yandex.mobile.ads.impl.kb0, com.yandex.mobile.ads.impl.me
    public final void a(long j10, boolean z10) throws ns {
        super.a(j10, z10);
        R();
        this.I0.a();
        long jElapsedRealtime = -9223372036854775807L;
        this.f24404d1 = -9223372036854775807L;
        this.X0 = -9223372036854775807L;
        this.f24402b1 = 0;
        if (z10 && this.K0 > 0) {
            jElapsedRealtime = SystemClock.elapsedRealtime() + this.K0;
        }
        this.Y0 = jElapsedRealtime;
    }

    @Override // com.yandex.mobile.ads.impl.kb0
    @TargetApi(29)
    public final void a(an anVar) throws ns {
        if (this.P0) {
            ByteBuffer byteBuffer = anVar.f19007f;
            Objects.requireNonNull(byteBuffer);
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4 && b12 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    eb0 eb0VarC = C();
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    eb0VarC.a(bundle);
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.kb0
    public final void a(yv yvVar, MediaFormat mediaFormat) {
        eb0 eb0VarC = C();
        if (eb0VarC != null) {
            eb0VarC.a(this.T0);
        }
        if (this.f24413m1) {
            this.f24408h1 = yvVar.f27120q;
            this.f24409i1 = yvVar.f27121r;
        } else {
            Objects.requireNonNull(mediaFormat);
            boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            this.f24408h1 = z10 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            this.f24409i1 = z10 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        }
        float f10 = yvVar.f27124u;
        this.f24411k1 = f10;
        if (da1.f19803a >= 21) {
            int i10 = yvVar.f27123t;
            if (i10 == 90 || i10 == 270) {
                int i11 = this.f24408h1;
                this.f24408h1 = this.f24409i1;
                this.f24409i1 = i11;
                this.f24411k1 = 1.0f / f10;
            }
        } else {
            this.f24410j1 = yvVar.f27123t;
        }
        this.I0.a(yvVar.f27122s);
    }

    @Override // com.yandex.mobile.ads.impl.kb0
    public final void a(Exception exc) {
        p90.a("MediaCodecVideoRenderer", "Video codec error", exc);
        this.J0.b(exc);
    }

    @Override // com.yandex.mobile.ads.impl.kb0
    public final void a(String str) {
        this.J0.a(str);
    }

    @Override // com.yandex.mobile.ads.impl.kb0
    public final void a(String str, long j10, long j11) {
        boolean z10;
        this.J0.a(str, j10, j11);
        if (str.startsWith(f24397q1.c1())) {
            z10 = false;
        } else {
            synchronized (qb0.class) {
                if (!f24399s1) {
                    f24400t1 = U();
                    f24399s1 = true;
                }
            }
            z10 = f24400t1;
        }
        this.O0 = z10;
        ib0 ib0VarD = D();
        Objects.requireNonNull(ib0VarD);
        this.P0 = ib0VarD.a();
        if (da1.f19803a < 23 || !this.f24413m1) {
            return;
        }
        eb0 eb0VarC = C();
        Objects.requireNonNull(eb0VarC);
        this.f24415o1 = new b(eb0VarC);
    }

    @Override // com.yandex.mobile.ads.impl.kb0, com.yandex.mobile.ads.impl.me
    public final void a(boolean z10, boolean z11) throws ns {
        super.a(z10, z11);
        boolean z12 = p().f24877a;
        pa.b((z12 && this.f24414n1 == 0) ? false : true);
        if (this.f24413m1 != z12) {
            this.f24413m1 = z12;
            L();
        }
        this.J0.b(this.B0);
        this.V0 = z11;
        this.W0 = false;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0134  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v30 */
    @Override // com.yandex.mobile.ads.impl.kb0
    public final boolean a(long j10, long j11, eb0 eb0Var, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, yv yvVar) throws ns {
        boolean z12;
        int i13;
        int i14;
        boolean z13;
        int i15;
        ?? r10;
        Objects.requireNonNull(eb0Var);
        if (this.X0 == -9223372036854775807L) {
            this.X0 = j10;
        }
        if (j12 != this.f24404d1) {
            this.I0.b(j12);
            this.f24404d1 = j12;
        }
        long jG = G();
        long j13 = j12 - jG;
        if (z10 && !z11) {
            d71.a("skipVideoBuffer");
            eb0Var.a(false, i10);
            d71.a();
            this.B0.f26883f++;
            return true;
        }
        double dH = H();
        boolean z14 = c() == 2;
        long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j14 = (long) ((j12 - j10) / dH);
        if (z14) {
            j14 -= jElapsedRealtime - j11;
        }
        if (this.Q0 == this.R0) {
            if (!(j14 < -30000)) {
                return false;
            }
            d71.a("skipVideoBuffer");
            eb0Var.a(false, i10);
            d71.a();
            this.B0.f26883f++;
            f(j14);
            return true;
        }
        long j15 = jElapsedRealtime - this.f24405e1;
        boolean z15 = this.W0 ? !this.U0 : z14 || this.V0;
        if (this.Y0 != -9223372036854775807L || j10 < jG) {
            z12 = false;
        } else {
            if (!z15) {
                if (z14) {
                    if (((j14 > (-30000L) ? 1 : (j14 == (-30000L) ? 0 : -1)) < 0) && j15 > 100000) {
                    }
                }
                z12 = false;
            }
            z12 = true;
        }
        if (z12) {
            long jNanoTime = System.nanoTime();
            xe1 xe1Var = this.f24416p1;
            if (xe1Var != null) {
                i15 = 0;
                r10 = 1;
                xe1Var.a(j13, jNanoTime, yvVar, F());
            } else {
                i15 = 0;
                r10 = 1;
            }
            int i16 = da1.f19803a;
            V();
            d71.a("releaseOutputBuffer");
            if (i16 >= 21) {
                eb0Var.a(i10, jNanoTime);
                d71.a();
                this.f24405e1 = SystemClock.elapsedRealtime() * 1000;
                this.B0.f26882e += r10;
                this.f24402b1 = i15;
                this.W0 = r10;
                if (!this.U0) {
                    this.U0 = r10;
                    this.J0.a(this.Q0);
                    this.S0 = r10;
                }
            } else {
                eb0Var.a((boolean) r10, i10);
                d71.a();
                this.f24405e1 = SystemClock.elapsedRealtime() * 1000;
                this.B0.f26882e += r10;
                this.f24402b1 = i15;
                this.W0 = r10;
                if (!this.U0) {
                    this.U0 = r10;
                    this.J0.a(this.Q0);
                    this.S0 = r10;
                }
            }
            f(j14);
            return r10;
        }
        boolean z16 = false;
        if (!z14 || j10 == this.X0) {
            return false;
        }
        long jNanoTime2 = System.nanoTime();
        long jA = this.I0.a((j14 * 1000) + jNanoTime2);
        long j16 = (jA - jNanoTime2) / 1000;
        boolean z17 = this.Y0 != -9223372036854775807L;
        if (((j16 > (-500000L) ? 1 : (j16 == (-500000L) ? 0 : -1)) < 0) && !z11) {
            int iB = b(j10);
            if (iB == 0) {
                jA = jA;
                z13 = false;
            } else {
                ym ymVar = this.B0;
                if (z17) {
                    ymVar.f26881d += iB;
                    ymVar.f26883f += this.f24403c1;
                } else {
                    ymVar.f26887j++;
                    int i17 = this.f24403c1;
                    ymVar.f26885h += iB;
                    int i18 = iB + i17;
                    ymVar.f26884g += i18;
                    this.f24401a1 += i18;
                    int i19 = this.f24402b1 + i18;
                    this.f24402b1 = i19;
                    ymVar.f26886i = Math.max(i19, ymVar.f26886i);
                    int i20 = this.L0;
                    if (i20 > 0 && (i14 = this.f24401a1) >= i20 && i14 > 0) {
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                        this.J0.a(this.f24401a1, jElapsedRealtime2 - this.Z0);
                        z13 = false;
                        this.f24401a1 = 0;
                        this.Z0 = jElapsedRealtime2;
                    }
                    A();
                    z16 = true;
                }
                z13 = false;
                A();
                z16 = true;
            }
            if (z16) {
                return z13;
            }
        } else {
            jA = jA;
        }
        if (((j16 > (-30000L) ? 1 : (j16 == (-30000L) ? 0 : -1)) < 0) && !z11) {
            if (z17) {
                d71.a("skipVideoBuffer");
                eb0Var.a(false, i10);
                d71.a();
                this.B0.f26883f++;
            } else {
                d71.a("dropVideoBuffer");
                eb0Var.a(false, i10);
                d71.a();
                ym ymVar2 = this.B0;
                ymVar2.f26885h += 0;
                ymVar2.f26884g++;
                this.f24401a1++;
                int i21 = this.f24402b1 + 1;
                this.f24402b1 = i21;
                ymVar2.f26886i = Math.max(i21, ymVar2.f26886i);
                int i22 = this.L0;
                if (i22 > 0 && (i13 = this.f24401a1) >= i22 && i13 > 0) {
                    long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                    this.J0.a(this.f24401a1, jElapsedRealtime3 - this.Z0);
                    this.f24401a1 = 0;
                    this.Z0 = jElapsedRealtime3;
                }
            }
            f(j16);
            return true;
        }
        if (da1.f19803a >= 21) {
            if (j16 >= 50000) {
                return false;
            }
            xe1 xe1Var2 = this.f24416p1;
            if (xe1Var2 != null) {
                xe1Var2.a(j13, jA, yvVar, F());
            }
            V();
            d71.a("releaseOutputBuffer");
            eb0Var.a(i10, jA);
            d71.a();
            this.f24405e1 = SystemClock.elapsedRealtime() * 1000;
            this.B0.f26882e++;
            this.f24402b1 = 0;
            this.W0 = true;
            if (!this.U0) {
                this.U0 = true;
                this.J0.a(this.Q0);
                this.S0 = true;
            }
            f(j16);
            return true;
        }
        long j17 = jA;
        if (j16 >= 30000) {
            return false;
        }
        if (j16 > 11000) {
            try {
                Thread.sleep((j16 - AbstractComponentTracker.LINGERING_TIMEOUT) / 1000);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return false;
            }
        }
        xe1 xe1Var3 = this.f24416p1;
        if (xe1Var3 != null) {
            xe1Var3.a(j13, j17, yvVar, F());
        }
        V();
        d71.a("releaseOutputBuffer");
        eb0Var.a(true, i10);
        d71.a();
        this.f24405e1 = SystemClock.elapsedRealtime() * 1000;
        this.B0.f26882e++;
        this.f24402b1 = 0;
        this.W0 = true;
        if (!this.U0) {
            this.U0 = true;
            this.J0.a(this.Q0);
            this.S0 = true;
        }
        f(j16);
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.kb0
    public final boolean a(ib0 ib0Var) {
        return this.Q0 != null || b(ib0Var);
    }

    @Override // com.yandex.mobile.ads.impl.kb0
    public final void b(an anVar) throws ns {
        boolean z10 = this.f24413m1;
        if (!z10) {
            this.f24403c1++;
        }
        if (da1.f19803a >= 23 || !z10) {
            return;
        }
        e(anVar.f19006e);
    }

    @Override // com.yandex.mobile.ads.impl.kb0
    public final void c(long j10) {
        super.c(j10);
        if (this.f24413m1) {
            return;
        }
        this.f24403c1--;
    }

    @Override // com.yandex.mobile.ads.impl.kb0, com.yandex.mobile.ads.impl.pv0
    public final boolean d() {
        PlaceholderSurface placeholderSurface;
        if (super.d() && (this.U0 || (((placeholderSurface = this.R0) != null && this.Q0 == placeholderSurface) || C() == null || this.f24413m1))) {
            this.Y0 = -9223372036854775807L;
            return true;
        }
        if (this.Y0 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.Y0) {
            return true;
        }
        this.Y0 = -9223372036854775807L;
        return false;
    }

    public final void e(long j10) throws ns {
        d(j10);
        V();
        this.B0.f26882e++;
        this.W0 = true;
        if (!this.U0) {
            this.U0 = true;
            this.J0.a(this.Q0);
            this.S0 = true;
        }
        c(j10);
    }

    public final void f(long j10) {
        ym ymVar = this.B0;
        ymVar.f26888k += j10;
        ymVar.f26889l++;
        this.f24406f1 += j10;
        this.f24407g1++;
    }

    @Override // com.yandex.mobile.ads.impl.pv0, com.yandex.mobile.ads.impl.qv0
    public final String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.yandex.mobile.ads.impl.kb0, com.yandex.mobile.ads.impl.me
    public final void u() {
        this.f24412l1 = null;
        R();
        this.S0 = false;
        this.f24415o1 = null;
        try {
            super.u();
        } finally {
            this.J0.a(this.B0);
        }
    }

    @Override // com.yandex.mobile.ads.impl.kb0, com.yandex.mobile.ads.impl.me
    @TargetApi(17)
    public final void v() {
        PlaceholderSurface placeholderSurface;
        try {
            super.v();
            placeholderSurface = this.R0;
            if (placeholderSurface != null) {
                if (this.Q0 == placeholderSurface) {
                    this.Q0 = null;
                }
            }
        } finally {
            if (this.R0 != null) {
                Surface surface = this.Q0;
                placeholderSurface = this.R0;
                if (surface == placeholderSurface) {
                    this.Q0 = null;
                }
                placeholderSurface.release();
                this.R0 = null;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.me
    public final void w() {
        this.f24401a1 = 0;
        this.Z0 = SystemClock.elapsedRealtime();
        this.f24405e1 = SystemClock.elapsedRealtime() * 1000;
        this.f24406f1 = 0L;
        this.f24407g1 = 0;
        this.I0.b();
    }

    @Override // com.yandex.mobile.ads.impl.me
    public final void x() {
        this.Y0 = -9223372036854775807L;
        if (this.f24401a1 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.J0.a(this.f24401a1, jElapsedRealtime - this.Z0);
            this.f24401a1 = 0;
            this.Z0 = jElapsedRealtime;
        }
        int i10 = this.f24407g1;
        if (i10 != 0) {
            this.J0.c(i10, this.f24406f1);
            this.f24406f1 = 0L;
            this.f24407g1 = 0;
        }
        this.I0.c();
    }
}
