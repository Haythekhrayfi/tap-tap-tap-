package com.google.android.gms.internal.common;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzw extends zzj {
    public final CharSequence zzb;
    public final zzo zzc;
    public final boolean zzd;
    public int zze = 0;
    public int zzf = Integer.MAX_VALUE;

    public zzw(zzx zzxVar, CharSequence charSequence) {
        this.zzc = zzxVar.zza;
        this.zzd = zzxVar.zzb;
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.common.zzj
    @CheckForNull
    public final /* bridge */ /* synthetic */ Object zza() {
        int i10;
        int iZzd;
        int iZzc;
        do {
            i10 = this.zze;
            while (true) {
                int i11 = this.zze;
                if (i11 == -1) {
                    zzb();
                    return null;
                }
                iZzd = zzd(i11);
                if (iZzd == -1) {
                    iZzd = this.zzb.length();
                    this.zze = -1;
                    iZzc = -1;
                } else {
                    iZzc = zzc(iZzd);
                    this.zze = iZzc;
                }
                if (iZzc == i10) {
                    int i12 = iZzc + 1;
                    this.zze = i12;
                    if (i12 > this.zzb.length()) {
                        this.zze = -1;
                    }
                }
            }
            if (i10 < iZzd) {
                this.zzb.charAt(i10);
            }
            if (i10 < iZzd) {
                this.zzb.charAt(iZzd - 1);
            }
            if (!this.zzd) {
                break;
            }
        } while (i10 == iZzd);
        int i13 = this.zzf;
        if (i13 == 1) {
            iZzd = this.zzb.length();
            this.zze = -1;
            if (iZzd > i10) {
                this.zzb.charAt(iZzd - 1);
            }
        } else {
            this.zzf = i13 - 1;
        }
        return this.zzb.subSequence(i10, iZzd).toString();
    }

    public abstract int zzc(int i10);

    public abstract int zzd(int i10);
}
