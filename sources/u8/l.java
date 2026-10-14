package u8;

import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import fd.j0;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.reflect.KProperty;
import p0.e0;
import p0.m0;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends vc.l implements uc.p<View, Integer, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f36129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f36130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f36131e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f36132f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vc.y f36133g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(int i10, i iVar, int i11, int i12, vc.y yVar) {
        super(2);
        this.f36129c = i10;
        this.f36130d = iVar;
        this.f36131e = i11;
        this.f36132f = i12;
        this.f36133g = yVar;
    }

    @Override // uc.p
    public jc.w invoke(View view, Integer num) {
        int iA;
        View view2 = view;
        int iIntValue = num.intValue();
        j0.i(view2, "child");
        int measuredWidth = view2.getMeasuredWidth();
        int measuredHeight = view2.getMeasuredHeight();
        m9.e.a aVar = m9.e.f33332c;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        m9.d dVar = (m9.d) layoutParams;
        int i10 = dVar.f33324a;
        if (i10 < 0) {
            i10 = this.f36129c;
        }
        i iVar = this.f36130d;
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, e0.e.d(iVar)) & 7;
        if (absoluteGravity != 1) {
            iA = (absoluteGravity == 3 || absoluteGravity != 5) ? this.f36130d.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar).leftMargin : (this.f36132f - measuredWidth) - ((ViewGroup.MarginLayoutParams) dVar).rightMargin;
        } else {
            iA = androidx.appcompat.widget.a.a((this.f36131e - measuredWidth) + ((ViewGroup.MarginLayoutParams) dVar).leftMargin, ((ViewGroup.MarginLayoutParams) dVar).rightMargin, 2, this.f36130d.getPaddingLeft());
        }
        i iVar2 = this.f36130d;
        KProperty<Object>[] kPropertyArr = i.f36104v;
        if (iVar2.t(iIntValue)) {
            this.f36133g.f37006c += this.f36130d.f36114m;
        }
        vc.y yVar = this.f36133g;
        int i11 = yVar.f37006c + ((ViewGroup.MarginLayoutParams) dVar).topMargin;
        yVar.f37006c = i11;
        Objects.requireNonNull(this.f36130d);
        view2.layout(iA, i11, measuredWidth + iA, measuredHeight + i11);
        vc.y yVar2 = this.f36133g;
        yVar2.f37006c = measuredHeight + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin + yVar2.f37006c;
        return jc.w.f31842a;
    }
}
