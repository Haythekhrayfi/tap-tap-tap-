package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzfrj extends zzfqw {
    public final /* synthetic */ zzfrl zza;
    private final Object zzb;
    private int zzc;

    public zzfrj(zzfrl zzfrlVar, int i10) {
        this.zza = zzfrlVar;
        Object[] objArr = zzfrlVar.zzb;
        Objects.requireNonNull(objArr);
        this.zzb = objArr[i10];
        this.zzc = i10;
    }

    private final void zza() {
        int i10 = this.zzc;
        if (i10 != -1 && i10 < this.zza.size()) {
            Object obj = this.zzb;
            zzfrl zzfrlVar = this.zza;
            int i11 = this.zzc;
            Object[] objArr = zzfrlVar.zzb;
            Objects.requireNonNull(objArr);
            if (zzfpc.zza(obj, objArr[i11])) {
                return;
            }
        }
        this.zzc = this.zza.zzq(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzfqw, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfqw, java.util.Map.Entry
    public final Object getValue() {
        Map mapZzj = this.zza.zzj();
        if (mapZzj != null) {
            return mapZzj.get(this.zzb);
        }
        zza();
        int i10 = this.zzc;
        if (i10 == -1) {
            return null;
        }
        Object[] objArr = this.zza.zzc;
        Objects.requireNonNull(objArr);
        return objArr[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzfqw, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map mapZzj = this.zza.zzj();
        if (mapZzj != null) {
            return mapZzj.put(this.zzb, obj);
        }
        zza();
        int i10 = this.zzc;
        if (i10 == -1) {
            this.zza.put(this.zzb, obj);
            return null;
        }
        Object[] objArr = this.zza.zzc;
        Objects.requireNonNull(objArr);
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }
}
