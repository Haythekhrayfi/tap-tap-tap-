package com.yandex.mobile.ads.impl;

import java.lang.Exception;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ty0<R, E extends Exception> implements RunnableFuture<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final gk f25518b = new gk();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final gk f25519c = new gk();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f25520d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Exception f25521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Thread f25522f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f25523g;

    public final void a() {
        this.f25519c.b();
    }

    public abstract void b();

    public abstract void c() throws Exception;

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        synchronized (this.f25520d) {
            if (!this.f25523g && !this.f25519c.d()) {
                this.f25523g = true;
                b();
                Thread thread = this.f25522f;
                if (thread == null) {
                    this.f25518b.e();
                    this.f25519c.e();
                } else if (z10) {
                    thread.interrupt();
                }
                return true;
            }
            return false;
        }
    }

    @Override // java.util.concurrent.Future
    public final R get() throws ExecutionException, InterruptedException {
        this.f25519c.a();
        if (this.f25523g) {
            throw new CancellationException();
        }
        if (this.f25521e == null) {
            return null;
        }
        throw new ExecutionException(this.f25521e);
    }

    @Override // java.util.concurrent.Future
    public final R get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (!this.f25519c.a(TimeUnit.MILLISECONDS.convert(j10, timeUnit))) {
            throw new TimeoutException();
        }
        if (this.f25523g) {
            throw new CancellationException();
        }
        if (this.f25521e == null) {
            return null;
        }
        throw new ExecutionException(this.f25521e);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f25523g;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f25519c.d();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        synchronized (this.f25520d) {
            if (this.f25523g) {
                return;
            }
            this.f25522f = Thread.currentThread();
            this.f25518b.e();
            try {
                try {
                    c();
                    synchronized (this.f25520d) {
                        this.f25519c.e();
                        this.f25522f = null;
                        Thread.interrupted();
                    }
                } catch (Exception e10) {
                    this.f25521e = e10;
                    synchronized (this.f25520d) {
                        this.f25519c.e();
                        this.f25522f = null;
                        Thread.interrupted();
                    }
                }
            } catch (Throwable th) {
                synchronized (this.f25520d) {
                    this.f25519c.e();
                    this.f25522f = null;
                    Thread.interrupted();
                    throw th;
                }
            }
        }
    }
}
