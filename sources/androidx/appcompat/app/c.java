package androidx.appcompat.app;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* JADX INFO: loaded from: classes.dex */
public class c extends ArrayAdapter<CharSequence> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AlertController.RecycleListView f658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AlertController.b f659d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AlertController.b bVar, Context context, int i10, int i11, CharSequence[] charSequenceArr, AlertController.RecycleListView recycleListView) {
        super(context, i10, i11, charSequenceArr);
        this.f659d = bVar;
        this.f658c = recycleListView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i10, view, viewGroup);
        boolean[] zArr = this.f659d.E;
        if (zArr != null && zArr[i10]) {
            this.f658c.setItemChecked(i10, true);
        }
        return view2;
    }
}
