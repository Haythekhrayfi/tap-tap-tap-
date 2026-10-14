package l8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class x3 extends vc.l implements uc.l<Integer, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o8.n f32961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List<String> f32962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y9.z5 f32963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v9.d f32964f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(o8.n nVar, List<String> list, y9.z5 z5Var, v9.d dVar) {
        super(1);
        this.f32961c = nVar;
        this.f32962d = list;
        this.f32963e = z5Var;
        this.f32964f = dVar;
    }

    @Override // uc.l
    public jc.w invoke(Integer num) {
        int iIntValue = num.intValue();
        this.f32961c.setText(this.f32962d.get(iIntValue));
        uc.l<String, jc.w> valueUpdater = this.f32961c.getValueUpdater();
        if (valueUpdater != null) {
            valueUpdater.invoke(this.f32963e.f44665v.get(iIntValue).f44679b.b(this.f32964f));
        }
        return jc.w.f31842a;
    }
}
