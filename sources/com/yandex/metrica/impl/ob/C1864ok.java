package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.telephony.CellIdentityGsm;
import com.yandex.metrica.DoNotInline;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ok, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(17)
@DoNotInline
public final class C1864ok implements InterfaceC1839nk<CellIdentityGsm> {
    @Override // com.yandex.metrica.impl.ob.InterfaceC1839nk
    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public Integer b(CellIdentityGsm cellIdentityGsm) {
        return Integer.valueOf(cellIdentityGsm.getMcc());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1839nk
    /* JADX INFO: renamed from: b, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public Integer a(CellIdentityGsm cellIdentityGsm) {
        return Integer.valueOf(cellIdentityGsm.getMnc());
    }
}
