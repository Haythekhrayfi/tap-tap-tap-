package com.yandex.mobile.ads.impl;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class mh0 implements jh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f23080a;

    public mh0(View view) {
        this.f23080a = view;
    }

    @Override // com.yandex.mobile.ads.impl.jh0
    public final void setMuted(boolean z10) {
    }

    @Override // com.yandex.mobile.ads.impl.jh0
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f23080a.setOnClickListener(onClickListener);
    }
}
