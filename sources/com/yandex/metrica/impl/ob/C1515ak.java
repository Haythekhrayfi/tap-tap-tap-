package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ak, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(17)
public class C1515ak extends Qj<CellInfoCdma> {
    @Override // com.yandex.metrica.impl.ob.Qj
    public void b(CellInfo cellInfo, Vj.a aVar) {
        aVar.l(Integer.valueOf(((CellInfoCdma) cellInfo).getCellSignalStrength().getDbm()));
        aVar.a(2);
    }

    @Override // com.yandex.metrica.impl.ob.Qj
    public void c(CellInfo cellInfo, Vj.a aVar) {
    }
}
