package kc;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b<T> implements Iterator<T>, wc.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i0 f31987c = i0.NotReady;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public T f31988d;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31989a;

        static {
            int[] iArr = new int[i0.values().length];
            try {
                iArr[i0.Done.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i0.Ready.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f31989a = iArr;
        }
    }

    public abstract void a();

    @Override // java.util.Iterator
    public boolean hasNext() {
        i0 i0Var = this.f31987c;
        i0 i0Var2 = i0.Failed;
        if (!(i0Var != i0Var2)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i10 = a.f31989a[i0Var.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            return true;
        }
        this.f31987c = i0Var2;
        a();
        return this.f31987c == i0.Ready;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f31987c = i0.NotReady;
        return this.f31988d;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
