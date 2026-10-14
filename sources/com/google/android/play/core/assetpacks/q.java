package com.google.android.play.core.assetpacks;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class q implements com.google.android.play.core.internal.cn<AssetPackManager> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.core.internal.cn<j> f12214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.core.internal.cn<Context> f12215b;

    public q(com.google.android.play.core.internal.cn<j> cnVar, com.google.android.play.core.internal.cn<Context> cnVar2) {
        this.f12214a = cnVar;
        this.f12215b = cnVar2;
    }

    @Override // com.google.android.play.core.internal.cn
    public final /* bridge */ /* synthetic */ AssetPackManager a() {
        j jVarA = this.f12214a.a();
        Context contextA = ((s) this.f12215b).a();
        j jVar = jVarA;
        com.google.android.play.core.internal.bq.a(contextA.getPackageManager(), new ComponentName(contextA.getPackageName(), "com.google.android.play.core.assetpacks.AssetPackExtractionService"), 4);
        PlayCoreDialogWrapperActivity.a(contextA);
        com.google.android.play.core.internal.bq.b(jVar);
        return jVar;
    }
}
