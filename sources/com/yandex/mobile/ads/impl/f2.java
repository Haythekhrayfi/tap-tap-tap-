package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.common.internal.ImagesContract;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.AdResultReceiver;

/* JADX INFO: loaded from: classes3.dex */
public final class f2 implements g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdResponse f20494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k2 f20495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.yandex.mobile.ads.nativeads.k f20496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final zh0 f20497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d81 f20498e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final s3 f20499f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.yandex.mobile.ads.nativeads.r0 f20500g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private fw0.a f20501h;

    public f2(Context context, AdResponse adResponse, k2 k2Var, com.yandex.mobile.ads.nativeads.k kVar, com.yandex.mobile.ads.nativeads.r0 r0Var) {
        this.f20494a = adResponse;
        this.f20495b = k2Var;
        this.f20496c = kVar;
        this.f20500g = r0Var;
        this.f20498e = new d81(new k6(context, k2Var));
        this.f20499f = new s3(kVar);
        this.f20497d = new zh0(context, adResponse, k2Var);
    }

    @Override // com.yandex.mobile.ads.impl.g2
    public final void a(View view, qa qaVar, m80 m80Var, com.yandex.mobile.ads.nativeads.w wVar) {
        this.f20496c.a(m80Var);
        Context context = view.getContext();
        k6 k6Var = new k6(context, this.f20495b);
        AdResultReceiver adResultReceiverA = this.f20499f.a();
        gi giVarA = this.f20497d.a(qaVar.b(), ImagesContract.URL);
        pk0 pk0Var = new pk0(k6Var, this.f20500g.a(context, this.f20495b, adResultReceiverA));
        ok0 ok0VarA = pk0Var.a(giVarA);
        t tVar = new t(this.f20495b, this.f20494a, giVarA, pk0Var, wVar, this.f20496c, this.f20501h);
        this.f20498e.a(m80Var.d());
        tVar.a(view, m80Var.a());
        String strE = m80Var.e();
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        ok0VarA.a(strE);
    }

    public final void a(fw0.a aVar) {
        this.f20501h = aVar;
        this.f20497d.a(aVar);
    }
}
