package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class xr {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static xr f26607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f26608d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wr f26609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private u10 f26610b;

    public xr(Context context) {
        Collections.emptyList();
        Collections.emptyMap();
        this.f26609a = new wr();
        this.f26610b = z9.a(context);
    }

    public static xr a(Context context) {
        synchronized (f26608d) {
            if (f26607c == null) {
                f26607c = new xr(context);
            }
        }
        return f26607c;
    }

    public final wr a() {
        return this.f26609a;
    }

    public final u10 b() {
        return this.f26610b;
    }
}
