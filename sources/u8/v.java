package u8;

import android.view.View;
import android.view.ViewGroup;
import fd.j0;
import java.util.Objects;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes2.dex */
public final class v extends vc.l implements uc.l<View, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f36154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f36155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vc.y f36156e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vc.x f36157f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f36158g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(int i10, i iVar, vc.y yVar, vc.x xVar, int i11) {
        super(1);
        this.f36154c = i10;
        this.f36155d = iVar;
        this.f36156e = yVar;
        this.f36157f = xVar;
        this.f36158g = i11;
    }

    @Override // uc.l
    public jc.w invoke(View view) {
        View view2 = view;
        j0.i(view2, "child");
        m9.e.a aVar = m9.e.f33332c;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        m9.d dVar = (m9.d) layoutParams;
        if (((ViewGroup.MarginLayoutParams) dVar).width == -1) {
            if (this.f36154c > 0) {
                float fI = i.i(this.f36155d, dVar) * this.f36156e.f37006c;
                vc.x xVar = this.f36157f;
                float f10 = xVar.f37005c;
                int i10 = (int) (fI / f10);
                xVar.f37005c = f10 - i.i(this.f36155d, dVar);
                this.f36156e.f37006c -= i10;
                this.f36155d.z(view2, this.f36158g, i10);
            } else {
                i iVar = this.f36155d;
                int i11 = this.f36158g;
                KProperty<Object>[] kPropertyArr = i.f36104v;
                iVar.z(view2, i11, 0);
            }
        }
        i iVar2 = this.f36155d;
        int i12 = this.f36158g;
        int iB = dVar.b() + view2.getMeasuredHeight();
        KProperty<Object>[] kPropertyArr2 = i.f36104v;
        iVar2.D(i12, iB);
        i iVar3 = this.f36155d;
        iVar3.f36109h = iVar3.q(iVar3.f36109h, dVar.a() + view2.getMeasuredWidth());
        this.f36155d.C(view2);
        return jc.w.f31842a;
    }
}
