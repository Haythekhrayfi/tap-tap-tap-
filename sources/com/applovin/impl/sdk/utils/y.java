package com.applovin.impl.sdk.utils;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<y> f11398a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f11399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f11400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Runnable f11401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f11402e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Timer f11403f;

    private y(long j10, boolean z10, com.applovin.impl.sdk.o oVar, Runnable runnable) {
        Timer timer = new Timer();
        this.f11403f = timer;
        if (j10 < 0) {
            throw new IllegalArgumentException(androidx.viewpager2.adapter.a.a("Cannot create wall clock timer. Invalid timer length: ", j10));
        }
        if (oVar == null) {
            throw new IllegalArgumentException("Cannot create wall clock timer. Sdk is null");
        }
        if (runnable == null) {
            throw new IllegalArgumentException("Cannot create wall clock timer. Runnable is null.");
        }
        this.f11399b = z10;
        this.f11400c = oVar;
        this.f11401d = runnable;
        f11398a.add(this);
        timer.schedule(b(), j10);
    }

    public static y a(long j10, boolean z10, com.applovin.impl.sdk.o oVar, Runnable runnable) {
        return new y(j10, z10, oVar, runnable);
    }

    private TimerTask b() {
        return new TimerTask() { // from class: com.applovin.impl.sdk.utils.y.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                if (!y.this.f11400c.U().isApplicationPaused() || y.this.f11399b) {
                    y.this.c();
                } else {
                    AppLovinBroadcastManager.registerReceiver(new AppLovinBroadcastManager.Receiver() { // from class: com.applovin.impl.sdk.utils.y.1.1
                        @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
                        public void onReceive(Intent intent, Map<String, Object> map) {
                            AppLovinBroadcastManager.unregisterReceiver(this);
                            y.this.c();
                        }
                    }, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Runnable runnable = this.f11401d;
        if (runnable != null) {
            runnable.run();
            a();
        }
    }

    public void a() {
        synchronized (this.f11402e) {
            this.f11403f.cancel();
            this.f11401d = null;
            f11398a.remove(this);
        }
    }
}
