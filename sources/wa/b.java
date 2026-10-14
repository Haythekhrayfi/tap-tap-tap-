package wa;

import androidx.appcompat.app.AppCompatActivity;
import jc.w;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends vc.l implements uc.a<w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f37207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uc.a<w> f37208d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AppCompatActivity appCompatActivity, uc.a<w> aVar) {
        super(0);
        this.f37207c = appCompatActivity;
        this.f37208d = aVar;
    }

    @Override // uc.a
    public w invoke() {
        ma.h.f33410y.a().o(this.f37207c, this.f37208d);
        return w.f31842a;
    }
}
