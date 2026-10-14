package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.telephony.CellIdentityWcdma;
import com.yandex.metrica.DoNotInline;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.sk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(18)
@DoNotInline
public final class C1963sk implements InterfaceC1839nk<CellIdentityWcdma> {
    @Override // com.yandex.metrica.impl.ob.InterfaceC1839nk
    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public Integer b(CellIdentityWcdma cellIdentityWcdma) {
        return Integer.valueOf(cellIdentityWcdma.getMcc());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1839nk
    /* JADX INFO: renamed from: b, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public Integer a(CellIdentityWcdma cellIdentityWcdma) {
        return Integer.valueOf(cellIdentityWcdma.getMnc());
    }
}
