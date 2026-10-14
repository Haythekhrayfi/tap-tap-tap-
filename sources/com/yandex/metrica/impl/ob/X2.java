package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import android.webkit.WebView;
import com.yandex.metrica.AppMetricaInitializerJsInterface;
import com.yandex.metrica.AppMetricaJsInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class X2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<Um<Im>> f15443a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Im f15444b;

    public class a implements Um<Im> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f15445a;

        public a(X2 x10, String str) {
            this.f15445a = str;
        }

        @Override // com.yandex.metrica.impl.ob.Um
        public void b(Im im) {
            Im im2 = im;
            if (im2.c()) {
                im2.c(this.f15445a);
            }
        }
    }

    private void a(String str) {
        a aVar = new a(this, str);
        synchronized (this) {
            Im im = this.f15444b;
            if (im == null) {
                this.f15443a.add(aVar);
            } else {
                aVar.b(im);
            }
        }
    }

    @SuppressLint({"AddJavascriptInterface"})
    public void a(WebView webView, C2034vg c2034vg) {
        if (!U2.a(17)) {
            a("WebView interface is not available on Android < 17.");
            return;
        }
        try {
            if (!webView.getSettings().getJavaScriptEnabled()) {
                a("WebView interface setup failed because javascript is disabled for the WebView.");
                return;
            }
            webView.addJavascriptInterface(new AppMetricaJsInterface(c2034vg), "AppMetrica");
            webView.addJavascriptInterface(new AppMetricaInitializerJsInterface(c2034vg), "AppMetricaInitializer");
            W2 w10 = new W2(this, "WebView interface setup is successful.");
            synchronized (this) {
                Im im = this.f15444b;
                if (im == null) {
                    this.f15443a.add(w10);
                } else {
                    w10.b(im);
                }
            }
        } catch (Throwable th) {
            Y2 y10 = new Y2(this, th, "WebView interface setup failed because of an exception.");
            synchronized (this) {
                Im im2 = this.f15444b;
                if (im2 == null) {
                    this.f15443a.add(y10);
                } else {
                    y10.b(im2);
                }
            }
        }
    }

    public void a(Im im) {
        synchronized (this) {
            this.f15444b = im;
        }
        Iterator<Um<Im>> it = this.f15443a.iterator();
        while (it.hasNext()) {
            it.next().b(im);
        }
        this.f15443a.clear();
    }
}
