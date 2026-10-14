package ub;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.Objects;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class h<T> extends lb.c<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Iterable<? extends T> f36283d;

    public static abstract class a<T> extends ac.b<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Iterator<? extends T> f36284c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile boolean f36285d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f36286e;

        public a(Iterator<? extends T> it) {
            this.f36284c = it;
        }

        public abstract void a();

        public abstract void b(long j10);

        @Override // me.c
        public final void cancel() {
            this.f36285d = true;
        }

        @Override // sb.i
        public final void clear() {
            this.f36284c = null;
        }

        @Override // sb.i
        public final boolean isEmpty() {
            Iterator<? extends T> it = this.f36284c;
            return it == null || !it.hasNext();
        }

        @Override // sb.i
        public final T poll() {
            Iterator<? extends T> it = this.f36284c;
            if (it == null) {
                return null;
            }
            if (!this.f36286e) {
                this.f36286e = true;
            } else if (!it.hasNext()) {
                return null;
            }
            T next = this.f36284c.next();
            Objects.requireNonNull(next, "Iterator.next() returned a null value");
            return next;
        }

        @Override // me.c
        public final void request(long j10) {
            if (ac.g.validate(j10) && h9.d.a(this, j10) == 0) {
                if (j10 == RecyclerView.FOREVER_NS) {
                    a();
                } else {
                    b(j10);
                }
            }
        }

        @Override // sb.e
        public final int requestFusion(int i10) {
            return i10 & 1;
        }
    }

    public static final class b<T> extends a<T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final sb.a<? super T> f36287f;

        public b(sb.a<? super T> aVar, Iterator<? extends T> it) {
            super(it);
            this.f36287f = aVar;
        }

        @Override // ub.h.a
        public void a() {
            Iterator<? extends T> it = this.f36284c;
            sb.a<? super T> aVar = this.f36287f;
            while (!this.f36285d) {
                try {
                    T next = it.next();
                    if (this.f36285d) {
                        return;
                    }
                    if (next == null) {
                        th = new NullPointerException("Iterator.next() returned a null value");
                    } else {
                        aVar.e(next);
                        if (this.f36285d) {
                            return;
                        }
                        if (!it.hasNext()) {
                            if (this.f36285d) {
                                return;
                            }
                            aVar.onComplete();
                            return;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    c0.Q(th);
                }
                aVar.a(th);
                return;
            }
        }

        @Override // ub.h.a
        public void b(long j10) {
            Iterator<? extends T> it = this.f36284c;
            sb.a<? super T> aVar = this.f36287f;
            do {
                long j11 = 0;
                while (true) {
                    if (j11 != j10) {
                        if (this.f36285d) {
                            return;
                        }
                        try {
                            T next = it.next();
                            if (this.f36285d) {
                                return;
                            }
                            if (next == null) {
                                th = new NullPointerException("Iterator.next() returned a null value");
                            } else {
                                boolean zE = aVar.e(next);
                                if (this.f36285d) {
                                    return;
                                }
                                if (!it.hasNext()) {
                                    if (this.f36285d) {
                                        return;
                                    }
                                    aVar.onComplete();
                                    return;
                                } else if (zE) {
                                    j11++;
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            c0.Q(th);
                        }
                        aVar.a(th);
                        return;
                    }
                    j10 = get();
                    if (j11 == j10) {
                        break;
                    }
                }
                j10 = addAndGet(-j11);
            } while (j10 != 0);
        }
    }

    public static final class c<T> extends a<T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final me.b<? super T> f36288f;

        public c(me.b<? super T> bVar, Iterator<? extends T> it) {
            super(it);
            this.f36288f = bVar;
        }

        @Override // ub.h.a
        public void a() {
            Iterator<? extends T> it = this.f36284c;
            me.b<? super T> bVar = this.f36288f;
            while (!this.f36285d) {
                try {
                    T next = it.next();
                    if (this.f36285d) {
                        return;
                    }
                    if (next == null) {
                        th = new NullPointerException("Iterator.next() returned a null value");
                    } else {
                        bVar.d(next);
                        if (this.f36285d) {
                            return;
                        }
                        if (!it.hasNext()) {
                            if (this.f36285d) {
                                return;
                            }
                            bVar.onComplete();
                            return;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    c0.Q(th);
                }
                bVar.a(th);
                return;
            }
        }

        @Override // ub.h.a
        public void b(long j10) {
            Iterator<? extends T> it = this.f36284c;
            me.b<? super T> bVar = this.f36288f;
            do {
                long j11 = 0;
                while (true) {
                    if (j11 != j10) {
                        if (this.f36285d) {
                            return;
                        }
                        try {
                            T next = it.next();
                            if (this.f36285d) {
                                return;
                            }
                            if (next == null) {
                                th = new NullPointerException("Iterator.next() returned a null value");
                            } else {
                                bVar.d(next);
                                if (this.f36285d) {
                                    return;
                                }
                                if (!it.hasNext()) {
                                    if (this.f36285d) {
                                        return;
                                    }
                                    bVar.onComplete();
                                    return;
                                }
                                j11++;
                            }
                        } catch (Throwable th) {
                            th = th;
                            c0.Q(th);
                        }
                        bVar.a(th);
                        return;
                    }
                    j10 = get();
                    if (j11 == j10) {
                        break;
                    }
                }
                j10 = addAndGet(-j11);
            } while (j10 != 0);
        }
    }

    public h(Iterable<? extends T> iterable) {
        this.f36283d = iterable;
    }

    public static <T> void j(me.b<? super T> bVar, Iterator<? extends T> it) {
        try {
            if (it.hasNext()) {
                bVar.c(bVar instanceof sb.a ? new b((sb.a) bVar, it) : new c(bVar, it));
            } else {
                ac.d.complete(bVar);
            }
        } catch (Throwable th) {
            c0.Q(th);
            ac.d.error(th, bVar);
        }
    }

    @Override // lb.c
    public void h(me.b<? super T> bVar) {
        try {
            j(bVar, this.f36283d.iterator());
        } catch (Throwable th) {
            c0.Q(th);
            ac.d.error(th, bVar);
        }
    }
}
