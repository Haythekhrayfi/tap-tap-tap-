package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface zzhb extends zzge {
    public static final zzfpi zza = new zzfpi() { // from class: com.google.android.gms.internal.ads.zzgv
        @Override // com.google.android.gms.internal.ads.zzfpi
        public final boolean zza(Object obj) {
            String str = (String) obj;
            if (str == null) {
                return false;
            }
            String strZza = zzfon.zza(str);
            if (TextUtils.isEmpty(strZza)) {
                return false;
            }
            return ((strZza.contains("text") && !strZza.contains("text/vtt")) || strZza.contains("html") || strZza.contains("xml")) ? false : true;
        }
    };

    @Override // com.google.android.gms.internal.ads.zzge
    Map zze();
}
