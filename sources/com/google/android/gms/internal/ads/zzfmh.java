package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfmh extends zzfmf {
    private static zzfmh zzc;

    private zzfmh(Context context) {
        super(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
    }

    public static final zzfmh zzj(Context context) {
        zzfmh zzfmhVar;
        synchronized (zzfmh.class) {
            if (zzc == null) {
                zzc = new zzfmh(context);
            }
            zzfmhVar = zzc;
        }
        return zzfmhVar;
    }

    public final zzfme zzh(long j10, boolean z10) throws IOException {
        zzfme zzfmeVarZzb;
        synchronized (zzfmh.class) {
            zzfmeVarZzb = zzb(null, null, j10, z10);
        }
        return zzfmeVarZzb;
    }

    public final zzfme zzi(String str, String str2, long j10, boolean z10) throws IOException {
        zzfme zzfmeVarZzb;
        synchronized (zzfmh.class) {
            zzfmeVarZzb = zzb(str, str2, j10, z10);
        }
        return zzfmeVarZzb;
    }

    public final void zzk() throws IOException {
        synchronized (zzfmh.class) {
            zzf(false);
        }
    }

    public final void zzl() throws IOException {
        synchronized (zzfmh.class) {
            zzf(true);
        }
    }
}
