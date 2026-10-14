package u8;

import android.view.View;
import android.view.ViewGroup;
import fd.j0;
import java.util.Objects;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes2.dex */
public final class u extends vc.l implements uc.l<View, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f36148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f36149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vc.y f36150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vc.x f36151f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f36152g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f36153h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(int i10, i iVar, vc.y yVar, vc.x xVar, int i11, int i12) {
        super(1);
        this.f36148c = i10;
        this.f36149d = iVar;
        this.f36150e = yVar;
        this.f36151f = xVar;
        this.f36152g = i11;
        this.f36153h = i12;
    }

    @Override // uc.l
    public jc.w invoke(View view) {
        View view2 = view;
        j0.i(view2, "child");
        m9.e.a aVar = m9.e.f33332c;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        m9.d dVar = (m9.d) layoutParams;
        if (((ViewGroup.MarginLayoutParams) dVar).height == -1) {
            if (this.f36148c > 0) {
                float fJ = i.j(this.f36149d, dVar) * this.f36150e.f37006c;
                vc.x xVar = this.f36151f;
                float f10 = xVar.f37005c;
                int i10 = (int) (fJ / f10);
                xVar.f37005c = f10 - i.j(this.f36149d, dVar);
                this.f36150e.f37006c -= i10;
                this.f36149d.A(view2, this.f36152g, this.f36153h, i10);
            } else if (this.f36149d.f36119r.contains(view2)) {
                this.f36149d.A(view2, this.f36152g, this.f36153h, 0);
            }
        }
        i iVar = this.f36149d;
        int i11 = this.f36152g;
        int iA = dVar.a() + view2.getMeasuredWidth();
        KProperty<Object>[] kPropertyArr = i.f36104v;
        iVar.D(i11, iA);
        i iVar2 = this.f36149d;
        iVar2.f36109h = iVar2.q(iVar2.f36109h, dVar.b() + view2.getMeasuredHeight());
        return jc.w.f31842a;
    }
}
