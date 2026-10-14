package kc;

import fd.j0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class a0<T> implements Iterable<z<? extends T>>, wc.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uc.a<Iterator<T>> f31986c;

    /* JADX WARN: Multi-variable type inference failed */
    public a0(uc.a<? extends Iterator<? extends T>> aVar) {
        j0.i(aVar, "iteratorFactory");
        this.f31986c = aVar;
    }

    @Override // java.lang.Iterable
    public Iterator<z<T>> iterator() {
        return new b0(this.f31986c.invoke());
    }
}
