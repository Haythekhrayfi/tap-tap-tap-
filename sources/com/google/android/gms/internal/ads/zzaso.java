package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaso extends zzath {
    private final Map zzi;
    private final View zzj;
    private final Context zzk;

    public zzaso(zzart zzartVar, String str, String str2, zzanq zzanqVar, int i10, int i11, Map map, View view, Context context) {
        super(zzartVar, "8A6/EDFVHoT40S+hatGoptnyThtgSNe3d9RgnDPM1sB7IlgQEsqPlgL1Jhl6dC4s", "93eE6DMOIbdNN+XzPfwTeV3VtXW82G23sIL9X3G1CFc=", zzanqVar, i10, 85);
        this.zzi = map;
        this.zzj = view;
        this.zzk = context;
    }

    private final long zzc(int i10) {
        Map map = this.zzi;
        Integer numValueOf = Integer.valueOf(i10);
        if (map.containsKey(numValueOf)) {
            return ((Long) this.zzi.get(numValueOf)).longValue();
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzath
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        long[] jArr = {zzc(1), zzc(2)};
        Context contextZzb = this.zzk;
        if (contextZzb == null) {
            contextZzb = this.zzb.zzb();
        }
        long[] jArr2 = (long[]) this.zzf.invoke(null, jArr, contextZzb, this.zzj);
        long j10 = jArr2[0];
        this.zzi.put(1, Long.valueOf(jArr2[1]));
        long j11 = jArr2[2];
        this.zzi.put(2, Long.valueOf(jArr2[3]));
        synchronized (this.zze) {
            this.zze.zzv(j10);
            this.zze.zzu(j11);
        }
    }
}
