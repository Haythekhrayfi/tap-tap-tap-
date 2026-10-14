package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class v extends j implements w {
    public v() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionService");
    }

    @Override // com.google.android.play.core.internal.j
    public final boolean a(int i10, Parcel parcel) throws RemoteException {
        y xVar = null;
        if (i10 == 2) {
            Bundle bundle = (Bundle) k.a(parcel, Bundle.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                xVar = iInterfaceQueryLocalInterface instanceof y ? (y) iInterfaceQueryLocalInterface : new x(strongBinder);
            }
            a(bundle, xVar);
            return true;
        }
        if (i10 != 3) {
            return false;
        }
        IBinder strongBinder2 = parcel.readStrongBinder();
        if (strongBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
            xVar = iInterfaceQueryLocalInterface2 instanceof y ? (y) iInterfaceQueryLocalInterface2 : new x(strongBinder2);
        }
        a(xVar);
        return true;
    }
}
