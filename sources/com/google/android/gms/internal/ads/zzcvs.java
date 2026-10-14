package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcvs extends zzdaq implements zzcvk {
    public zzcvs(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzcvk
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzp(new zzdap() { // from class: com.google.android.gms.internal.ads.zzcvp
            @Override // com.google.android.gms.internal.ads.zzdap
            public final void zza(Object obj) {
                ((zzcvw) obj).zzk(zzeVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvk
    public final void zzb() {
        zzp(new zzdap() { // from class: com.google.android.gms.internal.ads.zzcvq
            @Override // com.google.android.gms.internal.ads.zzdap
            public final void zza(Object obj) {
                ((zzcvw) obj).zzk(zzfbi.zzd(11, null, null));
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvk
    public final void zzc(final zzdev zzdevVar) {
        zzp(new zzdap() { // from class: com.google.android.gms.internal.ads.zzcvr
            @Override // com.google.android.gms.internal.ads.zzdap
            public final void zza(Object obj) {
                ((zzcvw) obj).zzk(zzfbi.zzd(12, zzdevVar.getMessage(), null));
            }
        });
    }
}
