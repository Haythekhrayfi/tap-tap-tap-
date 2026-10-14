package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzlz extends zzmj {
    public zzlz(int i10) {
        super(i10, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzmj
    public final void zza() {
        if (!zzj()) {
            for (int i10 = 0; i10 < zzb(); i10++) {
                Map.Entry entryZzg = zzg(i10);
                if (((zzju) entryZzg.getKey()).zzc()) {
                    entryZzg.setValue(Collections.unmodifiableList((List) entryZzg.getValue()));
                }
            }
            for (Map.Entry entry : zzc()) {
                if (((zzju) entry.getKey()).zzc()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
