package com.yandex.mobile.ads.impl;

import android.view.TextureView;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class ft implements fl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final os f20853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final rc0 f20854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final lf1 f20855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final el0 f20856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f20857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final tf1 f20858f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final xs f20859g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private vl0 f20860h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private qd1 f20861i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f20862j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f20863k;

    public class a implements dr0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f20864a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f20865b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f20866c;

        private a() {
            this.f20865b = false;
            this.f20866c = false;
        }

        public /* synthetic */ a(ft ftVar, int i10) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.dr0.b
        public final void b(ns nsVar) {
            pd1 pd1Var;
            this.f20864a = false;
            ft.this.f20859g.b();
            ft.this.f20853a.stop();
            ft.this.f20855c.a(nsVar != null ? nsVar.getMessage() : null);
            if (ft.this.f20861i == null || ft.this.f20860h == null) {
                return;
            }
            if (nsVar != null) {
                Objects.requireNonNull(ft.this.f20856d);
                pd1Var = el0.a(nsVar);
            } else {
                pd1Var = new pd1(29, new so());
            }
            qd1 qd1Var = ft.this.f20861i;
            fd1 unused = ft.this.f20860h;
            qd1Var.a(pd1Var);
        }

        @Override // com.yandex.mobile.ads.impl.dr0.b
        public final void onIsPlayingChanged(boolean z10) {
            if (!z10) {
                if (this.f20865b) {
                    return;
                }
                this.f20866c = true;
                if (ft.this.f20861i == null || ft.this.f20860h == null) {
                    return;
                }
                qd1 qd1Var = ft.this.f20861i;
                fd1 unused = ft.this.f20860h;
                qd1Var.i();
                return;
            }
            if (!this.f20864a) {
                if (ft.this.f20861i == null || ft.this.f20860h == null) {
                    return;
                }
                this.f20864a = true;
                qd1 qd1Var2 = ft.this.f20861i;
                fd1 unused2 = ft.this.f20860h;
                qd1Var2.c();
                return;
            }
            if (this.f20866c) {
                this.f20866c = false;
                if (ft.this.f20861i == null || ft.this.f20860h == null) {
                    return;
                }
                qd1 qd1Var3 = ft.this.f20861i;
                fd1 unused3 = ft.this.f20860h;
                qd1Var3.f();
            }
        }

        @Override // com.yandex.mobile.ads.impl.dr0.b
        public final void onPlaybackStateChanged(int i10) {
            if (i10 == 3) {
                ft.this.f20859g.b();
                if (ft.this.f20861i != null && ft.this.f20860h != null) {
                    qd1 qd1Var = ft.this.f20861i;
                    fd1 unused = ft.this.f20860h;
                    qd1Var.h();
                }
                if (this.f20865b) {
                    this.f20865b = false;
                    if (ft.this.f20861i == null || ft.this.f20860h == null) {
                        return;
                    }
                    qd1 qd1Var2 = ft.this.f20861i;
                    fd1 unused2 = ft.this.f20860h;
                    qd1Var2.a();
                    return;
                }
                return;
            }
            if (i10 == 2) {
                this.f20865b = true;
                if (ft.this.f20861i == null || ft.this.f20860h == null) {
                    return;
                }
                qd1 qd1Var3 = ft.this.f20861i;
                fd1 unused3 = ft.this.f20860h;
                qd1Var3.b();
                return;
            }
            if (i10 == 4) {
                this.f20864a = false;
                if (ft.this.f20861i == null || ft.this.f20860h == null) {
                    return;
                }
                qd1 qd1Var4 = ft.this.f20861i;
                fd1 unused4 = ft.this.f20860h;
                qd1Var4.d();
            }
        }
    }

    public ft(os osVar, rc0 rc0Var, lf1 lf1Var) {
        this.f20853a = osVar;
        this.f20854b = rc0Var;
        this.f20855c = lf1Var;
        a aVar = new a(this, 0);
        this.f20857e = aVar;
        osVar.b(aVar);
        tf1 tf1Var = new tf1();
        this.f20858f = tf1Var;
        this.f20859g = new xs(aVar);
        osVar.b(tf1Var);
        this.f20856d = new el0();
    }

    public final void a() {
        this.f20863k = true;
        i();
    }

    public final void a(float f10) {
        if (this.f20862j) {
            return;
        }
        this.f20853a.setVolume(f10);
        qd1 qd1Var = this.f20861i;
        if (qd1Var == null || this.f20860h == null) {
            return;
        }
        qd1Var.onVolumeChanged(f10);
    }

    public final void a(int i10) {
        if (this.f20862j) {
            return;
        }
        this.f20858f.b(i10);
    }

    public final void a(TextureView textureView) {
        if (this.f20862j) {
            return;
        }
        this.f20858f.a(textureView);
        this.f20853a.setVideoTextureView(textureView);
    }

    public final void a(qd1 qd1Var) {
        this.f20861i = qd1Var;
    }

    public final void a(vl0 vl0Var) {
        this.f20860h = vl0Var;
        if (this.f20862j) {
            return;
        }
        it0 it0VarA = this.f20854b.a(vl0Var);
        this.f20853a.setPlayWhenReady(false);
        this.f20853a.a(it0VarA);
        this.f20853a.prepare();
        this.f20859g.a();
    }

    public final void b() {
        this.f20863k = false;
    }

    public final long c() {
        return this.f20853a.getDuration();
    }

    public final long d() {
        return this.f20853a.getCurrentPosition();
    }

    public final float e() {
        return this.f20853a.getVolume();
    }

    public final void f() {
        if (this.f20862j) {
            return;
        }
        this.f20862j = true;
        this.f20863k = false;
        this.f20859g.b();
        this.f20853a.setVideoTextureView(null);
        this.f20858f.a((TextureView) null);
        this.f20853a.a(this.f20857e);
        this.f20853a.a(this.f20858f);
        this.f20853a.release();
    }

    public final boolean g() {
        return this.f20862j;
    }

    public final boolean h() {
        return ((le) this.f20853a).b();
    }

    public final void i() {
        if (this.f20862j) {
            return;
        }
        this.f20853a.setPlayWhenReady(false);
    }

    public final void j() {
        if (!this.f20862j) {
            this.f20853a.setPlayWhenReady(true);
        }
        if (this.f20863k) {
            i();
        }
    }

    public final void k() {
        if (this.f20862j || this.f20863k) {
            return;
        }
        this.f20853a.setPlayWhenReady(true);
    }

    public final void l() {
        if (this.f20862j) {
            return;
        }
        qd1 qd1Var = this.f20861i;
        if (qd1Var != null && this.f20860h != null) {
            qd1Var.e();
        }
        this.f20862j = true;
        this.f20863k = false;
        this.f20859g.b();
        this.f20853a.setVideoTextureView(null);
        this.f20858f.a((TextureView) null);
        this.f20853a.a(this.f20857e);
        this.f20853a.a(this.f20858f);
        this.f20853a.release();
    }
}
