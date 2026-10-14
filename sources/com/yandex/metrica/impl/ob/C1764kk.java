package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.telephony.CellInfo;
import java.util.concurrent.TimeUnit;

/* JADX WARN: Unexpected interfaces in signature: [java.lang.Object<android.telephony.CellInfo>] */
/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.kk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(17)
public class C1764kk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Mm f16779a;

    public C1764kk() {
        this(new Mm());
    }

    public C1764kk(Mm mm) {
        this.f16779a = mm;
    }

    public void a(CellInfo cellInfo, Vj.a aVar) {
        long timeStamp = cellInfo.getTimeStamp();
        Long lValueOf = null;
        if (timeStamp > 0) {
            Mm mm = this.f16779a;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long jC = mm.c(timeStamp, timeUnit);
            if (jC > 0 && jC < TimeUnit.HOURS.toSeconds(1L)) {
                lValueOf = Long.valueOf(jC);
            }
            if (lValueOf == null) {
                long jA = this.f16779a.a(timeStamp, timeUnit);
                if (jA > 0 && jA < TimeUnit.HOURS.toSeconds(1L)) {
                    lValueOf = Long.valueOf(jA);
                }
            }
        }
        aVar.a(lValueOf).a(cellInfo.isRegistered());
    }
}
