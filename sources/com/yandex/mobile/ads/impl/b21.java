package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.SizeInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class b21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SizeInfo f19089a;

    public final SizeInfo a() {
        return this.f19089a;
    }

    public final void a(SizeInfo sizeInfo) {
        if (sizeInfo == null) {
            o60.c("Ad size can't be null or empty.", new Object[0]);
            return;
        }
        SizeInfo sizeInfo2 = this.f19089a;
        if (sizeInfo2 == null || fd.j0.d(sizeInfo2, sizeInfo)) {
            this.f19089a = sizeInfo;
        } else {
            o60.c("Ad size can't be set twice.", new Object[0]);
        }
    }
}
