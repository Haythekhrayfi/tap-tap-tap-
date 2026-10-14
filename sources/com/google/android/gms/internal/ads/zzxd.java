package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzxd extends zzxg {
    private zzxc zza;

    public abstract Pair zzb(zzxc zzxcVar, int[][][] iArr, int[] iArr2, zzto zztoVar, zzcw zzcwVar) throws zzih;

    @Override // com.google.android.gms.internal.ads.zzxg
    public final zzxh zzo(zzlk[] zzlkVarArr, zzvn zzvnVar, zzto zztoVar, zzcw zzcwVar) throws zzih {
        boolean z10;
        int[] iArr;
        int[] iArr2 = new int[3];
        zzcy[][] zzcyVarArr = new zzcy[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = zzvnVar.zzc;
            zzcyVarArr[i10] = new zzcy[i11];
            iArr3[i10] = new int[i11][];
        }
        int i12 = 2;
        int[] iArr4 = new int[2];
        for (int i13 = 0; i13 < 2; i13++) {
            iArr4[i13] = zzlkVarArr[i13].zze();
        }
        int i14 = 0;
        while (i14 < zzvnVar.zzc) {
            zzcy zzcyVarZzb = zzvnVar.zzb(i14);
            int i15 = zzcyVarZzb.zzd;
            int i16 = i12;
            int i17 = 0;
            int i18 = 0;
            boolean z11 = true;
            while (i17 < i12) {
                zzlk zzlkVar = zzlkVarArr[i17];
                int iMax = 0;
                for (int i19 = 0; i19 <= 0; i19++) {
                    iMax = Math.max(iMax, zzlkVar.zzR(zzcyVarZzb.zzb(i19)) & 7);
                }
                boolean z12 = iArr2[i17] == 0;
                if (iMax > i18) {
                    z11 = z12;
                    i16 = i17;
                    i18 = iMax;
                } else if (iMax == i18 && i15 == 5 && !z11 && z12) {
                    i16 = i17;
                    i18 = iMax;
                    z11 = true;
                }
                i17++;
                i12 = 2;
            }
            if (i16 == i12) {
                iArr = new int[1];
            } else {
                zzlk zzlkVar2 = zzlkVarArr[i16];
                int[] iArr5 = new int[1];
                for (int i20 = 0; i20 <= 0; i20++) {
                    iArr5[i20] = zzlkVar2.zzR(zzcyVarZzb.zzb(i20));
                }
                iArr = iArr5;
            }
            int i21 = iArr2[i16];
            zzcyVarArr[i16][i21] = zzcyVarZzb;
            iArr3[i16][i21] = iArr;
            iArr2[i16] = i21 + 1;
            i14++;
            i12 = 2;
        }
        zzvn[] zzvnVarArr = new zzvn[i12];
        String[] strArr = new String[i12];
        int[] iArr6 = new int[i12];
        int i22 = 0;
        while (i22 < i12) {
            int i23 = iArr2[i22];
            zzvnVarArr[i22] = new zzvn((zzcy[]) zzfj.zzG(zzcyVarArr[i22], i23));
            iArr3[i22] = (int[][]) zzfj.zzG(iArr3[i22], i23);
            strArr[i22] = zzlkVarArr[i22].zzN();
            iArr6[i22] = zzlkVarArr[i22].zzb();
            i22++;
            i12 = 2;
        }
        int i24 = i12;
        zzxc zzxcVar = new zzxc(strArr, iArr6, zzvnVarArr, iArr4, iArr3, new zzvn((zzcy[]) zzfj.zzG(zzcyVarArr[i24], iArr2[i24])));
        Pair pairZzb = zzb(zzxcVar, iArr3, iArr4, zztoVar, zzcwVar);
        zzxe[] zzxeVarArr = (zzxe[]) pairZzb.second;
        List[] listArr = new List[zzxeVarArr.length];
        for (int i25 = 0; i25 < zzxeVarArr.length; i25++) {
            zzxe zzxeVar = zzxeVarArr[i25];
            listArr[i25] = zzxeVar != null ? zzfsc.zzm(zzxeVar) : zzfsc.zzl();
        }
        zzfrz zzfrzVar = new zzfrz();
        for (int i26 = 0; i26 < 2; i26++) {
            zzvn zzvnVarZzd = zzxcVar.zzd(i26);
            List list = listArr[i26];
            for (int i27 = 0; i27 < zzvnVarZzd.zzc; i27++) {
                zzcy zzcyVarZzb2 = zzvnVarZzd.zzb(i27);
                boolean z13 = zzxcVar.zza(i26, i27, false) != 0;
                int i28 = zzcyVarZzb2.zzb;
                int[] iArr7 = new int[1];
                boolean[] zArr = new boolean[1];
                for (int i29 = 0; i29 <= 0; i29++) {
                    iArr7[i29] = zzxcVar.zzb(i26, i27, i29) & 7;
                    int i30 = 0;
                    while (true) {
                        if (i30 >= list.size()) {
                            z10 = false;
                            break;
                        }
                        zzxe zzxeVar2 = (zzxe) list.get(i30);
                        if (zzxeVar2.zze().equals(zzcyVarZzb2) && zzxeVar2.zzb(i29) != -1) {
                            z10 = true;
                            break;
                        }
                        i30++;
                    }
                    zArr[i29] = z10;
                }
                zzfrzVar.zzf(new zzdg(zzcyVarZzb2, z13, iArr7, zArr));
            }
        }
        zzvn zzvnVarZze = zzxcVar.zze();
        for (int i31 = 0; i31 < zzvnVarZze.zzc; i31++) {
            zzcy zzcyVarZzb3 = zzvnVarZze.zzb(i31);
            int i32 = zzcyVarZzb3.zzb;
            int[] iArr8 = new int[1];
            Arrays.fill(iArr8, 0);
            zzfrzVar.zzf(new zzdg(zzcyVarZzb3, false, iArr8, new boolean[1]));
        }
        return new zzxh((zzll[]) pairZzb.first, (zzxa[]) pairZzb.second, new zzdh(zzfrzVar.zzi()), zzxcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zzp(Object obj) {
        this.zza = (zzxc) obj;
    }
}
