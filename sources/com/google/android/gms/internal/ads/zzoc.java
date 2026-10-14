package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzoc {
    public static final zzoc zza;
    private final zzob zzb;

    static {
        zza = zzfj.zza < 31 ? new zzoc() : new zzoc(zzob.zza);
    }

    public zzoc() {
        this.zzb = null;
        zzdy.zzf(zzfj.zza < 31);
    }

    public zzoc(LogSessionId logSessionId) {
        this.zzb = new zzob(logSessionId);
    }

    private zzoc(zzob zzobVar) {
        this.zzb = zzobVar;
    }

    public final LogSessionId zza() {
        zzob zzobVar = this.zzb;
        Objects.requireNonNull(zzobVar);
        return zzobVar.zzb;
    }
}
