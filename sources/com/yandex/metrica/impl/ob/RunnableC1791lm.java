package com.yandex.metrica.impl.ob;

import android.webkit.WebView;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.lm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class RunnableC1791lm implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1841nm f16861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebView f16862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f16863c;

    public RunnableC1791lm(C1816mm c1816mm, C1841nm c1841nm, WebView webView, CountDownLatch countDownLatch) {
        this.f16861a = c1841nm;
        this.f16862b = webView;
        this.f16863c = countDownLatch;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f16861a.f16962h = this.f16862b.getUrl();
            this.f16861a.f16963i = this.f16862b.getOriginalUrl();
            this.f16863c.countDown();
        } catch (Throwable unused) {
        }
    }
}
