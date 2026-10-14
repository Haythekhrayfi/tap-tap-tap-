package h9;

import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public interface k<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f30992a = 0;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f30993a = new a();

        /* JADX INFO: renamed from: h9.k$a$a, reason: collision with other inner class name */
        public static final class C0302a implements k<T> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final T f30994b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ T f30995c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ uc.l<Object, Boolean> f30996d;

            public C0302a(T t10, uc.l<Object, Boolean> lVar) {
                this.f30995c = t10;
                this.f30996d = lVar;
                this.f30994b = t10;
            }

            @Override // h9.k
            public T a() {
                return this.f30994b;
            }

            @Override // h9.k
            public boolean b(Object obj) {
                j0.i(obj, "value");
                return this.f30996d.invoke(obj).booleanValue();
            }
        }

        public final <T> k<T> a(T t10, uc.l<Object, Boolean> lVar) {
            j0.i(t10, "default");
            j0.i(lVar, "validator");
            return new C0302a(t10, lVar);
        }
    }

    T a();

    boolean b(Object obj);
}
