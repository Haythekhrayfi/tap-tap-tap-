package com.google.android.gms.internal.ads;

import androidx.activity.j;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgnk {
    private final byte[] zza;

    private zzgnk(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        this.zza = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i11);
    }

    public static zzgnk zzb(byte[] bArr) {
        Objects.requireNonNull(bArr, "data must be non-null");
        return new zzgnk(bArr, 0, bArr.length);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgnk) {
            return Arrays.equals(((zzgnk) obj).zza, this.zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        return j.a("Bytes(", zzgmz.zza(this.zza), ")");
    }

    public final int zza() {
        return this.zza.length;
    }
}
