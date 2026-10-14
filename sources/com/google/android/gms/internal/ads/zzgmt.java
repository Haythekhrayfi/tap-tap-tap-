package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgmt implements zzgmy {
    @Override // com.google.android.gms.internal.ads.zzgmy
    public final /* bridge */ /* synthetic */ Object zza(String str, Provider provider) throws GeneralSecurityException {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }
}
