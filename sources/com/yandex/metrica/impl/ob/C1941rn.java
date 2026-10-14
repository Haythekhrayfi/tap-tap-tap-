package com.yandex.metrica.impl.ob;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.rn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1941rn implements InterfaceExecutorC1966sn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Looper f17253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f17254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HandlerThreadC2016un f17255c;

    public C1941rn(HandlerThreadC2016un handlerThreadC2016un) {
        this(handlerThreadC2016un, handlerThreadC2016un.getLooper(), new Handler(handlerThreadC2016un.getLooper()));
    }

    public C1941rn(HandlerThreadC2016un handlerThreadC2016un, Looper looper, Handler handler) {
        this.f17255c = handlerThreadC2016un;
        this.f17253a = looper;
        this.f17254b = handler;
    }

    public C1941rn(String str) {
        this(a(str));
    }

    private static HandlerThreadC2016un a(String str) {
        HandlerThreadC2016un handlerThreadC2016unB = new ThreadFactoryC2071wn(str).b();
        handlerThreadC2016unB.start();
        return handlerThreadC2016unB;
    }

    public Handler a() {
        return this.f17254b;
    }

    public <T> Future<T> a(Callable<T> callable) {
        FutureTask futureTask = new FutureTask(callable);
        this.f17254b.post(futureTask);
        return futureTask;
    }

    public void a(Runnable runnable) {
        this.f17254b.removeCallbacks(runnable);
    }

    public void a(Runnable runnable, long j10) {
        this.f17254b.postDelayed(runnable, TimeUnit.MILLISECONDS.toMillis(j10));
    }

    public void a(Runnable runnable, long j10, TimeUnit timeUnit) {
        this.f17254b.postDelayed(runnable, timeUnit.toMillis(j10));
    }

    public Looper b() {
        return this.f17253a;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1991tn
    public boolean c() {
        return this.f17255c.c();
    }

    public void d() {
        this.f17254b.removeCallbacksAndMessages(null);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f17254b.post(runnable);
    }
}
