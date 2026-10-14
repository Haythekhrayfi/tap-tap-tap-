package com.google.android.play.core.assetpacks;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements com.google.android.play.core.internal.cn<w> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.core.internal.cn<Context> f12216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.core.internal.cn<ar> f12217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.play.core.internal.cn<cz> f12218c;

    public r(com.google.android.play.core.internal.cn<Context> cnVar, com.google.android.play.core.internal.cn<ar> cnVar2, com.google.android.play.core.internal.cn<cz> cnVar3) {
        this.f12216a = cnVar;
        this.f12217b = cnVar2;
        this.f12218c = cnVar3;
    }

    @Override // com.google.android.play.core.internal.cn
    public final /* bridge */ /* synthetic */ w a() {
        w wVar = (w) (n.a(((s) this.f12216a).a()) == null ? com.google.android.play.core.internal.cl.b(this.f12217b).a() : com.google.android.play.core.internal.cl.b(this.f12218c).a());
        com.google.android.play.core.internal.bq.b(wVar);
        return wVar;
    }
}
