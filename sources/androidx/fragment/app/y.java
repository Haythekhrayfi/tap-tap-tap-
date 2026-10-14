package androidx.fragment.app;

import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class y extends androidx.lifecycle.l0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final androidx.lifecycle.m0.b f2121g = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f2125d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap<String, Fragment> f2122a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap<String, y> f2123b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap<String, androidx.lifecycle.n0> f2124c = new HashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2126e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2127f = false;

    public class a implements androidx.lifecycle.m0.b {
        @Override // androidx.lifecycle.m0.b
        public <T extends androidx.lifecycle.l0> T a(Class<T> cls) {
            return new y(true);
        }
    }

    public y(boolean z10) {
        this.f2125d = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y.class != obj.getClass()) {
            return false;
        }
        y yVar = (y) obj;
        return this.f2122a.equals(yVar.f2122a) && this.f2123b.equals(yVar.f2123b) && this.f2124c.equals(yVar.f2124c);
    }

    public int hashCode() {
        return this.f2124c.hashCode() + ((this.f2123b.hashCode() + (this.f2122a.hashCode() * 31)) * 31);
    }

    @Override // androidx.lifecycle.l0
    public void onCleared() {
        if (FragmentManager.K(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f2126e = true;
    }

    public void r(Fragment fragment) {
        if (this.f2127f) {
            if (FragmentManager.K(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f2122a.containsKey(fragment.mWho)) {
                return;
            }
            this.f2122a.put(fragment.mWho, fragment);
            if (FragmentManager.K(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    public void s(Fragment fragment) {
        if (FragmentManager.K(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        t(fragment.mWho);
    }

    public final void t(String str) {
        y yVar = this.f2123b.get(str);
        if (yVar != null) {
            yVar.onCleared();
            this.f2123b.remove(str);
        }
        androidx.lifecycle.n0 n0Var = this.f2124c.get(str);
        if (n0Var != null) {
            n0Var.a();
            this.f2124c.remove(str);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator<Fragment> it = this.f2122a.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator<String> it2 = this.f2123b.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator<String> it3 = this.f2124c.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append(it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb2.toString();
    }

    public void u(Fragment fragment) {
        if (this.f2127f) {
            if (FragmentManager.K(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        if ((this.f2122a.remove(fragment.mWho) != null) && FragmentManager.K(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    public boolean v(Fragment fragment) {
        if (this.f2122a.containsKey(fragment.mWho) && this.f2125d) {
            return this.f2126e;
        }
        return true;
    }
}
