package l8;

import android.view.View;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;

/* JADX INFO: loaded from: classes2.dex */
public final class l0 extends vc.l implements uc.l<String, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f32547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i8.l0 f32548d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(View view, i8.l0 l0Var) {
        super(1);
        this.f32547c = view;
        this.f32548d = l0Var;
    }

    @Override // uc.l
    public jc.w invoke(String str) {
        String str2 = str;
        fd.j0.i(str2, FacebookMediationAdapter.KEY_ID);
        this.f32547c.setNextFocusUpId(this.f32548d.a(str2));
        return jc.w.f31842a;
    }
}
