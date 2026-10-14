package com.yandex.metrica.impl.ob;

import android.os.Handler;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class Oj implements InterfaceC1546c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f14652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceExecutorC1966sn f14653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceExecutorC1966sn f14654c;

    public Oj(InterfaceExecutorC1966sn interfaceExecutorC1966sn, Handler handler, InterfaceExecutorC1966sn interfaceExecutorC1966sn2, Z z10) {
        this.f14653b = interfaceExecutorC1966sn;
        this.f14652a = handler;
        this.f14654c = interfaceExecutorC1966sn2;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1546c1
    public C a() {
        return new C(this.f14654c);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1546c1
    public void a(com.yandex.metrica.j jVar, Y0 y10) {
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1546c1
    public void a(Map<String, Object> map) {
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1546c1
    public InterfaceExecutorC1966sn b() {
        return this.f14653b;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1546c1
    public Handler c() {
        return this.f14652a;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1546c1
    public InterfaceC1781lc d() {
        return new C1632fc();
    }
}
