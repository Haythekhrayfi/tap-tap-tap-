package com.yandex.mobile.ads.impl;

import android.os.Process;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: loaded from: classes3.dex */
public final class jg extends Thread {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final boolean f22035h = ci1.f19511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BlockingQueue<mw0<?>> f22036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final BlockingQueue<mw0<?>> f22037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final eg f22038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ox0 f22039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f22040f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ni1 f22041g;

    public jg(PriorityBlockingQueue priorityBlockingQueue, PriorityBlockingQueue priorityBlockingQueue2, eg egVar, ox0 ox0Var) {
        this.f22036b = priorityBlockingQueue;
        this.f22037c = priorityBlockingQueue2;
        this.f22038d = egVar;
        this.f22039e = ox0Var;
        this.f22041g = new ni1(this, priorityBlockingQueue2, ox0Var);
    }

    private void a() throws InterruptedException {
        js jsVar;
        BlockingQueue<mw0<?>> blockingQueue;
        mw0<?> mw0VarTake = this.f22036b.take();
        mw0VarTake.a("cache-queue-take");
        mw0VarTake.a(1);
        try {
            if (mw0VarTake.o()) {
                mw0VarTake.c("cache-discard-canceled");
            } else {
                eg.a aVar = this.f22038d.get(mw0VarTake.e());
                if (aVar == null) {
                    mw0VarTake.a("cache-miss");
                    if (!this.f22041g.a(mw0VarTake)) {
                        blockingQueue = this.f22037c;
                        blockingQueue.put(mw0VarTake);
                    }
                } else {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (aVar.f20243e < jCurrentTimeMillis) {
                        mw0VarTake.a("cache-hit-expired");
                        mw0VarTake.a(aVar);
                        if (!this.f22041g.a(mw0VarTake)) {
                            blockingQueue = this.f22037c;
                            blockingQueue.put(mw0VarTake);
                        }
                    } else {
                        mw0VarTake.a("cache-hit");
                        gx0<?> gx0VarA = mw0VarTake.a(new wm0(aVar.f20239a, aVar.f20245g));
                        mw0VarTake.a("cache-hit-parsed");
                        if (gx0VarA.f21228c == null) {
                            if (aVar.f20244f < jCurrentTimeMillis) {
                                mw0VarTake.a("cache-hit-refresh-needed");
                                mw0VarTake.a(aVar);
                                gx0VarA.f21229d = true;
                                if (this.f22041g.a(mw0VarTake)) {
                                    jsVar = (js) this.f22039e;
                                } else {
                                    ((js) this.f22039e).a(mw0VarTake, gx0VarA, new ig(this, mw0VarTake));
                                }
                            } else {
                                jsVar = (js) this.f22039e;
                            }
                            jsVar.a(mw0VarTake, gx0VarA, null);
                        } else {
                            mw0VarTake.a("cache-parsing-failed");
                            this.f22038d.a(mw0VarTake.e());
                            mw0VarTake.a((eg.a) null);
                            if (!this.f22041g.a(mw0VarTake)) {
                                blockingQueue = this.f22037c;
                                blockingQueue.put(mw0VarTake);
                            }
                        }
                    }
                }
            }
        } finally {
            mw0VarTake.a(2);
        }
    }

    public final void b() {
        this.f22040f = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (f22035h) {
            x60.e("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f22038d.a();
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f22040f) {
                    Thread.currentThread().interrupt();
                    return;
                }
                x60.c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            } catch (Throwable unused2) {
                x60.c("Fatal exception during request process in CacheDispatcher", new Object[0]);
                return;
            }
        }
    }
}
