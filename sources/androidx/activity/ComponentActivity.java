package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.lifecycle.f0;
import androidx.lifecycle.i0;
import androidx.lifecycle.m0;
import androidx.lifecycle.n;
import androidx.lifecycle.n0;
import androidx.lifecycle.o0;
import androidx.lifecycle.p;
import androidx.lifecycle.q;
import com.inscode.autoclicker.R;
import d0.b0;
import d0.c0;
import d0.e0;
import d0.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class ComponentActivity extends d0.l implements o0, androidx.lifecycle.h, m1.d, h, androidx.activity.result.d, e0.c, e0.d, b0, c0, p0.i {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final ActivityResultRegistry mActivityResultRegistry;
    private int mContentLayoutId;
    public final b.a mContextAwareHelper;
    private m0.b mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;
    private final q mLifecycleRegistry;
    private final p0.l mMenuHostHelper;
    private final AtomicInteger mNextLocalRequestCode;
    private final OnBackPressedDispatcher mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<o0.a<Configuration>> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<o0.a<m>> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<o0.a<Intent>> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<o0.a<e0>> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<o0.a<Integer>> mOnTrimMemoryListeners;
    public final m1.c mSavedStateRegistryController;
    private n0 mViewModelStore;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e10) {
                if (!TextUtils.equals(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e10;
                }
            }
        }
    }

    public class b extends ActivityResultRegistry {

        public class a implements Runnable {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f465c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ c.a.C0064a f466d;

            public a(int i10, c.a.C0064a c0064a) {
                this.f465c = i10;
                this.f466d = c0064a;
            }

            @Override // java.lang.Runnable
            public void run() {
                androidx.activity.result.a<?> aVar;
                b bVar = b.this;
                int i10 = this.f465c;
                Object obj = this.f466d.f3526a;
                String str = bVar.f504b.get(Integer.valueOf(i10));
                if (str == null) {
                    return;
                }
                ActivityResultRegistry.c<?> cVar = bVar.f508f.get(str);
                if (cVar == null || (aVar = cVar.f521a) == null) {
                    bVar.f510h.remove(str);
                    bVar.f509g.put(str, obj);
                } else if (bVar.f507e.remove(str)) {
                    aVar.a(obj);
                }
            }
        }

        /* JADX INFO: renamed from: androidx.activity.ComponentActivity$b$b, reason: collision with other inner class name */
        public class RunnableC0022b implements Runnable {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f468c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ IntentSender.SendIntentException f469d;

            public RunnableC0022b(int i10, IntentSender.SendIntentException sendIntentException) {
                this.f468c = i10;
                this.f469d = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.a(this.f468c, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f469d));
            }
        }

        public b() {
        }

        @Override // androidx.activity.result.ActivityResultRegistry
        public <I, O> void b(int i10, c.a<I, O> aVar, I i11, d0.d dVar) {
            ComponentActivity componentActivity = ComponentActivity.this;
            c.a.C0064a<O> c0064aB = aVar.b(componentActivity, i11);
            if (c0064aB != null) {
                new Handler(Looper.getMainLooper()).post(new a(i10, c0064aB));
                return;
            }
            Intent intentA = aVar.a(componentActivity, i11);
            Bundle bundleExtra = null;
            if (intentA.getExtras() != null && intentA.getExtras().getClassLoader() == null) {
                intentA.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (intentA.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            }
            Bundle bundle = bundleExtra;
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentA.getAction())) {
                String[] stringArrayExtra = intentA.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                androidx.core.app.a.b(componentActivity, stringArrayExtra, i10);
                return;
            }
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentA.getAction())) {
                int i12 = androidx.core.app.a.f1645c;
                androidx.core.app.a.C0028a.b(componentActivity, intentA, i10, bundle);
                return;
            }
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentA.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                IntentSender intentSender = intentSenderRequest.f525c;
                Intent intent = intentSenderRequest.f526d;
                int i13 = intentSenderRequest.f527e;
                int i14 = intentSenderRequest.f528f;
                int i15 = androidx.core.app.a.f1645c;
                androidx.core.app.a.C0028a.c(componentActivity, intentSender, i10, intent, i13, i14, 0, bundle);
            } catch (IntentSender.SendIntentException e10) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0022b(i10, e10));
            }
        }
    }

    public static class c {
        public static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f471a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public n0 f472b;
    }

    public ComponentActivity() {
        this.mContextAwareHelper = new b.a();
        this.mMenuHostHelper = new p0.l(new androidx.activity.c(this));
        this.mLifecycleRegistry = new q(this);
        m1.c cVarA = m1.c.a(this);
        this.mSavedStateRegistryController = cVarA;
        this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new a());
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new b();
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList<>();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mDispatchingOnMultiWindowModeChanged = false;
        this.mDispatchingOnPictureInPictureModeChanged = false;
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().a(new n() { // from class: androidx.activity.ComponentActivity.3
            @Override // androidx.lifecycle.n
            public void g(p pVar, androidx.lifecycle.i.b bVar) {
                if (bVar == androidx.lifecycle.i.b.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                    if (viewPeekDecorView != null) {
                        viewPeekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        getLifecycle().a(new n() { // from class: androidx.activity.ComponentActivity.4
            @Override // androidx.lifecycle.n
            public void g(p pVar, androidx.lifecycle.i.b bVar) {
                if (bVar == androidx.lifecycle.i.b.ON_DESTROY) {
                    ComponentActivity.this.mContextAwareHelper.f3224b = null;
                    if (ComponentActivity.this.isChangingConfigurations()) {
                        return;
                    }
                    ComponentActivity.this.getViewModelStore().a();
                }
            }
        });
        getLifecycle().a(new n() { // from class: androidx.activity.ComponentActivity.5
            @Override // androidx.lifecycle.n
            public void g(p pVar, androidx.lifecycle.i.b bVar) {
                ComponentActivity.this.ensureViewModelStore();
                ComponentActivity.this.getLifecycle().c(this);
            }
        });
        cVarA.b();
        f0.b(this);
        getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new androidx.activity.d(this));
        addOnContextAvailableListener(new androidx.activity.b(this));
    }

    public ComponentActivity(int i10) {
        this();
        this.mContentLayoutId = i10;
    }

    private void initViewTreeOwners() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        i.n(getWindow().getDecorView(), this);
        l.c(getWindow().getDecorView(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle lambda$new$0() {
        Bundle bundle = new Bundle();
        ActivityResultRegistry activityResultRegistry = this.mActivityResultRegistry;
        Objects.requireNonNull(activityResultRegistry);
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(activityResultRegistry.f505c.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(activityResultRegistry.f505c.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(activityResultRegistry.f507e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) activityResultRegistry.f510h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", activityResultRegistry.f503a);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$new$1(Context context) {
        Bundle bundleA = getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (bundleA != null) {
            ActivityResultRegistry activityResultRegistry = this.mActivityResultRegistry;
            Objects.requireNonNull(activityResultRegistry);
            ArrayList<Integer> integerArrayList = bundleA.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            activityResultRegistry.f507e = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            activityResultRegistry.f503a = (Random) bundleA.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
            activityResultRegistry.f510h.putAll(bundleA.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
            for (int i10 = 0; i10 < stringArrayList.size(); i10++) {
                String str = stringArrayList.get(i10);
                if (activityResultRegistry.f505c.containsKey(str)) {
                    Integer numRemove = activityResultRegistry.f505c.remove(str);
                    if (!activityResultRegistry.f510h.containsKey(str)) {
                        activityResultRegistry.f504b.remove(numRemove);
                    }
                }
                int iIntValue = integerArrayList.get(i10).intValue();
                String str2 = stringArrayList.get(i10);
                activityResultRegistry.f504b.put(Integer.valueOf(iIntValue), str2);
                activityResultRegistry.f505c.put(str2, Integer.valueOf(iIntValue));
            }
        }
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    @Override // p0.i
    public void addMenuProvider(p0.n nVar) {
        p0.l lVar = this.mMenuHostHelper;
        lVar.f34389b.add(nVar);
        lVar.f34388a.run();
    }

    public void addMenuProvider(p0.n nVar, p pVar) {
        this.mMenuHostHelper.a(nVar, pVar);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(p0.n nVar, p pVar, androidx.lifecycle.i.c cVar) {
        this.mMenuHostHelper.b(nVar, pVar, cVar);
    }

    @Override // e0.c
    public final void addOnConfigurationChangedListener(o0.a<Configuration> aVar) {
        this.mOnConfigurationChangedListeners.add(aVar);
    }

    public final void addOnContextAvailableListener(b.b bVar) {
        b.a aVar = this.mContextAwareHelper;
        if (aVar.f3224b != null) {
            bVar.a(aVar.f3224b);
        }
        aVar.f3223a.add(bVar);
    }

    @Override // d0.b0
    public final void addOnMultiWindowModeChangedListener(o0.a<m> aVar) {
        this.mOnMultiWindowModeChangedListeners.add(aVar);
    }

    public final void addOnNewIntentListener(o0.a<Intent> aVar) {
        this.mOnNewIntentListeners.add(aVar);
    }

    @Override // d0.c0
    public final void addOnPictureInPictureModeChangedListener(o0.a<e0> aVar) {
        this.mOnPictureInPictureModeChangedListeners.add(aVar);
    }

    @Override // e0.d
    public final void addOnTrimMemoryListener(o0.a<Integer> aVar) {
        this.mOnTrimMemoryListeners.add(aVar);
    }

    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            d dVar = (d) getLastNonConfigurationInstance();
            if (dVar != null) {
                this.mViewModelStore = dVar.f472b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new n0();
            }
        }
    }

    @Override // androidx.activity.result.d
    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // androidx.lifecycle.h
    public e1.a getDefaultViewModelCreationExtras() {
        e1.d dVar = new e1.d();
        if (getApplication() != null) {
            dVar.b(m0.a.f2235g, getApplication());
        }
        dVar.b(f0.f2194a, this);
        dVar.b(f0.f2195b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            dVar.b(f0.f2196c, getIntent().getExtras());
        }
        return dVar;
    }

    @Override // androidx.lifecycle.h
    public m0.b getDefaultViewModelProviderFactory() {
        if (this.mDefaultFactory == null) {
            this.mDefaultFactory = new i0(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.mDefaultFactory;
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        d dVar = (d) getLastNonConfigurationInstance();
        if (dVar != null) {
            return dVar.f471a;
        }
        return null;
    }

    @Override // d0.l, androidx.lifecycle.p
    public androidx.lifecycle.i getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // androidx.activity.h
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    @Override // m1.d
    public final m1.b getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f33179b;
    }

    @Override // androidx.lifecycle.o0
    public n0 getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        return this.mViewModelStore;
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (this.mActivityResultRegistry.a(i10, i11, intent)) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.mOnBackPressedDispatcher.b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<o0.a<Configuration>> it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // d0.l, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.c(bundle);
        b.a aVar = this.mContextAwareHelper;
        aVar.f3224b = this;
        Iterator<b.b> it = aVar.f3223a.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
        super.onCreate(bundle);
        androidx.lifecycle.c0.c(this);
        if (l0.a.c()) {
            OnBackPressedDispatcher onBackPressedDispatcher = this.mOnBackPressedDispatcher;
            onBackPressedDispatcher.f482e = c.a(this);
            onBackPressedDispatcher.c();
        }
        int i10 = this.mContentLayoutId;
        if (i10 != 0) {
            setContentView(i10);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i10, menu);
        this.mMenuHostHelper.c(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 0) {
            return this.mMenuHostHelper.d(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10) {
        if (this.mDispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<o0.a<m>> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new m(z10));
        }
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10, Configuration configuration) {
        this.mDispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z10, configuration);
            this.mDispatchingOnMultiWindowModeChanged = false;
            Iterator<o0.a<m>> it = this.mOnMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new m(z10, configuration));
            }
        } catch (Throwable th) {
            this.mDispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<o0.a<Intent>> it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        Iterator<p0.n> it = this.mMenuHostHelper.f34389b.iterator();
        while (it.hasNext()) {
            it.next().b(menu);
        }
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10) {
        if (this.mDispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<o0.a<e0>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new e0(z10));
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        this.mDispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z10, configuration);
            this.mDispatchingOnPictureInPictureModeChanged = false;
            Iterator<o0.a<e0>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new e0(z10, configuration));
            }
        } catch (Throwable th) {
            this.mDispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i10, View view, Menu menu) {
        if (i10 != 0) {
            return true;
        }
        super.onPreparePanel(i10, view, menu);
        this.mMenuHostHelper.e(menu);
        return true;
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (this.mActivityResultRegistry.a(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        d dVar;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        n0 n0Var = this.mViewModelStore;
        if (n0Var == null && (dVar = (d) getLastNonConfigurationInstance()) != null) {
            n0Var = dVar.f472b;
        }
        if (n0Var == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        d dVar2 = new d();
        dVar2.f471a = objOnRetainCustomNonConfigurationInstance;
        dVar2.f472b = n0Var;
        return dVar2;
    }

    @Override // d0.l, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        androidx.lifecycle.i lifecycle = getLifecycle();
        if (lifecycle instanceof q) {
            ((q) lifecycle).j(androidx.lifecycle.i.c.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.d(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator<o0.a<Integer>> it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i10));
        }
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.f3224b;
    }

    public final <I, O> androidx.activity.result.b<I> registerForActivityResult(c.a<I, O> aVar, ActivityResultRegistry activityResultRegistry, androidx.activity.result.a<O> aVar2) {
        StringBuilder sbA = defpackage.a.a("activity_rq#");
        sbA.append(this.mNextLocalRequestCode.getAndIncrement());
        return activityResultRegistry.c(sbA.toString(), this, aVar, aVar2);
    }

    public final <I, O> androidx.activity.result.b<I> registerForActivityResult(c.a<I, O> aVar, androidx.activity.result.a<O> aVar2) {
        return registerForActivityResult(aVar, this.mActivityResultRegistry, aVar2);
    }

    @Override // p0.i
    public void removeMenuProvider(p0.n nVar) {
        this.mMenuHostHelper.f(nVar);
    }

    @Override // e0.c
    public final void removeOnConfigurationChangedListener(o0.a<Configuration> aVar) {
        this.mOnConfigurationChangedListeners.remove(aVar);
    }

    public final void removeOnContextAvailableListener(b.b bVar) {
        this.mContextAwareHelper.f3223a.remove(bVar);
    }

    @Override // d0.b0
    public final void removeOnMultiWindowModeChangedListener(o0.a<m> aVar) {
        this.mOnMultiWindowModeChangedListeners.remove(aVar);
    }

    public final void removeOnNewIntentListener(o0.a<Intent> aVar) {
        this.mOnNewIntentListeners.remove(aVar);
    }

    @Override // d0.c0
    public final void removeOnPictureInPictureModeChangedListener(o0.a<e0> aVar) {
        this.mOnPictureInPictureModeChangedListeners.remove(aVar);
    }

    @Override // e0.d
    public final void removeOnTrimMemoryListener(o0.a<Integer> aVar) {
        this.mOnTrimMemoryListeners.remove(aVar);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (q1.a.a()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i10) {
        initViewTreeOwners();
        super.setContentView(i10);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        initViewTreeOwners();
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i10) {
        super.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        super.startActivityForResult(intent, i10, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }
}
