package com.applovin.impl.sdk;

import android.os.Process;
import com.applovin.impl.sdk.utils.CollectionUtils;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class AppLovinExceptionHandler implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AppLovinExceptionHandler f10067a = new AppLovinExceptionHandler();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<o> f10068b = new HashSet(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f10069c = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f10070d;

    public static AppLovinExceptionHandler shared() {
        return f10067a;
    }

    public void addSdk(o oVar) {
        this.f10068b.add(oVar);
    }

    public void enable() {
        if (this.f10069c.compareAndSet(false, true)) {
            this.f10070d = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        long jLongValue = 500;
        for (o oVar : this.f10068b) {
            if (!oVar.e()) {
                oVar.F();
                if (y.a()) {
                    oVar.F().b("AppLovinExceptionHandler", "Detected unhandled exception");
                }
                oVar.ag().a(s.a.CRASH, CollectionUtils.map("top_main_method", th.toString()));
                oVar.x().trackEventSynchronously("paused");
                jLongValue = ((Long) oVar.a(com.applovin.impl.sdk.c.b.dR)).longValue();
            }
        }
        try {
            Thread.sleep(jLongValue);
        } catch (InterruptedException unused) {
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f10070d;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } else {
            Process.killProcess(Process.myPid());
            System.exit(1);
        }
    }
}
