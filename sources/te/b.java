package te;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import fd.j0;
import jc.w;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends RecyclerView.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f35895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uc.a<w> f35896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uc.a<w> f35897c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(View view, uc.a<w> aVar, uc.a<w> aVar2) {
        super(view);
        j0.i(view, "view");
        j0.i(aVar, "onItemSelected");
        j0.i(aVar2, "onItemClear");
        this.f35895a = view;
        this.f35896b = aVar;
        this.f35897c = aVar2;
    }
}
