package va;

import android.os.Bundle;
import androidx.activity.i;
import fd.j0;
import java.util.Objects;
import jc.h;
import jc.w;
import vc.l;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends l implements uc.a<w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e.b f36793c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e.b bVar) {
        super(0);
        this.f36793c = bVar;
    }

    @Override // uc.a
    public w invoke() {
        e.b bVar = this.f36793c;
        Bundle bundleA = i.a(new h("offers_loading_time", Long.valueOf(bVar.calculateDuration(bVar.f36785b, bVar.f36784a))), new h("offers_cache_hit", bVar.booleanToString(bVar.f36786c)), new h("screen_name", bVar.f36787d), new h("update_offers_cache_time", Long.valueOf(bVar.calculateDuration(bVar.f36790g, bVar.f36789f))), new h("failed_skus", bVar.listToCsv(bVar.f36791h)), new h("cache_prepared", bVar.booleanToString(bVar.f36792i)));
        xe.a.b("PurchasesTracker").l(bundleA.toString(), new Object[0]);
        com.zipoapps.premiumhelper.a aVar = ma.h.f33410y.a().f33419h;
        Objects.requireNonNull(aVar);
        j0.i(bundleA, "params");
        aVar.u(aVar.b("Performance_offers", false, bundleA));
        return w.f31842a;
    }
}
