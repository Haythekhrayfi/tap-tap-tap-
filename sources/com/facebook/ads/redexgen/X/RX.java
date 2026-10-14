package com.facebook.ads.redexgen.X;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class RX extends C1060Nb {
    public final ImageView A00;
    public final C1337Xw A01;

    public RX(C1337Xw c1337Xw) {
        super(c1337Xw);
        this.A01 = c1337Xw;
        ImageView imageView = new ImageView(c1337Xw);
        this.A00 = imageView;
        imageView.setAdjustViewBounds(true);
        addView(imageView, new RelativeLayout.LayoutParams(-2, -1));
    }

    public final void A00(String str) {
        AsyncTaskC1212Sx downloadImageTask = new AsyncTaskC1212Sx(this.A00, this.A01);
        downloadImageTask.A04();
        downloadImageTask.A07(str);
    }
}
