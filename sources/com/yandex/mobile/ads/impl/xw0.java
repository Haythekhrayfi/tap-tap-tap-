package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class xw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicInteger f26647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashSet f26648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PriorityBlockingQueue<mw0<?>> f26649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PriorityBlockingQueue<mw0<?>> f26650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final eg f26651e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final rm0 f26652f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ox0 f26653g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final sm0[] f26654h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private jg f26655i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ArrayList f26656j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ArrayList f26657k;

    public interface a {
        void a();
    }

    public interface b {
        boolean a(mw0<?> mw0Var);
    }

    @Deprecated
    public interface c<T> {
        void a();
    }

    public xw0(eg egVar, qe qeVar, int i10) {
        this(egVar, qeVar, i10, new js(new Handler(Looper.getMainLooper())));
    }

    public xw0(eg egVar, qe qeVar, int i10, js jsVar) {
        this.f26647a = new AtomicInteger();
        this.f26648b = new HashSet();
        this.f26649c = new PriorityBlockingQueue<>();
        this.f26650d = new PriorityBlockingQueue<>();
        this.f26656j = new ArrayList();
        this.f26657k = new ArrayList();
        this.f26651e = egVar;
        this.f26652f = qeVar;
        this.f26654h = new sm0[i10];
        this.f26653g = jsVar;
    }

    public final void a() {
        jg jgVar = this.f26655i;
        if (jgVar != null) {
            jgVar.b();
        }
        for (sm0 sm0Var : this.f26654h) {
            if (sm0Var != null) {
                sm0Var.b();
            }
        }
        jg jgVar2 = new jg(this.f26649c, this.f26650d, this.f26651e, this.f26653g);
        this.f26655i = jgVar2;
        jgVar2.start();
        for (int i10 = 0; i10 < this.f26654h.length; i10++) {
            sm0 sm0Var2 = new sm0(this.f26650d, this.f26652f, this.f26651e, this.f26653g);
            this.f26654h[i10] = sm0Var2;
            sm0Var2.start();
        }
    }

    public final void a(mw0 mw0Var) {
        mw0Var.a(this);
        synchronized (this.f26648b) {
            this.f26648b.add(mw0Var);
        }
        mw0Var.b(this.f26647a.incrementAndGet());
        mw0Var.a("add-to-queue");
        a(mw0Var, 0);
        (!mw0Var.s() ? this.f26650d : this.f26649c).add(mw0Var);
    }

    public final void a(mw0<?> mw0Var, int i10) {
        synchronized (this.f26657k) {
            Iterator it = this.f26657k.iterator();
            while (it.hasNext()) {
                ((a) it.next()).a();
            }
        }
    }

    public final void a(b bVar) {
        synchronized (this.f26648b) {
            for (mw0<?> mw0Var : this.f26648b) {
                if (bVar.a(mw0Var)) {
                    mw0Var.a();
                }
            }
        }
    }

    public final <T> void b(mw0<T> mw0Var) {
        synchronized (this.f26648b) {
            this.f26648b.remove(mw0Var);
        }
        synchronized (this.f26656j) {
            Iterator it = this.f26656j.iterator();
            while (it.hasNext()) {
                ((c) it.next()).a();
            }
        }
        a(mw0Var, 5);
    }
}
