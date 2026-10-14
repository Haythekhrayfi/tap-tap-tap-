package od;

import android.database.DataSetObserver;
import nl.psdcompany.duonavigationdrawer.views.DuoMenuView;

/* JADX INFO: loaded from: classes3.dex */
public class a extends DataSetObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DuoMenuView f34231a;

    public a(DuoMenuView duoMenuView) {
        this.f34231a = duoMenuView;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        super.onChanged();
        DuoMenuView duoMenuView = this.f34231a;
        int i10 = DuoMenuView.f33844k;
        duoMenuView.d();
        this.f34231a.postInvalidate();
        this.f34231a.requestLayout();
    }
}
