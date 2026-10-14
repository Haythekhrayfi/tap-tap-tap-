package com.google.android.play.core.assetpacks;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class dk implements com.google.android.play.core.internal.cn<dj> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.core.internal.cn<bb> f12131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.core.internal.cn<w> f12132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.play.core.internal.cn<cp> f12133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.play.core.internal.cn<Executor> f12134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.play.core.internal.cn<bz> f12135e;

    public dk(com.google.android.play.core.internal.cn<bb> cnVar, com.google.android.play.core.internal.cn<w> cnVar2, com.google.android.play.core.internal.cn<cp> cnVar3, com.google.android.play.core.internal.cn<Executor> cnVar4, com.google.android.play.core.internal.cn<bz> cnVar5) {
        this.f12131a = cnVar;
        this.f12132b = cnVar2;
        this.f12133c = cnVar3;
        this.f12134d = cnVar4;
        this.f12135e = cnVar5;
    }

    @Override // com.google.android.play.core.internal.cn
    public final /* bridge */ /* synthetic */ dj a() {
        bb bbVarA = this.f12131a.a();
        return new dj(bbVarA, com.google.android.play.core.internal.cl.b(this.f12132b), this.f12133c.a(), com.google.android.play.core.internal.cl.b(this.f12134d), this.f12135e.a());
    }
}
