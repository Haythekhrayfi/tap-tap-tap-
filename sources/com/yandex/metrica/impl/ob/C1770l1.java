package com.yandex.metrica.impl.ob;

import android.os.Handler;
import android.os.SystemClock;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.l1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1770l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f16784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final J f16785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RunnableC1795m1 f16786c;

    public C1770l1(Handler handler, J j10) {
        this.f16784a = handler;
        this.f16785b = j10;
        this.f16786c = new RunnableC1795m1(handler, j10);
    }

    public static void a(Handler handler, J j10, Runnable runnable) {
        handler.removeCallbacks(runnable, j10.f14245b.b().c());
        String strC = j10.f14245b.b().c();
        long jUptimeMillis = SystemClock.uptimeMillis();
        Integer asInteger = j10.f14245b.b().f13444c.getAsInteger("CFG_SESSION_TIMEOUT");
        if (asInteger == null) {
            asInteger = 10;
        }
        handler.postAtTime(runnable, strC, jUptimeMillis + ((long) (asInteger.intValue() * 500)));
    }

    public void a() {
        this.f16784a.removeCallbacks(this.f16786c, this.f16785b.f14245b.b().c());
    }

    public void b() {
        a(this.f16784a, this.f16785b, this.f16786c);
    }
}
