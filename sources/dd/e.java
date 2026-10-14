package dd;

import fd.j0;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class e<T, R, E> implements g<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g<T> f28936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uc.l<T, R> f28937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uc.l<R, Iterator<E>> f28938c;

    public static final class a implements Iterator<E>, wc.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Iterator<T> f28939c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Iterator<? extends E> f28940d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e<T, R, E> f28941e;

        public a(e<T, R, E> eVar) {
            this.f28941e = eVar;
            this.f28939c = eVar.f28936a.iterator();
        }

        public final boolean a() {
            Iterator<? extends E> it = this.f28940d;
            if ((it == null || it.hasNext()) ? false : true) {
                this.f28940d = null;
            }
            while (this.f28940d == null) {
                if (!this.f28939c.hasNext()) {
                    return false;
                }
                T next = this.f28939c.next();
                e<T, R, E> eVar = this.f28941e;
                Iterator<? extends E> it2 = (Iterator) eVar.f28938c.invoke(eVar.f28937b.invoke(next));
                if (it2.hasNext()) {
                    this.f28940d = it2;
                    break;
                }
            }
            return true;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return a();
        }

        @Override // java.util.Iterator
        public E next() {
            if (!a()) {
                throw new NoSuchElementException();
            }
            Iterator<? extends E> it = this.f28940d;
            j0.f(it);
            return it.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(g<? extends T> gVar, uc.l<? super T, ? extends R> lVar, uc.l<? super R, ? extends Iterator<? extends E>> lVar2) {
        j0.i(gVar, "sequence");
        j0.i(lVar, "transformer");
        j0.i(lVar2, "iterator");
        this.f28936a = gVar;
        this.f28937b = lVar;
        this.f28938c = lVar2;
    }

    @Override // dd.g
    public Iterator<E> iterator() {
        return new a(this);
    }
}
