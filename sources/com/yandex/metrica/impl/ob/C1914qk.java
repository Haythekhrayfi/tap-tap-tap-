package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.telephony.CellIdentityLte;
import com.yandex.metrica.DoNotInline;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.qk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(17)
@DoNotInline
public final class C1914qk implements InterfaceC1839nk<CellIdentityLte> {
    @Override // com.yandex.metrica.impl.ob.InterfaceC1839nk
    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public Integer b(CellIdentityLte cellIdentityLte) {
        return Integer.valueOf(cellIdentityLte.getMcc());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1839nk
    /* JADX INFO: renamed from: b, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public Integer a(CellIdentityLte cellIdentityLte) {
        return Integer.valueOf(cellIdentityLte.getMnc());
    }
}
