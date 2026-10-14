package com.yandex.mobile.ads.impl;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: loaded from: classes3.dex */
public final class sm0 extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BlockingQueue<mw0<?>> f25136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final rm0 f25137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final eg f25138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ox0 f25139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f25140f = false;

    public sm0(PriorityBlockingQueue priorityBlockingQueue, rm0 rm0Var, eg egVar, ox0 ox0Var) {
        this.f25136b = priorityBlockingQueue;
        this.f25137c = rm0Var;
        this.f25138d = egVar;
        this.f25139e = ox0Var;
    }

    private void a() throws InterruptedException {
        mw0<?> mw0VarTake = this.f25136b.take();
        SystemClock.elapsedRealtime();
        mw0VarTake.a(3);
        try {
            try {
                mw0VarTake.a("network-queue-take");
                if (!mw0VarTake.o()) {
                    TrafficStats.setThreadStatsTag(mw0VarTake.l());
                    wm0 wm0VarA = ((qe) this.f25137c).a(mw0VarTake);
                    mw0VarTake.a("network-http-complete");
                    if (wm0VarA.f26323e && mw0VarTake.n()) {
                        mw0VarTake.c("not-modified");
                    } else {
                        gx0<?> gx0VarA = mw0VarTake.a(wm0VarA);
                        mw0VarTake.a("network-parse-complete");
                        if (mw0VarTake.s() && gx0VarA.f21227b != null) {
                            this.f25138d.a(mw0VarTake.e(), gx0VarA.f21227b);
                            mw0VarTake.a("network-cache-written");
                        }
                        mw0VarTake.p();
                        ((js) this.f25139e).a(mw0VarTake, gx0VarA, null);
                        mw0VarTake.a(gx0VarA);
                    }
                    mw0VarTake.a(4);
                }
                mw0VarTake.c("network-discard-cancelled");
                mw0VarTake.q();
            } catch (bi1 e10) {
                SystemClock.elapsedRealtime();
                ((js) this.f25139e).a(mw0VarTake, mw0VarTake.b(e10));
                mw0VarTake.q();
            } catch (Exception e11) {
                Object[] objArr = {e11.toString()};
                boolean z10 = ci1.f19511a;
                x60.a(e11, "Unhandled exception %s", objArr);
                bi1 bi1Var = new bi1((Throwable) e11);
                SystemClock.elapsedRealtime();
                ((js) this.f25139e).a(mw0VarTake, bi1Var);
                mw0VarTake.q();
            }
            mw0VarTake.a(4);
        } catch (Throwable th) {
            mw0VarTake.a(4);
            throw th;
        }
    }

    public final void b() {
        this.f25140f = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f25140f) {
                    Thread.currentThread().interrupt();
                    return;
                } else {
                    boolean z10 = ci1.f19511a;
                    x60.c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
                }
            } catch (Throwable unused2) {
                boolean z11 = ci1.f19511a;
                x60.c("Fatal exception during request process in NetworkDispatcher", new Object[0]);
                return;
            }
        }
    }
}
