package com.google.android.play.core.assetpacks;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public final class p implements com.google.android.play.core.internal.cn<Executor> {
    public static Executor b() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(l.f12208a);
        com.google.android.play.core.internal.bq.b(executorServiceNewSingleThreadExecutor);
        return executorServiceNewSingleThreadExecutor;
    }

    @Override // com.google.android.play.core.internal.cn
    public final /* bridge */ /* synthetic */ Executor a() {
        return b();
    }
}
