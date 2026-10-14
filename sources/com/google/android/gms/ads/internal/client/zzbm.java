package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzatr;
import com.google.android.gms.internal.ads.zzats;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbm extends zzatr implements zzbn {
    public zzbm() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.zzatr
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        String strZze;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    boolean zZzi = zzi();
                    parcel2.writeNoException();
                    int i12 = zzats.zza;
                    parcel2.writeInt(zZzi ? 1 : 0);
                } else if (i10 == 4) {
                    strZze = zzf();
                } else {
                    if (i10 != 5) {
                        return false;
                    }
                    zzl zzlVar = (zzl) zzats.zza(parcel, zzl.CREATOR);
                    int i13 = parcel.readInt();
                    zzats.zzc(parcel);
                    zzh(zzlVar, i13);
                }
                return true;
            }
            strZze = zze();
            parcel2.writeNoException();
            parcel2.writeString(strZze);
            return true;
        }
        zzl zzlVar2 = (zzl) zzats.zza(parcel, zzl.CREATOR);
        zzats.zzc(parcel);
        zzg(zzlVar2);
        parcel2.writeNoException();
        return true;
    }
}
