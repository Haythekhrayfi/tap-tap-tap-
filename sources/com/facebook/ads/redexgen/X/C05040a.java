package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C05040a extends C05060c {
    @Override // com.facebook.ads.redexgen.X.C3E
    public final C3W A08(View view, C3W c3w) {
        WindowInsets result = (WindowInsets) C3W.A01(c3w);
        WindowInsets unwrapped = view.dispatchApplyWindowInsets(result);
        if (unwrapped != result) {
            result = new WindowInsets(unwrapped);
        }
        return C3W.A00(result);
    }

    @Override // com.facebook.ads.redexgen.X.C3E
    public final C3W A09(View view, C3W c3w) {
        WindowInsets result = (WindowInsets) C3W.A01(c3w);
        WindowInsets unwrapped = view.onApplyWindowInsets(result);
        if (unwrapped != result) {
            result = new WindowInsets(unwrapped);
        }
        return C3W.A00(result);
    }

    @Override // com.facebook.ads.redexgen.X.C3E
    public final void A0B(View view) {
        view.stopNestedScroll();
    }

    @Override // com.facebook.ads.redexgen.X.C3E
    public final void A0F(View view, final InterfaceC05792z interfaceC05792z) {
        if (interfaceC05792z == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.facebook.ads.redexgen.X.3D
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    C3W compatInsets = interfaceC05792z.AAK(view2, C3W.A00(windowInsets));
                    return (WindowInsets) C3W.A01(compatInsets);
                }
            });
        }
    }
}
