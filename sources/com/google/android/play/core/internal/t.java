package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t extends j implements u {
    public t() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback");
    }

    @Override // com.google.android.play.core.internal.j
    public final boolean a(int i10, Parcel parcel) throws RemoteException {
        switch (i10) {
            case 2:
                a(parcel.readInt(), (Bundle) k.a(parcel, Bundle.CREATOR));
                return true;
            case 3:
                int i11 = parcel.readInt();
                a(i11);
                return true;
            case 4:
                int i12 = parcel.readInt();
                b(i12);
                return true;
            case 5:
                a(parcel.createTypedArrayList(Bundle.CREATOR));
                return true;
            case 6:
                Parcelable.Creator creator = Bundle.CREATOR;
                Bundle bundle = (Bundle) k.a(parcel, creator);
                b(bundle);
                return true;
            case 7:
                a((Bundle) k.a(parcel, Bundle.CREATOR));
                return true;
            case 8:
                Parcelable.Creator creator2 = Bundle.CREATOR;
                Bundle bundle2 = (Bundle) k.a(parcel, creator2);
                c(bundle2);
                return true;
            case 9:
            default:
                return false;
            case 10:
                Parcelable.Creator creator3 = Bundle.CREATOR;
                Bundle bundle3 = (Bundle) k.a(parcel, creator3);
                d(bundle3);
                return true;
            case 11:
                Parcelable.Creator creator4 = Bundle.CREATOR;
                a((Bundle) k.a(parcel, creator4), (Bundle) k.a(parcel, creator4));
                return true;
            case 12:
                Parcelable.Creator creator5 = Bundle.CREATOR;
                b((Bundle) k.a(parcel, creator5), (Bundle) k.a(parcel, creator5));
                return true;
            case 13:
                Parcelable.Creator creator6 = Bundle.CREATOR;
                c((Bundle) k.a(parcel, creator6), (Bundle) k.a(parcel, creator6));
                return true;
            case 14:
                Parcelable.Creator creator7 = Bundle.CREATOR;
                b();
                return true;
            case 15:
                a();
                return true;
        }
    }
}
