package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1164Rb extends QQ {
    public final /* synthetic */ InterfaceC0937Id A00;
    public final /* synthetic */ LG A01;
    public final /* synthetic */ P2 A02;
    public final /* synthetic */ RZ A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public C1164Rb(RZ rz, String str, P2 p10, InterfaceC0937Id interfaceC0937Id, Map map, LG lg) {
        this.A03 = rz;
        this.A04 = str;
        this.A02 = p10;
        this.A00 = interfaceC0937Id;
        this.A05 = map;
        this.A01 = lg;
    }

    @Override // com.facebook.ads.redexgen.X.QQ
    public final void A03() {
        if (!this.A03.A01.A0Z() && !TextUtils.isEmpty(this.A04) && !this.A03.A07.get(this.A02.A02())) {
            this.A00.A9P(this.A04, new ND(this.A05).A03(this.A03.A02).A02(this.A01).A05());
            this.A03.A07.put(this.A02.A02(), true);
        }
    }
}
