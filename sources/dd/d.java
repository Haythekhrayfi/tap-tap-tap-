package dd;

import fd.j0;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class d<T> implements g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g<T> f28929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f28930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uc.l<T, Boolean> f28931c;

    public static final class a implements Iterator<T>, wc.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Iterator<T> f28932c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f28933d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public T f28934e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ d<T> f28935f;

        public a(d<T> dVar) {
            this.f28935f = dVar;
            this.f28932c = dVar.f28929a.iterator();
        }

        public final void a() {
            int i10;
            while (this.f28932c.hasNext()) {
                T next = this.f28932c.next();
                if (this.f28935f.f28931c.invoke(next).booleanValue() == this.f28935f.f28930b) {
                    this.f28934e = next;
                    i10 = 1;
                    this.f28933d = i10;
                }
            }
            i10 = 0;
            this.f28933d = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f28933d == -1) {
                a();
            }
            return this.f28933d == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f28933d == -1) {
                a();
            }
            if (this.f28933d == 0) {
                throw new NoSuchElementException();
            }
            T t10 = this.f28934e;
            this.f28934e = null;
            this.f28933d = -1;
            return t10;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(g<? extends T> gVar, boolean z10, uc.l<? super T, Boolean> lVar) {
        j0.i(gVar, "sequence");
        j0.i(lVar, "predicate");
        this.f28929a = gVar;
        this.f28930b = z10;
        this.f28931c = lVar;
    }

    public /* synthetic */ d(g gVar, boolean z10, uc.l lVar, int i10, vc.g gVar2) {
        this(gVar, (i10 & 2) != 0 ? true : z10, lVar);
    }

    @Override // dd.g
    public Iterator<T> iterator() {
        return new a(this);
    }
}
