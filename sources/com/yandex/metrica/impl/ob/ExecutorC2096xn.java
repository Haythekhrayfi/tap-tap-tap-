package com.yandex.metrica.impl.ob;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.xn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class ExecutorC2096xn implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f17861a;

    public ExecutorC2096xn(C2121yn c2121yn, Handler handler) {
        this.f17861a = handler;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f17861a.post(runnable);
    }
}
