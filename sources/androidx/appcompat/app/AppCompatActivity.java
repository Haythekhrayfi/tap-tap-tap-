package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.f1;
import com.inscode.autoclicker.R;
import d0.h0;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatActivity extends androidx.fragment.app.n implements h, h0.a {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private i mDelegate;
    private Resources mResources;

    public class a implements m1.b.c {
        public a() {
        }

        @Override // m1.b.c
        public Bundle a() {
            Bundle bundle = new Bundle();
            AppCompatActivity.this.getDelegate().q(bundle);
            return bundle;
        }
    }

    public class b implements b.b {
        public b() {
        }

        @Override // b.b
        public void a(Context context) {
            i delegate = AppCompatActivity.this.getDelegate();
            delegate.i();
            delegate.m(AppCompatActivity.this.getSavedStateRegistry().a(AppCompatActivity.DELEGATE_TAG));
        }
    }

    public AppCompatActivity() {
        initDelegate();
    }

    public AppCompatActivity(int i10) {
        super(i10);
        initDelegate();
    }

    private void initDelegate() {
        getSavedStateRegistry().c(DELEGATE_TAG, new a());
        addOnContextAvailableListener(new b());
    }

    private void initViewTreeOwners() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        androidx.activity.i.n(getWindow().getDecorView(), this);
        androidx.activity.l.c(getWindow().getDecorView(), this);
    }

    private boolean performMenuItemShortcut(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().a(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().b(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.a()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // d0.l, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.k(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i10) {
        return (T) getDelegate().c(i10);
    }

    public i getDelegate() {
        if (this.mDelegate == null) {
            t.a aVar = i.f671c;
            this.mDelegate = new AppCompatDelegateImpl(this, null, this, this);
        }
        return this.mDelegate;
    }

    public androidx.appcompat.app.b getDrawerToggleDelegate() {
        return getDelegate().e();
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return getDelegate().g();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = this.mResources;
        if (resources == null) {
            int i10 = f1.f1218c;
        }
        return resources == null ? super.getResources() : resources;
    }

    public androidx.appcompat.app.a getSupportActionBar() {
        return getDelegate().h();
    }

    @Override // d0.h0.a
    public Intent getSupportParentActivityIntent() {
        return androidx.core.app.b.a(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().j();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getDelegate().l(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(h0 h0Var) {
        Objects.requireNonNull(h0Var);
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = androidx.core.app.b.a(this);
        }
        if (supportParentActivityIntent == null) {
            return;
        }
        ComponentName component = supportParentActivityIntent.getComponent();
        if (component == null) {
            component = supportParentActivityIntent.resolveActivity(h0Var.f28536d.getPackageManager());
        }
        int size = h0Var.f28535c.size();
        try {
            Context context = h0Var.f28536d;
            while (true) {
                Intent intentB = androidx.core.app.b.b(context, component);
                if (intentB == null) {
                    h0Var.f28535c.add(supportParentActivityIntent);
                    return;
                } else {
                    h0Var.f28535c.add(size, intentB);
                    context = h0Var.f28536d;
                    component = intentB.getComponent();
                }
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    @Override // androidx.fragment.app.n, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().n();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (performMenuItemShortcut(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    public void onLocalesChanged(l0.f fVar) {
    }

    @Override // androidx.fragment.app.n, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.d() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    public void onNightModeChanged(int i10) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().o(bundle);
    }

    @Override // androidx.fragment.app.n, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        getDelegate().p();
    }

    public void onPrepareSupportNavigateUpTaskStack(h0 h0Var) {
    }

    @Override // androidx.fragment.app.n, android.app.Activity
    public void onStart() {
        super.onStart();
        getDelegate().r();
    }

    @Override // androidx.fragment.app.n, android.app.Activity
    public void onStop() {
        super.onStop();
        getDelegate().s();
    }

    @Override // androidx.appcompat.app.h
    public void onSupportActionModeFinished(i.a aVar) {
    }

    @Override // androidx.appcompat.app.h
    public void onSupportActionModeStarted(i.a aVar) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (!supportShouldUpRecreateTask(supportParentActivityIntent)) {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        h0 h0Var = new h0(this);
        onCreateSupportNavigateUpTaskStack(h0Var);
        onPrepareSupportNavigateUpTaskStack(h0Var);
        if (h0Var.f28535c.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) h0Var.f28535c.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        Context context = h0Var.f28536d;
        Object obj = e0.a.f28964a;
        e0.a.C0247a.a(context, intentArr, null);
        try {
            int i10 = androidx.core.app.a.f1645c;
            androidx.core.app.a.C0028a.a(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        getDelegate().A(charSequence);
    }

    @Override // androidx.appcompat.app.h
    public i.a onWindowStartingSupportActionMode(i.a.InterfaceC0307a interfaceC0307a) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.l()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i10) {
        initViewTreeOwners();
        getDelegate().v(i10);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        initViewTreeOwners();
        getDelegate().w(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().x(view, layoutParams);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getDelegate().y(toolbar);
    }

    @Deprecated
    public void setSupportProgress(int i10) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z10) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z10) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z10) {
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        super.setTheme(i10);
        getDelegate().z(i10);
    }

    public i.a startSupportActionMode(i.a.InterfaceC0307a interfaceC0307a) {
        return getDelegate().B(interfaceC0307a);
    }

    @Override // androidx.fragment.app.n
    public void supportInvalidateOptionsMenu() {
        getDelegate().j();
    }

    public void supportNavigateUpTo(Intent intent) {
        androidx.core.app.b.a.b(this, intent);
    }

    public boolean supportRequestWindowFeature(int i10) {
        return getDelegate().u(i10);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return androidx.core.app.b.a.c(this, intent);
    }
}
