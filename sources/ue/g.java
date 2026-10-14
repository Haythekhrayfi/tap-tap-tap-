package ue;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import okhttp3.Request;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Executor f36404a;

    public class a implements c<Object, ue.b<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Type f36405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Executor f36406b;

        public a(g gVar, Type type, Executor executor) {
            this.f36405a = type;
            this.f36406b = executor;
        }

        @Override // ue.c
        public ue.b<?> a(ue.b<Object> bVar) {
            Executor executor = this.f36406b;
            return executor == null ? bVar : new b(executor, bVar);
        }

        @Override // ue.c
        public Type b() {
            return this.f36405a;
        }
    }

    public static final class b<T> implements ue.b<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Executor f36407c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ue.b<T> f36408d;

        public class a implements d<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f36409a;

            public a(d dVar) {
                this.f36409a = dVar;
            }

            @Override // ue.d
            public void a(ue.b<T> bVar, z<T> zVar) {
                b.this.f36407c.execute(new androidx.emoji2.text.f(this, this.f36409a, zVar));
            }

            @Override // ue.d
            public void b(ue.b<T> bVar, Throwable th) {
                b.this.f36407c.execute(new androidx.emoji2.text.f(this, this.f36409a, th));
            }
        }

        public b(Executor executor, ue.b<T> bVar) {
            this.f36407c = executor;
            this.f36408d = bVar;
        }

        @Override // ue.b
        public void a(d<T> dVar) {
            this.f36408d.a(new a(dVar));
        }

        @Override // ue.b
        public void cancel() {
            this.f36408d.cancel();
        }

        public Object clone() throws CloneNotSupportedException {
            return new b(this.f36407c, this.f36408d.mo144clone());
        }

        @Override // ue.b
        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public ue.b<T> mo144clone() {
            return new b(this.f36407c, this.f36408d.mo144clone());
        }

        @Override // ue.b
        public boolean isCanceled() {
            return this.f36408d.isCanceled();
        }

        @Override // ue.b
        public Request request() {
            return this.f36408d.request();
        }
    }

    public g(@Nullable Executor executor) {
        this.f36404a = executor;
    }

    @Override // ue.c.a
    @Nullable
    public c<?, ?> a(Type type, Annotation[] annotationArr, b0 b0Var) {
        if (f0.f(type) != ue.b.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new a(this, f0.e(0, (ParameterizedType) type), f0.i(annotationArr, d0.class) ? null : this.f36404a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
