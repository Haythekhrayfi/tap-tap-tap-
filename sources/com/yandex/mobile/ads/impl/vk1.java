package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.common.BidderTokenLoadListener;

/* JADX INFO: loaded from: classes3.dex */
final class vk1 implements h01.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f26005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BidderTokenLoadListener f26006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wk1 f26007c;

    public vk1(wk1 wk1Var, Context context, BidderTokenLoadListener bidderTokenLoadListener) {
        this.f26007c = wk1Var;
        this.f26005a = context;
        this.f26006b = bidderTokenLoadListener;
    }

    @Override // com.yandex.mobile.ads.impl.h01.a
    public final void a(d8 d8Var, wr wrVar) {
        String strA = this.f26007c.f26308b.a(this.f26005a, d8Var, wrVar);
        if (strA != null) {
            this.f26007c.f26309c.post(new do1(this.f26006b, strA));
        } else {
            this.f26007c.f26309c.post(new fq1(this.f26006b, 0));
        }
    }

    @Override // com.yandex.mobile.ads.impl.h01.a
    public final void a(t2 t2Var) {
        this.f26007c.f26309c.post(new fq1(this.f26006b, 1));
    }
}
