package l8;

import y9.l7;

/* JADX INFO: loaded from: classes2.dex */
public final class s5 extends vc.l implements uc.l<Long, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o8.i f32837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l7 f32838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v9.d f32839e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(o8.i iVar, l7 l7Var, v9.d dVar) {
        super(1);
        this.f32837c = iVar;
        this.f32838d = l7Var;
        this.f32839e = dVar;
    }

    @Override // uc.l
    public jc.w invoke(Long l10) {
        b.h(this.f32837c, Long.valueOf(l10.longValue()), this.f32838d.f41288t.b(this.f32839e));
        return jc.w.f31842a;
    }
}
