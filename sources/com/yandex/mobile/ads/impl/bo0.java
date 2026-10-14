package com.yandex.mobile.ads.impl;

import com.google.common.util.concurrent.SettableFuture;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class bo0 implements dh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SettableFuture f19299a;

    public bo0(SettableFuture settableFuture) {
        this.f19299a = settableFuture;
    }

    @Override // com.yandex.mobile.ads.impl.dh
    public final void a(ex0 ex0Var) {
        this.f19299a.set(ex0Var);
    }

    @Override // com.yandex.mobile.ads.impl.dh
    public final void a(IOException iOException) {
        this.f19299a.setException(iOException);
    }
}
