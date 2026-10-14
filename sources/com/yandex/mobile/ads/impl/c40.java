package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class c40 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f19386c = new a(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile c40 f19387d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f19388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakHashMap<InstreamAdPlayer, j91> f19389b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(int i10) {
            this();
        }

        public final c40 a() {
            c40 c40Var = c40.f19387d;
            if (c40Var == null) {
                synchronized (this) {
                    c40Var = c40.f19387d;
                    if (c40Var == null) {
                        c40Var = new c40(0);
                        c40.f19387d = c40Var;
                    }
                }
            }
            return c40Var;
        }
    }

    private c40() {
        this.f19388a = new Object();
        this.f19389b = new WeakHashMap<>();
    }

    public /* synthetic */ c40(int i10) {
        this();
    }

    public final j91 a(InstreamAdPlayer instreamAdPlayer) {
        j91 j91Var;
        fd.j0.i(instreamAdPlayer, "instreamAdPlayer");
        synchronized (this.f19388a) {
            j91Var = this.f19389b.get(instreamAdPlayer);
        }
        return j91Var;
    }

    public final void a(InstreamAdPlayer instreamAdPlayer, j91 j91Var) {
        fd.j0.i(instreamAdPlayer, "instreamAdPlayer");
        fd.j0.i(j91Var, "adBinder");
        synchronized (this.f19388a) {
            this.f19389b.put(instreamAdPlayer, j91Var);
        }
    }

    public final void b(InstreamAdPlayer instreamAdPlayer) {
        fd.j0.i(instreamAdPlayer, "instreamAdPlayer");
        synchronized (this.f19388a) {
            this.f19389b.remove(instreamAdPlayer);
        }
    }
}
