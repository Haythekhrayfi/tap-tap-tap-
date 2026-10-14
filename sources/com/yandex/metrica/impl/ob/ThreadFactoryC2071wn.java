package com.yandex.metrica.impl.ob;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.wn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class ThreadFactoryC2071wn implements ThreadFactory {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicInteger f17810b = new AtomicInteger(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f17811a;

    public ThreadFactoryC2071wn(String str) {
        this.f17811a = str;
    }

    public static C2046vn a(String str, Runnable runnable) {
        return new C2046vn(runnable, new ThreadFactoryC2071wn(str).a());
    }

    private String a() {
        StringBuilder sbA = android.support.v4.media.c.a(this.f17811a, "-");
        sbA.append(f17810b.incrementAndGet());
        return sbA.toString();
    }

    public static String a(String str) {
        StringBuilder sbA = android.support.v4.media.c.a(str, "-");
        sbA.append(f17810b.incrementAndGet());
        return sbA.toString();
    }

    public static int c() {
        return f17810b.incrementAndGet();
    }

    public HandlerThreadC2016un b() {
        return new HandlerThreadC2016un(a());
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        return new C2046vn(runnable, a());
    }
}
