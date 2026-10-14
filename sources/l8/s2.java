package l8;

import android.graphics.drawable.Drawable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class s2 extends vc.l implements uc.l<Integer, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r2 f32819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o8.h f32820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y9.s3 f32821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i8.k f32822f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v9.d f32823g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Drawable f32824h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(r2 r2Var, o8.h hVar, y9.s3 s3Var, i8.k kVar, v9.d dVar, Drawable drawable) {
        super(1);
        this.f32819c = r2Var;
        this.f32820d = hVar;
        this.f32821e = s3Var;
        this.f32822f = kVar;
        this.f32823g = dVar;
        this.f32824h = drawable;
    }

    @Override // uc.l
    public jc.w invoke(Integer num) {
        int iIntValue = num.intValue();
        r2 r2Var = this.f32819c;
        o8.h hVar = this.f32820d;
        y9.s3 s3Var = this.f32821e;
        i8.k kVar = this.f32822f;
        v9.d dVar = this.f32823g;
        Drawable drawable = this.f32824h;
        Objects.requireNonNull(r2Var);
        drawable.setTint(iIntValue);
        v vVar = r2Var.f32794a;
        Objects.requireNonNull(vVar);
        fd.j0.i(hVar, "view");
        fd.j0.i(s3Var, "div");
        fd.j0.i(kVar, "divView");
        fd.j0.i(dVar, "resolver");
        List<y9.e0> listB = s3Var.b();
        y9.n2 n2VarR = s3Var.r();
        vVar.h(hVar, kVar, listB, n2VarR == null ? null : n2VarR.f41638a, dVar, x1.q.i(hVar), drawable);
        b.n(hVar, s3Var.h(), dVar);
        return jc.w.f31842a;
    }
}
