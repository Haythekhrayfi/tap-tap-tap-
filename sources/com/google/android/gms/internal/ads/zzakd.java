package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Pair;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzakd implements zzaaw {
    public static final zzabd zza = new zzabd() { // from class: com.google.android.gms.internal.ads.zzajz
        @Override // com.google.android.gms.internal.ads.zzabd
        public final /* synthetic */ zzaaw[] zza(Uri uri, Map map) {
            int i10 = zzabc.zza;
            zzabd zzabdVar = zzakd.zza;
            return new zzaaw[]{new zzakd()};
        }
    };
    private zzaaz zzb;
    private zzabz zzc;
    private zzakb zzf;
    private int zzd = 0;
    private long zze = -1;
    private int zzg = -1;
    private long zzh = -1;

    /* JADX WARN: Code duplicated, block: B:48:0x00e4  */
    @Override // com.google.android.gms.internal.ads.zzaaw
    public final int zza(zzaax zzaaxVar, zzabs zzabsVar) throws IOException {
        int i10;
        zzakb zzakcVar;
        zzdy.zzb(this.zzc);
        int i11 = zzfj.zza;
        int i12 = this.zzd;
        int iZzj = 4;
        if (i12 == 0) {
            zzdy.zzf(zzaaxVar.zzf() == 0);
            int i13 = this.zzg;
            if (i13 != -1) {
                ((zzaam) zzaaxVar).zzo(i13, false);
                this.zzd = 4;
            } else {
                if (!zzakg.zzc(zzaaxVar)) {
                    throw zzcd.zza("Unsupported or unrecognized wav file type.", null);
                }
                ((zzaam) zzaaxVar).zzo((int) (zzaaxVar.zze() - zzaaxVar.zzf()), false);
                this.zzd = 1;
            }
            return 0;
        }
        long jZzp = -1;
        if (i12 == 1) {
            zzfa zzfaVar = new zzfa(8);
            zzakf zzakfVarZza = zzakf.zza(zzaaxVar, zzfaVar);
            if (zzakfVarZza.zza != 1685272116) {
                zzaaxVar.zzj();
            } else {
                zzaam zzaamVar = (zzaam) zzaaxVar;
                zzaamVar.zzl(8, false);
                zzfaVar.zzF(0);
                zzaamVar.zzm(zzfaVar.zzH(), 0, 8, false);
                jZzp = zzfaVar.zzp();
                zzaamVar.zzo(((int) zzakfVarZza.zzb) + 8, false);
            }
            this.zze = jZzp;
            this.zzd = 2;
            return 0;
        }
        if (i12 != 2) {
            if (i12 != 3) {
                zzdy.zzf(this.zzh != -1);
                long jZzf = this.zzh - zzaaxVar.zzf();
                zzakb zzakbVar = this.zzf;
                Objects.requireNonNull(zzakbVar);
                return zzakbVar.zzc(zzaaxVar, jZzf) ? -1 : 0;
            }
            Pair pairZza = zzakg.zza(zzaaxVar);
            this.zzg = ((Long) pairZza.first).intValue();
            long jLongValue = ((Long) pairZza.second).longValue();
            long j10 = this.zze;
            if (j10 != -1 && jLongValue == 4294967295L) {
                jLongValue = j10;
            }
            long j11 = ((long) this.zzg) + jLongValue;
            this.zzh = j11;
            long jZzd = zzaaxVar.zzd();
            if (jZzd != -1 && j11 > jZzd) {
                StringBuilder sbA = i2.a.a("Data exceeds input length: ", j11, ", ");
                sbA.append(jZzd);
                zzer.zzf("WavExtractor", sbA.toString());
                this.zzh = jZzd;
                j11 = jZzd;
            }
            zzakb zzakbVar2 = this.zzf;
            Objects.requireNonNull(zzakbVar2);
            zzakbVar2.zza(this.zzg, j11);
            this.zzd = 4;
            return 0;
        }
        zzake zzakeVarZzb = zzakg.zzb(zzaaxVar);
        int i14 = zzakeVarZzb.zza;
        if (i14 == 17) {
            zzakcVar = new zzaka(this.zzb, this.zzc, zzakeVarZzb);
        } else if (i14 == 6) {
            zzakcVar = new zzakc(this.zzb, this.zzc, zzakeVarZzb, "audio/g711-alaw", -1);
        } else if (i14 == 7) {
            zzakcVar = new zzakc(this.zzb, this.zzc, zzakeVarZzb, "audio/g711-mlaw", -1);
        } else {
            int i15 = zzakeVarZzb.zze;
            if (i14 == 1) {
                iZzj = zzfj.zzj(i15);
                i10 = iZzj;
            } else {
                if (i14 != 3) {
                    if (i14 == 65534) {
                        iZzj = zzfj.zzj(i15);
                        i10 = iZzj;
                    }
                } else if (i15 == 32) {
                    i10 = iZzj;
                }
                i10 = 0;
            }
            if (i10 == 0) {
                throw zzcd.zzc("Unsupported WAV format type: " + i14);
            }
            zzakcVar = new zzakc(this.zzb, this.zzc, zzakeVarZzb, "audio/raw", i10);
        }
        this.zzf = zzakcVar;
        this.zzd = 3;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final void zzb(zzaaz zzaazVar) {
        this.zzb = zzaazVar;
        this.zzc = zzaazVar.zzv(0, 1);
        zzaazVar.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final void zzc(long j10, long j11) {
        this.zzd = j10 == 0 ? 0 : 4;
        zzakb zzakbVar = this.zzf;
        if (zzakbVar != null) {
            zzakbVar.zzb(j11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final boolean zzd(zzaax zzaaxVar) throws IOException {
        return zzakg.zzc(zzaaxVar);
    }
}
