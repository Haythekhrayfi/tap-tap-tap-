package com.google.android.play.core.splitinstall.testing;

import android.content.Context;
import com.google.android.play.core.internal.cn;
import com.google.android.play.core.splitinstall.p;
import com.google.android.play.core.splitinstall.z;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements cn<FakeSplitInstallManager> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final cn<Context> f12509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final cn<File> f12510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final cn<p> f12511c;

    public k(cn<Context> cnVar, cn<File> cnVar2, cn<p> cnVar3) {
        this.f12509a = cnVar;
        this.f12510b = cnVar2;
        this.f12511c = cnVar3;
    }

    @Override // com.google.android.play.core.internal.cn
    public final /* bridge */ /* synthetic */ FakeSplitInstallManager a() {
        return new FakeSplitInstallManager(((z) this.f12509a).a(), this.f12510b.a(), this.f12511c.a());
    }
}
