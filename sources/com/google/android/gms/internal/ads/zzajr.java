package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzajr implements zzaaw {
    public static final zzabd zza = new zzabd() { // from class: com.google.android.gms.internal.ads.zzajo
        @Override // com.google.android.gms.internal.ads.zzabd
        public final /* synthetic */ zzaaw[] zza(Uri uri, Map map) {
            int i10 = zzabc.zza;
            zzabd zzabdVar = zzajr.zza;
            return new zzaaw[]{new zzajr(0)};
        }
    };
    private final List zzb;
    private final zzfa zzc;
    private final SparseIntArray zzd;
    private final zzaju zze;
    private final SparseArray zzf;
    private final SparseBooleanArray zzg;
    private final SparseBooleanArray zzh;
    private final zzajn zzi;
    private zzajm zzj;
    private zzaaz zzk;
    private int zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private int zzp;
    private int zzq;

    public zzajr() {
        this(0);
    }

    public zzajr(int i10) {
        this(1, new zzfh(0L), new zzaig(0), 112800);
    }

    public zzajr(int i10, zzfh zzfhVar, zzaju zzajuVar, int i11) {
        this.zze = zzajuVar;
        this.zzb = Collections.singletonList(zzfhVar);
        this.zzc = new zzfa(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.zzg = sparseBooleanArray;
        this.zzh = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.zzf = sparseArray;
        this.zzd = new SparseIntArray();
        this.zzi = new zzajn(112800);
        this.zzk = zzaaz.zza;
        this.zzq = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i12 = 0; i12 < size; i12++) {
            this.zzf.put(sparseArray2.keyAt(i12), (zzajw) sparseArray2.valueAt(i12));
        }
        this.zzf.put(0, new zzajj(new zzajp(this)));
    }

    /* JADX WARN: Code duplicated, block: B:86:0x018c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [int] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.util.SparseBooleanArray] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.google.android.gms.internal.ads.zzajw] */
    /* JADX WARN: Type inference failed for: r8v6 */
    @Override // com.google.android.gms.internal.ads.zzaaw
    public final int zza(zzaax zzaaxVar, zzabs zzabsVar) throws IOException {
        ?? r10;
        ?? r11;
        zzajw zzajwVar;
        long j10;
        boolean z10;
        long jZzd = zzaaxVar.zzd();
        if (this.zzm) {
            if (jZzd != -1) {
                zzajn zzajnVar = this.zzi;
                if (!zzajnVar.zzd()) {
                    return zzajnVar.zza(zzaaxVar, zzabsVar, this.zzq);
                }
            }
            if (this.zzn) {
                j10 = 0;
            } else {
                this.zzn = true;
                zzajn zzajnVar2 = this.zzi;
                if (zzajnVar2.zzb() != -9223372036854775807L) {
                    j10 = 0;
                    zzajm zzajmVar = new zzajm(zzajnVar2.zzc(), zzajnVar2.zzb(), jZzd, this.zzq, 112800);
                    this.zzj = zzajmVar;
                    this.zzk.zzN(zzajmVar.zzb());
                } else {
                    j10 = 0;
                    this.zzk.zzN(new zzabu(zzajnVar2.zzb(), 0L));
                }
            }
            if (this.zzo) {
                z10 = false;
                this.zzo = false;
                zzc(j10, j10);
                if (zzaaxVar.zzf() != j10) {
                    zzabsVar.zza = j10;
                    return 1;
                }
            } else {
                z10 = false;
            }
            zzajm zzajmVar2 = this.zzj;
            r10 = z10;
            if (zzajmVar2 != null && zzajmVar2.zze()) {
                r10 = z10;
                return zzajmVar2.zza(zzaaxVar, zzabsVar);
            }
        } else {
            r10 = 0;
        }
        r10 = z10;
        zzfa zzfaVar = this.zzc;
        byte[] bArrZzH = zzfaVar.zzH();
        if (9400 - zzfaVar.zzc() < 188) {
            int iZza = zzfaVar.zza();
            if (iZza > 0) {
                System.arraycopy(bArrZzH, zzfaVar.zzc(), bArrZzH, r10, iZza);
            }
            this.zzc.zzD(bArrZzH, iZza);
        }
        while (true) {
            zzfa zzfaVar2 = this.zzc;
            if (zzfaVar2.zza() >= 188) {
                int iZzc = zzfaVar2.zzc();
                int iZzd = zzfaVar2.zzd();
                int iZza2 = zzajx.zza(zzfaVar2.zzH(), iZzc, iZzd);
                this.zzc.zzF(iZza2);
                int i10 = iZza2 + 188;
                if (i10 > iZzd) {
                    this.zzp = (iZza2 - iZzc) + this.zzp;
                } else {
                    this.zzp = r10;
                }
                zzfa zzfaVar3 = this.zzc;
                int iZzd2 = zzfaVar3.zzd();
                if (i10 > iZzd2) {
                    return r10;
                }
                int iZze = zzfaVar3.zze();
                if ((8388608 & iZze) == 0) {
                    ?? r12 = (4194304 & iZze) != 0 ? 1 : r10;
                    int i11 = iZze & 32;
                    int i12 = (iZze >> 8) & 8191;
                    if ((iZze & 16) != 0) {
                        zzajwVar = (zzajw) this.zzf.get(i12);
                    } else {
                        r11 = 0;
                    }
                    if (r11 != 0) {
                        int i13 = iZze & 15;
                        int i14 = this.zzd.get(i12, i13 - 1);
                        this.zzd.put(i12, i13);
                        if (i14 != i13) {
                            if (i13 != ((i14 + 1) & 15)) {
                                r11 = zzajwVar;
                                r11.zzc();
                            }
                            if (i11 != 0) {
                                int iZzk = this.zzc.zzk();
                                r12 = (r12 == true ? 1 : 0) | ((this.zzc.zzk() & 64) != 0 ? 2 : r10);
                                this.zzc.zzG(iZzk - 1);
                            }
                            boolean z11 = this.zzm;
                            if (z11 || !this.zzh.get(i12, r10)) {
                                this.zzc.zzE(i10);
                                r11.zza(this.zzc, r12);
                                this.zzc.zzE(iZzd2);
                                if (!z11) {
                                    if (this.zzm && jZzd != -1) {
                                        this.zzo = true;
                                    }
                                }
                            } else if (this.zzm) {
                                this.zzo = true;
                            }
                        }
                    }
                }
                r11 = zzajwVar;
                r11 = zzajwVar;
                this.zzc.zzF(i10);
                return r10;
            }
            int iZzd3 = zzfaVar2.zzd();
            int iZza3 = zzaaxVar.zza(bArrZzH, iZzd3, 9400 - iZzd3);
            if (iZza3 == -1) {
                return -1;
            }
            this.zzc.zzE(iZzd3 + iZza3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final void zzb(zzaaz zzaazVar) {
        this.zzk = zzaazVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0031  */
    @Override // com.google.android.gms.internal.ads.zzaaw
    public final void zzc(long j10, long j11) {
        zzajm zzajmVar;
        int size = this.zzb.size();
        for (int i10 = 0; i10 < size; i10++) {
            zzfh zzfhVar = (zzfh) this.zzb.get(i10);
            if (zzfhVar.zze() != -9223372036854775807L) {
                long jZzc = zzfhVar.zzc();
                if (jZzc != -9223372036854775807L && jZzc != 0 && jZzc != j11) {
                    zzfhVar.zzf(j11);
                }
            } else {
                zzfhVar.zzf(j11);
            }
        }
        if (j11 != 0 && (zzajmVar = this.zzj) != null) {
            zzajmVar.zzd(j11);
        }
        this.zzc.zzC(0);
        this.zzd.clear();
        for (int i11 = 0; i11 < this.zzf.size(); i11++) {
            ((zzajw) this.zzf.valueAt(i11)).zzc();
        }
        this.zzp = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final boolean zzd(zzaax zzaaxVar) throws IOException {
        byte[] bArrZzH = this.zzc.zzH();
        zzaam zzaamVar = (zzaam) zzaaxVar;
        zzaamVar.zzm(bArrZzH, 0, 940, false);
        for (int i10 = 0; i10 < 188; i10++) {
            int i11 = 0;
            while (true) {
                if (i11 >= 5) {
                    zzaamVar.zzo(i10, false);
                    return true;
                }
                if (bArrZzH[(i11 * 188) + i10] != 71) {
                    break;
                }
                i11++;
            }
        }
        return false;
    }
}
