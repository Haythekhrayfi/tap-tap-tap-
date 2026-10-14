package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import android.util.LruCache;

/* JADX INFO: loaded from: classes3.dex */
public final class hn0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f21473c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile hn0 f21474d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e20 f21475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f21476b;

    public class a extends LruCache<String, Bitmap> {
        public a(int i10) {
            super(i10);
        }

        @Override // android.util.LruCache
        public final int sizeOf(String str, Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            return bitmap2 != null ? bitmap2.getByteCount() / 1024 : super.sizeOf(str, null);
        }
    }

    public static class b implements e20.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final LruCache<String, Bitmap> f21477a;

        public b(LruCache<String, Bitmap> lruCache) {
            this.f21477a = lruCache;
        }

        @Override // com.yandex.mobile.ads.impl.e20.b
        public final Bitmap a(String str) {
            return this.f21477a.get(str);
        }

        @Override // com.yandex.mobile.ads.impl.e20.b
        public final void a(String str, Bitmap bitmap) {
            this.f21477a.put(str, bitmap);
        }
    }

    public interface c {
        Bitmap a(String str);

        void a(String str, Bitmap bitmap);
    }

    private hn0(Context context) {
        LruCache lruCacheA = a(context);
        xw0 xw0VarB = b(context);
        b bVar = new b(lruCacheA);
        z10 z10Var = new z10();
        this.f21476b = new n91(lruCacheA, z10Var);
        this.f21475a = new d21(xw0VarB, bVar, z10Var);
    }

    private static LruCache a(Context context) {
        int iMin;
        try {
            int iMaxMemory = (int) (Runtime.getRuntime().maxMemory() / 1024);
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            iMin = Math.min(iMaxMemory / 8, ((int) (((displayMetrics.widthPixels * displayMetrics.heightPixels) * displayMetrics.density) / 1024.0f)) * 3);
        } catch (IllegalArgumentException e10) {
            x60.a(e10, "Unable to calculate available memory space, defaulting to minimum", new Object[0]);
            iMin = 5120;
        }
        return new a(Math.max(iMin, 5120));
    }

    private static xw0 b(Context context) {
        xw0 xw0VarA = yw0.a(context, 4);
        xw0VarA.a();
        return xw0VarA;
    }

    public static hn0 c(Context context) {
        if (f21474d == null) {
            synchronized (f21473c) {
                if (f21474d == null) {
                    f21474d = new hn0(context);
                }
            }
        }
        return f21474d;
    }

    public final e20 a() {
        return this.f21475a;
    }

    public final c b() {
        return this.f21476b;
    }
}
