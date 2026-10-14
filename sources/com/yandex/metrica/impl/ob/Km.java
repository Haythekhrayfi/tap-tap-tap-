package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public abstract class Km implements Runnable {
    public abstract void a() throws Exception;

    @Override // java.lang.Runnable
    public void run() {
        try {
            a();
        } catch (Throwable unused) {
        }
    }
}
