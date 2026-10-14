package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

/* JADX INFO: loaded from: classes3.dex */
final class ka1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f22322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f22323b = new Handler(Looper.getMainLooper());

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Toast.makeText(ka1.this.f22322a, "The Yandex Mobile Ads SDK needs to be updated to the latest version. Details in the logs", 1).show();
        }
    }

    public ka1(Context context) {
        this.f22322a = context.getApplicationContext();
    }

    public final void a() {
        this.f22323b.post(new a());
    }
}
