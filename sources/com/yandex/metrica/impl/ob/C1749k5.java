package com.yandex.metrica.impl.ob;

import android.os.Bundle;
import android.os.ResultReceiver;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.k5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1749k5 extends AbstractC1675h5 {
    public C1749k5(Z3 z10) {
        super(z10);
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1675h5
    public boolean a(C1744k0 c1744k0, H4 h10) {
        Bundle bundleK = c1744k0.k();
        a().a(bundleK != null ? (ResultReceiver) bundleK.getParcelable("com.yandex.metrica.impl.referrer.common.ReferrerResultReceiver") : null);
        return false;
    }
}
