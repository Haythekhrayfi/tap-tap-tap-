package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bv extends j implements bw {
    public bv() {
        super("com.google.android.play.core.splitinstall.protocol.ISplitInstallServiceCallback");
    }

    @Override // com.google.android.play.core.internal.j
    public final boolean a(int i10, Parcel parcel) throws RemoteException {
        switch (i10) {
            case 2:
                c(parcel.readInt(), (Bundle) k.a(parcel, Bundle.CREATOR));
                return true;
            case 3:
                int i11 = parcel.readInt();
                a(i11);
                return true;
            case 4:
                a(parcel.readInt(), (Bundle) k.a(parcel, Bundle.CREATOR));
                return true;
            case 5:
                b(parcel.readInt(), (Bundle) k.a(parcel, Bundle.CREATOR));
                return true;
            case 6:
                e((Bundle) k.a(parcel, Bundle.CREATOR));
                return true;
            case 7:
                a(parcel.createTypedArrayList(Bundle.CREATOR));
                return true;
            case 8:
                d((Bundle) k.a(parcel, Bundle.CREATOR));
                return true;
            case 9:
                a((Bundle) k.a(parcel, Bundle.CREATOR));
                return true;
            case 10:
                b();
                return true;
            case 11:
                a();
                return true;
            case 12:
                b((Bundle) k.a(parcel, Bundle.CREATOR));
                return true;
            case 13:
                c((Bundle) k.a(parcel, Bundle.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
