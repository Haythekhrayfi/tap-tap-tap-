package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.telephony.CellIdentityLte;
import android.telephony.CellInfo;
import android.telephony.CellInfoLte;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.hk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(17)
public class C1690hk extends Qj<CellInfoLte> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC1839nk<CellIdentityLte> f16308c;

    public C1690hk() {
        this(U2.a(28) ? new C1938rk() : new C1914qk());
    }

    public C1690hk(InterfaceC1839nk<CellIdentityLte> interfaceC1839nk) {
        this.f16308c = interfaceC1839nk;
    }

    @Override // com.yandex.metrica.impl.ob.Qj
    public void b(CellInfo cellInfo, Vj.a aVar) {
        CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
        CellIdentityLte cellIdentity = cellInfoLte.getCellIdentity();
        aVar.a(4).b(Integer.valueOf(cellIdentity.getCi())).c(Integer.valueOf(cellIdentity.getTac())).k(Integer.valueOf(cellIdentity.getPci())).l(Integer.valueOf(cellInfoLte.getCellSignalStrength().getDbm())).i(this.f16308c.b(cellIdentity)).j(this.f16308c.a(cellIdentity));
    }

    @Override // com.yandex.metrica.impl.ob.Qj
    public void c(CellInfo cellInfo, Vj.a aVar) {
        CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
        if (U2.a(24)) {
            aVar.a(Integer.valueOf(C1590dk.a(cellInfoLte.getCellIdentity())));
        }
        if (U2.a(26)) {
            aVar.f(Integer.valueOf(C1615ek.b(cellInfoLte.getCellSignalStrength())));
            aVar.h(Integer.valueOf(C1615ek.c(cellInfoLte.getCellSignalStrength())));
            aVar.e(Integer.valueOf(C1615ek.a(cellInfoLte.getCellSignalStrength())));
        }
        if (U2.a(28)) {
            aVar.d(Integer.valueOf(C1640fk.a(cellInfoLte.getCellIdentity())));
        }
        if (U2.a(29)) {
            aVar.g(Integer.valueOf(C1665gk.a(cellInfoLte.getCellSignalStrength())));
        }
    }
}
