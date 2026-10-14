package l8;

import java.util.Objects;
import y9.l7;

/* JADX INFO: loaded from: classes2.dex */
public final class b6 extends vc.l implements uc.l<String, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m5 f32285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o8.i f32286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v9.d f32287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l7 f32288f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6(m5 m5Var, o8.i iVar, v9.d dVar, l7 l7Var) {
        super(1);
        this.f32285c = m5Var;
        this.f32286d = iVar;
        this.f32287e = dVar;
        this.f32288f = l7Var;
    }

    @Override // uc.l
    public jc.w invoke(String str) {
        fd.j0.i(str, "it");
        m5 m5Var = this.f32285c;
        o8.i iVar = this.f32286d;
        v9.d dVar = this.f32287e;
        l7 l7Var = this.f32288f;
        Objects.requireNonNull(m5Var);
        iVar.setText(l7Var.K.b(dVar));
        this.f32285c.e(this.f32286d, this.f32287e, this.f32288f);
        return jc.w.f31842a;
    }
}
