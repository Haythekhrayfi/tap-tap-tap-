package u8;

import android.view.View;
import android.view.ViewGroup;
import fd.j0;
import java.util.Objects;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends vc.l implements uc.p<View, Integer, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f36134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f36135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vc.y f36136e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(i iVar, int i10, vc.y yVar) {
        super(2);
        this.f36134c = iVar;
        this.f36135d = i10;
        this.f36136e = yVar;
    }

    @Override // uc.p
    public jc.w invoke(View view, Integer num) {
        View view2 = view;
        int iIntValue = num.intValue();
        j0.i(view2, "child");
        i iVar = this.f36134c;
        KProperty<Object>[] kPropertyArr = i.f36104v;
        if (iVar.t(iIntValue)) {
            i iVar2 = this.f36134c;
            iVar2.f36109h += iVar2.f36113l;
        }
        i iVar3 = this.f36134c;
        float f10 = iVar3.f36122u;
        m9.e.a aVar = m9.e.f33332c;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        iVar3.f36122u = i.i(iVar3, (m9.d) layoutParams) + f10;
        i iVar4 = this.f36134c;
        int i10 = this.f36135d;
        int i11 = this.f36136e.f37006c;
        if (iVar4.v(view2, i10)) {
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            m9.d dVar = (m9.d) layoutParams2;
            if (((ViewGroup.MarginLayoutParams) dVar).width == -3) {
                ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                m9.d dVar2 = (m9.d) layoutParams3;
                int i12 = dVar2.f33331h;
                ((ViewGroup.MarginLayoutParams) dVar2).width = -2;
                dVar2.f33331h = Integer.MAX_VALUE;
                iVar4.measureChildWithMargins(view2, i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) dVar2).width = -3;
                dVar2.f33331h = i12;
                iVar4.f36110i = iVar4.q(iVar4.f36110i, dVar2.a() + view2.getMeasuredWidth());
                iVar4.f36118q.add(view2);
            } else {
                iVar4.measureChildWithMargins(view2, i10, 0, i11, 0);
            }
            iVar4.f36111j = ViewGroup.combineMeasuredStates(iVar4.f36111j, view2.getMeasuredState());
            iVar4.D(i11, dVar.b() + view2.getMeasuredHeight());
            iVar4.C(view2);
            if (iVar4.v(view2, i10)) {
                iVar4.f36109h = iVar4.q(iVar4.f36109h, dVar.a() + view2.getMeasuredWidth());
            }
        }
        return jc.w.f31842a;
    }
}
