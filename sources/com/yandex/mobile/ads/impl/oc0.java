package com.yandex.mobile.ads.impl;

import android.os.Handler;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public interface oc0 {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f23768a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final nc0.b f23769b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final CopyOnWriteArrayList<C0210a> f23770c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f23771d;

        /* JADX INFO: renamed from: com.yandex.mobile.ads.impl.oc0$a$a, reason: collision with other inner class name */
        public static final class C0210a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Handler f23772a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public oc0 f23773b;

            public C0210a(Handler handler, oc0 oc0Var) {
                this.f23772a = handler;
                this.f23773b = oc0Var;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        private a(CopyOnWriteArrayList copyOnWriteArrayList, int i10, nc0.b bVar) {
            this.f23770c = copyOnWriteArrayList;
            this.f23768a = i10;
            this.f23769b = bVar;
            this.f23771d = 0L;
        }

        private long a(long j10) {
            long jB = da1.b(j10);
            if (jB == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f23771d + jB;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(oc0 oc0Var, dc0 dc0Var) {
            oc0Var.a(this.f23768a, this.f23769b, dc0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(oc0 oc0Var, v80 v80Var, dc0 dc0Var) {
            oc0Var.a(this.f23768a, this.f23769b, v80Var, dc0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(oc0 oc0Var, v80 v80Var, dc0 dc0Var, IOException iOException, boolean z10) {
            oc0Var.a(this.f23768a, this.f23769b, v80Var, dc0Var, iOException, z10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(oc0 oc0Var, v80 v80Var, dc0 dc0Var) {
            oc0Var.b(this.f23768a, this.f23769b, v80Var, dc0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(oc0 oc0Var, v80 v80Var, dc0 dc0Var) {
            oc0Var.c(this.f23768a, this.f23769b, v80Var, dc0Var);
        }

        public final a a(int i10, nc0.b bVar) {
            return new a(this.f23770c, i10, bVar);
        }

        public final void a(int i10, yv yvVar, long j10) {
            a(new dc0(1, i10, yvVar, 0, null, a(j10), -9223372036854775807L));
        }

        public final void a(Handler handler, oc0 oc0Var) {
            Objects.requireNonNull(oc0Var);
            this.f23770c.add(new C0210a(handler, oc0Var));
        }

        public final void a(dc0 dc0Var) {
            for (C0210a c0210a : this.f23770c) {
                da1.a(c0210a.f23772a, (Runnable) new ap1(this, c0210a.f23773b, dc0Var));
            }
        }

        public final void a(oc0 oc0Var) {
            for (C0210a c0210a : this.f23770c) {
                if (c0210a.f23773b == oc0Var) {
                    this.f23770c.remove(c0210a);
                }
            }
        }

        public final void a(v80 v80Var, int i10, yv yvVar, long j10, long j11, IOException iOException, boolean z10) {
            a(v80Var, new dc0(i10, -1, yvVar, 0, null, a(j10), a(j11)), iOException, z10);
        }

        public final void a(v80 v80Var, long j10, long j11) {
            a(v80Var, new dc0(1, -1, null, 0, null, a(j10), a(j11)));
        }

        public final void a(v80 v80Var, dc0 dc0Var) {
            for (C0210a c0210a : this.f23770c) {
                da1.a(c0210a.f23772a, (Runnable) new hp1(this, c0210a.f23773b, v80Var, dc0Var, 1));
            }
        }

        public final void a(v80 v80Var, dc0 dc0Var, IOException iOException, boolean z10) {
            for (C0210a c0210a : this.f23770c) {
                da1.a(c0210a.f23772a, (Runnable) new com.applovin.exoplayer2.h.d0(this, c0210a.f23773b, v80Var, dc0Var, iOException, z10));
            }
        }

        public final void a(v80 v80Var, yv yvVar, long j10, long j11) {
            b(v80Var, new dc0(1, -1, yvVar, 0, null, a(j10), a(j11)));
        }

        public final void b(v80 v80Var, dc0 dc0Var) {
            for (C0210a c0210a : this.f23770c) {
                da1.a(c0210a.f23772a, (Runnable) new hp1(this, c0210a.f23773b, v80Var, dc0Var, 2));
            }
        }

        public final void b(v80 v80Var, yv yvVar, long j10, long j11) {
            c(v80Var, new dc0(1, -1, yvVar, 0, null, a(j10), a(j11)));
        }

        public final void c(v80 v80Var, dc0 dc0Var) {
            for (C0210a c0210a : this.f23770c) {
                da1.a(c0210a.f23772a, (Runnable) new hp1(this, c0210a.f23773b, v80Var, dc0Var, 0));
            }
        }
    }

    default void a(int i10, nc0.b bVar, dc0 dc0Var) {
    }

    default void a(int i10, nc0.b bVar, v80 v80Var, dc0 dc0Var) {
    }

    default void a(int i10, nc0.b bVar, v80 v80Var, dc0 dc0Var, IOException iOException, boolean z10) {
    }

    default void b(int i10, nc0.b bVar, v80 v80Var, dc0 dc0Var) {
    }

    default void c(int i10, nc0.b bVar, v80 v80Var, dc0 dc0Var) {
    }
}
