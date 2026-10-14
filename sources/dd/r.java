package dd;

import fd.j0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class r<T, R> implements g<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g<T> f28954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uc.l<T, R> f28955b;

    public static final class a implements Iterator<R>, wc.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Iterator<T> f28956c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ r<T, R> f28957d;

        public a(r<T, R> rVar) {
            this.f28957d = rVar;
            this.f28956c = rVar.f28954a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f28956c.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            return (R) this.f28957d.f28955b.invoke(this.f28956c.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r(g<? extends T> gVar, uc.l<? super T, ? extends R> lVar) {
        j0.i(gVar, "sequence");
        j0.i(lVar, "transformer");
        this.f28954a = gVar;
        this.f28955b = lVar;
    }

    @Override // dd.g
    public Iterator<R> iterator() {
        return new a(this);
    }
}
