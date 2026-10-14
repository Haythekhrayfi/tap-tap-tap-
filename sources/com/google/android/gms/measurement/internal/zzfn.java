package com.google.android.gms.measurement.internal;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzfn implements com.google.android.gms.internal.measurement.zzr {
    public final /* synthetic */ zzfp zza;

    public zzfn(zzfp zzfpVar) {
        this.zza = zzfpVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzr
    public final void zza(int i10, String str, List list, boolean z10, boolean z11) {
        zzem zzemVarZzc;
        int i11 = i10 - 1;
        if (i11 == 0) {
            zzemVarZzc = this.zza.zzs.zzay().zzc();
        } else if (i11 == 1) {
            zzeo zzeoVarZzay = this.zza.zzs.zzay();
            if (z10) {
                zzemVarZzc = zzeoVarZzay.zzh();
            } else {
                zzemVarZzc = !z11 ? zzeoVarZzay.zze() : zzeoVarZzay.zzd();
            }
        } else if (i11 == 3) {
            zzemVarZzc = this.zza.zzs.zzay().zzj();
        } else if (i11 != 4) {
            zzemVarZzc = this.zza.zzs.zzay().zzi();
        } else {
            zzeo zzeoVarZzay2 = this.zza.zzs.zzay();
            if (z10) {
                zzemVarZzc = zzeoVarZzay2.zzm();
            } else {
                zzemVarZzc = !z11 ? zzeoVarZzay2.zzl() : zzeoVarZzay2.zzk();
            }
        }
        int size = list.size();
        if (size == 1) {
            zzemVarZzc.zzb(str, list.get(0));
            return;
        }
        if (size == 2) {
            zzemVarZzc.zzc(str, list.get(0), list.get(1));
        } else if (size != 3) {
            zzemVarZzc.zza(str);
        } else {
            zzemVarZzc.zzd(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
