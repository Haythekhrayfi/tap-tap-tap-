package com.yandex.mobile.ads.impl;

import android.widget.TextView;
import com.yandex.mobile.ads.fullscreen.template.view.ExtendedTextView;
import com.yandex.mobile.ads.video.playback.view.VideoAdControlsContainer;

/* JADX INFO: loaded from: classes3.dex */
public final class qi1 implements u40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qa<?> f24516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ua f24517b;

    public qi1(qa<?> qaVar, ua uaVar) {
        fd.j0.i(uaVar, "assetClickConfigurator");
        this.f24516a = qaVar;
        this.f24517b = uaVar;
    }

    @Override // com.yandex.mobile.ads.impl.u40
    public final void a(fc1 fc1Var) {
        fd.j0.i(fc1Var, "uiElements");
        TextView textViewQ = fc1Var.q();
        qa<?> qaVar = this.f24516a;
        Object objD = qaVar != null ? qaVar.d() : null;
        if (!(textViewQ instanceof ExtendedTextView) || !(objD instanceof String)) {
            if (textViewQ == null) {
                return;
            }
            textViewQ.setVisibility(8);
            return;
        }
        VideoAdControlsContainer videoAdControlsContainerA = fc1Var.a();
        fd.j0.h(videoAdControlsContainerA, "uiElements.adControlsContainer");
        dv dvVar = new dv(videoAdControlsContainerA);
        ExtendedTextView extendedTextView = (ExtendedTextView) textViewQ;
        extendedTextView.setText((CharSequence) objD);
        extendedTextView.setVisibility(0);
        extendedTextView.setAutoSizeTextType(1);
        extendedTextView.setMeasureSpecProvider(dvVar);
        this.f24517b.a(textViewQ, this.f24516a);
    }
}
