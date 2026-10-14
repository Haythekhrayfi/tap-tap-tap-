package ba;

import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.n;
import com.android.billingclient.api.y;
import com.yandex.metrica.impl.ob.InterfaceC1893q;
import fd.j0;
import java.util.List;
import java.util.Objects;
import jc.w;

/* JADX INFO: loaded from: classes.dex */
public final class h implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.android.billingclient.api.e f3437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1893q f3438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final uc.a<w> f3439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<PurchaseHistoryRecord> f3440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f3441f;

    public static final class a extends com.yandex.metrica.billing_interface.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ n f3443d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ List f3444e;

        public a(n nVar, List list) {
            this.f3443d = nVar;
            this.f3444e = list;
        }

        @Override // com.yandex.metrica.billing_interface.d
        public void a() {
            h hVar = h.this;
            n nVar = this.f3443d;
            List list = this.f3444e;
            Objects.requireNonNull(hVar);
            if (nVar.f3848a == 0) {
                if (!(list == null || list.isEmpty())) {
                    f fVar = new f(hVar.f3436a, hVar.f3438c, hVar.f3439d, hVar.f3440e, list, hVar.f3441f);
                    j jVar = hVar.f3441f;
                    Objects.requireNonNull(jVar);
                    jVar.f3448a.add(fVar);
                    hVar.f3438c.c().execute(new i(hVar, fVar));
                }
            }
            h hVar2 = h.this;
            hVar2.f3441f.b(hVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(String str, com.android.billingclient.api.e eVar, InterfaceC1893q interfaceC1893q, uc.a<w> aVar, List<? extends PurchaseHistoryRecord> list, j jVar) {
        j0.i(str, "type");
        j0.i(eVar, "billingClient");
        j0.i(interfaceC1893q, "utilsProvider");
        j0.i(aVar, "billingInfoSentListener");
        j0.i(list, "purchaseHistoryRecords");
        j0.i(jVar, "billingLibraryConnectionHolder");
        this.f3436a = str;
        this.f3437b = eVar;
        this.f3438c = interfaceC1893q;
        this.f3439d = aVar;
        this.f3440e = list;
        this.f3441f = jVar;
    }

    @Override // com.android.billingclient.api.y
    public void a(n nVar, List<? extends SkuDetails> list) {
        j0.i(nVar, "billingResult");
        this.f3438c.a().execute(new a(nVar, list));
    }
}
