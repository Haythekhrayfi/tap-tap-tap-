package com.yandex.mobile.ads.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class tq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i40 f25439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sq0 f25440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private u11 f25441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private se0 f25442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private u11 f25443e;

    public tq0(Context context, v50 v50Var, d40 d40Var, s40 s40Var, com.yandex.mobile.ads.instream.e eVar, com.yandex.mobile.ads.instream.d dVar) {
        i40 i40Var = new i40(v50Var, eVar);
        this.f25439a = i40Var;
        this.f25440b = new sq0(context, d40Var, eVar, dVar, s40Var, i40Var);
    }

    public final t5 a() {
        if (this.f25442d == null) {
            this.f25442d = this.f25440b.a(this.f25439a.a());
        }
        return this.f25442d;
    }

    public final t5 b() {
        w50 w50VarB;
        if (this.f25443e == null && (w50VarB = this.f25439a.a().b()) != null) {
            this.f25443e = this.f25440b.a(w50VarB);
        }
        return this.f25443e;
    }

    public final t5 c() {
        w50 w50VarC;
        if (this.f25441c == null && (w50VarC = this.f25439a.a().c()) != null) {
            this.f25441c = this.f25440b.a(w50VarC);
        }
        return this.f25441c;
    }
}
