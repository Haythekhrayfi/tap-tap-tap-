package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.r0;
import androidx.lifecycle.o0;
import com.applovin.sdk.AppLovinMediationProvider;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.inscode.autoclicker.R;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f1982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f1983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Fragment f1984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1985d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1986e = -1;

    public class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f1987c;

        public a(b0 b0Var, View view) {
            this.f1987c = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f1987c.removeOnAttachStateChangeListener(this);
            View view2 = this.f1987c;
            WeakHashMap<View, p0.m0> weakHashMap = p0.e0.f34354a;
            p0.e0.h.c(view2);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1988a;

        static {
            int[] iArr = new int[androidx.lifecycle.i.c.values().length];
            f1988a = iArr;
            try {
                iArr[androidx.lifecycle.i.c.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1988a[androidx.lifecycle.i.c.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1988a[androidx.lifecycle.i.c.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1988a[androidx.lifecycle.i.c.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public b0(u uVar, c0 c0Var, Fragment fragment) {
        this.f1982a = uVar;
        this.f1983b = c0Var;
        this.f1984c = fragment;
    }

    public b0(u uVar, c0 c0Var, Fragment fragment, FragmentState fragmentState) {
        this.f1982a = uVar;
        this.f1983b = c0Var;
        this.f1984c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = fragmentState.f1965o;
        fragment.mSavedFragmentState = bundle == null ? new Bundle() : bundle;
    }

    public b0(u uVar, c0 c0Var, ClassLoader classLoader, r rVar, FragmentState fragmentState) {
        this.f1982a = uVar;
        this.f1983b = c0Var;
        Fragment fragmentA = rVar.a(classLoader, fragmentState.f1953c);
        Bundle bundle = fragmentState.f1962l;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        fragmentA.setArguments(fragmentState.f1962l);
        fragmentA.mWho = fragmentState.f1954d;
        fragmentA.mFromLayout = fragmentState.f1955e;
        fragmentA.mRestored = true;
        fragmentA.mFragmentId = fragmentState.f1956f;
        fragmentA.mContainerId = fragmentState.f1957g;
        fragmentA.mTag = fragmentState.f1958h;
        fragmentA.mRetainInstance = fragmentState.f1959i;
        fragmentA.mRemoving = fragmentState.f1960j;
        fragmentA.mDetached = fragmentState.f1961k;
        fragmentA.mHidden = fragmentState.f1963m;
        fragmentA.mMaxState = androidx.lifecycle.i.c.values()[fragmentState.f1964n];
        Bundle bundle2 = fragmentState.f1965o;
        fragmentA.mSavedFragmentState = bundle2 == null ? new Bundle() : bundle2;
        this.f1984c = fragmentA;
        if (FragmentManager.K(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + fragmentA);
        }
    }

    public void a() {
        if (FragmentManager.K(3)) {
            StringBuilder sbA = defpackage.a.a("moveto ACTIVITY_CREATED: ");
            sbA.append(this.f1984c);
            Log.d("FragmentManager", sbA.toString());
        }
        Fragment fragment = this.f1984c;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        u uVar = this.f1982a;
        Fragment fragment2 = this.f1984c;
        uVar.a(fragment2, fragment2.mSavedFragmentState, false);
    }

    public void b() {
        View view;
        View view2;
        c0 c0Var = this.f1983b;
        Fragment fragment = this.f1984c;
        Objects.requireNonNull(c0Var);
        ViewGroup viewGroup = fragment.mContainer;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            int iIndexOf = c0Var.f1994a.indexOf(fragment);
            for (int i10 = iIndexOf - 1; i10 >= 0; i10--) {
                Fragment fragment2 = c0Var.f1994a.get(i10);
                if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                }
            }
            while (true) {
                iIndexOf++;
                if (iIndexOf >= c0Var.f1994a.size()) {
                    break;
                }
                Fragment fragment3 = c0Var.f1994a.get(iIndexOf);
                if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view);
                    break;
                }
            }
        }
        Fragment fragment4 = this.f1984c;
        fragment4.mContainer.addView(fragment4.mView, iIndexOfChild);
    }

    public void c() {
        if (FragmentManager.K(3)) {
            StringBuilder sbA = defpackage.a.a("moveto ATTACHED: ");
            sbA.append(this.f1984c);
            Log.d("FragmentManager", sbA.toString());
        }
        Fragment fragment = this.f1984c;
        Fragment fragment2 = fragment.mTarget;
        b0 b0VarG = null;
        if (fragment2 != null) {
            b0 b0VarG2 = this.f1983b.g(fragment2.mWho);
            if (b0VarG2 == null) {
                StringBuilder sbA2 = defpackage.a.a("Fragment ");
                sbA2.append(this.f1984c);
                sbA2.append(" declared target fragment ");
                sbA2.append(this.f1984c.mTarget);
                sbA2.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sbA2.toString());
            }
            Fragment fragment3 = this.f1984c;
            fragment3.mTargetWho = fragment3.mTarget.mWho;
            fragment3.mTarget = null;
            b0VarG = b0VarG2;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (b0VarG = this.f1983b.g(str)) == null) {
                StringBuilder sbA3 = defpackage.a.a("Fragment ");
                sbA3.append(this.f1984c);
                sbA3.append(" declared target fragment ");
                throw new IllegalStateException(androidx.activity.k.a(sbA3, this.f1984c.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (b0VarG != null) {
            b0VarG.k();
        }
        Fragment fragment4 = this.f1984c;
        FragmentManager fragmentManager = fragment4.mFragmentManager;
        fragment4.mHost = fragmentManager.f1919u;
        fragment4.mParentFragment = fragmentManager.f1921w;
        this.f1982a.g(fragment4, false);
        this.f1984c.performAttach();
        this.f1982a.b(this.f1984c, false);
    }

    public int d() {
        Fragment fragment = this.f1984c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int iMin = this.f1986e;
        int i10 = b.f1988a[fragment.mMaxState.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                iMin = Math.min(iMin, 5);
            } else if (i10 != 3) {
                iMin = i10 != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0);
            } else {
                iMin = Math.min(iMin, 1);
            }
        }
        Fragment fragment2 = this.f1984c;
        if (fragment2.mFromLayout) {
            if (fragment2.mInLayout) {
                iMin = Math.max(this.f1986e, 2);
                View view = this.f1984c.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f1986e < 4 ? Math.min(iMin, fragment2.mState) : Math.min(iMin, 1);
            }
        }
        if (!this.f1984c.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        Fragment fragment3 = this.f1984c;
        ViewGroup viewGroup = fragment3.mContainer;
        l0.e.b bVar = null;
        l0.e eVar = null;
        if (viewGroup != null) {
            l0 l0VarF = l0.f(viewGroup, fragment3.getParentFragmentManager());
            Objects.requireNonNull(l0VarF);
            l0.e eVarD = l0VarF.d(this.f1984c);
            l0.e.b bVar2 = eVarD != null ? eVarD.f2089b : null;
            Fragment fragment4 = this.f1984c;
            for (l0.e eVar2 : l0VarF.f2078c) {
                if (eVar2.f2090c.equals(fragment4) && !eVar2.f2093f) {
                    eVar = eVar2;
                    break;
                }
            }
            bVar = (eVar == null || !(bVar2 == null || bVar2 == l0.e.b.NONE)) ? bVar2 : eVar.f2089b;
        }
        if (bVar == l0.e.b.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (bVar == l0.e.b.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else {
            Fragment fragment5 = this.f1984c;
            if (fragment5.mRemoving) {
                iMin = fragment5.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
            }
        }
        Fragment fragment6 = this.f1984c;
        if (fragment6.mDeferStart && fragment6.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (FragmentManager.K(2)) {
            StringBuilder sbA = r0.a("computeExpectedState() of ", iMin, " for ");
            sbA.append(this.f1984c);
            Log.v("FragmentManager", sbA.toString());
        }
        return iMin;
    }

    public void e() {
        if (FragmentManager.K(3)) {
            StringBuilder sbA = defpackage.a.a("moveto CREATED: ");
            sbA.append(this.f1984c);
            Log.d("FragmentManager", sbA.toString());
        }
        Fragment fragment = this.f1984c;
        if (fragment.mIsCreated) {
            fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
            this.f1984c.mState = 1;
            return;
        }
        this.f1982a.h(fragment, fragment.mSavedFragmentState, false);
        Fragment fragment2 = this.f1984c;
        fragment2.performCreate(fragment2.mSavedFragmentState);
        u uVar = this.f1982a;
        Fragment fragment3 = this.f1984c;
        uVar.c(fragment3, fragment3.mSavedFragmentState, false);
    }

    public void f() {
        String resourceName;
        if (this.f1984c.mFromLayout) {
            return;
        }
        if (FragmentManager.K(3)) {
            StringBuilder sbA = defpackage.a.a("moveto CREATE_VIEW: ");
            sbA.append(this.f1984c);
            Log.d("FragmentManager", sbA.toString());
        }
        Fragment fragment = this.f1984c;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
        ViewGroup viewGroup = null;
        Fragment fragment2 = this.f1984c;
        ViewGroup viewGroup2 = fragment2.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i10 = fragment2.mContainerId;
            if (i10 != 0) {
                if (i10 == -1) {
                    StringBuilder sbA2 = defpackage.a.a("Cannot create fragment ");
                    sbA2.append(this.f1984c);
                    sbA2.append(" for a container view with no id");
                    throw new IllegalArgumentException(sbA2.toString());
                }
                viewGroup = (ViewGroup) fragment2.mFragmentManager.f1920v.b(i10);
                if (viewGroup == null) {
                    Fragment fragment3 = this.f1984c;
                    if (!fragment3.mRestored) {
                        try {
                            resourceName = fragment3.getResources().getResourceName(this.f1984c.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = AppLovinMediationProvider.UNKNOWN;
                        }
                        StringBuilder sbA3 = defpackage.a.a("No view found for id 0x");
                        sbA3.append(Integer.toHexString(this.f1984c.mContainerId));
                        sbA3.append(" (");
                        sbA3.append(resourceName);
                        sbA3.append(") for fragment ");
                        sbA3.append(this.f1984c);
                        throw new IllegalArgumentException(sbA3.toString());
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    Fragment fragment4 = this.f1984c;
                    b1.b bVar = b1.b.f3231a;
                    fd.j0.i(fragment4, "fragment");
                    fd.j0.i(viewGroup, "container");
                    b1.m mVar = new b1.m(fragment4, viewGroup);
                    b1.b bVar2 = b1.b.f3231a;
                    b1.b.c(mVar);
                    b1.b.c cVarA = b1.b.a(fragment4);
                    if (cVarA.f3234a.contains(b1.b.a.DETECT_WRONG_FRAGMENT_CONTAINER) && b1.b.f(cVarA, fragment4.getClass(), b1.m.class)) {
                        b1.b.b(cVarA, mVar);
                    }
                }
            }
        }
        Fragment fragment5 = this.f1984c;
        fragment5.mContainer = viewGroup;
        fragment5.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, fragment5.mSavedFragmentState);
        View view = this.f1984c.mView;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            Fragment fragment6 = this.f1984c;
            fragment6.mView.setTag(R.id.fragment_container_view_tag, fragment6);
            if (viewGroup != null) {
                b();
            }
            Fragment fragment7 = this.f1984c;
            if (fragment7.mHidden) {
                fragment7.mView.setVisibility(8);
            }
            View view2 = this.f1984c.mView;
            WeakHashMap<View, p0.m0> weakHashMap = p0.e0.f34354a;
            if (p0.e0.g.b(view2)) {
                p0.e0.h.c(this.f1984c.mView);
            } else {
                View view3 = this.f1984c.mView;
                view3.addOnAttachStateChangeListener(new a(this, view3));
            }
            this.f1984c.performViewCreated();
            u uVar = this.f1982a;
            Fragment fragment8 = this.f1984c;
            uVar.m(fragment8, fragment8.mView, fragment8.mSavedFragmentState, false);
            int visibility = this.f1984c.mView.getVisibility();
            this.f1984c.setPostOnViewCreatedAlpha(this.f1984c.mView.getAlpha());
            Fragment fragment9 = this.f1984c;
            if (fragment9.mContainer != null && visibility == 0) {
                View viewFindFocus = fragment9.mView.findFocus();
                if (viewFindFocus != null) {
                    this.f1984c.setFocusedView(viewFindFocus);
                    if (FragmentManager.K(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + this.f1984c);
                    }
                }
                this.f1984c.mView.setAlpha(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
            }
        }
        this.f1984c.mState = 2;
    }

    public void g() {
        Fragment fragmentC;
        if (FragmentManager.K(3)) {
            StringBuilder sbA = defpackage.a.a("movefrom CREATED: ");
            sbA.append(this.f1984c);
            Log.d("FragmentManager", sbA.toString());
        }
        Fragment fragment = this.f1984c;
        boolean zIsChangingConfigurations = true;
        boolean z10 = fragment.mRemoving && !fragment.isInBackStack();
        if (z10) {
            Fragment fragment2 = this.f1984c;
            if (!fragment2.mBeingSaved) {
                this.f1983b.l(fragment2.mWho, null);
            }
        }
        if (!(z10 || this.f1983b.f1997d.v(this.f1984c))) {
            String str = this.f1984c.mTargetWho;
            if (str != null && (fragmentC = this.f1983b.c(str)) != null && fragmentC.mRetainInstance) {
                this.f1984c.mTarget = fragmentC;
            }
            this.f1984c.mState = 0;
            return;
        }
        s<?> sVar = this.f1984c.mHost;
        if (sVar instanceof o0) {
            zIsChangingConfigurations = this.f1983b.f1997d.f2126e;
        } else {
            Context context = sVar.f2109d;
            if (context instanceof Activity) {
                zIsChangingConfigurations = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if ((z10 && !this.f1984c.mBeingSaved) || zIsChangingConfigurations) {
            this.f1983b.f1997d.s(this.f1984c);
        }
        this.f1984c.performDestroy();
        this.f1982a.d(this.f1984c, false);
        for (b0 b0Var : (ArrayList) this.f1983b.e()) {
            if (b0Var != null) {
                Fragment fragment3 = b0Var.f1984c;
                if (this.f1984c.mWho.equals(fragment3.mTargetWho)) {
                    fragment3.mTarget = this.f1984c;
                    fragment3.mTargetWho = null;
                }
            }
        }
        Fragment fragment4 = this.f1984c;
        String str2 = fragment4.mTargetWho;
        if (str2 != null) {
            fragment4.mTarget = this.f1983b.c(str2);
        }
        this.f1983b.j(this);
    }

    public void h() {
        View view;
        if (FragmentManager.K(3)) {
            StringBuilder sbA = defpackage.a.a("movefrom CREATE_VIEW: ");
            sbA.append(this.f1984c);
            Log.d("FragmentManager", sbA.toString());
        }
        Fragment fragment = this.f1984c;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        this.f1984c.performDestroyView();
        this.f1982a.n(this.f1984c, false);
        Fragment fragment2 = this.f1984c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.i(null);
        this.f1984c.mInLayout = false;
    }

    public void i() {
        if (FragmentManager.K(3)) {
            StringBuilder sbA = defpackage.a.a("movefrom ATTACHED: ");
            sbA.append(this.f1984c);
            Log.d("FragmentManager", sbA.toString());
        }
        this.f1984c.performDetach();
        boolean z10 = false;
        this.f1982a.e(this.f1984c, false);
        Fragment fragment = this.f1984c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z10 = true;
        }
        if (z10 || this.f1983b.f1997d.v(this.f1984c)) {
            if (FragmentManager.K(3)) {
                StringBuilder sbA2 = defpackage.a.a("initState called for fragment: ");
                sbA2.append(this.f1984c);
                Log.d("FragmentManager", sbA2.toString());
            }
            this.f1984c.initState();
        }
    }

    public void j() {
        Fragment fragment = this.f1984c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.K(3)) {
                StringBuilder sbA = defpackage.a.a("moveto CREATE_VIEW: ");
                sbA.append(this.f1984c);
                Log.d("FragmentManager", sbA.toString());
            }
            Fragment fragment2 = this.f1984c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(fragment2.mSavedFragmentState), null, this.f1984c.mSavedFragmentState);
            View view = this.f1984c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f1984c;
                fragment3.mView.setTag(R.id.fragment_container_view_tag, fragment3);
                Fragment fragment4 = this.f1984c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f1984c.performViewCreated();
                u uVar = this.f1982a;
                Fragment fragment5 = this.f1984c;
                uVar.m(fragment5, fragment5.mView, fragment5.mSavedFragmentState, false);
                this.f1984c.mState = 2;
            }
        }
    }

    public void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f1985d) {
            if (FragmentManager.K(2)) {
                StringBuilder sbA = defpackage.a.a("Ignoring re-entrant call to moveToExpectedState() for ");
                sbA.append(this.f1984c);
                Log.v("FragmentManager", sbA.toString());
                return;
            }
            return;
        }
        try {
            this.f1985d = true;
            boolean z10 = false;
            while (true) {
                int iD = d();
                Fragment fragment = this.f1984c;
                int i10 = fragment.mState;
                if (iD == i10) {
                    if (!z10 && i10 == -1 && fragment.mRemoving && !fragment.isInBackStack() && !this.f1984c.mBeingSaved) {
                        if (FragmentManager.K(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f1984c);
                        }
                        this.f1983b.f1997d.s(this.f1984c);
                        this.f1983b.j(this);
                        if (FragmentManager.K(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + this.f1984c);
                        }
                        this.f1984c.initState();
                    }
                    Fragment fragment2 = this.f1984c;
                    if (fragment2.mHiddenChanged) {
                        if (fragment2.mView != null && (viewGroup = fragment2.mContainer) != null) {
                            l0 l0VarF = l0.f(viewGroup, fragment2.getParentFragmentManager());
                            if (this.f1984c.mHidden) {
                                Objects.requireNonNull(l0VarF);
                                if (FragmentManager.K(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + this.f1984c);
                                }
                                l0VarF.a(l0.e.c.GONE, l0.e.b.NONE, this);
                            } else {
                                Objects.requireNonNull(l0VarF);
                                if (FragmentManager.K(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + this.f1984c);
                                }
                                l0VarF.a(l0.e.c.VISIBLE, l0.e.b.NONE, this);
                            }
                        }
                        Fragment fragment3 = this.f1984c;
                        FragmentManager fragmentManager = fragment3.mFragmentManager;
                        if (fragmentManager != null) {
                            Objects.requireNonNull(fragmentManager);
                            if (fragment3.mAdded && fragmentManager.L(fragment3)) {
                                fragmentManager.E = true;
                            }
                        }
                        Fragment fragment4 = this.f1984c;
                        fragment4.mHiddenChanged = false;
                        fragment4.onHiddenChanged(fragment4.mHidden);
                        this.f1984c.mChildFragmentManager.o();
                    }
                    return;
                }
                if (iD <= i10) {
                    switch (i10 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (fragment.mBeingSaved) {
                                if (this.f1983b.f1996c.get(fragment.mWho) == null) {
                                    p();
                                }
                            }
                            g();
                            break;
                        case 1:
                            h();
                            this.f1984c.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (FragmentManager.K(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f1984c);
                            }
                            Fragment fragment5 = this.f1984c;
                            if (fragment5.mBeingSaved) {
                                p();
                            } else if (fragment5.mView != null && fragment5.mSavedViewState == null) {
                                q();
                            }
                            Fragment fragment6 = this.f1984c;
                            if (fragment6.mView != null && (viewGroup2 = fragment6.mContainer) != null) {
                                l0 l0VarF2 = l0.f(viewGroup2, fragment6.getParentFragmentManager());
                                Objects.requireNonNull(l0VarF2);
                                if (FragmentManager.K(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + this.f1984c);
                                }
                                l0VarF2.a(l0.e.c.REMOVED, l0.e.b.REMOVING, this);
                            }
                            this.f1984c.mState = 3;
                            break;
                        case 4:
                            s();
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            l();
                            break;
                    }
                } else {
                    switch (i10 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                l0 l0VarF3 = l0.f(viewGroup3, fragment.getParentFragmentManager());
                                l0.e.c cVarFrom = l0.e.c.from(this.f1984c.mView.getVisibility());
                                Objects.requireNonNull(l0VarF3);
                                if (FragmentManager.K(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + this.f1984c);
                                }
                                l0VarF3.a(cVarFrom, l0.e.b.ADDING, this);
                            }
                            this.f1984c.mState = 4;
                            break;
                        case 5:
                            r();
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            n();
                            break;
                    }
                }
                z10 = true;
            }
        } finally {
            this.f1985d = false;
        }
    }

    public void l() {
        if (FragmentManager.K(3)) {
            StringBuilder sbA = defpackage.a.a("movefrom RESUMED: ");
            sbA.append(this.f1984c);
            Log.d("FragmentManager", sbA.toString());
        }
        this.f1984c.performPause();
        this.f1982a.f(this.f1984c, false);
    }

    public void m(ClassLoader classLoader) {
        Bundle bundle = this.f1984c.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.f1984c;
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.f1984c;
        fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("android:view_registry_state");
        Fragment fragment3 = this.f1984c;
        fragment3.mTargetWho = fragment3.mSavedFragmentState.getString("android:target_state");
        Fragment fragment4 = this.f1984c;
        if (fragment4.mTargetWho != null) {
            fragment4.mTargetRequestCode = fragment4.mSavedFragmentState.getInt("android:target_req_state", 0);
        }
        Fragment fragment5 = this.f1984c;
        Boolean bool = fragment5.mSavedUserVisibleHint;
        if (bool != null) {
            fragment5.mUserVisibleHint = bool.booleanValue();
            this.f1984c.mSavedUserVisibleHint = null;
        } else {
            fragment5.mUserVisibleHint = fragment5.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment6 = this.f1984c;
        if (fragment6.mUserVisibleHint) {
            return;
        }
        fragment6.mDeferStart = true;
    }

    public void n() {
        if (FragmentManager.K(3)) {
            StringBuilder sbA = defpackage.a.a("moveto RESUMED: ");
            sbA.append(this.f1984c);
            Log.d("FragmentManager", sbA.toString());
        }
        View focusedView = this.f1984c.getFocusedView();
        if (focusedView != null) {
            boolean z10 = true;
            if (focusedView != this.f1984c.mView) {
                ViewParent parent = focusedView.getParent();
                while (true) {
                    if (parent == null) {
                        z10 = false;
                        break;
                    } else if (parent == this.f1984c.mView) {
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
            }
            if (z10) {
                boolean zRequestFocus = focusedView.requestFocus();
                if (FragmentManager.K(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("requestFocus: Restoring focused view ");
                    sb2.append(focusedView);
                    sb2.append(" ");
                    sb2.append(zRequestFocus ? "succeeded" : "failed");
                    sb2.append(" on Fragment ");
                    sb2.append(this.f1984c);
                    sb2.append(" resulting in focused view ");
                    sb2.append(this.f1984c.mView.findFocus());
                    Log.v("FragmentManager", sb2.toString());
                }
            }
        }
        this.f1984c.setFocusedView(null);
        this.f1984c.performResume();
        this.f1982a.i(this.f1984c, false);
        Fragment fragment = this.f1984c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    public final Bundle o() {
        Bundle bundle = new Bundle();
        this.f1984c.performSaveInstanceState(bundle);
        this.f1982a.j(this.f1984c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f1984c.mView != null) {
            q();
        }
        if (this.f1984c.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f1984c.mSavedViewState);
        }
        if (this.f1984c.mSavedViewRegistryState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f1984c.mSavedViewRegistryState);
        }
        if (!this.f1984c.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f1984c.mUserVisibleHint);
        }
        return bundle;
    }

    public void p() {
        FragmentState fragmentState = new FragmentState(this.f1984c);
        Fragment fragment = this.f1984c;
        if (fragment.mState <= -1 || fragmentState.f1965o != null) {
            fragmentState.f1965o = fragment.mSavedFragmentState;
        } else {
            Bundle bundleO = o();
            fragmentState.f1965o = bundleO;
            if (this.f1984c.mTargetWho != null) {
                if (bundleO == null) {
                    fragmentState.f1965o = new Bundle();
                }
                fragmentState.f1965o.putString("android:target_state", this.f1984c.mTargetWho);
                int i10 = this.f1984c.mTargetRequestCode;
                if (i10 != 0) {
                    fragmentState.f1965o.putInt("android:target_req_state", i10);
                }
            }
        }
        this.f1983b.l(this.f1984c.mWho, fragmentState);
    }

    public void q() {
        if (this.f1984c.mView == null) {
            return;
        }
        if (FragmentManager.K(2)) {
            StringBuilder sbA = defpackage.a.a("Saving view state for fragment ");
            sbA.append(this.f1984c);
            sbA.append(" with view ");
            sbA.append(this.f1984c.mView);
            Log.v("FragmentManager", sbA.toString());
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f1984c.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f1984c.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f1984c.mViewLifecycleOwner.f2067g.d(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f1984c.mSavedViewRegistryState = bundle;
    }

    public void r() {
        if (FragmentManager.K(3)) {
            StringBuilder sbA = defpackage.a.a("moveto STARTED: ");
            sbA.append(this.f1984c);
            Log.d("FragmentManager", sbA.toString());
        }
        this.f1984c.performStart();
        this.f1982a.k(this.f1984c, false);
    }

    public void s() {
        if (FragmentManager.K(3)) {
            StringBuilder sbA = defpackage.a.a("movefrom STARTED: ");
            sbA.append(this.f1984c);
            Log.d("FragmentManager", sbA.toString());
        }
        this.f1984c.performStop();
        this.f1982a.l(this.f1984c, false);
    }
}
