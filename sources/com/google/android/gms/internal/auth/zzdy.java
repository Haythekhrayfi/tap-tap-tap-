package com.google.android.gms.internal.auth;

import android.support.v4.media.a;
import n1.c;

/* JADX INFO: loaded from: classes2.dex */
final class zzdy extends zzeb {
    private final int zzc;

    public zzdy(byte[] bArr, int i10, int i11) {
        super(bArr);
        zzee.zzi(0, i11, bArr.length);
        this.zzc = i11;
    }

    @Override // com.google.android.gms.internal.auth.zzeb, com.google.android.gms.internal.auth.zzee
    public final byte zza(int i10) {
        int i11 = this.zzc;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.zza[i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(a.a("Index < 0: ", i10));
        }
        throw new ArrayIndexOutOfBoundsException(c.a("Index > length: ", i10, ", ", i11));
    }

    @Override // com.google.android.gms.internal.auth.zzeb, com.google.android.gms.internal.auth.zzee
    public final byte zzb(int i10) {
        return this.zza[i10];
    }

    @Override // com.google.android.gms.internal.auth.zzeb
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.auth.zzeb, com.google.android.gms.internal.auth.zzee
    public final int zzd() {
        return this.zzc;
    }
}
