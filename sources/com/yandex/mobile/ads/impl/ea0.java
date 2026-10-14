package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.player.ad.InstreamAdView;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class ea0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f20128b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile ea0 f20129c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakHashMap f20130a = new WeakHashMap();

    private ea0() {
    }

    public static ea0 a() {
        if (f20129c == null) {
            synchronized (f20128b) {
                if (f20129c == null) {
                    f20129c = new ea0();
                }
            }
        }
        return f20129c;
    }

    public final y90 a(InstreamAdView instreamAdView) {
        y90 y90Var;
        synchronized (f20128b) {
            y90Var = (y90) this.f20130a.get(instreamAdView);
        }
        return y90Var;
    }

    public final void a(InstreamAdView instreamAdView, y90 y90Var) {
        synchronized (f20128b) {
            this.f20130a.put(instreamAdView, y90Var);
        }
    }

    public final boolean a(y90 y90Var) {
        boolean z10;
        synchronized (f20128b) {
            Iterator it = this.f20130a.entrySet().iterator();
            z10 = false;
            while (it.hasNext()) {
                if (y90Var == ((y90) ((Map.Entry) it.next()).getValue())) {
                    it.remove();
                    z10 = true;
                }
            }
        }
        return z10;
    }
}
