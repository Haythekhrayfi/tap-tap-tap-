package com.applovin.exoplayer2.k;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public interface d {

    public interface a {

        /* JADX INFO: renamed from: com.applovin.exoplayer2.k.d$a$a, reason: collision with other inner class name */
        public static final class C0104a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final CopyOnWriteArrayList<C0105a> f7365a = new CopyOnWriteArrayList<>();

            /* JADX INFO: renamed from: com.applovin.exoplayer2.k.d$a$a$a, reason: collision with other inner class name */
            public static final class C0105a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final Handler f7366a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final a f7367b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private boolean f7368c;

                public C0105a(Handler handler, a aVar) {
                    this.f7366a = handler;
                    this.f7367b = aVar;
                }

                public void a() {
                    this.f7368c = true;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ void a(C0105a c0105a, int i10, long j10, long j11) {
                c0105a.f7367b.b(i10, j10, j11);
            }

            public void a(final int i10, final long j10, final long j11) {
                for (final C0105a c0105a : this.f7365a) {
                    if (!c0105a.f7368c) {
                        c0105a.f7366a.post(new Runnable() { // from class: com.applovin.exoplayer2.k.a0
                            @Override // java.lang.Runnable
                            public final void run() {
                                d.a.C0104a.a(c0105a, i10, j10, j11);
                            }
                        });
                    }
                }
            }

            public void a(Handler handler, a aVar) {
                com.applovin.exoplayer2.l.a.b(handler);
                com.applovin.exoplayer2.l.a.b(aVar);
                a(aVar);
                this.f7365a.add(new C0105a(handler, aVar));
            }

            public void a(a aVar) {
                for (C0105a c0105a : this.f7365a) {
                    if (c0105a.f7367b == aVar) {
                        c0105a.a();
                        this.f7365a.remove(c0105a);
                    }
                }
            }
        }

        void b(int i10, long j10, long j11);
    }

    aa a();

    void a(Handler handler, a aVar);

    void a(a aVar);
}
