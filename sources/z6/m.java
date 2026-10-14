package z6;

import com.inscode.autoclicker.service.combine.CombinationActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends vc.l implements uc.l<Double, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v6.a f45113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CombinationActivity f45114d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(v6.a aVar, CombinationActivity combinationActivity) {
        super(1);
        this.f45113c = aVar;
        this.f45114d = combinationActivity;
    }

    @Override // uc.l
    public jc.w invoke(Double d10) {
        this.f45113c.l(d10.doubleValue());
        CombinationActivity combinationActivity = this.f45114d;
        CombinationActivity.a aVar = CombinationActivity.f13209j;
        combinationActivity.i();
        this.f45114d.f13211c = true;
        return jc.w.f31842a;
    }
}
