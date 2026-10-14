package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public interface sf1 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f25072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final sf1 f25073b;

        public a(Handler handler, sf1 sf1Var) {
            this.f25072a = (Handler) pa.a(handler);
            this.f25073b = sf1Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j10, int i10) {
            sf1 sf1Var = this.f25073b;
            int i11 = da1.f19803a;
            sf1Var.a(i10, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(wf1 wf1Var) {
            sf1 sf1Var = this.f25073b;
            int i10 = da1.f19803a;
            sf1Var.a(wf1Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(Exception exc) {
            sf1 sf1Var = this.f25073b;
            int i10 = da1.f19803a;
            sf1Var.c(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(Object obj, long j10) {
            sf1 sf1Var = this.f25073b;
            int i10 = da1.f19803a;
            sf1Var.a(obj, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(int i10, long j10) {
            sf1 sf1Var = this.f25073b;
            int i11 = da1.f19803a;
            sf1Var.b(i10, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(yv yvVar, cn cnVar) {
            sf1 sf1Var = this.f25073b;
            int i10 = da1.f19803a;
            Objects.requireNonNull(sf1Var);
            this.f25073b.b(yvVar, cnVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str) {
            sf1 sf1Var = this.f25073b;
            int i10 = da1.f19803a;
            sf1Var.a(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str, long j10, long j11) {
            sf1 sf1Var = this.f25073b;
            int i10 = da1.f19803a;
            sf1Var.a(str, j10, j11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(ym ymVar) {
            synchronized (ymVar) {
            }
            sf1 sf1Var = this.f25073b;
            int i10 = da1.f19803a;
            sf1Var.c(ymVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(ym ymVar) {
            sf1 sf1Var = this.f25073b;
            int i10 = da1.f19803a;
            sf1Var.d(ymVar);
        }

        public final void a(int i10, long j10) {
            Handler handler = this.f25072a;
            if (handler != null) {
                handler.post(new bq1(this, i10, j10));
            }
        }

        public final void a(Surface surface) {
            if (this.f25072a != null) {
                this.f25072a.post(new com.applovin.exoplayer2.m.r(this, surface, SystemClock.elapsedRealtime()));
            }
        }

        public final void a(ym ymVar) {
            synchronized (ymVar) {
            }
            Handler handler = this.f25072a;
            if (handler != null) {
                handler.post(new cq1(this, ymVar, 0));
            }
        }

        public final void a(yv yvVar, cn cnVar) {
            Handler handler = this.f25072a;
            if (handler != null) {
                handler.post(new ap1(this, yvVar, cnVar));
            }
        }

        public final void a(String str) {
            Handler handler = this.f25072a;
            if (handler != null) {
                handler.post(new do1(this, str));
            }
        }

        public final void a(String str, long j10, long j11) {
            Handler handler = this.f25072a;
            if (handler != null) {
                handler.post(new com.applovin.exoplayer2.b.d0(this, str, j10, j11));
            }
        }

        public final void b(wf1 wf1Var) {
            Handler handler = this.f25072a;
            if (handler != null) {
                handler.post(new do1(this, wf1Var));
            }
        }

        public final void b(ym ymVar) {
            Handler handler = this.f25072a;
            if (handler != null) {
                handler.post(new cq1(this, ymVar, 1));
            }
        }

        public final void b(Exception exc) {
            Handler handler = this.f25072a;
            if (handler != null) {
                handler.post(new do1(this, exc));
            }
        }

        public final void c(int i10, long j10) {
            Handler handler = this.f25072a;
            if (handler != null) {
                handler.post(new bq1(this, j10, i10));
            }
        }
    }

    default void a(int i10, long j10) {
    }

    default void a(wf1 wf1Var) {
    }

    default void a(Object obj, long j10) {
    }

    default void a(String str) {
    }

    default void a(String str, long j10, long j11) {
    }

    default void b(int i10, long j10) {
    }

    default void b(yv yvVar, cn cnVar) {
    }

    default void c(ym ymVar) {
    }

    default void c(Exception exc) {
    }

    default void d(ym ymVar) {
    }
}
