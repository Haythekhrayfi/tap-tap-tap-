package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.bv;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class au<T> extends bv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.play.core.tasks.i<T> f12411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ av f12412b;

    public au(av avVar, com.google.android.play.core.tasks.i<T> iVar) {
        this.f12412b = avVar;
        this.f12411a = iVar;
    }

    @Override // com.google.android.play.core.internal.bw
    public final void a() throws RemoteException {
        this.f12412b.f12415a.a();
        av.f12413b.c("onCompleteInstallForAppUpdate", new Object[0]);
    }

    @Override // com.google.android.play.core.internal.bw
    public final void a(int i10) throws RemoteException {
        this.f12412b.f12415a.a();
        av.f12413b.c("onCompleteInstall(%d)", Integer.valueOf(i10));
    }

    public void a(int i10, Bundle bundle) throws RemoteException {
        this.f12412b.f12415a.a();
        av.f12413b.c("onCancelInstall(%d)", Integer.valueOf(i10));
    }

    public void a(Bundle bundle) throws RemoteException {
        this.f12412b.f12415a.a();
        av.f12413b.c("onDeferredInstall", new Object[0]);
    }

    public void a(List<Bundle> list) throws RemoteException {
        this.f12412b.f12415a.a();
        av.f12413b.c("onGetSessionStates", new Object[0]);
    }

    @Override // com.google.android.play.core.internal.bw
    public final void b() throws RemoteException {
        this.f12412b.f12415a.a();
        av.f12413b.c("onGetSplitsForAppUpdate", new Object[0]);
    }

    public void b(int i10, Bundle bundle) throws RemoteException {
        this.f12412b.f12415a.a();
        av.f12413b.c("onGetSession(%d)", Integer.valueOf(i10));
    }

    public void b(Bundle bundle) throws RemoteException {
        this.f12412b.f12415a.a();
        av.f12413b.c("onDeferredLanguageInstall", new Object[0]);
    }

    public void c(int i10, Bundle bundle) throws RemoteException {
        this.f12412b.f12415a.a();
        av.f12413b.c("onStartInstall(%d)", Integer.valueOf(i10));
    }

    public void c(Bundle bundle) throws RemoteException {
        this.f12412b.f12415a.a();
        av.f12413b.c("onDeferredLanguageUninstall", new Object[0]);
    }

    public void d(Bundle bundle) throws RemoteException {
        this.f12412b.f12415a.a();
        av.f12413b.c("onDeferredUninstall", new Object[0]);
    }

    @Override // com.google.android.play.core.internal.bw
    public final void e(Bundle bundle) throws RemoteException {
        this.f12412b.f12415a.a();
        int i10 = bundle.getInt("error_code");
        av.f12413b.b("onError(%d)", Integer.valueOf(i10));
        this.f12411a.b(new SplitInstallException(i10));
    }
}
