package com.applovin.exoplayer2;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class aw extends d implements q {
    private int A;
    private int B;
    private com.applovin.exoplayer2.c.e C;
    private com.applovin.exoplayer2.c.e D;
    private int E;
    private com.applovin.exoplayer2.b.d F;
    private float G;
    private boolean H;
    private List<com.applovin.exoplayer2.i.a> I;
    private boolean J;
    private boolean K;
    private com.applovin.exoplayer2.l.aa L;
    private boolean M;
    private boolean N;
    private o O;
    private com.applovin.exoplayer2.m.o P;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ar[] f4303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.g f4304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f4305d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final r f4306e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final b f4307f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c f4308g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final CopyOnWriteArraySet<an.d> f4309h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.applovin.exoplayer2.a.a f4310i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.applovin.exoplayer2.b f4311j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.applovin.exoplayer2.c f4312k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ay f4313l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final bb f4314m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final bc f4315n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final long f4316o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private v f4317p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private v f4318q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private AudioTrack f4319r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Object f4320s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Surface f4321t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private SurfaceHolder f4322u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private com.applovin.exoplayer2.m.a.i f4323v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f4324w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private TextureView f4325x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f4326y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f4327z;

    @Deprecated
    public static final class a {
        private boolean A;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f4328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final au f4329b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private com.applovin.exoplayer2.l.d f4330c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f4331d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private com.applovin.exoplayer2.j.j f4332e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private com.applovin.exoplayer2.h.r f4333f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private aa f4334g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private com.applovin.exoplayer2.k.d f4335h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private com.applovin.exoplayer2.a.a f4336i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Looper f4337j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private com.applovin.exoplayer2.l.aa f4338k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private com.applovin.exoplayer2.b.d f4339l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f4340m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f4341n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f4342o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private boolean f4343p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f4344q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f4345r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f4346s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private av f4347t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private long f4348u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private long f4349v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private z f4350w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private long f4351x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private long f4352y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private boolean f4353z;

        @Deprecated
        public a(Context context) {
            this(context, new n(context), new com.applovin.exoplayer2.e.f());
        }

        @Deprecated
        public a(Context context, au auVar, com.applovin.exoplayer2.e.l lVar) {
            this(context, auVar, new com.applovin.exoplayer2.j.c(context), new com.applovin.exoplayer2.h.f(context, lVar), new l(), com.applovin.exoplayer2.k.n.a(context), new com.applovin.exoplayer2.a.a(com.applovin.exoplayer2.l.d.f7613a));
        }

        @Deprecated
        public a(Context context, au auVar, com.applovin.exoplayer2.j.j jVar, com.applovin.exoplayer2.h.r rVar, aa aaVar, com.applovin.exoplayer2.k.d dVar, com.applovin.exoplayer2.a.a aVar) {
            this.f4328a = context;
            this.f4329b = auVar;
            this.f4332e = jVar;
            this.f4333f = rVar;
            this.f4334g = aaVar;
            this.f4335h = dVar;
            this.f4336i = aVar;
            this.f4337j = com.applovin.exoplayer2.l.ai.c();
            this.f4339l = com.applovin.exoplayer2.b.d.f4412a;
            this.f4341n = 0;
            this.f4344q = 1;
            this.f4345r = 0;
            this.f4346s = true;
            this.f4347t = av.f4300e;
            this.f4348u = 5000L;
            this.f4349v = 15000L;
            this.f4350w = new k.a().a();
            this.f4330c = com.applovin.exoplayer2.l.d.f7613a;
            this.f4351x = 500L;
            this.f4352y = 2000L;
        }

        @Deprecated
        public aw a() {
            com.applovin.exoplayer2.l.a.b(!this.A);
            this.A = true;
            return new aw(this);
        }
    }

    public final class b implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, an.b, ay.a, com.applovin.exoplayer2.b.InterfaceC0072b, com.applovin.exoplayer2.b.g, com.applovin.exoplayer2.c.b, com.applovin.exoplayer2.g.e, com.applovin.exoplayer2.i.l, com.applovin.exoplayer2.m.a.i.a, com.applovin.exoplayer2.m.n, q.a {
        private b() {
        }

        @Override // com.applovin.exoplayer2.b.InterfaceC0072b
        public void a() {
            aw.this.a(false, -1, 3);
        }

        @Override // com.applovin.exoplayer2.c.b
        public void a(float f10) {
            aw.this.W();
        }

        @Override // com.applovin.exoplayer2.c.b
        public void a(int i10) {
            boolean zX = aw.this.x();
            aw.this.a(zX, i10, aw.b(zX, i10));
        }

        @Override // com.applovin.exoplayer2.m.n
        public void a(int i10, long j10) {
            aw.this.f4310i.a(i10, j10);
        }

        @Override // com.applovin.exoplayer2.b.g
        public void a(int i10, long j10, long j11) {
            aw.this.f4310i.a(i10, j10, j11);
        }

        @Override // com.applovin.exoplayer2.ay.a
        public void a(int i10, boolean z10) {
            Iterator it = aw.this.f4309h.iterator();
            while (it.hasNext()) {
                ((an.d) it.next()).a(i10, z10);
            }
        }

        @Override // com.applovin.exoplayer2.b.g
        public void a(long j10) {
            aw.this.f4310i.a(j10);
        }

        @Override // com.applovin.exoplayer2.m.n
        public void a(long j10, int i10) {
            aw.this.f4310i.a(j10, i10);
        }

        @Override // com.applovin.exoplayer2.m.a.i.a
        public void a(Surface surface) {
            aw.this.a((Object) null);
        }

        @Override // com.applovin.exoplayer2.m.n
        public void a(com.applovin.exoplayer2.c.e eVar) {
            aw.this.C = eVar;
            aw.this.f4310i.a(eVar);
        }

        @Override // com.applovin.exoplayer2.g.e
        public void a(com.applovin.exoplayer2.g.a aVar) {
            aw.this.f4310i.a(aVar);
            aw.this.f4306e.a(aVar);
            Iterator it = aw.this.f4309h.iterator();
            while (it.hasNext()) {
                ((an.d) it.next()).a(aVar);
            }
        }

        @Override // com.applovin.exoplayer2.m.n
        public void a(com.applovin.exoplayer2.m.o oVar) {
            aw.this.P = oVar;
            aw.this.f4310i.a(oVar);
            Iterator it = aw.this.f4309h.iterator();
            while (it.hasNext()) {
                ((an.d) it.next()).a(oVar);
            }
        }

        @Override // com.applovin.exoplayer2.m.n
        public void a(v vVar, com.applovin.exoplayer2.c.h hVar) {
            aw.this.f4317p = vVar;
            aw.this.f4310i.a(vVar, hVar);
        }

        @Override // com.applovin.exoplayer2.m.n
        public void a(Exception exc) {
            aw.this.f4310i.a(exc);
        }

        @Override // com.applovin.exoplayer2.m.n
        public void a(Object obj, long j10) {
            aw.this.f4310i.a(obj, j10);
            if (aw.this.f4320s == obj) {
                Iterator it = aw.this.f4309h.iterator();
                while (it.hasNext()) {
                    ((an.d) it.next()).a();
                }
            }
        }

        @Override // com.applovin.exoplayer2.m.n
        public void a(String str) {
            aw.this.f4310i.a(str);
        }

        @Override // com.applovin.exoplayer2.m.n
        public void a(String str, long j10, long j11) {
            aw.this.f4310i.a(str, j10, j11);
        }

        @Override // com.applovin.exoplayer2.i.l
        public void a(List<com.applovin.exoplayer2.i.a> list) {
            aw.this.I = list;
            Iterator it = aw.this.f4309h.iterator();
            while (it.hasNext()) {
                ((an.d) it.next()).a(list);
            }
        }

        @Override // com.applovin.exoplayer2.b.g
        public void a_(boolean z10) {
            if (aw.this.H == z10) {
                return;
            }
            aw.this.H = z10;
            aw.this.X();
        }

        @Override // com.applovin.exoplayer2.an.b
        public void b(int i10) {
            aw.this.Y();
        }

        @Override // com.applovin.exoplayer2.m.n
        public void b(com.applovin.exoplayer2.c.e eVar) {
            aw.this.f4310i.b(eVar);
            aw.this.f4317p = null;
            aw.this.C = null;
        }

        @Override // com.applovin.exoplayer2.b.g
        public void b(v vVar, com.applovin.exoplayer2.c.h hVar) {
            aw.this.f4318q = vVar;
            aw.this.f4310i.b(vVar, hVar);
        }

        @Override // com.applovin.exoplayer2.b.g
        public void b(Exception exc) {
            aw.this.f4310i.b(exc);
        }

        @Override // com.applovin.exoplayer2.b.g
        public void b(String str) {
            aw.this.f4310i.b(str);
        }

        @Override // com.applovin.exoplayer2.b.g
        public void b(String str, long j10, long j11) {
            aw.this.f4310i.b(str, j10, j11);
        }

        @Override // com.applovin.exoplayer2.q.a
        public void b(boolean z10) {
            aw.this.Y();
        }

        @Override // com.applovin.exoplayer2.an.b
        public void b(boolean z10, int i10) {
            aw.this.Y();
        }

        @Override // com.applovin.exoplayer2.an.b
        public void b_(boolean z10) {
            aw awVar;
            if (aw.this.L != null) {
                boolean z11 = false;
                if (z10 && !aw.this.M) {
                    aw.this.L.a(0);
                    awVar = aw.this;
                    z11 = true;
                } else {
                    if (z10 || !aw.this.M) {
                        return;
                    }
                    aw.this.L.b(0);
                    awVar = aw.this;
                }
                awVar.M = z11;
            }
        }

        @Override // com.applovin.exoplayer2.b.g
        public void c(com.applovin.exoplayer2.c.e eVar) {
            aw.this.D = eVar;
            aw.this.f4310i.c(eVar);
        }

        @Override // com.applovin.exoplayer2.b.g
        public void c(Exception exc) {
            aw.this.f4310i.c(exc);
        }

        @Override // com.applovin.exoplayer2.b.g
        public void d(com.applovin.exoplayer2.c.e eVar) {
            aw.this.f4310i.d(eVar);
            aw.this.f4318q = null;
            aw.this.D = null;
        }

        @Override // com.applovin.exoplayer2.ay.a
        public void f(int i10) {
            o oVarB = aw.b(aw.this.f4313l);
            if (oVarB.equals(aw.this.O)) {
                return;
            }
            aw.this.O = oVarB;
            Iterator it = aw.this.f4309h.iterator();
            while (it.hasNext()) {
                ((an.d) it.next()).a(oVarB);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            aw.this.a(surfaceTexture);
            aw.this.a(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            aw.this.a((Object) null);
            aw.this.a(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            aw.this.a(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            aw.this.a(i11, i12);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (aw.this.f4324w) {
                aw.this.a(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (aw.this.f4324w) {
                aw.this.a((Object) null);
            }
            aw.this.a(0, 0);
        }
    }

    public static final class c implements ao.b, com.applovin.exoplayer2.m.a.a, com.applovin.exoplayer2.m.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.applovin.exoplayer2.m.l f4355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.applovin.exoplayer2.m.a.a f4356b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private com.applovin.exoplayer2.m.l f4357c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private com.applovin.exoplayer2.m.a.a f4358d;

        private c() {
        }

        @Override // com.applovin.exoplayer2.m.a.a
        public void a() {
            com.applovin.exoplayer2.m.a.a aVar = this.f4358d;
            if (aVar != null) {
                aVar.a();
            }
            com.applovin.exoplayer2.m.a.a aVar2 = this.f4356b;
            if (aVar2 != null) {
                aVar2.a();
            }
        }

        @Override // com.applovin.exoplayer2.ao.b
        public void a(int i10, Object obj) {
            com.applovin.exoplayer2.m.a.a cameraMotionListener;
            if (i10 == 7) {
                this.f4355a = (com.applovin.exoplayer2.m.l) obj;
                return;
            }
            if (i10 == 8) {
                this.f4356b = (com.applovin.exoplayer2.m.a.a) obj;
                return;
            }
            if (i10 != 10000) {
                return;
            }
            com.applovin.exoplayer2.m.a.i iVar = (com.applovin.exoplayer2.m.a.i) obj;
            if (iVar == null) {
                cameraMotionListener = null;
                this.f4357c = null;
            } else {
                this.f4357c = iVar.getVideoFrameMetadataListener();
                cameraMotionListener = iVar.getCameraMotionListener();
            }
            this.f4358d = cameraMotionListener;
        }

        @Override // com.applovin.exoplayer2.m.l
        public void a(long j10, long j11, v vVar, MediaFormat mediaFormat) {
            com.applovin.exoplayer2.m.l lVar = this.f4357c;
            if (lVar != null) {
                lVar.a(j10, j11, vVar, mediaFormat);
            }
            com.applovin.exoplayer2.m.l lVar2 = this.f4355a;
            if (lVar2 != null) {
                lVar2.a(j10, j11, vVar, mediaFormat);
            }
        }

        @Override // com.applovin.exoplayer2.m.a.a
        public void a(long j10, float[] fArr) {
            com.applovin.exoplayer2.m.a.a aVar = this.f4358d;
            if (aVar != null) {
                aVar.a(j10, fArr);
            }
            com.applovin.exoplayer2.m.a.a aVar2 = this.f4356b;
            if (aVar2 != null) {
                aVar2.a(j10, fArr);
            }
        }
    }

    public aw(a aVar) throws Throwable {
        aw awVar;
        com.applovin.exoplayer2.l.g gVar = new com.applovin.exoplayer2.l.g();
        this.f4304c = gVar;
        try {
            Context applicationContext = aVar.f4328a.getApplicationContext();
            this.f4305d = applicationContext;
            com.applovin.exoplayer2.a.a aVar2 = aVar.f4336i;
            this.f4310i = aVar2;
            this.L = aVar.f4338k;
            this.F = aVar.f4339l;
            this.f4326y = aVar.f4344q;
            this.f4327z = aVar.f4345r;
            this.H = aVar.f4343p;
            this.f4316o = aVar.f4352y;
            b bVar = new b();
            this.f4307f = bVar;
            c cVar = new c();
            this.f4308g = cVar;
            this.f4309h = new CopyOnWriteArraySet<>();
            Handler handler = new Handler(aVar.f4337j);
            ar[] arVarArrA = aVar.f4329b.a(handler, bVar, bVar, bVar, bVar);
            this.f4303b = arVarArrA;
            this.G = 1.0f;
            this.E = com.applovin.exoplayer2.l.ai.f7595a < 21 ? d(0) : h.a(applicationContext);
            this.I = Collections.emptyList();
            this.J = true;
            try {
                r rVar = new r(arVarArrA, aVar.f4332e, aVar.f4333f, aVar.f4334g, aVar.f4335h, aVar2, aVar.f4346s, aVar.f4347t, aVar.f4348u, aVar.f4349v, aVar.f4350w, aVar.f4351x, aVar.f4353z, aVar.f4330c, aVar.f4337j, this, new an.a.C0071a().a(20, 21, 22, 23, 24, 25, 26, 27).a());
                awVar = this;
                try {
                    awVar.f4306e = rVar;
                    rVar.a((an.b) bVar);
                    rVar.a((q.a) bVar);
                    if (aVar.f4331d > 0) {
                        rVar.b(aVar.f4331d);
                    }
                    com.applovin.exoplayer2.b bVar2 = new com.applovin.exoplayer2.b(aVar.f4328a, handler, bVar);
                    awVar.f4311j = bVar2;
                    bVar2.a(aVar.f4342o);
                    com.applovin.exoplayer2.c cVar2 = new com.applovin.exoplayer2.c(aVar.f4328a, handler, bVar);
                    awVar.f4312k = cVar2;
                    cVar2.a(aVar.f4340m ? awVar.F : null);
                    ay ayVar = new ay(aVar.f4328a, handler, bVar);
                    awVar.f4313l = ayVar;
                    ayVar.a(com.applovin.exoplayer2.l.ai.g(awVar.F.f4416d));
                    bb bbVar = new bb(aVar.f4328a);
                    awVar.f4314m = bbVar;
                    bbVar.a(aVar.f4341n != 0);
                    bc bcVar = new bc(aVar.f4328a);
                    awVar.f4315n = bcVar;
                    bcVar.a(aVar.f4341n == 2);
                    awVar.O = b(ayVar);
                    awVar.P = com.applovin.exoplayer2.m.o.f7878a;
                    awVar.a(1, 10, Integer.valueOf(awVar.E));
                    awVar.a(2, 10, Integer.valueOf(awVar.E));
                    awVar.a(1, 3, awVar.F);
                    awVar.a(2, 4, Integer.valueOf(awVar.f4326y));
                    awVar.a(2, 5, Integer.valueOf(awVar.f4327z));
                    awVar.a(1, 9, Boolean.valueOf(awVar.H));
                    awVar.a(2, 7, cVar);
                    awVar.a(6, 8, cVar);
                    gVar.a();
                } catch (Throwable th) {
                    th = th;
                    awVar.f4304c.a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                awVar = this;
            }
        } catch (Throwable th3) {
            th = th3;
            awVar = this;
        }
    }

    private void U() {
        if (this.f4323v != null) {
            this.f4306e.a(this.f4308g).a(10000).a((Object) null).i();
            this.f4323v.b(this.f4307f);
            this.f4323v = null;
        }
        TextureView textureView = this.f4325x;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f4307f) {
                com.applovin.exoplayer2.l.q.c("SimpleExoPlayer", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f4325x.setSurfaceTextureListener(null);
            }
            this.f4325x = null;
        }
        SurfaceHolder surfaceHolder = this.f4322u;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f4307f);
            this.f4322u = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W() {
        a(1, 2, Float.valueOf(this.G * this.f4312k.a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X() {
        this.f4310i.a_(this.H);
        Iterator<an.d> it = this.f4309h.iterator();
        while (it.hasNext()) {
            it.next().a_(this.H);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y() {
        int iT = t();
        if (iT != 1) {
            if (iT == 2 || iT == 3) {
                this.f4314m.b(x() && !q());
                this.f4315n.b(x());
                return;
            } else if (iT != 4) {
                throw new IllegalStateException();
            }
        }
        this.f4314m.b(false);
        this.f4315n.b(false);
    }

    private void Z() {
        this.f4304c.d();
        if (Thread.currentThread() != r().getThread()) {
            String strA = com.applovin.exoplayer2.l.ai.a("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), r().getThread().getName());
            if (this.J) {
                throw new IllegalStateException(strA);
            }
            com.applovin.exoplayer2.l.q.b("SimpleExoPlayer", strA, this.K ? null : new IllegalStateException());
            this.K = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, int i11) {
        if (i10 == this.A && i11 == this.B) {
            return;
        }
        this.A = i10;
        this.B = i11;
        this.f4310i.a(i10, i11);
        Iterator<an.d> it = this.f4309h.iterator();
        while (it.hasNext()) {
            it.next().a(i10, i11);
        }
    }

    private void a(int i10, int i11, Object obj) {
        for (ar arVar : this.f4303b) {
            if (arVar.a() == i10) {
                this.f4306e.a(arVar).a(i11).a(obj).i();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        a(surface);
        this.f4321t = surface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Object obj) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        ar[] arVarArr = this.f4303b;
        int length = arVarArr.length;
        int i10 = 0;
        while (true) {
            z10 = true;
            if (i10 >= length) {
                break;
            }
            ar arVar = arVarArr[i10];
            if (arVar.a() == 2) {
                arrayList.add(this.f4306e.a(arVar).a(1).a(obj).i());
            }
            i10++;
        }
        Object obj2 = this.f4320s;
        if (obj2 == null || obj2 == obj) {
            z10 = false;
        } else {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ao) it.next()).a(this.f4316o);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z10 = false;
            Object obj3 = this.f4320s;
            Surface surface = this.f4321t;
            if (obj3 == surface) {
                surface.release();
                this.f4321t = null;
            }
        }
        this.f4320s = obj;
        if (z10) {
            this.f4306e.a(false, p.a(new u(3), 1003));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10, int i10, int i11) {
        int i12 = 0;
        boolean z11 = z10 && i10 != -1;
        if (z11 && i10 != 1) {
            i12 = 1;
        }
        this.f4306e.a(z11, i12, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(boolean z10, int i10) {
        return (!z10 || i10 == 1) ? 1 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static o b(ay ayVar) {
        return new o(0, ayVar.a(), ayVar.b());
    }

    private void c(SurfaceHolder surfaceHolder) {
        this.f4324w = false;
        this.f4322u = surfaceHolder;
        surfaceHolder.addCallback(this.f4307f);
        Surface surface = this.f4322u.getSurface();
        if (surface == null || !surface.isValid()) {
            a(0, 0);
        } else {
            Rect surfaceFrame = this.f4322u.getSurfaceFrame();
            a(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    private int d(int i10) {
        AudioTrack audioTrack = this.f4319r;
        if (audioTrack != null && audioTrack.getAudioSessionId() != i10) {
            this.f4319r.release();
            this.f4319r = null;
        }
        if (this.f4319r == null) {
            this.f4319r = new AudioTrack(3, 4000, 4, 2, 2, 0, i10);
        }
        return this.f4319r.getAudioSessionId();
    }

    @Override // com.applovin.exoplayer2.an
    public long A() {
        Z();
        return this.f4306e.A();
    }

    @Override // com.applovin.exoplayer2.an
    public long B() {
        Z();
        return this.f4306e.B();
    }

    @Override // com.applovin.exoplayer2.an
    public long C() {
        Z();
        return this.f4306e.C();
    }

    @Override // com.applovin.exoplayer2.an
    public am D() {
        Z();
        return this.f4306e.D();
    }

    public void E() {
        AudioTrack audioTrack;
        Z();
        if (com.applovin.exoplayer2.l.ai.f7595a < 21 && (audioTrack = this.f4319r) != null) {
            audioTrack.release();
            this.f4319r = null;
        }
        this.f4311j.a(false);
        this.f4313l.c();
        this.f4314m.b(false);
        this.f4315n.b(false);
        this.f4312k.b();
        this.f4306e.E();
        this.f4310i.c();
        U();
        Surface surface = this.f4321t;
        if (surface != null) {
            surface.release();
            this.f4321t = null;
        }
        if (this.M) {
            ((com.applovin.exoplayer2.l.aa) com.applovin.exoplayer2.l.a.b(this.L)).b(0);
            this.M = false;
        }
        this.I = Collections.emptyList();
        this.N = true;
    }

    @Override // com.applovin.exoplayer2.an
    public int F() {
        Z();
        return this.f4306e.F();
    }

    @Override // com.applovin.exoplayer2.an
    public int G() {
        Z();
        return this.f4306e.G();
    }

    @Override // com.applovin.exoplayer2.an
    public long H() {
        Z();
        return this.f4306e.H();
    }

    @Override // com.applovin.exoplayer2.an
    public long I() {
        Z();
        return this.f4306e.I();
    }

    @Override // com.applovin.exoplayer2.an
    public long J() {
        Z();
        return this.f4306e.J();
    }

    @Override // com.applovin.exoplayer2.an
    public boolean K() {
        Z();
        return this.f4306e.K();
    }

    @Override // com.applovin.exoplayer2.an
    public int L() {
        Z();
        return this.f4306e.L();
    }

    @Override // com.applovin.exoplayer2.an
    public int M() {
        Z();
        return this.f4306e.M();
    }

    @Override // com.applovin.exoplayer2.an
    public long N() {
        Z();
        return this.f4306e.N();
    }

    @Override // com.applovin.exoplayer2.an
    public long O() {
        Z();
        return this.f4306e.O();
    }

    @Override // com.applovin.exoplayer2.an
    public com.applovin.exoplayer2.h.ad P() {
        Z();
        return this.f4306e.P();
    }

    @Override // com.applovin.exoplayer2.an
    public com.applovin.exoplayer2.j.h Q() {
        Z();
        return this.f4306e.Q();
    }

    @Override // com.applovin.exoplayer2.an
    public ac R() {
        return this.f4306e.R();
    }

    @Override // com.applovin.exoplayer2.an
    public ba S() {
        Z();
        return this.f4306e.S();
    }

    @Override // com.applovin.exoplayer2.an
    public com.applovin.exoplayer2.m.o T() {
        return this.P;
    }

    @Override // com.applovin.exoplayer2.an
    public List<com.applovin.exoplayer2.i.a> V() {
        Z();
        return this.I;
    }

    public void a(float f10) {
        Z();
        float fA = com.applovin.exoplayer2.l.ai.a(f10, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 1.0f);
        if (this.G == fA) {
            return;
        }
        this.G = fA;
        W();
        this.f4310i.a(fA);
        Iterator<an.d> it = this.f4309h.iterator();
        while (it.hasNext()) {
            it.next().a(fA);
        }
    }

    @Override // com.applovin.exoplayer2.an
    public void a(int i10, long j10) {
        Z();
        this.f4310i.d();
        this.f4306e.a(i10, j10);
    }

    public void a(SurfaceHolder surfaceHolder) {
        Z();
        if (surfaceHolder == null) {
            v();
            return;
        }
        U();
        this.f4324w = true;
        this.f4322u = surfaceHolder;
        surfaceHolder.addCallback(this.f4307f);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            a((Object) null);
            a(0, 0);
        } else {
            a(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            a(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // com.applovin.exoplayer2.an
    public void a(SurfaceView surfaceView) {
        Z();
        if (surfaceView instanceof com.applovin.exoplayer2.m.k) {
            U();
            a((Object) surfaceView);
        } else {
            if (!(surfaceView instanceof com.applovin.exoplayer2.m.a.i)) {
                a(surfaceView == null ? null : surfaceView.getHolder());
                return;
            }
            U();
            this.f4323v = (com.applovin.exoplayer2.m.a.i) surfaceView;
            this.f4306e.a(this.f4308g).a(10000).a(this.f4323v).i();
            this.f4323v.a(this.f4307f);
            a(this.f4323v.getVideoSurface());
        }
        c(surfaceView.getHolder());
    }

    @Override // com.applovin.exoplayer2.an
    public void a(TextureView textureView) {
        Z();
        if (textureView == null) {
            v();
            return;
        }
        U();
        this.f4325x = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            com.applovin.exoplayer2.l.q.c("SimpleExoPlayer", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f4307f);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            a((Object) null);
            a(0, 0);
        } else {
            a(surfaceTexture);
            a(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Deprecated
    public void a(an.b bVar) {
        com.applovin.exoplayer2.l.a.b(bVar);
        this.f4306e.a(bVar);
    }

    @Override // com.applovin.exoplayer2.an
    public void a(an.d dVar) {
        com.applovin.exoplayer2.l.a.b(dVar);
        this.f4309h.add(dVar);
        a((an.b) dVar);
    }

    public void a(com.applovin.exoplayer2.h.p pVar) {
        Z();
        this.f4306e.a(pVar);
    }

    @Override // com.applovin.exoplayer2.an
    public void a(boolean z10) {
        Z();
        int iA = this.f4312k.a(z10, t());
        a(z10, iA, b(z10, iA));
    }

    @Override // com.applovin.exoplayer2.an, com.applovin.exoplayer2.q
    /* JADX INFO: renamed from: b */
    public p e() {
        Z();
        return this.f4306e.e();
    }

    public void b(SurfaceHolder surfaceHolder) {
        Z();
        if (surfaceHolder == null || surfaceHolder != this.f4322u) {
            return;
        }
        v();
    }

    @Override // com.applovin.exoplayer2.an
    public void b(SurfaceView surfaceView) {
        Z();
        b(surfaceView == null ? null : surfaceView.getHolder());
    }

    @Override // com.applovin.exoplayer2.an
    public void b(TextureView textureView) {
        Z();
        if (textureView == null || textureView != this.f4325x) {
            return;
        }
        v();
    }

    @Deprecated
    public void b(an.b bVar) {
        this.f4306e.b(bVar);
    }

    @Override // com.applovin.exoplayer2.an
    public void b(an.d dVar) {
        com.applovin.exoplayer2.l.a.b(dVar);
        this.f4309h.remove(dVar);
        b((an.b) dVar);
    }

    @Override // com.applovin.exoplayer2.an
    public void b(boolean z10) {
        Z();
        this.f4306e.b(z10);
    }

    @Override // com.applovin.exoplayer2.an
    public void c(int i10) {
        Z();
        this.f4306e.c(i10);
    }

    public boolean q() {
        Z();
        return this.f4306e.q();
    }

    @Override // com.applovin.exoplayer2.an
    public Looper r() {
        return this.f4306e.r();
    }

    @Override // com.applovin.exoplayer2.an
    public an.a s() {
        Z();
        return this.f4306e.s();
    }

    @Override // com.applovin.exoplayer2.an
    public int t() {
        Z();
        return this.f4306e.t();
    }

    @Override // com.applovin.exoplayer2.an
    public int u() {
        Z();
        return this.f4306e.u();
    }

    public void v() {
        Z();
        U();
        a((Object) null);
        a(0, 0);
    }

    @Override // com.applovin.exoplayer2.an
    public void w() {
        Z();
        boolean zX = x();
        int iA = this.f4312k.a(zX, 2);
        a(zX, iA, b(zX, iA));
        this.f4306e.w();
    }

    @Override // com.applovin.exoplayer2.an
    public boolean x() {
        Z();
        return this.f4306e.x();
    }

    @Override // com.applovin.exoplayer2.an
    public int y() {
        Z();
        return this.f4306e.y();
    }

    @Override // com.applovin.exoplayer2.an
    public boolean z() {
        Z();
        return this.f4306e.z();
    }
}
