package com.applovin.impl.communicator;

import android.content.Intent;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.y;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class b implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakReference<AppLovinCommunicatorSubscriber> f8965c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f8963a = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set<String> f8966d = new LinkedHashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f8967e = new Object();

    public b(String str, AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        this.f8964b = str;
        this.f8965c = new WeakReference<>(appLovinCommunicatorSubscriber);
    }

    public String a() {
        return this.f8964b;
    }

    public void a(boolean z10) {
        this.f8963a = z10;
    }

    public AppLovinCommunicatorSubscriber b() {
        return this.f8965c.get();
    }

    public boolean c() {
        return this.f8963a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber = this.f8965c.get();
        b bVar = (b) obj;
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber2 = bVar.f8965c.get();
        if (a().equals(bVar.a())) {
            if (appLovinCommunicatorSubscriber != null) {
                if (appLovinCommunicatorSubscriber.equals(appLovinCommunicatorSubscriber2)) {
                    return true;
                }
            } else if (appLovinCommunicatorSubscriber == appLovinCommunicatorSubscriber2) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f8964b.hashCode();
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber = this.f8965c.get();
        return (iHashCode * 31) + (appLovinCommunicatorSubscriber != null ? appLovinCommunicatorSubscriber.hashCode() : 0);
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map<String, Object> map) {
        if (b() == null) {
            y.j("AppLovinCommunicator", "Message received for GC'd subscriber");
            return;
        }
        CommunicatorMessageImpl communicatorMessageImpl = (CommunicatorMessageImpl) intent;
        boolean z10 = false;
        synchronized (this.f8967e) {
            if (!this.f8966d.contains(communicatorMessageImpl.getUniqueId())) {
                this.f8966d.add(communicatorMessageImpl.getUniqueId());
                z10 = true;
            }
        }
        if (z10) {
            b().onMessageReceived((AppLovinCommunicatorMessage) communicatorMessageImpl);
        }
    }
}
