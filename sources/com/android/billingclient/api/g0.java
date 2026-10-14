package com.android.billingclient.api;

import android.content.Context;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.cct.CCTDestination;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzfz;

/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Transport f3810b;

    public g0(Context context) {
        try {
            TransportRuntime.initialize(context);
            this.f3810b = TransportRuntime.getInstance().newFactory(CCTDestination.INSTANCE).getTransport("PLAY_BILLING_LIBRARY", zzfz.class, Encoding.of("proto"), new Transformer() { // from class: com.android.billingclient.api.f0
                @Override // com.google.android.datatransport.Transformer
                public final Object apply(Object obj) {
                    return ((zzfz) obj).zzc();
                }
            });
        } catch (Throwable unused) {
            this.f3809a = true;
        }
    }

    public final void a(zzfz zzfzVar) {
        String str;
        if (this.f3809a) {
            str = "Skipping logging since initialization failed.";
        } else {
            try {
                this.f3810b.send(Event.ofData(zzfzVar));
                return;
            } catch (Throwable unused) {
                str = "logging failed.";
            }
        }
        zzb.zzj("BillingLogger", str);
    }
}
