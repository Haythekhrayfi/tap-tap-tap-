package com.yandex.mobile.ads.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w50 f25222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x1 f25223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p40 f25224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b3 f25225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a2 f25226e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private u1 f25227f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f25228g;

    public class a implements d3 {
        private a() {
        }

        public /* synthetic */ a(t1 t1Var, int i10) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.d3
        public final void a() {
            w1 w1VarA = t1.this.f25223b.a(t1.this.f25222a);
            if (w1VarA.equals(w1.f26131h) || w1VarA.equals(w1.f26130g)) {
                t1.this.f25223b.a(t1.this.f25222a, w1.f26127d);
                t1.this.f25226e.a();
                if (t1.this.f25227f != null) {
                    t1.this.f25227f.e();
                }
            }
        }

        @Override // com.yandex.mobile.ads.impl.d3
        public final void b() {
            t1.this.f25223b.a(t1.this.f25222a, w1.f26129f);
            t1.this.f25226e.b();
            if (t1.this.f25227f != null) {
                t1.this.f25227f.g();
            }
        }

        @Override // com.yandex.mobile.ads.impl.d3
        public final void c() {
            t1.this.f25223b.a(t1.this.f25222a, w1.f26129f);
            t1.this.f25226e.b();
            if (t1.this.f25227f != null) {
                t1.this.f25227f.g();
            }
        }
    }

    public t1(Context context, w50 w50Var, d40 d40Var, p40 p40Var, s40 s40Var, x1 x1Var) {
        this.f25222a = w50Var;
        this.f25223b = x1Var;
        this.f25224c = p40Var;
        this.f25225d = new b3(context, w50Var, d40Var, p40Var, s40Var, new a(this, 0));
        this.f25226e = new a2(context, w50Var.a());
    }

    public static void e(t1 t1Var) {
        if (t1Var.f25223b.a(t1Var.f25222a).equals(w1.f26126c)) {
            u1 u1Var = t1Var.f25227f;
            if (u1Var != null) {
                u1Var.d();
            }
            t1Var.f25225d.d();
        }
    }

    public final void a() {
        int iOrdinal = this.f25223b.a(this.f25222a).ordinal();
        if (iOrdinal == 6 || iOrdinal == 7) {
            this.f25223b.a(this.f25222a, w1.f26130g);
            this.f25225d.c();
        }
    }

    public final void a(dc1 dc1Var) {
        this.f25225d.a(dc1Var);
    }

    public final void a(u1 u1Var) {
        this.f25227f = u1Var;
    }

    public final void b() {
        int iOrdinal = this.f25223b.a(this.f25222a).ordinal();
        if (iOrdinal == 1) {
            this.f25223b.a(this.f25222a, w1.f26124a);
            this.f25225d.g();
            this.f25225d.a();
        } else {
            if (iOrdinal == 2) {
                this.f25228g = false;
            } else if (iOrdinal == 5) {
                this.f25223b.a(this.f25222a, w1.f26124a);
                this.f25225d.a();
            } else if (iOrdinal == 6 || iOrdinal == 7) {
                this.f25228g = true;
            }
            this.f25223b.a(this.f25222a, w1.f26124a);
            this.f25225d.g();
            this.f25225d.a();
        }
        this.f25224c.a();
    }

    public final void c() {
        int iOrdinal = this.f25223b.a(this.f25222a).ordinal();
        if (iOrdinal == 1) {
            this.f25223b.a(this.f25222a, w1.f26124a);
            this.f25225d.g();
        } else if (iOrdinal == 6 || iOrdinal == 7) {
            this.f25223b.a(this.f25222a, w1.f26130g);
            this.f25225d.c();
        }
        this.f25224c.a();
    }

    public final void d() {
        if (this.f25223b.a(this.f25222a).equals(w1.f26124a)) {
            this.f25223b.a(this.f25222a, w1.f26125b);
            this.f25225d.e();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:
    
        if (r0 != 7) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r3 = this;
            com.yandex.mobile.ads.impl.x1 r0 = r3.f25223b
            com.yandex.mobile.ads.impl.w50 r1 = r3.f25222a
            com.yandex.mobile.ads.impl.w1 r0 = r0.a(r1)
            int r0 = r0.ordinal()
            r1 = 1
            if (r0 == r1) goto L26
            r1 = 2
            if (r0 == r1) goto L26
            r1 = 5
            if (r0 == r1) goto L1c
            r1 = 6
            if (r0 == r1) goto L26
            r1 = 7
            if (r0 == r1) goto L26
            goto L39
        L1c:
            com.yandex.mobile.ads.impl.x1 r0 = r3.f25223b
            com.yandex.mobile.ads.impl.w50 r1 = r3.f25222a
            com.yandex.mobile.ads.impl.w1 r2 = com.yandex.mobile.ads.impl.w1.f26124a
            r0.a(r1, r2)
            goto L34
        L26:
            com.yandex.mobile.ads.impl.x1 r0 = r3.f25223b
            com.yandex.mobile.ads.impl.w50 r1 = r3.f25222a
            com.yandex.mobile.ads.impl.w1 r2 = com.yandex.mobile.ads.impl.w1.f26124a
            r0.a(r1, r2)
            com.yandex.mobile.ads.impl.b3 r0 = r3.f25225d
            r0.g()
        L34:
            com.yandex.mobile.ads.impl.b3 r0 = r3.f25225d
            r0.a()
        L39:
            r0 = 0
            r3.f25228g = r0
            com.yandex.mobile.ads.impl.p40 r0 = r3.f25224c
            r0.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.t1.e():void");
    }

    public final void f() {
        int iOrdinal = this.f25223b.a(this.f25222a).ordinal();
        if (iOrdinal == 0) {
            if (this.f25223b.a(this.f25222a).equals(w1.f26124a)) {
                this.f25223b.a(this.f25222a, w1.f26125b);
                this.f25225d.e();
                return;
            }
            return;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 6 || iOrdinal == 7) {
                this.f25225d.f();
                return;
            }
            return;
        }
        if (this.f25223b.a(this.f25222a).equals(w1.f26126c)) {
            u1 u1Var = this.f25227f;
            if (u1Var != null) {
                u1Var.d();
            }
            this.f25225d.d();
        }
    }

    public final void g() {
        if (this.f25223b.a(this.f25222a).equals(w1.f26126c)) {
            u1 u1Var = this.f25227f;
            if (u1Var != null) {
                u1Var.d();
            }
            this.f25225d.d();
        }
    }
}
