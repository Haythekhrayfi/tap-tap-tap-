package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.telephony.CellSignalStrengthLte;
import com.yandex.metrica.DoNotInline;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.gk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(29)
@DoNotInline
public final class C1665gk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1665gk f16228a = new C1665gk();

    private C1665gk() {
    }

    public static final int a(CellSignalStrengthLte cellSignalStrengthLte) {
        return cellSignalStrengthLte.getRssi();
    }
}
