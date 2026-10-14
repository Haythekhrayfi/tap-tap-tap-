package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzasg extends zzath {
    private static final zzati zzi = new zzati();
    private final Context zzj;

    public zzasg(zzart zzartVar, String str, String str2, zzanq zzanqVar, int i10, int i11, Context context) {
        super(zzartVar, "x244HDzWeCJXpaVmJz6ZDJ8SomiOjqvEXNm93LF/UprnziaRy0GWl7kRtW31unI7", "QfNmx51vMYu7RTw3f+TZAS23f16Jqr3kM4ALSpqOw0Y=", zzanqVar, i10, 29);
        this.zzj = context;
    }

    @Override // com.google.android.gms.internal.ads.zzath
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzn("E");
        AtomicReference atomicReferenceZza = zzi.zza(this.zzj.getPackageName());
        if (atomicReferenceZza.get() == null) {
            synchronized (atomicReferenceZza) {
                if (atomicReferenceZza.get() == null) {
                    atomicReferenceZza.set((String) this.zzf.invoke(null, this.zzj));
                }
            }
        }
        String str = (String) atomicReferenceZza.get();
        synchronized (this.zze) {
            this.zze.zzn(zzapd.zza(str.getBytes(), true));
        }
    }
}
