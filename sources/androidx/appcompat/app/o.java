package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.inscode.autoclicker.R;

/* JADX INFO: loaded from: classes.dex */
public class o extends androidx.activity.e implements h {
    private i mDelegate;
    private final p0.g.a mKeyDispatcher;

    public o(Context context) {
        this(context, 0);
    }

    public o(Context context, int i10) {
        super(context, getThemeResId(context, i10));
        final int i11 = 1;
        this.mKeyDispatcher = new p0.g.a(this) { // from class: androidx.appcompat.app.n

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ o f686d;

            {
                this.f686d = this;
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
            @Override // p0.g.a
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                switch (i11) {
                }
                return this.f686d.superDispatchKeyEvent(keyEvent);
            }
        };
        i delegate = getDelegate();
        delegate.z(getThemeResId(context, i10));
        delegate.m(null);
    }

    public o(Context context, boolean z10, DialogInterface.OnCancelListener onCancelListener) {
        super(context);
        final int i10 = 0;
        this.mKeyDispatcher = new p0.g.a(this) { // from class: androidx.appcompat.app.n

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ o f686d;

            {
                this.f686d = this;
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
            @Override // p0.g.a
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                switch (i10) {
                }
                return this.f686d.superDispatchKeyEvent(keyEvent);
            }
        };
        setCancelable(z10);
        setOnCancelListener(onCancelListener);
    }

    private static int getThemeResId(Context context, int i10) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // androidx.activity.e, android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().a(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        getDelegate().n();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return p0.g.b(this.mKeyDispatcher, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i10) {
        return (T) getDelegate().c(i10);
    }

    public i getDelegate() {
        if (this.mDelegate == null) {
            t.a aVar = i.f671c;
            this.mDelegate = new AppCompatDelegateImpl(getContext(), getWindow(), this, this);
        }
        return this.mDelegate;
    }

    public a getSupportActionBar() {
        return getDelegate().h();
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        getDelegate().j();
    }

    @Override // androidx.activity.e, android.app.Dialog
    public void onCreate(Bundle bundle) {
        getDelegate().i();
        super.onCreate(bundle);
        getDelegate().m(bundle);
    }

    @Override // androidx.activity.e, android.app.Dialog
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

    @Override // androidx.appcompat.app.h
    public i.a onWindowStartingSupportActionMode(i.a.InterfaceC0307a interfaceC0307a) {
        return null;
    }

    @Override // androidx.activity.e, android.app.Dialog
    public void setContentView(int i10) {
        getDelegate().v(i10);
    }

    @Override // androidx.activity.e, android.app.Dialog
    public void setContentView(View view) {
        getDelegate().w(view);
    }

    @Override // androidx.activity.e, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().x(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i10) {
        super.setTitle(i10);
        getDelegate().A(getContext().getString(i10));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        getDelegate().A(charSequence);
    }

    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean supportRequestWindowFeature(int i10) {
        return getDelegate().u(i10);
    }
}
