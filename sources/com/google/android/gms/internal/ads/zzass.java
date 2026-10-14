package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzass extends zzath {
    private final zzaqw zzi;
    private final long zzj;
    private final long zzk;

    public zzass(zzart zzartVar, String str, String str2, zzanq zzanqVar, int i10, int i11, zzaqw zzaqwVar, long j10, long j11) {
        super(zzartVar, "hDi2yHM1WBnaBo8xfxWY0dwLv3vkmI37udU/dWBh2W+Ynkfo3oZQp4Q+03pBto4q", "2+LdC0cYaqAwYHmCPPvRLMkFDbEQiwTEweQcBW/SUlU=", zzanqVar, i10, 11);
        this.zzi = zzaqwVar;
        this.zzj = j10;
        this.zzk = j11;
    }

    @Override // com.google.android.gms.internal.ads.zzath
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzaqw zzaqwVar = this.zzi;
        if (zzaqwVar != null) {
            zzaqu zzaquVar = new zzaqu((String) this.zzf.invoke(null, zzaqwVar.zzb(), Long.valueOf(this.zzj), Long.valueOf(this.zzk)));
            synchronized (this.zze) {
                this.zze.zzz(zzaquVar.zza.longValue());
                if (zzaquVar.zzb.longValue() >= 0) {
                    this.zze.zzQ(zzaquVar.zzb.longValue());
                }
                if (zzaquVar.zzc.longValue() >= 0) {
                    this.zze.zzf(zzaquVar.zzc.longValue());
                }
            }
        }
    }
}
