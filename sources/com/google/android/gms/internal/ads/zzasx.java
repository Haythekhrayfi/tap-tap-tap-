package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzasx extends zzath {
    private List zzi;
    private final Context zzj;

    public zzasx(zzart zzartVar, String str, String str2, zzanq zzanqVar, int i10, int i11, Context context) {
        super(zzartVar, "kG8kAzeUJFSjvYuRDtJkr7owBxy52vKH1yfYPq05BRQDWSz1Oa+VomdlwOHttvWk", "SXEqPPoGCAhkrwWNonsWzEV+zX6m6TBLFFDVOqk+hqA=", zzanqVar, i10, 31);
        this.zzi = null;
        this.zzj = context;
    }

    @Override // com.google.android.gms.internal.ads.zzath
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzW(-1L);
        this.zze.zzS(-1L);
        Context contextZzb = this.zzj;
        if (contextZzb == null) {
            contextZzb = this.zzb.zzb();
        }
        if (this.zzi == null) {
            this.zzi = (List) this.zzf.invoke(null, contextZzb);
        }
        List list = this.zzi;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (this.zze) {
            this.zze.zzW(((Long) this.zzi.get(0)).longValue());
            this.zze.zzS(((Long) this.zzi.get(1)).longValue());
        }
    }
}
