package com.applovin.impl.sdk;

import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class af {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static WebView f10263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f10264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f10265c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AtomicBoolean f10266d = new AtomicBoolean();

    static {
        if (b()) {
            f10264b = (String) com.applovin.impl.sdk.c.e.b(com.applovin.impl.sdk.c.d.Q, "", o.au());
            return;
        }
        f10264b = "";
        com.applovin.impl.sdk.c.e.a(com.applovin.impl.sdk.c.d.Q, (Object) null, o.au());
        com.applovin.impl.sdk.c.e.a(com.applovin.impl.sdk.c.d.R, (Object) null, o.au());
    }

    public static String a() {
        String str;
        synchronized (f10265c) {
            str = f10264b;
        }
        return str;
    }

    public static void a(o oVar) {
    }

    public static void b(final o oVar) {
        if (b() || f10266d.getAndSet(true)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(com.applovin.impl.sdk.utils.h.b() ? new Runnable() { // from class: com.applovin.impl.sdk.af.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    synchronized (af.f10265c) {
                        try {
                            String unused = af.f10264b = WebSettings.getDefaultUserAgent(o.au());
                            com.applovin.impl.sdk.c.e.a(com.applovin.impl.sdk.c.d.Q, af.f10264b, o.au());
                            com.applovin.impl.sdk.c.e.a(com.applovin.impl.sdk.c.d.R, Build.VERSION.RELEASE, o.au());
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    oVar.F();
                    if (y.a()) {
                        oVar.F().b("WebViewDataCollector", "Failed to collect user agent", th2);
                    }
                    oVar.ag().a("WebViewDataCollector", "collectUserAgent", th2);
                }
            }
        } : new Runnable() { // from class: com.applovin.impl.sdk.af.2
            /* JADX WARN: Bottom block not found for handler: all -> 0x0036 */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
            
                return;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void run() {
                /*
                    r4 = this;
                    com.applovin.impl.sdk.o r0 = r1     // Catch: java.lang.Throwable -> L36
                    com.applovin.impl.sdk.af.a(r0)     // Catch: java.lang.Throwable -> L36
                    java.lang.Object r0 = com.applovin.impl.sdk.af.c()     // Catch: java.lang.Throwable -> L36
                    monitor-enter(r0)     // Catch: java.lang.Throwable -> L36
                    android.webkit.WebView r1 = com.applovin.impl.sdk.af.e()     // Catch: java.lang.Throwable -> L33
                    android.webkit.WebSettings r1 = r1.getSettings()     // Catch: java.lang.Throwable -> L33
                    java.lang.String r1 = r1.getUserAgentString()     // Catch: java.lang.Throwable -> L33
                    com.applovin.impl.sdk.af.a(r1)     // Catch: java.lang.Throwable -> L33
                    com.applovin.impl.sdk.c.d<java.lang.String> r1 = com.applovin.impl.sdk.c.d.Q     // Catch: java.lang.Throwable -> L33
                    java.lang.String r2 = com.applovin.impl.sdk.af.d()     // Catch: java.lang.Throwable -> L33
                    android.content.Context r3 = com.applovin.impl.sdk.o.au()     // Catch: java.lang.Throwable -> L33
                    com.applovin.impl.sdk.c.e.a(r1, r2, r3)     // Catch: java.lang.Throwable -> L33
                    com.applovin.impl.sdk.c.d<java.lang.String> r1 = com.applovin.impl.sdk.c.d.R     // Catch: java.lang.Throwable -> L33
                    java.lang.String r2 = android.os.Build.VERSION.RELEASE     // Catch: java.lang.Throwable -> L33
                    android.content.Context r3 = com.applovin.impl.sdk.o.au()     // Catch: java.lang.Throwable -> L33
                    com.applovin.impl.sdk.c.e.a(r1, r2, r3)     // Catch: java.lang.Throwable -> L33
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
                    goto L5c
                L33:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
                    throw r1     // Catch: java.lang.Throwable -> L36
                L36:
                    r0 = move-exception
                    com.applovin.impl.sdk.o r1 = r1
                    r1.F()
                    boolean r1 = com.applovin.impl.sdk.y.a()
                    if (r1 == 0) goto L4f
                    com.applovin.impl.sdk.o r1 = r1
                    com.applovin.impl.sdk.y r1 = r1.F()
                    java.lang.String r2 = "WebViewDataCollector"
                    java.lang.String r3 = "Failed to collect user agent"
                    r1.b(r2, r3, r0)
                L4f:
                    com.applovin.impl.sdk.o r1 = r1
                    com.applovin.impl.sdk.s r1 = r1.ag()
                    java.lang.String r2 = "WebViewDataCollector"
                    java.lang.String r3 = "collectUserAgent"
                    r1.a(r2, r3, r0)
                L5c:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.af.AnonymousClass2.run():void");
            }
        });
    }

    public static boolean b() {
        boolean zEquals;
        synchronized (f10265c) {
            zEquals = Build.VERSION.RELEASE.equals((String) com.applovin.impl.sdk.c.e.b(com.applovin.impl.sdk.c.d.R, "", o.au()));
        }
        return zEquals;
    }
}
