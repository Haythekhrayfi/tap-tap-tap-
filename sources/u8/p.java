package u8;

import android.view.View;
import android.view.ViewGroup;
import fd.j0;
import java.util.Objects;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends vc.l implements uc.l<View, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f36141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vc.y f36142d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(i iVar, vc.y yVar) {
        super(1);
        this.f36141c = iVar;
        this.f36142d = yVar;
    }

    @Override // uc.l
    public jc.w invoke(View view) {
        View view2 = view;
        j0.i(view2, "it");
        i iVar = this.f36141c;
        int iN = u1.a.n(this.f36142d.f37006c);
        KProperty<Object>[] kPropertyArr = i.f36104v;
        Objects.requireNonNull(iVar);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        int i10 = ((ViewGroup.MarginLayoutParams) ((m9.d) layoutParams)).height;
        if (i10 == -1 || i10 == -3) {
            iVar.z(view2, iN, view2.getMeasuredWidth());
        }
        return jc.w.f31842a;
    }
}
