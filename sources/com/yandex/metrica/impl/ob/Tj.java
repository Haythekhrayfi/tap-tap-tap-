package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.telephony.CellInfo;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(17)
public class Tj implements InterfaceC1814mk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Zj f15109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Yj f15110b;

    public Tj() {
        this(new Zj(), new Yj());
    }

    public Tj(Zj zj, Yj yj) {
        this.f15109a = zj;
        this.f15110b = yj;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1814mk
    public Vj a(CellInfo cellInfo) {
        Vj.a aVar = new Vj.a();
        this.f15109a.a(cellInfo, aVar);
        return this.f15110b.a(new Vj(aVar));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1495a0
    public void a(C1961si c1961si) {
        this.f15109a.a(c1961si);
    }
}
