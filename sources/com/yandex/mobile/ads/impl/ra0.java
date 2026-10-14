package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public final class ra0 implements sa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f24647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sa0.a f24648b = new sa0.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View f24649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f24650d;

    public ra0(View view, float f10) {
        this.f24647a = view.getContext().getApplicationContext();
        this.f24649c = view;
        this.f24650d = f10;
    }

    @Override // com.yandex.mobile.ads.impl.sa0
    public final sa0.a a(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        Context context = this.f24647a;
        int i12 = eh1.f20253b;
        int iRound = Math.round(context.getResources().getDisplayMetrics().widthPixels * this.f24650d);
        ViewGroup.LayoutParams layoutParams = this.f24649c.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            iRound = (iRound - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin;
        }
        this.f24648b.f25006a = View.MeasureSpec.makeMeasureSpec(Math.max(Math.min(size, iRound), 0), mode);
        sa0.a aVar = this.f24648b;
        aVar.f25007b = i11;
        return aVar;
    }
}
