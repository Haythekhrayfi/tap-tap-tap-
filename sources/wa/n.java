package wa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import fd.j0;
import java.util.Objects;
import jc.w;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends vc.l implements uc.a<w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a.EnumC0448a f37239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f37240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f37241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f37242f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ uc.a<w> f37243g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(a.EnumC0448a enumC0448a, a aVar, AppCompatActivity appCompatActivity, int i10, uc.a<w> aVar2) {
        super(0);
        this.f37239c = enumC0448a;
        this.f37240d = aVar;
        this.f37241e = appCompatActivity;
        this.f37242f = i10;
        this.f37243g = aVar2;
    }

    @Override // uc.a
    public w invoke() {
        ma.h.a aVar = ma.h.f33410y;
        aVar.a().f33419h.k(this.f37239c);
        ma.f fVar = this.f37240d.f37199c;
        Objects.requireNonNull(fVar);
        String strA = oa.a.C0376a.a(fVar, "rate_intent", "");
        if (strA.length() == 0) {
            com.zipoapps.premiumhelper.ui.rate.c cVar = this.f37240d.f37197a;
            FragmentManager supportFragmentManager = this.f37241e.getSupportFragmentManager();
            j0.h(supportFragmentManager, "activity.supportFragmentManager");
            cVar.e(supportFragmentManager, this.f37242f, "happy_moment", new l(this.f37241e, this.f37243g));
        } else if (j0.d(strA, "positive")) {
            com.zipoapps.premiumhelper.ui.rate.c cVar2 = this.f37240d.f37197a;
            AppCompatActivity appCompatActivity = this.f37241e;
            cVar2.d(appCompatActivity, new m(appCompatActivity, this.f37243g));
        } else {
            aVar.a().o(this.f37241e, this.f37243g);
        }
        return w.f31842a;
    }
}
