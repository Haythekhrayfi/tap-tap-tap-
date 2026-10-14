package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzajq implements zzaji {
    public final /* synthetic */ zzajr zza;
    private final zzez zzb = new zzez(new byte[5], 5);
    private final SparseArray zzc = new SparseArray();
    private final SparseIntArray zzd = new SparseIntArray();
    private final int zze;

    public zzajq(zzajr zzajrVar, int i10) {
        this.zza = zzajrVar;
        this.zze = i10;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:36:0x0103  */
    /* JADX WARN: Code duplicated, block: B:42:0x0119  */
    @Override // com.google.android.gms.internal.ads.zzaji
    public final void zza(zzfa zzfaVar) {
        zzfh zzfhVar;
        int i10;
        int i11;
        int i12;
        int i13;
        if (zzfaVar.zzk() != 2) {
            return;
        }
        zzfh zzfhVar2 = (zzfh) this.zza.zzb.get(0);
        if ((zzfaVar.zzk() & 128) == 0) {
            return;
        }
        zzfaVar.zzG(1);
        int iZzo = zzfaVar.zzo();
        int i14 = 3;
        zzfaVar.zzG(3);
        zzfaVar.zzA(this.zzb, 2);
        this.zzb.zzl(3);
        int i15 = 13;
        this.zza.zzq = this.zzb.zzd(13);
        zzfaVar.zzA(this.zzb, 2);
        int i16 = 4;
        this.zzb.zzl(4);
        int i17 = 12;
        zzfaVar.zzG(this.zzb.zzd(12));
        this.zzc.clear();
        this.zzd.clear();
        int iZza = zzfaVar.zza();
        while (iZza > 0) {
            int i18 = 5;
            zzfaVar.zzA(this.zzb, 5);
            int iZzd = this.zzb.zzd(8);
            this.zzb.zzl(i14);
            int iZzd2 = this.zzb.zzd(i15);
            this.zzb.zzl(i16);
            int iZzd3 = this.zzb.zzd(i17);
            int iZzc = zzfaVar.zzc();
            int i19 = iZzc + iZzd3;
            int i20 = -1;
            String strTrim = null;
            ArrayList arrayList = null;
            while (true) {
                if (zzfaVar.zzc() >= i19) {
                    i11 = i16;
                    break;
                }
                int iZzk = zzfaVar.zzk();
                int iZzc2 = zzfaVar.zzc() + zzfaVar.zzk();
                if (iZzc2 > i19) {
                    i11 = 4;
                    break;
                }
                if (iZzk == i18) {
                    long jZzs = zzfaVar.zzs();
                    if (jZzs == 1094921523) {
                        zzfhVar2 = zzfhVar2;
                        i20 = 129;
                    } else if (jZzs == 1161904947) {
                        zzfhVar2 = zzfhVar2;
                        i20 = 135;
                        i12 = 4;
                        iZzo = iZzo;
                    } else if (jZzs == 1094921524) {
                        zzfhVar2 = zzfhVar2;
                        i20 = 172;
                    } else if (jZzs == 1212503619) {
                        i13 = 36;
                        i20 = i13;
                    }
                    i12 = 4;
                } else if (iZzk == 106) {
                    zzfhVar2 = zzfhVar2;
                    i20 = 129;
                    i12 = 4;
                } else if (iZzk == 122) {
                    zzfhVar2 = zzfhVar2;
                    i20 = 135;
                    i12 = 4;
                    iZzo = iZzo;
                } else if (iZzk == 127) {
                    if (zzfaVar.zzk() == 21) {
                        zzfhVar2 = zzfhVar2;
                        i20 = 172;
                    }
                    i12 = 4;
                } else if (iZzk == 123) {
                    i13 = 138;
                    i20 = i13;
                    i12 = 4;
                } else if (iZzk == 10) {
                    strTrim = zzfaVar.zzx(3, zzfot.zzc).trim();
                    i12 = 4;
                } else {
                    int i21 = 3;
                    if (iZzk == 89) {
                        ArrayList arrayList2 = new ArrayList();
                        while (zzfaVar.zzc() < iZzc2) {
                            String strTrim2 = zzfaVar.zzx(i21, zzfot.zzc).trim();
                            int iZzk2 = zzfaVar.zzk();
                            zzfh zzfhVar3 = zzfhVar2;
                            byte[] bArr = new byte[4];
                            zzfaVar.zzB(bArr, 0, 4);
                            arrayList2.add(new zzajs(strTrim2, iZzk2, bArr));
                            zzfhVar2 = zzfhVar3;
                            iZzo = iZzo;
                            i21 = 3;
                        }
                        zzfhVar2 = zzfhVar2;
                        iZzo = iZzo;
                        i12 = 4;
                        arrayList = arrayList2;
                        i20 = 89;
                    } else {
                        zzfhVar2 = zzfhVar2;
                        iZzo = iZzo;
                        i12 = 4;
                        if (iZzk == 111) {
                            i20 = 257;
                        }
                    }
                }
                zzfaVar.zzG(iZzc2 - zzfaVar.zzc());
                i16 = i12;
                zzfhVar2 = zzfhVar2;
                iZzo = iZzo;
                i18 = 5;
            }
            zzfaVar.zzF(i19);
            zzajt zzajtVar = new zzajt(i20, strTrim, arrayList, Arrays.copyOfRange(zzfaVar.zzH(), iZzc, i19));
            if (iZzd == 6 || iZzd == 5) {
                iZzd = zzajtVar.zza;
            }
            iZza -= iZzd3 + 5;
            if (!this.zza.zzg.get(iZzd2)) {
                zzajw zzajwVarZza = this.zza.zze.zza(iZzd, zzajtVar);
                this.zzd.put(iZzd2, iZzd2);
                this.zzc.put(iZzd2, zzajwVarZza);
            }
            i16 = i11;
            zzfhVar2 = zzfhVar2;
            iZzo = iZzo;
            i14 = 3;
            i17 = 12;
            i15 = 13;
        }
        zzfh zzfhVar4 = zzfhVar2;
        int i22 = iZzo;
        int size = this.zzd.size();
        int i23 = 0;
        while (i23 < size) {
            int iKeyAt = this.zzd.keyAt(i23);
            int iValueAt = this.zzd.valueAt(i23);
            this.zza.zzg.put(iKeyAt, true);
            this.zza.zzh.put(iValueAt, true);
            zzajw zzajwVar = (zzajw) this.zzc.valueAt(i23);
            if (zzajwVar != null) {
                zzaaz zzaazVar = this.zza.zzk;
                i10 = i22;
                zzajv zzajvVar = new zzajv(i10, iKeyAt, 8192);
                zzfhVar = zzfhVar4;
                zzajwVar.zzb(zzfhVar, zzaazVar, zzajvVar);
                this.zza.zzf.put(iValueAt, zzajwVar);
            } else {
                zzfhVar = zzfhVar4;
                i10 = i22;
            }
            i23++;
            zzfhVar4 = zzfhVar;
            i22 = i10;
        }
        this.zza.zzf.remove(this.zze);
        this.zza.zzl = 0;
        zzajr zzajrVar = this.zza;
        if (zzajrVar.zzl == 0) {
            zzajrVar.zzk.zzC();
            this.zza.zzm = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaji
    public final void zzb(zzfh zzfhVar, zzaaz zzaazVar, zzajv zzajvVar) {
    }
}
