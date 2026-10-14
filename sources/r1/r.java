package r1;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f35133b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, Object> f35132a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<l> f35134c = new ArrayList<>();

    @Deprecated
    public r() {
    }

    public r(View view) {
        this.f35133b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f35133b == rVar.f35133b && this.f35132a.equals(rVar.f35132a);
    }

    public int hashCode() {
        return this.f35132a.hashCode() + (this.f35133b.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("TransitionValues@");
        sbA.append(Integer.toHexString(hashCode()));
        sbA.append(":\n");
        StringBuilder sbA2 = android.support.v4.media.c.a(sbA.toString(), "    view = ");
        sbA2.append(this.f35133b);
        sbA2.append("\n");
        String strA = i.f.a(sbA2.toString(), "    values:");
        for (String str : this.f35132a.keySet()) {
            strA = strA + "    " + str + ": " + this.f35132a.get(str) + "\n";
        }
        return strA;
    }
}
