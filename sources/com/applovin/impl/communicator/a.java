package com.applovin.impl.communicator;

import android.content.IntentFilter;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.y;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<b> f8961a = new HashSet(32);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f8962b = new Object();

    private b a(String str, AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        for (b bVar : this.f8961a) {
            if (str.equals(bVar.a()) && appLovinCommunicatorSubscriber.equals(bVar.b())) {
                return bVar;
            }
        }
        return null;
    }

    public boolean a(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        if (appLovinCommunicatorSubscriber == null || !StringUtils.isValidString(str)) {
            y.j("AppLovinCommunicator", "Unable to subscribe - invalid subscriber (" + appLovinCommunicatorSubscriber + ") or topic (" + str + ")");
            return false;
        }
        synchronized (this.f8962b) {
            b bVarA = a(str, appLovinCommunicatorSubscriber);
            if (bVarA == null) {
                b bVar = new b(str, appLovinCommunicatorSubscriber);
                this.f8961a.add(bVar);
                AppLovinBroadcastManager.registerReceiver(bVar, new IntentFilter(str));
                return true;
            }
            y.j("AppLovinCommunicator", "Attempting to re-subscribe subscriber (" + appLovinCommunicatorSubscriber + ") to topic (" + str + ")");
            if (!bVarA.c()) {
                bVarA.a(true);
                AppLovinBroadcastManager.registerReceiver(bVarA, new IntentFilter(str));
            }
            return true;
        }
    }

    public boolean a(String str) {
        synchronized (this.f8962b) {
            Iterator<b> it = this.f8961a.iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().a())) {
                    return true;
                }
            }
            return false;
        }
    }

    public void b(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        b bVarA;
        if (StringUtils.isValidString(str)) {
            synchronized (this.f8962b) {
                bVarA = a(str, appLovinCommunicatorSubscriber);
            }
            if (bVarA != null) {
                bVarA.a(false);
                AppLovinBroadcastManager.unregisterReceiver(bVarA);
            }
        }
    }
}
