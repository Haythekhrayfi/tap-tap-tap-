package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public class X extends Q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F9 f15435a;

    public class a extends SparseArray<Q1.a> {
        public a() {
            put(47, new c(X.this.f15435a));
            put(66, new d(X.this, X.this.f15435a));
            put(89, new b(X.this.f15435a));
            put(99, new e(X.this.f15435a));
            put(105, new f(X.this.f15435a));
        }
    }

    public static class b implements Q1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final F9 f15437a;

        public b(F9 f10) {
            this.f15437a = f10;
        }

        private C1646g1 a(String str) {
            boolean zIsEmpty = TextUtils.isEmpty(str);
            return new C1646g1(str, zIsEmpty ? EnumC1596e1.UNKNOWN : EnumC1596e1.OK, zIsEmpty ? "no identifier saved in previous version" : null);
        }

        @Override // com.yandex.metrica.impl.ob.Q1.a
        public void a(Context context) {
            String strK = this.f15437a.k(null);
            String strM = this.f15437a.m(null);
            String strL = this.f15437a.l(null);
            String strF = this.f15437a.f((String) null);
            String strG = this.f15437a.g((String) null);
            String strI = this.f15437a.i((String) null);
            this.f15437a.e(a(strK));
            this.f15437a.i(a(strM));
            this.f15437a.d(a(strL));
            this.f15437a.a(a(strF));
            this.f15437a.b(a(strG));
            this.f15437a.h(a(strI));
        }
    }

    public static class c implements Q1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private F9 f15438a;

        public c(F9 f10) {
            this.f15438a = f10;
        }

        private boolean a(String str, String str2) {
            return !TextUtils.isEmpty(str) && TextUtils.isEmpty(str2);
        }

        @Override // com.yandex.metrica.impl.ob.Q1.a
        public void a(Context context) {
            C1957se c1957se = new C1957se(context);
            if (U2.b(c1957se.g())) {
                return;
            }
            if (this.f15438a.m(null) == null || this.f15438a.k(null) == null) {
                String strE = c1957se.e(null);
                if (a(strE, this.f15438a.k(null))) {
                    this.f15438a.r(strE);
                }
                String strF = c1957se.f(null);
                if (a(strF, this.f15438a.m(null))) {
                    this.f15438a.s(strF);
                }
                String strB = c1957se.b(null);
                if (a(strB, this.f15438a.f((String) null))) {
                    this.f15438a.n(strB);
                }
                String strC = c1957se.c(null);
                if (a(strC, this.f15438a.g((String) null))) {
                    this.f15438a.o(strC);
                }
                String strD = c1957se.d(null);
                if (a(strD, this.f15438a.i((String) null))) {
                    this.f15438a.p(strD);
                }
                long jA = c1957se.a(-1L);
                if (jA != -1 && this.f15438a.d(-1L) == -1) {
                    this.f15438a.h(jA);
                }
                this.f15438a.c();
                c1957se.f().b();
            }
        }
    }

    public class d implements Q1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final F9 f15439a;

        public d(X x10, F9 f10) {
            this.f15439a = f10;
        }

        @Override // com.yandex.metrica.impl.ob.Q1.a
        public void a(Context context) {
            this.f15439a.e(new C2112ye("COOKIE_BROWSERS", null).a());
            this.f15439a.e(new C2112ye("BIND_ID_URL", null).a());
            V0.a(context, "b_meta.dat");
            V0.a(context, "browsers.dat");
        }
    }

    public static class e implements Q1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final F9 f15440a;

        public e(F9 f10) {
            this.f15440a = f10;
        }

        @Override // com.yandex.metrica.impl.ob.Q1.a
        public void a(Context context) {
            this.f15440a.e(new C2112ye("DEVICE_ID_POSSIBLE", null).a()).c();
        }
    }

    public static class f implements Q1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final F9 f15441a;

        public f(F9 f10) {
            this.f15441a = f10;
        }

        @Override // com.yandex.metrica.impl.ob.Q1.a
        public void a(Context context) {
            this.f15441a.e(new C2112ye("STARTUP_REQUEST_TIME", null).a()).c();
        }
    }

    public X(Context context) {
        this(new F9(Qa.a(context).d()));
    }

    public X(F9 f10) {
        this.f15435a = f10;
    }

    @Override // com.yandex.metrica.impl.ob.Q1
    public int a(C2007ue c2007ue) {
        return (int) this.f15435a.b(-1L);
    }

    @Override // com.yandex.metrica.impl.ob.Q1
    public SparseArray<Q1.a> a() {
        return new a();
    }

    @Override // com.yandex.metrica.impl.ob.Q1
    public void a(C2007ue c2007ue, int i10) {
        this.f15435a.e(i10);
        c2007ue.g().b();
    }
}
