package wa;

import androidx.appcompat.app.AppCompatActivity;
import jc.w;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends vc.l implements uc.a<w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a.EnumC0448a f37229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f37230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f37231e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ uc.a<w> f37232f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(a.EnumC0448a enumC0448a, a aVar, AppCompatActivity appCompatActivity, uc.a<w> aVar2) {
        super(0);
        this.f37229c = enumC0448a;
        this.f37230d = aVar;
        this.f37231e = appCompatActivity;
        this.f37232f = aVar2;
    }

    @Override // uc.a
    public w invoke() {
        ma.h.f33410y.a().f33419h.k(this.f37229c);
        com.zipoapps.premiumhelper.ui.rate.c cVar = this.f37230d.f37197a;
        AppCompatActivity appCompatActivity = this.f37231e;
        cVar.d(appCompatActivity, new i(appCompatActivity, this.f37232f));
        return w.f31842a;
    }
}
