package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.vh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2040vh implements InterfaceC1702i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ea.b f17707a;

    public C2040vh(ea.b bVar) {
        this.f17707a = bVar;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1702i7
    public void a(Throwable th, C1602e7 c1602e7) {
        this.f17707a.reportException(th == null ? "" : th.getClass().getName(), th);
    }
}
