package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.transition.Transition;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.inscode.autoclicker.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class b extends l0 {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1970a;

        static {
            int[] iArr = new int[l0.e.c.values().length];
            f1970a = iArr;
            try {
                iArr[l0.e.c.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1970a[l0.e.c.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1970a[l0.e.c.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1970a[l0.e.c.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.b$b, reason: collision with other inner class name */
    public class RunnableC0034b implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f1971c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ l0.e f1972d;

        public RunnableC0034b(List list, l0.e eVar) {
            this.f1971c = list;
            this.f1972d = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1971c.contains(this.f1972d)) {
                this.f1971c.remove(this.f1972d);
                b bVar = b.this;
                l0.e eVar = this.f1972d;
                Objects.requireNonNull(bVar);
                eVar.f2088a.applyState(eVar.f2090c.mView);
            }
        }
    }

    public static class c extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f1974c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f1975d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public o.a f1976e;

        public c(l0.e eVar, l0.d dVar, boolean z10) {
            super(eVar, dVar);
            this.f1975d = false;
            this.f1974c = z10;
        }

        /* JADX WARN: Code duplicated, block: B:77:0x00ec A[Catch: RuntimeException -> 0x00f3, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x00f3, blocks: (B:75:0x00e6, B:77:0x00ec), top: B:88:0x00e6 }] */
        /* JADX WARN: Code duplicated, block: B:88:0x00e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        public o.a c(Context context) {
            int enterAnim;
            Animator animatorLoadAnimator;
            int iA;
            int i10;
            if (this.f1975d) {
                return this.f1976e;
            }
            l0.e eVar = this.f1977a;
            Fragment fragment = eVar.f2090c;
            boolean z10 = false;
            boolean z11 = eVar.f2088a == l0.e.c.VISIBLE;
            boolean z12 = this.f1974c;
            int nextTransition = fragment.getNextTransition();
            if (z12) {
                enterAnim = z11 ? fragment.getPopEnterAnim() : fragment.getPopExitAnim();
            } else {
                enterAnim = z11 ? fragment.getEnterAnim() : fragment.getExitAnim();
            }
            fragment.setAnimations(0, 0, 0, 0);
            ViewGroup viewGroup = fragment.mContainer;
            o.a aVar = null;
            if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
                fragment.mContainer.setTag(R.id.visible_removing_fragment_view_tag, null);
            }
            ViewGroup viewGroup2 = fragment.mContainer;
            if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
                Animation animationOnCreateAnimation = fragment.onCreateAnimation(nextTransition, z11, enterAnim);
                if (animationOnCreateAnimation != null) {
                    aVar = new o.a(animationOnCreateAnimation);
                } else {
                    Animator animatorOnCreateAnimator = fragment.onCreateAnimator(nextTransition, z11, enterAnim);
                    if (animatorOnCreateAnimator != null) {
                        aVar = new o.a(animatorOnCreateAnimator);
                    } else {
                        if (enterAnim == 0 && nextTransition != 0) {
                            if (nextTransition == 4097) {
                                iA = z11 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                            } else if (nextTransition != 8194) {
                                if (nextTransition == 8197) {
                                    i10 = z11 ? android.R.attr.activityCloseEnterAnimation : android.R.attr.activityCloseExitAnimation;
                                } else if (nextTransition == 4099) {
                                    iA = z11 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit;
                                } else if (nextTransition != 4100) {
                                    iA = -1;
                                } else {
                                    i10 = z11 ? android.R.attr.activityOpenEnterAnimation : android.R.attr.activityOpenExitAnimation;
                                }
                                iA = o.a(context, i10);
                            } else {
                                iA = z11 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit;
                            }
                            enterAnim = iA;
                        }
                        if (enterAnim != 0) {
                            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(enterAnim));
                            if (zEquals) {
                                try {
                                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, enterAnim);
                                    if (animationLoadAnimation != null) {
                                        aVar = new o.a(animationLoadAnimation);
                                    } else {
                                        z10 = true;
                                        if (!z10) {
                                            try {
                                                animatorLoadAnimator = AnimatorInflater.loadAnimator(context, enterAnim);
                                                if (animatorLoadAnimator != null) {
                                                    aVar = new o.a(animatorLoadAnimator);
                                                }
                                            } catch (RuntimeException e10) {
                                                if (zEquals) {
                                                    throw e10;
                                                }
                                                Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, enterAnim);
                                                if (animationLoadAnimation2 != null) {
                                                    aVar = new o.a(animationLoadAnimation2);
                                                }
                                            }
                                        }
                                    }
                                } catch (Resources.NotFoundException e11) {
                                    throw e11;
                                } catch (RuntimeException unused) {
                                }
                            } else if (!z10) {
                                animatorLoadAnimator = AnimatorInflater.loadAnimator(context, enterAnim);
                                if (animatorLoadAnimator != null) {
                                    aVar = new o.a(animatorLoadAnimator);
                                }
                            }
                        }
                    }
                }
            }
            this.f1976e = aVar;
            this.f1975d = true;
            return aVar;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l0.e f1977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l0.d f1978b;

        public d(l0.e eVar, l0.d dVar) {
            this.f1977a = eVar;
            this.f1978b = dVar;
        }

        public void a() {
            l0.e eVar = this.f1977a;
            if (eVar.f2092e.remove(this.f1978b) && eVar.f2092e.isEmpty()) {
                eVar.b();
            }
        }

        public boolean b() {
            l0.e.c cVar;
            l0.e.c cVarFrom = l0.e.c.from(this.f1977a.f2090c.mView);
            l0.e.c cVar2 = this.f1977a.f2088a;
            return cVarFrom == cVar2 || !(cVarFrom == (cVar = l0.e.c.VISIBLE) || cVar2 == cVar);
        }
    }

    public static class e extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f1979c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f1980d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Object f1981e;

        public e(l0.e eVar, l0.d dVar, boolean z10, boolean z11) {
            boolean allowReturnTransitionOverlap;
            super(eVar, dVar);
            if (eVar.f2088a == l0.e.c.VISIBLE) {
                this.f1979c = z10 ? eVar.f2090c.getReenterTransition() : eVar.f2090c.getEnterTransition();
                allowReturnTransitionOverlap = z10 ? eVar.f2090c.getAllowReturnTransitionOverlap() : eVar.f2090c.getAllowEnterTransitionOverlap();
            } else {
                this.f1979c = z10 ? eVar.f2090c.getReturnTransition() : eVar.f2090c.getExitTransition();
                allowReturnTransitionOverlap = true;
            }
            this.f1980d = allowReturnTransitionOverlap;
            this.f1981e = z11 ? z10 ? eVar.f2090c.getSharedElementReturnTransition() : eVar.f2090c.getSharedElementEnterTransition() : null;
        }

        public final i0 c(Object obj) {
            if (obj == null) {
                return null;
            }
            i0 i0Var = f0.f2034a;
            if (i0Var != null) {
                Objects.requireNonNull((g0) i0Var);
                if (obj instanceof Transition) {
                    return i0Var;
                }
            }
            i0 i0Var2 = f0.f2035b;
            if (i0Var2 != null && i0Var2.e(obj)) {
                return i0Var2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f1977a.f2090c + " is not a valid framework Transition or AndroidX Transition");
        }
    }

    public b(ViewGroup viewGroup) {
        super(viewGroup);
    }

    /* JADX WARN: Code duplicated, block: B:256:0x0801  */
    /* JADX WARN: Code duplicated, block: B:266:0x0823  */
    /* JADX WARN: Code duplicated, block: B:270:0x083a  */
    /* JADX WARN: Code duplicated, block: B:271:0x0856  */
    /* JADX WARN: Code duplicated, block: B:276:0x0866  */
    /* JADX WARN: Code duplicated, block: B:279:0x086c  */
    /* JADX WARN: Code duplicated, block: B:282:0x08a3  */
    /* JADX WARN: Code duplicated, block: B:283:0x08bd  */
    /* JADX WARN: Code duplicated, block: B:288:0x08e3  */
    /* JADX WARN: Code duplicated, block: B:292:0x08f9  */
    /* JADX WARN: Code duplicated, block: B:293:0x0907  */
    /* JADX WARN: Code duplicated, block: B:297:0x0910  */
    /* JADX WARN: Code duplicated, block: B:302:0x093f  */
    /* JADX WARN: Code duplicated, block: B:303:0x094b  */
    /* JADX WARN: Code duplicated, block: B:305:0x0973  */
    /* JADX WARN: Code duplicated, block: B:310:0x09ad A[LOOP:7: B:308:0x09a7->B:310:0x09ad, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:313:0x09c7  */
    /* JADX WARN: Code duplicated, block: B:348:0x085e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:352:0x081d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:353:0x0833 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:357:0x092b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:359:0x08f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:360:0x090a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:406:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:270:0x083a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:305:0x0973, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:313:0x09c7, please report this as an issue */
    @Override // androidx.fragment.app.l0
    public void b(List<l0.e> list, boolean z10) {
        String str;
        ArrayList arrayList;
        HashMap map;
        l0.e eVar;
        ArrayList arrayList2;
        String str2;
        l0.e eVar2;
        ArrayList arrayList3;
        String str3;
        boolean z11;
        String str4;
        String str5;
        l0.e eVar3;
        l0.e eVar4;
        Object obj;
        ArrayList arrayList4;
        View view;
        l0.e eVar5;
        Rect rect;
        q.a aVar;
        ArrayList arrayList5;
        ArrayList arrayList6;
        HashMap map2;
        View view2;
        ArrayList<View> arrayList7;
        ArrayList<View> arrayList8;
        l0.e eVar6;
        i0 i0Var;
        d0.g0 enterTransitionCallback;
        d0.g0 exitTransitionCallback;
        ArrayList<String> arrayList9;
        Object obj2;
        int i10;
        View view3;
        View view4;
        String strB;
        ArrayList<String> arrayList10;
        boolean zContainsValue;
        ViewGroup viewGroup;
        Context context;
        ArrayList<c> arrayList11;
        Iterator it;
        boolean z12;
        String str6;
        l0.e eVar7;
        Fragment fragment;
        StringBuilder sb2;
        String str7;
        View view5;
        Animation animation;
        boolean z13;
        boolean z14;
        View view6;
        c cVar;
        String str8;
        o.a aVarC;
        Animator animator;
        l0.e eVar8;
        Fragment fragment2;
        String str9;
        boolean z15;
        ArrayList arrayList12;
        l0.e eVar9;
        boolean z16 = z10;
        l0.e eVar10 = null;
        l0.e eVar11 = null;
        for (l0.e eVar12 : list) {
            l0.e.c cVarFrom = l0.e.c.from(eVar12.f2090c.mView);
            int i11 = a.f1970a[eVar12.f2088a.ordinal()];
            if (i11 == 1 || i11 == 2 || i11 == 3) {
                if (cVarFrom == l0.e.c.VISIBLE && eVar10 == null) {
                    eVar10 = eVar12;
                }
            } else if (i11 == 4 && cVarFrom != l0.e.c.VISIBLE) {
                eVar11 = eVar12;
            }
        }
        String str10 = "FragmentManager";
        if (FragmentManager.K(2)) {
            Log.v("FragmentManager", "Executing operations from " + eVar10 + " to " + eVar11);
        }
        ArrayList arrayList13 = new ArrayList();
        ArrayList<e> arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList(list);
        Fragment fragment3 = list.get(list.size() - 1).f2090c;
        Iterator<l0.e> it2 = list.iterator();
        while (it2.hasNext()) {
            Fragment.j jVar = it2.next().f2090c.mAnimationInfo;
            Fragment.j jVar2 = fragment3.mAnimationInfo;
            jVar.f1875b = jVar2.f1875b;
            jVar.f1876c = jVar2.f1876c;
            jVar.f1877d = jVar2.f1877d;
            jVar.f1878e = jVar2.f1878e;
        }
        Iterator<l0.e> it3 = list.iterator();
        while (it3.hasNext()) {
            l0.e next = it3.next();
            l0.d dVar = new l0.d();
            next.d();
            next.f2092e.add(dVar);
            arrayList13.add(new c(next, dVar, z16));
            l0.d dVar2 = new l0.d();
            next.d();
            next.f2092e.add(dVar2);
            arrayList14.add(new e(next, dVar2, z16, !z16 ? next != eVar11 : next != eVar10));
            next.f2091d.add(new RunnableC0034b(arrayList15, next));
        }
        HashMap map3 = new HashMap();
        i0 i0Var2 = null;
        for (e eVar13 : arrayList14) {
            if (!eVar13.b()) {
                i0 i0VarC = eVar13.c(eVar13.f1979c);
                i0 i0VarC2 = eVar13.c(eVar13.f1981e);
                if (i0VarC != null && i0VarC2 != null && i0VarC != i0VarC2) {
                    StringBuilder sbA = defpackage.a.a("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                    sbA.append(eVar13.f1977a.f2090c);
                    sbA.append(" returned Transition ");
                    sbA.append(eVar13.f1979c);
                    sbA.append(" which uses a different Transition  type than its shared element transition ");
                    sbA.append(eVar13.f1981e);
                    throw new IllegalArgumentException(sbA.toString());
                }
                if (i0VarC == null) {
                    i0VarC = i0VarC2;
                }
                if (i0Var2 == null) {
                    i0Var2 = i0VarC;
                } else if (i0VarC != null && i0Var2 != i0VarC) {
                    StringBuilder sbA2 = defpackage.a.a("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                    sbA2.append(eVar13.f1977a.f2090c);
                    sbA2.append(" returned Transition ");
                    throw new IllegalArgumentException(o0.c.a(sbA2, eVar13.f1979c, " which uses a different Transition  type than other Fragments."));
                }
            }
        }
        if (i0Var2 == null) {
            for (e eVar14 : arrayList14) {
                map3.put(eVar14.f1977a, Boolean.FALSE);
                eVar14.a();
            }
            eVar = eVar11;
            str = " to ";
            arrayList = arrayList13;
            arrayList2 = arrayList15;
            map = map3;
            str2 = "FragmentManager";
        } else {
            View view7 = new View(this.f2076a.getContext());
            Rect rect2 = new Rect();
            ArrayList<View> arrayList16 = new ArrayList<>();
            ArrayList<View> arrayList17 = new ArrayList<>();
            q.a aVar2 = new q.a();
            Iterator it4 = arrayList14.iterator();
            Rect rect3 = rect2;
            str = " to ";
            arrayList = arrayList13;
            Object obj3 = null;
            View view8 = null;
            boolean z17 = false;
            View view9 = view7;
            l0.e eVar15 = eVar10;
            l0.e eVar16 = eVar11;
            while (it4.hasNext()) {
                View view10 = view8;
                Object obj4 = ((e) it4.next()).f1981e;
                if (!(obj4 != null) || eVar15 == null || eVar16 == null) {
                    rect = rect3;
                    aVar = aVar2;
                    arrayList5 = arrayList14;
                    arrayList6 = arrayList15;
                    map2 = map3;
                    view2 = view9;
                    arrayList7 = arrayList17;
                    arrayList8 = arrayList16;
                    eVar6 = eVar11;
                    i0Var = i0Var2;
                } else {
                    Object objS = i0Var2.s(i0Var2.f(obj4));
                    ArrayList<String> sharedElementSourceNames = eVar16.f2090c.getSharedElementSourceNames();
                    i0 i0Var3 = i0Var2;
                    ArrayList<String> sharedElementSourceNames2 = eVar15.f2090c.getSharedElementSourceNames();
                    arrayList6 = arrayList15;
                    ArrayList<String> sharedElementTargetNames = eVar15.f2090c.getSharedElementTargetNames();
                    arrayList5 = arrayList14;
                    HashMap map4 = map3;
                    int i12 = 0;
                    while (i12 < sharedElementTargetNames.size()) {
                        int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i12));
                        ArrayList<String> arrayList18 = sharedElementTargetNames;
                        if (iIndexOf != -1) {
                            sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i12));
                        }
                        i12++;
                        sharedElementTargetNames = arrayList18;
                    }
                    ArrayList<String> sharedElementTargetNames2 = eVar16.f2090c.getSharedElementTargetNames();
                    if (z16) {
                        enterTransitionCallback = eVar15.f2090c.getEnterTransitionCallback();
                        exitTransitionCallback = eVar16.f2090c.getExitTransitionCallback();
                    } else {
                        enterTransitionCallback = eVar15.f2090c.getExitTransitionCallback();
                        exitTransitionCallback = eVar16.f2090c.getEnterTransitionCallback();
                    }
                    int size = sharedElementSourceNames.size();
                    int i13 = 0;
                    while (i13 < size) {
                        aVar2.put(sharedElementSourceNames.get(i13), sharedElementTargetNames2.get(i13));
                        i13++;
                        size = size;
                        eVar10 = eVar10;
                    }
                    l0.e eVar17 = eVar10;
                    if (FragmentManager.K(2)) {
                        Log.v(str10, ">>> entering view names <<<");
                        for (Iterator<String> it5 = sharedElementTargetNames2.iterator(); it5.hasNext(); it5 = it5) {
                            Log.v(str10, "Name: " + it5.next());
                        }
                        Log.v(str10, ">>> exiting view names <<<");
                        for (Iterator<String> it6 = sharedElementSourceNames.iterator(); it6.hasNext(); it6 = it6) {
                            Log.v(str10, "Name: " + it6.next());
                        }
                    }
                    q.a<String, View> aVar3 = new q.a<>();
                    k(aVar3, eVar15.f2090c.mView);
                    q.g.k(aVar3, sharedElementSourceNames);
                    if (enterTransitionCallback != null) {
                        if (FragmentManager.K(2)) {
                            Log.v(str10, "Executing exit callback for operation " + eVar15);
                        }
                        int size2 = sharedElementSourceNames.size() - 1;
                        while (size2 >= 0) {
                            String str11 = sharedElementSourceNames.get(size2);
                            View view11 = aVar3.get(str11);
                            if (view11 == null) {
                                aVar2.remove(str11);
                                arrayList10 = sharedElementSourceNames;
                            } else {
                                WeakHashMap<View, p0.m0> weakHashMap = p0.e0.f34354a;
                                arrayList10 = sharedElementSourceNames;
                                if (!str11.equals(p0.e0.i.k(view11))) {
                                    aVar2.put(p0.e0.i.k(view11), (String) aVar2.remove(str11));
                                }
                            }
                            size2--;
                            sharedElementSourceNames = arrayList10;
                        }
                        arrayList9 = sharedElementSourceNames;
                    } else {
                        arrayList9 = sharedElementSourceNames;
                        q.g.k(aVar2, aVar3.keySet());
                    }
                    q.a<String, View> aVar4 = new q.a<>();
                    k(aVar4, eVar16.f2090c.mView);
                    q.g.k(aVar4, sharedElementTargetNames2);
                    q.g.k(aVar4, aVar2.values());
                    if (exitTransitionCallback == null) {
                        i0 i0Var4 = f0.f2034a;
                        int i14 = aVar2.f34737e;
                        while (true) {
                            i14--;
                            if (i14 < 0) {
                                break;
                            } else if (!aVar4.containsKey((String) aVar2.l(i14))) {
                                aVar2.j(i14);
                            }
                        }
                    } else {
                        if (FragmentManager.K(2)) {
                            Log.v(str10, "Executing enter callback for operation " + eVar16);
                        }
                        for (int size3 = sharedElementTargetNames2.size() - 1; size3 >= 0; size3--) {
                            String str12 = sharedElementTargetNames2.get(size3);
                            View view12 = aVar4.get(str12);
                            if (view12 == null) {
                                String strB2 = f0.b(aVar2, str12);
                                if (strB2 != null) {
                                    aVar2.remove(strB2);
                                }
                            } else {
                                WeakHashMap<View, p0.m0> weakHashMap2 = p0.e0.f34354a;
                                if (!str12.equals(p0.e0.i.k(view12)) && (strB = f0.b(aVar2, str12)) != null) {
                                    aVar2.put(strB, p0.e0.i.k(view12));
                                }
                            }
                        }
                    }
                    l(aVar3, aVar2.keySet());
                    l(aVar4, aVar2.values());
                    if (aVar2.isEmpty()) {
                        arrayList16.clear();
                        arrayList17.clear();
                        obj3 = null;
                        rect = rect3;
                        aVar = aVar2;
                        arrayList7 = arrayList17;
                        eVar6 = eVar11;
                        view2 = view9;
                        i0Var = i0Var3;
                        map2 = map4;
                        eVar10 = eVar17;
                        arrayList8 = arrayList16;
                    } else {
                        f0.a(eVar16.f2090c, eVar15.f2090c, z16, aVar3, true);
                        ArrayList<View> arrayList19 = arrayList16;
                        l0.e eVar18 = eVar11;
                        rect = rect3;
                        aVar = aVar2;
                        View view13 = view9;
                        arrayList8 = arrayList19;
                        l0.e eVar19 = eVar11;
                        i0Var = i0Var3;
                        arrayList7 = arrayList17;
                        p0.x.a(this.f2076a, new g(this, eVar18, eVar17, z10, aVar4));
                        arrayList8.addAll(aVar3.values());
                        if (arrayList9.isEmpty()) {
                            obj2 = objS;
                            i10 = 0;
                            view3 = view10;
                        } else {
                            i10 = 0;
                            view3 = aVar3.get(arrayList9.get(0));
                            obj2 = objS;
                            i0Var.o(obj2, view3);
                        }
                        arrayList7.addAll(aVar4.values());
                        if (!sharedElementTargetNames2.isEmpty() && (view4 = aVar4.get(sharedElementTargetNames2.get(i10))) != null) {
                            p0.x.a(this.f2076a, new h(this, i0Var, view4, rect));
                            z17 = true;
                        }
                        view2 = view13;
                        i0Var.q(obj2, view2, arrayList8);
                        i0Var.m(obj2, null, null, null, null, obj2, arrayList7);
                        Boolean bool = Boolean.TRUE;
                        map2 = map4;
                        eVar10 = eVar17;
                        map2.put(eVar10, bool);
                        eVar6 = eVar19;
                        map2.put(eVar6, bool);
                        view10 = view3;
                        obj3 = obj2;
                        eVar15 = eVar10;
                        eVar16 = eVar6;
                    }
                }
                view9 = view2;
                i0Var2 = i0Var;
                arrayList16 = arrayList8;
                eVar11 = eVar6;
                arrayList17 = arrayList7;
                arrayList15 = arrayList6;
                arrayList14 = arrayList5;
                str10 = str10;
                aVar2 = aVar;
                rect3 = rect;
                map3 = map2;
                view8 = view10;
                z16 = z10;
            }
            Rect rect4 = rect3;
            q.a aVar5 = aVar2;
            View view14 = view8;
            String str13 = str10;
            ArrayList arrayList20 = arrayList14;
            ArrayList arrayList21 = arrayList15;
            map = map3;
            View view15 = view9;
            ArrayList<View> arrayList22 = arrayList17;
            ArrayList<View> arrayList23 = arrayList16;
            l0.e eVar20 = eVar11;
            i0 i0Var5 = i0Var2;
            ArrayList arrayList24 = new ArrayList();
            Iterator it7 = arrayList20.iterator();
            Object objK = null;
            Object objK2 = null;
            while (it7.hasNext()) {
                Iterator it8 = it7;
                e eVar21 = (e) it7.next();
                if (eVar21.b()) {
                    eVar4 = eVar20;
                    eVar3 = eVar10;
                    map.put(eVar21.f1977a, Boolean.FALSE);
                    eVar21.a();
                    obj = obj3;
                    eVar5 = eVar16;
                    view = view14;
                    arrayList4 = arrayList21;
                } else {
                    eVar3 = eVar10;
                    eVar4 = eVar20;
                    Object objF = i0Var5.f(eVar21.f1979c);
                    l0.e eVar22 = eVar21.f1977a;
                    boolean z18 = obj3 != null && (eVar22 == eVar15 || eVar22 == eVar16);
                    if (objF == null) {
                        if (!z18) {
                            map.put(eVar22, Boolean.FALSE);
                            eVar21.a();
                        }
                        obj = obj3;
                        view = view14;
                        arrayList4 = arrayList21;
                    } else {
                        obj = obj3;
                        ArrayList<View> arrayList25 = new ArrayList<>();
                        Object obj5 = objK;
                        j(arrayList25, eVar22.f2090c.mView);
                        if (z18) {
                            if (eVar22 == eVar15) {
                                arrayList25.removeAll(arrayList23);
                            } else {
                                arrayList25.removeAll(arrayList22);
                            }
                        }
                        if (arrayList25.isEmpty()) {
                            i0Var5.a(objF, view15);
                            arrayList4 = arrayList21;
                        } else {
                            i0Var5.b(objF, arrayList25);
                            i0Var5.m(objF, objF, arrayList25, null, null, null, null);
                            arrayList4 = arrayList21;
                            if (eVar22.f2088a == l0.e.c.GONE) {
                                arrayList4.remove(eVar22);
                                ArrayList<View> arrayList26 = new ArrayList<>(arrayList25);
                                arrayList26.remove(eVar22.f2090c.mView);
                                i0Var5.l(objF, eVar22.f2090c.mView, arrayList26);
                                p0.x.a(this.f2076a, new i(this, arrayList25));
                            }
                        }
                        if (eVar22.f2088a == l0.e.c.VISIBLE) {
                            arrayList24.addAll(arrayList25);
                            if (z17) {
                                i0Var5.n(objF, rect4);
                            }
                            view = view14;
                        } else {
                            view = view14;
                            i0Var5.o(objF, view);
                        }
                        map.put(eVar22, Boolean.TRUE);
                        if (eVar21.f1980d) {
                            objK2 = i0Var5.k(objK2, objF, null);
                            objK = obj5;
                        } else {
                            objK = i0Var5.k(obj5, objF, null);
                        }
                    }
                    eVar15 = eVar3;
                    eVar5 = eVar4;
                }
                view14 = view;
                arrayList21 = arrayList4;
                obj3 = obj;
                eVar10 = eVar3;
                eVar20 = eVar4;
                eVar16 = eVar5;
                it7 = it8;
            }
            Object obj6 = obj3;
            l0.e eVar23 = eVar10;
            eVar = eVar20;
            arrayList2 = arrayList21;
            Object objJ = i0Var5.j(objK2, objK, obj6);
            if (objJ != null) {
                Iterator it9 = arrayList20.iterator();
                while (it9.hasNext()) {
                    e eVar24 = (e) it9.next();
                    if (!eVar24.b()) {
                        Object obj7 = eVar24.f1979c;
                        l0.e eVar25 = eVar24.f1977a;
                        l0.e eVar26 = eVar23;
                        eVar = eVar;
                        boolean z19 = obj6 != null && (eVar25 == eVar26 || eVar25 == eVar);
                        if (obj7 != null || z19) {
                            ViewGroup viewGroup2 = this.f2076a;
                            WeakHashMap<View, p0.m0> weakHashMap3 = p0.e0.f34354a;
                            if (p0.e0.g.c(viewGroup2)) {
                                str5 = str13;
                                i0Var5.p(eVar24.f1977a.f2090c, objJ, eVar24.f1978b, new j(this, eVar24, eVar25));
                            } else {
                                if (FragmentManager.K(2)) {
                                    StringBuilder sbA3 = defpackage.a.a("SpecialEffectsController: Container ");
                                    sbA3.append(this.f2076a);
                                    sbA3.append(" has not been laid out. Completing operation ");
                                    sbA3.append(eVar25);
                                    str5 = str13;
                                    Log.v(str5, sbA3.toString());
                                } else {
                                    str5 = str13;
                                }
                                eVar24.a();
                            }
                        } else {
                            str5 = str13;
                        }
                        it9 = it9;
                        eVar23 = eVar26;
                        str13 = str5;
                    }
                }
                eVar10 = eVar23;
                str2 = str13;
                ViewGroup viewGroup3 = this.f2076a;
                WeakHashMap<View, p0.m0> weakHashMap4 = p0.e0.f34354a;
                if (p0.e0.g.c(viewGroup3)) {
                    f0.c(arrayList24, 4);
                    ArrayList arrayList27 = new ArrayList();
                    int size4 = arrayList22.size();
                    for (int i15 = 0; i15 < size4; i15++) {
                        View view16 = arrayList22.get(i15);
                        WeakHashMap<View, p0.m0> weakHashMap5 = p0.e0.f34354a;
                        arrayList27.add(p0.e0.i.k(view16));
                        p0.e0.i.v(view16, null);
                    }
                    if (FragmentManager.K(2)) {
                        Log.v(str2, ">>>>> Beginning transition <<<<<");
                        Log.v(str2, ">>>>> SharedElementFirstOutViews <<<<<");
                        for (Iterator<View> it10 = arrayList23.iterator(); it10.hasNext(); it10 = it10) {
                            View next2 = it10.next();
                            Log.v(str2, "View: " + next2 + " Name: " + p0.e0.i.k(next2));
                        }
                        Log.v(str2, ">>>>> SharedElementLastInViews <<<<<");
                        for (Iterator<View> it11 = arrayList22.iterator(); it11.hasNext(); it11 = it11) {
                            View next3 = it11.next();
                            Log.v(str2, "View: " + next3 + " Name: " + p0.e0.i.k(next3));
                        }
                    }
                    i0Var5.c(this.f2076a, objJ);
                    ViewGroup viewGroup4 = this.f2076a;
                    int size5 = arrayList22.size();
                    ArrayList arrayList28 = new ArrayList();
                    int i16 = 0;
                    while (i16 < size5) {
                        View view17 = arrayList23.get(i16);
                        WeakHashMap<View, p0.m0> weakHashMap6 = p0.e0.f34354a;
                        l0.e eVar27 = eVar10;
                        String strK = p0.e0.i.k(view17);
                        arrayList28.add(strK);
                        ArrayList arrayList29 = arrayList2;
                        if (strK == null) {
                            str4 = str2;
                        } else {
                            p0.e0.i.v(view17, null);
                            String str14 = (String) aVar5.getOrDefault(strK, null);
                            int i17 = 0;
                            while (true) {
                                str4 = str2;
                                if (i17 >= size5) {
                                    break;
                                }
                                if (str14.equals(arrayList27.get(i17))) {
                                    p0.e0.i.v(arrayList22.get(i17), strK);
                                    break;
                                } else {
                                    i17++;
                                    str2 = str4;
                                }
                            }
                        }
                        i16++;
                        arrayList2 = arrayList29;
                        eVar10 = eVar27;
                        str2 = str4;
                    }
                    eVar2 = eVar10;
                    arrayList3 = arrayList2;
                    str3 = str2;
                    p0.x.a(viewGroup4, new h0(i0Var5, size5, arrayList22, arrayList27, arrayList23, arrayList28));
                    z11 = false;
                    f0.c(arrayList24, 0);
                    i0Var5.r(obj6, arrayList23, arrayList22);
                }
                zContainsValue = map.containsValue(Boolean.TRUE);
                viewGroup = this.f2076a;
                context = viewGroup.getContext();
                arrayList11 = new ArrayList();
                it = arrayList.iterator();
                z12 = z11;
                while (it.hasNext()) {
                    cVar = (c) it.next();
                    if (cVar.b() || (aVarC = cVar.c(context)) == null) {
                        cVar.a();
                        str8 = str3;
                        str3 = str8;
                    } else {
                        animator = aVarC.f2100b;
                        if (animator == null) {
                            arrayList11.add(cVar);
                            str8 = str3;
                            str3 = str8;
                        } else {
                            eVar8 = cVar.f1977a;
                            fragment2 = eVar8.f2090c;
                            if (Boolean.TRUE.equals(map.get(eVar8))) {
                                if (FragmentManager.K(2)) {
                                    str8 = str3;
                                    Log.v(str8, "Ignoring Animator set on " + fragment2 + " as this Fragment was involved in a Transition.");
                                } else {
                                    str8 = str3;
                                }
                                cVar.a();
                                str3 = str8;
                            } else {
                                str9 = str3;
                                if (eVar8.f2088a == l0.e.c.GONE) {
                                    z11 = true;
                                }
                                z15 = z11;
                                arrayList12 = arrayList3;
                                if (z15) {
                                    arrayList12.remove(eVar8);
                                }
                                View view18 = fragment2.mView;
                                viewGroup.startViewTransition(view18);
                                HashMap map5 = map;
                                Iterator it12 = it;
                                animator.addListener(new androidx.fragment.app.c(this, viewGroup, view18, z15, eVar8, cVar));
                                animator.setTarget(view18);
                                animator.start();
                                if (FragmentManager.K(2)) {
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append("Animator from operation ");
                                    eVar9 = eVar8;
                                    sb3.append(eVar9);
                                    sb3.append(" has started.");
                                    Log.v(str9, sb3.toString());
                                } else {
                                    eVar9 = eVar8;
                                }
                                cVar.f1978b.b(new androidx.fragment.app.d(this, animator, eVar9));
                                z12 = true;
                                z11 = false;
                                str3 = str9;
                                arrayList3 = arrayList12;
                                it = it12;
                                map = map5;
                            }
                        }
                    }
                }
                ArrayList<l0.e> arrayList30 = arrayList3;
                str6 = str3;
                for (c cVar2 : arrayList11) {
                    eVar7 = cVar2.f1977a;
                    fragment = eVar7.f2090c;
                    if (zContainsValue) {
                        if (FragmentManager.K(2)) {
                            sb2 = new StringBuilder();
                            sb2.append("Ignoring Animation set on ");
                            sb2.append(fragment);
                            str7 = " as Animations cannot run alongside Transitions.";
                            sb2.append(str7);
                            Log.v(str6, sb2.toString());
                        }
                        cVar2.a();
                    } else if (z12) {
                        if (FragmentManager.K(2)) {
                            sb2 = new StringBuilder();
                            sb2.append("Ignoring Animation set on ");
                            sb2.append(fragment);
                            str7 = " as Animations cannot run alongside Animators.";
                            sb2.append(str7);
                            Log.v(str6, sb2.toString());
                        }
                        cVar2.a();
                    } else {
                        view5 = fragment.mView;
                        o.a aVarC2 = cVar2.c(context);
                        Objects.requireNonNull(aVarC2);
                        animation = aVarC2.f2099a;
                        Objects.requireNonNull(animation);
                        if (eVar7.f2088a != l0.e.c.REMOVED) {
                            view5.startAnimation(animation);
                            cVar2.a();
                            z13 = z12;
                            z14 = zContainsValue;
                            view6 = view5;
                        } else {
                            viewGroup.startViewTransition(view5);
                            o.b bVar = new o.b(animation, viewGroup, view5);
                            z13 = z12;
                            z14 = zContainsValue;
                            view6 = view5;
                            bVar.setAnimationListener(new androidx.fragment.app.e(this, eVar7, viewGroup, view5, cVar2));
                            view6.startAnimation(bVar);
                            if (FragmentManager.K(2)) {
                                Log.v(str6, "Animation from operation " + eVar7 + " has started.");
                            }
                        }
                        cVar2.f1978b.b(new f(this, view6, viewGroup, cVar2, eVar7));
                        z12 = z13;
                        zContainsValue = z14;
                    }
                }
                for (l0.e eVar28 : arrayList30) {
                    eVar28.f2088a.applyState(eVar28.f2090c.mView);
                }
                arrayList30.clear();
                if (FragmentManager.K(2)) {
                    Log.v(str6, "Completed executing operations from " + eVar2 + str + eVar);
                }
            }
            eVar10 = eVar23;
            str2 = str13;
        }
        z11 = false;
        eVar2 = eVar10;
        arrayList3 = arrayList2;
        str3 = str2;
        zContainsValue = map.containsValue(Boolean.TRUE);
        viewGroup = this.f2076a;
        context = viewGroup.getContext();
        arrayList11 = new ArrayList();
        it = arrayList.iterator();
        z12 = z11;
        while (it.hasNext()) {
            cVar = (c) it.next();
            if (cVar.b()) {
                animator = aVarC.f2100b;
                if (animator == null) {
                    arrayList11.add(cVar);
                    str8 = str3;
                    str3 = str8;
                } else {
                    eVar8 = cVar.f1977a;
                    fragment2 = eVar8.f2090c;
                    if (Boolean.TRUE.equals(map.get(eVar8))) {
                        if (FragmentManager.K(2)) {
                            str8 = str3;
                            Log.v(str8, "Ignoring Animator set on " + fragment2 + " as this Fragment was involved in a Transition.");
                        } else {
                            str8 = str3;
                        }
                        cVar.a();
                        str3 = str8;
                    } else {
                        str9 = str3;
                        if (eVar8.f2088a == l0.e.c.GONE) {
                            z11 = true;
                        }
                        z15 = z11;
                        arrayList12 = arrayList3;
                        if (z15) {
                            arrayList12.remove(eVar8);
                        }
                        View view19 = fragment2.mView;
                        viewGroup.startViewTransition(view19);
                        HashMap map6 = map;
                        Iterator it13 = it;
                        animator.addListener(new androidx.fragment.app.c(this, viewGroup, view19, z15, eVar8, cVar));
                        animator.setTarget(view19);
                        animator.start();
                        if (FragmentManager.K(2)) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("Animator from operation ");
                            eVar9 = eVar8;
                            sb4.append(eVar9);
                            sb4.append(" has started.");
                            Log.v(str9, sb4.toString());
                        } else {
                            eVar9 = eVar8;
                        }
                        cVar.f1978b.b(new androidx.fragment.app.d(this, animator, eVar9));
                        z12 = true;
                        z11 = false;
                        str3 = str9;
                        arrayList3 = arrayList12;
                        it = it13;
                        map = map6;
                    }
                }
            }
            cVar.a();
            str8 = str3;
            str3 = str8;
        }
        ArrayList<l0.e> arrayList31 = arrayList3;
        str6 = str3;
        while (r12.hasNext()) {
            eVar7 = cVar2.f1977a;
            fragment = eVar7.f2090c;
            if (zContainsValue) {
                if (FragmentManager.K(2)) {
                    sb2 = new StringBuilder();
                    sb2.append("Ignoring Animation set on ");
                    sb2.append(fragment);
                    str7 = " as Animations cannot run alongside Transitions.";
                    sb2.append(str7);
                    Log.v(str6, sb2.toString());
                }
                cVar2.a();
            } else if (z12) {
                if (FragmentManager.K(2)) {
                    sb2 = new StringBuilder();
                    sb2.append("Ignoring Animation set on ");
                    sb2.append(fragment);
                    str7 = " as Animations cannot run alongside Animators.";
                    sb2.append(str7);
                    Log.v(str6, sb2.toString());
                }
                cVar2.a();
            } else {
                view5 = fragment.mView;
                o.a aVarC3 = cVar2.c(context);
                Objects.requireNonNull(aVarC3);
                animation = aVarC3.f2099a;
                Objects.requireNonNull(animation);
                if (eVar7.f2088a != l0.e.c.REMOVED) {
                    view5.startAnimation(animation);
                    cVar2.a();
                    z13 = z12;
                    z14 = zContainsValue;
                    view6 = view5;
                } else {
                    viewGroup.startViewTransition(view5);
                    o.b bVar2 = new o.b(animation, viewGroup, view5);
                    z13 = z12;
                    z14 = zContainsValue;
                    view6 = view5;
                    bVar2.setAnimationListener(new androidx.fragment.app.e(this, eVar7, viewGroup, view5, cVar2));
                    view6.startAnimation(bVar2);
                    if (FragmentManager.K(2)) {
                        Log.v(str6, "Animation from operation " + eVar7 + " has started.");
                    }
                }
                cVar2.f1978b.b(new f(this, view6, viewGroup, cVar2, eVar7));
                z12 = z13;
                zContainsValue = z14;
            }
        }
        while (r0.hasNext()) {
            eVar28.f2088a.applyState(eVar28.f2090c.mView);
        }
        arrayList31.clear();
        if (FragmentManager.K(2)) {
            Log.v(str6, "Completed executing operations from " + eVar2 + str + eVar);
        }
    }

    public void j(ArrayList<View> arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (p0.h0.b(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt.getVisibility() == 0) {
                j(arrayList, childAt);
            }
        }
    }

    public void k(Map<String, View> map, View view) {
        WeakHashMap<View, p0.m0> weakHashMap = p0.e0.f34354a;
        String strK = p0.e0.i.k(view);
        if (strK != null) {
            map.put(strK, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    k(map, childAt);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void l(q.a<String, View> aVar, Collection<String> collection) {
        Iterator it = ((q.g.b) aVar.entrySet()).iterator();
        while (true) {
            q.g.d dVar = (q.g.d) it;
            if (!dVar.hasNext()) {
                return;
            }
            dVar.next();
            View view = (View) dVar.getValue();
            WeakHashMap<View, p0.m0> weakHashMap = p0.e0.f34354a;
            if (!collection.contains(p0.e0.i.k(view))) {
                dVar.remove();
            }
        }
    }
}
