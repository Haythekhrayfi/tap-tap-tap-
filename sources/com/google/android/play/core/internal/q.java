package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends i implements s {
    public q(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
    }

    @Override // com.google.android.play.core.internal.s
    public final void a(String str, Bundle bundle, Bundle bundle2, u uVar) throws RemoteException {
        Parcel parcelA = a();
        parcelA.writeString(str);
        k.a(parcelA, bundle);
        k.a(parcelA, bundle2);
        k.a(parcelA, uVar);
        a(6, parcelA);
    }

    @Override // com.google.android.play.core.internal.s
    public final void a(String str, Bundle bundle, u uVar) throws RemoteException {
        Parcel parcelA = a();
        parcelA.writeString(str);
        k.a(parcelA, bundle);
        k.a(parcelA, uVar);
        a(5, parcelA);
    }

    @Override // com.google.android.play.core.internal.s
    public final void a(String str, List<Bundle> list, Bundle bundle, u uVar) throws RemoteException {
        Parcel parcelA = a();
        parcelA.writeString(str);
        parcelA.writeTypedList(list);
        k.a(parcelA, bundle);
        k.a(parcelA, uVar);
        a(2, parcelA);
    }

    @Override // com.google.android.play.core.internal.s
    public final void b(String str, Bundle bundle, Bundle bundle2, u uVar) throws RemoteException {
        Parcel parcelA = a();
        parcelA.writeString(str);
        k.a(parcelA, bundle);
        k.a(parcelA, bundle2);
        k.a(parcelA, uVar);
        a(7, parcelA);
    }

    @Override // com.google.android.play.core.internal.s
    public final void b(String str, Bundle bundle, u uVar) throws RemoteException {
        Parcel parcelA = a();
        parcelA.writeString(str);
        k.a(parcelA, bundle);
        k.a(parcelA, uVar);
        a(10, parcelA);
    }

    @Override // com.google.android.play.core.internal.s
    public final void b(String str, List<Bundle> list, Bundle bundle, u uVar) throws RemoteException {
        Parcel parcelA = a();
        parcelA.writeString(str);
        parcelA.writeTypedList(list);
        k.a(parcelA, bundle);
        k.a(parcelA, uVar);
        a(14, parcelA);
    }

    @Override // com.google.android.play.core.internal.s
    public final void c(String str, Bundle bundle, Bundle bundle2, u uVar) throws RemoteException {
        Parcel parcelA = a();
        parcelA.writeString(str);
        k.a(parcelA, bundle);
        k.a(parcelA, bundle2);
        k.a(parcelA, uVar);
        a(9, parcelA);
    }

    @Override // com.google.android.play.core.internal.s
    public final void c(String str, List<Bundle> list, Bundle bundle, u uVar) throws RemoteException {
        Parcel parcelA = a();
        parcelA.writeString(str);
        parcelA.writeTypedList(list);
        k.a(parcelA, bundle);
        k.a(parcelA, uVar);
        a(12, parcelA);
    }

    @Override // com.google.android.play.core.internal.s
    public final void d(String str, Bundle bundle, Bundle bundle2, u uVar) throws RemoteException {
        Parcel parcelA = a();
        parcelA.writeString(str);
        k.a(parcelA, bundle);
        k.a(parcelA, bundle2);
        k.a(parcelA, uVar);
        a(11, parcelA);
    }

    @Override // com.google.android.play.core.internal.s
    public final void e(String str, Bundle bundle, Bundle bundle2, u uVar) throws RemoteException {
        Parcel parcelA = a();
        parcelA.writeString(str);
        k.a(parcelA, bundle);
        k.a(parcelA, bundle2);
        k.a(parcelA, uVar);
        a(13, parcelA);
    }
}
