package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.util.LruCache;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class n91 implements hn0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LruCache<String, Bitmap> f23309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z10 f23310b;

    public n91(LruCache<String, Bitmap> lruCache, z10 z10Var) {
        this.f23309a = lruCache;
        this.f23310b = z10Var;
    }

    @Override // com.yandex.mobile.ads.impl.hn0.c
    public final Bitmap a(String str) {
        Objects.requireNonNull(this.f23310b);
        return this.f23309a.get(z10.a(str));
    }

    @Override // com.yandex.mobile.ads.impl.hn0.c
    public final void a(String str, Bitmap bitmap) {
        Objects.requireNonNull(this.f23310b);
        this.f23309a.put(z10.a(str), bitmap);
    }
}
