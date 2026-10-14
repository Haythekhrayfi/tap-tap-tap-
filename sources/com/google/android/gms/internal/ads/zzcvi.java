package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcvi extends zzdaq implements zzcvj {
    public zzcvi(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzcvj
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzp(new zzdap() { // from class: com.google.android.gms.internal.ads.zzcvh
            @Override // com.google.android.gms.internal.ads.zzdap
            public final void zza(Object obj) {
                ((zzcvj) obj).zza(zzeVar);
            }
        });
    }
}
