package com.applovin.impl.sdk.utils;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;

/* JADX INFO: loaded from: classes.dex */
public class j {
    public static void a(final Context context) {
        new Thread(new Runnable() { // from class: com.applovin.impl.sdk.utils.j.1
            @Override // java.lang.Runnable
            public void run() {
                d.a aVarA = d.a(context);
                com.applovin.impl.sdk.r.a(aVarA);
                com.applovin.impl.sdk.p.a(aVarA);
                if (w.b("com.google.android.gms.appset.AppSet")) {
                    try {
                        AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(new OnSuccessListener<AppSetIdInfo>() { // from class: com.applovin.impl.sdk.utils.j.1.1
                            @Override // com.google.android.gms.tasks.OnSuccessListener
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public void onSuccess(AppSetIdInfo appSetIdInfo) {
                                com.applovin.impl.sdk.r.a(new com.applovin.impl.sdk.r.b(appSetIdInfo.getId(), appSetIdInfo.getScope()));
                                com.applovin.impl.sdk.p.a(new com.applovin.impl.sdk.p.a(appSetIdInfo.getId(), appSetIdInfo.getScope()));
                            }
                        });
                    } catch (Throwable unused) {
                    }
                }
            }
        }).start();
    }
}
