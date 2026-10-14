package androidx.appcompat.app;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.view.menu.c.a;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.a0;
import androidx.appcompat.widget.f1;
import androidx.appcompat.widget.g1;
import androidx.appcompat.widget.l0;
import androidx.appcompat.widget.y0;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;
import p0.e0;
import p0.m0;
import p0.o0;
import p0.s0;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatDelegateImpl extends androidx.appcompat.app.i implements androidx.appcompat.view.menu.e.a, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final q.h<String, Integer> f591j0 = new q.h<>();

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final int[] f592k0 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final boolean f593l0 = !"robolectric".equals(Build.FINGERPRINT);

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final boolean f594m0 = true;
    public boolean B;
    public ViewGroup C;
    public TextView D;
    public View E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public PanelFeatureState[] N;
    public PanelFeatureState O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public Configuration T;
    public int U;
    public int V;
    public int W;
    public boolean X;
    public j Y;
    public j Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f595a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f596b0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f598d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public Rect f599e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public Rect f600f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public q f601g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public OnBackInvokedDispatcher f602h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public OnBackInvokedCallback f603i0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f604l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Context f605m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Window f606n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public h f607o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final androidx.appcompat.app.h f608p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public androidx.appcompat.app.a f609q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public MenuInflater f610r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CharSequence f611s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a0 f612t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public d f613u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public m f614v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public i.a f615w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ActionBarContextView f616x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public PopupWindow f617y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Runnable f618z;
    public m0 A = null;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final Runnable f597c0 = new a();

    public static final class PanelFeatureState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f620b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f621c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f622d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ViewGroup f623e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public View f624f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public View f625g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public androidx.appcompat.view.menu.e f626h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public androidx.appcompat.view.menu.c f627i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Context f628j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f629k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f630l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f631m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f632n = false;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f633o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Bundle f634p;

        @SuppressLint({"BanParcelableUsage"})
        public static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new a();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f635c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f636d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public Bundle f637e;

            public class a implements Parcelable.ClassLoaderCreator<SavedState> {
                @Override // android.os.Parcelable.Creator
                public Object createFromParcel(Parcel parcel) {
                    return SavedState.a(parcel, null);
                }

                @Override // android.os.Parcelable.Creator
                public Object[] newArray(int i10) {
                    return new SavedState[i10];
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.a(parcel, classLoader);
                }
            }

            public static SavedState a(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.f635c = parcel.readInt();
                boolean z10 = parcel.readInt() == 1;
                savedState.f636d = z10;
                if (z10) {
                    savedState.f637e = parcel.readBundle(classLoader);
                }
                return savedState;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f635c);
                parcel.writeInt(this.f636d ? 1 : 0);
                if (this.f636d) {
                    parcel.writeBundle(this.f637e);
                }
            }
        }

        public PanelFeatureState(int i10) {
            this.f619a = i10;
        }

        public void a(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.c cVar;
            androidx.appcompat.view.menu.e eVar2 = this.f626h;
            if (eVar == eVar2) {
                return;
            }
            if (eVar2 != null) {
                eVar2.removeMenuPresenter(this.f627i);
            }
            this.f626h = eVar;
            if (eVar == null || (cVar = this.f627i) == null) {
                return;
            }
            eVar.addMenuPresenter(cVar);
        }
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl.f596b0 & 1) != 0) {
                appCompatDelegateImpl.K(0);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl2.f596b0 & 4096) != 0) {
                appCompatDelegateImpl2.K(108);
            }
            AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl3.f595a0 = false;
            appCompatDelegateImpl3.f596b0 = 0;
        }
    }

    public class b implements androidx.appcompat.app.b {
        public b(AppCompatDelegateImpl appCompatDelegateImpl) {
        }
    }

    public interface c {
    }

    public final class d implements androidx.appcompat.view.menu.i.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean a(androidx.appcompat.view.menu.e eVar) {
            Window.Callback callbackR = AppCompatDelegateImpl.this.R();
            if (callbackR == null) {
                return true;
            }
            callbackR.onMenuOpened(108, eVar);
            return true;
        }

        @Override // androidx.appcompat.view.menu.i.a
        public void onCloseMenu(androidx.appcompat.view.menu.e eVar, boolean z10) {
            AppCompatDelegateImpl.this.G(eVar);
        }
    }

    public class e implements i.a.InterfaceC0307a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public i.a.InterfaceC0307a f640a;

        public class a extends o0 {
            public a() {
            }

            @Override // p0.o0, p0.n0
            public void b(View view) {
                AppCompatDelegateImpl.this.f616x.setVisibility(8);
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                PopupWindow popupWindow = appCompatDelegateImpl.f617y;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (appCompatDelegateImpl.f616x.getParent() instanceof View) {
                    View view2 = (View) AppCompatDelegateImpl.this.f616x.getParent();
                    WeakHashMap<View, m0> weakHashMap = e0.f34354a;
                    e0.h.c(view2);
                }
                AppCompatDelegateImpl.this.f616x.h();
                AppCompatDelegateImpl.this.A.d(null);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.A = null;
                ViewGroup viewGroup = appCompatDelegateImpl2.C;
                WeakHashMap<View, m0> weakHashMap2 = e0.f34354a;
                e0.h.c(viewGroup);
            }
        }

        public e(i.a.InterfaceC0307a interfaceC0307a) {
            this.f640a = interfaceC0307a;
        }

        @Override // i.a.InterfaceC0307a
        public boolean a(i.a aVar, MenuItem menuItem) {
            return this.f640a.a(aVar, menuItem);
        }

        @Override // i.a.InterfaceC0307a
        public void b(i.a aVar) {
            this.f640a.b(aVar);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.f617y != null) {
                appCompatDelegateImpl.f606n.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.f618z);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl2.f616x != null) {
                appCompatDelegateImpl2.L();
                AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
                m0 m0VarB = e0.b(appCompatDelegateImpl3.f616x);
                m0VarB.a(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                appCompatDelegateImpl3.A = m0VarB;
                m0 m0Var = AppCompatDelegateImpl.this.A;
                a aVar2 = new a();
                View view = m0Var.f34395a.get();
                if (view != null) {
                    m0Var.e(view, aVar2);
                }
            }
            AppCompatDelegateImpl appCompatDelegateImpl4 = AppCompatDelegateImpl.this;
            androidx.appcompat.app.h hVar = appCompatDelegateImpl4.f608p;
            if (hVar != null) {
                hVar.onSupportActionModeFinished(appCompatDelegateImpl4.f615w);
            }
            AppCompatDelegateImpl appCompatDelegateImpl5 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl5.f615w = null;
            ViewGroup viewGroup = appCompatDelegateImpl5.C;
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            e0.h.c(viewGroup);
            AppCompatDelegateImpl.this.b0();
        }

        @Override // i.a.InterfaceC0307a
        public boolean c(i.a aVar, Menu menu) {
            ViewGroup viewGroup = AppCompatDelegateImpl.this.C;
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            e0.h.c(viewGroup);
            return this.f640a.c(aVar, menu);
        }

        @Override // i.a.InterfaceC0307a
        public boolean d(i.a aVar, Menu menu) {
            return this.f640a.d(aVar, menu);
        }
    }

    public static class f {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        public static l0.f b(Configuration configuration) {
            return l0.f.b(configuration.getLocales().toLanguageTags());
        }

        public static void c(l0.f fVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(fVar.f()));
        }

        public static void d(Configuration configuration, l0.f fVar) {
            configuration.setLocales(LocaleList.forLanguageTags(fVar.f()));
        }
    }

    public static class g {
        public static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        public static OnBackInvokedCallback b(Object obj, AppCompatDelegateImpl appCompatDelegateImpl) {
            Objects.requireNonNull(appCompatDelegateImpl);
            androidx.activity.g gVar = new androidx.activity.g(appCompatDelegateImpl);
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, gVar);
            return gVar;
        }

        public static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    public class h extends i.i {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c f643d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f644e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f645f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f646g;

        public h(Window.Callback callback) {
            super(callback);
        }

        public void a(Window.Callback callback) {
            try {
                this.f644e = true;
                callback.onContentChanged();
            } finally {
                this.f644e = false;
            }
        }

        public final ActionMode b(ActionMode.Callback callback) {
            i.e.a aVar = new i.e.a(AppCompatDelegateImpl.this.f605m, callback);
            i.a aVarB = AppCompatDelegateImpl.this.B(aVar);
            if (aVarB != null) {
                return aVar.e(aVarB);
            }
            return null;
        }

        @Override // i.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (this.f645f) {
                return this.f31183c.dispatchKeyEvent(keyEvent);
            }
            return AppCompatDelegateImpl.this.J(keyEvent) || this.f31183c.dispatchKeyEvent(keyEvent);
        }

        @Override // i.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            boolean z10;
            if (!this.f31183c.dispatchKeyShortcutEvent(keyEvent)) {
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                int keyCode = keyEvent.getKeyCode();
                appCompatDelegateImpl.S();
                androidx.appcompat.app.a aVar = appCompatDelegateImpl.f609q;
                if (aVar == null || !aVar.j(keyCode, keyEvent)) {
                    PanelFeatureState panelFeatureState = appCompatDelegateImpl.O;
                    if (panelFeatureState == null || !appCompatDelegateImpl.X(panelFeatureState, keyEvent.getKeyCode(), keyEvent, 1)) {
                        if (appCompatDelegateImpl.O == null) {
                            PanelFeatureState panelFeatureStateQ = appCompatDelegateImpl.Q(0);
                            appCompatDelegateImpl.Y(panelFeatureStateQ, keyEvent);
                            boolean zX = appCompatDelegateImpl.X(panelFeatureStateQ, keyEvent.getKeyCode(), keyEvent, 1);
                            panelFeatureStateQ.f629k = false;
                            if (zX) {
                            }
                        }
                        z10 = false;
                    } else {
                        PanelFeatureState panelFeatureState2 = appCompatDelegateImpl.O;
                        if (panelFeatureState2 != null) {
                            panelFeatureState2.f630l = true;
                        }
                    }
                    z10 = true;
                } else {
                    z10 = true;
                }
                if (!z10) {
                    return false;
                }
            }
            return true;
        }

        @Override // i.i, android.view.Window.Callback
        public void onContentChanged() {
            if (this.f644e) {
                this.f31183c.onContentChanged();
            }
        }

        @Override // i.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 != 0 || (menu instanceof androidx.appcompat.view.menu.e)) {
                return this.f31183c.onCreatePanelMenu(i10, menu);
            }
            return false;
        }

        @Override // i.i, android.view.Window.Callback
        public View onCreatePanelView(int i10) {
            c cVar = this.f643d;
            if (cVar != null) {
                v.e eVar = (v.e) cVar;
                Objects.requireNonNull(eVar);
                View view = i10 == 0 ? new View(v.this.f707a.getContext()) : null;
                if (view != null) {
                    return view;
                }
            }
            return this.f31183c.onCreatePanelView(i10);
        }

        @Override // i.i, android.view.Window.Callback
        public boolean onMenuOpened(int i10, Menu menu) {
            this.f31183c.onMenuOpened(i10, menu);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            Objects.requireNonNull(appCompatDelegateImpl);
            if (i10 == 108) {
                appCompatDelegateImpl.S();
                androidx.appcompat.app.a aVar = appCompatDelegateImpl.f609q;
                if (aVar != null) {
                    aVar.c(true);
                }
            }
            return true;
        }

        @Override // i.i, android.view.Window.Callback
        public void onPanelClosed(int i10, Menu menu) {
            if (this.f646g) {
                this.f31183c.onPanelClosed(i10, menu);
                return;
            }
            this.f31183c.onPanelClosed(i10, menu);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            Objects.requireNonNull(appCompatDelegateImpl);
            if (i10 == 108) {
                appCompatDelegateImpl.S();
                androidx.appcompat.app.a aVar = appCompatDelegateImpl.f609q;
                if (aVar != null) {
                    aVar.c(false);
                    return;
                }
                return;
            }
            if (i10 == 0) {
                PanelFeatureState panelFeatureStateQ = appCompatDelegateImpl.Q(i10);
                if (panelFeatureStateQ.f631m) {
                    appCompatDelegateImpl.H(panelFeatureStateQ, false);
                }
            }
        }

        @Override // i.i, android.view.Window.Callback
        public boolean onPreparePanel(int i10, View view, Menu menu) {
            androidx.appcompat.view.menu.e eVar = menu instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menu : null;
            if (i10 == 0 && eVar == null) {
                return false;
            }
            if (eVar != null) {
                eVar.setOverrideVisibleItems(true);
            }
            c cVar = this.f643d;
            if (cVar != null) {
                v.e eVar2 = (v.e) cVar;
                Objects.requireNonNull(eVar2);
                if (i10 == 0) {
                    v vVar = v.this;
                    if (!vVar.f710d) {
                        vVar.f707a.c();
                        v.this.f710d = true;
                    }
                }
            }
            boolean zOnPreparePanel = this.f31183c.onPreparePanel(i10, view, menu);
            if (eVar != null) {
                eVar.setOverrideVisibleItems(false);
            }
            return zOnPreparePanel;
        }

        @Override // i.i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
            androidx.appcompat.view.menu.e eVar = AppCompatDelegateImpl.this.Q(0).f626h;
            if (eVar != null) {
                i.i.b.a(this.f31183c, list, eVar, i10);
            } else {
                i.i.b.a(this.f31183c, list, menu, i10);
            }
        }

        @Override // i.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // i.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            Objects.requireNonNull(AppCompatDelegateImpl.this);
            return i10 != 0 ? i.i.a.b(this.f31183c, callback, i10) : b(callback);
        }
    }

    public class i extends j {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PowerManager f648c;

        public i(Context context) {
            super();
            this.f648c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.j
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.j
        public int c() {
            return this.f648c.isPowerSaveMode() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.j
        public void d() {
            AppCompatDelegateImpl.this.C(true, true);
        }
    }

    public abstract class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public BroadcastReceiver f650a;

        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                j.this.d();
            }
        }

        public j() {
        }

        public void a() {
            BroadcastReceiver broadcastReceiver = this.f650a;
            if (broadcastReceiver != null) {
                try {
                    AppCompatDelegateImpl.this.f605m.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f650a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public void e() {
            a();
            IntentFilter intentFilterB = b();
            if (intentFilterB == null || intentFilterB.countActions() == 0) {
                return;
            }
            if (this.f650a == null) {
                this.f650a = new a();
            }
            AppCompatDelegateImpl.this.f605m.registerReceiver(this.f650a, intentFilterB);
        }
    }

    public class k extends j {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final y f653c;

        public k(y yVar) {
            super();
            this.f653c = yVar;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.j
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.j
        public int c() {
            boolean z10;
            long j10;
            long j11;
            y yVar = this.f653c;
            y.a aVar = yVar.f728c;
            if (aVar.f730b > System.currentTimeMillis()) {
                z10 = aVar.f729a;
            } else {
                Location locationA = androidx.activity.i.g(yVar.f726a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? yVar.a("network") : null;
                Location locationA2 = androidx.activity.i.g(yVar.f726a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? yVar.a("gps") : null;
                if (locationA2 == null || locationA == null ? locationA2 != null : locationA2.getTime() > locationA.getTime()) {
                    locationA = locationA2;
                }
                if (locationA != null) {
                    y.a aVar2 = yVar.f728c;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (x.f721d == null) {
                        x.f721d = new x();
                    }
                    x xVar = x.f721d;
                    xVar.a(jCurrentTimeMillis - 86400000, locationA.getLatitude(), locationA.getLongitude());
                    xVar.a(jCurrentTimeMillis, locationA.getLatitude(), locationA.getLongitude());
                    boolean z11 = xVar.f724c == 1;
                    long j12 = xVar.f723b;
                    long j13 = xVar.f722a;
                    xVar.a(jCurrentTimeMillis + 86400000, locationA.getLatitude(), locationA.getLongitude());
                    long j14 = xVar.f723b;
                    if (j12 == -1 || j13 == -1) {
                        j10 = jCurrentTimeMillis + 43200000;
                    } else {
                        if (jCurrentTimeMillis > j13) {
                            j11 = j14 + 0;
                        } else {
                            j11 = jCurrentTimeMillis > j12 ? j13 + 0 : j12 + 0;
                        }
                        j10 = j11 + 60000;
                    }
                    aVar2.f729a = z11;
                    aVar2.f730b = j10;
                    z10 = aVar.f729a;
                } else {
                    Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                    int i10 = Calendar.getInstance().get(11);
                    z10 = i10 < 6 || i10 >= 22;
                }
            }
            return z10 ? 2 : 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.j
        public void d() {
            AppCompatDelegateImpl.this.C(true, true);
        }
    }

    public class l extends ContentFrameLayout {
        public l(Context context) {
            super(context);
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.J(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x10 = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                if (x10 < -5 || y10 < -5 || x10 > getWidth() + 5 || y10 > getHeight() + 5) {
                    AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                    appCompatDelegateImpl.H(appCompatDelegateImpl.Q(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundResource(int i10) {
            setBackgroundDrawable(e.a.b(getContext(), i10));
        }
    }

    public final class m implements androidx.appcompat.view.menu.i.a {
        public m() {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean a(androidx.appcompat.view.menu.e eVar) {
            Window.Callback callbackR;
            if (eVar != eVar.getRootMenu()) {
                return true;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (!appCompatDelegateImpl.H || (callbackR = appCompatDelegateImpl.R()) == null || AppCompatDelegateImpl.this.S) {
                return true;
            }
            callbackR.onMenuOpened(108, eVar);
            return true;
        }

        @Override // androidx.appcompat.view.menu.i.a
        public void onCloseMenu(androidx.appcompat.view.menu.e eVar, boolean z10) {
            androidx.appcompat.view.menu.e rootMenu = eVar.getRootMenu();
            boolean z11 = rootMenu != eVar;
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (z11) {
                eVar = rootMenu;
            }
            PanelFeatureState panelFeatureStateO = appCompatDelegateImpl.O(eVar);
            if (panelFeatureStateO != null) {
                if (!z11) {
                    AppCompatDelegateImpl.this.H(panelFeatureStateO, z10);
                } else {
                    AppCompatDelegateImpl.this.F(panelFeatureStateO.f619a, panelFeatureStateO, rootMenu);
                    AppCompatDelegateImpl.this.H(panelFeatureStateO, true);
                }
            }
        }
    }

    public AppCompatDelegateImpl(Context context, Window window, androidx.appcompat.app.h hVar, Object obj) {
        q.h<String, Integer> hVar2;
        Integer orDefault;
        AppCompatActivity appCompatActivity;
        this.U = -100;
        this.f605m = context;
        this.f608p = hVar;
        this.f604l = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (context instanceof AppCompatActivity) {
                        appCompatActivity = (AppCompatActivity) context;
                        break;
                    } else if (context instanceof ContextWrapper) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                appCompatActivity = null;
                break;
            }
            if (appCompatActivity != null) {
                this.U = appCompatActivity.getDelegate().f();
            }
        }
        if (this.U == -100 && (orDefault = (hVar2 = f591j0).getOrDefault(this.f604l.getClass().getName(), null)) != null) {
            this.U = orDefault.intValue();
            hVar2.remove(this.f604l.getClass().getName());
        }
        if (window != null) {
            D(window);
        }
        androidx.appcompat.widget.j.e();
    }

    @Override // androidx.appcompat.app.i
    public final void A(CharSequence charSequence) {
        this.f611s = charSequence;
        a0 a0Var = this.f612t;
        if (a0Var != null) {
            a0Var.setWindowTitle(charSequence);
            return;
        }
        androidx.appcompat.app.a aVar = this.f609q;
        if (aVar != null) {
            aVar.r(charSequence);
            return;
        }
        TextView textView = this.D;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.appcompat.app.i
    public i.a B(i.a.InterfaceC0307a interfaceC0307a) {
        i.a aVarOnWindowStartingSupportActionMode;
        Context cVar;
        androidx.appcompat.app.h hVar;
        androidx.appcompat.app.h hVar2;
        if (interfaceC0307a == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        i.a aVar = this.f615w;
        if (aVar != null) {
            aVar.a();
        }
        e eVar = new e(interfaceC0307a);
        S();
        androidx.appcompat.app.a aVar2 = this.f609q;
        if (aVar2 != null) {
            i.a aVarS = aVar2.s(eVar);
            this.f615w = aVarS;
            if (aVarS != null && (hVar2 = this.f608p) != null) {
                hVar2.onSupportActionModeStarted(aVarS);
            }
        }
        if (this.f615w == null) {
            L();
            i.a aVar3 = this.f615w;
            if (aVar3 != null) {
                aVar3.a();
            }
            androidx.appcompat.app.h hVar3 = this.f608p;
            if (hVar3 == null || this.S) {
                aVarOnWindowStartingSupportActionMode = null;
            } else {
                try {
                    aVarOnWindowStartingSupportActionMode = hVar3.onWindowStartingSupportActionMode(eVar);
                } catch (AbstractMethodError unused) {
                    aVarOnWindowStartingSupportActionMode = null;
                }
            }
            if (aVarOnWindowStartingSupportActionMode != null) {
                this.f615w = aVarOnWindowStartingSupportActionMode;
            } else {
                if (this.f616x == null) {
                    if (this.K) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = this.f605m.getTheme();
                        theme.resolveAttribute(com.inscode.autoclicker.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            Resources.Theme themeNewTheme = this.f605m.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            cVar = new i.c(this.f605m, 0);
                            cVar.getTheme().setTo(themeNewTheme);
                        } else {
                            cVar = this.f605m;
                        }
                        this.f616x = new ActionBarContextView(cVar);
                        PopupWindow popupWindow = new PopupWindow(cVar, (AttributeSet) null, com.inscode.autoclicker.R.attr.actionModePopupWindowStyle);
                        this.f617y = popupWindow;
                        androidx.core.widget.i.d(popupWindow, 2);
                        this.f617y.setContentView(this.f616x);
                        this.f617y.setWidth(-1);
                        cVar.getTheme().resolveAttribute(com.inscode.autoclicker.R.attr.actionBarSize, typedValue, true);
                        this.f616x.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, cVar.getResources().getDisplayMetrics()));
                        this.f617y.setHeight(-2);
                        this.f618z = new androidx.appcompat.app.l(this);
                    } else {
                        ViewStubCompat viewStubCompat = (ViewStubCompat) this.C.findViewById(com.inscode.autoclicker.R.id.action_mode_bar_stub);
                        if (viewStubCompat != null) {
                            S();
                            androidx.appcompat.app.a aVar4 = this.f609q;
                            Context contextE = aVar4 != null ? aVar4.e() : null;
                            if (contextE == null) {
                                contextE = this.f605m;
                            }
                            viewStubCompat.setLayoutInflater(LayoutInflater.from(contextE));
                            this.f616x = (ActionBarContextView) viewStubCompat.a();
                        }
                    }
                }
                if (this.f616x != null) {
                    L();
                    this.f616x.h();
                    i.d dVar = new i.d(this.f616x.getContext(), this.f616x, eVar, this.f617y == null);
                    if (eVar.d(dVar, dVar.f31132j)) {
                        dVar.g();
                        this.f616x.f(dVar);
                        this.f615w = dVar;
                        if (Z()) {
                            this.f616x.setAlpha(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                            m0 m0VarB = e0.b(this.f616x);
                            m0VarB.a(1.0f);
                            this.A = m0VarB;
                            androidx.appcompat.app.m mVar = new androidx.appcompat.app.m(this);
                            View view = m0VarB.f34395a.get();
                            if (view != null) {
                                m0VarB.e(view, mVar);
                            }
                        } else {
                            this.f616x.setAlpha(1.0f);
                            this.f616x.setVisibility(0);
                            if (this.f616x.getParent() instanceof View) {
                                View view2 = (View) this.f616x.getParent();
                                WeakHashMap<View, m0> weakHashMap = e0.f34354a;
                                e0.h.c(view2);
                            }
                        }
                        if (this.f617y != null) {
                            this.f606n.getDecorView().post(this.f618z);
                        }
                    } else {
                        this.f615w = null;
                    }
                }
            }
            i.a aVar5 = this.f615w;
            if (aVar5 != null && (hVar = this.f608p) != null) {
                hVar.onSupportActionModeStarted(aVar5);
            }
            b0();
            this.f615w = this.f615w;
        }
        b0();
        return this.f615w;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00fb  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean C(boolean z10, boolean z11) {
        int i10;
        boolean z12;
        Object obj;
        if (this.S) {
            return false;
        }
        int i11 = this.U;
        if (i11 == -100) {
            i11 = androidx.appcompat.app.i.f672d;
        }
        int iU = U(this.f605m, i11);
        int i12 = Build.VERSION.SDK_INT;
        Object obj2 = null;
        l0.f fVarE = i12 < 33 ? E(this.f605m) : null;
        if (!z11 && fVarE != null) {
            fVarE = f.b(this.f605m.getResources().getConfiguration());
        }
        l0.f fVar = fVarE;
        Configuration configurationI = I(this.f605m, iU, fVar, null, false);
        Context context = this.f605m;
        boolean z13 = true;
        if (this.X || !(this.f604l instanceof Activity)) {
            this.X = true;
            i10 = this.W;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i10 = 0;
            } else {
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f604l.getClass()), i12 >= 29 ? 269221888 : 786432);
                    if (activityInfo != null) {
                        this.W = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e10);
                    this.W = 0;
                }
                this.X = true;
                i10 = this.W;
            }
        }
        Configuration configuration = this.T;
        if (configuration == null) {
            configuration = this.f605m.getResources().getConfiguration();
        }
        int i13 = configuration.uiMode & 48;
        int i14 = configurationI.uiMode & 48;
        l0.f fVarB = f.b(configuration);
        l0.f fVarB2 = fVar == null ? null : f.b(configurationI);
        int i15 = i13 != i14 ? 512 : 0;
        if (fVarB2 != null && !fVarB.equals(fVarB2)) {
            i15 = i15 | 4 | 8192;
        }
        if (((~i10) & i15) != 0 && z10 && this.Q && (f593l0 || this.R)) {
            Object obj3 = this.f604l;
            if (!(obj3 instanceof Activity) || ((Activity) obj3).isChild()) {
                z12 = false;
            } else {
                Activity activity = (Activity) this.f604l;
                int i16 = androidx.core.app.a.f1645c;
                if (Build.VERSION.SDK_INT >= 28) {
                    activity.recreate();
                } else {
                    new Handler(activity.getMainLooper()).post(new androidx.activity.c(activity));
                }
                z12 = true;
            }
        } else {
            z12 = false;
        }
        if (z12 || i15 == 0) {
            z13 = z12;
        } else {
            boolean z14 = (i15 & i10) == i15;
            Resources resources = this.f605m.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i14;
            if (fVarB2 != null) {
                f.d(configuration2, fVarB2);
            }
            resources.updateConfiguration(configuration2, null);
            int i17 = Build.VERSION.SDK_INT;
            if (i17 < 26 && i17 < 28) {
                if (!u.f706h) {
                    try {
                        Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                        u.f705g = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException e11) {
                        Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e11);
                    }
                    u.f706h = true;
                }
                Field field = u.f705g;
                if (field != null) {
                    try {
                        obj = field.get(resources);
                    } catch (IllegalAccessException e12) {
                        Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e12);
                        obj = null;
                    }
                    if (obj != null) {
                        if (!u.f700b) {
                            try {
                                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                u.f699a = declaredField2;
                                declaredField2.setAccessible(true);
                            } catch (NoSuchFieldException e13) {
                                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e13);
                            }
                            u.f700b = true;
                        }
                        Field field2 = u.f699a;
                        if (field2 != null) {
                            try {
                                obj2 = field2.get(obj);
                            } catch (IllegalAccessException e14) {
                                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e14);
                            }
                        }
                        if (obj2 != null) {
                            u.a(obj2);
                        }
                    }
                }
            }
            int i18 = this.V;
            if (i18 != 0) {
                this.f605m.setTheme(i18);
                this.f605m.getTheme().applyStyle(this.V, true);
            }
            if (z14) {
                Object obj4 = this.f604l;
                if (obj4 instanceof Activity) {
                    Activity activity2 = (Activity) obj4;
                    if (!(activity2 instanceof androidx.lifecycle.p) ? !(!this.R || this.S) : ((androidx.lifecycle.p) activity2).getLifecycle().b().isAtLeast(androidx.lifecycle.i.c.CREATED)) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                }
            }
        }
        if (z13) {
            Object obj5 = this.f604l;
            if (obj5 instanceof AppCompatActivity) {
                if ((i15 & 512) != 0) {
                    ((AppCompatActivity) obj5).onNightModeChanged(iU);
                }
                if ((i15 & 4) != 0) {
                    ((AppCompatActivity) this.f604l).onLocalesChanged(fVar);
                }
            }
        }
        if (z13 && fVarB2 != null) {
            f.c(f.b(this.f605m.getResources().getConfiguration()));
        }
        if (i11 == 0) {
            P(this.f605m).e();
        } else {
            j jVar = this.Y;
            if (jVar != null) {
                jVar.a();
            }
        }
        if (i11 == 3) {
            Context context2 = this.f605m;
            if (this.Z == null) {
                this.Z = new i(context2);
            }
            this.Z.e();
        } else {
            j jVar2 = this.Z;
            if (jVar2 != null) {
                jVar2.a();
            }
        }
        return z13;
    }

    public final void D(Window window) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        if (this.f606n != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof h) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        h hVar = new h(callback);
        this.f607o = hVar;
        window.setCallback(hVar);
        OnBackInvokedDispatcher onBackInvokedDispatcherA = null;
        y0 y0VarQ = y0.q(this.f605m, null, f592k0);
        Drawable drawableH = y0VarQ.h(0);
        if (drawableH != null) {
            window.setBackgroundDrawable(drawableH);
        }
        y0VarQ.f1412b.recycle();
        this.f606n = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f602h0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f603i0) != null) {
            g.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f603i0 = null;
        }
        Object obj = this.f604l;
        if ((obj instanceof Activity) && ((Activity) obj).getWindow() != null) {
            onBackInvokedDispatcherA = g.a((Activity) this.f604l);
        }
        this.f602h0 = onBackInvokedDispatcherA;
        b0();
    }

    public l0.f E(Context context) {
        l0.f fVar;
        l0.f fVarA;
        if (Build.VERSION.SDK_INT >= 33 || (fVar = androidx.appcompat.app.i.f673e) == null) {
            return null;
        }
        l0.f fVarB = f.b(context.getApplicationContext().getResources().getConfiguration());
        if (fVar.d()) {
            fVarA = l0.f.f32092b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i10 = 0;
            while (i10 < fVarB.e() + fVar.e()) {
                Locale localeC = i10 < fVar.e() ? fVar.c(i10) : fVarB.c(i10 - fVar.e());
                if (localeC != null) {
                    linkedHashSet.add(localeC);
                }
                i10++;
            }
            fVarA = l0.f.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
        }
        return fVarA.d() ? fVarB : fVarA;
    }

    public void F(int i10, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            menu = panelFeatureState.f626h;
        }
        if (panelFeatureState.f631m && !this.S) {
            h hVar = this.f607o;
            Window.Callback callback = this.f606n.getCallback();
            Objects.requireNonNull(hVar);
            try {
                hVar.f646g = true;
                callback.onPanelClosed(i10, menu);
            } finally {
                hVar.f646g = false;
            }
        }
    }

    public void G(androidx.appcompat.view.menu.e eVar) {
        if (this.M) {
            return;
        }
        this.M = true;
        this.f612t.i();
        Window.Callback callbackR = R();
        if (callbackR != null && !this.S) {
            callbackR.onPanelClosed(108, eVar);
        }
        this.M = false;
    }

    public void H(PanelFeatureState panelFeatureState, boolean z10) {
        ViewGroup viewGroup;
        a0 a0Var;
        if (z10 && panelFeatureState.f619a == 0 && (a0Var = this.f612t) != null && a0Var.b()) {
            G(panelFeatureState.f626h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f605m.getSystemService("window");
        if (windowManager != null && panelFeatureState.f631m && (viewGroup = panelFeatureState.f623e) != null) {
            windowManager.removeView(viewGroup);
            if (z10) {
                F(panelFeatureState.f619a, panelFeatureState, null);
            }
        }
        panelFeatureState.f629k = false;
        panelFeatureState.f630l = false;
        panelFeatureState.f631m = false;
        panelFeatureState.f624f = null;
        panelFeatureState.f632n = true;
        if (this.O == panelFeatureState) {
            this.O = null;
        }
        if (panelFeatureState.f619a == 0) {
            b0();
        }
    }

    public final Configuration I(Context context, int i10, l0.f fVar, Configuration configuration, boolean z10) {
        int i11;
        if (i10 == 1) {
            i11 = 16;
        } else if (i10 != 2) {
            i11 = z10 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i11 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        if (fVar != null) {
            f.d(configuration2, fVar);
        }
        return configuration2;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x00d9  */
    public boolean J(KeyEvent keyEvent) {
        View decorView;
        boolean zF;
        boolean zY;
        Object obj = this.f604l;
        if (((obj instanceof p0.g.a) || (obj instanceof o)) && (decorView = this.f606n.getDecorView()) != null && p0.g.a(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82) {
            h hVar = this.f607o;
            Window.Callback callback = this.f606n.getCallback();
            Objects.requireNonNull(hVar);
            try {
                hVar.f645f = true;
                boolean zDispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                hVar.f645f = false;
                if (zDispatchKeyEvent) {
                    return true;
                }
            } catch (Throwable th) {
                hVar.f645f = false;
                throw th;
            }
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            if (keyCode == 4) {
                this.P = (keyEvent.getFlags() & 128) != 0;
            } else if (keyCode == 82) {
                if (keyEvent.getRepeatCount() != 0) {
                    return true;
                }
                PanelFeatureState panelFeatureStateQ = Q(0);
                if (panelFeatureStateQ.f631m) {
                    return true;
                }
                Y(panelFeatureStateQ, keyEvent);
                return true;
            }
        } else if (keyCode != 4) {
            if (keyCode == 82) {
                if (this.f615w != null) {
                    return true;
                }
                PanelFeatureState panelFeatureStateQ2 = Q(0);
                a0 a0Var = this.f612t;
                if (a0Var == null || !a0Var.d() || ViewConfiguration.get(this.f605m).hasPermanentMenuKey()) {
                    boolean z10 = panelFeatureStateQ2.f631m;
                    if (z10 || panelFeatureStateQ2.f630l) {
                        H(panelFeatureStateQ2, true);
                        zF = z10;
                    } else if (panelFeatureStateQ2.f629k) {
                        if (panelFeatureStateQ2.f633o) {
                            panelFeatureStateQ2.f629k = false;
                            zY = Y(panelFeatureStateQ2, keyEvent);
                        } else {
                            zY = true;
                        }
                        if (zY) {
                            W(panelFeatureStateQ2, keyEvent);
                            zF = true;
                        } else {
                            zF = false;
                        }
                    } else {
                        zF = false;
                    }
                } else if (this.f612t.b()) {
                    zF = this.f612t.f();
                } else if (this.S || !Y(panelFeatureStateQ2, keyEvent)) {
                    zF = false;
                } else {
                    zF = this.f612t.g();
                }
                if (!zF) {
                    return true;
                }
                AudioManager audioManager = (AudioManager) this.f605m.getApplicationContext().getSystemService("audio");
                if (audioManager != null) {
                    audioManager.playSoundEffect(0);
                    return true;
                }
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
                return true;
            }
        } else if (V()) {
            return true;
        }
        return false;
    }

    public void K(int i10) {
        PanelFeatureState panelFeatureStateQ = Q(i10);
        if (panelFeatureStateQ.f626h != null) {
            Bundle bundle = new Bundle();
            panelFeatureStateQ.f626h.saveActionViewStates(bundle);
            if (bundle.size() > 0) {
                panelFeatureStateQ.f634p = bundle;
            }
            panelFeatureStateQ.f626h.stopDispatchingItemsChanged();
            panelFeatureStateQ.f626h.clear();
        }
        panelFeatureStateQ.f633o = true;
        panelFeatureStateQ.f632n = true;
        if ((i10 == 108 || i10 == 0) && this.f612t != null) {
            PanelFeatureState panelFeatureStateQ2 = Q(0);
            panelFeatureStateQ2.f629k = false;
            Y(panelFeatureStateQ2, null);
        }
    }

    public void L() {
        m0 m0Var = this.A;
        if (m0Var != null) {
            m0Var.b();
        }
    }

    public final void M() {
        ViewGroup viewGroup;
        if (this.B) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = this.f605m.obtainStyledAttributes(d.a.f28468j);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            u(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            u(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            u(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            u(10);
        }
        this.K = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        N();
        this.f606n.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f605m);
        if (this.L) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(this.J ? com.inscode.autoclicker.R.layout.abc_screen_simple_overlay_action_mode : com.inscode.autoclicker.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.K) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.inscode.autoclicker.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.I = false;
            this.H = false;
        } else if (this.H) {
            TypedValue typedValue = new TypedValue();
            this.f605m.getTheme().resolveAttribute(com.inscode.autoclicker.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new i.c(this.f605m, typedValue.resourceId) : this.f605m).inflate(com.inscode.autoclicker.R.layout.abc_screen_toolbar, (ViewGroup) null);
            a0 a0Var = (a0) viewGroup.findViewById(com.inscode.autoclicker.R.id.decor_content_parent);
            this.f612t = a0Var;
            a0Var.setWindowCallback(R());
            if (this.I) {
                this.f612t.h(109);
            }
            if (this.F) {
                this.f612t.h(2);
            }
            if (this.G) {
                this.f612t.h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder sbA = defpackage.a.a("AppCompat does not support the current theme features: { windowActionBar: ");
            sbA.append(this.H);
            sbA.append(", windowActionBarOverlay: ");
            sbA.append(this.I);
            sbA.append(", android:windowIsFloating: ");
            sbA.append(this.K);
            sbA.append(", windowActionModeOverlay: ");
            sbA.append(this.J);
            sbA.append(", windowNoTitle: ");
            sbA.append(this.L);
            sbA.append(" }");
            throw new IllegalArgumentException(sbA.toString());
        }
        androidx.appcompat.app.j jVar = new androidx.appcompat.app.j(this);
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        e0.i.u(viewGroup, jVar);
        if (this.f612t == null) {
            this.D = (TextView) viewGroup.findViewById(com.inscode.autoclicker.R.id.title);
        }
        Method method = g1.f1225a;
        try {
            Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method2.isAccessible()) {
                method2.setAccessible(true);
            }
            method2.invoke(viewGroup, new Object[0]);
        } catch (IllegalAccessException e10) {
            e = e10;
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e11) {
            e = e11;
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.inscode.autoclicker.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f606n.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f606n.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new androidx.appcompat.app.k(this));
        this.C = viewGroup;
        Object obj = this.f604l;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f611s;
        if (!TextUtils.isEmpty(title)) {
            a0 a0Var2 = this.f612t;
            if (a0Var2 != null) {
                a0Var2.setWindowTitle(title);
            } else {
                androidx.appcompat.app.a aVar = this.f609q;
                if (aVar != null) {
                    aVar.r(title);
                } else {
                    TextView textView = this.D;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.C.findViewById(R.id.content);
        View decorView = this.f606n.getDecorView();
        contentFrameLayout2.f1049i.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        WeakHashMap<View, m0> weakHashMap2 = e0.f34354a;
        if (e0.g.c(contentFrameLayout2)) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = this.f605m.obtainStyledAttributes(d.a.f28468j);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.B = true;
        PanelFeatureState panelFeatureStateQ = Q(0);
        if (this.S || panelFeatureStateQ.f626h != null) {
            return;
        }
        T(108);
    }

    public final void N() {
        if (this.f606n == null) {
            Object obj = this.f604l;
            if (obj instanceof Activity) {
                D(((Activity) obj).getWindow());
            }
        }
        if (this.f606n == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public PanelFeatureState O(Menu menu) {
        PanelFeatureState[] panelFeatureStateArr = this.N;
        int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
        for (int i10 = 0; i10 < length; i10++) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i10];
            if (panelFeatureState != null && panelFeatureState.f626h == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    public final j P(Context context) {
        if (this.Y == null) {
            if (y.f725d == null) {
                Context applicationContext = context.getApplicationContext();
                y.f725d = new y(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.Y = new k(y.f725d);
        }
        return this.Y;
    }

    public PanelFeatureState Q(int i10) {
        PanelFeatureState[] panelFeatureStateArr = this.N;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i10) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[i10 + 1];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.N = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i10];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        PanelFeatureState panelFeatureState2 = new PanelFeatureState(i10);
        panelFeatureStateArr[i10] = panelFeatureState2;
        return panelFeatureState2;
    }

    public final Window.Callback R() {
        return this.f606n.getCallback();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    /* JADX WARN: Code duplicated, block: B:19:? A[RETURN, SYNTHETIC] */
    public final void S() {
        z zVar;
        androidx.appcompat.app.a aVar;
        M();
        if (this.H && this.f609q == null) {
            Object obj = this.f604l;
            if (!(obj instanceof Activity)) {
                if (obj instanceof Dialog) {
                    zVar = new z((Dialog) this.f604l);
                }
                aVar = this.f609q;
                if (aVar != null) {
                    aVar.n(this.f598d0);
                }
            }
            zVar = new z((Activity) this.f604l, this.I);
            this.f609q = zVar;
            aVar = this.f609q;
            if (aVar != null) {
                aVar.n(this.f598d0);
            }
        }
    }

    public final void T(int i10) {
        this.f596b0 = (1 << i10) | this.f596b0;
        if (this.f595a0) {
            return;
        }
        View decorView = this.f606n.getDecorView();
        Runnable runnable = this.f597c0;
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        e0.d.m(decorView, runnable);
        this.f595a0 = true;
    }

    public int U(Context context, int i10) {
        j jVarP;
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 != 0) {
                if (i10 != 1 && i10 != 2) {
                    if (i10 != 3) {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                    if (this.Z == null) {
                        this.Z = new i(context);
                    }
                    jVarP = this.Z;
                }
            } else {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                jVarP = P(context);
            }
            return jVarP.c();
        }
        return i10;
    }

    public boolean V() {
        boolean z10 = this.P;
        this.P = false;
        PanelFeatureState panelFeatureStateQ = Q(0);
        if (panelFeatureStateQ.f631m) {
            if (!z10) {
                H(panelFeatureStateQ, true);
            }
            return true;
        }
        i.a aVar = this.f615w;
        if (aVar != null) {
            aVar.a();
            return true;
        }
        S();
        androidx.appcompat.app.a aVar2 = this.f609q;
        return aVar2 != null && aVar2.b();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:106:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0159  */
    /* JADX WARN: Code duplicated, block: B:85:0x015e  */
    /* JADX WARN: Code duplicated, block: B:91:0x0173  */
    /* JADX WARN: Code duplicated, block: B:94:0x0177  */
    /* JADX WARN: Code duplicated, block: B:96:0x017f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0195  */
    public final void W(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        boolean z10;
        boolean z11;
        ViewGroup.LayoutParams layoutParams;
        ViewParent parent;
        int i10;
        ViewGroup.LayoutParams layoutParams2;
        if (panelFeatureState.f631m || this.S) {
            return;
        }
        if (panelFeatureState.f619a == 0) {
            if ((this.f605m.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback callbackR = R();
        if (callbackR != null && !callbackR.onMenuOpened(panelFeatureState.f619a, panelFeatureState.f626h)) {
            H(panelFeatureState, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f605m.getSystemService("window");
        if (windowManager != null && Y(panelFeatureState, keyEvent)) {
            ViewGroup viewGroup = panelFeatureState.f623e;
            if (viewGroup != null && !panelFeatureState.f632n) {
                View view = panelFeatureState.f625g;
                if (view != null && (layoutParams2 = view.getLayoutParams()) != null && layoutParams2.width == -1) {
                    i10 = -1;
                }
                panelFeatureState.f630l = false;
                WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i10, -2, 0, 0, 1002, 8519680, -3);
                layoutParams3.gravity = panelFeatureState.f621c;
                layoutParams3.windowAnimations = panelFeatureState.f622d;
                windowManager.addView(panelFeatureState.f623e, layoutParams3);
                panelFeatureState.f631m = true;
                if (panelFeatureState.f619a == 0) {
                    b0();
                }
            }
            if (viewGroup == null) {
                S();
                androidx.appcompat.app.a aVar = this.f609q;
                Context contextE = aVar != null ? aVar.e() : null;
                if (contextE == null) {
                    contextE = this.f605m;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme themeNewTheme = contextE.getResources().newTheme();
                themeNewTheme.setTo(contextE.getTheme());
                themeNewTheme.resolveAttribute(com.inscode.autoclicker.R.attr.actionBarPopupTheme, typedValue, true);
                int i11 = typedValue.resourceId;
                if (i11 != 0) {
                    themeNewTheme.applyStyle(i11, true);
                }
                themeNewTheme.resolveAttribute(com.inscode.autoclicker.R.attr.panelMenuListTheme, typedValue, true);
                int i12 = typedValue.resourceId;
                if (i12 == 0) {
                    i12 = 2131952244;
                }
                themeNewTheme.applyStyle(i12, true);
                i.c cVar = new i.c(contextE, 0);
                cVar.getTheme().setTo(themeNewTheme);
                panelFeatureState.f628j = cVar;
                TypedArray typedArrayObtainStyledAttributes = cVar.obtainStyledAttributes(d.a.f28468j);
                panelFeatureState.f620b = typedArrayObtainStyledAttributes.getResourceId(86, 0);
                panelFeatureState.f622d = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                typedArrayObtainStyledAttributes.recycle();
                panelFeatureState.f623e = new l(panelFeatureState.f628j);
                panelFeatureState.f621c = 81;
            } else if (panelFeatureState.f632n && viewGroup.getChildCount() > 0) {
                panelFeatureState.f623e.removeAllViews();
            }
            View view2 = panelFeatureState.f625g;
            if (view2 == null) {
                if (panelFeatureState.f626h != null) {
                    if (this.f614v == null) {
                        this.f614v = new m();
                    }
                    m mVar = this.f614v;
                    if (panelFeatureState.f627i == null) {
                        androidx.appcompat.view.menu.c cVar2 = new androidx.appcompat.view.menu.c(panelFeatureState.f628j, com.inscode.autoclicker.R.layout.abc_list_menu_item_layout);
                        panelFeatureState.f627i = cVar2;
                        cVar2.f844i = mVar;
                        panelFeatureState.f626h.addMenuPresenter(cVar2);
                    }
                    androidx.appcompat.view.menu.c cVar3 = panelFeatureState.f627i;
                    ViewGroup viewGroup2 = panelFeatureState.f623e;
                    if (cVar3.f841f == null) {
                        cVar3.f841f = (ExpandedMenuView) cVar3.f839d.inflate(com.inscode.autoclicker.R.layout.abc_expanded_menu_layout, viewGroup2, false);
                        if (cVar3.f845j == null) {
                            cVar3.f845j = cVar3.new a();
                        }
                        cVar3.f841f.setAdapter((ListAdapter) cVar3.f845j);
                        cVar3.f841f.setOnItemClickListener(cVar3);
                    }
                    ExpandedMenuView expandedMenuView = cVar3.f841f;
                    panelFeatureState.f624f = expandedMenuView;
                    if (expandedMenuView != null) {
                    }
                    if (z10) {
                        if (panelFeatureState.f624f == null && (panelFeatureState.f625g != null || ((androidx.appcompat.view.menu.c.a) panelFeatureState.f627i.a()).getCount() > 0)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            layoutParams = panelFeatureState.f624f.getLayoutParams();
                            if (layoutParams == null) {
                                layoutParams = new ViewGroup.LayoutParams(-2, -2);
                            }
                            panelFeatureState.f623e.setBackgroundResource(panelFeatureState.f620b);
                            parent = panelFeatureState.f624f.getParent();
                            if (parent instanceof ViewGroup) {
                                ((ViewGroup) parent).removeView(panelFeatureState.f624f);
                            }
                            panelFeatureState.f623e.addView(panelFeatureState.f624f, layoutParams);
                            if (!panelFeatureState.f624f.hasFocus()) {
                                panelFeatureState.f624f.requestFocus();
                            }
                        }
                    }
                    panelFeatureState.f632n = true;
                    return;
                }
                z10 = false;
                if (z10) {
                    if (panelFeatureState.f624f == null) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (z11) {
                        layoutParams = panelFeatureState.f624f.getLayoutParams();
                        if (layoutParams == null) {
                            layoutParams = new ViewGroup.LayoutParams(-2, -2);
                        }
                        panelFeatureState.f623e.setBackgroundResource(panelFeatureState.f620b);
                        parent = panelFeatureState.f624f.getParent();
                        if (parent instanceof ViewGroup) {
                            ((ViewGroup) parent).removeView(panelFeatureState.f624f);
                        }
                        panelFeatureState.f623e.addView(panelFeatureState.f624f, layoutParams);
                        if (!panelFeatureState.f624f.hasFocus()) {
                            panelFeatureState.f624f.requestFocus();
                        }
                    }
                }
                panelFeatureState.f632n = true;
                return;
            }
            panelFeatureState.f624f = view2;
            z10 = true;
            if (z10) {
                if (panelFeatureState.f624f == null) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11) {
                    layoutParams = panelFeatureState.f624f.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams = new ViewGroup.LayoutParams(-2, -2);
                    }
                    panelFeatureState.f623e.setBackgroundResource(panelFeatureState.f620b);
                    parent = panelFeatureState.f624f.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(panelFeatureState.f624f);
                    }
                    panelFeatureState.f623e.addView(panelFeatureState.f624f, layoutParams);
                    if (!panelFeatureState.f624f.hasFocus()) {
                        panelFeatureState.f624f.requestFocus();
                    }
                }
            }
            panelFeatureState.f632n = true;
            return;
            i10 = -2;
            panelFeatureState.f630l = false;
            WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i10, -2, 0, 0, 1002, 8519680, -3);
            layoutParams4.gravity = panelFeatureState.f621c;
            layoutParams4.windowAnimations = panelFeatureState.f622d;
            windowManager.addView(panelFeatureState.f623e, layoutParams4);
            panelFeatureState.f631m = true;
            if (panelFeatureState.f619a == 0) {
                b0();
            }
        }
    }

    public final boolean X(PanelFeatureState panelFeatureState, int i10, KeyEvent keyEvent, int i11) {
        androidx.appcompat.view.menu.e eVar;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.f629k || Y(panelFeatureState, keyEvent)) && (eVar = panelFeatureState.f626h) != null) {
            zPerformShortcut = eVar.performShortcut(i10, keyEvent, i11);
        }
        if (zPerformShortcut && (i11 & 1) == 0 && this.f612t == null) {
            H(panelFeatureState, true);
        }
        return zPerformShortcut;
    }

    public final boolean Y(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        a0 a0Var;
        a0 a0Var2;
        Resources.Theme themeNewTheme;
        a0 a0Var3;
        a0 a0Var4;
        if (this.S) {
            return false;
        }
        if (panelFeatureState.f629k) {
            return true;
        }
        PanelFeatureState panelFeatureState2 = this.O;
        if (panelFeatureState2 != null && panelFeatureState2 != panelFeatureState) {
            H(panelFeatureState2, false);
        }
        Window.Callback callbackR = R();
        if (callbackR != null) {
            panelFeatureState.f625g = callbackR.onCreatePanelView(panelFeatureState.f619a);
        }
        int i10 = panelFeatureState.f619a;
        boolean z10 = i10 == 0 || i10 == 108;
        if (z10 && (a0Var4 = this.f612t) != null) {
            a0Var4.c();
        }
        if (panelFeatureState.f625g == null && (!z10 || !(this.f609q instanceof v))) {
            androidx.appcompat.view.menu.e eVar = panelFeatureState.f626h;
            if (eVar == null || panelFeatureState.f633o) {
                if (eVar == null) {
                    Context context = this.f605m;
                    int i11 = panelFeatureState.f619a;
                    if ((i11 == 0 || i11 == 108) && this.f612t != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(com.inscode.autoclicker.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            themeNewTheme.resolveAttribute(com.inscode.autoclicker.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme.resolveAttribute(com.inscode.autoclicker.R.attr.actionBarWidgetTheme, typedValue, true);
                            themeNewTheme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (themeNewTheme == null) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                            }
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                        }
                        if (themeNewTheme != null) {
                            i.c cVar = new i.c(context, 0);
                            cVar.getTheme().setTo(themeNewTheme);
                            context = cVar;
                        }
                    }
                    androidx.appcompat.view.menu.e eVar2 = new androidx.appcompat.view.menu.e(context);
                    eVar2.setCallback(this);
                    panelFeatureState.a(eVar2);
                    if (panelFeatureState.f626h == null) {
                        return false;
                    }
                }
                if (z10 && (a0Var2 = this.f612t) != null) {
                    if (this.f613u == null) {
                        this.f613u = new d();
                    }
                    a0Var2.a(panelFeatureState.f626h, this.f613u);
                }
                panelFeatureState.f626h.stopDispatchingItemsChanged();
                if (!callbackR.onCreatePanelMenu(panelFeatureState.f619a, panelFeatureState.f626h)) {
                    panelFeatureState.a(null);
                    if (z10 && (a0Var = this.f612t) != null) {
                        a0Var.a(null, this.f613u);
                    }
                    return false;
                }
                panelFeatureState.f633o = false;
            }
            panelFeatureState.f626h.stopDispatchingItemsChanged();
            Bundle bundle = panelFeatureState.f634p;
            if (bundle != null) {
                panelFeatureState.f626h.restoreActionViewStates(bundle);
                panelFeatureState.f634p = null;
            }
            if (!callbackR.onPreparePanel(0, panelFeatureState.f625g, panelFeatureState.f626h)) {
                if (z10 && (a0Var3 = this.f612t) != null) {
                    a0Var3.a(null, this.f613u);
                }
                panelFeatureState.f626h.startDispatchingItemsChanged();
                return false;
            }
            panelFeatureState.f626h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            panelFeatureState.f626h.startDispatchingItemsChanged();
        }
        panelFeatureState.f629k = true;
        panelFeatureState.f630l = false;
        this.O = panelFeatureState;
        return true;
    }

    public final boolean Z() {
        ViewGroup viewGroup;
        if (this.B && (viewGroup = this.C) != null) {
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            if (e0.g.c(viewGroup)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.app.i
    public void a(View view, ViewGroup.LayoutParams layoutParams) {
        M();
        ((ViewGroup) this.C.findViewById(R.id.content)).addView(view, layoutParams);
        this.f607o.a(this.f606n.getCallback());
    }

    public final void a0() {
        if (this.B) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    @Override // androidx.appcompat.app.i
    public Context b(Context context) {
        Configuration configuration;
        boolean z10;
        this.Q = true;
        int i10 = this.U;
        if (i10 == -100) {
            i10 = androidx.appcompat.app.i.f672d;
        }
        int iU = U(context, i10);
        if (androidx.appcompat.app.i.k(context) && androidx.appcompat.app.i.k(context)) {
            if (!l0.a.c()) {
                synchronized (androidx.appcompat.app.i.f679k) {
                    l0.f fVar = androidx.appcompat.app.i.f673e;
                    if (fVar == null) {
                        if (androidx.appcompat.app.i.f674f == null) {
                            androidx.appcompat.app.i.f674f = l0.f.b(t.b(context));
                        }
                        if (!androidx.appcompat.app.i.f674f.d()) {
                            androidx.appcompat.app.i.f673e = androidx.appcompat.app.i.f674f;
                        }
                    } else if (!fVar.equals(androidx.appcompat.app.i.f674f)) {
                        l0.f fVar2 = androidx.appcompat.app.i.f673e;
                        androidx.appcompat.app.i.f674f = fVar2;
                        t.a(context, fVar2.f());
                    }
                }
            } else if (!androidx.appcompat.app.i.f676h) {
                androidx.appcompat.app.i.f671c.execute(new androidx.activity.c(context));
            }
        }
        l0.f fVarE = E(context);
        if (f594m0 && (context instanceof ContextThemeWrapper)) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(I(context, iU, fVarE, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof i.c) {
            try {
                ((i.c) context).a(I(context, iU, fVarE, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f593l0) {
            return context;
        }
        int i11 = Build.VERSION.SDK_INT;
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (configuration3.equals(configuration4)) {
            configuration = null;
        } else {
            configuration = new Configuration();
            configuration.fontScale = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            if (configuration3.diff(configuration4) != 0) {
                float f10 = configuration3.fontScale;
                float f11 = configuration4.fontScale;
                if (f10 != f11) {
                    configuration.fontScale = f11;
                }
                int i12 = configuration3.mcc;
                int i13 = configuration4.mcc;
                if (i12 != i13) {
                    configuration.mcc = i13;
                }
                int i14 = configuration3.mnc;
                int i15 = configuration4.mnc;
                if (i14 != i15) {
                    configuration.mnc = i15;
                }
                f.a(configuration3, configuration4, configuration);
                int i16 = configuration3.touchscreen;
                int i17 = configuration4.touchscreen;
                if (i16 != i17) {
                    configuration.touchscreen = i17;
                }
                int i18 = configuration3.keyboard;
                int i19 = configuration4.keyboard;
                if (i18 != i19) {
                    configuration.keyboard = i19;
                }
                int i20 = configuration3.keyboardHidden;
                int i21 = configuration4.keyboardHidden;
                if (i20 != i21) {
                    configuration.keyboardHidden = i21;
                }
                int i22 = configuration3.navigation;
                int i23 = configuration4.navigation;
                if (i22 != i23) {
                    configuration.navigation = i23;
                }
                int i24 = configuration3.navigationHidden;
                int i25 = configuration4.navigationHidden;
                if (i24 != i25) {
                    configuration.navigationHidden = i25;
                }
                int i26 = configuration3.orientation;
                int i27 = configuration4.orientation;
                if (i26 != i27) {
                    configuration.orientation = i27;
                }
                int i28 = configuration3.screenLayout & 15;
                int i29 = configuration4.screenLayout & 15;
                if (i28 != i29) {
                    configuration.screenLayout |= i29;
                }
                int i30 = configuration3.screenLayout & 192;
                int i31 = configuration4.screenLayout & 192;
                if (i30 != i31) {
                    configuration.screenLayout |= i31;
                }
                int i32 = configuration3.screenLayout & 48;
                int i33 = configuration4.screenLayout & 48;
                if (i32 != i33) {
                    configuration.screenLayout |= i33;
                }
                int i34 = configuration3.screenLayout & 768;
                int i35 = configuration4.screenLayout & 768;
                if (i34 != i35) {
                    configuration.screenLayout |= i35;
                }
                if (i11 >= 26) {
                    int i36 = configuration3.colorMode & 3;
                    int i37 = configuration4.colorMode & 3;
                    if (i36 != i37) {
                        configuration.colorMode |= i37;
                    }
                    int i38 = configuration3.colorMode & 12;
                    int i39 = configuration4.colorMode & 12;
                    if (i38 != i39) {
                        configuration.colorMode |= i39;
                    }
                }
                int i40 = configuration3.uiMode & 15;
                int i41 = configuration4.uiMode & 15;
                if (i40 != i41) {
                    configuration.uiMode |= i41;
                }
                int i42 = configuration3.uiMode & 48;
                int i43 = configuration4.uiMode & 48;
                if (i42 != i43) {
                    configuration.uiMode |= i43;
                }
                int i44 = configuration3.screenWidthDp;
                int i45 = configuration4.screenWidthDp;
                if (i44 != i45) {
                    configuration.screenWidthDp = i45;
                }
                int i46 = configuration3.screenHeightDp;
                int i47 = configuration4.screenHeightDp;
                if (i46 != i47) {
                    configuration.screenHeightDp = i47;
                }
                int i48 = configuration3.smallestScreenWidthDp;
                int i49 = configuration4.smallestScreenWidthDp;
                if (i48 != i49) {
                    configuration.smallestScreenWidthDp = i49;
                }
                int i50 = configuration3.densityDpi;
                int i51 = configuration4.densityDpi;
                if (i50 != i51) {
                    configuration.densityDpi = i51;
                }
            }
        }
        Configuration configurationI = I(context, iU, fVarE, configuration, true);
        i.c cVar = new i.c(context, 2131952256);
        cVar.a(configurationI);
        try {
            z10 = context.getTheme() != null;
        } catch (NullPointerException unused3) {
        }
        if (z10) {
            Resources.Theme theme = cVar.getTheme();
            if (Build.VERSION.SDK_INT >= 29) {
                g0.i.a(theme);
            } else {
                synchronized (g0.h.f29685a) {
                    if (!g0.h.f29687c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            g0.h.f29686b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e10) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e10);
                        }
                        g0.h.f29687c = true;
                    }
                    Method method = g0.h.f29686b;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e11) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e11);
                            g0.h.f29686b = null;
                        }
                    }
                }
            }
        }
        return cVar;
    }

    public void b0() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z10 = false;
            if (this.f602h0 != null && (Q(0).f631m || this.f615w != null)) {
                z10 = true;
            }
            if (z10 && this.f603i0 == null) {
                this.f603i0 = g.b(this.f602h0, this);
            } else {
                if (z10 || (onBackInvokedCallback = this.f603i0) == null) {
                    return;
                }
                g.c(this.f602h0, onBackInvokedCallback);
            }
        }
    }

    @Override // androidx.appcompat.app.i
    public <T extends View> T c(int i10) {
        M();
        return (T) this.f606n.findViewById(i10);
    }

    public final int c0(s0 s0Var, Rect rect) {
        boolean z10;
        boolean z11;
        Context context;
        int i10;
        int iF = s0Var.f();
        ActionBarContextView actionBarContextView = this.f616x;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f616x.getLayoutParams();
            boolean z12 = true;
            if (this.f616x.isShown()) {
                if (this.f599e0 == null) {
                    this.f599e0 = new Rect();
                    this.f600f0 = new Rect();
                }
                Rect rect2 = this.f599e0;
                Rect rect3 = this.f600f0;
                rect2.set(s0Var.d(), s0Var.f(), s0Var.e(), s0Var.c());
                g1.a(this.C, rect2, rect3);
                int i11 = rect2.top;
                int i12 = rect2.left;
                int i13 = rect2.right;
                ViewGroup viewGroup = this.C;
                WeakHashMap<View, m0> weakHashMap = e0.f34354a;
                s0 s0VarA = e0.j.a(viewGroup);
                int iD = s0VarA == null ? 0 : s0VarA.d();
                int iE = s0VarA == null ? 0 : s0VarA.e();
                if (marginLayoutParams.topMargin == i11 && marginLayoutParams.leftMargin == i12 && marginLayoutParams.rightMargin == i13) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i11;
                    marginLayoutParams.leftMargin = i12;
                    marginLayoutParams.rightMargin = i13;
                    z11 = true;
                }
                if (i11 <= 0 || this.E != null) {
                    View view = this.E;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i14 = marginLayoutParams2.height;
                        int i15 = marginLayoutParams.topMargin;
                        if (i14 != i15 || marginLayoutParams2.leftMargin != iD || marginLayoutParams2.rightMargin != iE) {
                            marginLayoutParams2.height = i15;
                            marginLayoutParams2.leftMargin = iD;
                            marginLayoutParams2.rightMargin = iE;
                            this.E.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f605m);
                    this.E = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iD;
                    layoutParams.rightMargin = iE;
                    this.C.addView(this.E, -1, layoutParams);
                }
                View view3 = this.E;
                z10 = view3 != null;
                if (z10 && view3.getVisibility() != 0) {
                    View view4 = this.E;
                    if ((e0.d.g(view4) & 8192) != 0) {
                        context = this.f605m;
                        i10 = com.inscode.autoclicker.R.color.abc_decor_view_status_guard_light;
                    } else {
                        context = this.f605m;
                        i10 = com.inscode.autoclicker.R.color.abc_decor_view_status_guard;
                    }
                    Object obj = e0.a.f28964a;
                    view4.setBackgroundColor(e0.a.d.a(context, i10));
                }
                if (!this.J && z10) {
                    iF = 0;
                }
                z12 = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z12 = false;
                z10 = false;
            }
            if (z12) {
                this.f616x.setLayoutParams(marginLayoutParams);
            }
        }
        View view5 = this.E;
        if (view5 != null) {
            view5.setVisibility(z10 ? 0 : 8);
        }
        return iF;
    }

    @Override // androidx.appcompat.app.i
    public Context d() {
        return this.f605m;
    }

    @Override // androidx.appcompat.app.i
    public final androidx.appcompat.app.b e() {
        return new b(this);
    }

    @Override // androidx.appcompat.app.i
    public int f() {
        return this.U;
    }

    @Override // androidx.appcompat.app.i
    public MenuInflater g() {
        if (this.f610r == null) {
            S();
            androidx.appcompat.app.a aVar = this.f609q;
            this.f610r = new i.g(aVar != null ? aVar.e() : this.f605m);
        }
        return this.f610r;
    }

    @Override // androidx.appcompat.app.i
    public androidx.appcompat.app.a h() {
        S();
        return this.f609q;
    }

    @Override // androidx.appcompat.app.i
    public void i() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f605m);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof AppCompatDelegateImpl) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // androidx.appcompat.app.i
    public void j() {
        if (this.f609q != null) {
            S();
            if (this.f609q.g()) {
                return;
            }
            T(0);
        }
    }

    @Override // androidx.appcompat.app.i
    public void l(Configuration configuration) {
        if (this.H && this.B) {
            S();
            androidx.appcompat.app.a aVar = this.f609q;
            if (aVar != null) {
                aVar.h(configuration);
            }
        }
        androidx.appcompat.widget.j jVarA = androidx.appcompat.widget.j.a();
        Context context = this.f605m;
        synchronized (jVarA) {
            l0 l0Var = jVarA.f1270a;
            synchronized (l0Var) {
                q.e<WeakReference<Drawable.ConstantState>> eVar = l0Var.f1295d.get(context);
                if (eVar != null) {
                    eVar.b();
                }
            }
        }
        this.T = new Configuration(this.f605m.getResources().getConfiguration());
        C(false, false);
    }

    @Override // androidx.appcompat.app.i
    public void m(Bundle bundle) {
        this.Q = true;
        C(false, true);
        N();
        Object obj = this.f604l;
        if (obj instanceof Activity) {
            String strC = null;
            try {
                Activity activity = (Activity) obj;
                try {
                    strC = androidx.core.app.b.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new IllegalArgumentException(e10);
                }
            } catch (IllegalArgumentException unused) {
            }
            if (strC != null) {
                androidx.appcompat.app.a aVar = this.f609q;
                if (aVar == null) {
                    this.f598d0 = true;
                } else {
                    aVar.n(true);
                }
            }
            synchronized (androidx.appcompat.app.i.f678j) {
                androidx.appcompat.app.i.t(this);
                androidx.appcompat.app.i.f677i.add(new WeakReference<>(this));
            }
        }
        this.T = new Configuration(this.f605m.getResources().getConfiguration());
        this.R = true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // androidx.appcompat.app.i
    public void n() {
        if (this.f604l instanceof Activity) {
            synchronized (androidx.appcompat.app.i.f678j) {
                androidx.appcompat.app.i.t(this);
            }
        }
        if (this.f595a0) {
            this.f606n.getDecorView().removeCallbacks(this.f597c0);
        }
        this.S = true;
        if (this.U != -100) {
            Object obj = this.f604l;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f591j0.put(this.f604l.getClass().getName(), Integer.valueOf(this.U));
            } else {
                f591j0.remove(this.f604l.getClass().getName());
            }
        } else {
            f591j0.remove(this.f604l.getClass().getName());
        }
        androidx.appcompat.app.a aVar = this.f609q;
        if (aVar != null) {
            aVar.i();
        }
        j jVar = this.Y;
        if (jVar != null) {
            jVar.a();
        }
        j jVar2 = this.Z;
        if (jVar2 != null) {
            jVar2.a();
        }
    }

    @Override // androidx.appcompat.app.i
    public void o(Bundle bundle) {
        M();
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        q qVar;
        if (this.f601g0 == null) {
            String string = this.f605m.obtainStyledAttributes(d.a.f28468j).getString(116);
            if (string == null) {
                qVar = new q();
            } else {
                try {
                    this.f601g0 = (q) this.f605m.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    qVar = new q();
                    this.f601g0 = qVar;
                }
            }
            this.f601g0 = qVar;
        }
        q qVar2 = this.f601g0;
        int i10 = f1.f1218c;
        return qVar2.createView(view, str, context, attributeSet, false, false, true, false);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean onMenuItemSelected(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        PanelFeatureState panelFeatureStateO;
        Window.Callback callbackR = R();
        if (callbackR == null || this.S || (panelFeatureStateO = O(eVar.getRootMenu())) == null) {
            return false;
        }
        return callbackR.onMenuItemSelected(panelFeatureStateO.f619a, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void onMenuModeChange(androidx.appcompat.view.menu.e eVar) {
        a0 a0Var = this.f612t;
        if (a0Var == null || !a0Var.d() || (ViewConfiguration.get(this.f605m).hasPermanentMenuKey() && !this.f612t.e())) {
            PanelFeatureState panelFeatureStateQ = Q(0);
            panelFeatureStateQ.f632n = true;
            H(panelFeatureStateQ, false);
            W(panelFeatureStateQ, null);
            return;
        }
        Window.Callback callbackR = R();
        if (this.f612t.b()) {
            this.f612t.f();
            if (this.S) {
                return;
            }
            callbackR.onPanelClosed(108, Q(0).f626h);
            return;
        }
        if (callbackR == null || this.S) {
            return;
        }
        if (this.f595a0 && (1 & this.f596b0) != 0) {
            this.f606n.getDecorView().removeCallbacks(this.f597c0);
            this.f597c0.run();
        }
        PanelFeatureState panelFeatureStateQ2 = Q(0);
        androidx.appcompat.view.menu.e eVar2 = panelFeatureStateQ2.f626h;
        if (eVar2 == null || panelFeatureStateQ2.f633o || !callbackR.onPreparePanel(0, panelFeatureStateQ2.f625g, eVar2)) {
            return;
        }
        callbackR.onMenuOpened(108, panelFeatureStateQ2.f626h);
        this.f612t.g();
    }

    @Override // androidx.appcompat.app.i
    public void p() {
        S();
        androidx.appcompat.app.a aVar = this.f609q;
        if (aVar != null) {
            aVar.p(true);
        }
    }

    @Override // androidx.appcompat.app.i
    public void q(Bundle bundle) {
    }

    @Override // androidx.appcompat.app.i
    public void r() {
        C(true, false);
    }

    @Override // androidx.appcompat.app.i
    public void s() {
        S();
        androidx.appcompat.app.a aVar = this.f609q;
        if (aVar != null) {
            aVar.p(false);
        }
    }

    @Override // androidx.appcompat.app.i
    public boolean u(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i10 = 108;
        } else if (i10 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i10 = 109;
        }
        if (this.L && i10 == 108) {
            return false;
        }
        if (this.H && i10 == 1) {
            this.H = false;
        }
        if (i10 == 1) {
            a0();
            this.L = true;
            return true;
        }
        if (i10 == 2) {
            a0();
            this.F = true;
            return true;
        }
        if (i10 == 5) {
            a0();
            this.G = true;
            return true;
        }
        if (i10 == 10) {
            a0();
            this.J = true;
            return true;
        }
        if (i10 == 108) {
            a0();
            this.H = true;
            return true;
        }
        if (i10 != 109) {
            return this.f606n.requestFeature(i10);
        }
        a0();
        this.I = true;
        return true;
    }

    @Override // androidx.appcompat.app.i
    public void v(int i10) {
        M();
        ViewGroup viewGroup = (ViewGroup) this.C.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f605m).inflate(i10, viewGroup);
        this.f607o.a(this.f606n.getCallback());
    }

    @Override // androidx.appcompat.app.i
    public void w(View view) {
        M();
        ViewGroup viewGroup = (ViewGroup) this.C.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f607o.a(this.f606n.getCallback());
    }

    @Override // androidx.appcompat.app.i
    public void x(View view, ViewGroup.LayoutParams layoutParams) {
        M();
        ViewGroup viewGroup = (ViewGroup) this.C.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f607o.a(this.f606n.getCallback());
    }

    @Override // androidx.appcompat.app.i
    public void y(Toolbar toolbar) {
        if (this.f604l instanceof Activity) {
            S();
            androidx.appcompat.app.a aVar = this.f609q;
            if (aVar instanceof z) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f610r = null;
            if (aVar != null) {
                aVar.i();
            }
            this.f609q = null;
            if (toolbar != null) {
                Object obj = this.f604l;
                v vVar = new v(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : this.f611s, this.f607o);
                this.f609q = vVar;
                this.f607o.f643d = vVar.f709c;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.f607o.f643d = null;
            }
            j();
        }
    }

    @Override // androidx.appcompat.app.i
    public void z(int i10) {
        this.V = i10;
    }
}
