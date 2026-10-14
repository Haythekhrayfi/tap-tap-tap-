package com.applovin.impl.sdk;

import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
class aa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Queue<AppLovinAdImpl> f10166a = new LinkedList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f10167b = new Object();

    public int a() {
        int size;
        synchronized (this.f10167b) {
            size = this.f10166a.size();
        }
        return size;
    }

    public void a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f10167b) {
            if (a() <= 25) {
                this.f10166a.offer(appLovinAdImpl);
            } else {
                y.j("AppLovinSdk", "Maximum queue capacity reached - discarding ad...");
            }
        }
    }

    public boolean b() {
        boolean z10;
        synchronized (this.f10167b) {
            z10 = a() == 0;
        }
        return z10;
    }

    public AppLovinAdImpl c() {
        AppLovinAdImpl appLovinAdImplPoll;
        synchronized (this.f10167b) {
            appLovinAdImplPoll = !b() ? this.f10166a.poll() : null;
        }
        return appLovinAdImplPoll;
    }

    public AppLovinAdImpl d() {
        AppLovinAdImpl appLovinAdImplPeek;
        synchronized (this.f10167b) {
            appLovinAdImplPeek = this.f10166a.peek();
        }
        return appLovinAdImplPeek;
    }
}
