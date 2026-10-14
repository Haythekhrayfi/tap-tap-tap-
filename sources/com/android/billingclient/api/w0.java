package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzu;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class w0 implements Callable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3880c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f3881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3882e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f3883f;

    public w0(f fVar, String str, s sVar) {
        this.f3883f = fVar;
        this.f3881d = str;
        this.f3882e = sVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        h0 h0Var;
        Bundle bundleZzi;
        j1.c cVar;
        Object obj;
        boolean z10 = true;
        String str = "INAPP_DATA_SIGNATURE_LIST";
        switch (this.f3880c) {
            case 0:
                f fVar = this.f3883f;
                String str2 = this.f3881d;
                zzb.zzi("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str2)));
                ArrayList arrayList = new ArrayList();
                Bundle bundleZzc = zzb.zzc(fVar.f3798l, fVar.f3804r, true, false, fVar.f3788b);
                String string = null;
                while (true) {
                    try {
                        if (fVar.f3798l) {
                            bundleZzi = fVar.f3793g.zzj(z10 != fVar.f3804r ? 9 : 19, fVar.f3791e.getPackageName(), str2, string, bundleZzc);
                        } else {
                            bundleZzi = fVar.f3793g.zzi(3, fVar.f3791e.getPackageName(), str2, string);
                        }
                        r.g gVarA = i0.a(bundleZzi, "BillingClient", "getPurchase()");
                        n nVar = (n) gVarA.f35008a;
                        if (nVar != e0.f3778k) {
                            fVar.f3792f.e(u1.a.w(gVarA.f35009b, 9, nVar));
                            h0Var = new h0(nVar, null);
                        } else {
                            ArrayList<String> stringArrayList = bundleZzi.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                            ArrayList<String> stringArrayList2 = bundleZzi.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                            ArrayList<String> stringArrayList3 = bundleZzi.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                            String str3 = str2;
                            Bundle bundle = bundleZzc;
                            int i10 = 0;
                            boolean z11 = false;
                            while (i10 < stringArrayList2.size()) {
                                String str4 = stringArrayList2.get(i10);
                                ArrayList<String> arrayList2 = stringArrayList2;
                                String str5 = stringArrayList3.get(i10);
                                ArrayList<String> arrayList3 = stringArrayList;
                                ArrayList<String> arrayList4 = stringArrayList3;
                                zzb.zzi("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i10))));
                                try {
                                    Purchase purchase = new Purchase(str4, str5);
                                    if (TextUtils.isEmpty(purchase.a())) {
                                        zzb.zzj("BillingClient", "BUG: empty/null token!");
                                        z11 = true;
                                    }
                                    arrayList.add(purchase);
                                    i10++;
                                    stringArrayList3 = arrayList4;
                                    stringArrayList2 = arrayList2;
                                    stringArrayList = arrayList3;
                                } catch (JSONException e10) {
                                    zzb.zzk("BillingClient", "Got an exception trying to decode the purchase!", e10);
                                    j1.c cVar2 = fVar.f3792f;
                                    n nVar2 = e0.f3777j;
                                    cVar2.e(u1.a.w(51, 9, nVar2));
                                    h0Var = new h0(nVar2, null);
                                }
                            }
                            if (z11) {
                                fVar.f3792f.e(u1.a.w(26, 9, e0.f3777j));
                            }
                            string = bundleZzi.getString("INAPP_CONTINUATION_TOKEN");
                            zzb.zzi("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
                            if (TextUtils.isEmpty(string)) {
                                h0Var = new h0(e0.f3778k, arrayList);
                            } else {
                                str2 = str3;
                                bundleZzc = bundle;
                                z10 = true;
                            }
                        }
                    } catch (Exception e11) {
                        j1.c cVar3 = fVar.f3792f;
                        n nVar3 = e0.f3779l;
                        cVar3.e(u1.a.w(52, 9, nVar3));
                        zzb.zzk("BillingClient", "Got exception trying to get purchasesm try to reconnect", e11);
                        h0Var = new h0(nVar3, null);
                    }
                }
                List<Purchase> list = h0Var.f3812a;
                if (list != null) {
                    ((u) this.f3882e).a(h0Var.f3813b, list);
                    return null;
                }
                ((u) this.f3882e).a(h0Var.f3813b, zzu.zzk());
                return null;
            default:
                f fVar2 = this.f3883f;
                String str6 = this.f3881d;
                zzb.zzi("BillingClient", "Querying purchase history, item type: ".concat(String.valueOf(str6)));
                ArrayList arrayList5 = new ArrayList();
                Bundle bundleZzc2 = zzb.zzc(fVar2.f3798l, fVar2.f3804r, true, false, fVar2.f3788b);
                String string2 = null;
                while (true) {
                    if (fVar2.f3797k) {
                        try {
                            Bundle bundleZzh = fVar2.f3793g.zzh(6, fVar2.f3791e.getPackageName(), str6, string2, bundleZzc2);
                            r.g gVarA2 = i0.a(bundleZzh, "BillingClient", "getPurchaseHistory()");
                            n nVar4 = (n) gVarA2.f35008a;
                            if (nVar4 != e0.f3778k) {
                                fVar2.f3792f.e(u1.a.w(gVarA2.f35009b, 11, nVar4));
                                obj = null;
                                cVar = new j1.c(nVar4, (List) null);
                            } else {
                                ArrayList<String> stringArrayList4 = bundleZzh.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                                ArrayList<String> stringArrayList5 = bundleZzh.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                                ArrayList<String> stringArrayList6 = bundleZzh.getStringArrayList(str);
                                String str7 = str6;
                                Bundle bundle2 = bundleZzc2;
                                int i11 = 0;
                                boolean z12 = false;
                                while (i11 < stringArrayList5.size()) {
                                    String str8 = stringArrayList5.get(i11);
                                    ArrayList<String> arrayList6 = stringArrayList5;
                                    String str9 = stringArrayList6.get(i11);
                                    ArrayList<String> arrayList7 = stringArrayList4;
                                    String str10 = str;
                                    zzb.zzi("BillingClient", "Purchase record found for sku : ".concat(String.valueOf(stringArrayList4.get(i11))));
                                    try {
                                        PurchaseHistoryRecord purchaseHistoryRecord = new PurchaseHistoryRecord(str8, str9);
                                        if (TextUtils.isEmpty(purchaseHistoryRecord.b())) {
                                            zzb.zzj("BillingClient", "BUG: empty/null token!");
                                            z12 = true;
                                        }
                                        arrayList5.add(purchaseHistoryRecord);
                                        i11++;
                                        str = str10;
                                        stringArrayList5 = arrayList6;
                                        stringArrayList4 = arrayList7;
                                    } catch (JSONException e12) {
                                        zzb.zzk("BillingClient", "Got an exception trying to decode the purchase!", e12);
                                        j1.c cVar4 = fVar2.f3792f;
                                        n nVar5 = e0.f3777j;
                                        cVar4.e(u1.a.w(51, 11, nVar5));
                                        cVar = new j1.c(nVar5, (List) null);
                                    }
                                }
                                String str11 = str;
                                if (z12) {
                                    fVar2.f3792f.e(u1.a.w(26, 11, e0.f3777j));
                                }
                                string2 = bundleZzh.getString("INAPP_CONTINUATION_TOKEN");
                                zzb.zzi("BillingClient", "Continuation token: ".concat(String.valueOf(string2)));
                                if (TextUtils.isEmpty(string2)) {
                                    cVar = new j1.c(e0.f3778k, arrayList5);
                                    obj = null;
                                } else {
                                    str6 = str7;
                                    bundleZzc2 = bundle2;
                                    str = str11;
                                }
                            }
                        } catch (RemoteException e13) {
                            zzb.zzk("BillingClient", "Got exception trying to get purchase history, try to reconnect", e13);
                            j1.c cVar5 = fVar2.f3792f;
                            n nVar6 = e0.f3779l;
                            cVar5.e(u1.a.w(59, 11, nVar6));
                            obj = null;
                            cVar = new j1.c(nVar6, (List) null);
                        }
                        ((s) this.f3882e).a((n) cVar.f31680b, (List) cVar.f31679a);
                        return obj;
                    }
                    zzb.zzj("BillingClient", "getPurchaseHistory is not supported on current device");
                    cVar = new j1.c(e0.f3782o, (List) null);
                    obj = null;
                }
                ((s) this.f3882e).a((n) cVar.f31680b, (List) cVar.f31679a);
                return obj;
        }
    }

    public w0(f fVar, String str, u uVar) {
        this.f3883f = fVar;
        this.f3881d = str;
        this.f3882e = uVar;
    }
}
