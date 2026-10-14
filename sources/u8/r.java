package u8;

import android.view.View;
import android.view.ViewGroup;
import fd.j0;
import java.util.Objects;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends vc.l implements uc.l<View, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f36146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vc.y f36147d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(i iVar, vc.y yVar) {
        super(1);
        this.f36146c = iVar;
        this.f36147d = yVar;
    }

    @Override // uc.l
    public jc.w invoke(View view) {
        View view2 = view;
        j0.i(view2, "it");
        i iVar = this.f36146c;
        int i10 = this.f36147d.f37006c;
        KProperty<Object>[] kPropertyArr = i.f36104v;
        if (!iVar.u(view2, i10)) {
            int i11 = iVar.f36109h;
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            iVar.f36109h = iVar.q(i11, ((m9.d) layoutParams).b());
        }
        return jc.w.f31842a;
    }
}
