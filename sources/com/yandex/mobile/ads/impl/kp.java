package com.yandex.mobile.ads.impl;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class kp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ThreadPoolExecutor f22476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque<wu0.a> f22477b = new ArrayDeque<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque<wu0.a> f22478c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayDeque<wu0> f22479d = new ArrayDeque<>();

    /* JADX WARN: Code duplicated, block: B:25:0x0088  */
    /* JADX WARN: Code duplicated, block: B:29:0x0093 A[Catch: all -> 0x00cb, TryCatch #1 {, blocks: (B:27:0x008f, B:29:0x0093, B:30:0x00bf), top: B:44:0x008f }] */
    /* JADX WARN: Code duplicated, block: B:44:0x008f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:29:0x0093, please report this as an issue */
    private final void a() {
        int size;
        int i10;
        if (ea1.f20136f && Thread.holdsLock(this)) {
            StringBuilder sbA = v60.a("Thread ");
            sbA.append(Thread.currentThread().getName());
            sbA.append(" MUST NOT hold lock on ");
            sbA.append(this);
            throw new AssertionError(sbA.toString());
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<wu0.a> it = this.f22477b.iterator();
            fd.j0.h(it, "readyAsyncCalls.iterator()");
            while (it.hasNext()) {
                wu0.a next = it.next();
                if (this.f22478c.size() >= 64) {
                    break;
                }
                if (next.b().get() < 5) {
                    it.remove();
                    next.b().incrementAndGet();
                    arrayList.add(next);
                    this.f22478c.add(next);
                }
            }
            synchronized (this) {
                this.f22478c.size();
                this.f22479d.size();
            }
            size = arrayList.size();
            for (i10 = 0; i10 < size; i10++) {
                wu0.a aVar = (wu0.a) arrayList.get(i10);
                synchronized (this) {
                    if (this.f22476a == null) {
                        this.f22476a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), ea1.a(ea1.f20137g + " Dispatcher", false));
                    }
                    ThreadPoolExecutor threadPoolExecutor = this.f22476a;
                    fd.j0.f(threadPoolExecutor);
                }
                aVar.a(threadPoolExecutor);
            }
        }
        size = arrayList.size();
        while (i10 < size) {
            wu0.a aVar2 = (wu0.a) arrayList.get(i10);
            synchronized (this) {
                if (this.f22476a == null) {
                    this.f22476a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), ea1.a(ea1.f20137g + " Dispatcher", false));
                }
                ThreadPoolExecutor threadPoolExecutor2 = this.f22476a;
                fd.j0.f(threadPoolExecutor2);
                aVar2.a(threadPoolExecutor2);
            }
        }
    }

    private final void a(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        a();
    }

    public final void a(wu0.a aVar) {
        wu0.a next;
        fd.j0.i(aVar, "call");
        synchronized (this) {
            this.f22477b.add(aVar);
            if (!aVar.a().f()) {
                String strC = aVar.c();
                Iterator<wu0.a> it = this.f22478c.iterator();
                do {
                    if (!it.hasNext()) {
                        Iterator<wu0.a> it2 = this.f22477b.iterator();
                        do {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                        } while (!fd.j0.d(next.c(), strC));
                    } else {
                        next = it.next();
                    }
                } while (!fd.j0.d(next.c(), strC));
                if (next != null) {
                    aVar.a(next);
                }
            }
        }
        a();
    }

    public final synchronized void a(wu0 wu0Var) {
        fd.j0.i(wu0Var, "call");
        this.f22479d.add(wu0Var);
    }

    public final void b(wu0.a aVar) {
        fd.j0.i(aVar, "call");
        aVar.b().decrementAndGet();
        a(this.f22478c, aVar);
    }

    public final void b(wu0 wu0Var) {
        fd.j0.i(wu0Var, "call");
        ArrayDeque<wu0> arrayDeque = this.f22479d;
        synchronized (this) {
            if (!arrayDeque.remove(wu0Var)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        a();
    }
}
