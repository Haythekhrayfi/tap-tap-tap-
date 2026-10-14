package com.google.android.gms.internal.consent_sdk;

import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
final class zzy {
    private final zzz zza;
    private final zzbw zzb;
    private int zzc = 0;

    public zzy(zzz zzzVar, zzbw zzbwVar) {
        this.zza = zzzVar;
        this.zzb = zzbwVar;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a1  */
    public final zzaa zza() throws zzj {
        String str;
        zzbw zzbwVar = this.zzb;
        int i10 = zzbwVar.zzf;
        int i11 = i10 - 1;
        if (i10 == 0) {
            throw null;
        }
        switch (i11) {
            case 1:
            case 2:
            case 3:
                this.zzc = 3;
                break;
            case 4:
                this.zzc = 2;
                break;
            case 5:
                this.zzc = 1;
                break;
            case 6:
                String strValueOf = String.valueOf(zzbwVar.zzc);
                throw new zzj(1, strValueOf.length() != 0 ? "Invalid response from server: ".concat(strValueOf) : new String("Invalid response from server: "));
            case 7:
                String strValueOf2 = String.valueOf(zzbwVar.zzc);
                throw new zzj(3, strValueOf2.length() != 0 ? "Publisher misconfiguration: ".concat(strValueOf2) : new String("Publisher misconfiguration: "));
            default:
                throw new zzj(1, "Invalid response from server.");
        }
        String str2 = zzbwVar.zza;
        zzbc zzbcVar = str2 == null ? null : new zzbc(zzbwVar.zzb, str2);
        this.zza.zzc.zzg(new HashSet(this.zzb.zzd));
        for (zzbv zzbvVar : this.zzb.zze) {
            int i12 = zzbvVar.zzb;
            int i13 = i12 - 1;
            if (i12 == 0) {
                throw null;
            }
            if (i13 == 0) {
                str = null;
            } else if (i13 == 1) {
                str = "write";
            } else if (i13 != 2) {
                str = null;
            } else {
                str = "clear";
            }
            if (str != null) {
                this.zza.zza.zzb(str, zzbvVar.zza, this.zza.zzb);
            }
        }
        return new zzaa(this.zzc, zzbcVar, null);
    }
}
