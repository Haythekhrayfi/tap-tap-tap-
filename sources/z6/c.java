package z6;

import com.inscode.autoclicker.service.combine.CombinationActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends vc.l implements uc.l<Throwable, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CombinationActivity f45038c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CombinationActivity combinationActivity) {
        super(1);
        this.f45038c = combinationActivity;
    }

    @Override // uc.l
    public jc.w invoke(Throwable th) {
        Throwable th2 = th;
        xe.a.f37601c.b(r2.a.a(th2, y6.k.a(th2, "it", "[COMBINE] [ERROR] (initButtons). ", th2, ' ')), new Object[0]);
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
        return jc.w.f31842a;
    }
}
