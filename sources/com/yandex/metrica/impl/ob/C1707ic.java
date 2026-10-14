package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ic, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1707ic {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile C1682hc f16336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CountDownLatch f16337b = new CountDownLatch(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f16338c = 20;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final z9.a f16339d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f16340e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final z9.d f16341f;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ic$a */
    public static final class a implements z9.a {
        public a() {
        }

        @Override // z9.a
        public void a(String str, z9.c cVar) {
            C1707ic.this.f16336a = new C1682hc(str, cVar);
            C1707ic.this.f16337b.countDown();
        }

        @Override // z9.a
        public void a(Throwable th) {
            C1707ic.this.f16337b.countDown();
        }
    }

    public C1707ic(Context context, z9.d dVar) {
        this.f16340e = context;
        this.f16341f = dVar;
    }

    public final synchronized C1682hc a() {
        C1682hc c1682hc;
        if (this.f16336a == null) {
            try {
                this.f16337b = new CountDownLatch(1);
                this.f16341f.a(this.f16340e, this.f16339d);
                this.f16337b.await(this.f16338c, TimeUnit.SECONDS);
            } catch (Throwable unused) {
            }
        }
        c1682hc = this.f16336a;
        if (c1682hc == null) {
            c1682hc = new C1682hc(null, z9.c.UNKNOWN);
            this.f16336a = c1682hc;
        }
        return c1682hc;
    }
}
