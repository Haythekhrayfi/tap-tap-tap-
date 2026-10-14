package l8;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class p5 extends vc.l implements uc.l<Boolean, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m5 f32749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o8.i f32750d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(m5 m5Var, o8.i iVar) {
        super(1);
        this.f32749c = m5Var;
        this.f32750d = iVar;
    }

    @Override // uc.l
    public jc.w invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        m5 m5Var = this.f32749c;
        o8.i iVar = this.f32750d;
        Objects.requireNonNull(m5Var);
        iVar.setTextIsSelectable(zBooleanValue);
        return jc.w.f31842a;
    }
}
