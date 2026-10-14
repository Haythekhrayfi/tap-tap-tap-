package ba;

import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.n;
import com.android.billingclient.api.u;
import com.applovin.sdk.AppLovinEventParameters;
import com.yandex.metrica.impl.ob.C1768l;
import com.yandex.metrica.impl.ob.C2021v3;
import com.yandex.metrica.impl.ob.InterfaceC1893q;
import fd.j0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import jc.w;

/* JADX INFO: loaded from: classes.dex */
public final class f implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1893q f3428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uc.a<w> f3429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<PurchaseHistoryRecord> f3430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<SkuDetails> f3431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f3432e;

    public static final class a extends com.yandex.metrica.billing_interface.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ n f3434d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ List f3435e;

        public a(n nVar, List list) {
            this.f3434d = nVar;
            this.f3435e = list;
        }

        @Override // com.yandex.metrica.billing_interface.d
        public void a() {
            f fVar = f.this;
            n nVar = this.f3434d;
            List<Purchase> list = this.f3435e;
            Objects.requireNonNull(fVar);
            if (nVar.f3848a == 0) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Purchase purchase : list) {
                    for (String str : purchase.b()) {
                        j0.h(str, AppLovinEventParameters.PRODUCT_IDENTIFIER);
                        linkedHashMap.put(str, purchase);
                    }
                }
                List<PurchaseHistoryRecord> list2 = fVar.f3430c;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (PurchaseHistoryRecord purchaseHistoryRecord : list2) {
                    for (String str2 : purchaseHistoryRecord.c()) {
                        j0.h(str2, AppLovinEventParameters.PRODUCT_IDENTIFIER);
                        linkedHashMap2.put(str2, purchaseHistoryRecord);
                    }
                }
                List<SkuDetails> list3 = fVar.f3431d;
                ArrayList arrayList = new ArrayList();
                for (SkuDetails skuDetails : list3) {
                    PurchaseHistoryRecord purchaseHistoryRecord2 = (PurchaseHistoryRecord) linkedHashMap2.get(skuDetails.e());
                    ca.b bVarA = purchaseHistoryRecord2 != null ? C1768l.f16781a.a(purchaseHistoryRecord2, skuDetails, (Purchase) linkedHashMap.get(skuDetails.e())) : null;
                    if (bVarA != null) {
                        arrayList.add(bVarA);
                    }
                }
                ((C2021v3) fVar.f3428a.d()).a(arrayList);
                fVar.f3429b.invoke();
            }
            f fVar2 = f.this;
            fVar2.f3432e.b(fVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(String str, InterfaceC1893q interfaceC1893q, uc.a<w> aVar, List<? extends PurchaseHistoryRecord> list, List<? extends SkuDetails> list2, j jVar) {
        j0.i(str, "type");
        j0.i(interfaceC1893q, "utilsProvider");
        j0.i(aVar, "billingInfoSentListener");
        j0.i(list, "purchaseHistoryRecords");
        j0.i(list2, "skuDetails");
        j0.i(jVar, "billingLibraryConnectionHolder");
        this.f3428a = interfaceC1893q;
        this.f3429b = aVar;
        this.f3430c = list;
        this.f3431d = list2;
        this.f3432e = jVar;
    }

    @Override // com.android.billingclient.api.u
    public void a(n nVar, List<? extends Purchase> list) {
        j0.i(nVar, "billingResult");
        j0.i(list, "purchases");
        this.f3428a.a().execute(new a(nVar, list));
    }
}
