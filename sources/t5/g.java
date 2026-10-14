package t5;

import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, q5.e<?>> f35695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<Class<?>, q5.g<?>> f35696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q5.e<Object> f35697c;

    public static final class a implements r5.b<a> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final q5.e<Object> f35698d = s5.a.f35456c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<Class<?>, q5.e<?>> f35699a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<Class<?>, q5.g<?>> f35700b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public q5.e<Object> f35701c = f35698d;

        @Override // r5.b
        public r5.b a(Class cls, q5.e eVar) {
            this.f35699a.put(cls, eVar);
            this.f35700b.remove(cls);
            return this;
        }
    }

    public g(Map<Class<?>, q5.e<?>> map, Map<Class<?>, q5.g<?>> map2, q5.e<Object> eVar) {
        this.f35695a = map;
        this.f35696b = map2;
        this.f35697c = eVar;
    }

    public void a(Object obj, OutputStream outputStream) throws IOException {
        Map<Class<?>, q5.e<?>> map = this.f35695a;
        f fVar = new f(outputStream, map, this.f35696b, this.f35697c);
        if (obj == null) {
            return;
        }
        q5.e<?> eVar = map.get(obj.getClass());
        if (eVar != null) {
            eVar.encode(obj, fVar);
        } else {
            StringBuilder sbA = defpackage.a.a("No encoder for ");
            sbA.append(obj.getClass());
            throw new q5.c(sbA.toString());
        }
    }
}
