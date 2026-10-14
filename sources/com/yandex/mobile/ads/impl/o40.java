package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.instream.player.ad.InstreamAdView;

/* JADX INFO: loaded from: classes3.dex */
public final class o40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w30 f23690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ro f23691b;

    public o40(w30 w30Var, e50 e50Var) {
        this.f23690a = w30Var;
        this.f23691b = new ro(e50Var);
    }

    public final fc1 a(InstreamAdView instreamAdView) {
        Context context = instreamAdView.getContext();
        fc1 fc1VarA = this.f23690a.a();
        return fc1VarA == null ? this.f23691b.a(context, instreamAdView) : fc1VarA;
    }
}
