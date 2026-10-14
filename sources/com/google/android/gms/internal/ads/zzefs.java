package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzefs {
    private final zzfax zza;
    private final zzdns zzb;
    private final zzdqa zzc;
    private final zzfev zzd;

    public zzefs(zzfax zzfaxVar, zzdns zzdnsVar, zzdqa zzdqaVar, zzfev zzfevVar) {
        this.zza = zzfaxVar;
        this.zzb = zzdnsVar;
        this.zzc = zzdqaVar;
        this.zzd = zzfevVar;
    }

    public final void zza(zzezq zzezqVar, zzezn zzeznVar, int i10, @Nullable zzecg zzecgVar, long j10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzig)).booleanValue()) {
            zzfeu zzfeuVarZzb = zzfeu.zzb("adapter_status");
            zzfeuVarZzb.zzg(zzezqVar);
            zzfeuVarZzb.zzf(zzeznVar);
            zzfeuVarZzb.zza("adapter_l", String.valueOf(j10));
            zzfeuVarZzb.zza("sc", Integer.toString(i10));
            if (zzecgVar != null) {
                zzfeuVarZzb.zza("arec", Integer.toString(zzecgVar.zzb().zza));
                String strZza = this.zza.zza(zzecgVar.getMessage());
                if (strZza != null) {
                    zzfeuVarZzb.zza("areec", strZza);
                }
            }
            zzdnr zzdnrVarZzb = this.zzb.zzb(zzeznVar.zzu);
            if (zzdnrVarZzb != null) {
                zzfeuVarZzb.zza("ancn", zzdnrVarZzb.zza);
                zzbqh zzbqhVar = zzdnrVarZzb.zzb;
                if (zzbqhVar != null) {
                    zzfeuVarZzb.zza("adapter_v", zzbqhVar.toString());
                }
                zzbqh zzbqhVar2 = zzdnrVarZzb.zzc;
                if (zzbqhVar2 != null) {
                    zzfeuVarZzb.zza("adapter_sv", zzbqhVar2.toString());
                }
            }
            this.zzd.zzb(zzfeuVarZzb);
            return;
        }
        zzdpz zzdpzVarZza = this.zzc.zza();
        zzdpzVarZza.zze(zzezqVar);
        zzdpzVarZza.zzd(zzeznVar);
        zzdpzVarZza.zzb("action", "adapter_status");
        zzdpzVarZza.zzb("adapter_l", String.valueOf(j10));
        zzdpzVarZza.zzb("sc", Integer.toString(i10));
        if (zzecgVar != null) {
            zzdpzVarZza.zzb("arec", Integer.toString(zzecgVar.zzb().zza));
            String strZza2 = this.zza.zza(zzecgVar.getMessage());
            if (strZza2 != null) {
                zzdpzVarZza.zzb("areec", strZza2);
            }
        }
        zzdnr zzdnrVarZzb2 = this.zzb.zzb(zzeznVar.zzu);
        if (zzdnrVarZzb2 != null) {
            zzdpzVarZza.zzb("ancn", zzdnrVarZzb2.zza);
            zzbqh zzbqhVar3 = zzdnrVarZzb2.zzb;
            if (zzbqhVar3 != null) {
                zzdpzVarZza.zzb("adapter_v", zzbqhVar3.toString());
            }
            zzbqh zzbqhVar4 = zzdnrVarZzb2.zzc;
            if (zzbqhVar4 != null) {
                zzdpzVarZza.zzb("adapter_sv", zzbqhVar4.toString());
            }
        }
        zzdpzVarZza.zzg();
    }
}
