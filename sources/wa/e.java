package wa;

import androidx.appcompat.app.AppCompatActivity;
import jc.w;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends vc.l implements uc.a<w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a.EnumC0448a f37216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f37217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f37218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ uc.a<w> f37219f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a.EnumC0448a enumC0448a, a aVar, AppCompatActivity appCompatActivity, uc.a<w> aVar2) {
        super(0);
        this.f37216c = enumC0448a;
        this.f37217d = aVar;
        this.f37218e = appCompatActivity;
        this.f37219f = aVar2;
    }

    @Override // uc.a
    public w invoke() {
        ma.h.f33410y.a().f33419h.k(this.f37216c);
        this.f37217d.f37197a.d(this.f37218e, this.f37219f);
        return w.f31842a;
    }
}
