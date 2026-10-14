package com.yandex.mobile.ads.impl;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ke<T> extends mw0<T> {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f22394q = (int) TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final a<T> f22395p;

    public interface a<T> extends gx0.b<T>, gx0.a {
    }

    public ke(int i10, String str, a<T> aVar) {
        super(i10, str, aVar);
        r();
        a(new lo(1.0f, f22394q, 0));
        this.f22395p = aVar;
    }

    @Override // com.yandex.mobile.ads.impl.mw0
    public final void a(T t10) {
        a<T> aVar = this.f22395p;
        if (aVar != null) {
            aVar.a(t10);
        }
    }
}
