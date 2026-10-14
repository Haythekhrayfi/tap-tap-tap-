package com.google.android.gms.internal.measurement;

import android.content.Context;
import java.util.Objects;
import javax.annotation.Nullable;
import y.q;

/* JADX INFO: loaded from: classes2.dex */
final class zzhb extends zzhy {
    private final Context zza;
    private final zzih zzb;

    public zzhb(Context context, @Nullable zzih zzihVar) {
        Objects.requireNonNull(context, "Null context");
        this.zza = context;
        this.zzb = zzihVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzhy) {
            zzhy zzhyVar = (zzhy) obj;
            if (this.zza.equals(zzhyVar.zza())) {
                zzih zzihVar = this.zzb;
                zzih zzihVarZzb = zzhyVar.zzb();
                if (zzihVar != null ? zzihVar.equals(zzihVarZzb) : zzihVarZzb == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
        zzih zzihVar = this.zzb;
        return iHashCode ^ (zzihVar == null ? 0 : zzihVar.hashCode());
    }

    public final String toString() {
        return q.a("FlagsContext{context=", this.zza.toString(), ", hermeticFileOverrides=", String.valueOf(this.zzb), "}");
    }

    @Override // com.google.android.gms.internal.measurement.zzhy
    public final Context zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzhy
    @Nullable
    public final zzih zzb() {
        return this.zzb;
    }
}
