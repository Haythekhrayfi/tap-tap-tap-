package l8;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class y extends vc.l implements uc.l<String, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f32970c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(View view) {
        super(1);
        this.f32970c = view;
    }

    @Override // uc.l
    public jc.w invoke(String str) {
        String str2 = str;
        fd.j0.i(str2, "description");
        View view = this.f32970c;
        fd.j0.i(view, "<this>");
        p0.e0.s(view, str2);
        return jc.w.f31842a;
    }
}
