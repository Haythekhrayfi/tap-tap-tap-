package com.google.android.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public class a implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f11646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f11647b = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";

    public a(IBinder iBinder) {
        this.f11646a = iBinder;
    }

    public final Parcel a() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f11647b);
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f11646a;
    }

    public final Parcel b(Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f11646a.transact(1, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e10) {
                parcelObtain.recycle();
                throw e10;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }
}
