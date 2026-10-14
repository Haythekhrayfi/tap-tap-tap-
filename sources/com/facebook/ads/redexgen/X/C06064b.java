package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C06064b extends ViewGroup.MarginLayoutParams {
    public AbstractC06224s A00;
    public boolean A01;
    public boolean A02;
    public final Rect A03;

    public C06064b(int i10, int i11) {
        super(i10, i11);
        this.A03 = new Rect();
        this.A01 = true;
        this.A02 = false;
    }

    public C06064b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A03 = new Rect();
        this.A01 = true;
        this.A02 = false;
    }

    public C06064b(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.A03 = new Rect();
        this.A01 = true;
        this.A02 = false;
    }

    public C06064b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.A03 = new Rect();
        this.A01 = true;
        this.A02 = false;
    }

    public C06064b(C06064b c06064b) {
        super((ViewGroup.LayoutParams) c06064b);
        this.A03 = new Rect();
        this.A01 = true;
        this.A02 = false;
    }

    public final int A00() {
        return this.A00.A0I();
    }

    public final boolean A01() {
        return this.A00.A0f();
    }

    public final boolean A02() {
        return this.A00.A0c();
    }

    public final boolean A03() {
        return this.A00.A0b();
    }
}
