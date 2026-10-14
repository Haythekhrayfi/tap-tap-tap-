package l8;

import y9.s6;

/* JADX INFO: loaded from: classes2.dex */
public final class u4 extends vc.l implements uc.l<Integer, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p4 f32882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o8.p f32883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v9.d f32884e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s6.e f32885f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(p4 p4Var, o8.p pVar, v9.d dVar, s6.e eVar) {
        super(1);
        this.f32882c = p4Var;
        this.f32883d = pVar;
        this.f32884e = dVar;
        this.f32885f = eVar;
    }

    @Override // uc.l
    public jc.w invoke(Integer num) {
        num.intValue();
        this.f32882c.b(this.f32883d, this.f32884e, this.f32885f);
        return jc.w.f31842a;
    }
}
