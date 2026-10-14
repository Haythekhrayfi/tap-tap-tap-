package z6;

import com.inscode.autoclicker.service.combine.CombinationActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends vc.l implements uc.l<jc.w, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CombinationActivity f45041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t6.a f45042d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CombinationActivity combinationActivity, t6.a aVar) {
        super(1);
        this.f45041c = combinationActivity;
        this.f45042d = aVar;
    }

    @Override // uc.l
    public jc.w invoke(jc.w wVar) {
        t6.a aVar = ((r) this.f45041c.f13215g.getValue()).f45130c;
        if (fd.j0.d(aVar != null ? aVar.getName() : null, this.f45042d.getName())) {
            ((r) this.f45041c.f13215g.getValue()).c(this.f45042d);
        }
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
        return jc.w.f31842a;
    }
}
