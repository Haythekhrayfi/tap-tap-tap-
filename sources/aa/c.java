package aa;

import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.n;
import com.android.billingclient.api.s;
import com.android.billingclient.api.x;
import com.yandex.metrica.impl.ob.C1694i;
import com.yandex.metrica.impl.ob.C1868p;
import com.yandex.metrica.impl.ob.InterfaceC1893q;
import com.yandex.metrica.impl.ob.InterfaceC1942s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class c implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1868p f222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.android.billingclient.api.e f225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC1893q f226e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f227f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final androidx.viewpager2.widget.d f228g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ca.c f229h;

    public class a extends com.yandex.metrica.billing_interface.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ n f230c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List f231d;

        public a(n nVar, List list) {
            this.f230c = nVar;
            this.f231d = list;
        }

        @Override // com.yandex.metrica.billing_interface.d
        public void a() throws Throwable {
            c cVar = c.this;
            n nVar = this.f230c;
            List<PurchaseHistoryRecord> list = this.f231d;
            Objects.requireNonNull(cVar);
            if (nVar.f3848a == 0 && list != null) {
                Map<String, ca.a> mapB = cVar.b(list);
                Map<String, ca.a> mapA = cVar.f226e.f().a(cVar.f222a, mapB, cVar.f226e.e());
                if (mapA.isEmpty()) {
                    cVar.c(mapB, mapA);
                } else {
                    d dVar = new d(cVar, mapB, mapA);
                    String str = cVar.f227f;
                    ArrayList arrayList = new ArrayList(new ArrayList(mapA.keySet()));
                    if (str == null) {
                        throw new IllegalArgumentException("SKU type must be set");
                    }
                    x xVar = new x();
                    xVar.f3884a = str;
                    xVar.f3885b = arrayList;
                    String str2 = cVar.f227f;
                    Executor executor = cVar.f223b;
                    com.android.billingclient.api.e eVar = cVar.f225d;
                    InterfaceC1893q interfaceC1893q = cVar.f226e;
                    androidx.viewpager2.widget.d dVar2 = cVar.f228g;
                    g gVar = new g(str2, executor, eVar, interfaceC1893q, dVar, mapA, dVar2);
                    ((Set) dVar2.f3052c).add(gVar);
                    cVar.f224c.execute(new e(cVar, xVar, gVar));
                }
            }
            c cVar2 = c.this;
            cVar2.f228g.b(cVar2);
        }
    }

    public c(C1868p c1868p, Executor executor, Executor executor2, com.android.billingclient.api.e eVar, InterfaceC1893q interfaceC1893q, String str, androidx.viewpager2.widget.d dVar, ca.c cVar) {
        this.f222a = c1868p;
        this.f223b = executor;
        this.f224c = executor2;
        this.f225d = eVar;
        this.f226e = interfaceC1893q;
        this.f227f = str;
        this.f228g = dVar;
        this.f229h = cVar;
    }

    @Override // com.android.billingclient.api.s
    public void a(n nVar, List<PurchaseHistoryRecord> list) {
        this.f223b.execute(new a(nVar, list));
    }

    public final Map<String, ca.a> b(List<PurchaseHistoryRecord> list) {
        HashMap map = new HashMap();
        for (PurchaseHistoryRecord purchaseHistoryRecord : list) {
            com.yandex.metrica.billing_interface.c cVarC = C1694i.c(this.f227f);
            String sku = purchaseHistoryRecord.getSku();
            map.put(sku, new ca.a(cVarC, sku, purchaseHistoryRecord.b(), purchaseHistoryRecord.a(), 0L));
        }
        return map;
    }

    public void c(Map<String, ca.a> map, Map<String, ca.a> map2) {
        InterfaceC1942s interfaceC1942sE = this.f226e.e();
        Objects.requireNonNull(this.f229h);
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (ca.a aVar : map.values()) {
            if (map2.containsKey(aVar.f3652b)) {
                aVar.f3655e = jCurrentTimeMillis;
            } else {
                ca.a aVarA = interfaceC1942sE.a(aVar.f3652b);
                if (aVarA != null) {
                    aVar.f3655e = aVarA.f3655e;
                }
            }
        }
        interfaceC1942sE.a(map);
        if (interfaceC1942sE.a() || !"inapp".equals(this.f227f)) {
            return;
        }
        interfaceC1942sE.b();
    }
}
