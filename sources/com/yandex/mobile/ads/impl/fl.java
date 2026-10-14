package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import com.yandex.mobile.ads.instream.player.ad.InstreamAdView;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class fl implements e91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gl f20747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final nb f20748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.yandex.mobile.ads.instream.player.ad.a f20749c = new com.yandex.mobile.ads.instream.player.ad.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o40 f20750d;

    public fl(Context context, w30 w30Var, r50 r50Var, w50 w50Var, sc1 sc1Var, eg1 eg1Var, eq0 eq0Var, ec1 ec1Var) {
        this.f20750d = new o40(w30Var, f50.a(i01.b().a(context)));
        this.f20747a = new gl(context, w50Var, r50Var, ec1Var, sc1Var, eg1Var);
        this.f20748b = new nb(new hb(context, sc1Var, w50Var, eg1Var, ec1Var, eq0Var, x40.a(context, sc1Var)).a());
    }

    @Override // com.yandex.mobile.ads.impl.e91
    public final void a(InstreamAdView instreamAdView) {
        Objects.requireNonNull(this.f20749c);
        fc1 fc1VarA = com.yandex.mobile.ads.instream.player.ad.a.a(instreamAdView);
        if (fc1VarA != null) {
            instreamAdView.removeView(fc1VarA.a());
        }
        Objects.requireNonNull(this.f20749c);
        com.yandex.mobile.ads.instream.player.ad.a.a(instreamAdView, null);
    }

    @Override // com.yandex.mobile.ads.impl.e91
    public final void a(InstreamAdView instreamAdView, a50 a50Var) {
        fc1 fc1VarA = this.f20750d.a(instreamAdView);
        if (fc1VarA != null) {
            this.f20747a.a(fc1VarA, a50Var);
            this.f20748b.a(fc1VarA);
            instreamAdView.addView(fc1VarA.a(), new ViewGroup.LayoutParams(-1, -1));
        }
        Objects.requireNonNull(this.f20749c);
        com.yandex.mobile.ads.instream.player.ad.a.a(instreamAdView, fc1VarA);
    }
}
