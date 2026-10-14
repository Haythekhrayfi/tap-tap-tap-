package com.yandex.mobile.ads.impl;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes3.dex */
public final class zy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bz f27444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final yy f27445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f27446c;

    public final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final az f27447b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ zy f27448c;

        public a(zy zyVar, az azVar) {
            fd.j0.i(azVar, "mHostAccessAdBlockerDetectorListener");
            this.f27448c = zyVar;
            this.f27447b = azVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Boolean boolA;
            try {
                boolA = zy.a(this.f27448c);
            } catch (Throwable th) {
                x60.a(th, th.getMessage(), new Object[0]);
                boolA = null;
            }
            this.f27447b.a(boolA);
        }
    }

    public /* synthetic */ zy() {
        bz bzVar = new bz();
        yy yyVar = new yy();
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        fd.j0.h(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor()");
        this(bzVar, yyVar, executorServiceNewSingleThreadExecutor);
    }

    public zy(bz bzVar, yy yyVar, Executor executor) {
        fd.j0.i(bzVar, "hostAccessCheckRequester");
        fd.j0.i(yyVar, "hostAccessAdBlockerDetectionValidator");
        fd.j0.i(executor, "singleThreadExecutor");
        this.f27444a = bzVar;
        this.f27445b = yyVar;
        this.f27446c = executor;
    }

    public static final Boolean a(zy zyVar) {
        Objects.requireNonNull(zyVar.f27444a);
        FutureTask futureTaskA = bz.a("yandex.ru");
        Objects.requireNonNull(zyVar.f27444a);
        FutureTask futureTaskA2 = bz.a("mobile.yandexadexchange.net");
        boolean zA = ((cz) futureTaskA.get()).a();
        boolean zA2 = ((cz) futureTaskA2.get()).a();
        Objects.requireNonNull(zyVar.f27445b);
        if (!zA2 && zA) {
            return Boolean.TRUE;
        }
        if (zA2 || zA) {
            return Boolean.FALSE;
        }
        return null;
    }

    public final void a(az azVar) {
        fd.j0.i(azVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f27446c.execute(new a(this, azVar));
    }
}
