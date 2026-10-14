package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Im, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnAttachStateChangeListenerC0946Im implements View.OnAttachStateChangeListener {
    public final /* synthetic */ EnumC0944Ik A00;
    public final /* synthetic */ C0945Il A01;

    public ViewOnAttachStateChangeListenerC0946Im(C0945Il c0945Il, EnumC0944Ik enumC0944Ik) {
        this.A01 = c0945Il;
        this.A00 = enumC0944Ik;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.A01.A04(this.A00, null);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
