package com.google.android.gms.internal.ads;

import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class zzch {
    public final float zzc;
    public final float zzd;
    private final int zzg;
    public static final zzch zza = new zzch(1.0f, 1.0f);
    private static final String zze = Integer.toString(0, 36);
    private static final String zzf = Integer.toString(1, 36);
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzcg
    };

    public zzch(float f10, float f11) {
        zzdy.zzd(f10 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        zzdy.zzd(f11 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        this.zzc = f10;
        this.zzd = f11;
        this.zzg = Math.round(f10 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzch.class == obj.getClass()) {
            zzch zzchVar = (zzch) obj;
            if (this.zzc == zzchVar.zzc && this.zzd == zzchVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.zzc) + 527) * 31) + Float.floatToRawIntBits(this.zzd);
    }

    public final String toString() {
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.zzc), Float.valueOf(this.zzd));
    }

    public final long zza(long j10) {
        return j10 * ((long) this.zzg);
    }
}
