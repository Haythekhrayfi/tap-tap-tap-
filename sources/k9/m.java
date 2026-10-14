package k9;

import fd.j0;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class m<T> implements yc.b<Object, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference<T> f31956a;

    /* JADX WARN: Illegal instructions before constructor call */
    public m() {
        vc.g gVar = null;
        this(gVar, 1, gVar);
    }

    public m(T t10) {
        this.f31956a = t10 == null ? null : new WeakReference<>(t10);
    }

    public /* synthetic */ m(Object obj, int i10, vc.g gVar) {
        this((i10 & 1) != 0 ? null : obj);
    }

    @Override // yc.b
    public T getValue(Object obj, cd.i<?> iVar) {
        j0.i(iVar, "property");
        WeakReference<T> weakReference = this.f31956a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // yc.b
    public void setValue(Object obj, cd.i<?> iVar, T t10) {
        j0.i(iVar, "property");
        this.f31956a = t10 == null ? null : new WeakReference<>(t10);
    }
}
