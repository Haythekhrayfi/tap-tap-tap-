package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class PR implements View.OnTouchListener {
    public final /* synthetic */ RN A00;

    public PR(RN rn) {
        this.A00 = rn;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.A00.A0B.A02(new C1002Kv(view, motionEvent));
        return false;
    }
}
