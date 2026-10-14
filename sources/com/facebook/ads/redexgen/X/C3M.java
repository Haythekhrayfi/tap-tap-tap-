package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3M, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C3M extends ViewGroup.LayoutParams {
    public float A00;
    public int A01;
    public int A02;
    public boolean A03;
    public int A04;
    public boolean A05;

    public C3M() {
        super(-1, -1);
        this.A00 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
    }

    public C3M(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3T.A0w);
        this.A04 = typedArrayObtainStyledAttributes.getInteger(0, 48);
        typedArrayObtainStyledAttributes.recycle();
    }
}
