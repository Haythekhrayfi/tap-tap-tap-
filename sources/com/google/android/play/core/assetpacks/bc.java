package com.google.android.play.core.assetpacks;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class bc implements com.google.android.play.core.internal.cn<bb> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.core.internal.cn<Context> f11913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.core.internal.cn<dl> f11914b;

    public bc(com.google.android.play.core.internal.cn<Context> cnVar, com.google.android.play.core.internal.cn<dl> cnVar2) {
        this.f11913a = cnVar;
        this.f11914b = cnVar2;
    }

    @Override // com.google.android.play.core.internal.cn
    public final /* bridge */ /* synthetic */ bb a() {
        return new bb(((s) this.f11913a).a(), this.f11914b.a());
    }
}
