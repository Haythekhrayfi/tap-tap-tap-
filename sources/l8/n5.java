package l8;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class n5 extends vc.l implements uc.l<y9.f4, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m5 f32652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o8.i f32653d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(m5 m5Var, o8.i iVar) {
        super(1);
        this.f32652c = m5Var;
        this.f32653d = iVar;
    }

    @Override // uc.l
    public jc.w invoke(y9.f4 f4Var) {
        int paintFlags;
        y9.f4 f4Var2 = f4Var;
        fd.j0.i(f4Var2, "underline");
        m5 m5Var = this.f32652c;
        o8.i iVar = this.f32653d;
        Objects.requireNonNull(m5Var);
        int i10 = m5.b.f32616b[f4Var2.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                paintFlags = iVar.getPaintFlags() & (-9);
            }
            return jc.w.f31842a;
        }
        paintFlags = iVar.getPaintFlags() | 8;
        iVar.setPaintFlags(paintFlags);
        return jc.w.f31842a;
    }
}
