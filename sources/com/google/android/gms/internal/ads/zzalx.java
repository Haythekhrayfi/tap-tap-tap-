package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes2.dex */
final class zzalx implements zzalj {
    private final Map zza = new HashMap();
    private final zzakw zzb;
    private final BlockingQueue zzc;
    private final zzalb zzd;

    public zzalx(zzakw zzakwVar, BlockingQueue blockingQueue, zzalb zzalbVar) {
        this.zzd = zzalbVar;
        this.zzb = zzakwVar;
        this.zzc = blockingQueue;
    }

    @Override // com.google.android.gms.internal.ads.zzalj
    public final synchronized void zza(zzalk zzalkVar) {
        String strZzj = zzalkVar.zzj();
        List list = (List) this.zza.remove(strZzj);
        if (list == null || list.isEmpty()) {
            return;
        }
        if (zzalw.zzb) {
            zzalw.zzd("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), strZzj);
        }
        zzalk zzalkVar2 = (zzalk) list.remove(0);
        this.zza.put(strZzj, list);
        zzalkVar2.zzu(this);
        try {
            this.zzc.put(zzalkVar2);
        } catch (InterruptedException e10) {
            zzalw.zzb("Couldn't add request to queue. %s", e10.toString());
            Thread.currentThread().interrupt();
            this.zzb.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalj
    public final void zzb(zzalk zzalkVar, zzalq zzalqVar) {
        List list;
        zzakt zzaktVar = zzalqVar.zzb;
        if (zzaktVar == null || zzaktVar.zza(System.currentTimeMillis())) {
            zza(zzalkVar);
            return;
        }
        String strZzj = zzalkVar.zzj();
        synchronized (this) {
            list = (List) this.zza.remove(strZzj);
        }
        if (list != null) {
            if (zzalw.zzb) {
                zzalw.zzd("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), strZzj);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.zzd.zzb((zzalk) it.next(), zzalqVar, null);
            }
        }
    }

    public final synchronized boolean zzc(zzalk zzalkVar) {
        String strZzj = zzalkVar.zzj();
        if (!this.zza.containsKey(strZzj)) {
            this.zza.put(strZzj, null);
            zzalkVar.zzu(this);
            if (zzalw.zzb) {
                zzalw.zza("new request, sending to network %s", strZzj);
            }
            return false;
        }
        List arrayList = (List) this.zza.get(strZzj);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        zzalkVar.zzm("waiting-for-response");
        arrayList.add(zzalkVar);
        this.zza.put(strZzj, arrayList);
        if (zzalw.zzb) {
            zzalw.zza("Request for cacheKey=%s is in flight, putting on hold.", strZzj);
        }
        return true;
    }
}
