package wa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import fd.j0;
import java.util.Objects;
import jc.w;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends vc.l implements uc.a<w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a.EnumC0448a f37221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f37222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f37223e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f37224f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ uc.a<w> f37225g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(a.EnumC0448a enumC0448a, a aVar, AppCompatActivity appCompatActivity, int i10, uc.a<w> aVar2) {
        super(0);
        this.f37221c = enumC0448a;
        this.f37222d = aVar;
        this.f37223e = appCompatActivity;
        this.f37224f = i10;
        this.f37225g = aVar2;
    }

    @Override // uc.a
    public w invoke() {
        ma.h.f33410y.a().f33419h.k(this.f37221c);
        ma.f fVar = this.f37222d.f37199c;
        Objects.requireNonNull(fVar);
        String strA = oa.a.C0376a.a(fVar, "rate_intent", "");
        if (strA.length() == 0) {
            com.zipoapps.premiumhelper.ui.rate.c cVar = this.f37222d.f37197a;
            FragmentManager supportFragmentManager = this.f37223e.getSupportFragmentManager();
            j0.h(supportFragmentManager, "activity.supportFragmentManager");
            int i10 = this.f37224f;
            uc.a<w> aVar = this.f37225g;
            Objects.requireNonNull(cVar);
            j0.i(supportFragmentManager, "fm");
            cVar.e(supportFragmentManager, i10, "happy_moment", new za.j(aVar));
        } else if (j0.d(strA, "positive")) {
            this.f37222d.f37197a.d(this.f37223e, this.f37225g);
        } else {
            uc.a<w> aVar2 = this.f37225g;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        }
        return w.f31842a;
    }
}
