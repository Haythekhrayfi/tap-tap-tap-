package com.google.firebase.analytics.connector.internal;

import a5.c;
import a5.d;
import a5.f;
import a5.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzee;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import y4.a;
import y4.b;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@KeepForSdk
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    public static a lambda$getComponents$0(d dVar) {
        u4.d dVar2 = (u4.d) dVar.a(u4.d.class);
        Context context = (Context) dVar.a(Context.class);
        u5.d dVar3 = (u5.d) dVar.a(u5.d.class);
        Preconditions.checkNotNull(dVar2);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(dVar3);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (b.f38078c == null) {
            synchronized (b.class) {
                if (b.f38078c == null) {
                    Bundle bundle = new Bundle(1);
                    if (dVar2.h()) {
                        dVar3.a(u4.a.class, new Executor() { // from class: y4.c
                            @Override // java.util.concurrent.Executor
                            public final void execute(Runnable runnable) {
                                runnable.run();
                            }
                        }, new u5.b() { // from class: y4.d
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // u5.b
                            public final void a(u5.a aVar) {
                                boolean z10 = ((u4.a) aVar.f36032b).f36003a;
                                synchronized (b.class) {
                                    ((b) Preconditions.checkNotNull(b.f38078c)).f38079a.zza(z10);
                                }
                            }
                        });
                        bundle.putBoolean("dataCollectionDefaultEnabled", dVar2.g());
                    }
                    b.f38078c = new b(zzee.zzg(context, null, null, null, bundle).zzd());
                }
            }
        }
        return b.f38078c;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @KeepForSdk
    @SuppressLint({"MissingPermission"})
    public List<c<?>> getComponents() {
        c.b bVarA = c.a(a.class);
        bVarA.a(new l(u4.d.class, 1, 0));
        bVarA.a(new l(Context.class, 1, 0));
        bVarA.a(new l(u5.d.class, 1, 0));
        bVarA.c(new f() { // from class: z4.a
            @Override // a5.f
            public final Object a(a5.d dVar) {
                return AnalyticsConnectorRegistrar.lambda$getComponents$0(dVar);
            }
        });
        bVarA.d(2);
        return Arrays.asList(bVarA.b(), c.b(new g6.a("fire-analytics", "21.1.1"), g6.d.class));
    }
}
