package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class ys {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashSet f26997a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Player f26998b;

    public final Player a() {
        return this.f26998b;
    }

    public final void a(Player player) {
        this.f26998b = player;
        Iterator it = this.f26997a.iterator();
        while (it.hasNext()) {
            ((mr0) it.next()).a(player);
        }
    }

    public final void a(xs0 xs0Var) {
        this.f26997a.add(xs0Var);
    }

    public final boolean b() {
        return this.f26998b != null;
    }
}
