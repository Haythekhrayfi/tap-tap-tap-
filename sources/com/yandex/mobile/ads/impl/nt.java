package com.yandex.mobile.ads.impl;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes3.dex */
public final class nt implements p70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RectF f23542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f23543b;

    public nt(int i10, RectF rectF) {
        this.f23543b = i10;
        this.f23542a = rectF;
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final String a() {
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(this.f23543b);
        RectF rectF = this.f23542a;
        objArr[1] = rectF != null ? String.format("{x:%s,y:%s,width:%s,height:%s}", Float.valueOf(rectF.left), Float.valueOf(rectF.top), Float.valueOf(rectF.width()), Float.valueOf(rectF.height())) : null;
        return String.format("exposure:{exposedPercentage:%s,visibleRectangle:%s,occlusionRectangles:[]}", objArr);
    }
}
