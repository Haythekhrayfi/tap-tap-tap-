package com.yandex.mobile.ads.core.identifiers.ad.gms.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.yandex.mobile.ads.impl.x60;

/* JADX INFO: loaded from: classes2.dex */
class GmsServiceAdvertisingInfoReader implements a, IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f18273a;

    public GmsServiceAdvertisingInfoReader(IBinder iBinder) {
        this.f18273a = iBinder;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f18273a;
    }

    @Override // com.yandex.mobile.ads.core.identifiers.ad.gms.service.a
    public Boolean readAdTrackingLimited() {
        Boolean boolValueOf;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            boolean z10 = true;
            parcelObtain.writeInt(1);
            this.f18273a.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            if (parcelObtain2.readInt() == 0) {
                z10 = false;
            }
            boolValueOf = Boolean.valueOf(z10);
        } catch (Throwable th) {
            try {
                x60.a(th, "Exception during advertising if usage flag read from GMS service", new Object[0]);
                boolValueOf = null;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
        return boolValueOf;
    }

    @Override // com.yandex.mobile.ads.core.identifiers.ad.gms.service.a
    public String readAdvertisingId() {
        String string;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            this.f18273a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            string = parcelObtain2.readString();
        } catch (Throwable th) {
            try {
                x60.a(th, "Exception during advertising id read from GMS service", new Object[0]);
                string = null;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
        return string;
    }
}
