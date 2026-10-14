package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzfcs {
    private final long zza;
    private long zzc;
    private final zzfcr zzb = new zzfcr();
    private int zzd = 0;
    private int zze = 0;
    private int zzf = 0;

    public zzfcs() {
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
        this.zza = jCurrentTimeMillis;
        this.zzc = jCurrentTimeMillis;
    }

    public final int zza() {
        return this.zzd;
    }

    public final long zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final zzfcr zzd() {
        zzfcr zzfcrVarClone = this.zzb.clone();
        zzfcr zzfcrVar = this.zzb;
        zzfcrVar.zza = false;
        zzfcrVar.zzb = 0;
        return zzfcrVarClone;
    }

    public final String zze() {
        StringBuilder sbA = defpackage.a.a("Created: ");
        sbA.append(this.zza);
        sbA.append(" Last accessed: ");
        sbA.append(this.zzc);
        sbA.append(" Accesses: ");
        sbA.append(this.zzd);
        sbA.append("\nEntries retrieved: Valid: ");
        sbA.append(this.zze);
        sbA.append(" Stale: ");
        sbA.append(this.zzf);
        return sbA.toString();
    }

    public final void zzf() {
        this.zzc = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
        this.zzd++;
    }

    public final void zzg() {
        this.zzf++;
        this.zzb.zzb++;
    }

    public final void zzh() {
        this.zze++;
        this.zzb.zza = true;
    }
}
