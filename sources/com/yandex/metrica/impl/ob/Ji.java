package com.yandex.metrica.impl.ob;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
class Ji implements ResultReceiverC1819n0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2116yi f14322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ii f14323b;

    public Ji(Ii ii, InterfaceC2116yi interfaceC2116yi) {
        this.f14323b = ii;
        this.f14322a = interfaceC2116yi;
    }

    @Override // com.yandex.metrica.impl.ob.ResultReceiverC1819n0.a
    public void a(int i10, Bundle bundle) {
        this.f14323b.a(bundle, this.f14322a);
    }
}
