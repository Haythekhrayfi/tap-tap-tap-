package l8;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class b5 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j5 f32281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i8.k f32282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f32283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y9.k f32284f;

    public b5(j5 j5Var, i8.k kVar, View view, y9.k kVar2) {
        this.f32281c = j5Var;
        this.f32282d = kVar;
        this.f32283e = view;
        this.f32284f = kVar2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        fd.j0.i(view, "view");
        view.removeOnLayoutChangeListener(this);
        i8.q0 q0Var = this.f32281c.f32515j;
        i8.k kVar = this.f32282d;
        View view2 = this.f32283e;
        y9.k kVar2 = this.f32284f;
        q0Var.d(kVar, view2, kVar2, (8 & 8) != 0 ? b.A(kVar2.a()) : null);
    }
}
