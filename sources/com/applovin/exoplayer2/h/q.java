package com.applovin.exoplayer2.h;

import android.os.Handler;
import com.applovin.exoplayer2.l.ai;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public interface q {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6613a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p.a f6614b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final CopyOnWriteArrayList<C0094a> f6615c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f6616d;

        /* JADX INFO: renamed from: com.applovin.exoplayer2.h.q$a$a, reason: collision with other inner class name */
        public static final class C0094a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Handler f6617a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public q f6618b;

            public C0094a(Handler handler, q qVar) {
                this.f6617a = handler;
                this.f6618b = qVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null, 0L);
        }

        private a(CopyOnWriteArrayList<C0094a> copyOnWriteArrayList, int i10, p.a aVar, long j10) {
            this.f6615c = copyOnWriteArrayList;
            this.f6613a = i10;
            this.f6614b = aVar;
            this.f6616d = j10;
        }

        private long a(long j10) {
            long jA = com.applovin.exoplayer2.h.a(j10);
            if (jA == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f6616d + jA;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(q qVar, j jVar, m mVar) {
            qVar.c(this.f6613a, this.f6614b, jVar, mVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(q qVar, j jVar, m mVar, IOException iOException, boolean z10) {
            qVar.a(this.f6613a, this.f6614b, jVar, mVar, iOException, z10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(q qVar, m mVar) {
            qVar.a(this.f6613a, this.f6614b, mVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(q qVar, j jVar, m mVar) {
            qVar.b(this.f6613a, this.f6614b, jVar, mVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(q qVar, j jVar, m mVar) {
            qVar.a(this.f6613a, this.f6614b, jVar, mVar);
        }

        public a a(int i10, p.a aVar, long j10) {
            return new a(this.f6615c, i10, aVar, j10);
        }

        public void a(int i10, com.applovin.exoplayer2.v vVar, int i11, Object obj, long j10) {
            a(new m(1, i10, vVar, i11, obj, a(j10), -9223372036854775807L));
        }

        public void a(Handler handler, q qVar) {
            com.applovin.exoplayer2.l.a.b(handler);
            com.applovin.exoplayer2.l.a.b(qVar);
            this.f6615c.add(new C0094a(handler, qVar));
        }

        public void a(j jVar, int i10, int i11, com.applovin.exoplayer2.v vVar, int i12, Object obj, long j10, long j11) {
            a(jVar, new m(i10, i11, vVar, i12, obj, a(j10), a(j11)));
        }

        public void a(j jVar, int i10, int i11, com.applovin.exoplayer2.v vVar, int i12, Object obj, long j10, long j11, IOException iOException, boolean z10) {
            a(jVar, new m(i10, i11, vVar, i12, obj, a(j10), a(j11)), iOException, z10);
        }

        public void a(j jVar, m mVar) {
            for (C0094a c0094a : this.f6615c) {
                ai.a(c0094a.f6617a, (Runnable) new c0(this, c0094a.f6618b, jVar, mVar, 2));
            }
        }

        public void a(j jVar, m mVar, IOException iOException, boolean z10) {
            for (C0094a c0094a : this.f6615c) {
                ai.a(c0094a.f6617a, (Runnable) new d0(this, c0094a.f6618b, jVar, mVar, iOException, z10));
            }
        }

        public void a(m mVar) {
            for (C0094a c0094a : this.f6615c) {
                ai.a(c0094a.f6617a, (Runnable) new androidx.emoji2.text.f(this, c0094a.f6618b, mVar));
            }
        }

        public void a(q qVar) {
            for (C0094a c0094a : this.f6615c) {
                if (c0094a.f6618b == qVar) {
                    this.f6615c.remove(c0094a);
                }
            }
        }

        public void b(j jVar, int i10, int i11, com.applovin.exoplayer2.v vVar, int i12, Object obj, long j10, long j11) {
            b(jVar, new m(i10, i11, vVar, i12, obj, a(j10), a(j11)));
        }

        public void b(j jVar, m mVar) {
            for (C0094a c0094a : this.f6615c) {
                ai.a(c0094a.f6617a, (Runnable) new c0(this, c0094a.f6618b, jVar, mVar, 0));
            }
        }

        public void c(j jVar, int i10, int i11, com.applovin.exoplayer2.v vVar, int i12, Object obj, long j10, long j11) {
            c(jVar, new m(i10, i11, vVar, i12, obj, a(j10), a(j11)));
        }

        public void c(j jVar, m mVar) {
            for (C0094a c0094a : this.f6615c) {
                ai.a(c0094a.f6617a, (Runnable) new c0(this, c0094a.f6618b, jVar, mVar, 1));
            }
        }
    }

    default void a(int i10, p.a aVar, j jVar, m mVar) {
    }

    default void a(int i10, p.a aVar, j jVar, m mVar, IOException iOException, boolean z10) {
    }

    default void a(int i10, p.a aVar, m mVar) {
    }

    default void b(int i10, p.a aVar, j jVar, m mVar) {
    }

    default void c(int i10, p.a aVar, j jVar, m mVar) {
    }
}
