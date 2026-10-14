package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
final class rs extends le implements os {
    private int A;
    private int B;
    private boolean C;
    private int D;
    private q01 E;
    private i11 F;
    private dr0.a G;
    private ec0 H;
    private AudioTrack I;
    private Object J;
    private Surface K;
    private TextureView L;
    private int M;
    private int N;
    private int O;
    private int P;
    private ub Q;
    private float R;
    private boolean S;
    private boolean T;
    private boolean U;
    private dp V;
    private ec0 W;
    private xq0 X;
    private int Y;
    private long Z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p71 f24840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dr0.a f24841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final gk f24842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final dr0 f24843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final pv0[] f24844f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final o71 f24845g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final my f24846h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ts f24847i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final r80<dr0.b> f24848j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final CopyOnWriteArraySet<os.a> f24849k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final v61.b f24850l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ArrayList f24851m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f24852n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final nc0.a f24853o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final w8 f24854p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Looper f24855q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ad f24856r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final q51 f24857s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final b f24858t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final vb f24859u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final yb f24860v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final u41 f24861w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final oi1 f24862x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final kj1 f24863y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final long f24864z;

    public static final class a {
        public static gr0 a(Context context, rs rsVar, boolean z10) {
            fc0 fc0VarA = fc0.a(context);
            if (fc0VarA == null) {
                p90.d("ExoPlayerImpl", "MediaMetricsService unavailable.");
                return new gr0(LogSessionId.LOG_SESSION_ID_NONE);
            }
            if (z10) {
                rsVar.a(fc0VarA);
            }
            return new gr0(fc0VarA.b());
        }
    }

    public final class b implements sf1, ac, j61, le0, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, w31.b, yb.b, vb.b, u41.a, os.a {
        private b() {
        }

        public /* synthetic */ b(rs rsVar, int i10) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(dr0.b bVar) {
            bVar.a(rs.this.H);
        }

        @Override // com.yandex.mobile.ads.impl.os.a
        public final void a() {
            rs.h(rs.this);
        }

        @Override // com.yandex.mobile.ads.impl.sf1
        public final void a(int i10, long j10) {
            rs.this.f24854p.a(i10, j10);
        }

        @Override // com.yandex.mobile.ads.impl.ac
        public final void a(int i10, long j10, long j11) {
            rs.this.f24854p.a(i10, j10, j11);
        }

        @Override // com.yandex.mobile.ads.impl.ac
        public final void a(long j10) {
            rs.this.f24854p.a(j10);
        }

        @Override // com.yandex.mobile.ads.impl.w31.b
        public final void a(Surface surface) {
            rs.this.a(surface);
        }

        @Override // com.yandex.mobile.ads.impl.le0
        public final void a(Metadata metadata) {
            rs rsVar = rs.this;
            ec0 ec0Var = rsVar.W;
            Objects.requireNonNull(ec0Var);
            int i10 = 0;
            ec0.a aVar = new ec0.a(ec0Var, i10);
            for (int i11 = 0; i11 < metadata.c(); i11++) {
                metadata.a(i11).a(aVar);
            }
            rsVar.W = new ec0(aVar, i10);
            ec0 ec0VarC = rs.c(rs.this);
            if (!ec0VarC.equals(rs.this.H)) {
                rs.this.H = ec0VarC;
                rs.this.f24848j.a(14, new ho1(this));
            }
            rs.this.f24848j.a(28, new ho1(metadata));
            rs.this.f24848j.a();
        }

        @Override // com.yandex.mobile.ads.impl.j61
        public final void a(cm cmVar) {
            Objects.requireNonNull(rs.this);
            r80 r80Var = rs.this.f24848j;
            r80Var.a(27, new ho1(cmVar));
            r80Var.a();
        }

        @Override // com.yandex.mobile.ads.impl.sf1
        public final void a(wf1 wf1Var) {
            Objects.requireNonNull(rs.this);
            r80 r80Var = rs.this.f24848j;
            r80Var.a(25, new ho1(wf1Var));
            r80Var.a();
        }

        @Override // com.yandex.mobile.ads.impl.ac
        public final void a(ym ymVar) {
            rs.this.f24854p.a(ymVar);
            Objects.requireNonNull(rs.this);
            Objects.requireNonNull(rs.this);
        }

        @Override // com.yandex.mobile.ads.impl.ac
        public final void a(yv yvVar, cn cnVar) {
            Objects.requireNonNull(rs.this);
            rs.this.f24854p.a(yvVar, cnVar);
        }

        @Override // com.yandex.mobile.ads.impl.ac
        public final void a(Exception exc) {
            rs.this.f24854p.a(exc);
        }

        @Override // com.yandex.mobile.ads.impl.sf1
        public final void a(Object obj, long j10) {
            rs.this.f24854p.a(obj, j10);
            if (rs.this.J == obj) {
                r80 r80Var = rs.this.f24848j;
                r80Var.a(26, yn1.B);
                r80Var.a();
            }
        }

        @Override // com.yandex.mobile.ads.impl.sf1
        public final void a(String str) {
            rs.this.f24854p.a(str);
        }

        @Override // com.yandex.mobile.ads.impl.sf1
        public final void a(String str, long j10, long j11) {
            rs.this.f24854p.a(str, j10, j11);
        }

        public final void a(final boolean z10, final int i10) {
            r80 r80Var = rs.this.f24848j;
            r80Var.a(30, new r80.a() { // from class: com.yandex.mobile.ads.impl.zp1
                @Override // com.yandex.mobile.ads.impl.r80.a
                public final void invoke(Object obj) {
                    dr0.b bVar = (dr0.b) obj;
                    bVar.a(z10, i10);
                }
            });
            r80Var.a();
        }

        @Override // com.yandex.mobile.ads.impl.w31.b
        public final void b() {
            rs.this.a((Surface) null);
        }

        @Override // com.yandex.mobile.ads.impl.sf1
        public final void b(int i10, long j10) {
            rs.this.f24854p.b(i10, j10);
        }

        @Override // com.yandex.mobile.ads.impl.ac
        public final void b(ym ymVar) {
            Objects.requireNonNull(rs.this);
            rs.this.f24854p.b(ymVar);
        }

        @Override // com.yandex.mobile.ads.impl.sf1
        public final void b(yv yvVar, cn cnVar) {
            Objects.requireNonNull(rs.this);
            rs.this.f24854p.b(yvVar, cnVar);
        }

        @Override // com.yandex.mobile.ads.impl.ac
        public final void b(Exception exc) {
            rs.this.f24854p.b(exc);
        }

        @Override // com.yandex.mobile.ads.impl.ac
        public final void b(String str) {
            rs.this.f24854p.b(str);
        }

        @Override // com.yandex.mobile.ads.impl.ac
        public final void b(String str, long j10, long j11) {
            rs.this.f24854p.b(str, j10, j11);
        }

        public final void c() {
            dp dpVarB = rs.b(rs.this.f24861w);
            if (dpVarB.equals(rs.this.V)) {
                return;
            }
            rs.this.V = dpVarB;
            r80 r80Var = rs.this.f24848j;
            r80Var.a(29, new ho1(dpVarB));
            r80Var.a();
        }

        @Override // com.yandex.mobile.ads.impl.sf1
        public final void c(ym ymVar) {
            rs.this.f24854p.c(ymVar);
            Objects.requireNonNull(rs.this);
            Objects.requireNonNull(rs.this);
        }

        @Override // com.yandex.mobile.ads.impl.sf1
        public final void c(Exception exc) {
            rs.this.f24854p.c(exc);
        }

        @Override // com.yandex.mobile.ads.impl.sf1
        public final void d(ym ymVar) {
            Objects.requireNonNull(rs.this);
            rs.this.f24854p.d(ymVar);
        }

        @Override // com.yandex.mobile.ads.impl.j61
        public final void onCues(List<am> list) {
            r80 r80Var = rs.this.f24848j;
            r80Var.a(27, new ho1(list));
            r80Var.a();
        }

        @Override // com.yandex.mobile.ads.impl.ac
        public final void onSkipSilenceEnabledChanged(final boolean z10) {
            if (rs.this.S == z10) {
                return;
            }
            rs.this.S = z10;
            r80 r80Var = rs.this.f24848j;
            r80Var.a(23, new r80.a() { // from class: com.yandex.mobile.ads.impl.aq1
                @Override // com.yandex.mobile.ads.impl.r80.a
                public final void invoke(Object obj) {
                    ((dr0.b) obj).onSkipSilenceEnabledChanged(z10);
                }
            });
            r80Var.a();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            rs.a(rs.this, surfaceTexture);
            rs.this.a(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            rs.this.a((Surface) null);
            rs.this.a(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            rs.this.a(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            rs.this.a(i11, i12);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            Objects.requireNonNull(rs.this);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            Objects.requireNonNull(rs.this);
            rs.this.a(0, 0);
        }
    }

    public static final class c implements xe1, eh, hr0.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private xe1 f24866b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private eh f24867c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private xe1 f24868d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private eh f24869e;

        private c() {
        }

        public /* synthetic */ c(int i10) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.hr0.b
        public final void a(int i10, Object obj) {
            eh ehVarA;
            if (i10 == 7) {
                this.f24866b = (xe1) obj;
                return;
            }
            if (i10 == 8) {
                this.f24867c = (eh) obj;
                return;
            }
            if (i10 != 10000) {
                return;
            }
            w31 w31Var = (w31) obj;
            if (w31Var == null) {
                ehVarA = null;
                this.f24868d = null;
            } else {
                this.f24868d = w31Var.b();
                ehVarA = w31Var.a();
            }
            this.f24869e = ehVarA;
        }

        @Override // com.yandex.mobile.ads.impl.xe1
        public final void a(long j10, long j11, yv yvVar, MediaFormat mediaFormat) {
            xe1 xe1Var = this.f24868d;
            if (xe1Var != null) {
                xe1Var.a(j10, j11, yvVar, mediaFormat);
            }
            xe1 xe1Var2 = this.f24866b;
            if (xe1Var2 != null) {
                xe1Var2.a(j10, j11, yvVar, mediaFormat);
            }
        }

        @Override // com.yandex.mobile.ads.impl.eh
        public final void a(long j10, float[] fArr) {
            eh ehVar = this.f24869e;
            if (ehVar != null) {
                ehVar.a(j10, fArr);
            }
            eh ehVar2 = this.f24867c;
            if (ehVar2 != null) {
                ehVar2.a(j10, fArr);
            }
        }

        @Override // com.yandex.mobile.ads.impl.eh
        public final void f() {
            eh ehVar = this.f24869e;
            if (ehVar != null) {
                ehVar.f();
            }
            eh ehVar2 = this.f24867c;
            if (ehVar2 != null) {
                ehVar2.f();
            }
        }
    }

    public static final class d implements pc0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f24870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private v61 f24871b;

        public d(v61 v61Var, Object obj) {
            this.f24870a = obj;
            this.f24871b = v61Var;
        }

        @Override // com.yandex.mobile.ads.impl.pc0
        public final Object a() {
            return this.f24870a;
        }

        @Override // com.yandex.mobile.ads.impl.pc0
        public final v61 b() {
            return this.f24871b;
        }
    }

    static {
        us.a("goog.exo.exoplayer");
    }

    @SuppressLint({"HandlerLeak"})
    public rs(os.b bVar) throws Throwable {
        rs rsVar = this;
        gk gkVar = new gk();
        rsVar.f24842d = gkVar;
        try {
            p90.c("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.18.1] [" + da1.f19807e + "]");
            Context applicationContext = bVar.f23875a.getApplicationContext();
            w8 w8VarApply = bVar.f23882h.apply(bVar.f23876b);
            rsVar.f24854p = w8VarApply;
            rsVar.Q = bVar.f23884j;
            rsVar.M = bVar.f23885k;
            int i10 = 0;
            rsVar.S = false;
            rsVar.f24864z = bVar.f23890p;
            b bVar2 = new b(rsVar, i10);
            rsVar.f24858t = bVar2;
            Object cVar = new c(i10);
            Handler handler = new Handler(bVar.f23883i);
            pv0[] pv0VarArrA = bVar.f23877c.get().a(handler, bVar2, bVar2, bVar2, bVar2);
            rsVar.f24844f = pv0VarArrA;
            int i11 = 1;
            pa.b(pv0VarArrA.length > 0);
            o71 o71Var = bVar.f23879e.get();
            rsVar.f24845g = o71Var;
            rsVar.f24853o = bVar.f23878d.get();
            ad adVar = bVar.f23881g.get();
            rsVar.f24856r = adVar;
            rsVar.f24852n = bVar.f23886l;
            rsVar.E = bVar.f23887m;
            Looper looper = bVar.f23883i;
            rsVar.f24855q = looper;
            q51 q51Var = bVar.f23876b;
            rsVar.f24857s = q51Var;
            rsVar.f24843e = rsVar;
            rsVar.f24848j = new r80<>(looper, q51Var, new yp1(rsVar, i11));
            rsVar.f24849k = new CopyOnWriteArraySet<>();
            rsVar.f24851m = new ArrayList();
            rsVar.F = new i11.a();
            p71 p71Var = new p71(new rv0[pv0VarArrA.length], new et[pv0VarArrA.length], e81.f20119b, null);
            rsVar.f24840b = p71Var;
            rsVar.f24850l = new v61.b();
            dr0.a aVarA = new dr0.a.C0205a().a(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28).a(o71Var.c(), 29).a();
            rsVar.f24841c = aVarA;
            rsVar.G = new dr0.a.C0205a().a(aVarA).a(4).a(10).a();
            rsVar.f24846h = q51Var.a(looper, null);
            yp1 yp1Var = new yp1(rsVar, 2);
            rsVar.X = xq0.a(p71Var);
            w8VarApply.a(rsVar, looper);
            int i12 = da1.f19803a;
            gr0 gr0Var = i12 < 31 ? new gr0() : a.a(applicationContext, rsVar, bVar.f23891q);
            t80 t80Var = bVar.f23880f.get();
            q01 q01Var = rsVar.E;
            try {
                rsVar = this;
                rsVar.f24847i = new ts(pv0VarArrA, o71Var, p71Var, t80Var, adVar, 0, w8VarApply, q01Var, bVar.f23888n, bVar.f23889o, false, looper, q51Var, yp1Var, gr0Var);
                rsVar.R = 1.0f;
                ec0 ec0Var = ec0.G;
                rsVar.H = ec0Var;
                rsVar.W = ec0Var;
                rsVar.Y = -1;
                rsVar.P = i12 < 21 ? f() : da1.a(applicationContext);
                int i13 = cm.f19552a;
                rsVar.T = true;
                rsVar.b(w8VarApply);
                adVar.a(new Handler(looper), w8VarApply);
                rsVar.a(bVar2);
                vb vbVar = new vb(bVar.f23875a, handler, bVar2);
                rsVar.f24859u = vbVar;
                vbVar.a();
                yb ybVar = new yb(bVar.f23875a, handler, bVar2);
                rsVar.f24860v = ybVar;
                ybVar.d();
                u41 u41Var = new u41(bVar.f23875a, handler, bVar2);
                rsVar.f24861w = u41Var;
                u41Var.a(da1.c(rsVar.Q.f25582c));
                oi1 oi1Var = new oi1(bVar.f23875a);
                rsVar.f24862x = oi1Var;
                oi1Var.a();
                kj1 kj1Var = new kj1(bVar.f23875a);
                rsVar.f24863y = kj1Var;
                kj1Var.a();
                rsVar.V = b(u41Var);
                int i14 = wf1.f26268e;
                o71Var.a(rsVar.Q);
                rsVar.a(1, 10, Integer.valueOf(rsVar.P));
                rsVar.a(2, 10, Integer.valueOf(rsVar.P));
                rsVar.a(1, 3, rsVar.Q);
                rsVar.a(2, 4, Integer.valueOf(rsVar.M));
                rsVar.a(2, 5, (Object) 0);
                rsVar.a(1, 9, Boolean.valueOf(rsVar.S));
                rsVar.a(2, 7, cVar);
                rsVar.a(6, 8, cVar);
                gkVar.e();
            } catch (Throwable th) {
                th = th;
                rsVar = this;
                rsVar.f24842d.e();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static int a(boolean z10, int i10) {
        return (!z10 || i10 == 1) ? 1 : 2;
    }

    private static long a(xq0 xq0Var) {
        v61.d dVar = new v61.d();
        v61.b bVar = new v61.b();
        xq0Var.f26589a.a(xq0Var.f26590b.f22012a, bVar);
        long j10 = xq0Var.f26591c;
        return j10 == -9223372036854775807L ? xq0Var.f26589a.a(bVar.f25848c, dVar, 0L).f25873m : bVar.f25850e + j10;
    }

    private Pair<Object, Long> a(v61 v61Var, int i10, long j10) {
        if (v61Var.c()) {
            this.Y = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.Z = j10;
            return null;
        }
        if (i10 == -1 || i10 >= v61Var.b()) {
            i10 = v61Var.a(false);
            j10 = da1.b(v61Var.a(i10, this.f22696a, 0L).f25873m);
        }
        return v61Var.a(this.f22696a, this.f24850l, i10, da1.a(j10));
    }

    private xq0 a(xq0 xq0Var, v61 v61Var, Pair<Object, Long> pair) {
        long jA;
        xq0 xq0VarA;
        pa.a(v61Var.c() || pair != null);
        v61 v61Var2 = xq0Var.f26589a;
        xq0 xq0VarA2 = xq0Var.a(v61Var);
        if (v61Var.c()) {
            nc0.b bVarA = xq0.a();
            long jA2 = da1.a(this.Z);
            xq0 xq0VarA3 = xq0VarA2.a(bVarA, jA2, jA2, jA2, 0L, i71.f21617d, this.f24840b, com.yandex.mobile.ads.embedded.guava.collect.p.i()).a(bVarA);
            xq0VarA3.f26604p = xq0VarA3.f26606r;
            return xq0VarA3;
        }
        Object obj = xq0VarA2.f26590b.f22012a;
        int i10 = da1.f19803a;
        boolean z10 = !obj.equals(pair.first);
        nc0.b bVar = z10 ? new nc0.b(pair.first) : xq0VarA2.f26590b;
        long jLongValue = ((Long) pair.second).longValue();
        long jA3 = da1.a(getContentPosition());
        if (!v61Var2.c()) {
            jA3 -= v61Var2.a(obj, this.f24850l).f25850e;
        }
        if (z10 || jLongValue < jA3) {
            pa.b(!bVar.a());
            xq0 xq0VarA4 = xq0VarA2.a(bVar, jLongValue, jLongValue, jLongValue, 0L, z10 ? i71.f21617d : xq0VarA2.f26596h, z10 ? this.f24840b : xq0VarA2.f26597i, z10 ? com.yandex.mobile.ads.embedded.guava.collect.p.i() : xq0VarA2.f26598j).a(bVar);
            xq0VarA4.f26604p = jLongValue;
            return xq0VarA4;
        }
        if (jLongValue == jA3) {
            int iA = v61Var.a(xq0VarA2.f26599k.f22012a);
            if (iA != -1 && v61Var.a(iA, this.f24850l, false).f25848c == v61Var.a(bVar.f22012a, this.f24850l).f25848c) {
                return xq0VarA2;
            }
            v61Var.a(bVar.f22012a, this.f24850l);
            jA = bVar.a() ? this.f24850l.a(bVar.f22013b, bVar.f22014c) : this.f24850l.f25849d;
            xq0VarA = xq0VarA2.a(bVar, xq0VarA2.f26606r, xq0VarA2.f26606r, xq0VarA2.f26592d, jA - xq0VarA2.f26606r, xq0VarA2.f26596h, xq0VarA2.f26597i, xq0VarA2.f26598j).a(bVar);
        } else {
            pa.b(!bVar.a());
            long jMax = Math.max(0L, xq0VarA2.f26605q - (jLongValue - jA3));
            jA = xq0VarA2.f26604p;
            if (xq0VarA2.f26599k.equals(xq0VarA2.f26590b)) {
                jA = jLongValue + jMax;
            }
            xq0VarA = xq0VarA2.a(bVar, jLongValue, jLongValue, jLongValue, jMax, xq0VarA2.f26596h, xq0VarA2.f26597i, xq0VarA2.f26598j);
        }
        xq0VarA.f26604p = jA;
        return xq0VarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i10, final int i11) {
        if (i10 == this.N && i11 == this.O) {
            return;
        }
        this.N = i10;
        this.O = i11;
        r80<dr0.b> r80Var = this.f24848j;
        r80Var.a(24, new r80.a() { // from class: com.yandex.mobile.ads.impl.xp1
            @Override // com.yandex.mobile.ads.impl.r80.a
            public final void invoke(Object obj) {
                ((dr0.b) obj).onSurfaceSizeChanged(i10, i11);
            }
        });
        r80Var.a();
    }

    private void a(int i10, int i11, Object obj) {
        for (pv0 pv0Var : this.f24844f) {
            if (pv0Var.m() == i10) {
                int iC = c();
                ts tsVar = this.f24847i;
                new hr0(tsVar, pv0Var, this.X.f26589a, iC == -1 ? 0 : iC, this.f24857s, tsVar.d()).a(i11).a(obj).e();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, int i11, boolean z10) {
        int i12 = 0;
        boolean z11 = z10 && i10 != -1;
        if (z11 && i10 != 1) {
            i12 = 1;
        }
        xq0 xq0Var = this.X;
        if (xq0Var.f26600l == z11 && xq0Var.f26601m == i12) {
            return;
        }
        this.A++;
        xq0 xq0Var2 = new xq0(xq0Var.f26589a, xq0Var.f26590b, xq0Var.f26591c, xq0Var.f26592d, xq0Var.f26593e, xq0Var.f26594f, xq0Var.f26595g, xq0Var.f26596h, xq0Var.f26597i, xq0Var.f26598j, xq0Var.f26599k, z11, i12, xq0Var.f26602n, xq0Var.f26604p, xq0Var.f26605q, xq0Var.f26606r, xq0Var.f26603o);
        this.f24847i.a(z11, i12);
        a(xq0Var2, 0, i11, false, 5, -9223372036854775807L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(int i10, dr0.c cVar, dr0.c cVar2, dr0.b bVar) {
        bVar.c();
        bVar.a(cVar, cVar2, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Surface surface) {
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (pv0 pv0Var : this.f24844f) {
            if (pv0Var.m() == 2) {
                int iC = c();
                ts tsVar = this.f24847i;
                arrayList.add(new hr0(tsVar, pv0Var, this.X.f26589a, iC == -1 ? 0 : iC, this.f24857s, tsVar.d()).a(1).a(surface).e());
            }
        }
        Object obj = this.J;
        if (obj != null && obj != surface) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((hr0) it.next()).a(this.f24864z);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z10 = true;
            }
            Object obj2 = this.J;
            Surface surface2 = this.K;
            if (obj2 == surface2) {
                surface2.release();
                this.K = null;
            }
        }
        this.J = surface;
        if (z10) {
            a(ns.a(new dt(3), 1003));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(dr0.b bVar, qv qvVar) {
        bVar.a();
    }

    private void a(ns nsVar) {
        long j10;
        long jA;
        xq0 xq0Var = this.X;
        xq0 xq0VarA = xq0Var.a(xq0Var.f26590b);
        xq0VarA.f26604p = xq0VarA.f26606r;
        xq0VarA.f26605q = 0L;
        xq0 xq0VarA2 = xq0VarA.a(1);
        if (nsVar != null) {
            xq0VarA2 = xq0VarA2.a(nsVar);
        }
        xq0 xq0Var2 = xq0VarA2;
        this.A++;
        this.f24847i.q();
        boolean z10 = xq0Var2.f26589a.c() && !this.X.f26589a.c();
        if (!xq0Var2.f26589a.c()) {
            if (xq0Var2.f26590b.a()) {
                jA = xq0Var2.f26606r;
            } else {
                v61 v61Var = xq0Var2.f26589a;
                nc0.b bVar = xq0Var2.f26590b;
                long j11 = xq0Var2.f26606r;
                v61Var.a(bVar.f22012a, this.f24850l);
                j10 = j11 + this.f24850l.f25850e;
            }
            a(xq0Var2, 0, 1, z10, 4, j10);
        }
        jA = da1.a(this.Z);
        j10 = jA;
        a(xq0Var2, 0, 1, z10, 4, j10);
    }

    public static void a(rs rsVar, SurfaceTexture surfaceTexture) {
        Objects.requireNonNull(rsVar);
        Surface surface = new Surface(surfaceTexture);
        rsVar.a(surface);
        rsVar.K = surface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ts.d dVar) {
        boolean z10;
        int i10 = this.A - dVar.f25479c;
        this.A = i10;
        boolean z11 = true;
        if (dVar.f25480d) {
            this.B = dVar.f25481e;
            this.C = true;
        }
        if (dVar.f25482f) {
            this.D = dVar.f25483g;
        }
        if (i10 == 0) {
            v61 v61Var = dVar.f25478b.f26589a;
            if (!this.X.f26589a.c() && v61Var.c()) {
                this.Y = -1;
                this.Z = 0L;
            }
            if (!v61Var.c()) {
                List<v61> listD = ((vr0) v61Var).d();
                pa.b(listD.size() == this.f24851m.size());
                for (int i11 = 0; i11 < listD.size(); i11++) {
                    ((d) this.f24851m.get(i11)).f24871b = listD.get(i11);
                }
            }
            long j10 = -9223372036854775807L;
            if (this.C) {
                if (dVar.f25478b.f26590b.equals(this.X.f26590b) && dVar.f25478b.f26592d == this.X.f26606r) {
                    z11 = false;
                }
                if (z11) {
                    if (v61Var.c() || dVar.f25478b.f26590b.a()) {
                        j10 = dVar.f25478b.f26592d;
                    } else {
                        xq0 xq0Var = dVar.f25478b;
                        nc0.b bVar = xq0Var.f26590b;
                        long j11 = xq0Var.f26592d;
                        v61Var.a(bVar.f22012a, this.f24850l);
                        j10 = j11 + this.f24850l.f25850e;
                    }
                }
                z10 = z11;
            } else {
                z10 = false;
            }
            this.C = false;
            a(dVar.f25478b, 1, this.D, z10, this.B, j10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0298  */
    /* JADX WARN: Code duplicated, block: B:109:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:112:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:113:0x02f1  */
    private void a(final xq0 xq0Var, int i10, int i11, boolean z10, int i12, long j10) {
        Pair pair;
        int i13;
        bc0 bc0Var;
        final int i14;
        Object obj;
        int i15;
        bc0 bc0Var2;
        Object obj2;
        int iA;
        long j11;
        long j12;
        long jA;
        long jA2;
        int currentMediaItemIndex;
        Object obj3;
        bc0 bc0Var3;
        Object obj4;
        int iA2;
        long jB;
        long jB2;
        xq0 xq0Var2 = this.X;
        this.X = xq0Var;
        boolean z11 = !xq0Var2.f26589a.equals(xq0Var.f26589a);
        v61 v61Var = xq0Var2.f26589a;
        v61 v61Var2 = xq0Var.f26589a;
        int i16 = 0;
        if (v61Var2.c() && v61Var.c()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (v61Var2.c() != v61Var.c()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (v61Var.a(v61Var.a(xq0Var2.f26590b.f22012a, this.f24850l).f25848c, this.f22696a, 0L).f25861a.equals(v61Var2.a(v61Var2.a(xq0Var.f26590b.f22012a, this.f24850l).f25848c, this.f22696a, 0L).f25861a)) {
            pair = (z10 && i12 == 0 && xq0Var2.f26590b.f22015d < xq0Var.f26590b.f22015d) ? new Pair(Boolean.TRUE, 0) : new Pair(Boolean.FALSE, -1);
        } else {
            if (z10 && i12 == 0) {
                i13 = 1;
            } else if (z10 && i12 == 1) {
                i13 = 2;
            } else {
                if (!z11) {
                    throw new IllegalStateException();
                }
                i13 = 3;
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i13));
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        int iIntValue = ((Integer) pair.second).intValue();
        ec0 ec0Var = this.H;
        if (zBooleanValue) {
            bc0Var = xq0Var.f26589a.c() ? null : xq0Var.f26589a.a(xq0Var.f26589a.a(xq0Var.f26590b.f22012a, this.f24850l).f25848c, this.f22696a, 0L).f25863c;
            this.W = ec0.G;
        } else {
            bc0Var = null;
        }
        if (zBooleanValue || !xq0Var2.f26598j.equals(xq0Var.f26598j)) {
            ec0 ec0Var2 = this.W;
            Objects.requireNonNull(ec0Var2);
            ec0.a aVar = new ec0.a(ec0Var2, i16);
            List<Metadata> list = xq0Var.f26598j;
            for (int i17 = 0; i17 < list.size(); i17++) {
                Metadata metadata = list.get(i17);
                for (int i18 = 0; i18 < metadata.c(); i18++) {
                    metadata.a(i18).a(aVar);
                }
            }
            this.W = new ec0(aVar, i16);
            v61 currentTimeline = getCurrentTimeline();
            if (currentTimeline.c()) {
                ec0Var = this.W;
            } else {
                bc0 bc0Var4 = currentTimeline.a(getCurrentMediaItemIndex(), this.f22696a, 0L).f25863c;
                ec0 ec0Var3 = this.W;
                Objects.requireNonNull(ec0Var3);
                ec0Var = new ec0(new ec0.a(ec0Var3, i16).a(bc0Var4.f19174d), i16);
            }
        }
        boolean z12 = !ec0Var.equals(this.H);
        this.H = ec0Var;
        boolean z13 = xq0Var2.f26600l != xq0Var.f26600l;
        boolean z14 = xq0Var2.f26593e != xq0Var.f26593e;
        if (z14 || z13) {
            int playbackState = getPlaybackState();
            if (playbackState == 1) {
                this.f24862x.a(false);
                this.f24863y.a(false);
            } else if (playbackState == 2 || playbackState == 3) {
                i();
                this.f24862x.a(getPlayWhenReady() && !this.X.f26603o);
                this.f24863y.a(getPlayWhenReady());
            } else {
                if (playbackState != 4) {
                    throw new IllegalStateException();
                }
                this.f24862x.a(false);
                this.f24863y.a(false);
            }
        }
        boolean z15 = xq0Var2.f26595g != xq0Var.f26595g;
        if (!xq0Var2.f26589a.equals(xq0Var.f26589a)) {
            this.f24848j.a(0, new vp1(xq0Var, i10, i16));
        }
        if (z10) {
            v61.b bVar = new v61.b();
            if (xq0Var2.f26589a.c()) {
                obj = null;
                i15 = -1;
                bc0Var2 = null;
                obj2 = null;
                iA = -1;
            } else {
                Object obj5 = xq0Var2.f26590b.f22012a;
                xq0Var2.f26589a.a(obj5, bVar);
                int i19 = bVar.f25848c;
                obj2 = obj5;
                iA = xq0Var2.f26589a.a(obj5);
                obj = xq0Var2.f26589a.a(i19, this.f22696a, 0L).f25861a;
                bc0Var2 = this.f22696a.f25863c;
                i15 = i19;
            }
            boolean zA = xq0Var2.f26590b.a();
            if (i12 == 0) {
                if (zA) {
                    nc0.b bVar2 = xq0Var2.f26590b;
                    jA = bVar.a(bVar2.f22013b, bVar2.f22014c);
                    jA2 = a(xq0Var2);
                    long jB3 = da1.b(jA);
                    long jB4 = da1.b(jA2);
                    nc0.b bVar3 = xq0Var2.f26590b;
                    dr0.c cVar = new dr0.c(obj, i15, bc0Var2, obj2, iA, jB3, jB4, bVar3.f22013b, bVar3.f22014c);
                    currentMediaItemIndex = getCurrentMediaItemIndex();
                    if (this.X.f26589a.c()) {
                        obj3 = null;
                        bc0Var3 = null;
                        obj4 = null;
                        iA2 = -1;
                    } else {
                        xq0 xq0Var3 = this.X;
                        Object obj6 = xq0Var3.f26590b.f22012a;
                        xq0Var3.f26589a.a(obj6, this.f24850l);
                        iA2 = this.X.f26589a.a(obj6);
                        obj3 = this.X.f26589a.a(currentMediaItemIndex, this.f22696a, 0L).f25861a;
                        bc0Var3 = this.f22696a.f25863c;
                        obj4 = obj6;
                    }
                    jB = da1.b(j10);
                    if (this.X.f26590b.a()) {
                        jB2 = da1.b(a(this.X));
                    } else {
                        jB2 = jB;
                    }
                    nc0.b bVar4 = this.X.f26590b;
                    this.f24848j.a(11, new tp1(i12, cVar, new dr0.c(obj3, currentMediaItemIndex, bc0Var3, obj4, iA2, jB, jB2, bVar4.f22013b, bVar4.f22014c)));
                } else {
                    if (xq0Var2.f26590b.f22016e != -1) {
                        jA = a(this.X);
                    } else {
                        j11 = bVar.f25850e;
                        j12 = bVar.f25849d;
                        jA = j11 + j12;
                    }
                    jA2 = jA;
                    long jB5 = da1.b(jA);
                    long jB6 = da1.b(jA2);
                    nc0.b bVar5 = xq0Var2.f26590b;
                    dr0.c cVar2 = new dr0.c(obj, i15, bc0Var2, obj2, iA, jB5, jB6, bVar5.f22013b, bVar5.f22014c);
                    currentMediaItemIndex = getCurrentMediaItemIndex();
                    if (this.X.f26589a.c()) {
                        xq0 xq0Var4 = this.X;
                        Object obj7 = xq0Var4.f26590b.f22012a;
                        xq0Var4.f26589a.a(obj7, this.f24850l);
                        iA2 = this.X.f26589a.a(obj7);
                        obj3 = this.X.f26589a.a(currentMediaItemIndex, this.f22696a, 0L).f25861a;
                        bc0Var3 = this.f22696a.f25863c;
                        obj4 = obj7;
                    } else {
                        obj3 = null;
                        bc0Var3 = null;
                        obj4 = null;
                        iA2 = -1;
                    }
                    jB = da1.b(j10);
                    if (this.X.f26590b.a()) {
                        jB2 = da1.b(a(this.X));
                    } else {
                        jB2 = jB;
                    }
                    nc0.b bVar6 = this.X.f26590b;
                    this.f24848j.a(11, new tp1(i12, cVar2, new dr0.c(obj3, currentMediaItemIndex, bc0Var3, obj4, iA2, jB, jB2, bVar6.f22013b, bVar6.f22014c)));
                }
            } else if (zA) {
                jA = xq0Var2.f26606r;
                jA2 = a(xq0Var2);
                long jB7 = da1.b(jA);
                long jB8 = da1.b(jA2);
                nc0.b bVar7 = xq0Var2.f26590b;
                dr0.c cVar3 = new dr0.c(obj, i15, bc0Var2, obj2, iA, jB7, jB8, bVar7.f22013b, bVar7.f22014c);
                currentMediaItemIndex = getCurrentMediaItemIndex();
                if (this.X.f26589a.c()) {
                    xq0 xq0Var5 = this.X;
                    Object obj8 = xq0Var5.f26590b.f22012a;
                    xq0Var5.f26589a.a(obj8, this.f24850l);
                    iA2 = this.X.f26589a.a(obj8);
                    obj3 = this.X.f26589a.a(currentMediaItemIndex, this.f22696a, 0L).f25861a;
                    bc0Var3 = this.f22696a.f25863c;
                    obj4 = obj8;
                } else {
                    obj3 = null;
                    bc0Var3 = null;
                    obj4 = null;
                    iA2 = -1;
                }
                jB = da1.b(j10);
                if (this.X.f26590b.a()) {
                    jB2 = da1.b(a(this.X));
                } else {
                    jB2 = jB;
                }
                nc0.b bVar8 = this.X.f26590b;
                this.f24848j.a(11, new tp1(i12, cVar3, new dr0.c(obj3, currentMediaItemIndex, bc0Var3, obj4, iA2, jB, jB2, bVar8.f22013b, bVar8.f22014c)));
            } else {
                j11 = bVar.f25850e;
                j12 = xq0Var2.f26606r;
                jA = j11 + j12;
                jA2 = jA;
                long jB9 = da1.b(jA);
                long jB10 = da1.b(jA2);
                nc0.b bVar9 = xq0Var2.f26590b;
                dr0.c cVar4 = new dr0.c(obj, i15, bc0Var2, obj2, iA, jB9, jB10, bVar9.f22013b, bVar9.f22014c);
                currentMediaItemIndex = getCurrentMediaItemIndex();
                if (this.X.f26589a.c()) {
                    xq0 xq0Var6 = this.X;
                    Object obj9 = xq0Var6.f26590b.f22012a;
                    xq0Var6.f26589a.a(obj9, this.f24850l);
                    iA2 = this.X.f26589a.a(obj9);
                    obj3 = this.X.f26589a.a(currentMediaItemIndex, this.f22696a, 0L).f25861a;
                    bc0Var3 = this.f22696a.f25863c;
                    obj4 = obj9;
                } else {
                    obj3 = null;
                    bc0Var3 = null;
                    obj4 = null;
                    iA2 = -1;
                }
                jB = da1.b(j10);
                if (this.X.f26590b.a()) {
                    jB2 = da1.b(a(this.X));
                } else {
                    jB2 = jB;
                }
                nc0.b bVar10 = this.X.f26590b;
                this.f24848j.a(11, new tp1(i12, cVar4, new dr0.c(obj3, currentMediaItemIndex, bc0Var3, obj4, iA2, jB, jB2, bVar10.f22013b, bVar10.f22014c)));
            }
        } else {
            z15 = z15;
        }
        if (zBooleanValue) {
            this.f24848j.a(1, new vp1(bc0Var, iIntValue));
        }
        if (xq0Var2.f26594f != xq0Var.f26594f) {
            final int i20 = 3;
            this.f24848j.a(10, new r80.a(xq0Var, i20) { // from class: com.yandex.mobile.ads.impl.up1

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f25726c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ xq0 f25727d;

                /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
                {
                    this.f25726c = i20;
                    switch (i20) {
                    }
                }

                @Override // com.yandex.mobile.ads.impl.r80.a
                public final void invoke(Object obj10) {
                    switch (this.f25726c) {
                        case 0:
                            rs.g(this.f25727d, (dr0.b) obj10);
                            break;
                        case 1:
                            rs.h(this.f25727d, (dr0.b) obj10);
                            break;
                        case 2:
                            rs.i(this.f25727d, (dr0.b) obj10);
                            break;
                        case 3:
                            rs.a(this.f25727d, (dr0.b) obj10);
                            break;
                        case 4:
                            rs.b(this.f25727d, (dr0.b) obj10);
                            break;
                        case 5:
                            rs.c(this.f25727d, (dr0.b) obj10);
                            break;
                        case 6:
                            rs.d(this.f25727d, (dr0.b) obj10);
                            break;
                        case 7:
                            rs.e(this.f25727d, (dr0.b) obj10);
                            break;
                        default:
                            rs.f(this.f25727d, (dr0.b) obj10);
                            break;
                    }
                }
            });
            if (xq0Var.f26594f != null) {
                final int i21 = 4;
                this.f24848j.a(10, new r80.a(xq0Var, i21) { // from class: com.yandex.mobile.ads.impl.up1

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ int f25726c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ xq0 f25727d;

                    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
                    {
                        this.f25726c = i21;
                        switch (i21) {
                        }
                    }

                    @Override // com.yandex.mobile.ads.impl.r80.a
                    public final void invoke(Object obj10) {
                        switch (this.f25726c) {
                            case 0:
                                rs.g(this.f25727d, (dr0.b) obj10);
                                break;
                            case 1:
                                rs.h(this.f25727d, (dr0.b) obj10);
                                break;
                            case 2:
                                rs.i(this.f25727d, (dr0.b) obj10);
                                break;
                            case 3:
                                rs.a(this.f25727d, (dr0.b) obj10);
                                break;
                            case 4:
                                rs.b(this.f25727d, (dr0.b) obj10);
                                break;
                            case 5:
                                rs.c(this.f25727d, (dr0.b) obj10);
                                break;
                            case 6:
                                rs.d(this.f25727d, (dr0.b) obj10);
                                break;
                            case 7:
                                rs.e(this.f25727d, (dr0.b) obj10);
                                break;
                            default:
                                rs.f(this.f25727d, (dr0.b) obj10);
                                break;
                        }
                    }
                });
            }
        }
        p71 p71Var = xq0Var2.f26597i;
        p71 p71Var2 = xq0Var.f26597i;
        final int i22 = 5;
        if (p71Var != p71Var2) {
            this.f24845g.a(p71Var2.f24002e);
            this.f24848j.a(2, new r80.a(xq0Var, i22) { // from class: com.yandex.mobile.ads.impl.up1

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f25726c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ xq0 f25727d;

                /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
                {
                    this.f25726c = i22;
                    switch (i22) {
                    }
                }

                @Override // com.yandex.mobile.ads.impl.r80.a
                public final void invoke(Object obj10) {
                    switch (this.f25726c) {
                        case 0:
                            rs.g(this.f25727d, (dr0.b) obj10);
                            break;
                        case 1:
                            rs.h(this.f25727d, (dr0.b) obj10);
                            break;
                        case 2:
                            rs.i(this.f25727d, (dr0.b) obj10);
                            break;
                        case 3:
                            rs.a(this.f25727d, (dr0.b) obj10);
                            break;
                        case 4:
                            rs.b(this.f25727d, (dr0.b) obj10);
                            break;
                        case 5:
                            rs.c(this.f25727d, (dr0.b) obj10);
                            break;
                        case 6:
                            rs.d(this.f25727d, (dr0.b) obj10);
                            break;
                        case 7:
                            rs.e(this.f25727d, (dr0.b) obj10);
                            break;
                        default:
                            rs.f(this.f25727d, (dr0.b) obj10);
                            break;
                    }
                }
            });
        }
        if (z12) {
            this.f24848j.a(14, new ho1(this.H));
        }
        final int i23 = 6;
        if (z15) {
            this.f24848j.a(3, new r80.a(xq0Var, i23) { // from class: com.yandex.mobile.ads.impl.up1

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f25726c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ xq0 f25727d;

                /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
                {
                    this.f25726c = i23;
                    switch (i23) {
                    }
                }

                @Override // com.yandex.mobile.ads.impl.r80.a
                public final void invoke(Object obj10) {
                    switch (this.f25726c) {
                        case 0:
                            rs.g(this.f25727d, (dr0.b) obj10);
                            break;
                        case 1:
                            rs.h(this.f25727d, (dr0.b) obj10);
                            break;
                        case 2:
                            rs.i(this.f25727d, (dr0.b) obj10);
                            break;
                        case 3:
                            rs.a(this.f25727d, (dr0.b) obj10);
                            break;
                        case 4:
                            rs.b(this.f25727d, (dr0.b) obj10);
                            break;
                        case 5:
                            rs.c(this.f25727d, (dr0.b) obj10);
                            break;
                        case 6:
                            rs.d(this.f25727d, (dr0.b) obj10);
                            break;
                        case 7:
                            rs.e(this.f25727d, (dr0.b) obj10);
                            break;
                        default:
                            rs.f(this.f25727d, (dr0.b) obj10);
                            break;
                    }
                }
            });
        }
        final int i24 = 7;
        if (z14 || z13) {
            this.f24848j.a(-1, new r80.a(xq0Var, i24) { // from class: com.yandex.mobile.ads.impl.up1

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f25726c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ xq0 f25727d;

                /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
                {
                    this.f25726c = i24;
                    switch (i24) {
                    }
                }

                @Override // com.yandex.mobile.ads.impl.r80.a
                public final void invoke(Object obj10) {
                    switch (this.f25726c) {
                        case 0:
                            rs.g(this.f25727d, (dr0.b) obj10);
                            break;
                        case 1:
                            rs.h(this.f25727d, (dr0.b) obj10);
                            break;
                        case 2:
                            rs.i(this.f25727d, (dr0.b) obj10);
                            break;
                        case 3:
                            rs.a(this.f25727d, (dr0.b) obj10);
                            break;
                        case 4:
                            rs.b(this.f25727d, (dr0.b) obj10);
                            break;
                        case 5:
                            rs.c(this.f25727d, (dr0.b) obj10);
                            break;
                        case 6:
                            rs.d(this.f25727d, (dr0.b) obj10);
                            break;
                        case 7:
                            rs.e(this.f25727d, (dr0.b) obj10);
                            break;
                        default:
                            rs.f(this.f25727d, (dr0.b) obj10);
                            break;
                    }
                }
            });
        }
        if (z14) {
            final int i25 = 8;
            this.f24848j.a(4, new r80.a(xq0Var, i25) { // from class: com.yandex.mobile.ads.impl.up1

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f25726c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ xq0 f25727d;

                /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
                {
                    this.f25726c = i25;
                    switch (i25) {
                    }
                }

                @Override // com.yandex.mobile.ads.impl.r80.a
                public final void invoke(Object obj10) {
                    switch (this.f25726c) {
                        case 0:
                            rs.g(this.f25727d, (dr0.b) obj10);
                            break;
                        case 1:
                            rs.h(this.f25727d, (dr0.b) obj10);
                            break;
                        case 2:
                            rs.i(this.f25727d, (dr0.b) obj10);
                            break;
                        case 3:
                            rs.a(this.f25727d, (dr0.b) obj10);
                            break;
                        case 4:
                            rs.b(this.f25727d, (dr0.b) obj10);
                            break;
                        case 5:
                            rs.c(this.f25727d, (dr0.b) obj10);
                            break;
                        case 6:
                            rs.d(this.f25727d, (dr0.b) obj10);
                            break;
                        case 7:
                            rs.e(this.f25727d, (dr0.b) obj10);
                            break;
                        default:
                            rs.f(this.f25727d, (dr0.b) obj10);
                            break;
                    }
                }
            });
        }
        if (z13) {
            this.f24848j.a(5, new vp1(xq0Var, i11, 1));
        }
        if (xq0Var2.f26601m != xq0Var.f26601m) {
            i14 = 0;
            this.f24848j.a(6, new r80.a(xq0Var, i14) { // from class: com.yandex.mobile.ads.impl.up1

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f25726c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ xq0 f25727d;

                /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
                {
                    this.f25726c = i14;
                    switch (i14) {
                    }
                }

                @Override // com.yandex.mobile.ads.impl.r80.a
                public final void invoke(Object obj10) {
                    switch (this.f25726c) {
                        case 0:
                            rs.g(this.f25727d, (dr0.b) obj10);
                            break;
                        case 1:
                            rs.h(this.f25727d, (dr0.b) obj10);
                            break;
                        case 2:
                            rs.i(this.f25727d, (dr0.b) obj10);
                            break;
                        case 3:
                            rs.a(this.f25727d, (dr0.b) obj10);
                            break;
                        case 4:
                            rs.b(this.f25727d, (dr0.b) obj10);
                            break;
                        case 5:
                            rs.c(this.f25727d, (dr0.b) obj10);
                            break;
                        case 6:
                            rs.d(this.f25727d, (dr0.b) obj10);
                            break;
                        case 7:
                            rs.e(this.f25727d, (dr0.b) obj10);
                            break;
                        default:
                            rs.f(this.f25727d, (dr0.b) obj10);
                            break;
                    }
                }
            });
        } else {
            i14 = 0;
        }
        if (((xq0Var2.f26593e == 3 && xq0Var2.f26600l && xq0Var2.f26601m == 0) ? 1 : i14) != ((xq0Var.f26593e == 3 && xq0Var.f26600l && xq0Var.f26601m == 0) ? 1 : i14)) {
            final int i26 = 1;
            this.f24848j.a(7, new r80.a(xq0Var, i26) { // from class: com.yandex.mobile.ads.impl.up1

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f25726c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ xq0 f25727d;

                /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
                {
                    this.f25726c = i26;
                    switch (i26) {
                    }
                }

                @Override // com.yandex.mobile.ads.impl.r80.a
                public final void invoke(Object obj10) {
                    switch (this.f25726c) {
                        case 0:
                            rs.g(this.f25727d, (dr0.b) obj10);
                            break;
                        case 1:
                            rs.h(this.f25727d, (dr0.b) obj10);
                            break;
                        case 2:
                            rs.i(this.f25727d, (dr0.b) obj10);
                            break;
                        case 3:
                            rs.a(this.f25727d, (dr0.b) obj10);
                            break;
                        case 4:
                            rs.b(this.f25727d, (dr0.b) obj10);
                            break;
                        case 5:
                            rs.c(this.f25727d, (dr0.b) obj10);
                            break;
                        case 6:
                            rs.d(this.f25727d, (dr0.b) obj10);
                            break;
                        case 7:
                            rs.e(this.f25727d, (dr0.b) obj10);
                            break;
                        default:
                            rs.f(this.f25727d, (dr0.b) obj10);
                            break;
                    }
                }
            });
        }
        if (!xq0Var2.f26602n.equals(xq0Var.f26602n)) {
            final int i27 = 2;
            this.f24848j.a(12, new r80.a(xq0Var, i27) { // from class: com.yandex.mobile.ads.impl.up1

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f25726c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ xq0 f25727d;

                /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
                {
                    this.f25726c = i27;
                    switch (i27) {
                    }
                }

                @Override // com.yandex.mobile.ads.impl.r80.a
                public final void invoke(Object obj10) {
                    switch (this.f25726c) {
                        case 0:
                            rs.g(this.f25727d, (dr0.b) obj10);
                            break;
                        case 1:
                            rs.h(this.f25727d, (dr0.b) obj10);
                            break;
                        case 2:
                            rs.i(this.f25727d, (dr0.b) obj10);
                            break;
                        case 3:
                            rs.a(this.f25727d, (dr0.b) obj10);
                            break;
                        case 4:
                            rs.b(this.f25727d, (dr0.b) obj10);
                            break;
                        case 5:
                            rs.c(this.f25727d, (dr0.b) obj10);
                            break;
                        case 6:
                            rs.d(this.f25727d, (dr0.b) obj10);
                            break;
                        case 7:
                            rs.e(this.f25727d, (dr0.b) obj10);
                            break;
                        default:
                            rs.f(this.f25727d, (dr0.b) obj10);
                            break;
                    }
                }
            });
        }
        h();
        this.f24848j.a();
        if (xq0Var2.f26603o != xq0Var.f26603o) {
            Iterator<os.a> it = this.f24849k.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(xq0 xq0Var, int i10, dr0.b bVar) {
        v61 v61Var = xq0Var.f26589a;
        bVar.a(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(xq0 xq0Var, dr0.b bVar) {
        bVar.a(xq0Var.f26594f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static dp b(u41 u41Var) {
        return new dp(0, u41Var.b(), u41Var.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(ts.d dVar) {
        this.f24846h.a(new do1(this, dVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(xq0 xq0Var, int i10, dr0.b bVar) {
        bVar.onPlayWhenReadyChanged(xq0Var.f26600l, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(xq0 xq0Var, dr0.b bVar) {
        bVar.b(xq0Var.f26594f);
    }

    private int c() {
        if (this.X.f26589a.c()) {
            return this.Y;
        }
        xq0 xq0Var = this.X;
        return xq0Var.f26589a.a(xq0Var.f26590b.f22012a, this.f24850l).f25848c;
    }

    public static ec0 c(rs rsVar) {
        v61 currentTimeline = rsVar.getCurrentTimeline();
        if (currentTimeline.c()) {
            return rsVar.W;
        }
        bc0 bc0Var = currentTimeline.a(rsVar.getCurrentMediaItemIndex(), rsVar.f22696a, 0L).f25863c;
        ec0 ec0Var = rsVar.W;
        Objects.requireNonNull(ec0Var);
        int i10 = 0;
        return new ec0(new ec0.a(ec0Var, i10).a(bc0Var.f19174d), i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(dr0.b bVar) {
        bVar.b(ns.a(new dt(1), 1003));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(xq0 xq0Var, dr0.b bVar) {
        bVar.a(xq0Var.f26597i.f24001d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(dr0.b bVar) {
        bVar.a(this.G);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(xq0 xq0Var, dr0.b bVar) {
        boolean z10 = xq0Var.f26595g;
        bVar.b();
        bVar.onIsLoadingChanged(xq0Var.f26595g);
    }

    public static void e(rs rsVar) {
        rsVar.a(1, 2, Float.valueOf(rsVar.R * rsVar.f24860v.b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(xq0 xq0Var, dr0.b bVar) {
        bVar.onPlayerStateChanged(xq0Var.f26600l, xq0Var.f26593e);
    }

    private int f() {
        AudioTrack audioTrack = this.I;
        if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
            this.I.release();
            this.I = null;
        }
        if (this.I == null) {
            this.I = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
        }
        return this.I.getAudioSessionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(xq0 xq0Var, dr0.b bVar) {
        bVar.onPlaybackStateChanged(xq0Var.f26593e);
    }

    private void g() {
        TextureView textureView = this.L;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f24858t) {
                p90.d("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.L.setSurfaceTextureListener(null);
            }
            this.L = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g(xq0 xq0Var, dr0.b bVar) {
        bVar.onPlaybackSuppressionReasonChanged(xq0Var.f26601m);
    }

    private void h() {
        dr0.a aVar = this.G;
        dr0 dr0Var = this.f24843e;
        dr0.a aVar2 = this.f24841c;
        int i10 = da1.f19803a;
        boolean zIsPlayingAd = dr0Var.isPlayingAd();
        boolean zIsCurrentMediaItemSeekable = dr0Var.isCurrentMediaItemSeekable();
        boolean zHasPreviousMediaItem = dr0Var.hasPreviousMediaItem();
        boolean zHasNextMediaItem = dr0Var.hasNextMediaItem();
        boolean zIsCurrentMediaItemLive = dr0Var.isCurrentMediaItemLive();
        boolean zIsCurrentMediaItemDynamic = dr0Var.isCurrentMediaItemDynamic();
        boolean zC = dr0Var.getCurrentTimeline().c();
        boolean z10 = !zIsPlayingAd;
        int i11 = 0;
        dr0.a aVarA = new dr0.a.C0205a().a(aVar2).a(z10, 4).a(zIsCurrentMediaItemSeekable && !zIsPlayingAd, 5).a(zHasPreviousMediaItem && !zIsPlayingAd, 6).a(!zC && (zHasPreviousMediaItem || !zIsCurrentMediaItemLive || zIsCurrentMediaItemSeekable) && !zIsPlayingAd, 7).a(zHasNextMediaItem && !zIsPlayingAd, 8).a(!zC && (zHasNextMediaItem || (zIsCurrentMediaItemLive && zIsCurrentMediaItemDynamic)) && !zIsPlayingAd, 9).a(z10, 10).a(zIsCurrentMediaItemSeekable && !zIsPlayingAd, 11).a(zIsCurrentMediaItemSeekable && !zIsPlayingAd, 12).a();
        this.G = aVarA;
        if (aVarA.equals(aVar)) {
            return;
        }
        this.f24848j.a(13, new yp1(this, i11));
    }

    public static void h(rs rsVar) {
        int playbackState = rsVar.getPlaybackState();
        if (playbackState != 1) {
            if (playbackState == 2 || playbackState == 3) {
                rsVar.i();
                rsVar.f24862x.a(rsVar.getPlayWhenReady() && !rsVar.X.f26603o);
                rsVar.f24863y.a(rsVar.getPlayWhenReady());
                return;
            }
            if (playbackState != 4) {
                throw new IllegalStateException();
            }
        }
        rsVar.f24862x.a(false);
        rsVar.f24863y.a(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(xq0 xq0Var, dr0.b bVar) {
        bVar.onIsPlayingChanged(xq0Var.f26593e == 3 && xq0Var.f26600l && xq0Var.f26601m == 0);
    }

    private void i() {
        this.f24842d.b();
        if (Thread.currentThread() != this.f24855q.getThread()) {
            Object[] objArr = {Thread.currentThread().getName(), this.f24855q.getThread().getName()};
            int i10 = da1.f19803a;
            String str = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", objArr);
            if (this.T) {
                throw new IllegalStateException(str);
            }
            p90.b("ExoPlayerImpl", str, this.U ? null : new IllegalStateException());
            this.U = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i(xq0 xq0Var, dr0.b bVar) {
        bVar.a(xq0Var.f26602n);
    }

    @Override // com.yandex.mobile.ads.impl.dr0
    public final ns a() {
        i();
        return this.X.f26594f;
    }

    @Override // com.yandex.mobile.ads.impl.dr0
    public final void a(dr0.b bVar) {
        Objects.requireNonNull(bVar);
        this.f24848j.b(bVar);
    }

    public final void a(fc0 fc0Var) {
        this.f24854p.a(fc0Var);
    }

    @Override // com.yandex.mobile.ads.impl.os
    public final void a(it0 it0Var) {
        long j10;
        long jA;
        i();
        List listSingletonList = Collections.singletonList(it0Var);
        i();
        i();
        c();
        getCurrentPosition();
        this.A++;
        if (!this.f24851m.isEmpty()) {
            int size = this.f24851m.size();
            for (int i10 = size - 1; i10 >= 0; i10--) {
                this.f24851m.remove(i10);
            }
            this.F = this.F.c(size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < listSingletonList.size(); i11++) {
            qc0.c cVar = new qc0.c((nc0) listSingletonList.get(i11), this.f24852n);
            arrayList.add(cVar);
            this.f24851m.add(i11 + 0, new d(cVar.f24445a.f(), cVar.f24446b));
        }
        this.F = this.F.b(arrayList.size());
        vr0 vr0Var = new vr0(this.f24851m, this.F);
        if (!vr0Var.c() && -1 >= vr0Var.b()) {
            throw new w10();
        }
        int iA = vr0Var.a(false);
        xq0 xq0VarA = a(this.X, vr0Var, a(vr0Var, iA, -9223372036854775807L));
        int i12 = xq0VarA.f26593e;
        if (iA != -1 && i12 != 1) {
            i12 = (vr0Var.c() || iA >= vr0Var.b()) ? 4 : 2;
        }
        xq0 xq0VarA2 = xq0VarA.a(i12);
        this.f24847i.a(iA, da1.a(-9223372036854775807L), this.F, arrayList);
        boolean z10 = (this.X.f26590b.f22012a.equals(xq0VarA2.f26590b.f22012a) || this.X.f26589a.c()) ? false : true;
        if (!xq0VarA2.f26589a.c()) {
            if (xq0VarA2.f26590b.a()) {
                jA = xq0VarA2.f26606r;
            } else {
                v61 v61Var = xq0VarA2.f26589a;
                nc0.b bVar = xq0VarA2.f26590b;
                long j11 = xq0VarA2.f26606r;
                v61Var.a(bVar.f22012a, this.f24850l);
                j10 = j11 + this.f24850l.f25850e;
            }
            a(xq0VarA2, 0, 1, z10, 4, j10);
        }
        jA = da1.a(this.Z);
        j10 = jA;
        a(xq0VarA2, 0, 1, z10, 4, j10);
    }

    public final void a(os.a aVar) {
        this.f24849k.add(aVar);
    }

    @Override // com.yandex.mobile.ads.impl.dr0
    public final void b(dr0.b bVar) {
        Objects.requireNonNull(bVar);
        this.f24848j.a(bVar);
    }

    public final void d() {
        i();
    }

    public final void e() {
        i();
    }

    @Override // com.yandex.mobile.ads.impl.dr0
    public final long getContentPosition() {
        i();
        if (!isPlayingAd()) {
            return getCurrentPosition();
        }
        xq0 xq0Var = this.X;
        xq0Var.f26589a.a(xq0Var.f26590b.f22012a, this.f24850l);
        xq0 xq0Var2 = this.X;
        return xq0Var2.f26591c == -9223372036854775807L ? da1.b(xq0Var2.f26589a.a(getCurrentMediaItemIndex(), this.f22696a, 0L).f25873m) : da1.b(this.f24850l.f25850e) + da1.b(this.X.f26591c);
    }

    @Override // com.yandex.mobile.ads.impl.dr0
    public final int getCurrentAdGroupIndex() {
        i();
        if (isPlayingAd()) {
            return this.X.f26590b.f22013b;
        }
        return -1;
    }

    @Override // com.yandex.mobile.ads.impl.dr0
    public final int getCurrentAdIndexInAdGroup() {
        i();
        if (isPlayingAd()) {
            return this.X.f26590b.f22014c;
        }
        return -1;
    }

    @Override // com.yandex.mobile.ads.impl.dr0
    public final int getCurrentMediaItemIndex() {
        i();
        int iC = c();
        if (iC == -1) {
            return 0;
        }
        return iC;
    }

    @Override // com.yandex.mobile.ads.impl.dr0
    public final int getCurrentPeriodIndex() {
        i();
        if (this.X.f26589a.c()) {
            return 0;
        }
        xq0 xq0Var = this.X;
        return xq0Var.f26589a.a(xq0Var.f26590b.f22012a);
    }

    @Override // com.yandex.mobile.ads.impl.dr0
    public final long getCurrentPosition() {
        long jA;
        i();
        xq0 xq0Var = this.X;
        if (xq0Var.f26589a.c()) {
            jA = da1.a(this.Z);
        } else if (xq0Var.f26590b.a()) {
            jA = xq0Var.f26606r;
        } else {
            v61 v61Var = xq0Var.f26589a;
            nc0.b bVar = xq0Var.f26590b;
            long j10 = xq0Var.f26606r;
            v61Var.a(bVar.f22012a, this.f24850l);
            jA = this.f24850l.f25850e + j10;
        }
        return da1.b(jA);
    }

    @Override // com.yandex.mobile.ads.impl.dr0
    public final v61 getCurrentTimeline() {
        i();
        return this.X.f26589a;
    }

    @Override // com.yandex.mobile.ads.impl.dr0
    public final e81 getCurrentTracks() {
        i();
        return this.X.f26597i.f24001d;
    }

    @Override // com.yandex.mobile.ads.impl.dr0
    public final long getDuration() {
        i();
        if (isPlayingAd()) {
            xq0 xq0Var = this.X;
            nc0.b bVar = xq0Var.f26590b;
            xq0Var.f26589a.a(bVar.f22012a, this.f24850l);
            return da1.b(this.f24850l.a(bVar.f22013b, bVar.f22014c));
        }
        v61 currentTimeline = getCurrentTimeline();
        if (currentTimeline.c()) {
            return -9223372036854775807L;
        }
        return da1.b(currentTimeline.a(getCurrentMediaItemIndex(), this.f22696a, 0L).f25874n);
    }

    @Override // com.yandex.mobile.ads.impl.dr0
    public final boolean getPlayWhenReady() {
        i();
        return this.X.f26600l;
    }

    @Override // com.yandex.mobile.ads.impl.dr0
    public final int getPlaybackState() {
        i();
        return this.X.f26593e;
    }

    @Override // com.yandex.mobile.ads.impl.dr0
    public final int getPlaybackSuppressionReason() {
        i();
        return this.X.f26601m;
    }

    @Override // com.yandex.mobile.ads.impl.dr0
    public final long getTotalBufferedDuration() {
        i();
        return da1.b(this.X.f26605q);
    }

    @Override // com.yandex.mobile.ads.impl.dr0
    public final float getVolume() {
        i();
        return this.R;
    }

    @Override // com.yandex.mobile.ads.impl.dr0
    public final boolean isPlayingAd() {
        i();
        return this.X.f26590b.a();
    }

    @Override // com.yandex.mobile.ads.impl.dr0
    public final void prepare() {
        i();
        boolean playWhenReady = getPlayWhenReady();
        int iA = this.f24860v.a(playWhenReady, 2);
        a(iA, (!playWhenReady || iA == 1) ? 1 : 2, playWhenReady);
        xq0 xq0Var = this.X;
        if (xq0Var.f26593e != 1) {
            return;
        }
        xq0 xq0VarA = xq0Var.a((ns) null);
        xq0 xq0VarA2 = xq0VarA.a(xq0VarA.f26589a.c() ? 4 : 2);
        this.A++;
        this.f24847i.i();
        a(xq0VarA2, 1, 1, false, 5, -9223372036854775807L);
    }

    @Override // com.yandex.mobile.ads.impl.dr0
    public final void release() {
        AudioTrack audioTrack;
        StringBuilder sbA = v60.a("Release ");
        sbA.append(Integer.toHexString(System.identityHashCode(this)));
        sbA.append(" [");
        sbA.append("ExoPlayerLib/2.18.1");
        sbA.append("] [");
        sbA.append(da1.f19807e);
        sbA.append("] [");
        sbA.append(us.a());
        sbA.append("]");
        p90.c("ExoPlayerImpl", sbA.toString());
        i();
        if (da1.f19803a < 21 && (audioTrack = this.I) != null) {
            audioTrack.release();
            this.I = null;
        }
        this.f24859u.a();
        this.f24861w.c();
        this.f24862x.a(false);
        this.f24863y.a(false);
        this.f24860v.c();
        if (!this.f24847i.k()) {
            r80<dr0.b> r80Var = this.f24848j;
            r80Var.a(10, dp1.f19946e);
            r80Var.a();
        }
        this.f24848j.b();
        this.f24846h.a();
        this.f24856r.a(this.f24854p);
        xq0 xq0VarA = this.X.a(1);
        this.X = xq0VarA;
        xq0 xq0VarA2 = xq0VarA.a(xq0VarA.f26590b);
        this.X = xq0VarA2;
        xq0VarA2.f26604p = xq0VarA2.f26606r;
        this.X.f26605q = 0L;
        this.f24854p.release();
        this.f24845g.d();
        g();
        Surface surface = this.K;
        if (surface != null) {
            surface.release();
            this.K = null;
        }
        int i10 = cm.f19552a;
    }

    @Override // com.yandex.mobile.ads.impl.dr0
    public final void setPlayWhenReady(boolean z10) {
        i();
        int iA = this.f24860v.a(z10, getPlaybackState());
        int i10 = 1;
        if (z10 && iA != 1) {
            i10 = 2;
        }
        a(iA, i10, z10);
    }

    @Override // com.yandex.mobile.ads.impl.dr0
    public final void setVideoTextureView(TextureView textureView) {
        i();
        if (textureView == null) {
            i();
            g();
        } else {
            g();
            this.L = textureView;
            if (textureView.getSurfaceTextureListener() != null) {
                p90.d("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
            }
            textureView.setSurfaceTextureListener(this.f24858t);
            SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
            if (surfaceTexture != null) {
                Surface surface = new Surface(surfaceTexture);
                a(surface);
                this.K = surface;
                a(textureView.getWidth(), textureView.getHeight());
                return;
            }
        }
        a((Surface) null);
        a(0, 0);
    }

    @Override // com.yandex.mobile.ads.impl.dr0
    public final void setVolume(float f10) {
        i();
        int i10 = da1.f19803a;
        final float fMax = Math.max(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, Math.min(f10, 1.0f));
        if (this.R == fMax) {
            return;
        }
        this.R = fMax;
        a(1, 2, Float.valueOf(this.f24860v.b() * fMax));
        r80<dr0.b> r80Var = this.f24848j;
        r80Var.a(22, new r80.a() { // from class: com.yandex.mobile.ads.impl.wp1
            @Override // com.yandex.mobile.ads.impl.r80.a
            public final void invoke(Object obj) {
                ((dr0.b) obj).onVolumeChanged(fMax);
            }
        });
        r80Var.a();
    }

    @Override // com.yandex.mobile.ads.impl.dr0
    public final void stop() {
        i();
        i();
        this.f24860v.a(getPlayWhenReady(), 1);
        a((ns) null);
        int i10 = cm.f19552a;
    }
}
