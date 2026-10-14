package com.google.android.play.core.splitinstall;

import android.content.Context;
import com.google.android.play.core.internal.cn;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class aa implements cn<File> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final cn<Context> f12382a;

    public aa(cn<Context> cnVar) {
        this.f12382a = cnVar;
    }

    @Override // com.google.android.play.core.internal.cn
    public final /* bridge */ /* synthetic */ File a() {
        return y.a(((z) this.f12382a).a());
    }
}
