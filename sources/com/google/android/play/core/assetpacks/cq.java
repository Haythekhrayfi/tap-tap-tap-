package com.google.android.play.core.assetpacks;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class cq implements com.google.android.play.core.internal.cn<cp> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.core.internal.cn<bb> f12060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.core.internal.cn<w> f12061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.play.core.internal.cn<bz> f12062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.play.core.internal.cn<Executor> f12063d;

    public cq(com.google.android.play.core.internal.cn<bb> cnVar, com.google.android.play.core.internal.cn<w> cnVar2, com.google.android.play.core.internal.cn<bz> cnVar3, com.google.android.play.core.internal.cn<Executor> cnVar4) {
        this.f12060a = cnVar;
        this.f12061b = cnVar2;
        this.f12062c = cnVar3;
        this.f12063d = cnVar4;
    }

    @Override // com.google.android.play.core.internal.cn
    public final /* bridge */ /* synthetic */ cp a() {
        bb bbVarA = this.f12060a.a();
        return new cp(bbVarA, com.google.android.play.core.internal.cl.b(this.f12061b), this.f12062c.a(), com.google.android.play.core.internal.cl.b(this.f12063d));
    }
}
