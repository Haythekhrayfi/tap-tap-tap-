package q0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f34742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f34743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f34744e;

    public a(int i10, c cVar, int i11) {
        this.f34742c = i10;
        this.f34743d = cVar;
        this.f34744e = i11;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f34742c);
        c cVar = this.f34743d;
        cVar.f34746a.performAction(this.f34744e, bundle);
    }
}
