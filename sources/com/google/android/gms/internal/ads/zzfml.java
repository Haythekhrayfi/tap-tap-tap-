package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfml {
    public static zzfwm zza(Task task) {
        final zzfmk zzfmkVar = new zzfmk(task);
        task.addOnCompleteListener(zzfwt.zzb(), new OnCompleteListener() { // from class: com.google.android.gms.internal.ads.zzfmj
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                zzfmk zzfmkVar2 = zzfmkVar;
                if (task2.isCanceled()) {
                    zzfmkVar2.cancel(false);
                    return;
                }
                if (task2.isSuccessful()) {
                    zzfmkVar2.zzd(task2.getResult());
                    return;
                }
                Exception exception = task2.getException();
                if (exception == null) {
                    throw new IllegalStateException();
                }
                zzfmkVar2.zze(exception);
            }
        });
        return zzfmkVar;
    }
}
