package ab;

import androidx.appcompat.app.AppCompatActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends vc.l implements uc.a<jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f311d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(c cVar, AppCompatActivity appCompatActivity) {
        super(0);
        this.f310c = cVar;
        this.f311d = appCompatActivity;
    }

    @Override // uc.a
    public jc.w invoke() {
        c.a(this.f310c, this.f311d);
        return jc.w.f31842a;
    }
}
