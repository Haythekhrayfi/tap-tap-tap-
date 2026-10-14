package com.facebook.ads.redexgen.X;

import android.graphics.drawable.ColorDrawable;
import com.facebook.ads.internal.api.AdCompanionView;
import com.facebook.ads.internal.api.AdCompanionViewApi;
import com.facebook.ads.internal.api.AdComponentViewApi;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1348Yh extends C5M implements AdCompanionViewApi {
    public static byte[] A05;
    public AbstractC1404aD A00;
    public AdCompanionView A01;
    public C1337Xw A02;
    public InterfaceC0937Id A03;
    public AnonymousClass93 A04;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 21);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{-120, -108, -110, 83, -117, -122, -120, -118, -121, -108, -108, -112, 83, -122, -119, -104, 83, -114, -109, -103, -118, -105, -104, -103, -114, -103, -114, -122, -111, 83, -120, -111, -114, -120, -112, -118, -119};
    }

    public final void A02() {
        this.A04 = null;
    }

    public final void A03(C1337Xw c1337Xw, AbstractC1404aD abstractC1404aD) {
        AdCompanionView adCompanionView = this.A01;
        if (adCompanionView == null) {
            return;
        }
        this.A02 = c1337Xw;
        this.A00 = abstractC1404aD;
        C3F.A0A(adCompanionView, new ColorDrawable(0));
        this.A03 = this.A02.A09();
        AnonymousClass93 anonymousClass93 = new AnonymousClass93(this.A02, this.A03, this.A00, A00(0, 37, 16), 3);
        this.A04 = anonymousClass93;
        this.A01.addView(anonymousClass93);
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewApiProvider
    public final AdComponentViewApi getAdComponentViewApi() {
        return this;
    }

    @Override // com.facebook.ads.internal.api.AdCompanionViewApi
    public final void initialize(AdCompanionView adCompanionView) {
        this.A01 = adCompanionView;
    }
}
