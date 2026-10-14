package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class hf1 implements fw0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sc1<?> f21367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final lg1 f21368b;

    public hf1(sc1<?> sc1Var, lg1 lg1Var) {
        fd.j0.i(sc1Var, "videoAdInfo");
        fd.j0.i(lg1Var, "videoViewProvider");
        this.f21367a = sc1Var;
        this.f21368b = lg1Var;
    }

    @Override // com.yandex.mobile.ads.impl.fw0.a
    public final Map<String, Object> a() {
        gw0 gw0Var = new gw0(new LinkedHashMap());
        View view = this.f21368b.getView();
        Integer numValueOf = view != null ? Integer.valueOf(view.getHeight()) : null;
        Integer numValueOf2 = view != null ? Integer.valueOf(view.getWidth()) : null;
        vb0 vb0VarB = this.f21367a.b();
        fd.j0.h(vb0VarB, "videoAdInfo.mediaFile");
        if (numValueOf == null || numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        gw0Var.b(numValueOf, "view_container_height");
        if (numValueOf2 == null || numValueOf2.intValue() <= 0) {
            numValueOf2 = null;
        }
        gw0Var.b(numValueOf2, "view_container_width");
        gw0Var.b(vb0VarB.b() > 0 ? Integer.valueOf(vb0VarB.b()) : null, "video_height");
        gw0Var.b(vb0VarB.f() > 0 ? Integer.valueOf(vb0VarB.f()) : null, "video_width");
        gw0Var.b(vb0VarB.a(), "video_codec");
        gw0Var.b(vb0VarB.c(), "video_mime_type");
        gw0Var.b(vb0VarB.e(), "video_vmaf");
        Map<String, Object> mapA = gw0Var.a();
        fd.j0.h(mapA, "wrapper.reportData");
        return kc.e0.b(new jc.h("video_playback_info", mapA));
    }
}
