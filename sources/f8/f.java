package f8;

import fd.j0;
import java.util.Iterator;
import q.i;

/* JADX INFO: loaded from: classes2.dex */
public final class f<T> implements Iterable<T>, wc.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i<T> f29420c;

    public f(i<T> iVar) {
        j0.i(iVar, "array");
        this.f29420c = iVar;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new g(this.f29420c);
    }
}
