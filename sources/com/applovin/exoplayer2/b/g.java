package com.applovin.exoplayer2.b;

import android.os.Handler;
import com.applovin.exoplayer2.l.ai;

/* JADX INFO: loaded from: classes.dex */
public interface g {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f4446a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g f4447b;

        public a(Handler handler, g gVar) {
            this.f4446a = gVar != null ? (Handler) com.applovin.exoplayer2.l.a.b(handler) : null;
            this.f4447b = gVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(int i10, long j10, long j11) {
            ((g) ai.a(this.f4447b)).a(i10, j10, j11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(long j10) {
            ((g) ai.a(this.f4447b)).a(j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(com.applovin.exoplayer2.v vVar, com.applovin.exoplayer2.c.h hVar) {
            ((g) ai.a(this.f4447b)).a(vVar);
            ((g) ai.a(this.f4447b)).b(vVar, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(String str) {
            ((g) ai.a(this.f4447b)).b(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(String str, long j10, long j11) {
            ((g) ai.a(this.f4447b)).b(str, j10, j11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(boolean z10) {
            ((g) ai.a(this.f4447b)).a_(z10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(com.applovin.exoplayer2.c.e eVar) {
            eVar.a();
            ((g) ai.a(this.f4447b)).d(eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(Exception exc) {
            ((g) ai.a(this.f4447b)).c(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(com.applovin.exoplayer2.c.e eVar) {
            ((g) ai.a(this.f4447b)).c(eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(Exception exc) {
            ((g) ai.a(this.f4447b)).b(exc);
        }

        public void a(final int i10, final long j10, final long j11) {
            Handler handler = this.f4446a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.exoplayer2.b.f0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f4442c.b(i10, j10, j11);
                    }
                });
            }
        }

        public void a(long j10) {
            Handler handler = this.f4446a;
            if (handler != null) {
                handler.post(new c0(this, j10));
            }
        }

        public void a(com.applovin.exoplayer2.c.e eVar) {
            Handler handler = this.f4446a;
            if (handler != null) {
                handler.post(new a0(this, eVar, 1));
            }
        }

        public void a(com.applovin.exoplayer2.v vVar, com.applovin.exoplayer2.c.h hVar) {
            Handler handler = this.f4446a;
            if (handler != null) {
                handler.post(new androidx.emoji2.text.f(this, vVar, hVar));
            }
        }

        public void a(Exception exc) {
            Handler handler = this.f4446a;
            if (handler != null) {
                handler.post(new b0(this, exc, 0));
            }
        }

        public void a(String str) {
            Handler handler = this.f4446a;
            if (handler != null) {
                handler.post(new androidx.appcompat.app.s(this, str));
            }
        }

        public void a(String str, long j10, long j11) {
            Handler handler = this.f4446a;
            if (handler != null) {
                handler.post(new d0(this, str, j10, j11));
            }
        }

        public void a(boolean z10) {
            Handler handler = this.f4446a;
            if (handler != null) {
                handler.post(new e0(this, z10));
            }
        }

        public void b(com.applovin.exoplayer2.c.e eVar) {
            eVar.a();
            Handler handler = this.f4446a;
            if (handler != null) {
                handler.post(new a0(this, eVar, 0));
            }
        }

        public void b(Exception exc) {
            Handler handler = this.f4446a;
            if (handler != null) {
                handler.post(new b0(this, exc, 1));
            }
        }
    }

    default void a(int i10, long j10, long j11) {
    }

    default void a(long j10) {
    }

    @Deprecated
    default void a(com.applovin.exoplayer2.v vVar) {
    }

    default void a_(boolean z10) {
    }

    default void b(com.applovin.exoplayer2.v vVar, com.applovin.exoplayer2.c.h hVar) {
    }

    default void b(Exception exc) {
    }

    default void b(String str) {
    }

    default void b(String str, long j10, long j11) {
    }

    default void c(com.applovin.exoplayer2.c.e eVar) {
    }

    default void c(Exception exc) {
    }

    default void d(com.applovin.exoplayer2.c.e eVar) {
    }
}
