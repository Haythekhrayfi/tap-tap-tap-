package com.applovin.exoplayer2;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class f extends Binder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f6174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.exoplayer2.common.a.s<Bundle> f6175b;

    static {
        f6174a = com.applovin.exoplayer2.l.ai.f7595a >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536;
    }

    public static com.applovin.exoplayer2.common.a.s<Bundle> a(IBinder iBinder) {
        int i10;
        com.applovin.exoplayer2.common.a.s.a aVarI = com.applovin.exoplayer2.common.a.s.i();
        int i11 = 0;
        int i12 = 1;
        while (i12 != 0) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInt(i11);
                try {
                    iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    while (true) {
                        i10 = parcelObtain2.readInt();
                        if (i10 == 1) {
                            aVarI.a((Bundle) com.applovin.exoplayer2.l.a.b(parcelObtain2.readBundle()));
                            i11++;
                        }
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    i12 = i10;
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            } catch (Throwable th) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th;
            }
        }
        return aVarI.a();
    }

    @Override // android.os.Binder
    public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return super.onTransact(i10, parcel, parcel2, i11);
        }
        if (parcel2 == null) {
            return false;
        }
        int size = this.f6175b.size();
        int i12 = parcel.readInt();
        while (i12 < size && parcel2.dataSize() < f6174a) {
            parcel2.writeInt(1);
            parcel2.writeBundle(this.f6175b.get(i12));
            i12++;
        }
        parcel2.writeInt(i12 < size ? 2 : 0);
        return true;
    }
}
