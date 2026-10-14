package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: loaded from: classes3.dex */
final class ni1 implements mw0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f23391a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ox0 f23392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final jg f23393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final BlockingQueue<mw0<?>> f23394d;

    public ni1(jg jgVar, PriorityBlockingQueue priorityBlockingQueue, ox0 ox0Var) {
        this.f23392b = ox0Var;
        this.f23393c = jgVar;
        this.f23394d = priorityBlockingQueue;
    }

    public final void a(mw0<?> mw0Var, gx0<?> gx0Var) {
        List list;
        eg.a aVar = gx0Var.f21227b;
        if (aVar != null) {
            if (!(aVar.f20243e < System.currentTimeMillis())) {
                String strE = mw0Var.e();
                synchronized (this) {
                    list = (List) this.f23391a.remove(strE);
                }
                if (list != null) {
                    if (ci1.f19511a) {
                        x60.e("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), strE);
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((js) this.f23392b).a((mw0) it.next(), gx0Var, null);
                    }
                    return;
                }
                return;
            }
        }
        b(mw0Var);
    }

    public final synchronized boolean a(mw0<?> mw0Var) {
        String strE = mw0Var.e();
        if (!this.f23391a.containsKey(strE)) {
            this.f23391a.put(strE, null);
            mw0Var.a((mw0.b) this);
            if (ci1.f19511a) {
                x60.b("new request, sending to network %s", strE);
            }
            return false;
        }
        List arrayList = (List) this.f23391a.get(strE);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        mw0Var.a("waiting-for-response");
        arrayList.add(mw0Var);
        this.f23391a.put(strE, arrayList);
        if (ci1.f19511a) {
            x60.b("Request for cacheKey=%s is in flight, putting on hold.", strE);
        }
        return true;
    }

    public final synchronized void b(mw0<?> mw0Var) {
        BlockingQueue<mw0<?>> blockingQueue;
        String strE = mw0Var.e();
        List list = (List) this.f23391a.remove(strE);
        if (list != null && !list.isEmpty()) {
            if (ci1.f19511a) {
                x60.e("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), strE);
            }
            mw0<?> mw0Var2 = (mw0) list.remove(0);
            this.f23391a.put(strE, list);
            mw0Var2.a((mw0.b) this);
            if (this.f23393c != null && (blockingQueue = this.f23394d) != null) {
                try {
                    blockingQueue.put(mw0Var2);
                } catch (InterruptedException e10) {
                    x60.c("Couldn't add request to queue. %s", e10.toString());
                    Thread.currentThread().interrupt();
                    this.f23393c.b();
                }
            }
        }
    }
}
