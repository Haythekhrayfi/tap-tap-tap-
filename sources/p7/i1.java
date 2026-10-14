package p7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public class i1<E> implements Iterable<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<E> f34517c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f34518d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f34519e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f34520f;

    public class b implements Iterator {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f34521c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f34522d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f34523e;

        public b(a aVar) {
            i1.this.f34518d++;
            this.f34521c = i1.this.f34517c.size();
        }

        public final void a() {
            if (this.f34523e) {
                return;
            }
            this.f34523e = true;
            i1 i1Var = i1.this;
            int i10 = i1Var.f34518d - 1;
            i1Var.f34518d = i10;
            if (i10 > 0 || !i1Var.f34520f) {
                return;
            }
            i1Var.f34520f = false;
            int size = i1Var.f34517c.size();
            while (true) {
                size--;
                if (size < 0) {
                    return;
                }
                if (i1Var.f34517c.get(size) == null) {
                    i1Var.f34517c.remove(size);
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f34522d;
            while (i10 < this.f34521c && i1.a(i1.this, i10) == null) {
                i10++;
            }
            if (i10 < this.f34521c) {
                return true;
            }
            a();
            return false;
        }

        @Override // java.util.Iterator
        public E next() {
            while (true) {
                int i10 = this.f34522d;
                if (i10 >= this.f34521c || i1.a(i1.this, i10) != null) {
                    break;
                }
                this.f34522d++;
            }
            int i11 = this.f34522d;
            if (i11 >= this.f34521c) {
                a();
                throw new NoSuchElementException();
            }
            i1 i1Var = i1.this;
            this.f34522d = i11 + 1;
            return (E) i1.a(i1Var, i11);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static Object a(i1 i1Var, int i10) {
        return i1Var.f34517c.get(i10);
    }

    public boolean b(E e10) {
        if (e10 == null || this.f34517c.contains(e10)) {
            return false;
        }
        this.f34517c.add(e10);
        this.f34519e++;
        return true;
    }

    public boolean c(E e10) {
        int iIndexOf;
        if (e10 == null || (iIndexOf = this.f34517c.indexOf(e10)) == -1) {
            return false;
        }
        if (this.f34518d == 0) {
            this.f34517c.remove(iIndexOf);
        } else {
            this.f34520f = true;
            this.f34517c.set(iIndexOf, null);
        }
        this.f34519e--;
        return true;
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        return new b(null);
    }
}
