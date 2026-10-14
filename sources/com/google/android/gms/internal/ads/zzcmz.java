package com.google.android.gms.internal.ads;

import android.content.Context;
import android.support.v4.media.j;
import android.text.TextUtils;
import android.webkit.CookieManager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcmz implements zzcmj {
    private final CookieManager zza;

    public zzcmz(Context context) {
        this.zza = com.google.android.gms.ads.internal.zzt.zzq().zzb(context);
    }

    @Override // com.google.android.gms.internal.ads.zzcmj
    public final void zza(Map map) {
        if (this.zza == null) {
            return;
        }
        if (((String) map.get("clear")) == null) {
            String str = (String) map.get("cookie");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.zza.setCookie((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzaK), str);
            return;
        }
        String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzaK);
        String cookie = this.zza.getCookie(str2);
        if (cookie == null) {
            return;
        }
        List listZzf = zzfpu.zzc(zzfos.zzc(';')).zzf(cookie);
        for (int i10 = 0; i10 < listZzf.size(); i10++) {
            CookieManager cookieManager = this.zza;
            Iterator it = zzfpu.zzc(zzfos.zzc('=')).zzd((String) listZzf.get(i10)).iterator();
            Objects.requireNonNull(it);
            if (!it.hasNext()) {
                throw new IndexOutOfBoundsException(j.a("position (0) must be less than the number of elements that remained (", 0, ")"));
            }
            cookieManager.setCookie(str2, String.valueOf((String) it.next()).concat(String.valueOf((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzax))));
        }
    }
}
