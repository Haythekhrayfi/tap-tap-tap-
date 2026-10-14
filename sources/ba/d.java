package ba;

import com.yandex.metrica.impl.ob.C1818n;
import com.yandex.metrica.impl.ob.InterfaceC1942s;
import fd.j0;
import java.util.Map;
import jc.w;
import vc.l;

/* JADX INFO: loaded from: classes.dex */
public final class d extends l implements uc.a<w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f3421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Map f3422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Map f3423e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, Map map, Map map2) {
        super(0);
        this.f3421c = cVar;
        this.f3422d = map;
        this.f3423e = map2;
    }

    @Override // uc.a
    public w invoke() {
        C1818n c1818n = C1818n.f16904a;
        Map map = this.f3422d;
        Map map2 = this.f3423e;
        c cVar = this.f3421c;
        String str = cVar.f3416d;
        InterfaceC1942s interfaceC1942sE = cVar.f3415c.e();
        j0.h(interfaceC1942sE, "utilsProvider.billingInfoManager");
        C1818n.a(c1818n, map, map2, str, interfaceC1942sE, null, 16);
        return w.f31842a;
    }
}
