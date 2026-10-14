package ma;

import gb.b0;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends vc.l implements uc.a<b0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f33503c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(h hVar) {
        super(0);
        this.f33503c = hVar;
    }

    @Override // uc.a
    public b0 invoke() {
        b0.a aVar = b0.f30184d;
        long jLongValue = ((Number) this.f33503c.f33418g.h(oa.b.G)).longValue();
        long jF = this.f33503c.f33417f.f("interstitial_capping_timestamp", 0L);
        Objects.requireNonNull(aVar);
        return new b0(jLongValue * 1000, jF, false);
    }
}
