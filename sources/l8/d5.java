package l8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class d5 extends vc.l implements uc.a<jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i8.k f32328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List<y9.q> f32329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j5 f32330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o8.r f32331f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d5(i8.k kVar, List<? extends y9.q> list, j5 j5Var, o8.r rVar) {
        super(0);
        this.f32328c = kVar;
        this.f32329d = list;
        this.f32330e = j5Var;
        this.f32331f = rVar;
    }

    @Override // uc.a
    public jc.w invoke() {
        i8.k kVar = this.f32328c;
        kVar.r(new c5(this.f32329d, this.f32330e, kVar, this.f32331f));
        return jc.w.f31842a;
    }
}
