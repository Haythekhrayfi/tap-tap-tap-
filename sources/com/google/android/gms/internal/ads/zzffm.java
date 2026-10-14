package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zzffm {
    public static zzffn zza(Context context, int i10) {
        zzbcr zzbcrVar;
        if (zzfgb.zza()) {
            int i11 = i10 - 2;
            if (i11 != 20 && i11 != 21) {
                switch (i11) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        zzbcrVar = zzbcy.zzc;
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        zzbcrVar = zzbcy.zzd;
                        break;
                    case 5:
                        zzbcrVar = zzbcy.zzb;
                        break;
                }
            } else {
                zzbcrVar = zzbcy.zze;
            }
            if (((Boolean) zzbcrVar.zze()).booleanValue()) {
                return new zzffp(context, i10);
            }
        }
        return new zzfgk();
    }

    public static zzffn zzb(Context context, int i10, int i11, com.google.android.gms.ads.internal.client.zzl zzlVar) {
        zzffn zzffnVarZza = zza(context, i10);
        if (!(zzffnVarZza instanceof zzffp)) {
            return zzffnVarZza;
        }
        zzffnVarZza.zzh();
        zzffnVarZza.zzm(i11);
        if (zzffx.zze(zzlVar.zzp)) {
            zzffnVarZza.zze(zzlVar.zzp);
        }
        return zzffnVarZza;
    }
}
