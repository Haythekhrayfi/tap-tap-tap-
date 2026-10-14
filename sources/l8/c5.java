package l8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class c5 extends vc.l implements uc.a<jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<y9.q> f32305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j5 f32306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i8.k f32307e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o8.r f32308f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c5(List<? extends y9.q> list, j5 j5Var, i8.k kVar, o8.r rVar) {
        super(0);
        this.f32305c = list;
        this.f32306d = j5Var;
        this.f32307e = kVar;
        this.f32308f = rVar;
    }

    @Override // uc.a
    public jc.w invoke() {
        List<y9.q> list = this.f32305c;
        j5 j5Var = this.f32306d;
        i8.k kVar = this.f32307e;
        o8.r rVar = this.f32308f;
        for (y9.q qVar : list) {
            j5Var.f32511f.a(kVar, qVar, null);
            j5Var.f32514i.k(kVar, rVar, qVar);
        }
        return jc.w.f31842a;
    }
}
