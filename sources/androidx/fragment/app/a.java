package androidx.fragment.app;

import android.util.Log;
import ch.qos.logback.core.joran.action.ActionConst;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a extends e0 implements FragmentManager.m {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final FragmentManager f1967q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f1968r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1969s;

    /* JADX WARN: Illegal instructions before constructor call */
    public a(FragmentManager fragmentManager) {
        r rVarH = fragmentManager.H();
        s<?> sVar = fragmentManager.f1919u;
        super(rVarH, sVar != null ? sVar.f2109d.getClassLoader() : null);
        this.f1969s = -1;
        this.f1967q = fragmentManager;
    }

    @Override // androidx.fragment.app.FragmentManager.m
    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (FragmentManager.K(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f2011g) {
            return true;
        }
        FragmentManager fragmentManager = this.f1967q;
        if (fragmentManager.f1902d == null) {
            fragmentManager.f1902d = new ArrayList<>();
        }
        fragmentManager.f1902d.add(this);
        return true;
    }

    @Override // androidx.fragment.app.e0
    public int c() {
        return k(false);
    }

    @Override // androidx.fragment.app.e0
    public void d() {
        if (this.f2011g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f2012h = false;
        this.f1967q.B(this, false);
    }

    @Override // androidx.fragment.app.e0
    public void e(int i10, Fragment fragment, String str, int i11) {
        super.e(i10, fragment, str, i11);
        fragment.mFragmentManager = this.f1967q;
    }

    @Override // androidx.fragment.app.e0
    public e0 f(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f1967q) {
            super.f(fragment);
            return this;
        }
        StringBuilder sbA = defpackage.a.a("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
        sbA.append(fragment.toString());
        sbA.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(sbA.toString());
    }

    @Override // androidx.fragment.app.e0
    public e0 h(Fragment fragment, androidx.lifecycle.i.c cVar) {
        if (fragment.mFragmentManager != this.f1967q) {
            StringBuilder sbA = defpackage.a.a("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
            sbA.append(this.f1967q);
            throw new IllegalArgumentException(sbA.toString());
        }
        if (cVar == androidx.lifecycle.i.c.INITIALIZED && fragment.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + cVar + " after the Fragment has been created");
        }
        if (cVar != androidx.lifecycle.i.c.DESTROYED) {
            super.h(fragment, cVar);
            return this;
        }
        throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + cVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
    }

    public void i(int i10) {
        if (this.f2011g) {
            if (FragmentManager.K(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
            }
            int size = this.f2005a.size();
            for (int i11 = 0; i11 < size; i11++) {
                e0.a aVar = this.f2005a.get(i11);
                Fragment fragment = aVar.f2022b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i10;
                    if (FragmentManager.K(2)) {
                        StringBuilder sbA = defpackage.a.a("Bump nesting of ");
                        sbA.append(aVar.f2022b);
                        sbA.append(" to ");
                        sbA.append(aVar.f2022b.mBackStackNesting);
                        Log.v("FragmentManager", sbA.toString());
                    }
                }
            }
        }
    }

    public int j() {
        return k(true);
    }

    public int k(boolean z10) {
        if (this.f1968r) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManager.K(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new k0("FragmentManager"));
            l("  ", printWriter, true);
            printWriter.close();
        }
        this.f1968r = true;
        this.f1969s = this.f2011g ? this.f1967q.f1907i.getAndIncrement() : -1;
        this.f1967q.y(this, z10);
        return this.f1969s;
    }

    public void l(String str, PrintWriter printWriter, boolean z10) {
        String string;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f2013i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1969s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1968r);
            if (this.f2010f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f2010f));
            }
            if (this.f2006b != 0 || this.f2007c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2006b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2007c));
            }
            if (this.f2008d != 0 || this.f2009e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2008d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2009e));
            }
            if (this.f2014j != 0 || this.f2015k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2014j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f2015k);
            }
            if (this.f2016l != 0 || this.f2017m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2016l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f2017m);
            }
        }
        if (this.f2005a.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f2005a.size();
        for (int i10 = 0; i10 < size; i10++) {
            e0.a aVar = this.f2005a.get(i10);
            switch (aVar.f2021a) {
                case 0:
                    string = ActionConst.NULL;
                    break;
                case 1:
                    string = "ADD";
                    break;
                case 2:
                    string = "REPLACE";
                    break;
                case 3:
                    string = "REMOVE";
                    break;
                case 4:
                    string = "HIDE";
                    break;
                case 5:
                    string = "SHOW";
                    break;
                case 6:
                    string = "DETACH";
                    break;
                case 7:
                    string = "ATTACH";
                    break;
                case 8:
                    string = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    string = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    string = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    StringBuilder sbA = defpackage.a.a("cmd=");
                    sbA.append(aVar.f2021a);
                    string = sbA.toString();
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i10);
            printWriter.print(": ");
            printWriter.print(string);
            printWriter.print(" ");
            printWriter.println(aVar.f2022b);
            if (z10) {
                if (aVar.f2024d != 0 || aVar.f2025e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f2024d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f2025e));
                }
                if (aVar.f2026f != 0 || aVar.f2027g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f2026f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f2027g));
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1969s >= 0) {
            sb2.append(" #");
            sb2.append(this.f1969s);
        }
        if (this.f2013i != null) {
            sb2.append(" ");
            sb2.append(this.f2013i);
        }
        sb2.append("}");
        return sb2.toString();
    }
}
