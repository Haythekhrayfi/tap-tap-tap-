package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class zzln {
    private final zzir zza;

    @Deprecated
    public zzln(Context context, zzcei zzceiVar) {
        this.zza = new zzir(context, zzceiVar);
    }

    @Deprecated
    public final zzln zza(final zzkk zzkkVar) {
        zzir zzirVar = this.zza;
        zzdy.zzf(!zzirVar.zzq);
        Objects.requireNonNull(zzkkVar);
        zzirVar.zzf = new zzfpx() { // from class: com.google.android.gms.internal.ads.zzij
            @Override // com.google.android.gms.internal.ads.zzfpx
            public final Object zza() {
                return zzkkVar;
            }
        };
        return this;
    }

    @Deprecated
    public final zzln zzb(final zzxg zzxgVar) {
        zzir zzirVar = this.zza;
        zzdy.zzf(!zzirVar.zzq);
        Objects.requireNonNull(zzxgVar);
        zzirVar.zze = new zzfpx() { // from class: com.google.android.gms.internal.ads.zzik
            @Override // com.google.android.gms.internal.ads.zzfpx
            public final Object zza() {
                return zzxgVar;
            }
        };
        return this;
    }

    @Deprecated
    public final zzlo zzc() {
        zzir zzirVar = this.zza;
        zzdy.zzf(!zzirVar.zzq);
        zzirVar.zzq = true;
        return new zzlo(zzirVar);
    }
}
