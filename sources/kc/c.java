package kc;

import fd.j0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX WARN: Unexpected interfaces in signature: [wc.a] */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c<E> extends kc.a<E> implements List<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f31992c = new a(null);

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }

        public final void a(int i10, int i11) {
            if (i10 < 0 || i10 >= i11) {
                throw new IndexOutOfBoundsException(n1.c.a("index: ", i10, ", size: ", i11));
            }
        }

        public final void b(int i10, int i11) {
            if (i10 < 0 || i10 > i11) {
                throw new IndexOutOfBoundsException(n1.c.a("index: ", i10, ", size: ", i11));
            }
        }
    }

    public class b implements Iterator<E>, wc.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f31993c;

        public b() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f31993c < c.this.d();
        }

        @Override // java.util.Iterator
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            c<E> cVar = c.this;
            int i10 = this.f31993c;
            this.f31993c = i10 + 1;
            return cVar.get(i10);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Unexpected interfaces in signature: [wc.a] */
    /* JADX INFO: renamed from: kc.c$c, reason: collision with other inner class name */
    public class C0331c extends c<E>.b implements ListIterator<E> {
        public C0331c(int i10) {
            super();
            c.f31992c.b(i10, c.this.d());
            this.f31993c = i10;
        }

        @Override // java.util.ListIterator
        public void add(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f31993c > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f31993c;
        }

        @Override // java.util.ListIterator
        public E previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            c<E> cVar = c.this;
            int i10 = this.f31993c - 1;
            this.f31993c = i10;
            return cVar.get(i10);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f31993c - 1;
        }

        @Override // java.util.ListIterator
        public void set(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final class d<E> extends c<E> implements RandomAccess {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final c<E> f31996d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f31997e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f31998f;

        /* JADX WARN: Multi-variable type inference failed */
        public d(c<? extends E> cVar, int i10, int i11) {
            j0.i(cVar, "list");
            this.f31996d = cVar;
            this.f31997e = i10;
            int iD = cVar.d();
            if (i10 < 0 || i11 > iD) {
                StringBuilder sbA = androidx.recyclerview.widget.o.a("fromIndex: ", i10, ", toIndex: ", i11, ", size: ");
                sbA.append(iD);
                throw new IndexOutOfBoundsException(sbA.toString());
            }
            if (i10 > i11) {
                throw new IllegalArgumentException(n1.c.a("fromIndex: ", i10, " > toIndex: ", i11));
            }
            this.f31998f = i11 - i10;
        }

        @Override // kc.a
        public int d() {
            return this.f31998f;
        }

        @Override // kc.c, java.util.List
        public E get(int i10) {
            int i11 = this.f31998f;
            if (i10 < 0 || i10 >= i11) {
                throw new IndexOutOfBoundsException(n1.c.a("index: ", i10, ", size: ", i11));
            }
            return this.f31996d.get(this.f31997e + i10);
        }
    }

    @Override // java.util.List
    public void add(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        Objects.requireNonNull(f31992c);
        j0.i(this, "c");
        j0.i(collection, "other");
        if (size() == collection.size()) {
            Iterator<E> it = collection.iterator();
            Iterator<E> it2 = iterator();
            while (it2.hasNext()) {
                if (!j0.d(it2.next(), it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public abstract E get(int i10);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        Objects.requireNonNull(f31992c);
        j0.i(this, "c");
        Iterator<E> it = iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            E next = it.next();
            iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.List
    public int indexOf(E e10) {
        Iterator<E> it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (j0.d(it.next(), e10)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new b();
    }

    @Override // java.util.List
    public int lastIndexOf(E e10) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (j0.d(listIterator.previous(), e10)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return new C0331c(0);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i10) {
        return new C0331c(i10);
    }

    @Override // java.util.List
    public E remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public E set(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<E> subList(int i10, int i11) {
        return new d(this, i10, i11);
    }
}
