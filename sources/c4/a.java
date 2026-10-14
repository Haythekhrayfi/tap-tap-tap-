package c4;

import android.util.Log;
import o0.g;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e<Object> f3592a = new C0066a();

    /* JADX INFO: renamed from: c4.a$a, reason: collision with other inner class name */
    public class C0066a implements e<Object> {
        @Override // c4.a.e
        public void a(Object obj) {
        }
    }

    public interface b<T> {
        T a();
    }

    public static final class c<T> implements o0.e<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b<T> f3593a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e<T> f3594b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final o0.e<T> f3595c;

        public c(o0.e<T> eVar, b<T> bVar, e<T> eVar2) {
            this.f3595c = eVar;
            this.f3593a = bVar;
            this.f3594b = eVar2;
        }

        @Override // o0.e
        public boolean a(T t10) {
            if (t10 instanceof d) {
                ((c4.d.b) ((d) t10).f()).f3596a = true;
            }
            this.f3594b.a(t10);
            return this.f3595c.a(t10);
        }

        @Override // o0.e
        public T b() {
            T tB = this.f3595c.b();
            if (tB == null) {
                tB = this.f3593a.a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    StringBuilder sbA = defpackage.a.a("Created new ");
                    sbA.append(tB.getClass());
                    Log.v("FactoryPools", sbA.toString());
                }
            }
            if (tB instanceof d) {
                ((c4.d.b) ((d) tB).f()).f3596a = false;
            }
            return tB;
        }
    }

    public interface d {
        c4.d f();
    }

    public interface e<T> {
        void a(T t10);
    }

    public static <T extends d> o0.e<T> a(int i10, b<T> bVar) {
        return new c(new g(i10), bVar, f3592a);
    }
}
