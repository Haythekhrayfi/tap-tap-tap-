package e8;

import android.view.View;
import fd.j0;
import y9.x7;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f29087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f29088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x7 f29089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i8.k f29090f;

    public e(d dVar, View view, x7 x7Var, i8.k kVar) {
        this.f29087c = dVar;
        this.f29088d = view;
        this.f29089e = x7Var;
        this.f29090f = kVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        j0.i(view, "view");
        view.removeOnLayoutChangeListener(this);
        d.a(this.f29087c, this.f29088d, this.f29089e, this.f29090f);
    }
}
