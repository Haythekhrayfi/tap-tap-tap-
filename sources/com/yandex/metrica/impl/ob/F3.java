package com.yandex.metrica.impl.ob;

import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public class F3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2046vn f13952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BlockingQueue<b> f13953b = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap<Class, CopyOnWriteArrayList<J3<? extends H3>>> f13954c = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private WeakHashMap<Object, CopyOnWriteArrayList<d>> f13955d = new WeakHashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ConcurrentHashMap<Class, H3> f13956e = new ConcurrentHashMap<>();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                Objects.requireNonNull(F3.this);
                try {
                    ((b) F3.this.f13953b.take()).a();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final H3 f13958a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final J3<? extends H3> f13959b;

        private b(H3 h10, J3<? extends H3> j10) {
            this.f13958a = h10;
            this.f13959b = j10;
        }

        public /* synthetic */ b(H3 h10, J3 j10, a aVar) {
            this(h10, j10);
        }

        public void a() {
            try {
                if (this.f13959b.a(this.f13958a)) {
                    return;
                }
                this.f13959b.b(this.f13958a);
            } catch (Throwable unused) {
            }
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final F3 f13960a = new F3();
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CopyOnWriteArrayList<J3<? extends H3>> f13961a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final J3<? extends H3> f13962b;

        private d(CopyOnWriteArrayList<J3<? extends H3>> copyOnWriteArrayList, J3<? extends H3> j10) {
            this.f13961a = copyOnWriteArrayList;
            this.f13962b = j10;
        }

        public /* synthetic */ d(CopyOnWriteArrayList copyOnWriteArrayList, J3 j10, a aVar) {
            this(copyOnWriteArrayList, j10);
        }

        public void finalize() throws Throwable {
            super.finalize();
            this.f13961a.remove(this.f13962b);
        }
    }

    public F3() {
        C2046vn c2046vnA = ThreadFactoryC2071wn.a("YMM-BD", new a());
        this.f13952a = c2046vnA;
        c2046vnA.start();
    }

    public static final F3 a() {
        return c.f13960a;
    }

    public synchronized void a(H3 h10) {
        synchronized (this) {
            CopyOnWriteArrayList<J3<? extends H3>> copyOnWriteArrayList = this.f13954c.get(h10.getClass());
            if (copyOnWriteArrayList != null) {
                Iterator<J3<? extends H3>> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    this.f13953b.add(new b(h10, it.next(), null));
                }
            }
        }
        this.f13956e.put(h10.getClass(), h10);
    }

    public synchronized void a(Object obj) {
        CopyOnWriteArrayList<d> copyOnWriteArrayListRemove = this.f13955d.remove(obj);
        if (copyOnWriteArrayListRemove != null) {
            for (d dVar : copyOnWriteArrayListRemove) {
                dVar.f13961a.remove(dVar.f13962b);
            }
        }
    }

    public synchronized void a(Object obj, Class cls, J3<? extends H3> j10) {
        CopyOnWriteArrayList<J3<? extends H3>> copyOnWriteArrayList = this.f13954c.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.f13954c.put(cls, copyOnWriteArrayList);
        }
        copyOnWriteArrayList.add(j10);
        CopyOnWriteArrayList<d> copyOnWriteArrayList2 = this.f13955d.get(obj);
        if (copyOnWriteArrayList2 == null) {
            copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
            this.f13955d.put(obj, copyOnWriteArrayList2);
        }
        a aVar = null;
        copyOnWriteArrayList2.add(new d(copyOnWriteArrayList, j10, aVar));
        H3 h10 = this.f13956e.get(cls);
        if (h10 != null) {
            this.f13953b.add(new b(h10, j10, aVar));
        }
    }
}
