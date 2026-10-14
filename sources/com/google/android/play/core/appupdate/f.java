package com.google.android.play.core.appupdate;

import android.content.Context;
import com.google.android.play.core.internal.cn;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements cn<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final cn<p> f11739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final cn<a> f11740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final cn<Context> f11741c;

    public f(cn<p> cnVar, cn<a> cnVar2, cn<Context> cnVar3) {
        this.f11739a = cnVar;
        this.f11740b = cnVar2;
        this.f11741c = cnVar3;
    }

    @Override // com.google.android.play.core.internal.cn
    public final /* bridge */ /* synthetic */ e a() {
        return new e(this.f11739a.a(), this.f11740b.a(), ((i) this.f11741c).a());
    }
}
