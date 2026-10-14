package com.yandex.mobile.ads.impl;

import android.os.Looper;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class it0 extends je implements gt0.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final bc0 f21818h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final bc0.f f21819i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final lm.a f21820j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ft0.a f21821k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.yandex.mobile.ads.exo.drm.g f21822l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final u80 f21823m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f21824n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f21825o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f21826p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f21827q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f21828r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private g81 f21829s;

    public static final class a implements nc0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final lm.a f21830a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ft0.a f21831b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private xq f21832c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private u80 f21833d;

        public a(lm.a aVar, ft0.a aVar2) {
            this(aVar, aVar2, new com.yandex.mobile.ads.exo.drm.d(), new eo());
        }

        public a(lm.a aVar, ft0.a aVar2, com.yandex.mobile.ads.exo.drm.d dVar, eo eoVar) {
            this.f21830a = aVar;
            this.f21831b = aVar2;
            this.f21832c = dVar;
            this.f21833d = eoVar;
        }

        public a(lm.a aVar, yt ytVar) {
            this(aVar, new ho1(ytVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ ft0 a(yt ytVar, gr0 gr0Var) {
            return new yf(ytVar);
        }

        public final it0 a(bc0 bc0Var) {
            Objects.requireNonNull(bc0Var.f19172b);
            Object obj = bc0Var.f19172b.f19226g;
            return new it0(bc0Var, this.f21830a, this.f21831b, this.f21832c.a(bc0Var), this.f21833d, 1048576, 0);
        }
    }

    private it0(bc0 bc0Var, lm.a aVar, ft0.a aVar2, com.yandex.mobile.ads.exo.drm.g gVar, u80 u80Var, int i10) {
        this.f21819i = (bc0.f) pa.a(bc0Var.f19172b);
        this.f21818h = bc0Var;
        this.f21820j = aVar;
        this.f21821k = aVar2;
        this.f21822l = gVar;
        this.f21823m = u80Var;
        this.f21824n = i10;
        this.f21825o = true;
        this.f21826p = -9223372036854775807L;
    }

    public /* synthetic */ it0(bc0 bc0Var, lm.a aVar, ft0.a aVar2, com.yandex.mobile.ads.exo.drm.g gVar, u80 u80Var, int i10, int i11) {
        this(bc0Var, aVar, aVar2, gVar, u80Var, i10);
    }

    @Override // com.yandex.mobile.ads.impl.nc0
    public final hc0 a(nc0.b bVar, u8 u8Var, long j10) {
        lm lmVarA = this.f21820j.a();
        g81 g81Var = this.f21829s;
        if (g81Var != null) {
            lmVarA.a(g81Var);
        }
        return new gt0(this.f21819i.f19220a, lmVarA, this.f21821k.a(c()), this.f21822l, a(bVar), this.f21823m, b(bVar), this, u8Var, this.f21819i.f19224e, this.f21824n);
    }

    public final void a(long j10, boolean z10, boolean z11) {
        if (j10 == -9223372036854775807L) {
            j10 = this.f21826p;
        }
        if (!this.f21825o && this.f21826p == j10 && this.f21827q == z10 && this.f21828r == z11) {
            return;
        }
        this.f21826p = j10;
        this.f21827q = z10;
        this.f21828r = z11;
        this.f21825o = false;
        long j11 = this.f21826p;
        v11 v11Var = new v11(j11, j11, this.f21827q, this.f21828r, this.f21818h);
        v61 ht0Var = v11Var;
        if (this.f21825o) {
            ht0Var = new ht0(v11Var);
        }
        a(ht0Var);
    }

    @Override // com.yandex.mobile.ads.impl.je
    public final void a(g81 g81Var) {
        this.f21829s = g81Var;
        this.f21822l.prepare();
        com.yandex.mobile.ads.exo.drm.g gVar = this.f21822l;
        Looper looperMyLooper = Looper.myLooper();
        Objects.requireNonNull(looperMyLooper);
        gVar.a(looperMyLooper, c());
        long j10 = this.f21826p;
        v11 v11Var = new v11(j10, j10, this.f21827q, this.f21828r, this.f21818h);
        v61 ht0Var = v11Var;
        if (this.f21825o) {
            ht0Var = new ht0(v11Var);
        }
        a(ht0Var);
    }

    @Override // com.yandex.mobile.ads.impl.nc0
    public final void a(hc0 hc0Var) {
        ((gt0) hc0Var).l();
    }

    @Override // com.yandex.mobile.ads.impl.je
    public final void e() {
        this.f21822l.release();
    }

    @Override // com.yandex.mobile.ads.impl.nc0
    public final bc0 getMediaItem() {
        return this.f21818h;
    }

    @Override // com.yandex.mobile.ads.impl.nc0
    public final void maybeThrowSourceInfoRefreshError() {
    }
}
