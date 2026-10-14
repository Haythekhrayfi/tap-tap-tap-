package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public final class k6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ExecutorService f22257c = Executors.newCachedThreadPool(new ph0("YandexMobileAds.UrlTracker"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f22258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k2 f22259b;

    public static class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f22260b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final r91 f22261c;

        public a(String str, r91 r91Var) {
            this.f22260b = str;
            this.f22261c = r91Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (TextUtils.isEmpty(this.f22260b)) {
                return;
            }
            this.f22261c.a(this.f22260b);
        }
    }

    public k6(Context context, k2 k2Var) {
        this.f22258a = context.getApplicationContext();
        this.f22259b = k2Var;
    }

    public static void a(String str, x51 x51Var, jw0 jw0Var) {
        os0 os0Var = new os0(jw0Var, x51Var);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f22257c.execute(new a(str, os0Var));
    }

    public final void a(String str) {
        nq0 nq0Var = new nq0(this.f22258a);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f22257c.execute(new a(str, nq0Var));
    }

    public final void a(String str, AdResponse adResponse, z0 z0Var) {
        os0 os0Var = new os0(new gi(this.f22258a, adResponse, this.f22259b, null), z0Var);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f22257c.execute(new a(str, os0Var));
    }
}
