package z6;

import com.inscode.autoclicker.service.combine.CombinationActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends vc.l implements uc.l<Long, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v6.a f45117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CombinationActivity f45118d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(v6.a aVar, CombinationActivity combinationActivity) {
        super(1);
        this.f45117c = aVar;
        this.f45118d = combinationActivity;
    }

    @Override // uc.l
    public jc.w invoke(Long l10) {
        this.f45117c.m(l10.longValue());
        CombinationActivity combinationActivity = this.f45118d;
        CombinationActivity.a aVar = CombinationActivity.f13209j;
        combinationActivity.i();
        this.f45118d.f13211c = true;
        return jc.w.f31842a;
    }
}
