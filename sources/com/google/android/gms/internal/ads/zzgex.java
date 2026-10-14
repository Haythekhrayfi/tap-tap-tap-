package com.google.android.gms.internal.ads;

import androidx.activity.j;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzgex {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzgex(Class cls, Class cls2, zzgew zzgewVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgex)) {
            return false;
        }
        zzgex zzgexVar = (zzgex) obj;
        return zzgexVar.zza.equals(this.zza) && zzgexVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return j.a(this.zza.getSimpleName(), " with primitive type: ", this.zzb.getSimpleName());
    }
}
