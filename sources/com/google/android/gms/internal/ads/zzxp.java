package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
import okhttp3.internal.http2.Settings;

/* JADX INFO: loaded from: classes2.dex */
public final class zzxp {
    private int zza;
    private int zzb;
    private int zzc = 0;
    private zzxi[] zzd = new zzxi[100];

    public zzxp(boolean z10, int i10) {
    }

    public final synchronized int zza() {
        return this.zzb * 65536;
    }

    public final synchronized zzxi zzb() {
        zzxi zzxiVar;
        this.zzb++;
        int i10 = this.zzc;
        if (i10 > 0) {
            zzxi[] zzxiVarArr = this.zzd;
            int i11 = i10 - 1;
            this.zzc = i11;
            zzxiVar = zzxiVarArr[i11];
            Objects.requireNonNull(zzxiVar);
            zzxiVarArr[i11] = null;
        } else {
            zzxiVar = new zzxi(new byte[65536], 0);
            int i12 = this.zzb;
            zzxi[] zzxiVarArr2 = this.zzd;
            int length = zzxiVarArr2.length;
            if (i12 > length) {
                this.zzd = (zzxi[]) Arrays.copyOf(zzxiVarArr2, length + length);
                return zzxiVar;
            }
        }
        return zzxiVar;
    }

    public final synchronized void zzc(zzxi zzxiVar) {
        zzxi[] zzxiVarArr = this.zzd;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        zzxiVarArr[i10] = zzxiVar;
        this.zzb--;
        notifyAll();
    }

    public final synchronized void zzd(zzxj zzxjVar) {
        while (zzxjVar != null) {
            zzxi[] zzxiVarArr = this.zzd;
            int i10 = this.zzc;
            this.zzc = i10 + 1;
            zzxiVarArr[i10] = zzxjVar.zzc();
            this.zzb--;
            zzxjVar = zzxjVar.zzd();
        }
        notifyAll();
    }

    public final synchronized void zze() {
        zzf(0);
    }

    public final synchronized void zzf(int i10) {
        int i11 = this.zza;
        this.zza = i10;
        if (i10 < i11) {
            zzg();
        }
    }

    public final synchronized void zzg() {
        int i10 = this.zza;
        int i11 = zzfj.zza;
        int iMax = Math.max(0, ((i10 + Settings.DEFAULT_INITIAL_WINDOW_SIZE) / 65536) - this.zzb);
        int i12 = this.zzc;
        if (iMax >= i12) {
            return;
        }
        Arrays.fill(this.zzd, iMax, i12, (Object) null);
        this.zzc = iMax;
    }
}
