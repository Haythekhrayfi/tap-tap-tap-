package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* JADX INFO: loaded from: classes3.dex */
final class h91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f91 f21342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a60 f21343b = new a60();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final or0 f21344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d40 f21345d;

    public h91(or0 or0Var, d40 d40Var, w30 w30Var) {
        this.f21344c = or0Var;
        this.f21345d = d40Var;
        this.f21342a = new f91(w30Var);
    }

    public final g91 a(Context context, r40 r40Var, w50 w50Var, sc1 sc1Var, eg1 eg1Var, eq0 eq0Var, ec1 ec1Var) {
        r50 r50Var = new r50((VideoAd) sc1Var.c(), this.f21345d);
        return new g91(r40Var, this.f21342a.a(context, w50Var, sc1Var, r50Var, eg1Var, eq0Var, ec1Var), sc1Var, this.f21343b, this.f21344c, r50Var);
    }
}
