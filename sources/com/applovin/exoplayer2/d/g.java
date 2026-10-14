package com.applovin.exoplayer2.d;

import android.os.Handler;
import com.applovin.exoplayer2.l.ai;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public interface g {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.applovin.exoplayer2.h.p.a f5143b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final CopyOnWriteArrayList<C0082a> f5144c;

        /* JADX INFO: renamed from: com.applovin.exoplayer2.d.g$a$a, reason: collision with other inner class name */
        public static final class C0082a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Handler f5145a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public g f5146b;

            public C0082a(Handler handler, g gVar) {
                this.f5145a = handler;
                this.f5146b = gVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        private a(CopyOnWriteArrayList<C0082a> copyOnWriteArrayList, int i10, com.applovin.exoplayer2.h.p.a aVar) {
            this.f5144c = copyOnWriteArrayList;
            this.f5142a = i10;
            this.f5143b = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(g gVar, int i10) {
            gVar.e(this.f5142a, this.f5143b);
            gVar.a(this.f5142a, this.f5143b, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(g gVar, Exception exc) {
            gVar.a(this.f5142a, this.f5143b, exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(g gVar) {
            gVar.d(this.f5142a, this.f5143b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(g gVar) {
            gVar.c(this.f5142a, this.f5143b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(g gVar) {
            gVar.b(this.f5142a, this.f5143b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(g gVar) {
            gVar.a(this.f5142a, this.f5143b);
        }

        public a a(int i10, com.applovin.exoplayer2.h.p.a aVar) {
            return new a(this.f5144c, i10, aVar);
        }

        public void a() {
            for (C0082a c0082a : this.f5144c) {
                ai.a(c0082a.f5145a, (Runnable) new y(this, c0082a.f5146b, 2));
            }
        }

        public void a(int i10) {
            for (C0082a c0082a : this.f5144c) {
                ai.a(c0082a.f5145a, (Runnable) new z(this, c0082a.f5146b, i10));
            }
        }

        public void a(Handler handler, g gVar) {
            com.applovin.exoplayer2.l.a.b(handler);
            com.applovin.exoplayer2.l.a.b(gVar);
            this.f5144c.add(new C0082a(handler, gVar));
        }

        public void a(g gVar) {
            for (C0082a c0082a : this.f5144c) {
                if (c0082a.f5146b == gVar) {
                    this.f5144c.remove(c0082a);
                }
            }
        }

        public void a(Exception exc) {
            for (C0082a c0082a : this.f5144c) {
                ai.a(c0082a.f5145a, (Runnable) new androidx.emoji2.text.f(this, c0082a.f5146b, exc));
            }
        }

        public void b() {
            for (C0082a c0082a : this.f5144c) {
                ai.a(c0082a.f5145a, (Runnable) new y(this, c0082a.f5146b, 3));
            }
        }

        public void c() {
            for (C0082a c0082a : this.f5144c) {
                ai.a(c0082a.f5145a, (Runnable) new y(this, c0082a.f5146b, 0));
            }
        }

        public void d() {
            for (C0082a c0082a : this.f5144c) {
                ai.a(c0082a.f5145a, (Runnable) new y(this, c0082a.f5146b, 1));
            }
        }
    }

    default void a(int i10, com.applovin.exoplayer2.h.p.a aVar) {
    }

    default void a(int i10, com.applovin.exoplayer2.h.p.a aVar, int i11) {
    }

    default void a(int i10, com.applovin.exoplayer2.h.p.a aVar, Exception exc) {
    }

    default void b(int i10, com.applovin.exoplayer2.h.p.a aVar) {
    }

    default void c(int i10, com.applovin.exoplayer2.h.p.a aVar) {
    }

    default void d(int i10, com.applovin.exoplayer2.h.p.a aVar) {
    }

    @Deprecated
    default void e(int i10, com.applovin.exoplayer2.h.p.a aVar) {
    }
}
