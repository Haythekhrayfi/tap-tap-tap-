package com.yandex.metrica.impl.ob;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class I5 extends AbstractC1948s5 {
    public I5(C1624f4 c1624f4) {
        super(c1624f4);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1824n5
    public boolean a(C1744k0 c1744k0) {
        String strL = c1744k0.l();
        if (TextUtils.isEmpty(strL)) {
            return false;
        }
        a().b(strL);
        return false;
    }
}
