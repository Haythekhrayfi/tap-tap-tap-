package com.google.android.play.core.splitinstall;

import android.content.Context;
import com.google.android.play.core.internal.cn;

/* JADX INFO: loaded from: classes2.dex */
public final class q implements cn<p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final cn<Context> f12450a;

    public q(cn<Context> cnVar) {
        this.f12450a = cnVar;
    }

    public static q a(cn<Context> cnVar) {
        return new q(cnVar);
    }

    @Override // com.google.android.play.core.internal.cn
    public final /* bridge */ /* synthetic */ p a() {
        return new p(this.f12450a.a());
    }
}
