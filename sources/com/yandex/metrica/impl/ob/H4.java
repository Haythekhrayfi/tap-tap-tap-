package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Bundle;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes.dex */
public class H4 implements T, E4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Z3 f14122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ResultReceiver f14123b;

    public H4(Context context, Z3 z10, X3 x10) {
        this.f14122a = z10;
        this.f14123b = x10.f15448c;
        z10.a(this);
    }

    @Override // com.yandex.metrica.impl.ob.E4
    public void a() {
        this.f14122a.b(this);
    }

    @Override // com.yandex.metrica.impl.ob.T
    public void a(U u10) {
        ResultReceiver resultReceiver = this.f14123b;
        int i10 = ResultReceiverC1819n0.f16905b;
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            u10.c(bundle);
            resultReceiver.send(1, bundle);
        }
    }

    @Override // com.yandex.metrica.impl.ob.E4
    public void a(C1744k0 c1744k0, X3 x10) {
        this.f14122a.a(x10.f15447b);
        this.f14122a.a(c1744k0, this);
    }

    public Z3 b() {
        return this.f14122a;
    }
}
