package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.work.b;
import androidx.work.c;
import androidx.work.f;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbzr;
import g2.p;
import java.util.Objects;
import x1.n;
import y1.k;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class WorkManagerUtil extends zzbq {
    @UsedByReflection("This class must be instantiated reflectively so that the default class loader can be used.")
    public WorkManagerUtil() {
    }

    private static void zzb(Context context) {
        try {
            k.d(context.getApplicationContext(), new b(new b.a()));
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final void zze(IObjectWrapper iObjectWrapper) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzb(context);
        try {
            k kVarC = k.c(context);
            Objects.requireNonNull(kVarC);
            ((j2.b) kVarC.f38011d).f31695a.execute(new h2.b(kVarC, "offline_ping_sender_work"));
            x1.b.a aVar = new x1.b.a();
            aVar.f37390c = f.CONNECTED;
            x1.b bVar = new x1.b(aVar);
            n.a aVar2 = new n.a(OfflinePingSender.class);
            aVar2.f37419c.f29749j = bVar;
            aVar2.f37420d.add("offline_ping_sender_work");
            kVarC.a(aVar2.a());
        } catch (IllegalStateException e10) {
            zzbzr.zzk("Failed to instantiate WorkManager.", e10);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final boolean zzf(IObjectWrapper iObjectWrapper, String str, String str2) throws Throwable {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzb(context);
        x1.b.a aVar = new x1.b.a();
        aVar.f37390c = f.CONNECTED;
        x1.b bVar = new x1.b(aVar);
        c.a aVar2 = new c.a();
        aVar2.f3120a.put("uri", str);
        aVar2.f3120a.put("gws_query_id", str2);
        c cVarA = aVar2.a();
        n.a aVar3 = new n.a(OfflineNotificationPoster.class);
        p pVar = aVar3.f37419c;
        pVar.f29749j = bVar;
        pVar.f29744e = cVarA;
        aVar3.f37420d.add("offline_notification_work");
        try {
            k.c(context).a(aVar3.a());
            return true;
        } catch (IllegalStateException e10) {
            zzbzr.zzk("Failed to instantiate WorkManager.", e10);
            return false;
        }
    }
}
