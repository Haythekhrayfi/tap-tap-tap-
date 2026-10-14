package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaix implements zzaij {
    private final zzfa zza;
    private final zzabp zzb;
    private final String zzc;
    private zzabz zzd;
    private String zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private boolean zzi;
    private long zzj;
    private int zzk;
    private long zzl;

    public zzaix() {
        this(null);
    }

    public zzaix(String str) {
        this.zzf = 0;
        zzfa zzfaVar = new zzfa(4);
        this.zza = zzfaVar;
        zzfaVar.zzH()[0] = -1;
        this.zzb = new zzabp();
        this.zzl = -9223372036854775807L;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzaij
    public final void zza(zzfa zzfaVar) {
        zzdy.zzb(this.zzd);
        while (zzfaVar.zza() > 0) {
            int i10 = this.zzf;
            if (i10 == 0) {
                byte[] bArrZzH = zzfaVar.zzH();
                int iZzc = zzfaVar.zzc();
                int iZzd = zzfaVar.zzd();
                while (true) {
                    if (iZzc >= iZzd) {
                        zzfaVar.zzF(iZzd);
                        break;
                    }
                    byte b10 = bArrZzH[iZzc];
                    boolean z10 = (b10 & 255) == 255;
                    boolean z11 = this.zzi && (b10 & 224) == 224;
                    this.zzi = z10;
                    if (z11) {
                        zzfaVar.zzF(iZzc + 1);
                        this.zzi = false;
                        this.zza.zzH()[1] = bArrZzH[iZzc];
                        this.zzg = 2;
                        this.zzf = 1;
                        break;
                        break;
                    }
                    iZzc++;
                }
            } else if (i10 != 1) {
                int iMin = Math.min(zzfaVar.zza(), this.zzk - this.zzg);
                this.zzd.zzq(zzfaVar, iMin);
                int i11 = this.zzg + iMin;
                this.zzg = i11;
                int i12 = this.zzk;
                if (i11 >= i12) {
                    long j10 = this.zzl;
                    if (j10 != -9223372036854775807L) {
                        this.zzd.zzs(j10, 1, i12, 0, null);
                        this.zzl += this.zzj;
                    }
                    this.zzg = 0;
                    this.zzf = 0;
                }
            } else {
                int iMin2 = Math.min(zzfaVar.zza(), 4 - this.zzg);
                zzfaVar.zzB(this.zza.zzH(), this.zzg, iMin2);
                int i13 = this.zzg + iMin2;
                this.zzg = i13;
                if (i13 >= 4) {
                    this.zza.zzF(0);
                    if (!this.zzb.zza(this.zza.zze())) {
                        this.zzg = 0;
                        this.zzf = 1;
                        break;
                    }
                    zzabp zzabpVar = this.zzb;
                    this.zzk = zzabpVar.zzc;
                    if (!this.zzh) {
                        this.zzj = (((long) zzabpVar.zzg) * 1000000) / ((long) zzabpVar.zzd);
                        zzak zzakVar = new zzak();
                        zzakVar.zzH(this.zze);
                        zzakVar.zzS(this.zzb.zzb);
                        zzakVar.zzL(4096);
                        zzakVar.zzw(this.zzb.zze);
                        zzakVar.zzT(this.zzb.zzd);
                        zzakVar.zzK(this.zzc);
                        this.zzd.zzk(zzakVar.zzY());
                        this.zzh = true;
                    }
                    this.zza.zzF(0);
                    this.zzd.zzq(this.zza, 4);
                    this.zzf = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaij
    public final void zzb(zzaaz zzaazVar, zzajv zzajvVar) {
        zzajvVar.zzc();
        this.zze = zzajvVar.zzb();
        this.zzd = zzaazVar.zzv(zzajvVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaij
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzaij
    public final void zzd(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.zzl = j10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaij
    public final void zze() {
        this.zzf = 0;
        this.zzg = 0;
        this.zzi = false;
        this.zzl = -9223372036854775807L;
    }
}
