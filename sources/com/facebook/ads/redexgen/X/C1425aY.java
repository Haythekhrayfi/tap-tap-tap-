package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1425aY implements OM {
    public final /* synthetic */ C1422aV A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.OM
    public final void A95() {
        String strA00 = this.A00.A02.A0q().A00();
        if (TextUtils.isEmpty(strA00)) {
            return;
        }
        KV.A0L(new KV(), this.A00.A03, KW.A00(strA00), this.A00.A6M());
    }

    public C1425aY(C1422aV c1422aV) {
        this.A00 = c1422aV;
    }

    @Override // com.facebook.ads.redexgen.X.OM
    public final void AB3(AnonymousClass93 anonymousClass93) {
        new Handler(Looper.getMainLooper()).postDelayed(new C1426aZ(this, anonymousClass93), 1L);
    }

    @Override // com.facebook.ads.redexgen.X.OM
    public final void ABI() {
    }

    @Override // com.facebook.ads.redexgen.X.OM
    public final void AD0(View view, MotionEvent motionEvent) {
    }
}
