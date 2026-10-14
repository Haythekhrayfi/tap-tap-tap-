package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class QT {
    public static boolean A00(View view) {
        return view.getBackground() == null || (Build.VERSION.SDK_INT >= 19 && view.getBackground().getAlpha() <= 0);
    }
}
