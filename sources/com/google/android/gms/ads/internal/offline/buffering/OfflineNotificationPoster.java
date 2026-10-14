package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbnt;
import com.google.android.gms.internal.ads.zzbrm;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class OfflineNotificationPoster extends Worker {
    private final zzbrm zza;

    public OfflineNotificationPoster(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.zza = zzay.zza().zzm(context, new zzbnt());
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.a doWork() {
        try {
            this.zza.zzi(ObjectWrapper.wrap(getApplicationContext()), getInputData().b("uri"), getInputData().b("gws_query_id"));
            return new ListenableWorker.a.c();
        } catch (RemoteException unused) {
            return new ListenableWorker.a.C0046a();
        }
    }
}
