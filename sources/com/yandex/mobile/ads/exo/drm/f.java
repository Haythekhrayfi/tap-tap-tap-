package com.yandex.mobile.ads.exo.drm;

import android.os.Handler;
import com.applovin.exoplayer2.d.z;
import com.yandex.mobile.ads.impl.da1;
import com.yandex.mobile.ads.impl.nc0;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public interface f {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18494a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final nc0.b f18495b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final CopyOnWriteArrayList<C0194a> f18496c;

        /* JADX INFO: renamed from: com.yandex.mobile.ads.exo.drm.f$a$a, reason: collision with other inner class name */
        public static final class C0194a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Handler f18497a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public f f18498b;

            public C0194a(Handler handler, f fVar) {
                this.f18497a = handler;
                this.f18498b = fVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        private a(CopyOnWriteArrayList<C0194a> copyOnWriteArrayList, int i10, nc0.b bVar) {
            this.f18496c = copyOnWriteArrayList;
            this.f18494a = i10;
            this.f18495b = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(f fVar) {
            fVar.c(this.f18494a, this.f18495b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(f fVar, int i10) {
            Objects.requireNonNull(fVar);
            fVar.a(this.f18494a, this.f18495b, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(f fVar, Exception exc) {
            fVar.a(this.f18494a, this.f18495b, exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(f fVar) {
            fVar.d(this.f18494a, this.f18495b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(f fVar) {
            fVar.a(this.f18494a, this.f18495b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(f fVar) {
            fVar.b(this.f18494a, this.f18495b);
        }

        public final a a(int i10, nc0.b bVar) {
            return new a(this.f18496c, i10, bVar);
        }

        public final void a() {
            for (C0194a c0194a : this.f18496c) {
                da1.a(c0194a.f18497a, (Runnable) new r(this, c0194a.f18498b, 3));
            }
        }

        public final void a(int i10) {
            for (C0194a c0194a : this.f18496c) {
                da1.a(c0194a.f18497a, (Runnable) new z(this, c0194a.f18498b, i10));
            }
        }

        public final void a(Handler handler, f fVar) {
            Objects.requireNonNull(fVar);
            this.f18496c.add(new C0194a(handler, fVar));
        }

        public final void a(Exception exc) {
            for (C0194a c0194a : this.f18496c) {
                da1.a(c0194a.f18497a, (Runnable) new androidx.emoji2.text.f(this, c0194a.f18498b, exc));
            }
        }

        public final void b() {
            for (C0194a c0194a : this.f18496c) {
                da1.a(c0194a.f18497a, (Runnable) new r(this, c0194a.f18498b, 1));
            }
        }

        public final void c() {
            for (C0194a c0194a : this.f18496c) {
                da1.a(c0194a.f18497a, (Runnable) new r(this, c0194a.f18498b, 2));
            }
        }

        public final void d() {
            for (C0194a c0194a : this.f18496c) {
                da1.a(c0194a.f18497a, (Runnable) new r(this, c0194a.f18498b, 0));
            }
        }

        public final void e(f fVar) {
            for (C0194a c0194a : this.f18496c) {
                if (c0194a.f18498b == fVar) {
                    this.f18496c.remove(c0194a);
                }
            }
        }
    }

    default void a(int i10, nc0.b bVar) {
    }

    default void a(int i10, nc0.b bVar, int i11) {
    }

    default void a(int i10, nc0.b bVar, Exception exc) {
    }

    default void b(int i10, nc0.b bVar) {
    }

    default void c(int i10, nc0.b bVar) {
    }

    default void d(int i10, nc0.b bVar) {
    }
}
