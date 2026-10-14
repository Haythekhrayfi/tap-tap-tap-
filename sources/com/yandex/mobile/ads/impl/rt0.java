package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.ImpressionData;

/* JADX INFO: loaded from: classes3.dex */
public final class rt0 implements yw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private yw f24873a;

    @Override // com.yandex.mobile.ads.impl.yw
    public final void a() {
        yw ywVar = this.f24873a;
        if (ywVar != null) {
            ywVar.a();
        }
    }

    public final void a(yw ywVar) {
        fd.j0.i(ywVar, "showEventListener");
        this.f24873a = ywVar;
    }

    @Override // com.yandex.mobile.ads.impl.yw
    public final void onAdClicked() {
        yw ywVar = this.f24873a;
        if (ywVar != null) {
            ywVar.onAdClicked();
        }
    }

    @Override // com.yandex.mobile.ads.impl.yw
    public final void onAdDismissed() {
        yw ywVar = this.f24873a;
        if (ywVar != null) {
            ywVar.onAdDismissed();
        }
    }

    @Override // com.yandex.mobile.ads.impl.yw
    public final void onAdShown() {
        yw ywVar = this.f24873a;
        if (ywVar != null) {
            ywVar.onAdShown();
        }
    }

    @Override // com.yandex.mobile.ads.impl.yw
    public final void onImpression(ImpressionData impressionData) {
        yw ywVar = this.f24873a;
        if (ywVar != null) {
            ywVar.onImpression(impressionData);
        }
    }
}
