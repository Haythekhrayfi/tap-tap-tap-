package w3;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<a<?>> f37103a = new ArrayList();

    public static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<T> f37104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d3.f<T> f37105b;

        public a(Class<T> cls, d3.f<T> fVar) {
            this.f37104a = cls;
            this.f37105b = fVar;
        }
    }

    public synchronized <Z> d3.f<Z> a(Class<Z> cls) {
        int size = this.f37103a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a<?> aVar = this.f37103a.get(i10);
            if (aVar.f37104a.isAssignableFrom(cls)) {
                return (d3.f<Z>) aVar.f37105b;
            }
        }
        return null;
    }
}
