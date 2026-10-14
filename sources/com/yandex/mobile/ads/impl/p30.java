package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.instream.InstreamAdBinder;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class p30 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f23969b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile p30 f23970c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakHashMap f23971a = new WeakHashMap();

    private p30() {
    }

    public static p30 a() {
        if (f23970c == null) {
            synchronized (f23969b) {
                if (f23970c == null) {
                    f23970c = new p30();
                }
            }
        }
        return f23970c;
    }

    public final InstreamAdBinder a(View view) {
        InstreamAdBinder instreamAdBinder;
        synchronized (f23969b) {
            instreamAdBinder = (InstreamAdBinder) this.f23971a.get(view);
        }
        return instreamAdBinder;
    }

    public final void a(View view, InstreamAdBinder instreamAdBinder) {
        synchronized (f23969b) {
            this.f23971a.put(view, instreamAdBinder);
        }
    }

    public final boolean a(InstreamAdBinder instreamAdBinder) {
        boolean z10;
        synchronized (f23969b) {
            Iterator it = this.f23971a.entrySet().iterator();
            z10 = false;
            while (it.hasNext()) {
                if (instreamAdBinder == ((InstreamAdBinder) ((Map.Entry) it.next()).getValue())) {
                    it.remove();
                    z10 = true;
                }
            }
        }
        return z10;
    }
}
