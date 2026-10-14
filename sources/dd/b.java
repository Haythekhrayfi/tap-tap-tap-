package dd;

import ch.qos.logback.core.CoreConstants;
import fd.j0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class b<T> implements g<T>, c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g<T> f28925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28926b;

    public static final class a implements Iterator<T>, wc.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Iterator<T> f28927c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f28928d;

        public a(b<T> bVar) {
            this.f28927c = bVar.f28925a.iterator();
            this.f28928d = bVar.f28926b;
        }

        public final void a() {
            while (this.f28928d > 0 && this.f28927c.hasNext()) {
                this.f28927c.next();
                this.f28928d--;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.f28927c.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            return this.f28927c.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(g<? extends T> gVar, int i10) {
        j0.i(gVar, "sequence");
        this.f28925a = gVar;
        this.f28926b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + CoreConstants.DOT).toString());
    }

    @Override // dd.c
    public g<T> a(int i10) {
        int i11 = this.f28926b + i10;
        return i11 < 0 ? new b(this, i10) : new b(this.f28925a, i11);
    }

    @Override // dd.g
    public Iterator<T> iterator() {
        return new a(this);
    }
}
