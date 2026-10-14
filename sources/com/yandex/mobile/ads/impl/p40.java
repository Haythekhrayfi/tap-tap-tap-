package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* JADX INFO: loaded from: classes3.dex */
public final class p40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f23975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s40 f23976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w30 f23977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h91 f23978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private g91 f23979e;

    public p40(Context context, s40 s40Var, or0 or0Var, d40 d40Var) {
        this.f23975a = context.getApplicationContext();
        this.f23976b = s40Var;
        w30 w30Var = new w30();
        this.f23977c = w30Var;
        this.f23978d = new h91(or0Var, d40Var, w30Var);
    }

    public final void a() {
        g91 g91Var = this.f23979e;
        if (g91Var != null) {
            g91Var.b();
            this.f23979e = null;
        }
    }

    public final void a(fc1 fc1Var) {
        this.f23977c.a(fc1Var);
    }

    public final void a(sc1<VideoAd> sc1Var) {
        g91 g91Var = this.f23979e;
        if (g91Var != null) {
            g91Var.a(sc1Var);
        }
    }

    public final void a(w50 w50Var, sc1 sc1Var, eg1 eg1Var, ec1 ec1Var, eq0 eq0Var) {
        a();
        r40 r40VarA = this.f23976b.a();
        if (r40VarA != null) {
            g91 g91VarA = this.f23978d.a(this.f23975a, r40VarA, w50Var, sc1Var, eg1Var, eq0Var, ec1Var);
            this.f23979e = g91VarA;
            g91VarA.a();
        }
    }
}
