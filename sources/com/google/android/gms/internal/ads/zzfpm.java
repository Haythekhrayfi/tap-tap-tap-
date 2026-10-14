package com.google.android.gms.internal.ads;

import androidx.activity.j;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
final class zzfpm extends zzfpd {
    private final Object zza;

    public zzfpm(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof zzfpm) {
            return this.zza.equals(((zzfpm) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        return j.a("Optional.of(", this.zza.toString(), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzfpd
    public final zzfpd zza(zzfov zzfovVar) {
        Object objApply = zzfovVar.apply(this.zza);
        zzfph.zzc(objApply, "the Function passed to Optional.transform() must not return null.");
        return new zzfpm(objApply);
    }

    @Override // com.google.android.gms.internal.ads.zzfpd
    public final Object zzb(Object obj) {
        return this.zza;
    }
}
