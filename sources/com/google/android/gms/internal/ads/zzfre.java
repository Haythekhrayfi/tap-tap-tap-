package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzfre extends zzfrh {
    public final /* synthetic */ zzfrl zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfre(zzfrl zzfrlVar) {
        super(zzfrlVar, null);
        this.zza = zzfrlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrh
    public final Object zza(int i10) {
        Object[] objArr = this.zza.zzc;
        Objects.requireNonNull(objArr);
        return objArr[i10];
    }
}
