package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.ac;
import com.google.android.play.core.internal.af;
import com.google.android.play.core.tasks.i;

/* JADX INFO: loaded from: classes2.dex */
class f<T> extends ac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final af f12327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i<T> f12328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f12329c;

    public f(h hVar, af afVar, i<T> iVar) {
        this.f12329c = hVar;
        this.f12327a = afVar;
        this.f12328b = iVar;
    }

    @Override // com.google.android.play.core.internal.ad
    public void a(Bundle bundle) throws RemoteException {
        this.f12329c.f12331a.a();
        this.f12327a.c("onGetLaunchReviewFlowInfo", new Object[0]);
    }
}
