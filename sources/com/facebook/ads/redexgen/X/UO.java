package com.facebook.ads.redexgen.X;

import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class UO implements InterfaceC0956Iw {
    public final /* synthetic */ MediaViewVideoRendererApi A00;
    public final /* synthetic */ UJ A01;

    public UO(UJ uj, MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        this.A01 = uj;
        this.A00 = mediaViewVideoRendererApi;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0956Iw
    public final void AF7() {
        this.A00.setVolume(1.0f);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0956Iw
    public final void AFC(NativeAd nativeAd) {
        this.A01.A0I(U7.A0L(nativeAd.getInternalNativeAd()), new UK(U7.A0L(nativeAd.getInternalNativeAd())));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0956Iw
    public final void AFr() {
        this.A01.A0D();
    }
}
