package l8;

import java.util.regex.PatternSyntaxException;

/* JADX INFO: loaded from: classes2.dex */
public final class z2 extends vc.l implements uc.p<Exception, uc.a<? extends jc.w>, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q8.d f33004c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(q8.d dVar) {
        super(2);
        this.f33004c = dVar;
    }

    @Override // uc.p
    public jc.w invoke(Exception exc, uc.a<? extends jc.w> aVar) {
        Exception exc2 = exc;
        uc.a<? extends jc.w> aVar2 = aVar;
        fd.j0.i(exc2, "exception");
        fd.j0.i(aVar2, "other");
        if (exc2 instanceof PatternSyntaxException) {
            q8.d dVar = this.f33004c;
            StringBuilder sbA = defpackage.a.a("Invalid regex pattern '");
            sbA.append((Object) ((PatternSyntaxException) exc2).getPattern());
            sbA.append("'.");
            dVar.a(new IllegalArgumentException(sbA.toString()));
        } else {
            aVar2.invoke();
        }
        return jc.w.f31842a;
    }
}
