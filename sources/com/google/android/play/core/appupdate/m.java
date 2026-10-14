package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.af;

/* JADX INFO: loaded from: classes2.dex */
class m<T> extends com.google.android.play.core.internal.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final af f11752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.play.core.tasks.i<T> f11753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f11754c;

    public m(p pVar, af afVar, com.google.android.play.core.tasks.i<T> iVar) {
        this.f11754c = pVar;
        this.f11752a = afVar;
        this.f11753b = iVar;
    }

    @Override // com.google.android.play.core.internal.p
    public void a(Bundle bundle) throws RemoteException {
        this.f11754c.f11759a.a();
        this.f11752a.c("onRequestInfo", new Object[0]);
    }

    @Override // com.google.android.play.core.internal.p
    public void b(Bundle bundle) throws RemoteException {
        this.f11754c.f11759a.a();
        this.f11752a.c("onCompleteUpdate", new Object[0]);
    }
}
