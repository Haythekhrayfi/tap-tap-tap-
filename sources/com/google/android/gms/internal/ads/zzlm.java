package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final class zzlm {
    public static final zzlm zza;
    public static final zzlm zzb;
    public static final zzlm zzc;
    public static final zzlm zzd;
    public static final zzlm zze;
    public final long zzf;
    public final long zzg;

    static {
        zzlm zzlmVar = new zzlm(0L, 0L);
        zza = zzlmVar;
        zzb = new zzlm(RecyclerView.FOREVER_NS, RecyclerView.FOREVER_NS);
        zzc = new zzlm(RecyclerView.FOREVER_NS, 0L);
        zzd = new zzlm(0L, RecyclerView.FOREVER_NS);
        zze = zzlmVar;
    }

    public zzlm(long j10, long j11) {
        zzdy.zzd(j10 >= 0);
        zzdy.zzd(j11 >= 0);
        this.zzf = j10;
        this.zzg = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzlm.class == obj.getClass()) {
            zzlm zzlmVar = (zzlm) obj;
            if (this.zzf == zzlmVar.zzf && this.zzg == zzlmVar.zzg) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzf) * 31) + ((int) this.zzg);
    }
}
