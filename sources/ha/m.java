package ha;

import com.applovin.mediation.ads.MaxRewardedAd;
import fd.z;
import gb.x;
import id.u;
import id.w;
import java.util.Objects;
import kotlin.reflect.KProperty;
import vc.b0;
import vc.t;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f31062c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final id.n<x<MaxRewardedAd>> f31063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u<x<MaxRewardedAd>> f31064b;

    static {
        t tVar = new t(m.class, "log", "getLog()Lcom/zipoapps/premiumhelper/log/TimberLogger;", 0);
        Objects.requireNonNull(b0.f36991a);
        f31062c = new cd.i[]{tVar};
    }

    public m() {
        id.n<x<MaxRewardedAd>> nVarA = w.a(null);
        this.f31063a = nVarA;
        this.f31064b = z.d(nVarA);
        new ta.e("PremiumHelper");
    }
}
