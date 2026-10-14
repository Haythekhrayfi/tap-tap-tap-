package androidx.lifecycle;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class LiveData<T> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f2136k = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l.b<w<? super T>, LiveData<T>.c> f2138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f2141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Object f2142f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2143g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2144h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2145i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Runnable f2146j;

    public class LifecycleBoundObserver extends LiveData<T>.c implements n {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final p f2147g;

        public LifecycleBoundObserver(p pVar, w<? super T> wVar) {
            super(wVar);
            this.f2147g = pVar;
        }

        @Override // androidx.lifecycle.n
        public void g(p pVar, i.b bVar) {
            i.c cVarB = this.f2147g.getLifecycle().b();
            if (cVarB == i.c.DESTROYED) {
                LiveData.this.h(this.f2150c);
                return;
            }
            i.c cVar = null;
            while (cVar != cVarB) {
                h(this.f2147g.getLifecycle().b().isAtLeast(i.c.STARTED));
                cVar = cVarB;
                cVarB = this.f2147g.getLifecycle().b();
            }
        }

        @Override // androidx.lifecycle.LiveData.c
        public void i() {
            this.f2147g.getLifecycle().c(this);
        }

        @Override // androidx.lifecycle.LiveData.c
        public boolean j(p pVar) {
            return this.f2147g == pVar;
        }

        @Override // androidx.lifecycle.LiveData.c
        public boolean k() {
            return this.f2147g.getLifecycle().b().isAtLeast(i.c.STARTED);
        }
    }

    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f2137a) {
                obj = LiveData.this.f2142f;
                LiveData.this.f2142f = LiveData.f2136k;
            }
            LiveData.this.i(obj);
        }
    }

    public class b extends LiveData<T>.c {
        public b(LiveData liveData, w<? super T> wVar) {
            super(wVar);
        }

        @Override // androidx.lifecycle.LiveData.c
        public boolean k() {
            return true;
        }
    }

    public abstract class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final w<? super T> f2150c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f2151d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2152e = -1;

        public c(w<? super T> wVar) {
            this.f2150c = wVar;
        }

        public void h(boolean z10) {
            if (z10 == this.f2151d) {
                return;
            }
            this.f2151d = z10;
            LiveData liveData = LiveData.this;
            int i10 = z10 ? 1 : -1;
            int i11 = liveData.f2139c;
            liveData.f2139c = i10 + i11;
            if (!liveData.f2140d) {
                liveData.f2140d = true;
                while (true) {
                    try {
                        int i12 = liveData.f2139c;
                        if (i11 == i12) {
                            break;
                        }
                        boolean z11 = i11 == 0 && i12 > 0;
                        boolean z12 = i11 > 0 && i12 == 0;
                        if (z11) {
                            liveData.f();
                        } else if (z12) {
                            liveData.g();
                        }
                        i11 = i12;
                    } catch (Throwable th) {
                        liveData.f2140d = false;
                        throw th;
                    }
                }
                liveData.f2140d = false;
            }
            if (this.f2151d) {
                LiveData.this.c(this);
            }
        }

        public void i() {
        }

        public boolean j(p pVar) {
            return false;
        }

        public abstract boolean k();
    }

    public LiveData() {
        this.f2137a = new Object();
        this.f2138b = new l.b<>();
        this.f2139c = 0;
        Object obj = f2136k;
        this.f2142f = obj;
        this.f2146j = new a();
        this.f2141e = obj;
        this.f2143g = -1;
    }

    public LiveData(T t10) {
        this.f2137a = new Object();
        this.f2138b = new l.b<>();
        this.f2139c = 0;
        this.f2142f = f2136k;
        this.f2146j = new a();
        this.f2141e = t10;
        this.f2143g = 0;
    }

    public static void a(String str) {
        if (!k.a.d().b()) {
            throw new IllegalStateException(androidx.activity.j.a("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(LiveData<T>.c cVar) {
        if (cVar.f2151d) {
            if (!cVar.k()) {
                cVar.h(false);
                return;
            }
            int i10 = cVar.f2152e;
            int i11 = this.f2143g;
            if (i10 >= i11) {
                return;
            }
            cVar.f2152e = i11;
            cVar.f2150c.a((Object) this.f2141e);
        }
    }

    public void c(LiveData<T>.c cVar) {
        if (this.f2144h) {
            this.f2145i = true;
            return;
        }
        this.f2144h = true;
        do {
            this.f2145i = false;
            if (cVar != null) {
                b(cVar);
                cVar = null;
            } else {
                l.b<w<? super T>, LiveData<T>.c>.d dVarD = this.f2138b.d();
                while (dVarD.hasNext()) {
                    b((c) ((Map.Entry) dVarD.next()).getValue());
                    if (this.f2145i) {
                        break;
                    }
                }
            }
        } while (this.f2145i);
        this.f2144h = false;
    }

    public void d(p pVar, w<? super T> wVar) {
        a("observe");
        if (pVar.getLifecycle().b() == i.c.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(pVar, wVar);
        LiveData<T>.c cVarF = this.f2138b.f(wVar, lifecycleBoundObserver);
        if (cVarF != null && !cVarF.j(pVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (cVarF != null) {
            return;
        }
        pVar.getLifecycle().a(lifecycleBoundObserver);
    }

    public void e(w<? super T> wVar) {
        a("observeForever");
        b bVar = new b(this, wVar);
        LiveData<T>.c cVarF = this.f2138b.f(wVar, bVar);
        if (cVarF instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (cVarF != null) {
            return;
        }
        bVar.h(true);
    }

    public void f() {
    }

    public void g() {
    }

    public void h(w<? super T> wVar) {
        a("removeObserver");
        LiveData<T>.c cVarG = this.f2138b.g(wVar);
        if (cVarG == null) {
            return;
        }
        cVarG.i();
        cVarG.h(false);
    }

    public void i(T t10) {
        a("setValue");
        this.f2143g++;
        this.f2141e = t10;
        c(null);
    }
}
