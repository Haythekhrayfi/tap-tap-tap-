package r1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import p0.e0;
import p0.m0;

/* JADX INFO: loaded from: classes.dex */
public class c extends l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f35052d = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Property<j, PointF> f35053e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Property<j, PointF> f35054f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Property<View, PointF> f35055g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Property<View, PointF> f35056h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Property<View, PointF> f35057i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static r1.i f35058j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f35059c;

    public class a extends Property<Drawable, PointF> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Rect f35060a;

        public a(Class cls, String str) {
            super(cls, str);
            this.f35060a = new Rect();
        }

        @Override // android.util.Property
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f35060a);
            Rect rect = this.f35060a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        public void set(Drawable drawable, PointF pointF) {
            Drawable drawable2 = drawable;
            PointF pointF2 = pointF;
            drawable2.copyBounds(this.f35060a);
            this.f35060a.offsetTo(Math.round(pointF2.x), Math.round(pointF2.y));
            drawable2.setBounds(this.f35060a);
        }
    }

    public class b extends Property<j, PointF> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(j jVar) {
            return null;
        }

        @Override // android.util.Property
        public void set(j jVar, PointF pointF) {
            j jVar2 = jVar;
            PointF pointF2 = pointF;
            Objects.requireNonNull(jVar2);
            jVar2.f35070a = Math.round(pointF2.x);
            int iRound = Math.round(pointF2.y);
            jVar2.f35071b = iRound;
            int i10 = jVar2.f35075f + 1;
            jVar2.f35075f = i10;
            if (i10 == jVar2.f35076g) {
                u.b(jVar2.f35074e, jVar2.f35070a, iRound, jVar2.f35072c, jVar2.f35073d);
                jVar2.f35075f = 0;
                jVar2.f35076g = 0;
            }
        }
    }

    /* JADX INFO: renamed from: r1.c$c, reason: collision with other inner class name */
    public class C0396c extends Property<j, PointF> {
        public C0396c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(j jVar) {
            return null;
        }

        @Override // android.util.Property
        public void set(j jVar, PointF pointF) {
            j jVar2 = jVar;
            PointF pointF2 = pointF;
            Objects.requireNonNull(jVar2);
            jVar2.f35072c = Math.round(pointF2.x);
            int iRound = Math.round(pointF2.y);
            jVar2.f35073d = iRound;
            int i10 = jVar2.f35076g + 1;
            jVar2.f35076g = i10;
            if (jVar2.f35075f == i10) {
                u.b(jVar2.f35074e, jVar2.f35070a, jVar2.f35071b, jVar2.f35072c, iRound);
                jVar2.f35075f = 0;
                jVar2.f35076g = 0;
            }
        }
    }

    public class d extends Property<View, PointF> {
        public d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            u.b(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
        }
    }

    public class e extends Property<View, PointF> {
        public e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            u.b(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
        }
    }

    public class f extends Property<View, PointF> {
        public f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            int iRound = Math.round(pointF2.x);
            int iRound2 = Math.round(pointF2.y);
            u.b(view2, iRound, iRound2, view2.getWidth() + iRound, view2.getHeight() + iRound2);
        }
    }

    public class g extends AnimatorListenerAdapter {
        private j mViewBounds;

        public g(c cVar, j jVar) {
            this.mViewBounds = jVar;
        }
    }

    public class h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f35061a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f35062b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Rect f35063c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f35064d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f35065e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f35066f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f35067g;

        public h(c cVar, View view, Rect rect, int i10, int i11, int i12, int i13) {
            this.f35062b = view;
            this.f35063c = rect;
            this.f35064d = i10;
            this.f35065e = i11;
            this.f35066f = i12;
            this.f35067g = i13;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f35061a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f35061a) {
                return;
            }
            View view = this.f35062b;
            Rect rect = this.f35063c;
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            e0.f.c(view, rect);
            u.b(this.f35062b, this.f35064d, this.f35065e, this.f35066f, this.f35067g);
        }
    }

    public class i extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f35068a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f35069b;

        public i(c cVar, ViewGroup viewGroup) {
            this.f35069b = viewGroup;
        }

        @Override // r1.m, r1.l.g
        public void onTransitionCancel(l lVar) {
            t.a(this.f35069b, false);
            this.f35068a = true;
        }

        @Override // r1.m, r1.l.g
        public void onTransitionEnd(l lVar) {
            if (!this.f35068a) {
                t.a(this.f35069b, false);
            }
            lVar.removeListener(this);
        }

        @Override // r1.m, r1.l.g
        public void onTransitionPause(l lVar) {
            t.a(this.f35069b, false);
        }

        @Override // r1.m, r1.l.g
        public void onTransitionResume(l lVar) {
            t.a(this.f35069b, true);
        }
    }

    public static class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f35070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f35071b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f35072c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f35073d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public View f35074e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f35075f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f35076g;

        public j(View view) {
            this.f35074e = view;
        }
    }

    static {
        new a(PointF.class, "boundsOrigin");
        f35053e = new b(PointF.class, "topLeft");
        f35054f = new C0396c(PointF.class, "bottomRight");
        f35055g = new d(PointF.class, "bottomRight");
        f35056h = new e(PointF.class, "topLeft");
        f35057i = new f(PointF.class, "position");
        f35058j = new r1.i();
    }

    public c() {
        this.f35059c = false;
    }

    @SuppressLint({"RestrictedApi"})
    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35059c = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f35101b);
        boolean z10 = g0.j.i((XmlResourceParser) attributeSet, "resizeClip") ? typedArrayObtainStyledAttributes.getBoolean(0, false) : false;
        typedArrayObtainStyledAttributes.recycle();
        this.f35059c = z10;
    }

    @Override // r1.l
    public void captureEndValues(r rVar) {
        captureValues(rVar);
    }

    @Override // r1.l
    public void captureStartValues(r rVar) {
        captureValues(rVar);
    }

    public final void captureValues(r rVar) {
        View view = rVar.f35133b;
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        if (!e0.g.c(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        rVar.f35132a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        rVar.f35132a.put("android:changeBounds:parent", rVar.f35133b.getParent());
        if (this.f35059c) {
            rVar.f35132a.put("android:changeBounds:clip", e0.f.a(view));
        }
    }

    @Override // r1.l
    public Animator createAnimator(ViewGroup viewGroup, r rVar, r rVar2) {
        int i10;
        View view;
        ObjectAnimator objectAnimatorA;
        int i11;
        Rect rect;
        int i12;
        boolean z10;
        ObjectAnimator objectAnimator;
        Animator animator;
        Path path;
        Property<View, PointF> property;
        Animator animatorA;
        if (rVar == null || rVar2 == null) {
            return null;
        }
        Map<String, Object> map = rVar.f35132a;
        Map<String, Object> map2 = rVar2.f35132a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = rVar2.f35133b;
        Rect rect2 = (Rect) rVar.f35132a.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) rVar2.f35132a.get("android:changeBounds:bounds");
        int i13 = rect2.left;
        int i14 = rect3.left;
        int i15 = rect2.top;
        int i16 = rect3.top;
        int i17 = rect2.right;
        int i18 = rect3.right;
        int i19 = rect2.bottom;
        int i20 = rect3.bottom;
        int i21 = i17 - i13;
        int i22 = i19 - i15;
        int i23 = i18 - i14;
        int i24 = i20 - i16;
        Rect rect4 = (Rect) rVar.f35132a.get("android:changeBounds:clip");
        Rect rect5 = (Rect) rVar2.f35132a.get("android:changeBounds:clip");
        if ((i21 == 0 || i22 == 0) && (i23 == 0 || i24 == 0)) {
            i10 = 0;
        } else {
            i10 = (i13 == i14 && i15 == i16) ? 0 : 1;
            if (i17 != i18 || i19 != i20) {
                i10++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i10++;
        }
        int i25 = i10;
        if (i25 <= 0) {
            return null;
        }
        if (this.f35059c) {
            u.b(view, i13, i15, Math.max(i21, i23) + i13, Math.max(i22, i24) + i15);
            if (i13 == i14 && i15 == i16) {
                objectAnimatorA = null;
            } else {
                view = view2;
                objectAnimatorA = r1.f.a(view, f35057i, getPathMotion().getPath(i13, i15, i14, i16));
            }
            if (rect4 == null) {
                i11 = 0;
                rect = new Rect(0, 0, i21, i22);
            } else {
                i11 = 0;
                rect = rect4;
            }
            Rect rect6 = rect5 == null ? new Rect(i11, i11, i23, i24) : rect5;
            if (rect.equals(rect6)) {
                i12 = 2;
                z10 = true;
                objectAnimator = null;
            } else {
                WeakHashMap<View, m0> weakHashMap = e0.f34354a;
                e0.f.c(view, rect);
                r1.i iVar = f35058j;
                Object[] objArr = new Object[2];
                objArr[i11] = rect;
                objArr[1] = rect6;
                ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", iVar, objArr);
                z10 = true;
                i12 = 2;
                objectAnimatorOfObject.addListener(new h(this, view, rect5, i14, i16, i18, i20));
                objectAnimator = objectAnimatorOfObject;
            }
            boolean z11 = q.f35129a;
            if (objectAnimatorA == null) {
                animator = objectAnimator;
            } else if (objectAnimator == null) {
                animator = objectAnimatorA;
            } else {
                AnimatorSet animatorSet = new AnimatorSet();
                Animator[] animatorArr = new Animator[i12];
                animatorArr[i11] = objectAnimatorA;
                animatorArr[z10 ? 1 : 0] = objectAnimator;
                animatorSet.playTogether(animatorArr);
                animator = animatorSet;
            }
        } else {
            u.b(view, i13, i15, i17, i19);
            if (i25 == 2) {
                if (i21 == i23 && i22 == i24) {
                    path = getPathMotion().getPath(i13, i15, i14, i16);
                    property = f35057i;
                } else {
                    j jVar = new j(view);
                    ObjectAnimator objectAnimatorA2 = r1.f.a(jVar, f35053e, getPathMotion().getPath(i13, i15, i14, i16));
                    ObjectAnimator objectAnimatorA3 = r1.f.a(jVar, f35054f, getPathMotion().getPath(i17, i19, i18, i20));
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(objectAnimatorA2, objectAnimatorA3);
                    animatorSet2.addListener(new g(this, jVar));
                    animatorA = animatorSet2;
                }
                z10 = true;
                animator = animatorA;
            } else if (i13 == i14 && i15 == i16) {
                path = getPathMotion().getPath(i17, i19, i18, i20);
                property = f35055g;
            } else {
                path = getPathMotion().getPath(i13, i15, i14, i16);
                property = f35056h;
            }
            animatorA = r1.f.a(view, property, path);
            z10 = true;
            animator = animatorA;
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            t.a(viewGroup4, z10);
            addListener(new i(this, viewGroup4));
        }
        return animator;
    }

    @Override // r1.l
    public String[] getTransitionProperties() {
        return f35052d;
    }
}
