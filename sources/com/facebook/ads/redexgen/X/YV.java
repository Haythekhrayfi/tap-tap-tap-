package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.ads.NativeAd;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class YV implements OM {
    public final /* synthetic */ NativeAd A00;
    public final /* synthetic */ YQ A01;
    public final /* synthetic */ U7 A02;

    public YV(YQ yq, U7 u10, NativeAd nativeAd) {
        this.A01 = yq;
        this.A02 = u10;
        this.A00 = nativeAd;
    }

    @Override // com.facebook.ads.redexgen.X.OM
    public final void A95() {
    }

    @Override // com.facebook.ads.redexgen.X.OM
    public final void AB3(AnonymousClass93 anonymousClass93) {
        new Handler(Looper.getMainLooper()).postDelayed(new YW(this, anonymousClass93), 1L);
    }

    @Override // com.facebook.ads.redexgen.X.OM
    public final void ABI() {
        if (this.A01.A0A != null) {
            this.A01.A0A.A08();
        }
    }

    @Override // com.facebook.ads.redexgen.X.OM
    public final void AD0(View view, MotionEvent motionEvent) throws Throwable {
        this.A02.A19().A06(this.A01.A07, motionEvent, view, view);
        if (motionEvent.getAction() == 1 && !this.A01.A0J(this.A00) && this.A02.A12() != null) {
            this.A02.A12().onClick(view);
        }
    }
}
