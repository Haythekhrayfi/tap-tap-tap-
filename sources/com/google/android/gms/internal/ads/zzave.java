package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class zzave {
    private final int zza;
    private final zzavb zzb = new zzavg();

    public zzave(int i10) {
        this.zza = i10;
    }

    public final String zza(ArrayList arrayList) {
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append(((String) arrayList.get(i10)).toLowerCase(Locale.US));
            sb2.append('\n');
        }
        String[] strArrSplit = sb2.toString().split("\n");
        if (strArrSplit.length == 0) {
            return "";
        }
        zzavd zzavdVar = new zzavd();
        PriorityQueue priorityQueue = new PriorityQueue(this.zza, new zzavc(this));
        for (String str : strArrSplit) {
            String[] strArrZzb = zzavf.zzb(str, false);
            if (strArrZzb.length != 0) {
                zzavj.zzc(strArrZzb, this.zza, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzavdVar.zzb.write(this.zzb.zzb(((zzavi) it.next()).zzb));
            } catch (IOException e10) {
                zzbzr.zzh("Error while writing hash to byteStream", e10);
            }
        }
        return zzavdVar.toString();
    }
}
