package j9;

import fd.j0;
import vc.g;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0326a f31787b = new C0326a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f31788a;

    /* JADX INFO: renamed from: j9.a$a, reason: collision with other inner class name */
    public static final class C0326a {
        public C0326a() {
        }

        public C0326a(g gVar) {
        }

        public final <T> a<T> a(boolean z10) {
            return z10 ? c.f31790c : b.f31789c;
        }
    }

    public static final class b extends a<Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f31789c = new b();

        public b() {
            super(false, null);
        }
    }

    public static final class c extends a<Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f31790c = new c();

        public c() {
            super(true, null);
        }
    }

    public static final class d<T> extends a<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f31791c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z10, String str) {
            super(z10, null);
            j0.i(str, "reference");
            this.f31791c = str;
        }
    }

    public static final class e<T> extends a<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final T f31792c;

        public e(boolean z10, T t10) {
            super(z10, null);
            this.f31792c = t10;
        }
    }

    public a(boolean z10, g gVar) {
        this.f31788a = z10;
    }
}
