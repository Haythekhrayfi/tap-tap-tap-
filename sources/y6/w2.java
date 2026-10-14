package y6;

import android.view.View;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class w2 implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f38420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f38421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f38422c;

    public w2(View view, View view2, View view3) {
        fd.j0.i(view, "start");
        fd.j0.i(view2, "end");
        fd.j0.i(view3, "line");
        this.f38420a = view;
        this.f38421b = view2;
        this.f38422c = view3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w2)) {
            return false;
        }
        w2 w2Var = (w2) obj;
        return fd.j0.d(this.f38420a, w2Var.f38420a) && fd.j0.d(this.f38421b, w2Var.f38421b) && fd.j0.d(this.f38422c, w2Var.f38422c);
    }

    public int hashCode() {
        return this.f38422c.hashCode() + ((this.f38421b.hashCode() + (this.f38420a.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("SwipeView(start=");
        sbA.append(this.f38420a);
        sbA.append(", end=");
        sbA.append(this.f38421b);
        sbA.append(", line=");
        sbA.append(this.f38422c);
        sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sbA.toString();
    }
}
