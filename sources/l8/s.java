package l8;

import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.View;
import com.inscode.autoclicker.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends vc.l implements uc.l<Object, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<y9.e0> f32808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f32809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Drawable f32810e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f32811f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i8.k f32812g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v9.d f32813h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ DisplayMetrics f32814i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s(List<? extends y9.e0> list, View view, Drawable drawable, p pVar, i8.k kVar, v9.d dVar, DisplayMetrics displayMetrics) {
        super(1);
        this.f32808c = list;
        this.f32809d = view;
        this.f32810e = drawable;
        this.f32811f = pVar;
        this.f32812g = kVar;
        this.f32813h = dVar;
        this.f32814i = displayMetrics;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [kc.w] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    @Override // uc.l
    public jc.w invoke(Object obj) {
        ?? arrayList;
        fd.j0.i(obj, "$noName_0");
        List<y9.e0> list = this.f32808c;
        if (list == null) {
            arrayList = 0;
        } else {
            p pVar = this.f32811f;
            DisplayMetrics displayMetrics = this.f32814i;
            v9.d dVar = this.f32813h;
            arrayList = new ArrayList(kc.m.j(list, 10));
            for (y9.e0 e0Var : list) {
                fd.j0.h(displayMetrics, "metrics");
                arrayList.add(p.a(pVar, e0Var, displayMetrics, dVar));
            }
        }
        if (arrayList == 0) {
            arrayList = kc.w.f32009c;
        }
        Object tag = this.f32809d.getTag(R.id.div_default_background_list_tag);
        List list2 = tag instanceof List ? (List) tag : null;
        Object tag2 = this.f32809d.getTag(R.id.div_additional_background_layer_tag);
        if ((fd.j0.d(list2, arrayList) && fd.j0.d(tag2 instanceof Drawable ? (Drawable) tag2 : null, this.f32810e)) ? false : true) {
            p pVar2 = this.f32811f;
            View view = this.f32809d;
            p.c(pVar2, view, p.b(pVar2, arrayList, view, this.f32812g, this.f32810e, this.f32813h));
            this.f32809d.setTag(R.id.div_default_background_list_tag, arrayList);
            this.f32809d.setTag(R.id.div_focused_background_list_tag, null);
            this.f32809d.setTag(R.id.div_additional_background_layer_tag, this.f32810e);
        }
        return jc.w.f31842a;
    }
}
