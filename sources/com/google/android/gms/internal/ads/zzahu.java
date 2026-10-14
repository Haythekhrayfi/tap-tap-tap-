package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzahu {
    private zzabz zzb;
    private zzaaz zzc;
    private zzahp zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private final zzahn zza = new zzahn();
    private zzahr zzj = new zzahr();

    public abstract long zza(zzfa zzfaVar);

    public void zzb(boolean z10) {
        int i10;
        if (z10) {
            this.zzj = new zzahr();
            this.zzf = 0L;
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.zzh = i10;
        this.zze = -1L;
        this.zzg = 0L;
    }

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public abstract boolean zzc(zzfa zzfaVar, long j10, zzahr zzahrVar) throws IOException;

    public final int zze(zzaax zzaaxVar, zzabs zzabsVar) throws IOException {
        zzdy.zzb(this.zzb);
        int i10 = zzfj.zza;
        int i11 = this.zzh;
        if (i11 == 0) {
            while (this.zza.zze(zzaaxVar)) {
                long jZzf = zzaaxVar.zzf();
                long j10 = this.zzf;
                this.zzk = jZzf - j10;
                if (!zzc(this.zza.zza(), j10, this.zzj)) {
                    zzam zzamVar = this.zzj.zza;
                    this.zzi = zzamVar.zzA;
                    if (!this.zzm) {
                        this.zzb.zzk(zzamVar);
                        this.zzm = true;
                    }
                    zzahp zzahpVar = this.zzj.zzb;
                    if (zzahpVar != null) {
                        this.zzd = zzahpVar;
                    } else if (zzaaxVar.zzd() == -1) {
                        this.zzd = new zzaht(null);
                    } else {
                        zzaho zzahoVarZzb = this.zza.zzb();
                        this.zzd = new zzahi(this, this.zzf, zzaaxVar.zzd(), zzahoVarZzb.zzd + zzahoVarZzb.zze, zzahoVarZzb.zzb, (zzahoVarZzb.zza & 4) != 0);
                    }
                    this.zzh = 2;
                    this.zza.zzd();
                    return 0;
                }
                this.zzf = zzaaxVar.zzf();
            }
            this.zzh = 3;
            return -1;
        }
        if (i11 == 1) {
            ((zzaam) zzaaxVar).zzo((int) this.zzf, false);
            this.zzh = 2;
            return 0;
        }
        if (i11 != 2) {
            return -1;
        }
        long jZzd = this.zzd.zzd(zzaaxVar);
        if (jZzd >= 0) {
            zzabsVar.zza = jZzd;
            return 1;
        }
        if (jZzd < -1) {
            zzi(-(jZzd + 2));
        }
        if (!this.zzl) {
            zzabv zzabvVarZze = this.zzd.zze();
            zzdy.zzb(zzabvVarZze);
            this.zzc.zzN(zzabvVarZze);
            this.zzl = true;
        }
        if (this.zzk <= 0 && !this.zza.zze(zzaaxVar)) {
            this.zzh = 3;
            return -1;
        }
        this.zzk = 0L;
        zzfa zzfaVarZza = this.zza.zza();
        long jZza = zza(zzfaVarZza);
        if (jZza >= 0) {
            long j11 = this.zzg;
            if (j11 + jZza >= this.zze) {
                long jZzf2 = zzf(j11);
                zzabx.zzb(this.zzb, zzfaVarZza, zzfaVarZza.zzd());
                this.zzb.zzs(jZzf2, 1, zzfaVarZza.zzd(), 0, null);
                this.zze = -1L;
            }
        }
        this.zzg += jZza;
        return 0;
    }

    public final long zzf(long j10) {
        return (j10 * 1000000) / ((long) this.zzi);
    }

    public final long zzg(long j10) {
        return (((long) this.zzi) * j10) / 1000000;
    }

    public final void zzh(zzaaz zzaazVar, zzabz zzabzVar) {
        this.zzc = zzaazVar;
        this.zzb = zzabzVar;
        zzb(true);
    }

    public void zzi(long j10) {
        this.zzg = j10;
    }

    public final void zzj(long j10, long j11) {
        this.zza.zzc();
        if (j10 == 0) {
            zzb(!this.zzl);
            return;
        }
        if (this.zzh != 0) {
            long jZzg = zzg(j11);
            this.zze = jZzg;
            zzahp zzahpVar = this.zzd;
            int i10 = zzfj.zza;
            zzahpVar.zzg(jZzg);
            this.zzh = 2;
        }
    }
}
