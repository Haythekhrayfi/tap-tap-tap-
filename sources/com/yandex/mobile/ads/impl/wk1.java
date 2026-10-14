package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.common.BidderTokenLoadListener;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public final class wk1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f26305e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile wk1 f26306f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f26307a = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final uk1 f26308b = new uk1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f26309c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w3 f26310d = new w3();

    private wk1() {
    }

    public static wk1 a() {
        if (f26306f == null) {
            synchronized (f26305e) {
                if (f26306f == null) {
                    f26306f = new wk1();
                }
            }
        }
        return f26306f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, BidderTokenLoadListener bidderTokenLoadListener) {
        new h01(context, this.f26307a, this.f26310d).a(new vk1(this, context, bidderTokenLoadListener));
    }

    public final void b(Context context, BidderTokenLoadListener bidderTokenLoadListener) {
        this.f26307a.execute(new ap1(this, context, bidderTokenLoadListener));
    }
}
