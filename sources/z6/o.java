package z6;

import com.inscode.autoclicker.service.combine.CombinationActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends vc.l implements uc.l<Long, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v6.a f45121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CombinationActivity f45122d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(v6.a aVar, CombinationActivity combinationActivity) {
        super(1);
        this.f45121c = aVar;
        this.f45122d = combinationActivity;
    }

    @Override // uc.l
    public jc.w invoke(Long l10) {
        this.f45121c.n(l10.longValue());
        CombinationActivity combinationActivity = this.f45122d;
        CombinationActivity.a aVar = CombinationActivity.f13209j;
        combinationActivity.i();
        this.f45122d.f13211c = true;
        return jc.w.f31842a;
    }
}
