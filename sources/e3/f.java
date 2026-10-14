package e3;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e.a<?> f29004b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, e.a<?>> f29005a = new HashMap();

    public class a implements e.a<Object> {
        @Override // e3.e.a
        public Class<Object> a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // e3.e.a
        public e<Object> b(Object obj) {
            return new b(obj);
        }
    }

    public static final class b implements e<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f29006a;

        public b(Object obj) {
            this.f29006a = obj;
        }

        @Override // e3.e
        public Object a() {
            return this.f29006a;
        }

        @Override // e3.e
        public void b() {
        }
    }
}
