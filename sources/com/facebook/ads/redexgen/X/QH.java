package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class QH implements View.OnTouchListener {
    public final /* synthetic */ TextureViewSurfaceTextureListenerC0943Ij A00;

    public QH(TextureViewSurfaceTextureListenerC0943Ij textureViewSurfaceTextureListenerC0943Ij) {
        this.A00 = textureViewSurfaceTextureListenerC0943Ij;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.A00.A09 != null && motionEvent.getAction() == 1) {
            if (this.A00.A09.isShowing()) {
                this.A00.A09.hide();
            } else {
                this.A00.A09.show();
            }
        }
        return true;
    }
}
