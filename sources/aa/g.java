package aa;

import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.n;
import com.android.billingclient.api.y;
import com.yandex.metrica.impl.ob.C1694i;
import com.yandex.metrica.impl.ob.C2021v3;
import com.yandex.metrica.impl.ob.InterfaceC1893q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class g implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.android.billingclient.api.e f242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1893q f243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Callable<Void> f244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<String, ca.a> f245f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final androidx.viewpager2.widget.d f246g;

    public class a extends com.yandex.metrica.billing_interface.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ n f247c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List f248d;

        public a(n nVar, List list) {
            this.f247c = nVar;
            this.f248d = list;
        }

        /* JADX WARN: Code duplicated, block: B:36:0x00eb  */
        /* JADX WARN: Code duplicated, block: B:37:0x00ee  */
        /* JADX WARN: Code duplicated, block: B:40:0x00fa  */
        /* JADX WARN: Code duplicated, block: B:41:0x0101  */
        /* JADX WARN: Code duplicated, block: B:43:0x0105  */
        /* JADX WARN: Code duplicated, block: B:44:0x0108  */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 3 */
        @Override // com.yandex.metrica.billing_interface.d
        public void a() throws Exception {
            Map<String, Purchase> map;
            Iterator it;
            int i10;
            int iOptInt;
            String str;
            boolean zC;
            String str2;
            g gVar = g.this;
            n nVar = this.f247c;
            List list = this.f248d;
            Objects.requireNonNull(gVar);
            if (nVar.f3848a == 0 && list != null && !list.isEmpty()) {
                Map<String, Purchase> mapB = gVar.b();
                ArrayList arrayList = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    SkuDetails skuDetails = (SkuDetails) it2.next();
                    ca.a aVar = gVar.f245f.get(skuDetails.e());
                    Purchase purchase = (Purchase) ((HashMap) mapB).get(skuDetails.e());
                    if (aVar != null) {
                        com.yandex.metrica.billing_interface.c cVarC = C1694i.c(skuDetails.f());
                        String strE = skuDetails.e();
                        long jOptLong = skuDetails.f3755b.optLong("price_amount_micros");
                        String strOptString = skuDetails.f3755b.optString("price_currency_code");
                        long jOptLong2 = skuDetails.a().isEmpty() ? skuDetails.f3755b.optLong("introductoryPriceAmountMicros") : 0L;
                        com.yandex.metrica.billing_interface.b bVarA = com.yandex.metrica.billing_interface.b.a(skuDetails.a().isEmpty() ? skuDetails.f3755b.optString("introductoryPricePeriod") : skuDetails.a());
                        if (skuDetails.a().isEmpty()) {
                            try {
                                iOptInt = skuDetails.f3755b.optInt("introductoryPriceCycles");
                                map = mapB;
                                it = it2;
                            } catch (Throwable unused) {
                                map = mapB;
                                it = it2;
                                try {
                                    String str3 = (String) SkuDetails.class.getMethod("getIntroductoryPriceCycles", new Class[0]).invoke(skuDetails, new Object[0]);
                                    if (str3 != null) {
                                        iOptInt = Integer.parseInt(str3);
                                    } else {
                                        i10 = 0;
                                    }
                                } catch (Throwable unused2) {
                                }
                                com.yandex.metrica.billing_interface.b bVarA2 = com.yandex.metrica.billing_interface.b.a(skuDetails.f3755b.optString("subscriptionPeriod"));
                                if (purchase != null) {
                                    str = purchase.f3749b;
                                } else {
                                    str = "";
                                }
                                String str4 = str;
                                String str5 = aVar.f3653c;
                                int i11 = i10;
                                long j10 = aVar.f3654d;
                                if (purchase != null) {
                                    zC = purchase.c();
                                } else {
                                    zC = false;
                                }
                                if (purchase != null) {
                                    str2 = purchase.f3748a;
                                } else {
                                    str2 = "{}";
                                }
                                arrayList.add(new ca.b(cVarC, strE, 1, jOptLong, strOptString, jOptLong2, bVarA, i11, bVarA2, str4, str5, j10, zC, str2));
                                mapB = map;
                                it2 = it;
                            }
                        } else {
                            map = mapB;
                            it = it2;
                            iOptInt = 1;
                        }
                        i10 = iOptInt;
                        com.yandex.metrica.billing_interface.b bVarA3 = com.yandex.metrica.billing_interface.b.a(skuDetails.f3755b.optString("subscriptionPeriod"));
                        if (purchase != null) {
                            str = purchase.f3749b;
                        } else {
                            str = "";
                        }
                        String str6 = str;
                        String str7 = aVar.f3653c;
                        int i12 = i10;
                        long j11 = aVar.f3654d;
                        if (purchase != null) {
                            zC = purchase.c();
                        } else {
                            zC = false;
                        }
                        if (purchase != null) {
                            str2 = purchase.f3748a;
                        } else {
                            str2 = "{}";
                        }
                        arrayList.add(new ca.b(cVarC, strE, 1, jOptLong, strOptString, jOptLong2, bVarA, i12, bVarA3, str6, str7, j11, zC, str2));
                        mapB = map;
                        it2 = it;
                    }
                }
                ((C2021v3) gVar.f243d.d()).a(arrayList);
                gVar.f244e.call();
            }
            g gVar2 = g.this;
            gVar2.f246g.b(gVar2);
        }
    }

    public g(String str, Executor executor, com.android.billingclient.api.e eVar, InterfaceC1893q interfaceC1893q, Callable<Void> callable, Map<String, ca.a> map, androidx.viewpager2.widget.d dVar) {
        this.f240a = str;
        this.f241b = executor;
        this.f242c = eVar;
        this.f243d = interfaceC1893q;
        this.f244e = callable;
        this.f245f = map;
        this.f246g = dVar;
    }

    @Override // com.android.billingclient.api.y
    public void a(n nVar, List<SkuDetails> list) {
        this.f241b.execute(new a(nVar, list));
    }

    public final Map<String, Purchase> b() {
        HashMap map = new HashMap();
        Purchase.PurchasesResult purchasesResultQueryPurchases = this.f242c.queryPurchases(this.f240a);
        List<Purchase> purchasesList = purchasesResultQueryPurchases.getPurchasesList();
        if (purchasesResultQueryPurchases.getResponseCode() == 0 && purchasesList != null) {
            for (Purchase purchase : purchasesList) {
                map.put(purchase.getSku(), purchase);
            }
        }
        return map;
    }
}
