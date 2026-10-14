package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class a3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    private static final long f18778d = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w2 f18779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o50 f18780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f18781c;

    public a3(w2 w2Var) {
        fd.j0.i(w2Var, "adGroupController");
        this.f18779a = w2Var;
        this.f18780b = o50.a();
        this.f18781c = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a3 a3Var, e3 e3Var) {
        fd.j0.i(a3Var, "this$0");
        fd.j0.i(e3Var, "$nextAd");
        if (fd.j0.d(a3Var.f18779a.e(), e3Var)) {
            de1 de1VarB = e3Var.b();
            s50 s50VarA = e3Var.a();
            if (de1VarB.a().ordinal() != 0) {
                return;
            }
            s50VarA.d();
        }
    }

    public final void a() {
        s50 s50VarA;
        e3 e3VarE = this.f18779a.e();
        if (e3VarE != null && (s50VarA = e3VarE.a()) != null) {
            s50VarA.a();
        }
        this.f18781c.removeCallbacksAndMessages(null);
    }

    public final void b() {
        e3 e3VarE;
        if (!this.f18780b.b() || (e3VarE = this.f18779a.e()) == null) {
            return;
        }
        this.f18781c.postDelayed(new do1(this, e3VarE), f18778d);
    }

    public final void c() {
        e3 e3VarE = this.f18779a.e();
        if (e3VarE != null) {
            de1 de1VarB = e3VarE.b();
            s50 s50VarA = e3VarE.a();
            int iOrdinal = de1VarB.a().ordinal();
            if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 6 || iOrdinal == 7) {
                s50VarA.g();
            }
        }
        this.f18781c.removeCallbacksAndMessages(null);
    }
}
