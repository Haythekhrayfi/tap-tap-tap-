package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.exo.metadata.dvbsi.AppInfoTable;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class p9 extends r11 {
    @Override // com.yandex.mobile.ads.impl.r11
    public final Metadata a(ke0 ke0Var, ByteBuffer byteBuffer) {
        if (byteBuffer.get() != 116) {
            return null;
        }
        lp0 lp0Var = new lp0(byteBuffer.limit(), byteBuffer.array());
        lp0Var.d(12);
        int iD = (lp0Var.d() + lp0Var.b(12)) - 4;
        lp0Var.d(44);
        lp0Var.e(lp0Var.b(12));
        lp0Var.d(16);
        ArrayList arrayList = new ArrayList();
        while (lp0Var.d() < iD) {
            lp0Var.d(48);
            int iB = lp0Var.b(8);
            lp0Var.d(4);
            int iD2 = lp0Var.d() + lp0Var.b(12);
            String strA = null;
            String strA2 = null;
            while (lp0Var.d() < iD2) {
                int iB2 = lp0Var.b(8);
                int iB3 = lp0Var.b(8);
                int iD3 = lp0Var.d() + iB3;
                if (iB2 == 2) {
                    int iB4 = lp0Var.b(16);
                    lp0Var.d(8);
                    if (iB4 == 3) {
                        while (lp0Var.d() < iD3) {
                            strA = lp0Var.a(lp0Var.b(8), qh.f24494a);
                            int iB5 = lp0Var.b(8);
                            for (int i10 = 0; i10 < iB5; i10++) {
                                lp0Var.e(lp0Var.b(8));
                            }
                        }
                    }
                } else if (iB2 == 21) {
                    strA2 = lp0Var.a(iB3, qh.f24494a);
                }
                lp0Var.c(iD3 * 8);
            }
            lp0Var.c(iD2 * 8);
            if (strA != null && strA2 != null) {
                arrayList.add(new AppInfoTable(iB, fn1.a(strA, strA2)));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }
}
