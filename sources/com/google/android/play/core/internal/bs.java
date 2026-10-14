package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class bs extends i implements bu {
    public bs(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
    }

    @Override // com.google.android.play.core.internal.bu
    public final void a(String str, int i10, Bundle bundle, bw bwVar) throws RemoteException {
        Parcel parcelA = a();
        parcelA.writeString(str);
        parcelA.writeInt(i10);
        k.a(parcelA, bundle);
        k.a(parcelA, bwVar);
        a(4, parcelA);
    }

    @Override // com.google.android.play.core.internal.bu
    public final void a(String str, int i10, bw bwVar) throws RemoteException {
        Parcel parcelA = a();
        parcelA.writeString(str);
        parcelA.writeInt(i10);
        k.a(parcelA, bwVar);
        a(5, parcelA);
    }

    @Override // com.google.android.play.core.internal.bu
    public final void a(String str, bw bwVar) throws RemoteException {
        Parcel parcelA = a();
        parcelA.writeString(str);
        k.a(parcelA, bwVar);
        a(6, parcelA);
    }

    @Override // com.google.android.play.core.internal.bu
    public final void a(String str, List<Bundle> list, Bundle bundle, bw bwVar) throws RemoteException {
        Parcel parcelA = a();
        parcelA.writeString(str);
        parcelA.writeTypedList(list);
        k.a(parcelA, bundle);
        k.a(parcelA, bwVar);
        a(2, parcelA);
    }

    @Override // com.google.android.play.core.internal.bu
    public final void b(String str, List<Bundle> list, Bundle bundle, bw bwVar) throws RemoteException {
        Parcel parcelA = a();
        parcelA.writeString(str);
        parcelA.writeTypedList(list);
        k.a(parcelA, bundle);
        k.a(parcelA, bwVar);
        a(7, parcelA);
    }

    @Override // com.google.android.play.core.internal.bu
    public final void c(String str, List<Bundle> list, Bundle bundle, bw bwVar) throws RemoteException {
        Parcel parcelA = a();
        parcelA.writeString(str);
        parcelA.writeTypedList(list);
        k.a(parcelA, bundle);
        k.a(parcelA, bwVar);
        a(8, parcelA);
    }

    @Override // com.google.android.play.core.internal.bu
    public final void d(String str, List<Bundle> list, Bundle bundle, bw bwVar) throws RemoteException {
        Parcel parcelA = a();
        parcelA.writeString(str);
        parcelA.writeTypedList(list);
        k.a(parcelA, bundle);
        k.a(parcelA, bwVar);
        a(13, parcelA);
    }

    @Override // com.google.android.play.core.internal.bu
    public final void e(String str, List<Bundle> list, Bundle bundle, bw bwVar) throws RemoteException {
        Parcel parcelA = a();
        parcelA.writeString(str);
        parcelA.writeTypedList(list);
        k.a(parcelA, bundle);
        k.a(parcelA, bwVar);
        a(14, parcelA);
    }
}
