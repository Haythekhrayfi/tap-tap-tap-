package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ow, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1107Ow {
    public final int[] A00(View view, int i10, int i11) {
        C06064b c06064b = (C06064b) view.getLayoutParams();
        int childHeightSpec = ViewGroup.getChildMeasureSpec(i10, view.getPaddingLeft() + view.getPaddingRight(), c06064b.width);
        int childWidthSpec = view.getPaddingTop();
        view.measure(childHeightSpec, ViewGroup.getChildMeasureSpec(i11, childWidthSpec + view.getPaddingBottom(), c06064b.height));
        int childWidthSpec2 = view.getMeasuredWidth();
        int childWidthSpec3 = view.getMeasuredHeight();
        return new int[]{childWidthSpec2 + c06064b.leftMargin + c06064b.rightMargin, childWidthSpec3 + c06064b.bottomMargin + c06064b.topMargin};
    }
}
