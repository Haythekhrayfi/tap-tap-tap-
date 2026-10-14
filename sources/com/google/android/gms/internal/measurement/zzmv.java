package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
final class zzmv extends zzmw {
    public zzmv(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final double zza(Object obj, long j10) {
        return Double.longBitsToDouble(zzk(obj, j10));
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final float zzb(Object obj, long j10) {
        return Float.intBitsToFloat(zzj(obj, j10));
    }

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.measurement.zzmx.zzj(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 boolean)' in method call: com.google.android.gms.internal.measurement.zzmx.zzj(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void zzc(Object obj, long j10, boolean z10) {
        if (zzmx.zzb) {
            zzmx.zzD(obj, j10, z10 ? (byte) 1 : (byte) 0);
        } else {
            zzmx.zzj(obj, j10, z10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void zzd(Object obj, long j10, byte b10) {
        if (zzmx.zzb) {
            zzmx.zzD(obj, j10, b10);
        } else {
            zzmx.zzE(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void zze(Object obj, long j10, double d10) {
        zzo(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void zzf(Object obj, long j10, float f10) {
        zzn(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final boolean zzg(Object obj, long j10) {
        return zzmx.zzb ? zzmx.zzt(obj, j10) : zzmx.zzu(obj, j10);
    }
}
