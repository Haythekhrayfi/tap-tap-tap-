package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<Fragment> f1994a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap<String, b0> f1995b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap<String, FragmentState> f1996c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y f1997d;

    public void a(Fragment fragment) {
        if (this.f1994a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f1994a) {
            this.f1994a.add(fragment);
        }
        fragment.mAdded = true;
    }

    public void b() {
        this.f1995b.values().removeAll(Collections.singleton(null));
    }

    public Fragment c(String str) {
        b0 b0Var = this.f1995b.get(str);
        if (b0Var != null) {
            return b0Var.f1984c;
        }
        return null;
    }

    public Fragment d(String str) {
        Fragment fragmentFindFragmentByWho;
        for (b0 b0Var : this.f1995b.values()) {
            if (b0Var != null && (fragmentFindFragmentByWho = b0Var.f1984c.findFragmentByWho(str)) != null) {
                return fragmentFindFragmentByWho;
            }
        }
        return null;
    }

    public List<b0> e() {
        ArrayList arrayList = new ArrayList();
        for (b0 b0Var : this.f1995b.values()) {
            if (b0Var != null) {
                arrayList.add(b0Var);
            }
        }
        return arrayList;
    }

    public List<Fragment> f() {
        ArrayList arrayList = new ArrayList();
        Iterator<b0> it = this.f1995b.values().iterator();
        while (it.hasNext()) {
            b0 next = it.next();
            arrayList.add(next != null ? next.f1984c : null);
        }
        return arrayList;
    }

    public b0 g(String str) {
        return this.f1995b.get(str);
    }

    public List<Fragment> h() {
        ArrayList arrayList;
        if (this.f1994a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f1994a) {
            arrayList = new ArrayList(this.f1994a);
        }
        return arrayList;
    }

    public void i(b0 b0Var) {
        Fragment fragment = b0Var.f1984c;
        if (this.f1995b.get(fragment.mWho) != null) {
            return;
        }
        this.f1995b.put(fragment.mWho, b0Var);
        if (fragment.mRetainInstanceChangedWhileDetached) {
            if (fragment.mRetainInstance) {
                this.f1997d.r(fragment);
            } else {
                this.f1997d.u(fragment);
            }
            fragment.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.K(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragment);
        }
    }

    public void j(b0 b0Var) {
        Fragment fragment = b0Var.f1984c;
        if (fragment.mRetainInstance) {
            this.f1997d.u(fragment);
        }
        if (this.f1995b.put(fragment.mWho, null) != null && FragmentManager.K(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragment);
        }
    }

    public void k(Fragment fragment) {
        synchronized (this.f1994a) {
            this.f1994a.remove(fragment);
        }
        fragment.mAdded = false;
    }

    public FragmentState l(String str, FragmentState fragmentState) {
        return fragmentState != null ? this.f1996c.put(str, fragmentState) : this.f1996c.remove(str);
    }
}
