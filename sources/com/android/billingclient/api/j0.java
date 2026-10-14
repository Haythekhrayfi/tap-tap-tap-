package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzbn;
import com.google.android.gms.internal.play_billing.zzfb;
import com.google.android.gms.internal.play_billing.zzu;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f3816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f3817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j1.c f3818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j1.c f3820e;

    public /* synthetic */ j0(j1.c cVar, w wVar, c cVar2, j1.c cVar3) {
        this.f3820e = cVar;
        this.f3816a = wVar;
        this.f3818c = cVar3;
        this.f3817b = cVar2;
    }

    public final void a(Bundle bundle, n nVar, int i10) {
        if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") == null) {
            this.f3818c.e(u1.a.w(23, i10, nVar));
            return;
        }
        try {
            this.f3818c.e(zzfb.zzx(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), zzbn.zza()));
        } catch (Throwable unused) {
            zzb.zzj("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            zzb.zzj("BillingBroadcastManager", "Bundle is null.");
            j1.c cVar = this.f3818c;
            n nVar = e0.f3777j;
            cVar.e(u1.a.w(11, 1, nVar));
            w wVar = this.f3816a;
            if (wVar != null) {
                wVar.a(nVar, null);
                return;
            }
            return;
        }
        n nVarZzd = zzb.zzd(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        String string = extras.getString("INTENT_SOURCE");
        int i10 = 2;
        if (string != "LAUNCH_BILLING_FLOW" && (string == null || !string.equals("LAUNCH_BILLING_FLOW"))) {
            i10 = 1;
        }
        if (action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
            List<Purchase> listZzh = zzb.zzh(extras);
            if (nVarZzd.f3848a == 0) {
                this.f3818c.f(u1.a.x(i10));
            } else {
                a(extras, nVarZzd, i10);
            }
            this.f3816a.a(nVarZzd, listZzh);
            return;
        }
        if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
            if (nVarZzd.f3848a != 0) {
                a(extras, nVarZzd, i10);
                this.f3816a.a(nVarZzd, zzu.zzk());
                return;
            }
            if (this.f3817b == null) {
                zzb.zzj("BillingBroadcastManager", "AlternativeBillingListener is null.");
                j1.c cVar2 = this.f3818c;
                n nVar2 = e0.f3777j;
                cVar2.e(u1.a.w(15, i10, nVar2));
                this.f3816a.a(nVar2, zzu.zzk());
                return;
            }
            String string2 = extras.getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
            if (string2 == null) {
                zzb.zzj("BillingBroadcastManager", "Couldn't find alternative billing user choice data in bundle.");
                j1.c cVar3 = this.f3818c;
                n nVar3 = e0.f3777j;
                cVar3.e(u1.a.w(16, i10, nVar3));
                this.f3816a.a(nVar3, zzu.zzk());
                return;
            }
            try {
                d dVar = new d(string2);
                this.f3818c.f(u1.a.x(i10));
                this.f3817b.a(dVar);
            } catch (JSONException unused) {
                zzb.zzj("BillingBroadcastManager", String.format("Error when parsing invalid alternative choice data: [%s]", string2));
                j1.c cVar4 = this.f3818c;
                n nVar4 = e0.f3777j;
                cVar4.e(u1.a.w(17, i10, nVar4));
                this.f3816a.a(nVar4, zzu.zzk());
            }
        }
    }
}
