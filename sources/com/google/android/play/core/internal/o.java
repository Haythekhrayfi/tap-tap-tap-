package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o extends j implements p {
    public o() {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    @Override // com.google.android.play.core.internal.j
    public final boolean a(int i10, Parcel parcel) throws RemoteException {
        if (i10 == 2) {
            a((Bundle) k.a(parcel, Bundle.CREATOR));
            return true;
        }
        if (i10 != 3) {
            return false;
        }
        b((Bundle) k.a(parcel, Bundle.CREATOR));
        return true;
    }
}
