package com.yandex.metrica.impl.ob;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.on, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class ExecutorC1867on implements Executor {
    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }
}
