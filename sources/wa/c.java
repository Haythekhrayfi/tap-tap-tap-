package wa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import fd.j0;
import java.util.Objects;
import jc.w;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends vc.l implements uc.a<w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a.EnumC0448a f37209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f37210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f37211e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f37212f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ uc.a<w> f37213g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a.EnumC0448a enumC0448a, a aVar, AppCompatActivity appCompatActivity, int i10, uc.a<w> aVar2) {
        super(0);
        this.f37209c = enumC0448a;
        this.f37210d = aVar;
        this.f37211e = appCompatActivity;
        this.f37212f = i10;
        this.f37213g = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005a  */
    @Override // uc.a
    public w invoke() {
        com.zipoapps.premiumhelper.ui.rate.c.EnumC0239c enumC0239c;
        ma.h.a aVar = ma.h.f33410y;
        aVar.a().f33419h.k(this.f37209c);
        a aVar2 = this.f37210d;
        AppCompatActivity appCompatActivity = this.f37211e;
        int i10 = this.f37212f;
        uc.a<w> aVar3 = this.f37213g;
        int i11 = a.b.f37202b[((com.zipoapps.premiumhelper.ui.rate.c.b) aVar2.f37198b.g(oa.b.f34200w)).ordinal()];
        if (i11 == 1) {
            ma.f fVar = aVar2.f37199c;
            Objects.requireNonNull(fVar);
            String strA = oa.a.C0376a.a(fVar, "rate_intent", "");
            if (strA.length() == 0) {
                enumC0239c = com.zipoapps.premiumhelper.ui.rate.c.EnumC0239c.DIALOG;
            } else if (j0.d(strA, "positive")) {
                enumC0239c = com.zipoapps.premiumhelper.ui.rate.c.EnumC0239c.IN_APP_REVIEW;
            } else {
                j0.d(strA, "negative");
                enumC0239c = com.zipoapps.premiumhelper.ui.rate.c.EnumC0239c.NONE;
            }
        } else if (i11 != 2) {
            if (i11 != 3) {
                throw new jc.g();
            }
            enumC0239c = com.zipoapps.premiumhelper.ui.rate.c.EnumC0239c.NONE;
        } else {
            enumC0239c = com.zipoapps.premiumhelper.ui.rate.c.EnumC0239c.IN_APP_REVIEW;
        }
        int i12 = a.b.f37203c[enumC0239c.ordinal()];
        if (i12 == 1) {
            com.zipoapps.premiumhelper.ui.rate.c cVar = aVar2.f37197a;
            FragmentManager supportFragmentManager = appCompatActivity.getSupportFragmentManager();
            j0.h(supportFragmentManager, "activity.supportFragmentManager");
            cVar.e(supportFragmentManager, i10, "happy_moment", new o(appCompatActivity, aVar3));
        } else if (i12 == 2) {
            aVar2.f37197a.d(appCompatActivity, new p(appCompatActivity, aVar3));
        } else if (i12 == 3) {
            aVar.a().o(appCompatActivity, aVar3);
        }
        return w.f31842a;
    }
}
