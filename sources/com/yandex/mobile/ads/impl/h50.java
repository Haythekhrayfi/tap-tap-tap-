package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class h50 implements s20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g50 f21305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<qa<?>> f21306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g20 f21307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g50.a f21308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sc1<VideoAd> f21309e;

    public h50(g50 g50Var, List list, g20 g20Var, t50 t50Var, sc1 sc1Var) {
        this.f21305a = g50Var;
        this.f21306b = list;
        this.f21307c = g20Var;
        this.f21308d = t50Var;
        this.f21309e = sc1Var;
    }

    @Override // com.yandex.mobile.ads.impl.s20
    public final void a(Map<String, Bitmap> map) {
        fd.j0.i(map, "images");
        this.f21305a.f20946b.a(v3.f25805h);
        ArrayList arrayListA = this.f21305a.f20947c.a(this.f21306b, map);
        fd.j0.h(arrayListA, "assetsFilter.filterEmpty…gesAssets(assets, images)");
        this.f21305a.f20948d.a(arrayListA, map);
        this.f21307c.a(map);
        ((t50) this.f21308d).m(this.f21309e);
    }
}
