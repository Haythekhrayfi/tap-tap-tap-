package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdzf implements zzdbz {
    private final String zzc;
    private final zzfev zzd;
    private boolean zza = false;
    private boolean zzb = false;
    private final com.google.android.gms.ads.internal.util.zzg zze = com.google.android.gms.ads.internal.zzt.zzo().zzh();

    public zzdzf(String str, zzfev zzfevVar) {
        this.zzc = str;
        this.zzd = zzfevVar;
    }

    private final zzfeu zzg(String str) {
        String str2 = this.zze.zzP() ? "" : this.zzc;
        zzfeu zzfeuVarZzb = zzfeu.zzb(str);
        zzfeuVarZzb.zza("tms", Long.toString(com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime(), 10));
        zzfeuVarZzb.zza("tid", str2);
        return zzfeuVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdbz
    public final void zza(String str) {
        zzfev zzfevVar = this.zzd;
        zzfeu zzfeuVarZzg = zzg("aaia");
        zzfeuVarZzg.zza("aair", "MalformedJson");
        zzfevVar.zzb(zzfeuVarZzg);
    }

    @Override // com.google.android.gms.internal.ads.zzdbz
    public final void zzb(String str, String str2) {
        zzfev zzfevVar = this.zzd;
        zzfeu zzfeuVarZzg = zzg("adapter_init_finished");
        zzfeuVarZzg.zza("ancn", str);
        zzfeuVarZzg.zza("rqe", str2);
        zzfevVar.zzb(zzfeuVarZzg);
    }

    @Override // com.google.android.gms.internal.ads.zzdbz
    public final void zzc(String str) {
        zzfev zzfevVar = this.zzd;
        zzfeu zzfeuVarZzg = zzg("adapter_init_started");
        zzfeuVarZzg.zza("ancn", str);
        zzfevVar.zzb(zzfeuVarZzg);
    }

    @Override // com.google.android.gms.internal.ads.zzdbz
    public final void zzd(String str) {
        zzfev zzfevVar = this.zzd;
        zzfeu zzfeuVarZzg = zzg("adapter_init_finished");
        zzfeuVarZzg.zza("ancn", str);
        zzfevVar.zzb(zzfeuVarZzg);
    }

    @Override // com.google.android.gms.internal.ads.zzdbz
    public final synchronized void zze() {
        if (this.zzb) {
            return;
        }
        this.zzd.zzb(zzg("init_finished"));
        this.zzb = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdbz
    public final synchronized void zzf() {
        if (this.zza) {
            return;
        }
        this.zzd.zzb(zzg("init_started"));
        this.zza = true;
    }
}
