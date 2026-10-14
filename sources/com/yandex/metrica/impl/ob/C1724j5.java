package com.yandex.metrica.impl.ob;

import android.os.Bundle;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.j5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1724j5 extends AbstractC1675h5 {
    public C1724j5(Z3 z10) {
        super(z10);
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1675h5
    public boolean a(C1744k0 c1744k0, H4 h10) {
        Bundle bundleK = c1744k0.k();
        a().a(bundleK != null ? (C1621f1) bundleK.getParcelable("com.yandex.metrica.impl.IdentifiersData") : null);
        return false;
    }
}
