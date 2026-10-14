package u8;

import fd.j0;
import java.util.ConcurrentModificationException;

/* JADX INFO: loaded from: classes2.dex */
public final class x<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uc.a<T> f36164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T f36165b;

    /* JADX WARN: Multi-variable type inference failed */
    public x(uc.a<? extends T> aVar) {
        j0.i(aVar, "initializer");
        this.f36164a = aVar;
    }

    public final T a() {
        if (this.f36165b == null) {
            this.f36165b = this.f36164a.invoke();
        }
        T t10 = this.f36165b;
        if (t10 != null) {
            return t10;
        }
        throw new ConcurrentModificationException("Set to null by another thread");
    }
}
