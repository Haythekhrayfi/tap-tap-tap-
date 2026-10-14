package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public final class qa0 implements sa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f24379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f24380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final sa0.a f24381c = new sa0.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f24382d;

    public qa0(View view, float f10) {
        this.f24379a = view.getContext().getApplicationContext();
        this.f24380b = view;
        this.f24382d = f10;
    }

    @Override // com.yandex.mobile.ads.impl.sa0
    public final sa0.a a(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        Context context = this.f24379a;
        int i12 = eh1.f20253b;
        int iRound = Math.round(context.getResources().getDisplayMetrics().heightPixels * this.f24382d);
        ViewGroup.LayoutParams layoutParams = this.f24380b.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            iRound = (iRound - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin;
        }
        int iMax = Math.max(Math.min(size, iRound), 0);
        sa0.a aVar = this.f24381c;
        aVar.f25006a = i10;
        aVar.f25007b = View.MeasureSpec.makeMeasureSpec(iMax, mode);
        return this.f24381c;
    }
}
