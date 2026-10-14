package com.google.android.play.core.assetpacks;

import android.content.Context;
import java.io.File;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class da implements com.google.android.play.core.internal.cn<cz> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.core.internal.cn<String> f12099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.core.internal.cn<aw> f12100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.play.core.internal.cn<bz> f12101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.play.core.internal.cn<Context> f12102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.play.core.internal.cn<dl> f12103e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.play.core.internal.cn<Executor> f12104f;

    public da(com.google.android.play.core.internal.cn<String> cnVar, com.google.android.play.core.internal.cn<aw> cnVar2, com.google.android.play.core.internal.cn<bz> cnVar3, com.google.android.play.core.internal.cn<Context> cnVar4, com.google.android.play.core.internal.cn<dl> cnVar5, com.google.android.play.core.internal.cn<Executor> cnVar6) {
        this.f12099a = cnVar;
        this.f12100b = cnVar2;
        this.f12101c = cnVar3;
        this.f12102d = cnVar4;
        this.f12103e = cnVar5;
        this.f12104f = cnVar6;
    }

    @Override // com.google.android.play.core.internal.cn
    public final /* bridge */ /* synthetic */ cz a() {
        String strA = this.f12099a.a();
        aw awVarA = this.f12100b.a();
        bz bzVarA = this.f12101c.a();
        Context contextA = ((s) this.f12102d).a();
        dl dlVarA = this.f12103e.a();
        return new cz(strA != null ? new File(contextA.getExternalFilesDir(null), strA) : contextA.getExternalFilesDir(null), awVarA, bzVarA, contextA, dlVarA, com.google.android.play.core.internal.cl.b(this.f12104f));
    }
}
