package i8;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d extends vc.k implements uc.l<View, Integer> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f31325c = new d();

    public d() {
        super(1, View.class, "getTop", "getTop()I", 0);
    }

    @Override // uc.l
    public Integer invoke(View view) {
        View view2 = view;
        fd.j0.i(view2, "p0");
        return Integer.valueOf(view2.getTop());
    }
}
