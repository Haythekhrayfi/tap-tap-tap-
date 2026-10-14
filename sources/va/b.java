package va;

import android.os.Bundle;
import androidx.activity.i;
import fd.j0;
import java.util.Objects;
import jc.w;
import ma.h;
import vc.l;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends l implements uc.a<w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f36778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f36779d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(long j10, a aVar) {
        super(0);
        this.f36778c = j10;
        this.f36779d = aVar;
    }

    @Override // uc.a
    public w invoke() {
        h.a aVar = h.f33410y;
        Bundle bundleA = i.a(new jc.h("banner_loading_time", Long.valueOf(this.f36778c)), new jc.h("banner_count", Integer.valueOf(this.f36779d.f36774a)), new jc.h("ads_provider", aVar.a().f33421j.f28028e.name()));
        xe.a.b("AdsLoadingPerformance").a(bundleA.toString(), new Object[0]);
        com.zipoapps.premiumhelper.a aVar2 = aVar.a().f33419h;
        Objects.requireNonNull(aVar2);
        j0.i(bundleA, "params");
        aVar2.u(aVar2.b("Performance_banners", false, bundleA));
        return w.f31842a;
    }
}
