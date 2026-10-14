package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaab {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final float zzh;
    public final String zzi;

    private zzaab(List list, int i10, int i11, int i12, int i13, int i14, int i15, float f10, String str) {
        this.zza = list;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = i13;
        this.zzf = i14;
        this.zzg = i15;
        this.zzh = f10;
        this.zzi = str;
    }

    public static zzaab zza(zzfa zzfaVar) throws zzcd {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        String strZza;
        float f10;
        try {
            zzfaVar.zzG(4);
            int iZzk = (zzfaVar.zzk() & 3) + 1;
            if (iZzk == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iZzk2 = zzfaVar.zzk() & 31;
            for (int i15 = 0; i15 < iZzk2; i15++) {
                arrayList.add(zzb(zzfaVar));
            }
            int iZzk3 = zzfaVar.zzk();
            for (int i16 = 0; i16 < iZzk3; i16++) {
                arrayList.add(zzb(zzfaVar));
            }
            if (iZzk2 > 0) {
                zzft zzftVarZze = zzfu.zze((byte[]) arrayList.get(0), iZzk + 1, ((byte[]) arrayList.get(0)).length);
                int i17 = zzftVarZze.zze;
                int i18 = zzftVarZze.zzf;
                int i19 = zzftVarZze.zzh;
                int i20 = zzftVarZze.zzi;
                int i21 = zzftVarZze.zzj;
                float f11 = zzftVarZze.zzg;
                strZza = zzea.zza(zzftVarZze.zza, zzftVarZze.zzb, zzftVarZze.zzc);
                i13 = i20;
                i14 = i21;
                f10 = f11;
                i10 = i17;
                i11 = i18;
                i12 = i19;
            } else {
                i10 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                strZza = null;
                f10 = 1.0f;
            }
            return new zzaab(arrayList, iZzk, i10, i11, i12, i13, i14, f10, strZza);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw zzcd.zza("Error parsing AVC config", e10);
        }
    }

    private static byte[] zzb(zzfa zzfaVar) {
        int iZzo = zzfaVar.zzo();
        int iZzc = zzfaVar.zzc();
        zzfaVar.zzG(iZzo);
        return zzea.zzc(zzfaVar.zzH(), iZzc, iZzo);
    }
}
