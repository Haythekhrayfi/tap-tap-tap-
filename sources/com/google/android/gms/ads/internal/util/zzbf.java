package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzbf {
    private final String[] zza;
    private final double[] zzb;
    private final double[] zzc;
    private final int[] zzd;
    private int zze;

    public /* synthetic */ zzbf(zzbd zzbdVar, zzbe zzbeVar) {
        int size = zzbdVar.zzb.size();
        this.zza = (String[]) zzbdVar.zza.toArray(new String[size]);
        this.zzb = zzc(zzbdVar.zzb);
        this.zzc = zzc(zzbdVar.zzc);
        this.zzd = new int[size];
        this.zze = 0;
    }

    private static final double[] zzc(List list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i10 = 0; i10 < size; i10++) {
            dArr[i10] = ((Double) list.get(i10)).doubleValue();
        }
        return dArr;
    }

    public final List zza() {
        ArrayList arrayList = new ArrayList(this.zza.length);
        int i10 = 0;
        while (true) {
            String[] strArr = this.zza;
            if (i10 >= strArr.length) {
                return arrayList;
            }
            String str = strArr[i10];
            double d10 = this.zzc[i10];
            double d11 = this.zzb[i10];
            int i11 = this.zzd[i10];
            arrayList.add(new zzbc(str, d10, d11, ((double) i11) / ((double) this.zze), i11));
            i10++;
        }
    }

    public final void zzb(double d10) {
        this.zze++;
        int i10 = 0;
        while (true) {
            double[] dArr = this.zzc;
            if (i10 >= dArr.length) {
                return;
            }
            double d11 = dArr[i10];
            if (d11 <= d10 && d10 < this.zzb[i10]) {
                int[] iArr = this.zzd;
                iArr[i10] = iArr[i10] + 1;
            }
            if (d10 < d11) {
                return;
            } else {
                i10++;
            }
        }
    }
}
