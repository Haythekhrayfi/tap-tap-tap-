package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;

/* JADX INFO: loaded from: classes3.dex */
public final class xs0 implements et0, mr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final et0 f26616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ar0 f26617b = ar0.f19043c;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private gv f26618c;

    public xs0(et0 et0Var) {
        this.f26616a = et0Var;
    }

    @Override // com.yandex.mobile.ads.impl.et0
    public final ar0 a() {
        et0 et0Var = this.f26618c;
        if (et0Var == null) {
            et0Var = this.f26616a;
        }
        ar0 ar0VarA = et0Var.a();
        this.f26617b = ar0VarA;
        return ar0VarA;
    }

    @Override // com.yandex.mobile.ads.impl.mr0
    public final void a(Player player) {
        this.f26618c = player == null ? new gv(this.f26617b) : null;
    }
}
