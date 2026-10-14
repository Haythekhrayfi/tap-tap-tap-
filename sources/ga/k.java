package ga;

import com.google.android.gms.ads.rewarded.RewardedAd;
import fd.z;
import gb.x;
import id.n;
import id.u;
import id.w;
import java.util.Objects;
import kotlin.reflect.KProperty;
import vc.b0;
import vc.t;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f30173c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n<x<RewardedAd>> f30174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u<x<RewardedAd>> f30175b;

    static {
        t tVar = new t(k.class, "log", "getLog()Lcom/zipoapps/premiumhelper/log/TimberLogger;", 0);
        Objects.requireNonNull(b0.f36991a);
        f30173c = new cd.i[]{tVar};
    }

    public k() {
        n<x<RewardedAd>> nVarA = w.a(null);
        this.f30174a = nVarA;
        this.f30175b = z.d(nVarA);
        new ta.e("PremiumHelper");
    }
}
