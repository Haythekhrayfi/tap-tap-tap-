package com.google.android.play.core.appupdate;

import android.content.Context;
import com.google.android.play.core.internal.cn;

/* JADX INFO: loaded from: classes2.dex */
public final class q implements cn<p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final cn<Context> f11763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final cn<r> f11764b;

    public q(cn<Context> cnVar, cn<r> cnVar2) {
        this.f11763a = cnVar;
        this.f11764b = cnVar2;
    }

    @Override // com.google.android.play.core.internal.cn
    public final /* bridge */ /* synthetic */ p a() {
        return new p(((i) this.f11763a).a(), this.f11764b.a());
    }
}
