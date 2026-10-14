package com.facebook.ads.redexgen.X;

import com.facebook.ads.MediaViewListener;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class YR implements InterfaceC1028Lv {
    public final /* synthetic */ MediaViewListener A00;
    public final /* synthetic */ YQ A01;

    public YR(YQ yq, MediaViewListener mediaViewListener) {
        this.A01 = yq;
        this.A00 = mediaViewListener;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1028Lv
    public final void AAi() {
        this.A00.onComplete(this.A01.A03);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1028Lv
    public final void AB4() {
        this.A00.onEnterFullscreen(this.A01.A03);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1028Lv
    public final void ABA() {
        this.A00.onExitFullscreen(this.A01.A03);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1028Lv
    public final void ABH() {
        this.A00.onFullscreenBackground(this.A01.A03);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1028Lv
    public final void ABJ() {
        this.A00.onFullscreenForeground(this.A01.A03);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1028Lv
    public final void ACA() {
        this.A00.onPlay(this.A01.A03);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1028Lv
    public final void ADN() {
        this.A00.onVolumeChange(this.A01.A03, this.A01.A05.getVolume());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1028Lv
    public final void onPause() {
        this.A00.onPause(this.A01.A03);
    }
}
