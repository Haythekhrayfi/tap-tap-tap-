package com.google.android.gms.internal.ads;

import androidx.activity.j;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzgfi {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzgfi(Class cls, Class cls2, zzgfh zzgfhVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgfi)) {
            return false;
        }
        zzgfi zzgfiVar = (zzgfi) obj;
        return zzgfiVar.zza.equals(this.zza) && zzgfiVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return j.a(this.zza.getSimpleName(), " with serialization type: ", this.zzb.getSimpleName());
    }
}
