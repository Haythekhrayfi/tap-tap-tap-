package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;
import android.widget.MediaController;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class QL implements View.OnTouchListener {
    public static String[] A01 = {"mce3RnjQuKnQyZwY2MYCRKsU6qDPnRTv", "6i", "za", "wlJBNttigYYlx2yteY8tG49BlED6WsVY", "MVnjYKLYm17azeeTFPLJcrer3BwrjfHl", "3Wee1YLSMyRTxC38n8Qm6eLBL9IfF0GN", "3z6wLog4xxMob0RUOVoWJU4Ax22Nftgw", "VSwWIM7jHdG3nIkp1OJVw48UFn88gUH7"};
    public final /* synthetic */ TextureViewSurfaceTextureListenerC0941Ih A00;

    public QL(TextureViewSurfaceTextureListenerC0941Ih textureViewSurfaceTextureListenerC0941Ih) {
        this.A00 = textureViewSurfaceTextureListenerC0941Ih;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0059  */
    /* JADX WARN: Code duplicated, block: B:20:0x0076  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.A00.A0G) {
            return true;
        }
        MediaController mediaController = this.A00.A0A;
        String[] strArr = A01;
        if (strArr[4].charAt(0) == strArr[6].charAt(0)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[0] = "HvEVRWVu4b3A6ir0KswDbL9zFlDBl7Vo";
        strArr2[3] = "aSdZu49XGoInnb2I2ybBtqTd8GDfXNZF";
        if (mediaController != null && motionEvent.getAction() == 1) {
            MediaController mediaController2 = this.A00.A0A;
            if (A01[7].charAt(9) != 'o') {
                A01[5] = "PKAZCNEBQS248pKbgoN5vL2n8kWbkeSf";
                if (mediaController2.isShowing()) {
                    this.A00.A0A.hide();
                } else {
                    this.A00.A0A.show();
                }
            } else {
                String[] strArr3 = A01;
                strArr3[0] = "se9uNVwp2KR0SqcPH5E6zAp8mBDLV9kP";
                strArr3[3] = "7jkgWI5wEJtN4OtVk5f4fU2wMaDr3zYP";
                if (mediaController2.isShowing()) {
                    this.A00.A0A.hide();
                } else {
                    this.A00.A0A.show();
                }
            }
        }
        return true;
    }
}
