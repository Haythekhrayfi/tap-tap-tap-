package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.h2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class RunnableC1672h2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f16256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1744k0 f16257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bundle f16258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final D4 f16259d;

    public RunnableC1672h2(Context context, C1744k0 c1744k0, Bundle bundle, D4 d10) {
        this.f16256a = context;
        this.f16257b = c1744k0;
        this.f16258c = bundle;
        this.f16259d = d10;
    }

    @Override // java.lang.Runnable
    public void run() {
        T3 t10 = new T3(this.f16258c);
        if (T3.a(t10, this.f16256a)) {
            return;
        }
        C4 c4A = C4.a(t10);
        X3 x10 = new X3(t10);
        this.f16259d.a(c4A, x10).a(this.f16257b, x10);
    }
}
