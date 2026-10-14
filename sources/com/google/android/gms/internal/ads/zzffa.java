package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzffa {
    private final Clock zza;
    private final Map zzb = new HashMap();
    private final Map zzc = new HashMap();

    public zzffa(Clock clock) {
        this.zza = clock;
    }

    private final void zzd(String str, String str2) {
        if (!this.zzb.containsKey(str)) {
            this.zzb.put(str, new ArrayList());
        }
        ((List) this.zzb.get(str)).add(str2);
    }

    public final List zza() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.zzb.entrySet()) {
            int i10 = 0;
            if (((List) entry.getValue()).size() > 1) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    i10++;
                    arrayList.add(new zzfez(((String) entry.getKey()) + "." + i10, (String) it.next()));
                }
            } else {
                arrayList.add(new zzfez((String) entry.getKey(), (String) ((List) entry.getValue()).get(0)));
            }
        }
        return arrayList;
    }

    public final void zzb(String str) {
        if (!this.zzc.containsKey(str)) {
            this.zzc.put(str, Long.valueOf(this.zza.elapsedRealtime()));
            return;
        }
        long jElapsedRealtime = this.zza.elapsedRealtime() - ((Long) this.zzc.remove(str)).longValue();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(jElapsedRealtime);
        zzd(str, sb2.toString());
    }

    public final void zzc(String str, String str2) {
        if (this.zzc.containsKey(str)) {
            zzd(str, androidx.viewpager2.adapter.a.a(str2, this.zza.elapsedRealtime() - ((Long) this.zzc.remove(str)).longValue()));
        } else {
            this.zzc.put(str, Long.valueOf(this.zza.elapsedRealtime()));
        }
    }
}
