package com.google.android.gms.internal.ads;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzfps extends zzfom {
    public final CharSequence zzb;
    public final zzfos zzc;
    public int zzd = 0;
    public int zze = Integer.MAX_VALUE;

    public zzfps(zzfpu zzfpuVar, CharSequence charSequence) {
        this.zzc = zzfpuVar.zza;
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.ads.zzfom
    @CheckForNull
    public final /* bridge */ /* synthetic */ Object zza() {
        int iZzc;
        int i10 = this.zzd;
        while (true) {
            int i11 = this.zzd;
            if (i11 == -1) {
                zzb();
                return null;
            }
            int iZzd = zzd(i11);
            if (iZzd == -1) {
                iZzd = this.zzb.length();
                this.zzd = -1;
                iZzc = -1;
            } else {
                iZzc = zzc(iZzd);
                this.zzd = iZzc;
            }
            if (iZzc != i10) {
                if (i10 < iZzd) {
                    this.zzb.charAt(i10);
                }
                if (i10 < iZzd) {
                    this.zzb.charAt(iZzd - 1);
                }
                int i12 = this.zze;
                if (i12 == 1) {
                    iZzd = this.zzb.length();
                    this.zzd = -1;
                    if (iZzd > i10) {
                        this.zzb.charAt(iZzd - 1);
                    }
                } else {
                    this.zze = i12 - 1;
                }
                return this.zzb.subSequence(i10, iZzd).toString();
            }
            int i13 = iZzc + 1;
            this.zzd = i13;
            if (i13 > this.zzb.length()) {
                this.zzd = -1;
            }
        }
    }

    public abstract int zzc(int i10);

    public abstract int zzd(int i10);
}
