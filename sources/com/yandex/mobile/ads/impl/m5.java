package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.SizeInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class m5 {
    public static RelativeLayout.LayoutParams a(Context context, AdResponse adResponse) {
        RelativeLayout.LayoutParams layoutParams;
        if (adResponse != null) {
            int iR = adResponse.r();
            int iD = adResponse.d();
            int i10 = eh1.f20253b;
            layoutParams = new RelativeLayout.LayoutParams(y11.a(context, 1, iR), y11.a(context, 1, iD));
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        }
        layoutParams.addRule(13);
        return layoutParams;
    }

    public static RelativeLayout.LayoutParams a(Context context, SizeInfo sizeInfo) {
        RelativeLayout.LayoutParams layoutParams;
        if (sizeInfo != null) {
            int iC = sizeInfo.c(context);
            int iA = sizeInfo.a(context);
            int i10 = eh1.f20253b;
            layoutParams = new RelativeLayout.LayoutParams(y11.a(context, 1, iC), y11.a(context, 1, iA));
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        }
        layoutParams.addRule(13);
        return layoutParams;
    }

    public static RelativeLayout.LayoutParams a(Context context, ax axVar) {
        int i10 = eh1.f20253b;
        boolean z10 = true;
        int iA = y11.a(context, 1, 25.0f);
        int iA2 = y11.a(context, 1, 64.0f);
        int i11 = iA2 >> 1;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA2, iA2);
        layoutParams.addRule(7, axVar.getId());
        layoutParams.addRule(6, axVar.getId());
        ViewGroup.LayoutParams layoutParams2 = axVar.getLayoutParams();
        int i12 = layoutParams2.width;
        boolean z11 = i12 == -1 || i12 + iA >= context.getResources().getDisplayMetrics().widthPixels;
        int i13 = layoutParams2.height;
        if (i13 != -1 && i13 + iA < context.getResources().getDisplayMetrics().heightPixels) {
            z10 = false;
        }
        int i14 = (iA >> 1) - ((iA2 - iA) / 2);
        if (!z11 && !z10) {
            i14 = -i11;
        }
        layoutParams.setMargins(0, i14, i14, 0);
        return layoutParams;
    }
}
