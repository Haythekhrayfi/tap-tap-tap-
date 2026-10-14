package com.yandex.mobile.ads.impl;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class js implements ox0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f22134a;

    public class a implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Handler f22135a;

        public a(Handler handler) {
            this.f22135a = handler;
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f22135a.post(runnable);
        }
    }

    public static class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final mw0 f22136b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final gx0 f22137c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Runnable f22138d;

        public b(mw0 mw0Var, gx0 gx0Var, Runnable runnable) {
            this.f22136b = mw0Var;
            this.f22137c = gx0Var;
            this.f22138d = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f22136b.o()) {
                this.f22136b.c("canceled-at-delivery");
                return;
            }
            gx0 gx0Var = this.f22137c;
            bi1 bi1Var = gx0Var.f21228c;
            if (bi1Var == null) {
                this.f22136b.a(gx0Var.f21226a);
            } else {
                this.f22136b.a(bi1Var);
            }
            if (this.f22137c.f21229d) {
                this.f22136b.a("intermediate-response");
            } else {
                this.f22136b.c("done");
            }
            Runnable runnable = this.f22138d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public js(Handler handler) {
        this.f22134a = new a(handler);
    }

    public final void a(mw0<?> mw0Var, bi1 bi1Var) {
        mw0Var.a("post-error");
        gx0 gx0VarA = gx0.a(bi1Var);
        Executor executor = this.f22134a;
        ((a) executor).f22135a.post(new b(mw0Var, gx0VarA, null));
    }

    public final void a(mw0<?> mw0Var, gx0<?> gx0Var, Runnable runnable) {
        mw0Var.p();
        mw0Var.a("post-response");
        Executor executor = this.f22134a;
        ((a) executor).f22135a.post(new b(mw0Var, gx0Var, runnable));
    }
}
