package com.yandex.metrica.billing_interface;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements Runnable {
    public abstract void a() throws Throwable;

    @Override // java.lang.Runnable
    public void run() {
        try {
            a();
        } catch (Throwable unused) {
        }
    }
}
