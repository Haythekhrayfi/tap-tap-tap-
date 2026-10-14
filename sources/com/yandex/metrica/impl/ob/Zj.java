package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.os.Parcelable;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(17)
public class Zj implements InterfaceC1495a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1764kk f15695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Qj<CellInfoGsm> f15696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Qj<CellInfoCdma> f15697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Qj<CellInfoLte> f15698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Qj<CellInfo> f15699e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC1495a0[] f15700f;

    public Zj() {
        this(new C1540bk());
    }

    private Zj(Qj<CellInfo> qj) {
        this(new C1764kk(), new C1565ck(), new C1515ak(), new C1690hk(), U2.a(18) ? new C1714ik() : qj);
    }

    public Zj(C1764kk c1764kk, Qj<CellInfoGsm> qj, Qj<CellInfoCdma> qj2, Qj<CellInfoLte> qj3, Qj<CellInfo> qj4) {
        this.f15695a = c1764kk;
        this.f15696b = qj;
        this.f15697c = qj2;
        this.f15698d = qj3;
        this.f15699e = qj4;
        this.f15700f = new InterfaceC1495a0[]{qj, qj2, qj4, qj3};
    }

    public void a(CellInfo cellInfo, Vj.a aVar) {
        Qj qj;
        Parcelable parcelable;
        this.f15695a.a(cellInfo, aVar);
        if (cellInfo instanceof CellInfoGsm) {
            qj = this.f15696b;
            parcelable = (CellInfoGsm) cellInfo;
        } else if (cellInfo instanceof CellInfoCdma) {
            qj = this.f15697c;
            parcelable = (CellInfoCdma) cellInfo;
        } else if (cellInfo instanceof CellInfoLte) {
            qj = this.f15698d;
            parcelable = (CellInfoLte) cellInfo;
        } else {
            if (!U2.a(18) || !(cellInfo instanceof CellInfoWcdma)) {
                return;
            }
            qj = this.f15699e;
            parcelable = (CellInfoWcdma) cellInfo;
        }
        qj.a(parcelable, aVar);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1495a0
    public void a(C1961si c1961si) {
        for (InterfaceC1495a0 interfaceC1495a0 : this.f15700f) {
            interfaceC1495a0.a(c1961si);
        }
    }
}
