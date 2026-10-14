package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbdy {
    private final Context zza;

    public zzbdy(Context context) {
        this.zza = context;
    }

    public final void zza(zzbtd zzbtdVar) {
        String strValueOf;
        String str;
        try {
            ((zzbdz) zzbzv.zzb(this.zza, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", new zzbzt() { // from class: com.google.android.gms.internal.ads.zzbdx
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzbzt
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                    return iInterfaceQueryLocalInterface instanceof zzbdz ? (zzbdz) iInterfaceQueryLocalInterface : new zzbdz(obj);
                }
            })).zze(zzbtdVar);
        } catch (RemoteException e10) {
            strValueOf = String.valueOf(e10.getMessage());
            str = "Error calling setFlagsAccessedBeforeInitializedListener: ";
            zzbzr.zzj(str.concat(strValueOf));
        } catch (zzbzu e11) {
            strValueOf = String.valueOf(e11.getMessage());
            str = "Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:";
            zzbzr.zzj(str.concat(strValueOf));
        }
    }
}
