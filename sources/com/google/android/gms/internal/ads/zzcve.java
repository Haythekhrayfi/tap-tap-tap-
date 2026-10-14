package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcve extends zzdaq implements com.google.android.gms.ads.internal.client.zza {
    public zzcve(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzp(new zzdap() { // from class: com.google.android.gms.internal.ads.zzcvd
            @Override // com.google.android.gms.internal.ads.zzdap
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zza) obj).onAdClicked();
            }
        });
    }
}
