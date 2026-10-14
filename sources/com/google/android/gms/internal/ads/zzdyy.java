package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdyy implements zzfdo {
    private static final Pattern zza = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    private final String zzb;
    private final zzffn zzc;
    private final zzffy zzd;

    public zzdyy(String str, zzffy zzffyVar, zzffn zzffnVar) {
        this.zzb = str;
        this.zzd = zzffyVar;
        this.zzc = zzffnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdo
    public final /* bridge */ /* synthetic */ Object zza(Object obj) throws Exception {
        zzdtx zzdtxVar;
        String strConcat;
        zzdyx zzdyxVar = (zzdyx) obj;
        int iOptInt = zzdyxVar.zza.optInt("http_timeout_millis", DateTimeConstants.MILLIS_PER_MINUTE);
        zzbuh zzbuhVar = zzdyxVar.zzb;
        String strJoin = "";
        if (zzbuhVar.zza() != -2) {
            if (zzbuhVar.zza() == 1) {
                if (zzbuhVar.zzf() != null) {
                    strJoin = TextUtils.join(", ", zzbuhVar.zzf());
                    zzbzr.zzg(strJoin);
                }
                zzdtxVar = new zzdtx(2, "Error building request URL: ".concat(String.valueOf(strJoin)));
            } else {
                zzdtxVar = new zzdtx(1);
            }
            zzffy zzffyVar = this.zzd;
            zzffn zzffnVar = this.zzc;
            zzffnVar.zzg(zzdtxVar);
            zzffnVar.zzf(false);
            zzffyVar.zza(zzffnVar);
            throw zzdtxVar;
        }
        HashMap map = new HashMap();
        if (zzdyxVar.zzb.zzh() && !TextUtils.isEmpty(this.zzb)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzaL)).booleanValue()) {
                String str = this.zzb;
                if (TextUtils.isEmpty(str)) {
                    strConcat = "";
                } else {
                    Matcher matcher = zza.matcher(str);
                    strConcat = "";
                    while (matcher.find()) {
                        String strGroup = matcher.group(1);
                        if (strGroup != null) {
                            Locale locale = Locale.ROOT;
                            if (strGroup.toLowerCase(locale).startsWith("id=") || strGroup.toLowerCase(locale).startsWith("ide=")) {
                                if (!TextUtils.isEmpty(strConcat)) {
                                    strConcat = strConcat.concat("; ");
                                }
                                strConcat = strConcat.concat(strGroup);
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(strConcat)) {
                    map.put("Cookie", strConcat);
                }
            } else {
                map.put("Cookie", this.zzb);
            }
        }
        if (zzdyxVar.zzb.zzi()) {
            zzdyz.zza(map, zzdyxVar.zza);
        }
        if (zzdyxVar.zzb != null && !TextUtils.isEmpty(zzdyxVar.zzb.zzd())) {
            strJoin = zzdyxVar.zzb.zzd();
        }
        zzffy zzffyVar2 = this.zzd;
        zzffn zzffnVar2 = this.zzc;
        zzffnVar2.zzf(true);
        zzffyVar2.zza(zzffnVar2);
        return new zzdyt(zzdyxVar.zzb.zze(), iOptInt, map, strJoin.getBytes(zzfot.zzc), "", zzdyxVar.zzb.zzi());
    }
}
