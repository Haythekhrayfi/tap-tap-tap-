package com.yandex.mobile.ads.impl;

import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public final class r80<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ki f24615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final my f24616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b<T> f24617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CopyOnWriteArraySet<c<T>> f24618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayDeque<Runnable> f24619e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayDeque<Runnable> f24620f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f24621g;

    public interface a<T> {
        void invoke(T t10);
    }

    public interface b<T> {
        void a(T t10, qv qvVar);
    }

    public static final class c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f24622a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private qv.a f24623b = new qv.a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f24624c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f24625d;

        public c(T t10) {
            this.f24622a = t10;
        }

        public final void a(int i10, a<T> aVar) {
            if (this.f24625d) {
                return;
            }
            if (i10 != -1) {
                this.f24623b.a(i10);
            }
            this.f24624c = true;
            aVar.invoke(this.f24622a);
        }

        public final void a(b<T> bVar) {
            if (this.f24625d || !this.f24624c) {
                return;
            }
            qv qvVarA = this.f24623b.a();
            this.f24623b = new qv.a();
            this.f24624c = false;
            bVar.a(this.f24622a, qvVarA);
        }

        public final void b(b<T> bVar) {
            this.f24625d = true;
            if (this.f24624c) {
                bVar.a(this.f24622a, this.f24623b.a());
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f24622a.equals(((c) obj).f24622a);
        }

        public final int hashCode() {
            return this.f24622a.hashCode();
        }
    }

    public r80(Looper looper, ki kiVar, b<T> bVar) {
        this(new CopyOnWriteArraySet(), looper, kiVar, bVar);
    }

    private r80(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, ki kiVar, b<T> bVar) {
        this.f24615a = kiVar;
        this.f24618d = copyOnWriteArraySet;
        this.f24617c = bVar;
        this.f24619e = new ArrayDeque<>();
        this.f24620f = new ArrayDeque<>();
        this.f24616b = kiVar.a(looper, new com.applovin.exoplayer2.l.b0(this));
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
        Iterator<c<T>> it = this.f24618d.iterator();
        while (it.hasNext()) {
            it.next().a(this.f24617c);
            if (this.f24616b.b()) {
                return true;
            }
        }
        return true;
    }

    public final r80<T> a(Looper looper, b<T> bVar) {
        return new r80<>(this.f24618d, looper, this.f24615a, bVar);
    }

    public final void a() {
        if (this.f24620f.isEmpty()) {
            return;
        }
        if (!this.f24616b.b()) {
            my myVar = this.f24616b;
            myVar.a(myVar.b(0));
        }
        boolean z10 = !this.f24619e.isEmpty();
        this.f24619e.addAll(this.f24620f);
        this.f24620f.clear();
        if (z10) {
            return;
        }
        while (!this.f24619e.isEmpty()) {
            this.f24619e.peekFirst().run();
            this.f24619e.removeFirst();
        }
    }

    public final void a(int i10, a<T> aVar) {
        this.f24620f.add(new com.applovin.exoplayer2.d.z(new CopyOnWriteArraySet(this.f24618d), i10, aVar));
    }

    public final void a(T t10) {
        if (this.f24621g) {
            return;
        }
        Objects.requireNonNull(t10);
        this.f24618d.add(new c<>(t10));
    }

    public final void b() {
        Iterator<c<T>> it = this.f24618d.iterator();
        while (it.hasNext()) {
            it.next().b(this.f24617c);
        }
        this.f24618d.clear();
        this.f24621g = true;
    }

    public final void b(T t10) {
        for (c<T> cVar : this.f24618d) {
            if (cVar.f24622a.equals(t10)) {
                cVar.b(this.f24617c);
                this.f24618d.remove(cVar);
            }
        }
    }
}
