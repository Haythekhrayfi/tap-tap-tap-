package dd;

import fd.j0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class f<T1, T2, V> implements g<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g<T1> f28942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g<T2> f28943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uc.p<T1, T2, V> f28944c;

    public static final class a implements Iterator<V>, wc.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Iterator<T1> f28945c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Iterator<T2> f28946d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ f<T1, T2, V> f28947e;

        public a(f<T1, T2, V> fVar) {
            this.f28947e = fVar;
            this.f28945c = fVar.f28942a.iterator();
            this.f28946d = fVar.f28943b.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f28945c.hasNext() && this.f28946d.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            return (V) this.f28947e.f28944c.invoke(this.f28945c.next(), this.f28946d.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(g<? extends T1> gVar, g<? extends T2> gVar2, uc.p<? super T1, ? super T2, ? extends V> pVar) {
        j0.i(gVar, "sequence1");
        j0.i(gVar2, "sequence2");
        j0.i(pVar, "transform");
        this.f28942a = gVar;
        this.f28943b = gVar2;
        this.f28944c = pVar;
    }

    @Override // dd.g
    public Iterator<V> iterator() {
        return new a(this);
    }
}
