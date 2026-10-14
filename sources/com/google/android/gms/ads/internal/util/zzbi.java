package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzaks;
import com.google.android.gms.internal.ads.zzalo;
import com.google.android.gms.internal.ads.zzalp;
import com.google.android.gms.internal.ads.zzamo;
import com.google.android.gms.internal.ads.zzbzq;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzbi extends zzamo {
    public final /* synthetic */ byte[] zza;
    public final /* synthetic */ Map zzb;
    public final /* synthetic */ zzbzq zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbi(zzbo zzboVar, int i10, String str, zzalp zzalpVar, zzalo zzaloVar, byte[] bArr, Map map, zzbzq zzbzqVar) {
        super(i10, str, zzalpVar, zzaloVar);
        this.zza = bArr;
        this.zzb = map;
        this.zzc = zzbzqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzalk
    public final Map zzl() throws zzaks {
        Map map = this.zzb;
        return map == null ? Collections.emptyMap() : map;
    }

    @Override // com.google.android.gms.internal.ads.zzalk
    public final byte[] zzx() throws zzaks {
        byte[] bArr = this.zza;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzamo, com.google.android.gms.internal.ads.zzalk
    /* JADX INFO: renamed from: zzz */
    public final void zzo(String str) {
        this.zzc.zzg(str);
        super.zzo(str);
    }
}
