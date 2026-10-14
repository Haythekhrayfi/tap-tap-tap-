package com.applovin.impl.sdk.utils;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class f implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<f> f11205a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t f11206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f11207c;

    private f(long j10, com.applovin.impl.sdk.o oVar, final Runnable runnable) {
        this.f11206b = t.a(j10, oVar, new Runnable() { // from class: com.applovin.impl.sdk.utils.f.1
            @Override // java.lang.Runnable
            public void run() {
                f.this.a();
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        this.f11207c = oVar;
        f11205a.add(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    public static f a(long j10, com.applovin.impl.sdk.o oVar, Runnable runnable) {
        return new f(j10, oVar, runnable);
    }

    public void a() {
        this.f11206b.d();
        AppLovinBroadcastManager.unregisterReceiver(this);
        f11205a.remove(this);
    }

    public long b() {
        return this.f11206b.a();
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f11206b.b();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.f11206b.c();
        }
    }
}
