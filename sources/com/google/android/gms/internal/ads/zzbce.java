package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
@Deprecated
public final class zzbce {
    private final List zza = new LinkedList();
    private final Map zzb;
    private final Object zzc;

    public zzbce(boolean z10, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        this.zzc = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    public static final zzbcb zzf() {
        return new zzbcb(com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime(), null, null);
    }

    public final zzbcd zza() {
        zzbcd zzbcdVar;
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbJ)).booleanValue();
        StringBuilder sb2 = new StringBuilder();
        HashMap map = new HashMap();
        synchronized (this.zzc) {
            for (zzbcb zzbcbVar : this.zza) {
                long jZza = zzbcbVar.zza();
                String strZzc = zzbcbVar.zzc();
                zzbcb zzbcbVarZzb = zzbcbVar.zzb();
                if (zzbcbVarZzb != null && jZza > 0) {
                    long jZza2 = jZza - zzbcbVarZzb.zza();
                    sb2.append(strZzc);
                    sb2.append(CoreConstants.DOT);
                    sb2.append(jZza2);
                    sb2.append(CoreConstants.COMMA_CHAR);
                    if (zBooleanValue) {
                        if (map.containsKey(Long.valueOf(zzbcbVarZzb.zza()))) {
                            StringBuilder sb3 = (StringBuilder) map.get(Long.valueOf(zzbcbVarZzb.zza()));
                            sb3.append('+');
                            sb3.append(strZzc);
                        } else {
                            map.put(Long.valueOf(zzbcbVarZzb.zza()), new StringBuilder(strZzc));
                        }
                    }
                }
            }
            this.zza.clear();
            String string = null;
            if (!TextUtils.isEmpty(null)) {
                sb2.append((String) null);
            } else if (sb2.length() > 0) {
                sb2.setLength(sb2.length() - 1);
            }
            StringBuilder sb4 = new StringBuilder();
            if (zBooleanValue) {
                for (Map.Entry entry : map.entrySet()) {
                    sb4.append((CharSequence) entry.getValue());
                    sb4.append(CoreConstants.DOT);
                    sb4.append((((Long) entry.getKey()).longValue() - com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime()) + com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis());
                    sb4.append(CoreConstants.COMMA_CHAR);
                }
                if (sb4.length() > 0) {
                    sb4.setLength(sb4.length() - 1);
                }
                string = sb4.toString();
            }
            zzbcdVar = new zzbcd(sb2.toString(), string);
        }
        return zzbcdVar;
    }

    public final Map zzb() {
        Map map;
        synchronized (this.zzc) {
            com.google.android.gms.ads.internal.zzt.zzo().zzf();
            map = this.zzb;
        }
        return map;
    }

    public final void zzc(zzbce zzbceVar) {
        synchronized (this.zzc) {
        }
    }

    public final void zzd(String str, String str2) {
        zzbbu zzbbuVarZzf;
        if (TextUtils.isEmpty(str2) || (zzbbuVarZzf = com.google.android.gms.ads.internal.zzt.zzo().zzf()) == null) {
            return;
        }
        synchronized (this.zzc) {
            zzbca zzbcaVarZza = zzbbuVarZzf.zza(str);
            Map map = this.zzb;
            map.put(str, zzbcaVarZza.zza((String) map.get(str), str2));
        }
    }

    public final boolean zze(zzbcb zzbcbVar, long j10, String... strArr) {
        synchronized (this.zzc) {
            for (int i10 = 0; i10 <= 0; i10++) {
                this.zza.add(new zzbcb(j10, strArr[i10], zzbcbVar));
            }
        }
        return true;
    }
}
