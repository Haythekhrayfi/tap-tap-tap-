package com.yandex.mobile.ads.impl;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class q9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f24370a;

    public interface a {
        void a(String str);

        void b(String str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ q9() {
        Executor executorB = a90.a().b();
        fd.j0.h(executorB, "getInstance().loadingExecutor");
        this(executorB);
    }

    public q9(Executor executor) {
        fd.j0.i(executor, "executor");
        this.f24370a = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(a aVar) {
        fd.j0.i(aVar, "$listener");
        try {
            com.yandex.metrica.p.guc(new ic(aVar), true);
        } catch (Throwable th) {
            aVar.b(th.getMessage());
        }
    }

    public final void a(a aVar) {
        fd.j0.i(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f24370a.execute(new pp1(aVar));
    }
}
