package d0;

import android.os.Bundle;
import android.widget.RemoteViews;

/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t f28617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f28618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f28619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f28620d = false;

    public void a(Bundle bundle) {
        if (this.f28620d) {
            bundle.putCharSequence("android.summaryText", this.f28619c);
        }
        CharSequence charSequence = this.f28618b;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        String strD = d();
        if (strD != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strD);
        }
    }

    public void b(n nVar) {
    }

    public void c(Bundle bundle) {
        bundle.remove("android.summaryText");
        bundle.remove("android.title.big");
        bundle.remove("androidx.core.app.extra.COMPAT_TEMPLATE");
    }

    public String d() {
        return null;
    }

    public RemoteViews e(n nVar) {
        return null;
    }

    public RemoteViews f(n nVar) {
        return null;
    }

    public RemoteViews g(n nVar) {
        return null;
    }

    public void h(Bundle bundle) {
        if (bundle.containsKey("android.summaryText")) {
            this.f28619c = bundle.getCharSequence("android.summaryText");
            this.f28620d = true;
        }
        this.f28618b = bundle.getCharSequence("android.title.big");
    }

    public void i(t tVar) {
        if (this.f28617a != tVar) {
            this.f28617a = tVar;
            if (tVar == null || tVar.f28594p == this) {
                return;
            }
            tVar.f28594p = this;
            i(tVar);
        }
    }
}
