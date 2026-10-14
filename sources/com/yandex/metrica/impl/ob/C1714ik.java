package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoWcdma;
import com.yandex.metrica.DoNotInline;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ik, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(18)
@DoNotInline
public class C1714ik extends Qj<CellInfo> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC1839nk<CellIdentityWcdma> f16358c;

    public C1714ik() {
        this(U2.a(28) ? new C1988tk() : new C1963sk());
    }

    public C1714ik(InterfaceC1839nk<CellIdentityWcdma> interfaceC1839nk) {
        this.f16358c = interfaceC1839nk;
    }

    @Override // com.yandex.metrica.impl.ob.Qj
    public void b(CellInfo cellInfo, Vj.a aVar) {
        CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
        CellIdentityWcdma cellIdentity = cellInfoWcdma.getCellIdentity();
        aVar.a(3).b(Integer.valueOf(cellIdentity.getCid())).c(Integer.valueOf(cellIdentity.getLac())).k(Integer.valueOf(cellIdentity.getPsc())).l(Integer.valueOf(cellInfoWcdma.getCellSignalStrength().getDbm())).i(this.f16358c.b(cellIdentity)).j(this.f16358c.a(cellIdentity));
    }

    @Override // com.yandex.metrica.impl.ob.Qj
    public void c(CellInfo cellInfo, Vj.a aVar) {
        if (U2.a(24)) {
            aVar.a(Integer.valueOf(C1590dk.a(((CellInfoWcdma) cellInfo).getCellIdentity())));
        }
    }
}
