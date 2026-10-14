package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcok {
    private final zzfev zza;
    private final zzdqa zzb;
    private final zzezz zzc;

    public zzcok(zzdqa zzdqaVar, zzezz zzezzVar, zzfev zzfevVar) {
        this.zza = zzfevVar;
        this.zzb = zzdqaVar;
        this.zzc = zzezzVar;
    }

    private static String zzb(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return "h";
        }
        if (i11 == 1) {
            return "bb";
        }
        if (i11 == 2) {
            return "cc";
        }
        if (i11 != 3) {
            return i11 != 4 ? "u" : "ac";
        }
        return "cb";
    }

    public final void zza(long j10, int i10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzig)).booleanValue()) {
            zzfev zzfevVar = this.zza;
            zzfeu zzfeuVarZzb = zzfeu.zzb("ad_closed");
            zzfeuVarZzb.zzg(this.zzc.zzb.zzb);
            zzfeuVarZzb.zza("show_time", String.valueOf(j10));
            zzfeuVarZzb.zza("ad_format", "app_open_ad");
            zzfeuVarZzb.zza("acr", zzb(i10));
            zzfevVar.zzb(zzfeuVarZzb);
            return;
        }
        zzdpz zzdpzVarZza = this.zzb.zza();
        zzdpzVarZza.zze(this.zzc.zzb.zzb);
        zzdpzVarZza.zzb("action", "ad_closed");
        zzdpzVarZza.zzb("show_time", String.valueOf(j10));
        zzdpzVarZza.zzb("ad_format", "app_open_ad");
        zzdpzVarZza.zzb("acr", zzb(i10));
        zzdpzVarZza.zzg();
    }
}
