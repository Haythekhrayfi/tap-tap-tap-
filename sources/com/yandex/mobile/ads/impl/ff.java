package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public final class ff {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f20677a = Executors.newSingleThreadExecutor();

    public static final class a implements Runnable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Bitmap f20680d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final b f20681e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final lf f20679c = new lf();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Handler f20678b = new Handler(Looper.getMainLooper());

        public a(Bitmap bitmap, b bVar) {
            this.f20680d = bitmap;
            this.f20681e = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            lf lfVar = this.f20679c;
            Bitmap bitmap = this.f20680d;
            Objects.requireNonNull(lfVar);
            this.f20678b.post(new ef(this, lf.a(bitmap)));
        }
    }

    public interface b {
        void a(Bitmap bitmap);
    }

    public final void a(Bitmap bitmap, b bVar) {
        this.f20677a.execute(new a(bitmap, bVar));
    }
}
