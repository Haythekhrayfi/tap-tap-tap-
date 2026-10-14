package com.yandex.metrica.impl.ob;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
class Cm implements Callable<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Dm f13778a;

    public Cm(Dm dm) {
        this.f13778a = dm;
    }

    @Override // java.util.concurrent.Callable
    public String call() throws Exception {
        return this.f13778a.a();
    }
}
