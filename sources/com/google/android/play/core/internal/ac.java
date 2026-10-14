package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ac extends j implements ad {
    public ac() {
        super("com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
    }

    @Override // com.google.android.play.core.internal.j
    public final boolean a(int i10, Parcel parcel) throws RemoteException {
        if (i10 != 2) {
            return false;
        }
        a((Bundle) k.a(parcel, Bundle.CREATOR));
        return true;
    }
}
