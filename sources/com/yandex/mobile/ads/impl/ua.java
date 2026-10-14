package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* JADX INFO: loaded from: classes3.dex */
public final class ua {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sc1<VideoAd> f25572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final yo0 f25573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final eg1 f25574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d60 f25575d;

    public ua(sc1<VideoAd> sc1Var, yo0 yo0Var, eg1 eg1Var) {
        fd.j0.i(sc1Var, "videoAdInfo");
        fd.j0.i(yo0Var, "adClickHandler");
        fd.j0.i(eg1Var, "videoTracker");
        this.f25572a = sc1Var;
        this.f25573b = yo0Var;
        this.f25574c = eg1Var;
        this.f25575d = new d60(new ol());
    }

    public final void a(View view, qa<?> qaVar) {
        fd.j0.i(view, "view");
        if (qaVar != null && qaVar.e()) {
            d60 d60Var = this.f25575d;
            nl nlVarA = this.f25572a.a();
            fd.j0.h(nlVarA, "videoAdInfo.creative");
            String strA = d60Var.a(nlVarA, qaVar.b()).a();
            if (strA != null) {
                yo0 yo0Var = this.f25573b;
                String strB = qaVar.b();
                fd.j0.h(strB, "asset.name");
                view.setOnClickListener(new gb(yo0Var, strA, strB, this.f25574c));
            }
        }
    }
}
