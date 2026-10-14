package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public class R1 extends C2046vn implements F2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f14837b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile b f14842g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Rd f14843h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final I9 f14844i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final BlockingQueue<b> f14839d = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f14840e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f14841f = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Executor f14838c = new ExecutorC1867on();

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T1 f14845a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f14846b;

        private b(T1 t10) {
            this.f14845a = t10;
            this.f14846b = t10.a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            return this.f14846b.equals(((b) obj).f14846b);
        }

        public int hashCode() {
            return this.f14846b.hashCode();
        }
    }

    public R1(Context context, Executor executor, I9 i10) {
        this.f14837b = executor;
        this.f14844i = i10;
        this.f14843h = new Rd(context);
    }

    public W1 a(T1 t10) {
        return new W1(this.f14843h, new Sd(new Td(this.f14844i, t10.b()), t10.j()), t10, this, new V1(), "NetworkTaskQueue");
    }

    @Override // com.yandex.metrica.impl.ob.F2
    public void a() {
    }

    @Override // com.yandex.metrica.impl.ob.F2
    public void b() {
        synchronized (this.f14841f) {
            b bVar = this.f14842g;
            if (bVar != null) {
                bVar.f14845a.x();
            }
            ArrayList arrayList = new ArrayList(this.f14839d.size());
            this.f14839d.drainTo(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((b) it.next()).f14845a.x();
            }
        }
    }

    public void b(T1 t10) {
        synchronized (this.f14840e) {
            b bVar = new b(t10);
            if (c()) {
                if (!(this.f14839d.contains(bVar) || bVar.equals(this.f14842g)) && bVar.f14845a.u()) {
                    this.f14839d.offer(bVar);
                }
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        T1 t10 = null;
        while (c()) {
            try {
                synchronized (this.f14841f) {
                    try {
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.f14842g = this.f14839d.take();
                t10 = this.f14842g.f14845a;
                (t10.z() ? this.f14837b : this.f14838c).execute(a(t10));
                synchronized (this.f14841f) {
                    this.f14842g = null;
                    t10.w();
                    t10.x();
                }
            } catch (InterruptedException unused) {
                synchronized (this.f14841f) {
                    this.f14842g = null;
                    if (t10 != null) {
                        t10.w();
                        t10.x();
                    }
                }
            } catch (Throwable th2) {
                synchronized (this.f14841f) {
                    this.f14842g = null;
                    if (t10 != null) {
                        t10.w();
                        t10.x();
                    }
                    throw th2;
                }
            }
        }
    }
}
