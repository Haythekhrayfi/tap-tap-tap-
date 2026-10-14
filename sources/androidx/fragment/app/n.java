package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.lifecycle.o0;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public class n extends ComponentActivity implements androidx.core.app.a.d {
    public static final String LIFECYCLE_TAG = "android:support:lifecycle";
    public boolean mCreated;
    public final androidx.lifecycle.q mFragmentLifecycleRegistry;
    public final q mFragments;
    public boolean mResumed;
    public boolean mStopped;

    public class a extends s<n> implements e0.c, e0.d, d0.b0, d0.c0, o0, androidx.activity.h, androidx.activity.result.d, m1.d, z, p0.i {
        public a() {
            super(n.this, n.this, new Handler(), 0);
        }

        @Override // androidx.fragment.app.z
        public void a(FragmentManager fragmentManager, Fragment fragment) {
            n.this.onAttachFragment(fragment);
        }

        @Override // p0.i
        public void addMenuProvider(p0.n nVar) {
            n.this.addMenuProvider(nVar);
        }

        @Override // e0.c
        public void addOnConfigurationChangedListener(o0.a<Configuration> aVar) {
            n.this.addOnConfigurationChangedListener(aVar);
        }

        @Override // d0.b0
        public void addOnMultiWindowModeChangedListener(o0.a<d0.m> aVar) {
            n.this.addOnMultiWindowModeChangedListener(aVar);
        }

        @Override // d0.c0
        public void addOnPictureInPictureModeChangedListener(o0.a<d0.e0> aVar) {
            n.this.addOnPictureInPictureModeChangedListener(aVar);
        }

        @Override // e0.d
        public void addOnTrimMemoryListener(o0.a<Integer> aVar) {
            n.this.addOnTrimMemoryListener(aVar);
        }

        @Override // androidx.fragment.app.s, androidx.fragment.app.p
        public View b(int i10) {
            return n.this.findViewById(i10);
        }

        @Override // androidx.fragment.app.s, androidx.fragment.app.p
        public boolean c() {
            Window window = n.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.fragment.app.s
        public void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            n.this.dump(str, null, printWriter, strArr);
        }

        @Override // androidx.fragment.app.s
        public n e() {
            return n.this;
        }

        @Override // androidx.fragment.app.s
        public LayoutInflater f() {
            return n.this.getLayoutInflater().cloneInContext(n.this);
        }

        @Override // androidx.fragment.app.s
        public boolean g(String str) {
            return androidx.core.app.a.c(n.this, str);
        }

        @Override // androidx.activity.result.d
        public ActivityResultRegistry getActivityResultRegistry() {
            return n.this.getActivityResultRegistry();
        }

        @Override // androidx.lifecycle.p
        public androidx.lifecycle.i getLifecycle() {
            return n.this.mFragmentLifecycleRegistry;
        }

        @Override // androidx.activity.h
        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return n.this.getOnBackPressedDispatcher();
        }

        @Override // m1.d
        public m1.b getSavedStateRegistry() {
            return n.this.getSavedStateRegistry();
        }

        @Override // androidx.lifecycle.o0
        public androidx.lifecycle.n0 getViewModelStore() {
            return n.this.getViewModelStore();
        }

        @Override // androidx.fragment.app.s
        public void h() {
            n.this.invalidateOptionsMenu();
        }

        @Override // p0.i
        public void removeMenuProvider(p0.n nVar) {
            n.this.removeMenuProvider(nVar);
        }

        @Override // e0.c
        public void removeOnConfigurationChangedListener(o0.a<Configuration> aVar) {
            n.this.removeOnConfigurationChangedListener(aVar);
        }

        @Override // d0.b0
        public void removeOnMultiWindowModeChangedListener(o0.a<d0.m> aVar) {
            n.this.removeOnMultiWindowModeChangedListener(aVar);
        }

        @Override // d0.c0
        public void removeOnPictureInPictureModeChangedListener(o0.a<d0.e0> aVar) {
            n.this.removeOnPictureInPictureModeChangedListener(aVar);
        }

        @Override // e0.d
        public void removeOnTrimMemoryListener(o0.a<Integer> aVar) {
            n.this.removeOnTrimMemoryListener(aVar);
        }
    }

    public n() {
        this.mFragments = new q(new a());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.q(this);
        this.mStopped = true;
        init();
    }

    private void init() {
        getSavedStateRegistry().c(LIFECYCLE_TAG, new androidx.activity.d(this));
        addOnConfigurationChangedListener(new m(this, 0));
        addOnNewIntentListener(new m(this, 1));
        addOnContextAvailableListener(new androidx.activity.b(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle lambda$init$0() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.f(androidx.lifecycle.i.b.ON_STOP);
        return new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$1(Configuration configuration) {
        this.mFragments.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$2(Intent intent) {
        this.mFragments.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$init$3(Context context) {
        s<?> sVar = this.mFragments.f2106a;
        sVar.f2111f.b(sVar, sVar, null);
    }

    private static boolean markState(FragmentManager fragmentManager, androidx.lifecycle.i.c cVar) {
        boolean zMarkState = false;
        for (Fragment fragment : fragmentManager.f1901c.h()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zMarkState |= markState(fragment.getChildFragmentManager(), cVar);
                }
                j0 j0Var = fragment.mViewLifecycleOwner;
                if (j0Var != null) {
                    j0Var.b();
                    if (j0Var.f2066f.f2244c.isAtLeast(androidx.lifecycle.i.c.STARTED)) {
                        androidx.lifecycle.q qVar = fragment.mViewLifecycleOwner.f2066f;
                        qVar.e("setCurrentState");
                        qVar.h(cVar);
                        zMarkState = true;
                    }
                }
                if (fragment.mLifecycleRegistry.f2244c.isAtLeast(androidx.lifecycle.i.c.STARTED)) {
                    androidx.lifecycle.q qVar2 = fragment.mLifecycleRegistry;
                    qVar2.e("setCurrentState");
                    qVar2.h(cVar);
                    zMarkState = true;
                }
            }
        }
        return zMarkState;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.f2106a.f2111f.f1904f.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                f1.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
            }
            this.mFragments.f2106a.f2111f.w(str, fileDescriptor, printWriter, strArr);
        }
    }

    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.f2106a.f2111f;
    }

    @Deprecated
    public f1.a getSupportLoaderManager() {
        return f1.a.b(this);
    }

    public void markFragmentsCreated() {
        while (markState(getSupportFragmentManager(), androidx.lifecycle.i.c.CREATED)) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i10, i11, intent);
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // androidx.activity.ComponentActivity, d0.l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.f(androidx.lifecycle.i.b.ON_CREATE);
        this.mFragments.f2106a.f2111f.j();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f2106a.f2111f.l();
        this.mFragmentLifecycleRegistry.f(androidx.lifecycle.i.b.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 6) {
            return this.mFragments.f2106a.f2111f.i(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.f2106a.f2111f.u(5);
        this.mFragmentLifecycleRegistry.f(androidx.lifecycle.i.b.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.mFragments.a();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.f2106a.f2111f.A(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.f(androidx.lifecycle.i.b.ON_RESUME);
        FragmentManager fragmentManager = this.mFragments.f2106a.f2111f;
        fragmentManager.F = false;
        fragmentManager.G = false;
        fragmentManager.M.f2127f = false;
        fragmentManager.u(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            FragmentManager fragmentManager = this.mFragments.f2106a.f2111f;
            fragmentManager.F = false;
            fragmentManager.G = false;
            fragmentManager.M.f2127f = false;
            fragmentManager.u(4);
        }
        this.mFragments.f2106a.f2111f.A(true);
        this.mFragmentLifecycleRegistry.f(androidx.lifecycle.i.b.ON_START);
        FragmentManager fragmentManager2 = this.mFragments.f2106a.f2111f;
        fragmentManager2.F = false;
        fragmentManager2.G = false;
        fragmentManager2.M.f2127f = false;
        fragmentManager2.u(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        FragmentManager fragmentManager = this.mFragments.f2106a.f2111f;
        fragmentManager.G = true;
        fragmentManager.M.f2127f = true;
        fragmentManager.u(4);
        this.mFragmentLifecycleRegistry.f(androidx.lifecycle.i.b.ON_STOP);
    }

    public void setEnterSharedElementCallback(d0.g0 g0Var) {
        int i10 = androidx.core.app.a.f1645c;
        androidx.core.app.a.b.c(this, g0Var != null ? new androidx.core.app.a.e(g0Var) : null);
    }

    public void setExitSharedElementCallback(d0.g0 g0Var) {
        int i10 = androidx.core.app.a.f1645c;
        androidx.core.app.a.b.d(this, g0Var != null ? new androidx.core.app.a.e(g0Var) : null);
    }

    public void startActivityFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i10) {
        startActivityFromFragment(fragment, intent, i10, (Bundle) null);
    }

    public void startActivityFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i10, Bundle bundle) {
        if (i10 != -1) {
            fragment.startActivityForResult(intent, i10, bundle);
        } else {
            int i11 = androidx.core.app.a.f1645c;
            androidx.core.app.a.C0028a.b(this, intent, -1, bundle);
        }
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        if (i10 != -1) {
            fragment.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
        } else {
            int i14 = androidx.core.app.a.f1645c;
            androidx.core.app.a.C0028a.c(this, intentSender, i10, intent, i11, i12, i13, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        int i10 = androidx.core.app.a.f1645c;
        androidx.core.app.a.b.a(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        int i10 = androidx.core.app.a.f1645c;
        androidx.core.app.a.b.b(this);
    }

    public void supportStartPostponedEnterTransition() {
        int i10 = androidx.core.app.a.f1645c;
        androidx.core.app.a.b.e(this);
    }

    @Override // androidx.core.app.a.d
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i10) {
    }

    public n(int i10) {
        super(i10);
        this.mFragments = new q(new a());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.q(this);
        this.mStopped = true;
        init();
    }
}
