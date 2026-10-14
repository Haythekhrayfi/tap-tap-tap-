package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import ch.qos.logback.core.FileAppender;
import ch.qos.logback.core.util.FileSize;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzajh implements zzaaw {
    public static final zzabd zza = new zzabd() { // from class: com.google.android.gms.internal.ads.zzajf
        @Override // com.google.android.gms.internal.ads.zzabd
        public final /* synthetic */ zzaaw[] zza(Uri uri, Map map) {
            int i10 = zzabc.zza;
            zzabd zzabdVar = zzajh.zza;
            return new zzaaw[]{new zzajh()};
        }
    };
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private long zzi;
    private zzajd zzj;
    private zzaaz zzk;
    private boolean zzl;
    private final zzfh zzb = new zzfh(0);
    private final zzfa zzd = new zzfa(4096);
    private final SparseArray zzc = new SparseArray();
    private final zzaje zze = new zzaje();

    /* JADX WARN: Code duplicated, block: B:65:0x0141  */
    @Override // com.google.android.gms.internal.ads.zzaaw
    public final int zza(zzaax zzaaxVar, zzabs zzabsVar) throws IOException {
        boolean z10;
        zzaij zzailVar;
        zzdy.zzb(this.zzk);
        long jZzd = zzaaxVar.zzd();
        if (jZzd != -1) {
            zzaje zzajeVar = this.zze;
            if (!zzajeVar.zze()) {
                return zzajeVar.zza(zzaaxVar, zzabsVar);
            }
        }
        if (!this.zzl) {
            this.zzl = true;
            zzaje zzajeVar2 = this.zze;
            if (zzajeVar2.zzb() != -9223372036854775807L) {
                zzajd zzajdVar = new zzajd(zzajeVar2.zzd(), zzajeVar2.zzb(), jZzd);
                this.zzj = zzajdVar;
                this.zzk.zzN(zzajdVar.zzb());
            } else {
                this.zzk.zzN(new zzabu(zzajeVar2.zzb(), 0L));
            }
        }
        zzajd zzajdVar2 = this.zzj;
        if (zzajdVar2 != null && zzajdVar2.zze()) {
            return zzajdVar2.zza(zzaaxVar, zzabsVar);
        }
        zzaaxVar.zzj();
        long jZze = jZzd != -1 ? jZzd - zzaaxVar.zze() : -1L;
        if ((jZze != -1 && jZze < 4) || !zzaaxVar.zzm(this.zzd.zzH(), 0, 4, true)) {
            return -1;
        }
        this.zzd.zzF(0);
        int iZze = this.zzd.zze();
        if (iZze == 441) {
            return -1;
        }
        if (iZze == 442) {
            zzaam zzaamVar = (zzaam) zzaaxVar;
            zzaamVar.zzm(this.zzd.zzH(), 0, 10, false);
            this.zzd.zzF(9);
            zzaamVar.zzo((this.zzd.zzk() & 7) + 14, false);
            return 0;
        }
        if (iZze == 443) {
            zzaam zzaamVar2 = (zzaam) zzaaxVar;
            zzaamVar2.zzm(this.zzd.zzH(), 0, 2, false);
            this.zzd.zzF(0);
            zzaamVar2.zzo(this.zzd.zzo() + 6, false);
            return 0;
        }
        if ((iZze >> 8) != 1) {
            ((zzaam) zzaaxVar).zzo(1, false);
            return 0;
        }
        int i10 = iZze & 255;
        zzajg zzajgVar = (zzajg) this.zzc.get(i10);
        if (!this.zzf) {
            if (zzajgVar == null) {
                zzaij zzaijVar = null;
                if (i10 == 189) {
                    zzailVar = new zzahz(null);
                    z10 = true;
                } else {
                    z10 = true;
                    if ((i10 & 224) == 192) {
                        zzailVar = new zzaix(null);
                    } else if ((i10 & 240) == 224) {
                        zzailVar = new zzail(null);
                        this.zzh = true;
                        this.zzi = zzaaxVar.zzf();
                        zzaijVar = zzailVar;
                    }
                    if (zzaijVar != null) {
                        zzaijVar.zzb(this.zzk, new zzajv(Integer.MIN_VALUE, i10, 256));
                        zzajgVar = new zzajg(zzaijVar, this.zzb);
                        this.zzc.put(i10, zzajgVar);
                    }
                }
                this.zzg = z10;
                this.zzi = zzaaxVar.zzf();
                zzaijVar = zzailVar;
                if (zzaijVar != null) {
                    zzaijVar.zzb(this.zzk, new zzajv(Integer.MIN_VALUE, i10, 256));
                    zzajgVar = new zzajg(zzaijVar, this.zzb);
                    this.zzc.put(i10, zzajgVar);
                }
            }
            boolean z11 = this.zzg;
            long j10 = FileSize.MB_COEFFICIENT;
            if (z11 && this.zzh) {
                j10 = this.zzi + FileAppender.DEFAULT_BUFFER_SIZE;
            }
            if (zzaaxVar.zzf() > j10) {
                this.zzf = true;
                this.zzk.zzC();
            }
        }
        zzaam zzaamVar3 = (zzaam) zzaaxVar;
        zzaamVar3.zzm(this.zzd.zzH(), 0, 2, false);
        this.zzd.zzF(0);
        int iZzo = this.zzd.zzo() + 6;
        if (zzajgVar == null) {
            zzaamVar3.zzo(iZzo, false);
        } else {
            this.zzd.zzC(iZzo);
            zzaamVar3.zzn(this.zzd.zzH(), 0, iZzo, false);
            this.zzd.zzF(6);
            zzajgVar.zza(this.zzd);
            zzfa zzfaVar = this.zzd;
            zzfaVar.zzE(zzfaVar.zzb());
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final void zzb(zzaaz zzaazVar) {
        this.zzk = zzaazVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    @Override // com.google.android.gms.internal.ads.zzaaw
    public final void zzc(long j10, long j11) {
        zzfh zzfhVar = this.zzb;
        if (zzfhVar.zze() != -9223372036854775807L) {
            long jZzc = zzfhVar.zzc();
            if (jZzc != -9223372036854775807L && jZzc != 0 && jZzc != j11) {
                zzfhVar.zzf(j11);
            }
        } else {
            zzfhVar.zzf(j11);
        }
        zzajd zzajdVar = this.zzj;
        if (zzajdVar != null) {
            zzajdVar.zzd(j11);
        }
        for (int i10 = 0; i10 < this.zzc.size(); i10++) {
            ((zzajg) this.zzc.valueAt(i10)).zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final boolean zzd(zzaax zzaaxVar) throws IOException {
        byte[] bArr = new byte[14];
        zzaam zzaamVar = (zzaam) zzaaxVar;
        zzaamVar.zzm(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        zzaamVar.zzl(bArr[13] & 7, false);
        zzaamVar.zzm(bArr, 0, 3, false);
        return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
    }
}
