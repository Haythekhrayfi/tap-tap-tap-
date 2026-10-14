package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class v20 implements wv, ze1, a30, gf0, tv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashSet f25788a = new LinkedHashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LinkedHashSet f25789b = new LinkedHashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LinkedHashSet f25790c = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LinkedHashSet f25791d = new LinkedHashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final LinkedHashSet f25792e = new LinkedHashSet();

    @Override // com.yandex.mobile.ads.impl.wv
    public final void a() {
        Iterator it = this.f25788a.iterator();
        while (it.hasNext()) {
            ((wv) it.next()).a();
        }
    }

    public final void a(gf0 gf0Var) {
        fd.j0.i(gf0Var, "mobileAdsSchemeImpressionListener");
        this.f25792e.add(gf0Var);
    }

    public final void a(w20 w20Var) {
        fd.j0.i(w20Var, "impressionTrackingListener");
        this.f25791d.add(w20Var);
    }

    public final void a(wv wvVar) {
        fd.j0.i(wvVar, "forceImpressionTrackingListener");
        this.f25788a.add(wvVar);
    }

    @Override // com.yandex.mobile.ads.impl.gf0
    public final void b() {
        Iterator it = this.f25792e.iterator();
        while (it.hasNext()) {
            ((gf0) it.next()).b();
        }
    }

    public final void b(w20 w20Var) {
        fd.j0.i(w20Var, "impressionTrackingListener");
        this.f25790c.add(w20Var);
    }

    @Override // com.yandex.mobile.ads.impl.ze1
    public final void c() {
        Iterator it = this.f25789b.iterator();
        while (it.hasNext()) {
            ((ze1) it.next()).c();
        }
    }

    public final void c(w20 w20Var) {
        fd.j0.i(w20Var, "videoImpressionTrackingListener");
        this.f25789b.add(w20Var);
    }

    @Override // com.yandex.mobile.ads.impl.gf0
    public final void d() {
        Iterator it = this.f25792e.iterator();
        while (it.hasNext()) {
            ((gf0) it.next()).d();
        }
    }

    @Override // com.yandex.mobile.ads.impl.tv0
    public final void e() {
        Iterator it = this.f25790c.iterator();
        while (it.hasNext()) {
            ((tv0) it.next()).e();
        }
    }

    @Override // com.yandex.mobile.ads.impl.a30
    public final void f() {
        Iterator it = this.f25791d.iterator();
        while (it.hasNext()) {
            ((a30) it.next()).f();
        }
    }

    @Override // com.yandex.mobile.ads.impl.ze1
    public final void g() {
        Iterator it = this.f25789b.iterator();
        while (it.hasNext()) {
            ((ze1) it.next()).g();
        }
    }
}
