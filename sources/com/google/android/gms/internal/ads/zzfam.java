package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdSize;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfam {
    public static com.google.android.gms.ads.internal.client.zzq zza(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzezo zzezoVar = (zzezo) it.next();
            if (zzezoVar.zzc) {
                arrayList.add(AdSize.FLUID);
            } else {
                arrayList.add(new AdSize(zzezoVar.zza, zzezoVar.zzb));
            }
        }
        return new com.google.android.gms.ads.internal.client.zzq(context, (AdSize[]) arrayList.toArray(new AdSize[arrayList.size()]));
    }

    public static zzezo zzb(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        return zzqVar.zzi ? new zzezo(-3, 0, true) : new zzezo(zzqVar.zze, zzqVar.zzb, false);
    }
}
