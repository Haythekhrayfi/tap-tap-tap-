package i8;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e extends vc.k implements uc.l<View, Integer> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f31328c = new e();

    public e() {
        super(1, View.class, "getLeft", "getLeft()I", 0);
    }

    @Override // uc.l
    public Integer invoke(View view) {
        View view2 = view;
        fd.j0.i(view2, "p0");
        return Integer.valueOf(view2.getLeft());
    }
}
