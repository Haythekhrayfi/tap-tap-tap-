package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
final class ar extends au<SplitInstallSessionState> {
    public ar(av avVar, com.google.android.play.core.tasks.i<SplitInstallSessionState> iVar) {
        super(avVar, iVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.google.android.play.core.splitinstall.au, com.google.android.play.core.internal.bw
    public final void b(int i10, Bundle bundle) throws RemoteException {
        super.b(i10, bundle);
        this.f12411a.b((T) SplitInstallSessionState.a(bundle));
    }
}
