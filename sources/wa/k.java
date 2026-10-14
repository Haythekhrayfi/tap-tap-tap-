package wa;

import androidx.appcompat.app.AppCompatActivity;
import jc.w;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends vc.l implements uc.a<w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f37233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uc.a<w> f37234d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(AppCompatActivity appCompatActivity, uc.a<w> aVar) {
        super(0);
        this.f37233c = appCompatActivity;
        this.f37234d = aVar;
    }

    @Override // uc.a
    public w invoke() {
        ma.h.f33410y.a().o(this.f37233c, this.f37234d);
        return w.f31842a;
    }
}
