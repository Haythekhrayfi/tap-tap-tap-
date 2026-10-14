package com.applovin.communicator;

import android.content.Context;
import com.applovin.impl.communicator.MessagingServiceImpl;
import com.applovin.impl.communicator.a;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.y;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AppLovinCommunicator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static AppLovinCommunicator f3904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f3905b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private o f3906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private y f3907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f3908e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final MessagingServiceImpl f3909f = new MessagingServiceImpl();

    private void a(String str) {
        if (this.f3907d == null || !y.a()) {
            return;
        }
        this.f3907d.b("AppLovinCommunicator", str);
    }

    public static AppLovinCommunicator getInstance(Context context) {
        synchronized (f3905b) {
            if (f3904a == null) {
                f3904a = new AppLovinCommunicator();
            }
        }
        return f3904a;
    }

    public void a(o oVar) {
        this.f3906c = oVar;
        this.f3907d = oVar.F();
        a("Attached SDK instance: " + oVar + "...");
    }

    public AppLovinCommunicatorMessagingService getMessagingService() {
        return this.f3909f;
    }

    public boolean hasSubscriber(String str) {
        return this.f3908e.a(str);
    }

    public boolean respondsToTopic(String str) {
        return this.f3906c.X().c(str);
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        subscribe(appLovinCommunicatorSubscriber, Collections.singletonList(str));
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String str : list) {
            if (!this.f3908e.a(appLovinCommunicatorSubscriber, str)) {
                a("Unable to subscribe " + appLovinCommunicatorSubscriber + " to topic: " + str);
            }
        }
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("AppLovinCommunicator{sdk=");
        sbA.append(this.f3906c);
        sbA.append('}');
        return sbA.toString();
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        unsubscribe(appLovinCommunicatorSubscriber, Collections.singletonList(str));
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String str : list) {
            a("Unsubscribing " + appLovinCommunicatorSubscriber + " from topic: " + str);
            this.f3908e.b(appLovinCommunicatorSubscriber, str);
        }
    }
}
