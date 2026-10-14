package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaqn {
    public volatile Boolean zzb;
    private final zzart zze;
    private static final ConditionVariable zzc = new ConditionVariable();
    public static volatile zzfld zza = null;
    private static volatile Random zzd = null;

    public zzaqn(zzart zzartVar) {
        this.zze = zzartVar;
        zzartVar.zzk().execute(new zzaqm(this));
    }

    public static final int zzd() {
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException unused) {
            return zze().nextInt();
        }
    }

    private static Random zze() {
        if (zzd == null) {
            synchronized (zzaqn.class) {
                if (zzd == null) {
                    zzd = new Random();
                }
            }
        }
        return zzd;
    }

    public final void zzc(int i10, int i11, long j10, String str, Exception exc) {
        try {
            zzc.block();
            if (!this.zzb.booleanValue() || zza == null) {
                return;
            }
            zzanc zzancVarZza = zzang.zza();
            zzancVarZza.zza(this.zze.zza.getPackageName());
            zzancVarZza.zze(j10);
            if (str != null) {
                zzancVarZza.zzb(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                zzancVarZza.zzf(stringWriter.toString());
                zzancVarZza.zzd(exc.getClass().getName());
            }
            zzflc zzflcVarZza = zza.zza(((zzang) zzancVarZza.zzal()).zzax());
            zzflcVarZza.zza(i10);
            if (i11 != -1) {
                zzflcVarZza.zzb(i11);
            }
            zzflcVarZza.zzc();
        } catch (Exception unused) {
        }
    }
}
