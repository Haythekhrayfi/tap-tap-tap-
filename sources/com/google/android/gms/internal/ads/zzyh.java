package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class zzyh {
    private static final Comparator zza = new Comparator() { // from class: com.google.android.gms.internal.ads.zzyd
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((zzyg) obj).zza - ((zzyg) obj2).zza;
        }
    };
    private static final Comparator zzb = new Comparator() { // from class: com.google.android.gms.internal.ads.zzye
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((zzyg) obj).zzc, ((zzyg) obj2).zzc);
        }
    };
    private int zzf;
    private int zzg;
    private int zzh;
    private final zzyg[] zzd = new zzyg[5];
    private final ArrayList zzc = new ArrayList();
    private int zze = -1;

    public zzyh(int i10) {
    }

    public final float zza(float f10) {
        if (this.zze != 0) {
            Collections.sort(this.zzc, zzb);
            this.zze = 0;
        }
        float f11 = this.zzg;
        int i10 = 0;
        for (int i11 = 0; i11 < this.zzc.size(); i11++) {
            float f12 = 0.5f * f11;
            zzyg zzygVar = (zzyg) this.zzc.get(i11);
            i10 += zzygVar.zzb;
            if (i10 >= f12) {
                return zzygVar.zzc;
            }
        }
        if (this.zzc.isEmpty()) {
            return Float.NaN;
        }
        ArrayList arrayList = this.zzc;
        return ((zzyg) arrayList.get(arrayList.size() - 1)).zzc;
    }

    public final void zzb(int i10, float f10) {
        zzyg zzygVar;
        int i11;
        zzyg zzygVar2;
        int i12;
        if (this.zze != 1) {
            Collections.sort(this.zzc, zza);
            this.zze = 1;
        }
        int i13 = this.zzh;
        if (i13 > 0) {
            zzyg[] zzygVarArr = this.zzd;
            int i14 = i13 - 1;
            this.zzh = i14;
            zzygVar = zzygVarArr[i14];
        } else {
            zzygVar = new zzyg(null);
        }
        int i15 = this.zzf;
        this.zzf = i15 + 1;
        zzygVar.zza = i15;
        zzygVar.zzb = i10;
        zzygVar.zzc = f10;
        this.zzc.add(zzygVar);
        int i16 = this.zzg + i10;
        while (true) {
            this.zzg = i16;
            while (true) {
                int i17 = this.zzg;
                if (i17 <= 2000) {
                    return;
                }
                i11 = i17 - 2000;
                zzygVar2 = (zzyg) this.zzc.get(0);
                i12 = zzygVar2.zzb;
                if (i12 <= i11) {
                    this.zzg -= i12;
                    this.zzc.remove(0);
                    int i18 = this.zzh;
                    if (i18 < 5) {
                        zzyg[] zzygVarArr2 = this.zzd;
                        this.zzh = i18 + 1;
                        zzygVarArr2[i18] = zzygVar2;
                    }
                }
            }
            zzygVar2.zzb = i12 - i11;
            i16 = this.zzg - i11;
        }
    }

    public final void zzc() {
        this.zzc.clear();
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
    }
}
