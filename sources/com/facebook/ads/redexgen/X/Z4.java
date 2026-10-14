package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class Z4 implements InterfaceC05883i {
    public final /* synthetic */ EG A00;
    public final /* synthetic */ C05863g A01;

    public Z4(EG eg, C05863g c05863g) {
        this.A00 = eg;
        this.A01 = c05863g;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05883i
    public final Object A4S(int i10) {
        C05843e compatInfo = this.A01.A00(i10);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.A0M();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05883i
    public final List<Object> A5b(String str, int i10) {
        List<C05843e> listA03 = this.A01.A03(str, i10);
        if (listA03 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int infoCount = listA03.size();
        for (int i11 = 0; i11 < infoCount; i11++) {
            arrayList.add(listA03.get(i11).A0M());
        }
        return arrayList;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05883i
    public final boolean ADc(int i10, int i11, Bundle bundle) {
        return this.A01.A04(i10, i11, bundle);
    }
}
