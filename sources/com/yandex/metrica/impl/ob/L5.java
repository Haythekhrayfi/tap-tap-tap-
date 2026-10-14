package com.yandex.metrica.impl.ob;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class L5 extends AbstractC1948s5 {
    public L5(C1624f4 c1624f4) {
        super(c1624f4);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1824n5
    public boolean a(C1744k0 c1744k0) {
        String strP = a().p();
        String strL = c1744k0.l();
        a().b(strL);
        if (TextUtils.equals(strP, strL)) {
            return false;
        }
        a().a(S.r());
        return false;
    }
}
