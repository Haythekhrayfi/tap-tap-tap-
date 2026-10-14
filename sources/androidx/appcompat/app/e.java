package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes.dex */
public class e implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AlertController f665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AlertController.b f666d;

    public e(AlertController.b bVar, AlertController alertController) {
        this.f666d = bVar;
        this.f665c = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        this.f666d.f584w.onClick(this.f665c.f534b, i10);
        if (this.f666d.G) {
            return;
        }
        this.f665c.f534b.dismiss();
    }
}
