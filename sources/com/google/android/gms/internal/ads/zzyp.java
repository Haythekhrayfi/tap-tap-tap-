package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class zzyp implements zzdj {
    private static final zzfpx zza = zzfqa.zza(new zzfpx() { // from class: com.google.android.gms.internal.ads.zzyn
        @Override // com.google.android.gms.internal.ads.zzfpx
        public final Object zza() {
            try {
                Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                Object objInvoke = cls.getMethod("build", new Class[0]).invoke(cls.getConstructor(new Class[0]).newInstance(new Object[0]), new Object[0]);
                Objects.requireNonNull(objInvoke);
                return (zzdj) objInvoke;
            } catch (Exception e10) {
                throw new IllegalStateException(e10);
            }
        }
    });

    private zzyp() {
    }

    public /* synthetic */ zzyp(zzyo zzyoVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdj
    public final zzdl zza(Context context, List list, zzv zzvVar, zzs zzsVar, zzs zzsVar2, boolean z10, Executor executor, zzdk zzdkVar) throws zzdi {
        return ((zzdj) zza.zza()).zza(context, list, zzvVar, zzsVar, zzsVar2, false, executor, zzdkVar);
    }
}
