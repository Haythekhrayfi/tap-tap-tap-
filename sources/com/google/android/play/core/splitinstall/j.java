package com.google.android.play.core.splitinstall;

import com.google.android.play.core.internal.cl;
import com.google.android.play.core.internal.cn;
import com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements cn<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final cn<w> f12438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final cn<FakeSplitInstallManager> f12439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final cn<File> f12440c;

    public j(cn<w> cnVar, cn<FakeSplitInstallManager> cnVar2, cn<File> cnVar3) {
        this.f12438a = cnVar;
        this.f12439b = cnVar2;
        this.f12440c = cnVar3;
    }

    @Override // com.google.android.play.core.internal.cn
    public final /* bridge */ /* synthetic */ i a() {
        return new i(cl.b(this.f12438a), cl.b(this.f12439b), cl.b(this.f12440c));
    }
}
