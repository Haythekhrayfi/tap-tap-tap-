package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class x extends i implements y {
    public x(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
    }

    @Override // com.google.android.play.core.internal.y
    public final void a(Bundle bundle) throws RemoteException {
        Parcel parcelA = a();
        k.a(parcelA, bundle);
        a(3, parcelA);
    }

    @Override // com.google.android.play.core.internal.y
    public final void a(Bundle bundle, Bundle bundle2) throws RemoteException {
        Parcel parcelA = a();
        k.a(parcelA, bundle);
        k.a(parcelA, bundle2);
        a(2, parcelA);
    }

    @Override // com.google.android.play.core.internal.y
    public final void b(Bundle bundle) throws RemoteException {
        Parcel parcelA = a();
        k.a(parcelA, bundle);
        a(4, parcelA);
    }
}
