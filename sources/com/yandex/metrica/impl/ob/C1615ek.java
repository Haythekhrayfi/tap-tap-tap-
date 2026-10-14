package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.telephony.CellSignalStrengthLte;
import com.yandex.metrica.DoNotInline;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ek, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(26)
@DoNotInline
public final class C1615ek {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1615ek f16070a = new C1615ek();

    private C1615ek() {
    }

    public static final int a(CellSignalStrengthLte cellSignalStrengthLte) {
        return cellSignalStrengthLte.getCqi();
    }

    public static final int b(CellSignalStrengthLte cellSignalStrengthLte) {
        return cellSignalStrengthLte.getRsrq();
    }

    public static final int c(CellSignalStrengthLte cellSignalStrengthLte) {
        return cellSignalStrengthLte.getRssnr();
    }
}
