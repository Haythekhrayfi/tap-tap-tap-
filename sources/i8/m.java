package i8;

import android.view.View;
import y9.l1;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends vc.l implements uc.a<jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f31384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f31385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l1.c f31386e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c8.e f31387f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(k kVar, View view, l1.c cVar, c8.e eVar) {
        super(0);
        this.f31384c = kVar;
        this.f31385d = view;
        this.f31386e = cVar;
        this.f31387f = eVar;
    }

    @Override // uc.a
    public jc.w invoke() {
        k kVar = this.f31384c;
        View view = this.f31385d;
        l1.c cVar = this.f31386e;
        try {
            ((r7.a.b) kVar.getDiv2Component$div_release()).b().b(view, cVar.f41207a, kVar, this.f31387f);
        } catch (u9.f e10) {
            if (!x1.q.a(e10)) {
                throw e10;
            }
        }
        ((r7.a.b) this.f31384c.getDiv2Component$div_release()).b().a();
        return jc.w.f31842a;
    }
}
