package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1041Mi extends ViewGroup {
    public static final int A01 = (int) (Kn.A02 * 8.0f);
    public int A00;

    public C1041Mi(C1337Xw c1337Xw) {
        super(c1337Xw);
        setMotionEventSplittingEnabled(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        int paddingLeft = getPaddingLeft();
        int childHeight = getPaddingTop();
        for (int childWidth = 0; childWidth < width; childWidth++) {
            View child = getChildAt(childWidth);
            int i15 = child.getMeasuredWidth();
            int yPos = child.getMeasuredHeight();
            int width = paddingLeft + i15;
            if (width > i14) {
                paddingLeft = getPaddingLeft();
                int width2 = this.A00;
                childHeight += width2;
            }
            int xPos = paddingLeft + i15;
            int width3 = childHeight + yPos;
            child.layout(paddingLeft, childHeight, xPos, width3);
            int width4 = A01;
            paddingLeft += width4 + i15;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
        int size2 = View.MeasureSpec.getSize(i11);
        int width = getPaddingTop();
        int i12 = size2 - width;
        int width2 = getPaddingBottom();
        int childWidth = getPaddingLeft();
        int i13 = 0;
        int childHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12 - width2, Integer.MIN_VALUE);
        int width3 = getChildCount();
        int i14 = width3 > 0 ? 1 : 0;
        for (int lineHeight = 0; lineHeight < width; lineHeight++) {
            View childAt = getChildAt(lineHeight);
            int width4 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            childAt.measure(width4, childHeightMeasureSpec);
            int xPos = childAt.getMeasuredWidth();
            int width5 = childAt.getMeasuredHeight();
            int height = A01;
            i13 = Math.max(i13, width5 + height);
            int width6 = childWidth + xPos;
            if (width6 > size) {
                i14++;
                childWidth = getPaddingLeft();
            }
            childWidth += height + xPos;
        }
        this.A00 = i13;
        int width7 = A01;
        setMeasuredDimension(size, (i14 * i13) + width7);
    }
}
