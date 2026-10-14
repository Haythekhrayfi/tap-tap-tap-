package vb;

import java.util.Iterator;
import java.util.Objects;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class m<T> extends lb.i<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Iterable<? extends T> f36915c;

    public static final class a<T> extends tb.c<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final lb.k<? super T> f36916c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Iterator<? extends T> f36917d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile boolean f36918e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f36919f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f36920g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f36921h;

        public a(lb.k<? super T> kVar, Iterator<? extends T> it) {
            this.f36916c = kVar;
            this.f36917d = it;
        }

        @Override // sb.i
        public void clear() {
            this.f36920g = true;
        }

        @Override // nb.b
        public void dispose() {
            this.f36918e = true;
        }

        @Override // sb.i
        public boolean isEmpty() {
            return this.f36920g;
        }

        @Override // sb.i
        public T poll() {
            if (this.f36920g) {
                return null;
            }
            if (!this.f36921h) {
                this.f36921h = true;
            } else if (!this.f36917d.hasNext()) {
                this.f36920g = true;
                return null;
            }
            T next = this.f36917d.next();
            Objects.requireNonNull(next, "The iterator returned a null value");
            return next;
        }

        @Override // sb.e
        public int requestFusion(int i10) {
            if ((i10 & 1) == 0) {
                return 0;
            }
            this.f36919f = true;
            return 1;
        }
    }

    public m(Iterable<? extends T> iterable) {
        this.f36915c = iterable;
    }

    @Override // lb.i
    public void t(lb.k<? super T> kVar) {
        try {
            Iterator<? extends T> it = this.f36915c.iterator();
            if (!it.hasNext()) {
                qb.c.complete(kVar);
                return;
            }
            a aVar = new a(kVar, it);
            kVar.b(aVar);
            if (aVar.f36919f) {
                return;
            }
            while (!aVar.f36918e) {
                try {
                    T next = aVar.f36917d.next();
                    Objects.requireNonNull(next, "The iterator returned a null value");
                    aVar.f36916c.d(next);
                    if (aVar.f36918e) {
                        return;
                    }
                    if (!aVar.f36917d.hasNext()) {
                        if (aVar.f36918e) {
                            return;
                        }
                        aVar.f36916c.onComplete();
                        return;
                    }
                } catch (Throwable th) {
                    c0.Q(th);
                    aVar.f36916c.a(th);
                    return;
                }
            }
        } catch (Throwable th2) {
            c0.Q(th2);
            qb.c.error(th2, kVar);
        }
    }
}
