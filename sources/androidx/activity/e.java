package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.p;
import androidx.lifecycle.q;
import ch.qos.logback.core.CoreConstants;
import com.inscode.autoclicker.R;
import fd.j0;

/* JADX INFO: loaded from: classes.dex */
public class e extends Dialog implements p, h {
    private q _lifecycleRegistry;
    private final OnBackPressedDispatcher onBackPressedDispatcher;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        this(context, 0, 2, null);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, int i10) {
        super(context, i10);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.onBackPressedDispatcher = new OnBackPressedDispatcher(new c(this));
    }

    public /* synthetic */ e(Context context, int i10, int i11, vc.g gVar) {
        this(context, (i11 & 2) != 0 ? 0 : i10);
    }

    private final q getLifecycleRegistry() {
        q qVar = this._lifecycleRegistry;
        if (qVar != null) {
            return qVar;
        }
        q qVar2 = new q(this);
        this._lifecycleRegistry = qVar2;
        return qVar2;
    }

    private static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    private final void initViewTreeOwners() {
        Window window = getWindow();
        j0.f(window);
        window.getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        j0.f(window2);
        View decorView = window2.getDecorView();
        j0.h(decorView, "window!!.decorView");
        l.c(decorView, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onBackPressedDispatcher$lambda-1, reason: not valid java name */
    public static final void m0onBackPressedDispatcher$lambda1(e eVar) {
        j0.i(eVar, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j0.i(view, "view");
        initViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.lifecycle.p
    public final androidx.lifecycle.i getLifecycle() {
        return getLifecycleRegistry();
    }

    @Override // androidx.activity.h
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.onBackPressedDispatcher;
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.onBackPressedDispatcher.b();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackPressedDispatcher onBackPressedDispatcher = this.onBackPressedDispatcher;
            onBackPressedDispatcher.f482e = getOnBackInvokedDispatcher();
            onBackPressedDispatcher.c();
        }
        getLifecycleRegistry().f(androidx.lifecycle.i.b.ON_CREATE);
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        getLifecycleRegistry().f(androidx.lifecycle.i.b.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        getLifecycleRegistry().f(androidx.lifecycle.i.b.ON_DESTROY);
        this._lifecycleRegistry = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i10) {
        initViewTreeOwners();
        super.setContentView(i10);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        j0.i(view, "view");
        initViewTreeOwners();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j0.i(view, "view");
        initViewTreeOwners();
        super.setContentView(view, layoutParams);
    }
}
