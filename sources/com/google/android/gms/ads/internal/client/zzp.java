package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.internal.ads.zzbzk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zzp {
    public static final zzp zza = new zzp();

    public final zzl zza(Context context, zzdx zzdxVar) {
        String strZzq;
        Date dateZzn = zzdxVar.zzn();
        long time = dateZzn != null ? dateZzn.getTime() : -1L;
        String strZzk = zzdxVar.zzk();
        int iZza = zzdxVar.zza();
        Set setZzq = zzdxVar.zzq();
        List listUnmodifiableList = !setZzq.isEmpty() ? Collections.unmodifiableList(new ArrayList(setZzq)) : null;
        boolean zZzs = zzdxVar.zzs(context);
        Bundle bundleZzf = zzdxVar.zzf(AdMobAdapter.class);
        String strZzl = zzdxVar.zzl();
        SearchAdRequest searchAdRequestZzi = zzdxVar.zzi();
        zzfh zzfhVar = searchAdRequestZzi != null ? new zzfh(searchAdRequestZzi) : null;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            zzay.zzb();
            strZzq = zzbzk.zzq(Thread.currentThread().getStackTrace(), packageName);
        } else {
            strZzq = null;
        }
        boolean zZzr = zzdxVar.zzr();
        RequestConfiguration requestConfigurationZzc = zzej.zzf().zzc();
        return new zzl(8, time, bundleZzf, iZza, listUnmodifiableList, zZzs, Math.max(zzdxVar.zzc(), requestConfigurationZzc.getTagForChildDirectedTreatment()), false, strZzl, zzfhVar, null, strZzk, zzdxVar.zzg(), zzdxVar.zze(), Collections.unmodifiableList(new ArrayList(zzdxVar.zzp())), zzdxVar.zzm(), strZzq, zZzr, null, requestConfigurationZzc.getTagForUnderAgeOfConsent(), (String) Collections.max(Arrays.asList(null, requestConfigurationZzc.getMaxAdContentRating()), new Comparator() { // from class: com.google.android.gms.ads.internal.client.zzo
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list = RequestConfiguration.zza;
                return list.indexOf((String) obj) - list.indexOf((String) obj2);
            }
        }), zzdxVar.zzo(), zzdxVar.zzb(), zzdxVar.zzj());
    }
}
