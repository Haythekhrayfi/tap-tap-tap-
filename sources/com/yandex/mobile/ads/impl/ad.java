package com.yandex.mobile.ads.impl;

import android.os.Handler;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public interface ad {

    public interface a {

        /* JADX INFO: renamed from: com.yandex.mobile.ads.impl.ad$a$a, reason: collision with other inner class name */
        public static final class C0199a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final CopyOnWriteArrayList<C0200a> f18868a = new CopyOnWriteArrayList<>();

            /* JADX INFO: renamed from: com.yandex.mobile.ads.impl.ad$a$a$a, reason: collision with other inner class name */
            public static final class C0200a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final Handler f18869a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final a f18870b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private boolean f18871c;

                public C0200a(Handler handler, w8 w8Var) {
                    this.f18869a = handler;
                    this.f18870b = w8Var;
                }

                public final void a() {
                    this.f18871c = true;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ void a(C0200a c0200a, int i10, long j10, long j11) {
                c0200a.f18870b.b(i10, j10, j11);
            }

            public final void a(int i10, long j10, long j11) {
                for (C0200a c0200a : this.f18868a) {
                    if (!c0200a.f18871c) {
                        c0200a.f18869a.post(new on1(c0200a, i10, j10, j11));
                    }
                }
            }

            public final void a(Handler handler, w8 w8Var) {
                Objects.requireNonNull(w8Var);
                a(w8Var);
                this.f18868a.add(new C0200a(handler, w8Var));
            }

            public final void a(w8 w8Var) {
                for (C0200a c0200a : this.f18868a) {
                    if (c0200a.f18870b == w8Var) {
                        c0200a.a();
                        this.f18868a.remove(c0200a);
                    }
                }
            }
        }

        void b(int i10, long j10, long j11);
    }

    pn a();

    void a(Handler handler, w8 w8Var);

    void a(w8 w8Var);
}
