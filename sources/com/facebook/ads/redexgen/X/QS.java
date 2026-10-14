package com.facebook.ads.redexgen.X;

import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class QS {
    public float A00;
    public C0Q A01;
    public Map<String, String> A02;

    public QS(C0Q c0q) {
        this(c0q, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
    }

    public QS(C0Q c0q, float f10) {
        this(c0q, f10, null);
    }

    public QS(C0Q c0q, float f10, Map<String, String> windowParams) {
        this.A01 = c0q;
        this.A00 = f10;
        if (windowParams != null) {
            this.A02 = windowParams;
        } else {
            this.A02 = new HashMap();
        }
    }

    public final float A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01.A02();
    }

    public final C0Q A02() {
        return this.A01;
    }

    public final Map<String, String> A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A01 == C0Q.A0J;
    }
}
