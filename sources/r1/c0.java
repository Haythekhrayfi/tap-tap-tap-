package r1;

import android.view.View;
import android.view.WindowId;

/* JADX INFO: loaded from: classes.dex */
public class c0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowId f35077a;

    public c0(View view) {
        this.f35077a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof c0) && ((c0) obj).f35077a.equals(this.f35077a);
    }

    public int hashCode() {
        return this.f35077a.hashCode();
    }
}
