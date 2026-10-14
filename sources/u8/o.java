package u8;

import android.view.View;
import android.view.ViewGroup;
import fd.j0;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends vc.l implements uc.l<View, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f36139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vc.y f36140d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(i iVar, vc.y yVar) {
        super(1);
        this.f36139c = iVar;
        this.f36140d = yVar;
    }

    @Override // uc.l
    public jc.w invoke(View view) {
        View view2 = view;
        j0.i(view2, "it");
        i iVar = this.f36139c;
        int i10 = this.f36140d.f37006c;
        boolean z10 = iVar.f36120s == 0;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        m9.d dVar = (m9.d) layoutParams;
        if (((ViewGroup.MarginLayoutParams) dVar).height == -1) {
            if (z10) {
                iVar.f36120s = Math.max(iVar.f36120s, dVar.b());
            } else {
                iVar.z(view2, i10, view2.getMeasuredWidth());
                iVar.D(i10, dVar.b() + view2.getMeasuredHeight());
            }
        }
        return jc.w.f31842a;
    }
}
