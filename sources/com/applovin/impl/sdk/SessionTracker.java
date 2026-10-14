package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class SessionTracker {
    public static final String ACTION_APPLICATION_PAUSED = "com.applovin.application_paused";
    public static final String ACTION_APPLICATION_RESUMED = "com.applovin.application_resumed";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f10089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f10090b = new AtomicBoolean();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f10091c = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicInteger f10092d = new AtomicInteger();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Date f10093e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Date f10094f;

    public SessionTracker(o oVar) {
        this.f10089a = oVar;
        Application application = (Application) o.au();
        application.registerActivityLifecycleCallbacks(new com.applovin.impl.sdk.utils.a() { // from class: com.applovin.impl.sdk.SessionTracker.1
            @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                super.onActivityResumed(activity);
                SessionTracker.this.a();
            }
        });
        application.registerComponentCallbacks(new ComponentCallbacks2() { // from class: com.applovin.impl.sdk.SessionTracker.2
            @Override // android.content.ComponentCallbacks
            public void onConfigurationChanged(Configuration configuration) {
            }

            @Override // android.content.ComponentCallbacks
            public void onLowMemory() {
            }

            @Override // android.content.ComponentCallbacks2
            public void onTrimMemory(int i10) {
                SessionTracker.this.f10092d.set(i10);
                if (i10 == 20) {
                    SessionTracker.this.b();
                }
            }
        });
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        application.registerReceiver(new BroadcastReceiver() { // from class: com.applovin.impl.sdk.SessionTracker.3
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                String action = intent.getAction();
                if ("android.intent.action.USER_PRESENT".equals(action)) {
                    if (com.applovin.impl.sdk.utils.w.c()) {
                        SessionTracker.this.a();
                    }
                } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                    SessionTracker.this.b();
                }
            }
        }, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.f10091c.compareAndSet(true, false)) {
            d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.f10091c.compareAndSet(false, true)) {
            c();
        }
    }

    private void c() {
        this.f10089a.F();
        if (y.a()) {
            this.f10089a.F().b("SessionTracker", "Application Paused");
        }
        AppLovinBroadcastManager.sendBroadcastSync(new Intent(ACTION_APPLICATION_PAUSED), null);
        if (this.f10090b.get()) {
            return;
        }
        boolean zBooleanValue = ((Boolean) this.f10089a.a(com.applovin.impl.sdk.c.b.dW)).booleanValue();
        long millis = TimeUnit.MINUTES.toMillis(((Long) this.f10089a.a(com.applovin.impl.sdk.c.b.dY)).longValue());
        if (this.f10093e == null || System.currentTimeMillis() - this.f10093e.getTime() >= millis) {
            this.f10089a.x().trackEvent("paused");
            if (zBooleanValue) {
                this.f10093e = new Date();
            }
        }
        if (zBooleanValue) {
            return;
        }
        this.f10093e = new Date();
    }

    private void d() {
        this.f10089a.F();
        if (y.a()) {
            this.f10089a.F().b("SessionTracker", "Application Resumed");
        }
        boolean zBooleanValue = ((Boolean) this.f10089a.a(com.applovin.impl.sdk.c.b.dW)).booleanValue();
        long jLongValue = ((Long) this.f10089a.a(com.applovin.impl.sdk.c.b.dX)).longValue();
        AppLovinBroadcastManager.sendBroadcastSync(new Intent(ACTION_APPLICATION_RESUMED), null);
        if (this.f10090b.getAndSet(false)) {
            return;
        }
        long millis = TimeUnit.MINUTES.toMillis(jLongValue);
        if (this.f10094f == null || System.currentTimeMillis() - this.f10094f.getTime() >= millis) {
            this.f10089a.x().trackEvent("resumed");
            if (zBooleanValue) {
                this.f10094f = new Date();
            }
        }
        if (!zBooleanValue) {
            this.f10094f = new Date();
        }
        this.f10089a.J().a(com.applovin.impl.sdk.d.f.f10475m);
    }

    public int getLastTrimMemoryLevel() {
        return this.f10092d.get();
    }

    public boolean isApplicationPaused() {
        return this.f10091c.get();
    }

    public void pauseForClick() {
        this.f10090b.set(true);
    }

    public void resumeForClick() {
        this.f10090b.set(false);
    }
}
