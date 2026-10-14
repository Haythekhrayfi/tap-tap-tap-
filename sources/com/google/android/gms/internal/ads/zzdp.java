package com.google.android.gms.internal.ads;

import android.support.v4.media.b;
import androidx.recyclerview.widget.o;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdp {
    public static final zzdp zza = new zzdp(-1, -1, -1);
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    public zzdp(int i10, int i11, int i12) {
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = zzfj.zzD(i12) ? zzfj.zzk(i12, i11) : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdp)) {
            return false;
        }
        zzdp zzdpVar = (zzdp) obj;
        return this.zzb == zzdpVar.zzb && this.zzc == zzdpVar.zzc && this.zzd == zzdpVar.zzd;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd)});
    }

    public final String toString() {
        int i10 = this.zzb;
        int i11 = this.zzc;
        return b.a(o.a("AudioFormat[sampleRate=", i10, ", channelCount=", i11, ", encoding="), this.zzd, "]");
    }
}
