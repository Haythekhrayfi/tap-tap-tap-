package com.yandex.metrica.impl.ob;

import android.content.ComponentName;
import android.content.Context;
import com.yandex.metrica.PreloadInfoContentProvider;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1645g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile CountDownLatch f16158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile PreloadInfoContentProvider f16159b;

    public static final void a() {
        CountDownLatch countDownLatch = f16158a;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public static final void a(Context context) throws InterruptedException {
        CountDownLatch countDownLatch = f16158a;
        if (countDownLatch != null) {
            countDownLatch.await(1L, TimeUnit.SECONDS);
            try {
                context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) PreloadInfoContentProvider.class), 2, 1);
                PreloadInfoContentProvider preloadInfoContentProvider = f16159b;
                if (preloadInfoContentProvider != null) {
                    preloadInfoContentProvider.disable();
                }
            } catch (Throwable unused) {
            }
            f16158a = null;
        }
    }

    public static final void a(PreloadInfoContentProvider preloadInfoContentProvider) {
        f16158a = new CountDownLatch(1);
        f16159b = preloadInfoContentProvider;
    }
}
