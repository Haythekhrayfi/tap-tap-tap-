package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class wl implements fg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nl f26311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final cg1 f26312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final we1 f26313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d60 f26314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f26315e;

    public wl(nl nlVar, cg1 cg1Var, we1 we1Var) {
        fd.j0.i(nlVar, "creative");
        fd.j0.i(cg1Var, "eventsTracker");
        fd.j0.i(we1Var, "videoEventUrlsTracker");
        this.f26311a = nlVar;
        this.f26312b = cg1Var;
        this.f26313c = we1Var;
        this.f26314d = new d60(new ol());
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void a() {
        this.f26312b.a(this.f26311a, "unmute");
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void a(float f10) {
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void a(long j10) {
        if (this.f26315e) {
            return;
        }
        this.f26315e = true;
        this.f26312b.a(this.f26311a, "start");
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void a(View view, List<qc1> list) {
        fg1.a.a(view, list);
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void a(eg1.a aVar) {
        String str;
        fd.j0.i(aVar, "quartile");
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 0) {
            str = "firstQuartile";
        } else if (iOrdinal == 1) {
            str = "midpoint";
        } else {
            if (iOrdinal != 2) {
                throw new jc.g();
            }
            str = "thirdQuartile";
        }
        this.f26312b.a(this.f26311a, str);
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void a(pd1 pd1Var) {
        fg1.a.a(pd1Var);
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void a(String str) {
        fd.j0.i(str, "assetName");
        if (!this.f26315e) {
            this.f26315e = true;
            this.f26312b.a(this.f26311a, "start");
        }
        pe1 pe1VarA = this.f26314d.a(this.f26311a, str);
        we1 we1Var = this.f26313c;
        List<String> listB = pe1VarA.b();
        fd.j0.h(listB, "videoClicks.clickTrackings");
        we1Var.a((List<String>) listB, (Map<String, String>) null);
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void b() {
        this.f26312b.a(this.f26311a, "complete");
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void c() {
        this.f26312b.a(this.f26311a, "resume");
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void d() {
        this.f26312b.a(this.f26311a, "pause");
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void e() {
        this.f26312b.a(this.f26311a, "skip");
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void f() {
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void g() {
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void h() {
        this.f26312b.a(this.f26311a, "creativeView");
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void i() {
        this.f26312b.a(new tl().a(this.f26311a), "creativeRenderingStart");
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void j() {
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void k() {
        this.f26315e = false;
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void l() {
        this.f26312b.a(this.f26311a, "mute");
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void m() {
        if (!this.f26315e) {
            this.f26315e = true;
            this.f26312b.a(this.f26311a, "start");
        }
        this.f26312b.a(this.f26311a, "clickTracking");
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void n() {
    }
}
