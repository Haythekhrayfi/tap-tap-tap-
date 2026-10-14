package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class s50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final oa1<VideoAd> f24978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r50 f24979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final sc1<VideoAd> f24980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g20 f24981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g50 f24982e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final t50 f24983f;

    public s50(Context context, d40 d40Var, s40 s40Var, w50 w50Var, sc1 sc1Var, de1 de1Var, gg1 gg1Var, g20 g20Var, dd1 dd1Var) {
        this.f24981d = g20Var;
        this.f24980c = sc1Var;
        this.f24982e = new g50(new a20(context), new w3());
        t50 t50Var = new t50(dd1Var);
        this.f24983f = t50Var;
        VideoAd videoAd = (VideoAd) sc1Var.c();
        i60 i60Var = new i60(s40Var);
        r50 r50Var = new r50(videoAd, d40Var);
        this.f24979b = r50Var;
        ud1 ud1Var = new ud1();
        new j40(videoAd, i60Var, r50Var, s40Var, de1Var).a(ud1Var);
        oa1<VideoAd> oa1Var = new oa1<>(context, r50Var, i60Var, sc1Var, new h60(w50Var, sc1Var, de1Var, i60Var), de1Var, gg1Var, ud1Var, t50Var);
        this.f24978a = oa1Var;
        y30 y30Var = new y30(videoAd);
        s30 s30Var = new s30(w50Var);
        oa1Var.a(y30Var);
        oa1Var.a(s30Var);
    }

    public final void a() {
        this.f24978a.a();
        Objects.requireNonNull(this.f24982e);
    }

    public final void b() {
        this.f24978a.b();
    }

    public final void c() {
        this.f24978a.c();
    }

    public final void d() {
        this.f24978a.d();
        this.f24982e.a(this.f24980c, this.f24981d, this.f24983f);
    }

    public final void e() {
        this.f24979b.f();
        this.f24983f.a();
    }

    public final void f() {
        this.f24978a.e();
    }

    public final void g() {
        this.f24978a.f();
        this.f24983f.a();
    }
}
