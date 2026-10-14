package t3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<a<?, ?>> f35674a = new ArrayList();

    public static final class a<Z, R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<Z> f35675a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<R> f35676b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e<Z, R> f35677c;

        public a(Class<Z> cls, Class<R> cls2, e<Z, R> eVar) {
            this.f35675a = cls;
            this.f35676b = cls2;
            this.f35677c = eVar;
        }

        public boolean a(Class<?> cls, Class<?> cls2) {
            return this.f35675a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f35676b);
        }
    }

    public synchronized <Z, R> List<Class<R>> a(Class<Z> cls, Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator<a<?, ?>> it = this.f35674a.iterator();
        while (it.hasNext()) {
            if (it.next().a(cls, cls2)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }
}
