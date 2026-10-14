package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgda extends zzgdb {
    public zzgda(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzgdb
    public final zzgcz zza(byte[] bArr, int i10) throws InvalidKeyException {
        return new zzgcy(bArr, i10);
    }
}
