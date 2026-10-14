package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.os.Handler;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.exo.metadata.icy.IcyHeaders;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes3.dex */
final class gt0 implements hc0, wt, x80.a<a>, x80.e, ez0.c {
    private static final Map<String, String> N;
    private static final yv O;
    private boolean B;
    private boolean D;
    private boolean E;
    private int F;
    private boolean G;
    private long H;
    private boolean J;
    private int K;
    private boolean L;
    private boolean M;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Uri f21169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final lm f21170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.yandex.mobile.ads.exo.drm.g f21171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final u80 f21172e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final oc0.a f21173f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.yandex.mobile.ads.exo.drm.f.a f21174g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final b f21175h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final u8 f21176i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f21177j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f21178k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ft0 f21180m;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private hc0.a f21185r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private IcyHeaders f21186s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f21189v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f21190w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f21191x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private e f21192y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private p01 f21193z;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final x80 f21179l = new x80("ProgressiveMediaPeriod");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final gk f21181n = new gk();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Runnable f21182o = new co1(this, 1);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Runnable f21183p = new co1(this, 2);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Handler f21184q = da1.a();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private d[] f21188u = new d[0];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ez0[] f21187t = new ez0[0];
    private long I = -9223372036854775807L;
    private long A = -9223372036854775807L;
    private int C = 1;

    public final class a implements x80.d, l10.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Uri f21195b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final o41 f21196c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ft0 f21197d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final wt f21198e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final gk f21199f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private volatile boolean f21201h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f21203j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private ez0 f21205l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f21206m;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final cs0 f21200g = new cs0();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f21202i = true;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f21194a = v80.a();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private pm f21204k = a(0);

        public a(Uri uri, lm lmVar, ft0 ft0Var, wt wtVar, gk gkVar) {
            this.f21195b = uri;
            this.f21196c = new o41(lmVar);
            this.f21197d = ft0Var;
            this.f21198e = wtVar;
            this.f21199f = gkVar;
        }

        private pm a(long j10) {
            return new pm.a().a(this.f21195b).b(j10).a(gt0.this.f21177j).a(6).a(gt0.N).a();
        }

        public static void a(a aVar, long j10, long j11) {
            aVar.f21200g.f19623a = j10;
            aVar.f21203j = j11;
            aVar.f21202i = true;
            aVar.f21206m = false;
        }

        @Override // com.yandex.mobile.ads.impl.x80.d
        public final void a() throws IOException {
            int iA = 0;
            while (iA == 0 && !this.f21201h) {
                try {
                    long j10 = this.f21200g.f19623a;
                    pm pmVarA = a(j10);
                    this.f21204k = pmVarA;
                    long jA = this.f21196c.a(pmVarA);
                    if (jA != -1) {
                        jA += j10;
                        gt0.this.j();
                    }
                    long j11 = jA;
                    gt0.this.f21186s = IcyHeaders.a(this.f21196c.b());
                    lm l10Var = this.f21196c;
                    if (gt0.this.f21186s != null && gt0.this.f21186s.f18556f != -1) {
                        l10Var = new l10(this.f21196c, gt0.this.f21186s.f18556f, this);
                        ez0 ez0VarF = gt0.this.f();
                        this.f21205l = ez0VarF;
                        ez0VarF.a(gt0.O);
                    }
                    long jB = j10;
                    ((yf) this.f21197d).a(l10Var, this.f21195b, this.f21196c.b(), j10, j11, this.f21198e);
                    if (gt0.this.f21186s != null) {
                        ((yf) this.f21197d).a();
                    }
                    if (this.f21202i) {
                        ((yf) this.f21197d).a(jB, this.f21203j);
                        this.f21202i = false;
                    }
                    while (true) {
                        long j12 = jB;
                        while (true) {
                            if (iA != 0 || this.f21201h) {
                                break;
                            }
                            try {
                                this.f21199f.a();
                                iA = ((yf) this.f21197d).a(this.f21200g);
                                jB = ((yf) this.f21197d).b();
                                if (jB > gt0.this.f21178k + j12) {
                                    this.f21199f.c();
                                    gt0.this.f21184q.post(gt0.this.f21183p);
                                }
                            } catch (InterruptedException unused) {
                                throw new InterruptedIOException();
                            }
                        }
                    }
                    if (iA == 1) {
                        iA = 0;
                    } else if (((yf) this.f21197d).b() != -1) {
                        this.f21200g.f19623a = ((yf) this.f21197d).b();
                    }
                    om.a(this.f21196c);
                } catch (Throwable th) {
                    if (iA != 1 && ((yf) this.f21197d).b() != -1) {
                        this.f21200g.f19623a = ((yf) this.f21197d).b();
                    }
                    om.a(this.f21196c);
                    throw th;
                }
            }
        }

        public final void a(mp0 mp0Var) {
            long jMax = !this.f21206m ? this.f21203j : Math.max(gt0.c(gt0.this), this.f21203j);
            int iA = mp0Var.a();
            ez0 ez0Var = this.f21205l;
            Objects.requireNonNull(ez0Var);
            ez0Var.b(iA, mp0Var);
            ez0Var.a(jMax, 1, iA, 0, null);
            this.f21206m = true;
        }

        @Override // com.yandex.mobile.ads.impl.x80.d
        public final void b() {
            this.f21201h = true;
        }
    }

    public interface b {
    }

    public final class c implements fz0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f21208a;

        public c(int i10) {
            this.f21208a = i10;
        }

        @Override // com.yandex.mobile.ads.impl.fz0
        public final int a(long j10) {
            return gt0.this.a(this.f21208a, j10);
        }

        @Override // com.yandex.mobile.ads.impl.fz0
        public final int a(zv zvVar, an anVar, int i10) {
            return gt0.this.a(this.f21208a, zvVar, anVar, i10);
        }

        @Override // com.yandex.mobile.ads.impl.fz0
        public final void a() throws IOException {
            gt0.this.c(this.f21208a);
        }

        @Override // com.yandex.mobile.ads.impl.fz0
        public final boolean d() {
            return gt0.this.a(this.f21208a);
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f21210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f21211b;

        public d(boolean z10, int i10) {
            this.f21210a = i10;
            this.f21211b = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f21210a == dVar.f21210a && this.f21211b == dVar.f21211b;
        }

        public final int hashCode() {
            return (this.f21210a * 31) + (this.f21211b ? 1 : 0);
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i71 f21212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean[] f21213b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean[] f21214c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean[] f21215d;

        public e(i71 i71Var, boolean[] zArr) {
            this.f21212a = i71Var;
            this.f21213b = zArr;
            int i10 = i71Var.f21619a;
            this.f21214c = new boolean[i10];
            this.f21215d = new boolean[i10];
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        N = Collections.unmodifiableMap(map);
        O = new yv.a().c("icy").f("application/x-icy").a();
    }

    public gt0(Uri uri, lm lmVar, ft0 ft0Var, com.yandex.mobile.ads.exo.drm.g gVar, com.yandex.mobile.ads.exo.drm.f.a aVar, u80 u80Var, oc0.a aVar2, b bVar, u8 u8Var, String str, int i10) {
        this.f21169b = uri;
        this.f21170c = lmVar;
        this.f21171d = gVar;
        this.f21174g = aVar;
        this.f21172e = u80Var;
        this.f21173f = aVar2;
        this.f21175h = bVar;
        this.f21176i = u8Var;
        this.f21177j = str;
        this.f21178k = i10;
        this.f21180m = ft0Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    private long a(boolean z10) {
        long jMax = Long.MIN_VALUE;
        for (int i10 = 0; i10 < this.f21187t.length; i10++) {
            if (z10) {
                jMax = Math.max(jMax, this.f21187t[i10].b());
            } else {
                e eVar = this.f21192y;
                Objects.requireNonNull(eVar);
                if (eVar.f21214c[i10]) {
                    jMax = Math.max(jMax, this.f21187t[i10].b());
                }
            }
        }
        return jMax;
    }

    private ez0 a(d dVar) {
        int length = this.f21187t.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (dVar.equals(this.f21188u[i10])) {
                return this.f21187t[i10];
            }
        }
        u8 u8Var = this.f21176i;
        com.yandex.mobile.ads.exo.drm.g gVar = this.f21171d;
        com.yandex.mobile.ads.exo.drm.f.a aVar = this.f21174g;
        Objects.requireNonNull(gVar);
        Objects.requireNonNull(aVar);
        ez0 ez0Var = new ez0(u8Var, gVar, aVar);
        ez0Var.a(this);
        int i11 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.f21188u, i11);
        dVarArr[length] = dVar;
        int i12 = da1.f19803a;
        this.f21188u = dVarArr;
        ez0[] ez0VarArr = (ez0[]) Arrays.copyOf(this.f21187t, i11);
        ez0VarArr[length] = ez0Var;
        this.f21187t = ez0VarArr;
        return ez0Var;
    }

    private void b(int i10) {
        e();
        boolean[] zArr = this.f21192y.f21213b;
        if (this.J && zArr[i10] && !this.f21187t[i10].a(false)) {
            this.I = 0L;
            this.J = false;
            this.E = true;
            this.H = 0L;
            this.K = 0;
            for (ez0 ez0Var : this.f21187t) {
                ez0Var.b(false);
            }
            hc0.a aVar = this.f21185r;
            Objects.requireNonNull(aVar);
            aVar.a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(p01 p01Var) {
        this.f21193z = this.f21186s == null ? p01Var : new p01.b(-9223372036854775807L, 0L);
        this.A = p01Var.c();
        boolean z10 = !this.G && p01Var.c() == -9223372036854775807L;
        this.B = z10;
        this.C = z10 ? 7 : 1;
        ((it0) this.f21175h).a(this.A, p01Var.b(), this.B);
        if (this.f21190w) {
            return;
        }
        i();
    }

    public static /* synthetic */ long c(gt0 gt0Var) {
        return gt0Var.a(true);
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    private void e() {
        pa.b(this.f21190w);
        Objects.requireNonNull(this.f21192y);
        Objects.requireNonNull(this.f21193z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.M) {
            return;
        }
        hc0.a aVar = this.f21185r;
        Objects.requireNonNull(aVar);
        aVar.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        this.G = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.M || this.f21190w || !this.f21189v || this.f21193z == null) {
            return;
        }
        for (ez0 ez0Var : this.f21187t) {
            if (ez0Var.d() == null) {
                return;
            }
        }
        this.f21181n.c();
        int length = this.f21187t.length;
        h71[] h71VarArr = new h71[length];
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            yv yvVarD = this.f21187t[i10].d();
            Objects.requireNonNull(yvVarD);
            String str = yvVarD.f27115l;
            boolean zB = te0.b(str);
            boolean z10 = zB || te0.d(str);
            zArr[i10] = z10;
            this.f21191x = z10 | this.f21191x;
            IcyHeaders icyHeaders = this.f21186s;
            if (icyHeaders != null) {
                if (zB || this.f21188u[i10].f21211b) {
                    Metadata metadata = yvVarD.f27113j;
                    yvVarD = yvVarD.a().a(metadata == null ? new Metadata(icyHeaders) : metadata.a(icyHeaders)).a();
                }
                if (zB && yvVarD.f27109f == -1 && yvVarD.f27110g == -1 && icyHeaders.f18551a != -1) {
                    yvVarD = yvVarD.a().b(icyHeaders.f18551a).a();
                }
            }
            h71VarArr[i10] = new h71(Integer.toString(i10), yvVarD.a().d(this.f21171d.a(yvVarD)).a());
        }
        this.f21192y = new e(new i71(h71VarArr), zArr);
        this.f21190w = true;
        hc0.a aVar = this.f21185r;
        Objects.requireNonNull(aVar);
        aVar.a((hc0) this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.f21184q.post(new co1(this, 0));
    }

    private void m() {
        a aVar = new a(this.f21169b, this.f21170c, this.f21180m, this, this.f21181n);
        if (this.f21190w) {
            pa.b(this.I != -9223372036854775807L);
            long j10 = this.A;
            if (j10 != -9223372036854775807L && this.I > j10) {
                this.L = true;
                this.I = -9223372036854775807L;
                return;
            }
            p01 p01Var = this.f21193z;
            Objects.requireNonNull(p01Var);
            a.a(aVar, p01Var.b(this.I).f23940a.f24584b, this.I);
            for (ez0 ez0Var : this.f21187t) {
                ez0Var.a(this.I);
            }
            this.I = -9223372036854775807L;
        }
        int iE = 0;
        for (ez0 ez0Var2 : this.f21187t) {
            iE += ez0Var2.e();
        }
        this.K = iE;
        this.f21173f.b(new v80(aVar.f21194a, aVar.f21204k, this.f21179l.a(aVar, this, this.f21172e.a(this.C))), null, aVar.f21203j, this.A);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0019  */
    public final int a(int i10, long j10) {
        boolean z10;
        if (this.E) {
            z10 = true;
        } else {
            if (this.I != -9223372036854775807L) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (z10) {
            return 0;
        }
        e();
        e eVar = this.f21192y;
        boolean[] zArr = eVar.f21215d;
        if (!zArr[i10]) {
            yv yvVarA = eVar.f21212a.a(i10).a(0);
            this.f21173f.a(te0.a(yvVarA.f27115l), yvVarA, this.H);
            zArr[i10] = true;
        }
        ez0 ez0Var = this.f21187t[i10];
        int iA = ez0Var.a(j10, this.L);
        ez0Var.d(iA);
        if (iA == 0) {
            b(i10);
        }
        return iA;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0019  */
    public final int a(int i10, zv zvVar, an anVar, int i11) {
        boolean z10;
        if (this.E) {
            z10 = true;
        } else {
            if (this.I != -9223372036854775807L) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (z10) {
            return -3;
        }
        e();
        e eVar = this.f21192y;
        boolean[] zArr = eVar.f21215d;
        if (!zArr[i10]) {
            yv yvVarA = eVar.f21212a.a(i10).a(0);
            this.f21173f.a(te0.a(yvVarA.f27115l), yvVarA, this.H);
            zArr[i10] = true;
        }
        int iA = this.f21187t[i10].a(zvVar, anVar, i11, this.L);
        if (iA == -3) {
            b(i10);
        }
        return iA;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x007f, code lost:
    
        if (java.lang.Math.abs(r7 - r20) <= java.lang.Math.abs(r9 - r20)) goto L36;
     */
    @Override // com.yandex.mobile.ads.impl.hc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(long r20, com.yandex.mobile.ads.impl.q01 r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r3 = r22
            r19.e()
            com.yandex.mobile.ads.impl.p01 r4 = r0.f21193z
            boolean r4 = r4.b()
            r5 = 0
            if (r4 != 0) goto L14
            return r5
        L14:
            com.yandex.mobile.ads.impl.p01 r4 = r0.f21193z
            com.yandex.mobile.ads.impl.p01$a r4 = r4.b(r1)
            com.yandex.mobile.ads.impl.r01 r7 = r4.f23940a
            long r7 = r7.f24583a
            com.yandex.mobile.ads.impl.r01 r4 = r4.f23941b
            long r9 = r4.f24583a
            long r11 = r3.f24289a
            int r4 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r4 != 0) goto L31
            long r13 = r3.f24290b
            int r4 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r4 != 0) goto L31
            r13 = r1
            goto L89
        L31:
            r13 = -9223372036854775808
            int r4 = com.yandex.mobile.ads.impl.da1.f19803a
            long r15 = r1 - r11
            long r11 = r11 ^ r1
            long r17 = r1 ^ r15
            long r11 = r11 & r17
            int r4 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r4 >= 0) goto L41
            goto L42
        L41:
            r13 = r15
        L42:
            long r3 = r3.f24290b
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r15 = r1 + r3
            long r17 = r1 ^ r15
            long r3 = r3 ^ r15
            long r3 = r17 & r3
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L55
            goto L56
        L55:
            r11 = r15
        L56:
            int r3 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            r4 = 1
            r5 = 0
            if (r3 > 0) goto L62
            int r3 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r3 > 0) goto L62
            r3 = r4
            goto L63
        L62:
            r3 = r5
        L63:
            int r6 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r6 > 0) goto L6c
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 > 0) goto L6c
            goto L6d
        L6c:
            r4 = r5
        L6d:
            if (r3 == 0) goto L82
            if (r4 == 0) goto L82
            long r3 = r7 - r1
            long r3 = java.lang.Math.abs(r3)
            long r1 = r9 - r1
            long r1 = java.lang.Math.abs(r1)
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 > 0) goto L88
            goto L84
        L82:
            if (r3 == 0) goto L86
        L84:
            r13 = r7
            goto L89
        L86:
            if (r4 == 0) goto L89
        L88:
            r13 = r9
        L89:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.gt0.a(long, com.yandex.mobile.ads.impl.q01):long");
    }

    @Override // com.yandex.mobile.ads.impl.hc0
    public final long a(et[] etVarArr, boolean[] zArr, fz0[] fz0VarArr, boolean[] zArr2, long j10) {
        et etVar;
        e();
        e eVar = this.f21192y;
        i71 i71Var = eVar.f21212a;
        boolean[] zArr3 = eVar.f21214c;
        int i10 = this.F;
        int i11 = 0;
        for (int i12 = 0; i12 < etVarArr.length; i12++) {
            fz0 fz0Var = fz0VarArr[i12];
            if (fz0Var != null && (etVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((c) fz0Var).f21208a;
                pa.b(zArr3[i13]);
                this.F--;
                zArr3[i13] = false;
                fz0VarArr[i12] = null;
            }
        }
        boolean z10 = !this.D ? j10 == 0 : i10 != 0;
        for (int i14 = 0; i14 < etVarArr.length; i14++) {
            if (fz0VarArr[i14] == null && (etVar = etVarArr[i14]) != null) {
                pa.b(etVar.length() == 1);
                pa.b(etVar.b(0) == 0);
                int iA = i71Var.a(etVar.a());
                pa.b(!zArr3[iA]);
                this.F++;
                zArr3[iA] = true;
                fz0VarArr[i14] = new c(iA);
                zArr2[i14] = true;
                if (!z10) {
                    ez0 ez0Var = this.f21187t[iA];
                    z10 = (ez0Var.b(j10, true) || ez0Var.c() == 0) ? false : true;
                }
            }
        }
        if (this.F == 0) {
            this.J = false;
            this.E = false;
            if (this.f21179l.d()) {
                ez0[] ez0VarArr = this.f21187t;
                int length = ez0VarArr.length;
                while (i11 < length) {
                    ez0VarArr[i11].a();
                    i11++;
                }
                this.f21179l.a();
            } else {
                for (ez0 ez0Var2 : this.f21187t) {
                    ez0Var2.b(false);
                }
            }
        } else if (z10) {
            j10 = seekToUs(j10);
            while (i11 < fz0VarArr.length) {
                if (fz0VarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.D = true;
        return j10;
    }

    @Override // com.yandex.mobile.ads.impl.wt
    public final j71 a(int i10, int i11) {
        return a(new d(false, i10));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0081  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ab  */
    @Override // com.yandex.mobile.ads.impl.x80.a
    public final x80.b a(x80.d dVar, long j10, long j11, IOException iOException, int i10) {
        x80.b bVarA;
        p01 p01Var;
        boolean z10;
        a aVar = (a) dVar;
        o41 o41Var = aVar.f21196c;
        long unused = aVar.f21194a;
        pm unused2 = aVar.f21204k;
        Objects.requireNonNull(o41Var);
        v80 v80Var = new v80();
        da1.b(aVar.f21203j);
        da1.b(this.A);
        long jA = this.f21172e.a(new u80.a(iOException, i10));
        if (jA == -9223372036854775807L) {
            bVarA = x80.f26446e;
        } else {
            boolean z11 = false;
            int iE = 0;
            for (ez0 ez0Var : this.f21187t) {
                iE += ez0Var.e();
            }
            boolean z12 = iE > this.K;
            if (this.G || !((p01Var = this.f21193z) == null || p01Var.c() == -9223372036854775807L)) {
                this.K = iE;
            } else {
                boolean z13 = this.f21190w;
                if (z13) {
                    if (this.E) {
                        z10 = true;
                    } else if (this.I != -9223372036854775807L) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        this.J = true;
                    }
                    if (z11) {
                        bVarA = x80.a(jA, z12);
                    } else {
                        bVarA = x80.f26445d;
                    }
                }
                this.E = z13;
                this.H = 0L;
                this.K = 0;
                for (ez0 ez0Var2 : this.f21187t) {
                    ez0Var2.b(false);
                }
                a.a(aVar, 0L, 0L);
            }
            z11 = true;
            if (z11) {
                bVarA = x80.a(jA, z12);
            } else {
                bVarA = x80.f26445d;
            }
        }
        boolean z14 = !bVarA.a();
        this.f21173f.a(v80Var, 1, null, aVar.f21203j, this.A, iOException, z14);
        if (z14) {
            u80 u80Var = this.f21172e;
            long unused3 = aVar.f21194a;
            Objects.requireNonNull(u80Var);
        }
        return bVarA;
    }

    @Override // com.yandex.mobile.ads.impl.wt
    public final void a() {
        this.f21189v = true;
        this.f21184q.post(this.f21182o);
    }

    @Override // com.yandex.mobile.ads.impl.hc0
    public final void a(hc0.a aVar, long j10) {
        this.f21185r = aVar;
        this.f21181n.e();
        m();
    }

    @Override // com.yandex.mobile.ads.impl.wt
    public final void a(p01 p01Var) {
        this.f21184q.post(new do1(this, p01Var));
    }

    @Override // com.yandex.mobile.ads.impl.x80.a
    public final void a(x80.d dVar, long j10, long j11) {
        p01 p01Var;
        a aVar = (a) dVar;
        if (this.A == -9223372036854775807L && (p01Var = this.f21193z) != null) {
            boolean zB = p01Var.b();
            long jA = a(true);
            long j12 = jA == Long.MIN_VALUE ? 0L : jA + AbstractComponentTracker.LINGERING_TIMEOUT;
            this.A = j12;
            ((it0) this.f21175h).a(j12, zB, this.B);
        }
        o41 o41Var = aVar.f21196c;
        long unused = aVar.f21194a;
        pm unused2 = aVar.f21204k;
        Objects.requireNonNull(o41Var);
        v80 v80Var = new v80();
        u80 u80Var = this.f21172e;
        long unused3 = aVar.f21194a;
        Objects.requireNonNull(u80Var);
        this.f21173f.a(v80Var, (yv) null, aVar.f21203j, this.A);
        this.L = true;
        hc0.a aVar2 = this.f21185r;
        Objects.requireNonNull(aVar2);
        aVar2.a(this);
    }

    @Override // com.yandex.mobile.ads.impl.x80.a
    public final void a(x80.d dVar, long j10, long j11, boolean z10) {
        a aVar = (a) dVar;
        o41 o41Var = aVar.f21196c;
        long unused = aVar.f21194a;
        pm unused2 = aVar.f21204k;
        Objects.requireNonNull(o41Var);
        v80 v80Var = new v80();
        u80 u80Var = this.f21172e;
        long unused3 = aVar.f21194a;
        Objects.requireNonNull(u80Var);
        this.f21173f.a(v80Var, aVar.f21203j, this.A);
        if (z10) {
            return;
        }
        for (ez0 ez0Var : this.f21187t) {
            ez0Var.b(false);
        }
        if (this.F > 0) {
            hc0.a aVar2 = this.f21185r;
            Objects.requireNonNull(aVar2);
            aVar2.a(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0019  */
    public final boolean a(int i10) {
        boolean z10;
        if (this.E) {
            z10 = true;
        } else {
            if (this.I != -9223372036854775807L) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return !z10 && this.f21187t[i10].a(this.L);
    }

    @Override // com.yandex.mobile.ads.impl.x80.e
    public final void b() {
        for (ez0 ez0Var : this.f21187t) {
            ez0Var.i();
        }
        ((yf) this.f21180m).c();
    }

    public final void c(int i10) throws IOException {
        this.f21187t[i10].g();
        this.f21179l.a(this.f21172e.a(this.C));
    }

    @Override // com.yandex.mobile.ads.impl.hc0
    public final boolean continueLoading(long j10) {
        if (this.L || this.f21179l.c() || this.J) {
            return false;
        }
        if (this.f21190w && this.F == 0) {
            return false;
        }
        boolean zE = this.f21181n.e();
        if (this.f21179l.d()) {
            return zE;
        }
        m();
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.hc0
    public final void discardBuffer(long j10, boolean z10) {
        e();
        if (this.I != -9223372036854775807L) {
            return;
        }
        boolean[] zArr = this.f21192y.f21214c;
        int length = this.f21187t.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f21187t[i10].a(j10, z10, zArr[i10]);
        }
    }

    public final ez0 f() {
        return a(new d(true, 0));
    }

    @Override // com.yandex.mobile.ads.impl.hc0
    public final long getBufferedPositionUs() {
        long jA;
        e();
        if (this.L || this.F == 0) {
            return Long.MIN_VALUE;
        }
        long j10 = this.I;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        if (this.f21191x) {
            int length = this.f21187t.length;
            jA = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                e eVar = this.f21192y;
                if (eVar.f21213b[i10] && eVar.f21214c[i10] && !this.f21187t[i10].f()) {
                    jA = Math.min(jA, this.f21187t[i10].b());
                }
            }
        } else {
            jA = Long.MAX_VALUE;
        }
        if (jA == RecyclerView.FOREVER_NS) {
            jA = a(false);
        }
        return jA == Long.MIN_VALUE ? this.H : jA;
    }

    @Override // com.yandex.mobile.ads.impl.hc0
    public final long getNextLoadPositionUs() {
        return getBufferedPositionUs();
    }

    @Override // com.yandex.mobile.ads.impl.hc0
    public final i71 getTrackGroups() {
        e();
        return this.f21192y.f21212a;
    }

    @Override // com.yandex.mobile.ads.impl.hc0
    public final boolean isLoading() {
        return this.f21179l.d() && this.f21181n.d();
    }

    public final void k() {
        this.f21184q.post(this.f21182o);
    }

    public final void l() {
        if (this.f21190w) {
            for (ez0 ez0Var : this.f21187t) {
                ez0Var.h();
            }
        }
        this.f21179l.a(this);
        this.f21184q.removeCallbacksAndMessages(null);
        this.f21185r = null;
        this.M = true;
    }

    @Override // com.yandex.mobile.ads.impl.hc0
    public final void maybeThrowPrepareError() throws IOException {
        this.f21179l.a(this.f21172e.a(this.C));
        if (this.L && !this.f21190w) {
            throw qp0.a("Loading finished before preparation is complete.", (Exception) null);
        }
    }

    @Override // com.yandex.mobile.ads.impl.hc0
    public final long readDiscontinuity() {
        if (!this.E) {
            return -9223372036854775807L;
        }
        if (!this.L) {
            int iE = 0;
            for (ez0 ez0Var : this.f21187t) {
                iE += ez0Var.e();
            }
            if (iE <= this.K) {
                return -9223372036854775807L;
            }
        }
        this.E = false;
        return this.H;
    }

    @Override // com.yandex.mobile.ads.impl.hc0
    public final void reevaluateBuffer(long j10) {
    }

    @Override // com.yandex.mobile.ads.impl.hc0
    public final long seekToUs(long j10) {
        e();
        boolean[] zArr = this.f21192y.f21213b;
        if (!this.f21193z.b()) {
            j10 = 0;
        }
        this.E = false;
        this.H = j10;
        boolean z10 = true;
        if (this.I != -9223372036854775807L) {
            this.I = j10;
            return j10;
        }
        if (this.C != 7) {
            int length = this.f21187t.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (!this.f21187t[i10].b(j10, false) && (zArr[i10] || !this.f21191x)) {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                return j10;
            }
        }
        this.J = false;
        this.I = j10;
        this.L = false;
        if (this.f21179l.d()) {
            for (ez0 ez0Var : this.f21187t) {
                ez0Var.a();
            }
            this.f21179l.a();
        } else {
            this.f21179l.b();
            for (ez0 ez0Var2 : this.f21187t) {
                ez0Var2.b(false);
            }
        }
        return j10;
    }
}
