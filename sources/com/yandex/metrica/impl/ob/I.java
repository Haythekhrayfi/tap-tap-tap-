package com.yandex.metrica.impl.ob;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f14166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final D f14167b;

    public I(Context context) {
        this(context, new D());
    }

    public I(Context context, D d10) {
        this.f14166a = context;
        this.f14167b = d10;
    }

    public H a() {
        if (U2.a(28)) {
            return G.a(this.f14166a, this.f14167b);
        }
        return null;
    }
}
