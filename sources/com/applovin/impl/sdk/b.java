package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class b implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f10269a = TimeUnit.SECONDS.toMillis(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f10270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y f10271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<c> f10272d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f10273e = new Object();

    public interface a {
        void onAdExpired(com.applovin.impl.sdk.ad.g gVar);
    }

    public b(o oVar) {
        this.f10270b = oVar;
        this.f10271c = oVar.F();
    }

    private void a() {
        synchronized (this.f10273e) {
            Iterator<c> it = this.f10272d.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    private c b(com.applovin.impl.sdk.ad.g gVar) {
        synchronized (this.f10273e) {
            try {
                if (gVar == null) {
                    return null;
                }
                for (c cVar : this.f10272d) {
                    if (gVar == cVar.a()) {
                        return cVar;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void b() {
        HashSet<c> hashSet = new HashSet();
        synchronized (this.f10273e) {
            for (c cVar : this.f10272d) {
                com.applovin.impl.sdk.ad.g gVarA = cVar.a();
                if (gVarA != null) {
                    long jU = gVarA.U();
                    if (jU > 0) {
                        if (y.a()) {
                            this.f10271c.b("AdExpirationManager", "Rescheduling expiration with remaining " + TimeUnit.MILLISECONDS.toSeconds(jU) + " seconds for ad: " + gVarA);
                        }
                        cVar.a(jU);
                    } else if (y.a()) {
                        this.f10271c.b("AdExpirationManager", "Ad expired while app was paused. Preparing to notify listener for ad: " + gVarA);
                    }
                }
                hashSet.add(cVar);
            }
        }
        for (c cVar2 : hashSet) {
            a(cVar2);
            cVar2.c();
        }
    }

    public void a(com.applovin.impl.sdk.ad.g gVar) {
        synchronized (this.f10273e) {
            c cVarB = b(gVar);
            if (cVarB != null) {
                if (y.a()) {
                    this.f10271c.b("AdExpirationManager", "Cancelling expiration timer for ad: " + gVar);
                }
                cVarB.b();
                a(cVarB);
            }
        }
    }

    public void a(c cVar) {
        synchronized (this.f10273e) {
            this.f10272d.remove(cVar);
            if (this.f10272d.isEmpty()) {
                AppLovinBroadcastManager.unregisterReceiver(this);
            }
        }
    }

    public boolean a(com.applovin.impl.sdk.ad.g gVar, a aVar) {
        synchronized (this.f10273e) {
            if (b(gVar) != null) {
                if (y.a()) {
                    this.f10271c.b("AdExpirationManager", "Ad expiration already scheduled for ad: " + gVar);
                }
                return true;
            }
            if (gVar.U() <= f10269a) {
                if (y.a()) {
                    this.f10271c.b("AdExpirationManager", "Ad has already expired: " + gVar);
                }
                gVar.V();
                return false;
            }
            if (y.a()) {
                this.f10271c.b("AdExpirationManager", "Scheduling ad expiration " + TimeUnit.MILLISECONDS.toSeconds(gVar.U()) + " seconds from now for " + gVar + "...");
            }
            if (this.f10272d.isEmpty()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
            }
            this.f10272d.add(c.a(gVar, aVar, this.f10270b));
            return true;
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            a();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            b();
        }
    }
}
