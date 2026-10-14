package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ch.qos.logback.core.joran.action.Action;

/* JADX INFO: loaded from: classes.dex */
public class t implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FragmentManager f2112c;

    public class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b0 f2113c;

        public a(b0 b0Var) {
            this.f2113c = b0Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            b0 b0Var = this.f2113c;
            Fragment fragment = b0Var.f1984c;
            b0Var.k();
            l0.f((ViewGroup) fragment.mView.getParent(), t.this.f2112c).e();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public t(FragmentManager fragmentManager) {
        this.f2112c = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        b0 b0VarF;
        StringBuilder sb2;
        String str2;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f2112c);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, Action.CLASS_ATTRIBUTE);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a1.a.f8a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        String string = typedArrayObtainStyledAttributes.getString(2);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue != null) {
            ClassLoader classLoader = context.getClassLoader();
            q.h<ClassLoader, q.h<String, Class<?>>> hVar = r.f2107a;
            try {
                zIsAssignableFrom = Fragment.class.isAssignableFrom(r.b(classLoader, attributeValue));
            } catch (ClassNotFoundException unused) {
                zIsAssignableFrom = false;
            }
            if (zIsAssignableFrom) {
                int id2 = view != null ? view.getId() : 0;
                if (id2 == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                Fragment fragmentE = resourceId != -1 ? this.f2112c.E(resourceId) : null;
                if (fragmentE == null && string != null) {
                    fragmentE = this.f2112c.F(string);
                }
                if (fragmentE == null && id2 != -1) {
                    fragmentE = this.f2112c.E(id2);
                }
                if (fragmentE == null) {
                    fragmentE = this.f2112c.H().a(context.getClassLoader(), attributeValue);
                    fragmentE.mFromLayout = true;
                    fragmentE.mFragmentId = resourceId != 0 ? resourceId : id2;
                    fragmentE.mContainerId = id2;
                    fragmentE.mTag = string;
                    fragmentE.mInLayout = true;
                    FragmentManager fragmentManager = this.f2112c;
                    fragmentE.mFragmentManager = fragmentManager;
                    s<?> sVar = fragmentManager.f1919u;
                    fragmentE.mHost = sVar;
                    fragmentE.onInflate(sVar.f2109d, attributeSet, fragmentE.mSavedFragmentState);
                    b0VarF = this.f2112c.a(fragmentE);
                    if (FragmentManager.K(2)) {
                        sb2 = new StringBuilder();
                        sb2.append("Fragment ");
                        sb2.append(fragmentE);
                        str2 = " has been inflated via the <fragment> tag: id=0x";
                        sb2.append(str2);
                        sb2.append(Integer.toHexString(resourceId));
                        Log.v("FragmentManager", sb2.toString());
                    }
                } else {
                    if (fragmentE.mInLayout) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
                    }
                    fragmentE.mInLayout = true;
                    FragmentManager fragmentManager2 = this.f2112c;
                    fragmentE.mFragmentManager = fragmentManager2;
                    s<?> sVar2 = fragmentManager2.f1919u;
                    fragmentE.mHost = sVar2;
                    fragmentE.onInflate(sVar2.f2109d, attributeSet, fragmentE.mSavedFragmentState);
                    b0VarF = this.f2112c.f(fragmentE);
                    if (FragmentManager.K(2)) {
                        sb2 = new StringBuilder();
                        sb2.append("Retained Fragment ");
                        sb2.append(fragmentE);
                        str2 = " has been re-attached via the <fragment> tag: id=0x";
                        sb2.append(str2);
                        sb2.append(Integer.toHexString(resourceId));
                        Log.v("FragmentManager", sb2.toString());
                    }
                }
                ViewGroup viewGroup = (ViewGroup) view;
                b1.b bVar = b1.b.f3231a;
                fd.j0.i(fragmentE, "fragment");
                b1.c cVar = new b1.c(fragmentE, viewGroup);
                b1.b bVar2 = b1.b.f3231a;
                b1.b.c(cVar);
                b1.b.c cVarA = b1.b.a(fragmentE);
                if (cVarA.f3234a.contains(b1.b.a.DETECT_FRAGMENT_TAG_USAGE) && b1.b.f(cVarA, fragmentE.getClass(), b1.c.class)) {
                    b1.b.b(cVarA, cVar);
                }
                fragmentE.mContainer = viewGroup;
                b0VarF.k();
                b0VarF.j();
                View view2 = fragmentE.mView;
                if (view2 == null) {
                    throw new IllegalStateException(androidx.activity.j.a("Fragment ", attributeValue, " did not create a view."));
                }
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (fragmentE.mView.getTag() == null) {
                    fragmentE.mView.setTag(string);
                }
                fragmentE.mView.addOnAttachStateChangeListener(new a(b0VarF));
                return fragmentE.mView;
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
