package l3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f32169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f32170b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<Class<?>, C0337a<?>> f32171a = new HashMap();

        /* JADX INFO: renamed from: l3.p$a$a, reason: collision with other inner class name */
        public static class C0337a<Model> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List<n<Model, ?>> f32172a;

            public C0337a(List<n<Model, ?>> list) {
                this.f32172a = list;
            }
        }
    }

    public p(o0.e<List<Throwable>> eVar) {
        r rVar = new r(eVar);
        this.f32170b = new a();
        this.f32169a = rVar;
    }
}
