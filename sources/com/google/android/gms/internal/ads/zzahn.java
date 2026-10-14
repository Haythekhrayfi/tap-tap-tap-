package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzahn {
    private final zzaho zza = new zzaho();
    private final zzfa zzb = new zzfa(new byte[65025], 0);
    private int zzc = -1;
    private int zzd;
    private boolean zze;

    private final int zzf(int i10) {
        int i11;
        int i12 = 0;
        this.zzd = 0;
        do {
            int i13 = this.zzd;
            int i14 = i10 + i13;
            zzaho zzahoVar = this.zza;
            if (i14 >= zzahoVar.zzc) {
                break;
            }
            int[] iArr = zzahoVar.zzf;
            this.zzd = i13 + 1;
            i11 = iArr[i14];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public final zzfa zza() {
        return this.zzb;
    }

    public final zzaho zzb() {
        return this.zza;
    }

    public final void zzc() {
        this.zza.zza();
        this.zzb.zzC(0);
        this.zzc = -1;
        this.zze = false;
    }

    public final void zzd() {
        zzfa zzfaVar = this.zzb;
        if (zzfaVar.zzH().length == 65025) {
            return;
        }
        zzfaVar.zzD(Arrays.copyOf(zzfaVar.zzH(), Math.max(65025, zzfaVar.zzd())), this.zzb.zzd());
    }

    public final boolean zze(zzaax zzaaxVar) throws IOException {
        if (this.zze) {
            this.zze = false;
            this.zzb.zzC(0);
        }
        while (true) {
            if (this.zze) {
                return true;
            }
            int i10 = this.zzc;
            if (i10 < 0) {
                if (!this.zza.zzc(zzaaxVar, -1L) || !this.zza.zzb(zzaaxVar, true)) {
                    return false;
                }
                zzaho zzahoVar = this.zza;
                int iZzf = zzahoVar.zzd;
                if ((zzahoVar.zza & 1) == 1 && this.zzb.zzd() == 0) {
                    iZzf += zzf(0);
                    i10 = this.zzd;
                } else {
                    i10 = 0;
                }
                if (!zzaba.zze(zzaaxVar, iZzf)) {
                    return false;
                }
                this.zzc = i10;
            }
            int iZzf2 = zzf(i10);
            int i11 = this.zzc + this.zzd;
            if (iZzf2 > 0) {
                zzfa zzfaVar = this.zzb;
                zzfaVar.zzz(zzfaVar.zzd() + iZzf2);
                zzfa zzfaVar2 = this.zzb;
                if (!zzaba.zzd(zzaaxVar, zzfaVar2.zzH(), zzfaVar2.zzd(), iZzf2)) {
                    return false;
                }
                zzfa zzfaVar3 = this.zzb;
                zzfaVar3.zzE(zzfaVar3.zzd() + iZzf2);
                this.zze = this.zza.zzf[i11 + (-1)] != 255;
            }
            if (i11 == this.zza.zzc) {
                i11 = -1;
            }
            this.zzc = i11;
        }
    }
}
