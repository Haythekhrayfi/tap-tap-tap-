package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes.dex */
public class f implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AlertController.RecycleListView f667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AlertController f668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AlertController.b f669e;

    public f(AlertController.b bVar, AlertController.RecycleListView recycleListView, AlertController alertController) {
        this.f669e = bVar;
        this.f667c = recycleListView;
        this.f668d = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        boolean[] zArr = this.f669e.E;
        if (zArr != null) {
            zArr[i10] = this.f667c.isItemChecked(i10);
        }
        this.f669e.I.onClick(this.f668d.f534b, i10, this.f667c.isItemChecked(i10));
    }
}
