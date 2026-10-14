package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.telephony.CellIdentityGsm;
import android.telephony.CellInfo;
import android.telephony.CellInfoGsm;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ck, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(17)
public class C1565ck extends Qj<CellInfoGsm> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC1839nk<CellIdentityGsm> f15891c;

    public C1565ck() {
        this(U2.a(28) ? new C1889pk() : new C1864ok());
    }

    public C1565ck(InterfaceC1839nk<CellIdentityGsm> interfaceC1839nk) {
        this.f15891c = interfaceC1839nk;
    }

    @Override // com.yandex.metrica.impl.ob.Qj
    public void b(CellInfo cellInfo, Vj.a aVar) {
        CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
        CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
        aVar.a(1).b(Integer.valueOf(cellIdentity.getCid())).c(Integer.valueOf(cellIdentity.getLac())).l(Integer.valueOf(cellInfoGsm.getCellSignalStrength().getDbm())).i(this.f15891c.b(cellIdentity)).j(this.f15891c.a(cellIdentity));
    }

    @Override // com.yandex.metrica.impl.ob.Qj
    public void c(CellInfo cellInfo, Vj.a aVar) {
        CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
        if (U2.a(24)) {
            aVar.a(Integer.valueOf(cellInfoGsm.getCellIdentity().getArfcn()));
        }
    }
}
