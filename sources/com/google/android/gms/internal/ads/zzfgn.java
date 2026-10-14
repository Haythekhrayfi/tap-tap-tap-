package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfgn {
    private final zzefr zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final Context zze;
    private final zzfaa zzf;
    private final zzfab zzg;
    private final Clock zzh;
    private final zzaqs zzi;

    public zzfgn(zzefr zzefrVar, zzbzx zzbzxVar, String str, String str2, Context context, zzfaa zzfaaVar, zzfab zzfabVar, Clock clock, zzaqs zzaqsVar) {
        this.zza = zzefrVar;
        this.zzb = zzbzxVar.zza;
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = zzfaaVar;
        this.zzg = zzfabVar;
        this.zzh = clock;
        this.zzi = zzaqsVar;
    }

    public static final List zzf(int i10, int i11, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzi((String) it.next(), "@gw_mpe@", android.support.v4.media.a.a("2.", i11)));
        }
        return arrayList;
    }

    public static final List zzg(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzi((String) it.next(), "@gw_adnetstatus@", str));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzh(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return zzbzq.zzk() ? "fakeForAdDebugLog" : str;
    }

    private static String zzi(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    public final List zzc(zzezz zzezzVar, zzezn zzeznVar, List list) {
        return zzd(zzezzVar, zzeznVar, false, "", "", list);
    }

    public final List zzd(zzezz zzezzVar, zzezn zzeznVar, boolean z10, String str, String str2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            boolean z11 = true;
            String strZzi = zzi(zzi(zzi((String) it.next(), "@gw_adlocid@", zzezzVar.zza.zza.zzf), "@gw_adnetrefresh@", true != z10 ? "0" : "1"), "@gw_sdkver@", this.zzb);
            if (zzeznVar != null) {
                strZzi = zzbxy.zzc(zzi(zzi(zzi(strZzi, "@gw_qdata@", zzeznVar.zzz), "@gw_adnetid@", zzeznVar.zzy), "@gw_allocid@", zzeznVar.zzx), this.zze, zzeznVar.zzX);
            }
            String strZzi2 = zzi(zzi(zzi(strZzi, "@gw_adnetstatus@", this.zza.zzf()), "@gw_seqnum@", this.zzc), "@gw_sessid@", this.zzd);
            boolean z12 = false;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzdg)).booleanValue() && !TextUtils.isEmpty(str)) {
                z12 = true;
            }
            boolean z13 = !TextUtils.isEmpty(str2);
            if (z12) {
                z11 = z13;
            } else {
                if (z13) {
                }
                arrayList.add(strZzi2);
            }
            if (this.zzi.zzf(Uri.parse(strZzi2))) {
                Uri.Builder builderBuildUpon = Uri.parse(strZzi2).buildUpon();
                if (z12) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("ms", str);
                }
                if (z11) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("attok", str2);
                }
                strZzi2 = builderBuildUpon.build().toString();
            }
            arrayList.add(strZzi2);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005f A[LOOP:0: B:13:0x0059->B:15:0x005f, LOOP_END] */
    public final List zze(zzezn zzeznVar, List list, zzbuu zzbuuVar) {
        zzfaa zzfaaVar;
        zzfpd zzfpdVarZzd;
        String str;
        String str2;
        Iterator it;
        ArrayList arrayList = new ArrayList();
        long jCurrentTimeMillis = this.zzh.currentTimeMillis();
        try {
            String strZzc = zzbuuVar.zzc();
            String string = Integer.toString(zzbuuVar.zzb());
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzdh)).booleanValue()) {
                zzfab zzfabVar = this.zzg;
                if (zzfabVar == null) {
                    zzfpdVarZzd = zzfpd.zzc();
                } else {
                    zzfaaVar = zzfabVar.zza;
                }
                str = (String) zzfpdVarZzd.zza(new zzfov() { // from class: com.google.android.gms.internal.ads.zzfgl
                    @Override // com.google.android.gms.internal.ads.zzfov
                    public final Object apply(Object obj) {
                        return zzfgn.zzh(((zzfaa) obj).zza);
                    }
                }).zzb("");
                str2 = (String) zzfpdVarZzd.zza(new zzfov() { // from class: com.google.android.gms.internal.ads.zzfgm
                    @Override // com.google.android.gms.internal.ads.zzfov
                    public final Object apply(Object obj) {
                        return zzfgn.zzh(((zzfaa) obj).zzb);
                    }
                }).zzb("");
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(zzbxy.zzc(zzi(zzi(zzi(zzi(zzi(zzi((String) it.next(), "@gw_rwd_userid@", Uri.encode(str)), "@gw_rwd_custom_data@", Uri.encode(str2)), "@gw_tmstmp@", Long.toString(jCurrentTimeMillis)), "@gw_rwd_itm@", Uri.encode(strZzc)), "@gw_rwd_amt@", string), "@gw_sdkver@", this.zzb), this.zze, zzeznVar.zzX));
                }
                return arrayList;
            }
            zzfaaVar = this.zzf;
            zzfpdVarZzd = zzfpd.zzd(zzfaaVar);
            str = (String) zzfpdVarZzd.zza(new zzfov() { // from class: com.google.android.gms.internal.ads.zzfgl
                @Override // com.google.android.gms.internal.ads.zzfov
                public final Object apply(Object obj) {
                    return zzfgn.zzh(((zzfaa) obj).zza);
                }
            }).zzb("");
            str2 = (String) zzfpdVarZzd.zza(new zzfov() { // from class: com.google.android.gms.internal.ads.zzfgm
                @Override // com.google.android.gms.internal.ads.zzfov
                public final Object apply(Object obj) {
                    return zzfgn.zzh(((zzfaa) obj).zzb);
                }
            }).zzb("");
            it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(zzbxy.zzc(zzi(zzi(zzi(zzi(zzi(zzi((String) it.next(), "@gw_rwd_userid@", Uri.encode(str)), "@gw_rwd_custom_data@", Uri.encode(str2)), "@gw_tmstmp@", Long.toString(jCurrentTimeMillis)), "@gw_rwd_itm@", Uri.encode(strZzc)), "@gw_rwd_amt@", string), "@gw_sdkver@", this.zzb), this.zze, zzeznVar.zzX));
            }
            return arrayList;
        } catch (RemoteException e10) {
            zzbzr.zzh("Unable to determine award type and amount.", e10);
            return arrayList;
        }
    }
}
