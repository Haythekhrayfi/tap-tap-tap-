package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public class An extends ExecutorC1867on {
    @Override // com.yandex.metrica.impl.ob.ExecutorC1867on, java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }
}
