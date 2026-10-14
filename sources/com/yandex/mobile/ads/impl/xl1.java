package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class xl1 implements z71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mn0 f26553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kq0 f26554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f30 f26555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final mv0 f26556d;

    public xl1(mn0 mn0Var, mv0 mv0Var, f30 f30Var, kq0 kq0Var) {
        this.f26553a = mn0Var;
        this.f26556d = mv0Var;
        this.f26555c = f30Var;
        this.f26554b = kq0Var;
    }

    @Override // com.yandex.mobile.ads.impl.z71
    public final void a(Context context, kq0.a aVar) {
        this.f26556d.c();
        this.f26553a.a();
        this.f26554b.b(context, aVar);
        this.f26555c.a();
    }

    @Override // com.yandex.mobile.ads.impl.z71
    public final void a(Context context, kq0.a aVar, com.yandex.mobile.ads.nativeads.w wVar) {
        this.f26556d.b();
        this.f26553a.b();
        this.f26554b.a(context, aVar);
        if (wVar != null) {
            this.f26555c.a(context, wVar);
        }
    }

    @Override // com.yandex.mobile.ads.impl.z71
    public final void a(AdResponse adResponse, List<g11> list) {
        this.f26553a.a(adResponse, list);
    }

    @Override // com.yandex.mobile.ads.impl.z71
    public final void a(qk0 qk0Var) {
        this.f26556d.a(qk0Var);
    }

    @Override // com.yandex.mobile.ads.impl.z71
    public final void a(v20 v20Var) {
        this.f26553a.a(v20Var);
    }

    @Override // com.yandex.mobile.ads.impl.z71
    public final void a(com.yandex.mobile.ads.nativeads.w wVar) {
        this.f26555c.a(wVar);
    }
}
