package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer;

/* JADX INFO: loaded from: classes3.dex */
public final class f40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j91 f20522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c40 f20523b;

    public f40(j91 j91Var) {
        fd.j0.i(j91Var, "unifiedInstreamAdBinder");
        this.f20522a = j91Var;
        this.f20523b = c40.f19386c.a();
    }

    public final void a(InstreamAdPlayer instreamAdPlayer) {
        fd.j0.i(instreamAdPlayer, "player");
        j91 j91VarA = this.f20523b.a(instreamAdPlayer);
        if (fd.j0.d(this.f20522a, j91VarA)) {
            return;
        }
        if (j91VarA != null) {
            j91VarA.invalidateAdPlayer();
        }
        this.f20523b.a(instreamAdPlayer, this.f20522a);
    }

    public final void b(InstreamAdPlayer instreamAdPlayer) {
        fd.j0.i(instreamAdPlayer, "player");
        this.f20523b.b(instreamAdPlayer);
    }
}
