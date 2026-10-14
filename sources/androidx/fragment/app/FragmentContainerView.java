package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.inscode.autoclicker.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p0.s0;

/* JADX INFO: loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<View> f1895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<View> f1896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f1897e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1898f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context) {
        super(context);
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f1895c = new ArrayList();
        this.f1896d = new ArrayList();
        this.f1898f = true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, int i10) {
        String str;
        super(context, attributeSet, i10);
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f1895c = new ArrayList();
        this.f1896d = new ArrayList();
        this.f1898f = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a1.a.f9b, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = Action.CLASS_ATTRIBUTE;
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + CoreConstants.DOUBLE_QUOTE_CHAR);
        }
    }

    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i10, int i11, vc.g gVar) {
        this(context, attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, FragmentManager fragmentManager) {
        View view;
        super(context, attributeSet);
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(attributeSet, "attrs");
        fd.j0.i(fragmentManager, "fm");
        this.f1895c = new ArrayList();
        this.f1896d = new ArrayList();
        this.f1898f = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a1.a.f9b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id2 = getId();
        Fragment fragmentE = fragmentManager.E(id2);
        if (classAttribute != null && fragmentE == null) {
            if (id2 == -1) {
                throw new IllegalStateException(androidx.activity.j.a("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? i.f.a(" with tag ", string) : ""));
            }
            Fragment fragmentA = fragmentManager.H().a(context.getClassLoader(), classAttribute);
            fd.j0.h(fragmentA, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            fragmentA.onInflate(context, attributeSet, (Bundle) null);
            a aVar = new a(fragmentManager);
            aVar.f2020p = true;
            fragmentA.mContainer = this;
            aVar.e(getId(), fragmentA, string, 1);
            if (aVar.f2011g) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            aVar.f2012h = false;
            aVar.f1967q.B(aVar, true);
        }
        for (b0 b0Var : (ArrayList) fragmentManager.f1901c.e()) {
            Fragment fragment = b0Var.f1984c;
            if (fragment.mContainerId == getId() && (view = fragment.mView) != null && view.getParent() == null) {
                fragment.mContainer = this;
                b0Var.b();
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        fd.j0.i(view, "child");
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof Fragment ? (Fragment) tag : null) != null) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        s0 s0VarK;
        fd.j0.i(windowInsets, "insets");
        s0 s0VarK2 = s0.k(windowInsets, null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f1897e;
        if (onApplyWindowInsetsListener != null) {
            fd.j0.f(onApplyWindowInsetsListener);
            fd.j0.i(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            fd.j0.i(this, "v");
            fd.j0.i(windowInsets, "insets");
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            fd.j0.h(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            s0VarK = s0.k(windowInsetsOnApplyWindowInsets, null);
        } else {
            s0VarK = p0.e0.k(this, s0VarK2);
        }
        fd.j0.h(s0VarK, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!s0VarK.h()) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                p0.e0.c(getChildAt(i10), s0VarK);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        fd.j0.i(canvas, "canvas");
        if (this.f1898f) {
            Iterator<T> it = this.f1895c.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        fd.j0.i(canvas, "canvas");
        fd.j0.i(view, "child");
        if (this.f1898f && (!this.f1895c.isEmpty()) && this.f1895c.contains(view)) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        fd.j0.i(view, "view");
        this.f1896d.remove(view);
        if (this.f1895c.remove(view)) {
            this.f1898f = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends Fragment> F getFragment() {
        Fragment fragment;
        FragmentManager supportFragmentManager;
        n nVar = null;
        View view = this;
        while (true) {
            if (view == null) {
                fragment = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            fragment = tag instanceof Fragment ? (Fragment) tag : null;
            if (fragment != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (fragment == null) {
            for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof n) {
                    nVar = (n) context;
                    break;
                }
            }
            if (nVar == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            supportFragmentManager = nVar.getSupportFragmentManager();
        } else {
            if (!fragment.isAdded()) {
                throw new IllegalStateException("The Fragment " + fragment + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            supportFragmentManager = fragment.getChildFragmentManager();
        }
        return (F) supportFragmentManager.E(getId());
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        fd.j0.i(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            }
            View childAt = getChildAt(childCount);
            fd.j0.h(childAt, "view");
            if (this.f1896d.contains(childAt)) {
                this.f1895c.add(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        fd.j0.i(view, "view");
        if (this.f1896d.contains(view)) {
            this.f1895c.add(view);
        }
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i10) {
        View childAt = getChildAt(i10);
        fd.j0.h(childAt, "view");
        if (this.f1896d.contains(childAt)) {
            this.f1895c.add(childAt);
        }
        super.removeViewAt(i10);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        fd.j0.i(view, "view");
        if (this.f1896d.contains(view)) {
            this.f1895c.add(view);
        }
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View childAt = getChildAt(i13);
            fd.j0.h(childAt, "view");
            if (this.f1896d.contains(childAt)) {
                this.f1895c.add(childAt);
            }
        }
        super.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View childAt = getChildAt(i13);
            fd.j0.h(childAt, "view");
            if (this.f1896d.contains(childAt)) {
                this.f1895c.add(childAt);
            }
        }
        super.removeViewsInLayout(i10, i11);
    }

    public final void setDrawDisappearingViewsLast(boolean z10) {
        this.f1898f = z10;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        fd.j0.i(onApplyWindowInsetsListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f1897e = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        fd.j0.i(view, "view");
        if (view.getParent() == this) {
            this.f1896d.add(view);
        }
        super.startViewTransition(view);
    }
}
