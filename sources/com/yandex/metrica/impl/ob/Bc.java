package com.yandex.metrica.impl.ob;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class Bc<T> implements InterfaceC2085xc<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceExecutorC1966sn f13717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Runnable f13718b;

    public Bc(InterfaceExecutorC1966sn interfaceExecutorC1966sn) {
        this.f13717a = interfaceExecutorC1966sn;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2085xc
    public void a() {
        Runnable runnable = this.f13718b;
        if (runnable != null) {
            ((C1941rn) this.f13717a).a(runnable);
            this.f13718b = null;
        }
    }

    public void a(Runnable runnable, long j10) {
        ((C1941rn) this.f13717a).a(runnable, j10, TimeUnit.SECONDS);
        this.f13718b = runnable;
    }
}
