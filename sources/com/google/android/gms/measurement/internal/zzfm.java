package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import q.f;

/* JADX INFO: loaded from: classes2.dex */
final class zzfm extends f {
    public final /* synthetic */ zzfp zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfm(zzfp zzfpVar, int i10) {
        super(20);
        this.zza = zzfpVar;
    }

    @Override // q.f
    public final /* bridge */ /* synthetic */ Object create(Object obj) {
        String str = (String) obj;
        Preconditions.checkNotEmpty(str);
        return zzfp.zzd(this.zza, str);
    }
}
