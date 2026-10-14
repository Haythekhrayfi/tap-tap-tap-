package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfju {
    private final Context zza;
    private final Executor zzb;
    private final zzfjb zzc;
    private final zzfjd zzd;
    private final zzfjt zze;
    private final zzfjt zzf;
    private Task zzg;
    private Task zzh;

    public zzfju(Context context, Executor executor, zzfjb zzfjbVar, zzfjd zzfjdVar, zzfjr zzfjrVar, zzfjs zzfjsVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzfjbVar;
        this.zzd = zzfjdVar;
        this.zze = zzfjrVar;
        this.zzf = zzfjsVar;
    }

    public static zzfju zze(Context context, Executor executor, zzfjb zzfjbVar, zzfjd zzfjdVar) {
        final zzfju zzfjuVar = new zzfju(context, executor, zzfjbVar, zzfjdVar, new zzfjr(), new zzfjs());
        zzfjuVar.zzg = zzfjuVar.zzd.zzd() ? zzfjuVar.zzh(new Callable() { // from class: com.google.android.gms.internal.ads.zzfjo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        }) : Tasks.forResult(zzfjuVar.zze.zza());
        zzfjuVar.zzh = zzfjuVar.zzh(new Callable() { // from class: com.google.android.gms.internal.ads.zzfjp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzd();
            }
        });
        return zzfjuVar;
    }

    private static zzaon zzg(Task task, zzaon zzaonVar) {
        return !task.isSuccessful() ? zzaonVar : (zzaon) task.getResult();
    }

    private final Task zzh(Callable callable) {
        return Tasks.call(this.zzb, callable).addOnFailureListener(this.zzb, new OnFailureListener() { // from class: com.google.android.gms.internal.ads.zzfjq
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                this.zza.zzf(exc);
            }
        });
    }

    public final zzaon zza() {
        return zzg(this.zzg, this.zze.zza());
    }

    public final zzaon zzb() {
        return zzg(this.zzh, this.zzf.zza());
    }

    public final /* synthetic */ zzaon zzc() throws Exception {
        Context context = this.zza;
        zzanq zzanqVarZza = zzaon.zza();
        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
        String id2 = advertisingIdInfo.getId();
        if (id2 != null && id2.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID uuidFromString = UUID.fromString(id2);
            byte[] bArr = new byte[16];
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            byteBufferWrap.putLong(uuidFromString.getMostSignificantBits());
            byteBufferWrap.putLong(uuidFromString.getLeastSignificantBits());
            id2 = Base64.encodeToString(bArr, 11);
        }
        if (id2 != null) {
            zzanqVarZza.zzs(id2);
            zzanqVarZza.zzr(advertisingIdInfo.isLimitAdTrackingEnabled());
            zzanqVarZza.zzab(6);
        }
        return (zzaon) zzanqVarZza.zzal();
    }

    public final /* synthetic */ zzaon zzd() throws Exception {
        Context context = this.zza;
        return zzfjj.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    public final /* synthetic */ void zzf(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.zzc.zzc(2025, -1L, exc);
    }
}
