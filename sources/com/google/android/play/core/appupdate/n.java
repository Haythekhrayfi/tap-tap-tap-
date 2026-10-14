package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.internal.af;

/* JADX INFO: loaded from: classes2.dex */
final class n extends m<Void> {
    public n(p pVar, com.google.android.play.core.tasks.i<Void> iVar) {
        super(pVar, new af("OnCompleteUpdateCallback"), iVar);
    }

    @Override // com.google.android.play.core.appupdate.m, com.google.android.play.core.internal.p
    public final void b(Bundle bundle) throws RemoteException {
        super.b(bundle);
        if (bundle.getInt("error.code", -2) != 0) {
            this.f11753b.b(new InstallException(bundle.getInt("error.code", -2)));
        } else {
            this.f11753b.b((Object) null);
        }
    }
}
