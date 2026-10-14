package com.google.android.play.core.appupdate;

import com.google.android.play.core.internal.bq;
import com.google.android.play.core.internal.cn;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements cn<AppUpdateManager> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final cn<e> f11743a;

    public h(cn<e> cnVar) {
        this.f11743a = cnVar;
    }

    @Override // com.google.android.play.core.internal.cn
    public final /* bridge */ /* synthetic */ AppUpdateManager a() {
        e eVarA = this.f11743a.a();
        bq.b(eVarA);
        return eVarA;
    }
}
