package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.nativeads.MediaView;

/* JADX INFO: loaded from: classes3.dex */
public final class ah1 {
    private static final va0 a(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        if (mode != Integer.MIN_VALUE) {
            return (mode == 0 || mode != 1073741824) ? va0.f25923c : va0.f25921a;
        }
        return va0.f25922b;
    }

    public static final wg1 a(com.yandex.mobile.ads.banner.g gVar) {
        fd.j0.i(gVar, "<this>");
        ViewGroup.LayoutParams layoutParams = gVar.getLayoutParams();
        Integer numValueOf = layoutParams != null ? Integer.valueOf(i91.a(layoutParams.width)) : null;
        ViewGroup.LayoutParams layoutParams2 = gVar.getLayoutParams();
        return new wg1(new vg1(i91.a(gVar.getWidth()), i91.a(gVar.getHeight())), new g80(numValueOf, layoutParams2 != null ? Integer.valueOf(i91.a(layoutParams2.height)) : null), new ta0(new ua0(i91.a(View.MeasureSpec.getSize(gVar.getWidthMeasureSpec())), a(gVar.getWidthMeasureSpec())), new ua0(i91.a(View.MeasureSpec.getSize(gVar.getHeightMeasureSpec())), a(gVar.getHeightMeasureSpec()))));
    }

    public static final wg1 a(MediaView mediaView, String str) {
        fd.j0.i(mediaView, "<this>");
        fd.j0.i(str, "mediaType");
        ViewGroup.LayoutParams layoutParams = mediaView.getLayoutParams();
        Integer numValueOf = layoutParams != null ? Integer.valueOf(i91.a(layoutParams.width)) : null;
        ViewGroup.LayoutParams layoutParams2 = mediaView.getLayoutParams();
        Integer numValueOf2 = layoutParams2 != null ? Integer.valueOf(i91.a(layoutParams2.height)) : null;
        int iA = i91.a(View.MeasureSpec.getSize(mediaView.getWidthMeasureSpec()));
        int iA2 = i91.a(View.MeasureSpec.getSize(mediaView.getHeightMeasureSpec()));
        return new wg1(new vg1(i91.a(mediaView.getWidth()), i91.a(mediaView.getHeight())), new g80(numValueOf, numValueOf2), new ta0(new ua0(iA, a(mediaView.getWidthMeasureSpec())), new ua0(iA2, a(mediaView.getHeightMeasureSpec()))), kc.f0.e(new jc.h("asset", "media"), new jc.h("media_type", str)));
    }
}
