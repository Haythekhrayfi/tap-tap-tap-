package com.google.android.gms.internal.auth;

import android.content.Context;
import java.util.Objects;
import javax.annotation.Nullable;
import y.q;

/* JADX INFO: loaded from: classes2.dex */
final class zzcd extends zzda {
    private final Context zza;
    private final zzdj zzb;

    public zzcd(Context context, @Nullable zzdj zzdjVar) {
        Objects.requireNonNull(context, "Null context");
        this.zza = context;
        this.zzb = zzdjVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzda) {
            zzda zzdaVar = (zzda) obj;
            if (this.zza.equals(zzdaVar.zza())) {
                zzdj zzdjVar = this.zzb;
                zzdj zzdjVarZzb = zzdaVar.zzb();
                if (zzdjVar != null ? zzdjVar.equals(zzdjVarZzb) : zzdjVarZzb == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
        zzdj zzdjVar = this.zzb;
        return iHashCode ^ (zzdjVar == null ? 0 : zzdjVar.hashCode());
    }

    public final String toString() {
        return q.a("FlagsContext{context=", this.zza.toString(), ", hermeticFileOverrides=", String.valueOf(this.zzb), "}");
    }

    @Override // com.google.android.gms.internal.auth.zzda
    public final Context zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.auth.zzda
    @Nullable
    public final zzdj zzb() {
        return this.zzb;
    }
}
