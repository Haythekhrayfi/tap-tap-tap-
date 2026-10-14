package l8;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class x2 extends vc.l implements uc.l<y9.s3.i, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r2 f32959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o8.h f32960d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(r2 r2Var, o8.h hVar) {
        super(1);
        this.f32959c = r2Var;
        this.f32960d = hVar;
    }

    @Override // uc.l
    public jc.w invoke(y9.s3.i iVar) {
        int i10;
        y9.s3.i iVar2 = iVar;
        fd.j0.i(iVar2, "type");
        r2 r2Var = this.f32959c;
        o8.h hVar = this.f32960d;
        Objects.requireNonNull(r2Var);
        switch (r2.a.f32798a[iVar2.ordinal()]) {
            case 1:
                i10 = 1;
                break;
            case 2:
                i10 = 131073;
                break;
            case 3:
                i10 = 33;
                break;
            case 4:
                i10 = 17;
                break;
            case 5:
                i10 = 8194;
                break;
            case 6:
                i10 = 3;
                break;
            default:
                throw new jc.g();
        }
        hVar.setInputType(i10);
        this.f32960d.setHorizontallyScrolling(iVar2 != y9.s3.i.MULTI_LINE_TEXT);
        return jc.w.f31842a;
    }
}
