package ba;

import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.n;
import com.android.billingclient.api.s;
import com.android.billingclient.api.x;
import com.yandex.metrica.impl.ob.C1818n;
import com.yandex.metrica.impl.ob.C1868p;
import com.yandex.metrica.impl.ob.InterfaceC1893q;
import com.yandex.metrica.impl.ob.InterfaceC1942s;
import fd.j0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kc.t;

/* JADX INFO: loaded from: classes.dex */
public final class c implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1868p f3413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.android.billingclient.api.e f3414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1893q f3415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f3417e;

    public static final class a extends com.yandex.metrica.billing_interface.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ n f3419d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ List f3420e;

        public a(n nVar, List list) {
            this.f3419d = nVar;
            this.f3420e = list;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x006a  */
        @Override // com.yandex.metrica.billing_interface.d
        public void a() {
            com.yandex.metrica.billing_interface.c cVar;
            c cVar2 = c.this;
            n nVar = this.f3419d;
            List<PurchaseHistoryRecord> list = this.f3420e;
            Objects.requireNonNull(cVar2);
            if (nVar.f3848a == 0 && list != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (PurchaseHistoryRecord purchaseHistoryRecord : list) {
                    for (String str : purchaseHistoryRecord.c()) {
                        String str2 = cVar2.f3416d;
                        j0.i(str2, "type");
                        int iHashCode = str2.hashCode();
                        if (iHashCode != 3541555) {
                            if (iHashCode == 100343516 && str2.equals("inapp")) {
                                cVar = com.yandex.metrica.billing_interface.c.INAPP;
                            } else {
                                cVar = com.yandex.metrica.billing_interface.c.UNKNOWN;
                            }
                        } else if (str2.equals("subs")) {
                            cVar = com.yandex.metrica.billing_interface.c.SUBS;
                        } else {
                            cVar = com.yandex.metrica.billing_interface.c.UNKNOWN;
                        }
                        ca.a aVar = new ca.a(cVar, str, purchaseHistoryRecord.b(), purchaseHistoryRecord.a(), 0L);
                        j0.h(str, "info.sku");
                        linkedHashMap.put(str, aVar);
                    }
                }
                Map<String, ca.a> mapA = cVar2.f3415c.f().a(cVar2.f3413a, linkedHashMap, cVar2.f3415c.e());
                j0.h(mapA, "utilsProvider.updatePoli…lingInfoManager\n        )");
                if (mapA.isEmpty()) {
                    C1818n c1818n = C1818n.f16904a;
                    String str3 = cVar2.f3416d;
                    InterfaceC1942s interfaceC1942sE = cVar2.f3415c.e();
                    j0.h(interfaceC1942sE, "utilsProvider.billingInfoManager");
                    C1818n.a(c1818n, linkedHashMap, mapA, str3, interfaceC1942sE, null, 16);
                } else {
                    List listH = t.H(mapA.keySet());
                    d dVar = new d(cVar2, linkedHashMap, mapA);
                    String str4 = cVar2.f3416d;
                    ArrayList arrayList = new ArrayList(listH);
                    if (str4 == null) {
                        throw new IllegalArgumentException("SKU type must be set");
                    }
                    x xVar = new x();
                    xVar.f3884a = str4;
                    xVar.f3885b = arrayList;
                    h hVar = new h(cVar2.f3416d, cVar2.f3414b, cVar2.f3415c, dVar, list, cVar2.f3417e);
                    j jVar = cVar2.f3417e;
                    Objects.requireNonNull(jVar);
                    jVar.f3448a.add(hVar);
                    cVar2.f3415c.c().execute(new e(cVar2, xVar, hVar));
                }
            }
            c cVar3 = c.this;
            cVar3.f3417e.b(cVar3);
        }
    }

    public c(C1868p c1868p, com.android.billingclient.api.e eVar, InterfaceC1893q interfaceC1893q, String str, j jVar) {
        j0.i(c1868p, "config");
        j0.i(eVar, "billingClient");
        j0.i(interfaceC1893q, "utilsProvider");
        j0.i(str, "type");
        j0.i(jVar, "billingLibraryConnectionHolder");
        this.f3413a = c1868p;
        this.f3414b = eVar;
        this.f3415c = interfaceC1893q;
        this.f3416d = str;
        this.f3417e = jVar;
    }

    @Override // com.android.billingclient.api.s
    public void a(n nVar, List<? extends PurchaseHistoryRecord> list) {
        j0.i(nVar, "billingResult");
        this.f3415c.a().execute(new a(nVar, list));
    }
}
