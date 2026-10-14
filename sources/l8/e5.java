package l8;

import ch.qos.logback.core.joran.action.Action;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;

/* JADX INFO: loaded from: classes2.dex */
public final class e5 extends vc.l implements uc.a<jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j5 f32355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i8.k f32356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c8.e f32357e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(j5 j5Var, i8.k kVar, c8.e eVar) {
        super(0);
        this.f32355c = j5Var;
        this.f32356d = kVar;
        this.f32357e = eVar;
    }

    @Override // uc.a
    public jc.w invoke() {
        q8.d dVarA = this.f32355c.f32516k.a(this.f32356d.getDataTag(), this.f32356d.getDivData());
        String string = this.f32357e.toString();
        fd.j0.i(FacebookMediationAdapter.KEY_ID, Action.KEY_ATTRIBUTE);
        fd.j0.i(string, "path");
        dVarA.a(new u9.f(u9.g.MISSING_VALUE, y.q.a("Value for key '", FacebookMediationAdapter.KEY_ID, "' at path '", string, "' is missing"), null, null, null, 28, null));
        return jc.w.f31842a;
    }
}
