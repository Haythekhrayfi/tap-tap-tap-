package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
final class zzgsn extends zzgsp {
    public zzgsn(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.ads.zzgsp
    public final byte zza(long j10) {
        return Memory.peekByte((int) j10);
    }

    @Override // com.google.android.gms.internal.ads.zzgsp
    public final double zzb(Object obj, long j10) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.ads.zzgsp
    public final float zzc(Object obj, long j10) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.ads.zzgsp
    public final void zzd(long j10, byte[] bArr, long j11, long j12) {
        Memory.peekByteArray((int) j10, bArr, (int) j11, (int) j12);
    }

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.ads.zzgsq.zzk(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.ads.zzgsq.zzl(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to replace arg (r3v0 'z' boolean A[IMMUTABLE_TYPE, METHOD_ARGUMENT]) for method inline: com.google.android.gms.internal.ads.zzgsq.zzk(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z10' boolean)' in method call: com.google.android.gms.internal.ads.zzgsq.zzl(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.ads.zzgsp
    public final void zze(Object obj, long j10, boolean z10) {
        if (zzgsq.zzb) {
            zzgsq.zzk(obj, j10, z10);
        } else {
            zzgsq.zzl(obj, j10, z10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgsp
    public final void zzf(Object obj, long j10, byte b10) {
        if (zzgsq.zzb) {
            zzgsq.zzG(obj, j10, b10);
        } else {
            zzgsq.zzH(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgsp
    public final void zzg(Object obj, long j10, double d10) {
        this.zza.putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.ads.zzgsp
    public final void zzh(Object obj, long j10, float f10) {
        this.zza.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.ads.zzgsp
    public final boolean zzi(Object obj, long j10) {
        return zzgsq.zzb ? zzgsq.zzw(obj, j10) : zzgsq.zzx(obj, j10);
    }
}
