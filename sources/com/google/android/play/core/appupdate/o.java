package com.google.android.play.core.appupdate;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.internal.af;

/* JADX INFO: loaded from: classes2.dex */
final class o extends m<AppUpdateInfo> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f11755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f11756e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, com.google.android.play.core.tasks.i<AppUpdateInfo> iVar, String str) {
        super(pVar, new af("OnRequestInstallCallback"), iVar);
        this.f11755d = pVar;
        this.f11756e = str;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.google.android.play.core.appupdate.m, com.google.android.play.core.internal.p
    public final void a(Bundle bundle) throws RemoteException {
        super.a(bundle);
        if (bundle.getInt("error.code", -2) != 0) {
            this.f11753b.b(new InstallException(bundle.getInt("error.code", -2)));
            return;
        }
        this.f11753b.b((T) AppUpdateInfo.a(this.f11756e, bundle.getInt("version.code", -1), bundle.getInt("update.availability"), bundle.getInt("install.status", 0), bundle.getInt("client.version.staleness", -1) == -1 ? null : Integer.valueOf(bundle.getInt("client.version.staleness")), bundle.getInt("in.app.update.priority", 0), bundle.getLong("bytes.downloaded"), bundle.getLong("total.bytes.to.download"), bundle.getLong("additional.size.required"), this.f11755d.f11762f.a(), (PendingIntent) bundle.getParcelable("blocking.intent"), (PendingIntent) bundle.getParcelable("nonblocking.intent"), (PendingIntent) bundle.getParcelable("blocking.destructive.intent"), (PendingIntent) bundle.getParcelable("nonblocking.destructive.intent")));
    }
}
