package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class je implements nc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<nc0.c> f22020a = new ArrayList<>(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashSet<nc0.c> f22021b = new HashSet<>(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final oc0.a f22022c = new oc0.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.yandex.mobile.ads.exo.drm.f.a f22023d = new com.yandex.mobile.ads.exo.drm.f.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Looper f22024e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private v61 f22025f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private gr0 f22026g;

    public final com.yandex.mobile.ads.exo.drm.f.a a(int i10, nc0.b bVar) {
        return this.f22023d.a(i10, bVar);
    }

    public final com.yandex.mobile.ads.exo.drm.f.a a(nc0.b bVar) {
        return this.f22023d.a(0, bVar);
    }

    public void a() {
    }

    @Override // com.yandex.mobile.ads.impl.nc0
    public final void a(Handler handler, com.yandex.mobile.ads.exo.drm.f fVar) {
        this.f22023d.a(handler, fVar);
    }

    @Override // com.yandex.mobile.ads.impl.nc0
    public final void a(Handler handler, oc0 oc0Var) {
        this.f22022c.a(handler, oc0Var);
    }

    @Override // com.yandex.mobile.ads.impl.nc0
    public final void a(com.yandex.mobile.ads.exo.drm.f fVar) {
        this.f22023d.e(fVar);
    }

    public abstract void a(g81 g81Var);

    @Override // com.yandex.mobile.ads.impl.nc0
    public final void a(nc0.c cVar) {
        this.f22020a.remove(cVar);
        if (!this.f22020a.isEmpty()) {
            b(cVar);
            return;
        }
        this.f22024e = null;
        this.f22025f = null;
        this.f22026g = null;
        this.f22021b.clear();
        e();
    }

    @Override // com.yandex.mobile.ads.impl.nc0
    public final void a(nc0.c cVar, g81 g81Var, gr0 gr0Var) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f22024e;
        pa.a(looper == null || looper == looperMyLooper);
        this.f22026g = gr0Var;
        v61 v61Var = this.f22025f;
        this.f22020a.add(cVar);
        if (this.f22024e == null) {
            this.f22024e = looperMyLooper;
            this.f22021b.add(cVar);
            a(g81Var);
        } else if (v61Var != null) {
            c(cVar);
            cVar.a(this, v61Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.nc0
    public final void a(oc0 oc0Var) {
        this.f22022c.a(oc0Var);
    }

    public final void a(v61 v61Var) {
        this.f22025f = v61Var;
        Iterator<nc0.c> it = this.f22020a.iterator();
        while (it.hasNext()) {
            it.next().a(this, v61Var);
        }
    }

    public final oc0.a b(int i10, nc0.b bVar) {
        return this.f22022c.a(i10, bVar);
    }

    public final oc0.a b(nc0.b bVar) {
        return this.f22022c.a(0, bVar);
    }

    public void b() {
    }

    @Override // com.yandex.mobile.ads.impl.nc0
    public final void b(nc0.c cVar) {
        boolean z10 = !this.f22021b.isEmpty();
        this.f22021b.remove(cVar);
        if (z10 && this.f22021b.isEmpty()) {
            a();
        }
    }

    public final gr0 c() {
        return (gr0) pa.b(this.f22026g);
    }

    @Override // com.yandex.mobile.ads.impl.nc0
    public final void c(nc0.c cVar) {
        Objects.requireNonNull(this.f22024e);
        boolean zIsEmpty = this.f22021b.isEmpty();
        this.f22021b.add(cVar);
        if (zIsEmpty) {
            b();
        }
    }

    public final boolean d() {
        return !this.f22021b.isEmpty();
    }

    public abstract void e();
}
