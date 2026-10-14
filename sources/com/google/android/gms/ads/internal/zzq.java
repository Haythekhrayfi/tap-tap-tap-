package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.google.android.gms.internal.ads.zzaqs;
import com.google.android.gms.internal.ads.zzbzr;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
final class zzq extends AsyncTask {
    public final /* synthetic */ zzs zza;

    public /* synthetic */ zzq(zzs zzsVar, zzp zzpVar) {
        this.zza = zzsVar;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzs zzsVar = this.zza;
        if (zzsVar.zzf == null || str == null) {
            return;
        }
        zzsVar.zzf.loadUrl(str);
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final String doInBackground(Void... voidArr) {
        try {
            zzs zzsVar = this.zza;
            zzsVar.zzh = (zzaqs) zzsVar.zzc.get(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            zzbzr.zzk("", e10);
        }
        return this.zza.zzp();
    }
}
