package u8;

import android.view.View;
import android.view.ViewGroup;
import fd.j0;
import java.util.Objects;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends vc.l implements uc.p<View, Integer, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f36143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f36144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vc.y f36145e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(i iVar, int i10, vc.y yVar) {
        super(2);
        this.f36143c = iVar;
        this.f36144d = i10;
        this.f36145e = yVar;
    }

    @Override // uc.p
    public jc.w invoke(View view, Integer num) {
        boolean z10;
        View view2 = view;
        int iIntValue = num.intValue();
        j0.i(view2, "child");
        i iVar = this.f36143c;
        KProperty<Object>[] kPropertyArr = i.f36104v;
        if (iVar.t(iIntValue)) {
            i iVar2 = this.f36143c;
            iVar2.f36109h += iVar2.f36114m;
        }
        i iVar3 = this.f36143c;
        float f10 = iVar3.f36122u;
        m9.e.a aVar = m9.e.f33332c;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        iVar3.f36122u = i.j(iVar3, (m9.d) layoutParams) + f10;
        i iVar4 = this.f36143c;
        int i10 = this.f36144d;
        int i11 = this.f36145e.f37006c;
        Objects.requireNonNull(iVar4);
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        m9.d dVar = (m9.d) layoutParams2;
        boolean zI = u1.a.i(i10);
        boolean zU = iVar4.u(view2, i11);
        if (zI) {
            z10 = zU;
        } else {
            z10 = ((ViewGroup.MarginLayoutParams) dVar).width != -1;
        }
        if (z10) {
            iVar4.x(view2, i10, i11, true, true);
        } else {
            if (!zI) {
                iVar4.f36121t.add(view2);
            }
            if (!zU) {
                iVar4.f36119r.add(view2);
            }
        }
        return jc.w.f31842a;
    }
}
