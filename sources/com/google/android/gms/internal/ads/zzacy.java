package com.google.android.gms.internal.ads;

import android.net.Uri;
import ch.qos.logback.core.util.FileUtil;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzacy implements zzaaw {
    public static final zzabd zza = new zzabd() { // from class: com.google.android.gms.internal.ads.zzacx
        @Override // com.google.android.gms.internal.ads.zzabd
        public final /* synthetic */ zzaaw[] zza(Uri uri, Map map) {
            int i10 = zzabc.zza;
            zzabd zzabdVar = zzacy.zza;
            return new zzaaw[]{new zzacy(0)};
        }
    };
    private final byte[] zzb;
    private final zzfa zzc;
    private final zzabe zzd;
    private zzaaz zze;
    private zzabz zzf;
    private int zzg;
    private zzbz zzh;
    private zzabj zzi;
    private int zzj;
    private int zzk;
    private zzacw zzl;
    private int zzm;
    private long zzn;

    public zzacy() {
        this(0);
    }

    public zzacy(int i10) {
        this.zzb = new byte[42];
        this.zzc = new zzfa(new byte[FileUtil.BUF_SIZE], 0);
        this.zzd = new zzabe();
        this.zzg = 0;
    }

    private final long zze(zzfa zzfaVar, boolean z10) {
        boolean zZzc;
        Objects.requireNonNull(this.zzi);
        int iZzc = zzfaVar.zzc();
        while (iZzc <= zzfaVar.zzd() - 16) {
            zzfaVar.zzF(iZzc);
            if (zzabf.zzc(zzfaVar, this.zzi, this.zzk, this.zzd)) {
                zzfaVar.zzF(iZzc);
                return this.zzd.zza;
            }
            iZzc++;
        }
        if (!z10) {
            zzfaVar.zzF(iZzc);
            return -1L;
        }
        while (iZzc <= zzfaVar.zzd() - this.zzj) {
            zzfaVar.zzF(iZzc);
            try {
                zZzc = zzabf.zzc(zzfaVar, this.zzi, this.zzk, this.zzd);
            } catch (IndexOutOfBoundsException unused) {
                zZzc = false;
            }
            if (zzfaVar.zzc() <= zzfaVar.zzd() && zZzc) {
                zzfaVar.zzF(iZzc);
                return this.zzd.zza;
            }
            iZzc++;
        }
        zzfaVar.zzF(zzfaVar.zzd());
        return -1L;
    }

    private final void zzf() {
        long j10 = this.zzn * 1000000;
        zzabj zzabjVar = this.zzi;
        int i10 = zzfj.zza;
        this.zzf.zzs(j10 / ((long) zzabjVar.zze), 1, this.zzm, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final int zza(zzaax zzaaxVar, zzabs zzabsVar) throws Throwable {
        boolean zZzn;
        zzabv zzabuVar;
        boolean z10;
        int i10 = this.zzg;
        if (i10 == 0) {
            zzaaxVar.zzj();
            long jZze = zzaaxVar.zze();
            zzbz zzbzVarZza = zzabg.zza(zzaaxVar, true);
            ((zzaam) zzaaxVar).zzo((int) (zzaaxVar.zze() - jZze), false);
            this.zzh = zzbzVarZza;
            this.zzg = 1;
            return 0;
        }
        if (i10 == 1) {
            ((zzaam) zzaaxVar).zzm(this.zzb, 0, 42, false);
            zzaaxVar.zzj();
            this.zzg = 2;
            return 0;
        }
        if (i10 == 2) {
            zzfa zzfaVar = new zzfa(4);
            ((zzaam) zzaaxVar).zzn(zzfaVar.zzH(), 0, 4, false);
            if (zzfaVar.zzs() != 1716281667) {
                throw zzcd.zza("Failed to read FLAC stream marker.", null);
            }
            this.zzg = 3;
            return 0;
        }
        if (i10 == 3) {
            zzabj zzabjVarZze = this.zzi;
            do {
                zzaaxVar.zzj();
                zzez zzezVar = new zzez(new byte[4], 4);
                zzaam zzaamVar = (zzaam) zzaaxVar;
                zzaamVar.zzm(zzezVar.zza, 0, 4, false);
                zZzn = zzezVar.zzn();
                int iZzd = zzezVar.zzd(7);
                int iZzd2 = zzezVar.zzd(24) + 4;
                if (iZzd == 0) {
                    byte[] bArr = new byte[38];
                    zzaamVar.zzn(bArr, 0, 38, false);
                    zzabjVarZze = new zzabj(bArr, 4);
                } else {
                    if (zzabjVarZze == null) {
                        throw new IllegalArgumentException();
                    }
                    if (iZzd == 3) {
                        zzfa zzfaVar2 = new zzfa(iZzd2);
                        zzaamVar.zzn(zzfaVar2.zzH(), 0, iZzd2, false);
                        zzabjVarZze = zzabjVarZze.zzf(zzabg.zzb(zzfaVar2));
                    } else if (iZzd == 4) {
                        zzfa zzfaVar3 = new zzfa(iZzd2);
                        zzaamVar.zzn(zzfaVar3.zzH(), 0, iZzd2, false);
                        zzfaVar3.zzG(4);
                        zzabjVarZze = zzabjVarZze.zzg(Arrays.asList(zzacf.zzc(zzfaVar3, false, false).zzb));
                    } else if (iZzd == 6) {
                        zzfa zzfaVar4 = new zzfa(iZzd2);
                        zzaamVar.zzn(zzfaVar4.zzH(), 0, iZzd2, false);
                        zzfaVar4.zzG(4);
                        zzabjVarZze = zzabjVarZze.zze(zzfsc.zzm(zzads.zzb(zzfaVar4)));
                    } else {
                        zzaamVar.zzo(iZzd2, false);
                    }
                }
                int i11 = zzfj.zza;
                this.zzi = zzabjVarZze;
            } while (!zZzn);
            Objects.requireNonNull(zzabjVarZze);
            this.zzj = Math.max(zzabjVarZze.zzc, 6);
            this.zzf.zzk(this.zzi.zzc(this.zzb, this.zzh));
            this.zzg = 4;
            return 0;
        }
        if (i10 == 4) {
            zzaaxVar.zzj();
            zzfa zzfaVar5 = new zzfa(2);
            ((zzaam) zzaaxVar).zzm(zzfaVar5.zzH(), 0, 2, false);
            int iZzo = zzfaVar5.zzo();
            int i12 = iZzo >> 2;
            zzaaxVar.zzj();
            if (i12 != 16382) {
                throw zzcd.zza("First frame does not start with sync code.", null);
            }
            this.zzk = iZzo;
            zzaaz zzaazVar = this.zze;
            int i13 = zzfj.zza;
            long jZzf = zzaaxVar.zzf();
            long jZzd = zzaaxVar.zzd();
            zzabj zzabjVar = this.zzi;
            Objects.requireNonNull(zzabjVar);
            if (zzabjVar.zzk != null) {
                zzabuVar = new zzabh(zzabjVar, jZzf);
            } else if (jZzd == -1 || zzabjVar.zzj <= 0) {
                zzabuVar = new zzabu(zzabjVar.zza(), 0L);
            } else {
                zzacw zzacwVar = new zzacw(zzabjVar, this.zzk, jZzf, jZzd);
                this.zzl = zzacwVar;
                zzabuVar = zzacwVar.zzb();
            }
            zzaazVar.zzN(zzabuVar);
            this.zzg = 5;
            return 0;
        }
        Objects.requireNonNull(this.zzf);
        zzabj zzabjVar2 = this.zzi;
        Objects.requireNonNull(zzabjVar2);
        zzacw zzacwVar2 = this.zzl;
        if (zzacwVar2 != null && zzacwVar2.zze()) {
            return zzacwVar2.zza(zzaaxVar, zzabsVar);
        }
        if (this.zzn == -1) {
            this.zzn = zzabf.zzb(zzaaxVar, zzabjVar2);
            return 0;
        }
        zzfa zzfaVar6 = this.zzc;
        int iZzd3 = zzfaVar6.zzd();
        if (iZzd3 < 32768) {
            int iZza = zzaaxVar.zza(zzfaVar6.zzH(), iZzd3, FileUtil.BUF_SIZE - iZzd3);
            z10 = iZza == -1;
            if (!z10) {
                this.zzc.zzE(iZzd3 + iZza);
            } else if (this.zzc.zza() == 0) {
                zzf();
                return -1;
            }
        } else {
            z10 = false;
        }
        zzfa zzfaVar7 = this.zzc;
        int iZzc = zzfaVar7.zzc();
        int i14 = this.zzm;
        int i15 = this.zzj;
        if (i14 < i15) {
            zzfaVar7.zzG(Math.min(i15 - i14, zzfaVar7.zza()));
        }
        long jZze2 = zze(this.zzc, z10);
        zzfa zzfaVar8 = this.zzc;
        int iZzc2 = zzfaVar8.zzc() - iZzc;
        zzfaVar8.zzF(iZzc);
        zzabx.zzb(this.zzf, this.zzc, iZzc2);
        this.zzm += iZzc2;
        if (jZze2 != -1) {
            zzf();
            this.zzm = 0;
            this.zzn = jZze2;
        }
        zzfa zzfaVar9 = this.zzc;
        if (zzfaVar9.zza() >= 16) {
            return 0;
        }
        int iZza2 = zzfaVar9.zza();
        System.arraycopy(zzfaVar9.zzH(), zzfaVar9.zzc(), zzfaVar9.zzH(), 0, iZza2);
        this.zzc.zzF(0);
        this.zzc.zzE(iZza2);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final void zzb(zzaaz zzaazVar) {
        this.zze = zzaazVar;
        this.zzf = zzaazVar.zzv(0, 1);
        zzaazVar.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final void zzc(long j10, long j11) {
        if (j10 == 0) {
            this.zzg = 0;
        } else {
            zzacw zzacwVar = this.zzl;
            if (zzacwVar != null) {
                zzacwVar.zzd(j11);
            }
        }
        this.zzn = j11 != 0 ? -1L : 0L;
        this.zzm = 0;
        this.zzc.zzC(0);
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final boolean zzd(zzaax zzaaxVar) throws Throwable {
        zzabg.zza(zzaaxVar, false);
        zzfa zzfaVar = new zzfa(4);
        ((zzaam) zzaaxVar).zzm(zzfaVar.zzH(), 0, 4, false);
        return zzfaVar.zzs() == 1716281667;
    }
}
