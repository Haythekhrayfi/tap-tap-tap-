package com.google.android.play.core.splitinstall;

import com.google.android.play.core.internal.bq;
import com.google.android.play.core.internal.cn;

/* JADX INFO: loaded from: classes2.dex */
public final class ac implements cn<SplitInstallManager> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y f12384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final cn<i> f12385b;

    public ac(y yVar, cn<i> cnVar) {
        this.f12384a = yVar;
        this.f12385b = cnVar;
    }

    @Override // com.google.android.play.core.internal.cn
    public final /* bridge */ /* synthetic */ SplitInstallManager a() {
        i iVarA = this.f12385b.a();
        bq.b(iVarA);
        return iVarA;
    }
}
