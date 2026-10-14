package y6;

import android.view.View;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class y2 implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f38433a;

    public y2(View view) {
        fd.j0.i(view, "view");
        this.f38433a = view;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y2) && fd.j0.d(this.f38433a, ((y2) obj).f38433a);
    }

    public int hashCode() {
        return this.f38433a.hashCode();
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("TapView(view=");
        sbA.append(this.f38433a);
        sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sbA.toString();
    }
}
