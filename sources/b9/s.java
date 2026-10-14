package b9;

import fd.j0;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f3399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f3400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f3401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f3402d;

    public s() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(o oVar) {
        this(oVar, null, null, null, 14, null);
        j0.i(oVar, "measureFilter");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(o oVar, o oVar2) {
        this(oVar, oVar2, null, null, 12, null);
        j0.i(oVar, "measureFilter");
        j0.i(oVar2, "layoutFilter");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(o oVar, o oVar2, o oVar3) {
        this(oVar, oVar2, oVar3, null, 8, null);
        j0.i(oVar, "measureFilter");
        j0.i(oVar2, "layoutFilter");
        j0.i(oVar3, "drawFilter");
    }

    public s(o oVar, o oVar2, o oVar3, o oVar4) {
        j0.i(oVar, "measureFilter");
        j0.i(oVar2, "layoutFilter");
        j0.i(oVar3, "drawFilter");
        j0.i(oVar4, "totalFilter");
        this.f3399a = oVar;
        this.f3400b = oVar2;
        this.f3401c = oVar3;
        this.f3402d = oVar4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public s(o oVar, o oVar2, o oVar3, o oVar4, int i10, vc.g gVar) {
        if ((i10 & 1) != 0) {
            Objects.requireNonNull(o.f3394v1);
            oVar = o.a.f3397c;
        }
        if ((i10 & 2) != 0) {
            Objects.requireNonNull(o.f3394v1);
            oVar2 = o.a.f3397c;
        }
        if ((i10 & 4) != 0) {
            Objects.requireNonNull(o.f3394v1);
            oVar3 = o.a.f3397c;
        }
        if ((i10 & 8) != 0) {
            Objects.requireNonNull(o.f3394v1);
            oVar4 = o.a.f3396b;
        }
        this(oVar, oVar2, oVar3, oVar4);
    }
}
