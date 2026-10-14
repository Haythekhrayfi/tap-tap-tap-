package com.yandex.mobile.ads.impl;

import android.os.Handler;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public interface ac {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f18835a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ac f18836b;

        public a(Handler handler, ac acVar) {
            this.f18835a = (Handler) pa.a(handler);
            this.f18836b = acVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i10, long j10, long j11) {
            ac acVar = this.f18836b;
            int i11 = da1.f19803a;
            acVar.a(i10, j10, j11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j10) {
            ac acVar = this.f18836b;
            int i10 = da1.f19803a;
            acVar.a(j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(boolean z10) {
            ac acVar = this.f18836b;
            int i10 = da1.f19803a;
            acVar.onSkipSilenceEnabledChanged(z10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(yv yvVar, cn cnVar) {
            ac acVar = this.f18836b;
            int i10 = da1.f19803a;
            Objects.requireNonNull(acVar);
            this.f18836b.a(yvVar, cnVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str) {
            ac acVar = this.f18836b;
            int i10 = da1.f19803a;
            acVar.b(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str, long j10, long j11) {
            ac acVar = this.f18836b;
            int i10 = da1.f19803a;
            acVar.b(str, j10, j11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(ym ymVar) {
            synchronized (ymVar) {
            }
            ac acVar = this.f18836b;
            int i10 = da1.f19803a;
            acVar.a(ymVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(Exception exc) {
            ac acVar = this.f18836b;
            int i10 = da1.f19803a;
            acVar.b(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(ym ymVar) {
            ac acVar = this.f18836b;
            int i10 = da1.f19803a;
            acVar.b(ymVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(Exception exc) {
            ac acVar = this.f18836b;
            int i10 = da1.f19803a;
            acVar.a(exc);
        }

        public final void a(ym ymVar) {
            synchronized (ymVar) {
            }
            Handler handler = this.f18835a;
            if (handler != null) {
                handler.post(new it(this, ymVar, 1));
            }
        }

        public final void a(yv yvVar, cn cnVar) {
            Handler handler = this.f18835a;
            if (handler != null) {
                handler.post(new ap1(this, yvVar, cnVar));
            }
        }

        public final void a(Exception exc) {
            Handler handler = this.f18835a;
            if (handler != null) {
                handler.post(new by(this, exc, 0));
            }
        }

        public final void a(String str) {
            Handler handler = this.f18835a;
            if (handler != null) {
                handler.post(new do1(this, str));
            }
        }

        public final void a(String str, long j10, long j11) {
            Handler handler = this.f18835a;
            if (handler != null) {
                handler.post(new com.applovin.exoplayer2.b.d0(this, str, j10, j11));
            }
        }

        public final void b(int i10, long j10, long j11) {
            Handler handler = this.f18835a;
            if (handler != null) {
                handler.post(new on1(this, i10, j10, j11));
            }
        }

        public final void b(long j10) {
            Handler handler = this.f18835a;
            if (handler != null) {
                handler.post(new com.applovin.exoplayer2.b.c0(this, j10));
            }
        }

        public final void b(ym ymVar) {
            Handler handler = this.f18835a;
            if (handler != null) {
                handler.post(new it(this, ymVar, 0));
            }
        }

        public final void b(Exception exc) {
            Handler handler = this.f18835a;
            if (handler != null) {
                handler.post(new by(this, exc, 1));
            }
        }

        public final void b(boolean z10) {
            Handler handler = this.f18835a;
            if (handler != null) {
                handler.post(new com.applovin.exoplayer2.b.e0(this, z10));
            }
        }
    }

    default void a(int i10, long j10, long j11) {
    }

    default void a(long j10) {
    }

    default void a(ym ymVar) {
    }

    default void a(yv yvVar, cn cnVar) {
    }

    default void a(Exception exc) {
    }

    default void b(ym ymVar) {
    }

    default void b(Exception exc) {
    }

    default void b(String str) {
    }

    default void b(String str, long j10, long j11) {
    }

    default void onSkipSilenceEnabledChanged(boolean z10) {
    }
}
