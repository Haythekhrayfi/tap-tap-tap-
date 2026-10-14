package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzfip extends AsyncTask {
    private zzfiq zza;
    public final zzfih zzd;

    public zzfip(zzfih zzfihVar) {
        this.zzd = zzfihVar;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        zzfiq zzfiqVar = this.zza;
        if (zzfiqVar != null) {
            zzfiqVar.zza(this);
        }
    }

    public final void zzb(zzfiq zzfiqVar) {
        this.zza = zzfiqVar;
    }
}
