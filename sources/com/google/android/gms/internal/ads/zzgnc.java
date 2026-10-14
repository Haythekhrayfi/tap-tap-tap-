package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes2.dex */
final class zzgnc extends ThreadLocal {
    public final /* synthetic */ zzgnd zza;

    public zzgnc(zzgnd zzgndVar) {
        this.zza = zzgndVar;
    }

    @Override // java.lang.ThreadLocal
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() {
        try {
            Mac mac = (Mac) zzgmq.zzb.zza(this.zza.zzb);
            mac.init(this.zza.zzc);
            return mac;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
