package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes.dex */
public class g0 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h0 f1224c;

    public g0(h0 h0Var) {
        this.f1224c = h0Var;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        d0 d0Var;
        if (i10 == -1 || (d0Var = this.f1224c.f1235e) == null) {
            return;
        }
        d0Var.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
