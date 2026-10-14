package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzfyk implements Comparable {
    private final byte[] zza;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzfyk zzfykVar = (zzfyk) obj;
        int length = this.zza.length;
        int length2 = zzfykVar.zza.length;
        if (length != length2) {
            return length - length2;
        }
        int i10 = 0;
        while (true) {
            byte[] bArr = this.zza;
            if (i10 >= bArr.length) {
                return 0;
            }
            byte b10 = bArr[i10];
            byte b11 = zzfykVar.zza[i10];
            if (b10 != b11) {
                return b10 - b11;
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzfyk) {
            return Arrays.equals(this.zza, ((zzfyk) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        return zzgmz.zza(this.zza);
    }
}
