package com.google.android.play.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public class i implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f12302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f12303b;

    public i(IBinder iBinder, String str) {
        this.f12302a = iBinder;
        this.f12303b = str;
    }

    public final Parcel a() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f12303b);
        return parcelObtain;
    }

    public final void a(int i10, Parcel parcel) throws RemoteException {
        try {
            this.f12302a.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f12302a;
    }
}
