package com.facebook.ads.redexgen.X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class YI implements InterfaceC06305a {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ C06325c A01;
    public final /* synthetic */ U7 A02;

    public YI(C06325c c06325c, ImageView imageView, U7 u10) {
        this.A01 = c06325c;
        this.A00 = imageView;
        this.A02 = u10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06305a
    public final void ABN(Drawable drawable) {
        U7.A0e(drawable, this.A00);
        this.A02.A1J(drawable);
    }
}
