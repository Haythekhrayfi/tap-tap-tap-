package com.yandex.metrica.impl.ob;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class H5 extends AbstractC1948s5 {
    public H5(C1624f4 c1624f4) {
        super(c1624f4);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1824n5
    public boolean a(C1744k0 c1744k0) {
        if (!TextUtils.isEmpty(c1744k0.o()) && TextUtils.isEmpty(a().h())) {
            a().a(c1744k0.o());
        }
        return false;
    }
}
