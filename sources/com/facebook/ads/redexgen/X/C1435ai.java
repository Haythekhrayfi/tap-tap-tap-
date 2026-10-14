package com.facebook.ads.redexgen.X;

import java.util.Collection;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ai, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1435ai implements InterfaceC05130j {
    public final /* synthetic */ C1337Xw A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ JSONObject A02;

    public C1435ai(JSONObject jSONObject, C1337Xw c1337Xw, String str) {
        this.A02 = jSONObject;
        this.A00 = c1337Xw;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05130j
    public final String A6M() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05130j
    public final Collection<String> A6f() {
        return C05140k.A03(this.A00, this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05130j
    public final EnumC05120i A76() {
        return C05140k.A00(this.A02);
    }
}
