package ue;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes3.dex */
@IgnoreJRERequirement
public final class e extends ue.c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ue.c.a f36390a = new e();

    @IgnoreJRERequirement
    public static final class a<R> implements ue.c<R, CompletableFuture<R>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Type f36391a;

        /* JADX INFO: renamed from: ue.e$a$a, reason: collision with other inner class name */
        @IgnoreJRERequirement
        public class C0433a implements d<R> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CompletableFuture<R> f36392a;

            public C0433a(a aVar, CompletableFuture<R> completableFuture) {
                this.f36392a = completableFuture;
            }

            @Override // ue.d
            public void a(ue.b<R> bVar, z<R> zVar) {
                if (zVar.b()) {
                    this.f36392a.complete(zVar.f36544b);
                } else {
                    this.f36392a.completeExceptionally(new h(zVar));
                }
            }

            @Override // ue.d
            public void b(ue.b<R> bVar, Throwable th) {
                this.f36392a.completeExceptionally(th);
            }
        }

        public a(Type type) {
            this.f36391a = type;
        }

        @Override // ue.c
        public Object a(ue.b bVar) {
            b bVar2 = new b(bVar);
            bVar.a(new C0433a(this, bVar2));
            return bVar2;
        }

        @Override // ue.c
        public Type b() {
            return this.f36391a;
        }
    }

    @IgnoreJRERequirement
    public static final class b<T> extends CompletableFuture<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ue.b<?> f36393c;

        public b(ue.b<?> bVar) {
            this.f36393c = bVar;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            if (z10) {
                this.f36393c.cancel();
            }
            return super.cancel(z10);
        }
    }

    @IgnoreJRERequirement
    public static final class c<R> implements ue.c<R, CompletableFuture<z<R>>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Type f36394a;

        @IgnoreJRERequirement
        public class a implements d<R> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CompletableFuture<z<R>> f36395a;

            public a(c cVar, CompletableFuture<z<R>> completableFuture) {
                this.f36395a = completableFuture;
            }

            @Override // ue.d
            public void a(ue.b<R> bVar, z<R> zVar) {
                this.f36395a.complete(zVar);
            }

            @Override // ue.d
            public void b(ue.b<R> bVar, Throwable th) {
                this.f36395a.completeExceptionally(th);
            }
        }

        public c(Type type) {
            this.f36394a = type;
        }

        @Override // ue.c
        public Object a(ue.b bVar) {
            b bVar2 = new b(bVar);
            bVar.a(new a(this, bVar2));
            return bVar2;
        }

        @Override // ue.c
        public Type b() {
            return this.f36394a;
        }
    }

    @Override // ue.c.a
    @Nullable
    public ue.c<?, ?> a(Type type, Annotation[] annotationArr, b0 b0Var) {
        if (f0.f(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type typeE = f0.e(0, (ParameterizedType) type);
        if (f0.f(typeE) != z.class) {
            return new a(typeE);
        }
        if (typeE instanceof ParameterizedType) {
            return new c(f0.e(0, (ParameterizedType) typeE));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
