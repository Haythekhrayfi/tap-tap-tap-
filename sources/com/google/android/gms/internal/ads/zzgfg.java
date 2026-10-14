package com.google.android.gms.internal.ads;

import androidx.activity.j;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzgfg {
    private final Class zza;
    private final zzgnk zzb;

    public /* synthetic */ zzgfg(Class cls, zzgnk zzgnkVar, zzgff zzgffVar) {
        this.zza = cls;
        this.zzb = zzgnkVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgfg)) {
            return false;
        }
        zzgfg zzgfgVar = (zzgfg) obj;
        return zzgfgVar.zza.equals(this.zza) && zzgfgVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return j.a(this.zza.getSimpleName(), ", object identifier: ", String.valueOf(this.zzb));
    }
}
