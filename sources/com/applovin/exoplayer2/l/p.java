package com.applovin.exoplayer2.l;

import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class p<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f7638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f7639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b<T> f7640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CopyOnWriteArraySet<c<T>> f7641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayDeque<Runnable> f7642e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayDeque<Runnable> f7643f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f7644g;

    public interface a<T> {
        void invoke(T t10);
    }

    public interface b<T> {
        void invoke(T t10, m mVar);
    }

    public static final class c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f7645a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private m.a f7646b = new m.a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f7647c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f7648d;

        public c(T t10) {
            this.f7645a = t10;
        }

        public void a(int i10, a<T> aVar) {
            if (this.f7648d) {
                return;
            }
            if (i10 != -1) {
                this.f7646b.a(i10);
            }
            this.f7647c = true;
            aVar.invoke(this.f7645a);
        }

        public void a(b<T> bVar) {
            this.f7648d = true;
            if (this.f7647c) {
                bVar.invoke(this.f7645a, this.f7646b.a());
            }
        }

        public void b(b<T> bVar) {
            if (this.f7648d || !this.f7647c) {
                return;
            }
            m mVarA = this.f7646b.a();
            this.f7646b = new m.a();
            this.f7647c = false;
            bVar.invoke(this.f7645a, mVarA);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f7645a.equals(((c) obj).f7645a);
        }

        public int hashCode() {
            return this.f7645a.hashCode();
        }
    }

    public p(Looper looper, d dVar, b<T> bVar) {
        this(new CopyOnWriteArraySet(), looper, dVar, bVar);
    }

    private p(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, d dVar, b<T> bVar) {
        this.f7638a = dVar;
        this.f7641d = copyOnWriteArraySet;
        this.f7640c = bVar;
        this.f7642e = new ArrayDeque<>();
        this.f7643f = new ArrayDeque<>();
        this.f7639b = dVar.a(looper, new b0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(CopyOnWriteArraySet copyOnWriteArraySet, int i10, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(i10, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Message message) {
        Iterator<c<T>> it = this.f7641d.iterator();
        while (it.hasNext()) {
            it.next().b(this.f7640c);
            if (this.f7639b.a(0)) {
                return true;
            }
        }
        return true;
    }

    public p<T> a(Looper looper, b<T> bVar) {
        return new p<>(this.f7641d, looper, this.f7638a, bVar);
    }

    public void a() {
        if (this.f7643f.isEmpty()) {
            return;
        }
        if (!this.f7639b.a(0)) {
            o oVar = this.f7639b;
            oVar.a(oVar.b(0));
        }
        boolean z10 = !this.f7642e.isEmpty();
        this.f7642e.addAll(this.f7643f);
        this.f7643f.clear();
        if (z10) {
            return;
        }
        while (!this.f7642e.isEmpty()) {
            this.f7642e.peekFirst().run();
            this.f7642e.removeFirst();
        }
    }

    public void a(int i10, a<T> aVar) {
        this.f7643f.add(new com.applovin.exoplayer2.d.z(new CopyOnWriteArraySet(this.f7641d), i10, aVar));
    }

    public void a(T t10) {
        if (this.f7644g) {
            return;
        }
        com.applovin.exoplayer2.l.a.b(t10);
        this.f7641d.add(new c<>(t10));
    }

    public void b() {
        Iterator<c<T>> it = this.f7641d.iterator();
        while (it.hasNext()) {
            it.next().a(this.f7640c);
        }
        this.f7641d.clear();
        this.f7644g = true;
    }

    public void b(int i10, a<T> aVar) {
        a(i10, aVar);
        a();
    }

    public void b(T t10) {
        for (c<T> cVar : this.f7641d) {
            if (cVar.f7645a.equals(t10)) {
                cVar.a(this.f7640c);
                this.f7641d.remove(cVar);
            }
        }
    }
}
