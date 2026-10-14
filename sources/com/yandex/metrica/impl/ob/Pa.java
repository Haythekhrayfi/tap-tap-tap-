package com.yandex.metrica.impl.ob;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
class Pa implements InterfaceC2106y8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2106y8 f14697a;

    public Pa(Context context, D8 d10, InterfaceC2106y8 interfaceC2106y8) {
        this.f14697a = interfaceC2106y8;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2106y8
    public void a(String str, byte[] bArr) {
        this.f14697a.a(str, bArr);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2106y8
    public byte[] a(String str) {
        return this.f14697a.a(str);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2106y8
    public void b(String str) {
        this.f14697a.b(str);
    }
}
