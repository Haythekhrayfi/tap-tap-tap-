package com.applovin.exoplayer2.m;

import android.os.Handler;
import android.os.SystemClock;
import androidx.appcompat.app.s;
import com.applovin.exoplayer2.b.d0;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.v;

/* JADX INFO: loaded from: classes.dex */
public interface n {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f7876a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final n f7877b;

        public a(Handler handler, n nVar) {
            this.f7876a = nVar != null ? (Handler) com.applovin.exoplayer2.l.a.b(handler) : null;
            this.f7877b = nVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(Object obj, long j10) {
            ((n) ai.a(this.f7877b)).a(obj, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(int i10, long j10) {
            ((n) ai.a(this.f7877b)).a(i10, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(long j10, int i10) {
            ((n) ai.a(this.f7877b)).a(j10, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(o oVar) {
            ((n) ai.a(this.f7877b)).a(oVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(v vVar, com.applovin.exoplayer2.c.h hVar) {
            ((n) ai.a(this.f7877b)).a_(vVar);
            ((n) ai.a(this.f7877b)).a(vVar, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(Exception exc) {
            ((n) ai.a(this.f7877b)).a(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(String str) {
            ((n) ai.a(this.f7877b)).a(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(String str, long j10, long j11) {
            ((n) ai.a(this.f7877b)).a(str, j10, j11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(com.applovin.exoplayer2.c.e eVar) {
            eVar.a();
            ((n) ai.a(this.f7877b)).b(eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(com.applovin.exoplayer2.c.e eVar) {
            ((n) ai.a(this.f7877b)).a(eVar);
        }

        public void a(int i10, long j10) {
            Handler handler = this.f7876a;
            if (handler != null) {
                handler.post(new p(this, i10, j10));
            }
        }

        public void a(long j10, int i10) {
            Handler handler = this.f7876a;
            if (handler != null) {
                handler.post(new p(this, j10, i10));
            }
        }

        public void a(com.applovin.exoplayer2.c.e eVar) {
            Handler handler = this.f7876a;
            if (handler != null) {
                handler.post(new q(this, eVar, 0));
            }
        }

        public void a(o oVar) {
            Handler handler = this.f7876a;
            if (handler != null) {
                handler.post(new s(this, oVar));
            }
        }

        public void a(v vVar, com.applovin.exoplayer2.c.h hVar) {
            Handler handler = this.f7876a;
            if (handler != null) {
                handler.post(new androidx.emoji2.text.f(this, vVar, hVar));
            }
        }

        public void a(Exception exc) {
            Handler handler = this.f7876a;
            if (handler != null) {
                handler.post(new s(this, exc));
            }
        }

        public void a(Object obj) {
            if (this.f7876a != null) {
                this.f7876a.post(new r(this, obj, SystemClock.elapsedRealtime()));
            }
        }

        public void a(String str) {
            Handler handler = this.f7876a;
            if (handler != null) {
                handler.post(new s(this, str));
            }
        }

        public void a(String str, long j10, long j11) {
            Handler handler = this.f7876a;
            if (handler != null) {
                handler.post(new d0(this, str, j10, j11));
            }
        }

        public void b(com.applovin.exoplayer2.c.e eVar) {
            eVar.a();
            Handler handler = this.f7876a;
            if (handler != null) {
                handler.post(new q(this, eVar, 1));
            }
        }
    }

    default void a(int i10, long j10) {
    }

    default void a(long j10, int i10) {
    }

    default void a(com.applovin.exoplayer2.c.e eVar) {
    }

    default void a(o oVar) {
    }

    default void a(v vVar, com.applovin.exoplayer2.c.h hVar) {
    }

    default void a(Exception exc) {
    }

    default void a(Object obj, long j10) {
    }

    default void a(String str) {
    }

    default void a(String str, long j10, long j11) {
    }

    @Deprecated
    default void a_(v vVar) {
    }

    default void b(com.applovin.exoplayer2.c.e eVar) {
    }
}
