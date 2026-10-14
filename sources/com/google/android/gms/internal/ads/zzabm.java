package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzabm {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final float zzf;
    public final String zzg;

    private zzabm(List list, int i10, int i11, int i12, int i13, int i14, int i15, float f10, String str) {
        this.zza = list;
        this.zzb = i10;
        this.zzc = i13;
        this.zzd = i14;
        this.zze = i15;
        this.zzf = f10;
        this.zzg = str;
    }

    public static zzabm zza(zzfa zzfaVar) throws zzcd {
        try {
            zzfaVar.zzG(21);
            int iZzk = zzfaVar.zzk() & 3;
            int iZzk2 = zzfaVar.zzk();
            int iZzc = zzfaVar.zzc();
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < iZzk2; i12++) {
                zzfaVar.zzG(1);
                int iZzo = zzfaVar.zzo();
                for (int i13 = 0; i13 < iZzo; i13++) {
                    int iZzo2 = zzfaVar.zzo();
                    i11 += iZzo2 + 4;
                    zzfaVar.zzG(iZzo2);
                }
            }
            zzfaVar.zzF(iZzc);
            byte[] bArr = new byte[i11];
            String strZzb = null;
            float f10 = 1.0f;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = 0;
            int i20 = 0;
            while (i19 < iZzk2) {
                int iZzk3 = zzfaVar.zzk() & 63;
                int iZzo3 = zzfaVar.zzo();
                int i21 = i10;
                while (i21 < iZzo3) {
                    int iZzo4 = zzfaVar.zzo();
                    int i22 = iZzk2;
                    System.arraycopy(zzfu.zza, i10, bArr, i20, 4);
                    int i23 = i20 + 4;
                    System.arraycopy(zzfaVar.zzH(), zzfaVar.zzc(), bArr, i23, iZzo4);
                    if (iZzk3 == 33 && i21 == 0) {
                        zzfr zzfrVarZzc = zzfu.zzc(bArr, i23 + 2, i23 + iZzo4);
                        i14 = zzfrVarZzc.zzg;
                        i15 = zzfrVarZzc.zzh;
                        i16 = zzfrVarZzc.zzj;
                        int i24 = zzfrVarZzc.zzk;
                        int i25 = zzfrVarZzc.zzl;
                        float f11 = zzfrVarZzc.zzi;
                        strZzb = zzea.zzb(zzfrVarZzc.zza, zzfrVarZzc.zzb, zzfrVarZzc.zzc, zzfrVarZzc.zzd, zzfrVarZzc.zze, zzfrVarZzc.zzf);
                        i21 = 0;
                        f10 = f11;
                        i17 = i24;
                        i18 = i25;
                    }
                    i20 = i23 + iZzo4;
                    zzfaVar.zzG(iZzo4);
                    i21++;
                    iZzk2 = i22;
                    iZzk3 = iZzk3;
                    iZzo3 = iZzo3;
                    i10 = 0;
                }
                i19++;
                i10 = 0;
            }
            return new zzabm(i11 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), iZzk + 1, i14, i15, i16, i17, i18, f10, strZzb);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw zzcd.zza("Error parsing HEVC config", e10);
        }
    }
}
