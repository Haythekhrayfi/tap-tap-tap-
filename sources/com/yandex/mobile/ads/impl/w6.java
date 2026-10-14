package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class w6 implements rg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.yandex.mobile.ads.nativeads.w f26181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.yandex.mobile.ads.nativeads.b f26182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m80 f26183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final dh1 f26184d = new dh1();

    public w6(com.yandex.mobile.ads.nativeads.w wVar, com.yandex.mobile.ads.nativeads.b bVar, m80 m80Var) {
        this.f26181a = wVar;
        this.f26182b = bVar;
        this.f26183c = m80Var;
    }

    @Override // com.yandex.mobile.ads.impl.rg1
    public final void a(View view, qa qaVar) {
        if (view.getTag() == null) {
            dh1 dh1Var = this.f26184d;
            String strB = qaVar.b();
            Objects.requireNonNull(dh1Var);
            view.setTag(dh1.a(strB));
        }
    }

    @Override // com.yandex.mobile.ads.impl.rg1
    public final void a(qa qaVar, ei eiVar) {
        m80 m80VarA = qaVar.a();
        if (m80VarA == null) {
            m80VarA = this.f26183c;
        }
        this.f26182b.a(qaVar, m80VarA, this.f26181a, eiVar);
    }
}
