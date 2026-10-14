package fc;

import java.util.concurrent.Callable;
import lb.l;
import yb.m;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f29533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f29534b;

    /* JADX INFO: renamed from: fc.a$a, reason: collision with other inner class name */
    public static final class C0259a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f29535a = new yb.b();
    }

    public static final class b implements Callable<l> {
        @Override // java.util.concurrent.Callable
        public l call() throws Exception {
            return C0259a.f29535a;
        }
    }

    public static final class c implements Callable<l> {
        @Override // java.util.concurrent.Callable
        public l call() throws Exception {
            return d.f29536a;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f29536a = new yb.d();
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f29537a = new yb.e();
    }

    public static final class f implements Callable<l> {
        @Override // java.util.concurrent.Callable
        public l call() throws Exception {
            return e.f29537a;
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f29538a = new yb.l();
    }

    public static final class h implements Callable<l> {
        @Override // java.util.concurrent.Callable
        public l call() throws Exception {
            return g.f29538a;
        }
    }

    static {
        dc.a.a(new h());
        f29533a = dc.a.a(new b());
        f29534b = dc.a.a(new c());
        m mVar = m.f44870c;
        dc.a.a(new f());
    }
}
