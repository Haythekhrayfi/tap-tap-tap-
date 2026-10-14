package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1321Xg implements InterfaceC0977Ju {
    @Override // com.facebook.ads.redexgen.X.InterfaceC0977Ju
    public final void AER(Throwable th, Object obj) {
        if (obj instanceof C7N) {
            C1337Xw adContext = ((C7N) obj).A5o();
            if (adContext != null) {
                adContext.A0I(th);
                return;
            }
            return;
        }
        if (!(obj instanceof View)) {
            return;
        }
        Context context = ((View) obj).getContext();
        if (!(context instanceof C1337Xw)) {
            return;
        }
        ((C1337Xw) context).A0I(th);
    }
}
