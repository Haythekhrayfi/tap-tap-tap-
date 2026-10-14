package com.applovin.impl.sdk;

import android.os.Handler;
import android.os.HandlerThread;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final g f10684l = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f10686b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Handler f10688d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private o f10691g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Thread f10692h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f10693i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f10694j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f10695k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicLong f10685a = new AtomicLong(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HandlerThread f10687c = new HandlerThread("AppLovinSdk:anr_detector");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f10689e = new AtomicBoolean();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f10690f = new AtomicBoolean();

    public class a implements Runnable {
        private a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            if (g.this.f10689e.get()) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - g.this.f10685a.get();
            if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > g.this.f10693i) {
                g.this.a();
                if (g.this.f10692h == null || g.this.f10692h.getStackTrace().length <= 0) {
                    str = "None";
                } else {
                    StackTraceElement stackTraceElement = g.this.f10692h.getStackTrace()[0];
                    str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
                }
                g.this.f10691g.ag().a(s.a.ANR, CollectionUtils.map("top_main_method", str));
            }
            g.this.f10688d.postDelayed(this, g.this.f10695k);
        }
    }

    public class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (g.this.f10689e.get()) {
                return;
            }
            g.this.f10685a.set(System.currentTimeMillis());
            g.this.f10686b.postDelayed(this, g.this.f10694j);
        }
    }

    private g() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f10693i = timeUnit.toMillis(4L);
        this.f10694j = timeUnit.toMillis(3L);
        this.f10695k = timeUnit.toMillis(3L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.f10690f.get()) {
            this.f10689e.set(true);
        }
    }

    public static void a(o oVar) {
        if (oVar != null) {
            if (!((Boolean) oVar.a(com.applovin.impl.sdk.c.b.gq)).booleanValue() || com.applovin.impl.sdk.utils.w.a(o.au(), oVar)) {
                f10684l.a();
            } else {
                f10684l.b(oVar);
            }
        }
    }

    private void b(o oVar) {
        if (this.f10690f.compareAndSet(false, true)) {
            this.f10691g = oVar;
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.g.1
                @Override // java.lang.Runnable
                public void run() {
                    g.this.f10692h = Thread.currentThread();
                }
            });
            this.f10693i = ((Long) oVar.a(com.applovin.impl.sdk.c.b.gr)).longValue();
            this.f10694j = ((Long) oVar.a(com.applovin.impl.sdk.c.b.gs)).longValue();
            this.f10695k = ((Long) oVar.a(com.applovin.impl.sdk.c.b.gt)).longValue();
            this.f10686b = new Handler(o.au().getMainLooper());
            this.f10687c.start();
            this.f10686b.post(new b());
            Handler handler = new Handler(this.f10687c.getLooper());
            this.f10688d = handler;
            handler.postDelayed(new a(), this.f10695k / 2);
        }
    }
}
