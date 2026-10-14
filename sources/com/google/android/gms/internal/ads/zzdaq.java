package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class zzdaq {
    public final Map zza = new HashMap();

    public zzdaq(Set set) {
        zzo(set);
    }

    public final synchronized void zzj(zzdcm zzdcmVar) {
        zzm(zzdcmVar.zza, zzdcmVar.zzb);
    }

    public final synchronized void zzm(Object obj, Executor executor) {
        this.zza.put(obj, executor);
    }

    public final synchronized void zzo(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzj((zzdcm) it.next());
        }
    }

    public final synchronized void zzp(final zzdap zzdapVar) {
        for (Map.Entry entry : this.zza.entrySet()) {
            final Object key = entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdao
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        zzdapVar.zza(key);
                    } catch (Throwable th) {
                        com.google.android.gms.ads.internal.zzt.zzo().zzt(th, "EventEmitter.notify");
                        com.google.android.gms.ads.internal.util.zze.zzb("Event emitter exception.", th);
                    }
                }
            });
        }
    }
}
