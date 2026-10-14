package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
final class n8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f23297a = Executors.newSingleThreadExecutor(new ph0("YandexMobileAds.AdvertisingId"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fy f23298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.yandex.mobile.ads.core.identifiers.ad.huawei.a f23299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final dy f23300d;

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l8 f23301b;

        public a(l8 l8Var) {
            this.f23301b = l8Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            h8 h8VarA = n8.a(n8.this);
            if (h8VarA.a() == null && h8VarA.b() == null) {
                ((j8) this.f23301b).a();
            } else {
                ((j8) this.f23301b).a(h8VarA);
            }
        }
    }

    public n8(Context context) {
        this.f23298b = new fy(context);
        this.f23300d = ey.a(context);
        this.f23299c = new com.yandex.mobile.ads.core.identifiers.ad.huawei.a(context);
    }

    public static h8 a(n8 n8Var) {
        f8 f8VarA = n8Var.f23298b.a();
        f8 f8VarA2 = n8Var.f23299c.a();
        n8Var.f23300d.b(f8VarA);
        return new h8(f8VarA, f8VarA2, n8Var.f23300d.a(f8VarA));
    }

    public final void a(l8 l8Var) {
        this.f23297a.execute(new a(l8Var));
    }
}
