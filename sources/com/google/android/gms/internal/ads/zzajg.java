package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzajg {
    private final zzaij zza;
    private final zzfh zzb;
    private final zzez zzc = new zzez(new byte[64], 64);
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    public zzajg(zzaij zzaijVar, zzfh zzfhVar) {
        this.zza = zzaijVar;
        this.zzb = zzfhVar;
    }

    public final void zza(zzfa zzfaVar) throws zzcd {
        long jZzb;
        char c10;
        zzfaVar.zzB(this.zzc.zza, 0, 3);
        this.zzc.zzj(0);
        this.zzc.zzl(8);
        this.zzd = this.zzc.zzn();
        this.zze = this.zzc.zzn();
        this.zzc.zzl(6);
        zzfaVar.zzB(this.zzc.zza, 0, this.zzc.zzd(8));
        this.zzc.zzj(0);
        if (this.zzd) {
            this.zzc.zzl(4);
            long jZzd = this.zzc.zzd(3);
            this.zzc.zzl(1);
            int iZzd = this.zzc.zzd(15) << 15;
            this.zzc.zzl(1);
            long jZzd2 = this.zzc.zzd(15);
            this.zzc.zzl(1);
            if (this.zzf || !this.zze) {
                c10 = 30;
            } else {
                this.zzc.zzl(4);
                long jZzd3 = ((long) this.zzc.zzd(3)) << 30;
                this.zzc.zzl(1);
                int iZzd2 = this.zzc.zzd(15) << 15;
                this.zzc.zzl(1);
                long jZzd4 = this.zzc.zzd(15);
                this.zzc.zzl(1);
                this.zzb.zzb(((long) iZzd2) | jZzd3 | jZzd4);
                this.zzf = true;
                c10 = 30;
            }
            jZzb = this.zzb.zzb((jZzd << c10) | ((long) iZzd) | jZzd2);
        } else {
            jZzb = 0;
        }
        this.zza.zzd(jZzb, 4);
        this.zza.zza(zzfaVar);
        this.zza.zzc();
    }

    public final void zzb() {
        this.zzf = false;
        this.zza.zze();
    }
}
