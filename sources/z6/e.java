package z6;

import com.inscode.autoclicker.service.combine.CombinationActivity;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends vc.l implements uc.l<Long, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CombinationActivity f45046c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CombinationActivity combinationActivity) {
        super(1);
        this.f45046c = combinationActivity;
    }

    @Override // uc.l
    public jc.w invoke(Long l10) {
        long jLongValue = l10.longValue();
        Objects.requireNonNull(CombinationActivity.f13209j);
        t6.a aVar = CombinationActivity.f13210k;
        if (aVar != null) {
            aVar.k(jLongValue);
        }
        this.f45046c.i();
        this.f45046c.f13211c = true;
        return jc.w.f31842a;
    }
}
