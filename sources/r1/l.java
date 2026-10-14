package r1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.WeakHashMap;
import p0.e0;
import p0.m0;

/* JADX INFO: loaded from: classes.dex */
public abstract class l implements Cloneable {
    public static final boolean DBG = false;
    private static final String LOG_TAG = "Transition";
    private static final int MATCH_FIRST = 1;
    public static final int MATCH_ID = 3;
    private static final String MATCH_ID_STR = "id";
    public static final int MATCH_INSTANCE = 1;
    private static final String MATCH_INSTANCE_STR = "instance";
    public static final int MATCH_ITEM_ID = 4;
    private static final String MATCH_ITEM_ID_STR = "itemId";
    private static final int MATCH_LAST = 4;
    public static final int MATCH_NAME = 2;
    private static final String MATCH_NAME_STR = "name";
    private ArrayList<r> mEndValuesList;
    private f mEpicenterCallback;
    private q.a<String, String> mNameOverrides;
    public o mPropagation;
    private ArrayList<r> mStartValuesList;
    private static final int[] DEFAULT_MATCH_ORDER = {2, 1, 3, 4};
    private static final r1.g STRAIGHT_PATH_MOTION = new a();
    private static ThreadLocal<q.a<Animator, d>> sRunningAnimators = new ThreadLocal<>();
    private String mName = getClass().getName();
    private long mStartDelay = -1;
    public long mDuration = -1;
    private TimeInterpolator mInterpolator = null;
    public ArrayList<Integer> mTargetIds = new ArrayList<>();
    public ArrayList<View> mTargets = new ArrayList<>();
    private ArrayList<String> mTargetNames = null;
    private ArrayList<Class<?>> mTargetTypes = null;
    private ArrayList<Integer> mTargetIdExcludes = null;
    private ArrayList<View> mTargetExcludes = null;
    private ArrayList<Class<?>> mTargetTypeExcludes = null;
    private ArrayList<String> mTargetNameExcludes = null;
    private ArrayList<Integer> mTargetIdChildExcludes = null;
    private ArrayList<View> mTargetChildExcludes = null;
    private ArrayList<Class<?>> mTargetTypeChildExcludes = null;
    private s mStartValues = new s();
    private s mEndValues = new s();
    public p mParent = null;
    private int[] mMatchOrder = DEFAULT_MATCH_ORDER;
    public boolean mCanRemoveViews = false;
    public ArrayList<Animator> mCurrentAnimators = new ArrayList<>();
    private int mNumInstances = 0;
    private boolean mPaused = false;
    private boolean mEnded = false;
    private ArrayList<g> mListeners = null;
    private ArrayList<Animator> mAnimators = new ArrayList<>();
    private r1.g mPathMotion = STRAIGHT_PATH_MOTION;

    public class a extends r1.g {
        @Override // r1.g
        public Path getPath(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    public class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q.a f35107a;

        public b(q.a aVar) {
            this.f35107a = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f35107a.remove(animator);
            l.this.mCurrentAnimators.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            l.this.mCurrentAnimators.add(animator);
        }
    }

    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            l.this.end();
            animator.removeListener(this);
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f35110a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f35111b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public r f35112c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public d0 f35113d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public l f35114e;

        public d(View view, String str, l lVar, d0 d0Var, r rVar) {
            this.f35110a = view;
            this.f35111b = str;
            this.f35112c = rVar;
            this.f35113d = d0Var;
            this.f35114e = lVar;
        }
    }

    public static class e {
        public static <T> ArrayList<T> a(ArrayList<T> arrayList, T t10) {
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (!arrayList.contains(t10)) {
                arrayList.add(t10);
            }
            return arrayList;
        }

        public static <T> ArrayList<T> b(ArrayList<T> arrayList, T t10) {
            if (arrayList == null) {
                return arrayList;
            }
            arrayList.remove(t10);
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
    }

    public static abstract class f {
        public abstract Rect a(l lVar);
    }

    public interface g {
        void onTransitionCancel(l lVar);

        void onTransitionEnd(l lVar);

        void onTransitionPause(l lVar);

        void onTransitionResume(l lVar);

        void onTransitionStart(l lVar);
    }

    public l() {
    }

    @SuppressLint({"RestrictedApi"})
    public l(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f35100a);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long jD = g0.j.d(typedArrayObtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (jD >= 0) {
            setDuration(jD);
        }
        long j10 = g0.j.i(xmlResourceParser, "startDelay") ? typedArrayObtainStyledAttributes.getInt(2, -1) : -1;
        if (j10 > 0) {
            setStartDelay(j10);
        }
        int resourceId = g0.j.i(xmlResourceParser, "interpolator") ? typedArrayObtainStyledAttributes.getResourceId(0, 0) : 0;
        if (resourceId > 0) {
            setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        }
        String strE = g0.j.e(typedArrayObtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (strE != null) {
            setMatchOrder(parseMatchOrder(strE));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void addUnmatched(q.a<View, r> aVar, q.a<View, r> aVar2) {
        for (int i10 = 0; i10 < aVar.f34737e; i10++) {
            r rVarL = aVar.l(i10);
            if (isValidTarget(rVarL.f35133b)) {
                this.mStartValuesList.add(rVarL);
                this.mEndValuesList.add(null);
            }
        }
        for (int i11 = 0; i11 < aVar2.f34737e; i11++) {
            r rVarL2 = aVar2.l(i11);
            if (isValidTarget(rVarL2.f35133b)) {
                this.mEndValuesList.add(rVarL2);
                this.mStartValuesList.add(null);
            }
        }
    }

    private static void addViewValues(s sVar, View view, r rVar) {
        sVar.f35135a.put(view, rVar);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (sVar.f35136b.indexOfKey(id2) >= 0) {
                sVar.f35136b.put(id2, null);
            } else {
                sVar.f35136b.put(id2, view);
            }
        }
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        String strK = e0.i.k(view);
        if (strK != null) {
            if (sVar.f35138d.e(strK) >= 0) {
                sVar.f35138d.put(strK, null);
            } else {
                sVar.f35138d.put(strK, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                q.e<View> eVar = sVar.f35137c;
                if (eVar.f34712c) {
                    eVar.e();
                }
                if (q.d.b(eVar.f34713d, eVar.f34715f, itemIdAtPosition) < 0) {
                    e0.d.r(view, true);
                    sVar.f35137c.j(itemIdAtPosition, view);
                    return;
                }
                View viewF = sVar.f35137c.f(itemIdAtPosition);
                if (viewF != null) {
                    e0.d.r(viewF, false);
                    sVar.f35137c.j(itemIdAtPosition, null);
                }
            }
        }
    }

    private static boolean alreadyContains(int[] iArr, int i10) {
        int i11 = iArr[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            if (iArr[i12] == i11) {
                return true;
            }
        }
        return false;
    }

    private void captureHierarchy(View view, boolean z10) {
        if (view == null) {
            return;
        }
        int id2 = view.getId();
        ArrayList<Integer> arrayList = this.mTargetIdExcludes;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id2))) {
            ArrayList<View> arrayList2 = this.mTargetExcludes;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.mTargetTypeExcludes;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.mTargetTypeExcludes.get(i10).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    r rVar = new r(view);
                    if (z10) {
                        captureStartValues(rVar);
                    } else {
                        captureEndValues(rVar);
                    }
                    rVar.f35134c.add(this);
                    capturePropagationValues(rVar);
                    addViewValues(z10 ? this.mStartValues : this.mEndValues, view, rVar);
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.mTargetIdChildExcludes;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id2))) {
                        ArrayList<View> arrayList5 = this.mTargetChildExcludes;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.mTargetTypeChildExcludes;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i11 = 0; i11 < size2; i11++) {
                                    if (this.mTargetTypeChildExcludes.get(i11).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                                captureHierarchy(viewGroup.getChildAt(i12), z10);
                            }
                        }
                    }
                }
            }
        }
    }

    private ArrayList<Integer> excludeId(ArrayList<Integer> arrayList, int i10, boolean z10) {
        if (i10 <= 0) {
            return arrayList;
        }
        Integer numValueOf = Integer.valueOf(i10);
        return z10 ? e.a(arrayList, numValueOf) : e.b(arrayList, numValueOf);
    }

    private static <T> ArrayList<T> excludeObject(ArrayList<T> arrayList, T t10, boolean z10) {
        if (t10 != null) {
            return z10 ? e.a(arrayList, t10) : e.b(arrayList, t10);
        }
        return arrayList;
    }

    private ArrayList<Class<?>> excludeType(ArrayList<Class<?>> arrayList, Class<?> cls, boolean z10) {
        if (cls != null) {
            return z10 ? e.a(arrayList, cls) : e.b(arrayList, cls);
        }
        return arrayList;
    }

    private ArrayList<View> excludeView(ArrayList<View> arrayList, View view, boolean z10) {
        if (view != null) {
            return z10 ? e.a(arrayList, view) : e.b(arrayList, view);
        }
        return arrayList;
    }

    private static q.a<Animator, d> getRunningAnimators() {
        q.a<Animator, d> aVar = sRunningAnimators.get();
        if (aVar != null) {
            return aVar;
        }
        q.a<Animator, d> aVar2 = new q.a<>();
        sRunningAnimators.set(aVar2);
        return aVar2;
    }

    private static boolean isValidMatch(int i10) {
        return i10 >= 1 && i10 <= 4;
    }

    private static boolean isValueChanged(r rVar, r rVar2, String str) {
        Object obj = rVar.f35132a.get(str);
        Object obj2 = rVar2.f35132a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    private void matchIds(q.a<View, r> aVar, q.a<View, r> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            View viewValueAt = sparseArray.valueAt(i10);
            if (viewValueAt != null && isValidTarget(viewValueAt) && (view = sparseArray2.get(sparseArray.keyAt(i10))) != null && isValidTarget(view)) {
                r orDefault = aVar.getOrDefault(viewValueAt, null);
                r orDefault2 = aVar2.getOrDefault(view, null);
                if (orDefault != null && orDefault2 != null) {
                    this.mStartValuesList.add(orDefault);
                    this.mEndValuesList.add(orDefault2);
                    aVar.remove(viewValueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void matchInstances(q.a<View, r> aVar, q.a<View, r> aVar2) {
        r rVarRemove;
        for (int i10 = aVar.f34737e - 1; i10 >= 0; i10--) {
            View viewH = aVar.h(i10);
            if (viewH != null && isValidTarget(viewH) && (rVarRemove = aVar2.remove(viewH)) != null && isValidTarget(rVarRemove.f35133b)) {
                this.mStartValuesList.add(aVar.j(i10));
                this.mEndValuesList.add(rVarRemove);
            }
        }
    }

    private void matchItemIds(q.a<View, r> aVar, q.a<View, r> aVar2, q.e<View> eVar, q.e<View> eVar2) {
        View viewF;
        int iL = eVar.l();
        for (int i10 = 0; i10 < iL; i10++) {
            View viewM = eVar.m(i10);
            if (viewM != null && isValidTarget(viewM) && (viewF = eVar2.f(eVar.i(i10))) != null && isValidTarget(viewF)) {
                r orDefault = aVar.getOrDefault(viewM, null);
                r orDefault2 = aVar2.getOrDefault(viewF, null);
                if (orDefault != null && orDefault2 != null) {
                    this.mStartValuesList.add(orDefault);
                    this.mEndValuesList.add(orDefault2);
                    aVar.remove(viewM);
                    aVar2.remove(viewF);
                }
            }
        }
    }

    private void matchNames(q.a<View, r> aVar, q.a<View, r> aVar2, q.a<String, View> aVar3, q.a<String, View> aVar4) {
        View view;
        int i10 = aVar3.f34737e;
        for (int i11 = 0; i11 < i10; i11++) {
            View viewL = aVar3.l(i11);
            if (viewL != null && isValidTarget(viewL) && (view = aVar4.get(aVar3.h(i11))) != null && isValidTarget(view)) {
                r orDefault = aVar.getOrDefault(viewL, null);
                r orDefault2 = aVar2.getOrDefault(view, null);
                if (orDefault != null && orDefault2 != null) {
                    this.mStartValuesList.add(orDefault);
                    this.mEndValuesList.add(orDefault2);
                    aVar.remove(viewL);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void matchStartAndEnd(s sVar, s sVar2) {
        q.a<View, r> aVar = new q.a<>(sVar.f35135a);
        q.a<View, r> aVar2 = new q.a<>(sVar2.f35135a);
        int i10 = 0;
        while (true) {
            int[] iArr = this.mMatchOrder;
            if (i10 >= iArr.length) {
                addUnmatched(aVar, aVar2);
                return;
            }
            int i11 = iArr[i10];
            if (i11 == 1) {
                matchInstances(aVar, aVar2);
            } else if (i11 == 2) {
                matchNames(aVar, aVar2, sVar.f35138d, sVar2.f35138d);
            } else if (i11 == 3) {
                matchIds(aVar, aVar2, sVar.f35136b, sVar2.f35136b);
            } else if (i11 == 4) {
                matchItemIds(aVar, aVar2, sVar.f35137c, sVar2.f35137c);
            }
            i10++;
        }
    }

    private static int[] parseMatchOrder(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i10 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String strTrim = stringTokenizer.nextToken().trim();
            if ("id".equalsIgnoreCase(strTrim)) {
                iArr[i10] = 3;
            } else if (MATCH_INSTANCE_STR.equalsIgnoreCase(strTrim)) {
                iArr[i10] = 1;
            } else if ("name".equalsIgnoreCase(strTrim)) {
                iArr[i10] = 2;
            } else if (MATCH_ITEM_ID_STR.equalsIgnoreCase(strTrim)) {
                iArr[i10] = 4;
            } else {
                if (!strTrim.isEmpty()) {
                    throw new InflateException(androidx.activity.j.a("Unknown match type in matchOrder: '", strTrim, "'"));
                }
                int[] iArr2 = new int[iArr.length - 1];
                System.arraycopy(iArr, 0, iArr2, 0, i10);
                i10--;
                iArr = iArr2;
            }
            i10++;
        }
        return iArr;
    }

    private void runAnimator(Animator animator, q.a<Animator, d> aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            animate(animator);
        }
    }

    public l addListener(g gVar) {
        if (this.mListeners == null) {
            this.mListeners = new ArrayList<>();
        }
        this.mListeners.add(gVar);
        return this;
    }

    public l addTarget(int i10) {
        if (i10 != 0) {
            this.mTargetIds.add(Integer.valueOf(i10));
        }
        return this;
    }

    public l addTarget(View view) {
        this.mTargets.add(view);
        return this;
    }

    public l addTarget(Class<?> cls) {
        if (this.mTargetTypes == null) {
            this.mTargetTypes = new ArrayList<>();
        }
        this.mTargetTypes.add(cls);
        return this;
    }

    public l addTarget(String str) {
        if (this.mTargetNames == null) {
            this.mTargetNames = new ArrayList<>();
        }
        this.mTargetNames.add(str);
        return this;
    }

    public void animate(Animator animator) {
        if (animator == null) {
            end();
            return;
        }
        if (getDuration() >= 0) {
            animator.setDuration(getDuration());
        }
        if (getStartDelay() >= 0) {
            animator.setStartDelay(animator.getStartDelay() + getStartDelay());
        }
        if (getInterpolator() != null) {
            animator.setInterpolator(getInterpolator());
        }
        animator.addListener(new c());
        animator.start();
    }

    public void cancel() {
        for (int size = this.mCurrentAnimators.size() - 1; size >= 0; size--) {
            this.mCurrentAnimators.get(size).cancel();
        }
        ArrayList<g> arrayList = this.mListeners;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
        int size2 = arrayList2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ((g) arrayList2.get(i10)).onTransitionCancel(this);
        }
    }

    public abstract void captureEndValues(r rVar);

    public void capturePropagationValues(r rVar) {
        String[] strArrB;
        if (this.mPropagation == null || rVar.f35132a.isEmpty() || (strArrB = this.mPropagation.b()) == null) {
            return;
        }
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= strArrB.length) {
                z10 = true;
                break;
            } else if (!rVar.f35132a.containsKey(strArrB[i10])) {
                break;
            } else {
                i10++;
            }
        }
        if (z10) {
            return;
        }
        this.mPropagation.a(rVar);
    }

    public abstract void captureStartValues(r rVar);

    public void captureValues(ViewGroup viewGroup, boolean z10) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        q.a<String, String> aVar;
        clearValues(z10);
        if ((this.mTargetIds.size() > 0 || this.mTargets.size() > 0) && (((arrayList = this.mTargetNames) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetTypes) == null || arrayList2.isEmpty()))) {
            for (int i10 = 0; i10 < this.mTargetIds.size(); i10++) {
                View viewFindViewById = viewGroup.findViewById(this.mTargetIds.get(i10).intValue());
                if (viewFindViewById != null) {
                    r rVar = new r(viewFindViewById);
                    if (z10) {
                        captureStartValues(rVar);
                    } else {
                        captureEndValues(rVar);
                    }
                    rVar.f35134c.add(this);
                    capturePropagationValues(rVar);
                    addViewValues(z10 ? this.mStartValues : this.mEndValues, viewFindViewById, rVar);
                }
            }
            for (int i11 = 0; i11 < this.mTargets.size(); i11++) {
                View view = this.mTargets.get(i11);
                r rVar2 = new r(view);
                if (z10) {
                    captureStartValues(rVar2);
                } else {
                    captureEndValues(rVar2);
                }
                rVar2.f35134c.add(this);
                capturePropagationValues(rVar2);
                addViewValues(z10 ? this.mStartValues : this.mEndValues, view, rVar2);
            }
        } else {
            captureHierarchy(viewGroup, z10);
        }
        if (z10 || (aVar = this.mNameOverrides) == null) {
            return;
        }
        int i12 = aVar.f34737e;
        ArrayList arrayList3 = new ArrayList(i12);
        for (int i13 = 0; i13 < i12; i13++) {
            arrayList3.add(this.mStartValues.f35138d.remove(this.mNameOverrides.h(i13)));
        }
        for (int i14 = 0; i14 < i12; i14++) {
            View view2 = (View) arrayList3.get(i14);
            if (view2 != null) {
                this.mStartValues.f35138d.put(this.mNameOverrides.l(i14), view2);
            }
        }
    }

    public void clearValues(boolean z10) {
        s sVar;
        if (z10) {
            this.mStartValues.f35135a.clear();
            this.mStartValues.f35136b.clear();
            sVar = this.mStartValues;
        } else {
            this.mEndValues.f35135a.clear();
            this.mEndValues.f35136b.clear();
            sVar = this.mEndValues;
        }
        sVar.f35137c.b();
    }

    @Override // 
    public l clone() {
        try {
            l lVar = (l) super.clone();
            lVar.mAnimators = new ArrayList<>();
            lVar.mStartValues = new s();
            lVar.mEndValues = new s();
            lVar.mStartValuesList = null;
            lVar.mEndValuesList = null;
            return lVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator createAnimator(ViewGroup viewGroup, r rVar, r rVar2) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0043  */
    public void createAnimators(ViewGroup viewGroup, s sVar, s sVar2, ArrayList<r> arrayList, ArrayList<r> arrayList2) {
        Animator animatorCreateAnimator;
        int i10;
        int i11;
        View view;
        Animator animator;
        r rVar;
        Animator animator2;
        r rVar2;
        q.a<Animator, d> runningAnimators = getRunningAnimators();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long jMin = RecyclerView.FOREVER_NS;
        int i12 = 0;
        while (i12 < size) {
            r rVar3 = arrayList.get(i12);
            r rVar4 = arrayList2.get(i12);
            if (rVar3 != null && !rVar3.f35134c.contains(this)) {
                rVar3 = null;
            }
            if (rVar4 != null && !rVar4.f35134c.contains(this)) {
                rVar4 = null;
            }
            if (rVar3 == null && rVar4 == null) {
                i10 = size;
                i11 = i12;
            } else if (!(rVar3 == null || rVar4 == null || isTransitionRequired(rVar3, rVar4)) || (animatorCreateAnimator = createAnimator(viewGroup, rVar3, rVar4)) == null) {
                i10 = size;
                i11 = i12;
            } else {
                if (rVar4 != null) {
                    view = rVar4.f35133b;
                    String[] transitionProperties = getTransitionProperties();
                    if (transitionProperties != null && transitionProperties.length > 0) {
                        rVar2 = new r(view);
                        i10 = size;
                        r rVar5 = sVar2.f35135a.get(view);
                        if (rVar5 != null) {
                            int i13 = 0;
                            while (i13 < transitionProperties.length) {
                                rVar2.f35132a.put(transitionProperties[i13], rVar5.f35132a.get(transitionProperties[i13]));
                                i13++;
                                i12 = i12;
                                rVar5 = rVar5;
                            }
                        }
                        i11 = i12;
                        int i14 = runningAnimators.f34737e;
                        int i15 = 0;
                        while (true) {
                            if (i15 >= i14) {
                                animator2 = animatorCreateAnimator;
                                break;
                            }
                            d dVar = runningAnimators.get(runningAnimators.h(i15));
                            if (dVar.f35112c != null && dVar.f35110a == view && dVar.f35111b.equals(getName()) && dVar.f35112c.equals(rVar2)) {
                                animator2 = null;
                                break;
                            }
                            i15++;
                        }
                    } else {
                        i10 = size;
                        i11 = i12;
                        animator2 = animatorCreateAnimator;
                        rVar2 = null;
                    }
                    animator = animator2;
                    rVar = rVar2;
                } else {
                    i10 = size;
                    i11 = i12;
                    view = rVar3.f35133b;
                    animator = animatorCreateAnimator;
                    rVar = null;
                }
                if (animator != null) {
                    o oVar = this.mPropagation;
                    if (oVar != null) {
                        long jC = oVar.c(viewGroup, this, rVar3, rVar4);
                        sparseIntArray.put(this.mAnimators.size(), (int) jC);
                        jMin = Math.min(jC, jMin);
                    }
                    long j10 = jMin;
                    String name = getName();
                    a0 a0Var = u.f35140a;
                    runningAnimators.put(animator, new d(view, name, this, new c0(viewGroup), rVar));
                    this.mAnimators.add(animator);
                    jMin = j10;
                }
            }
            i12 = i11 + 1;
            size = i10;
        }
        if (sparseIntArray.size() != 0) {
            for (int i16 = 0; i16 < sparseIntArray.size(); i16++) {
                Animator animator3 = this.mAnimators.get(sparseIntArray.keyAt(i16));
                animator3.setStartDelay(animator3.getStartDelay() + (((long) sparseIntArray.valueAt(i16)) - jMin));
            }
        }
    }

    public void end() {
        int i10 = this.mNumInstances - 1;
        this.mNumInstances = i10;
        if (i10 == 0) {
            ArrayList<g> arrayList = this.mListeners;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((g) arrayList2.get(i11)).onTransitionEnd(this);
                }
            }
            for (int i12 = 0; i12 < this.mStartValues.f35137c.l(); i12++) {
                View viewM = this.mStartValues.f35137c.m(i12);
                if (viewM != null) {
                    WeakHashMap<View, m0> weakHashMap = e0.f34354a;
                    e0.d.r(viewM, false);
                }
            }
            for (int i13 = 0; i13 < this.mEndValues.f35137c.l(); i13++) {
                View viewM2 = this.mEndValues.f35137c.m(i13);
                if (viewM2 != null) {
                    WeakHashMap<View, m0> weakHashMap2 = e0.f34354a;
                    e0.d.r(viewM2, false);
                }
            }
            this.mEnded = true;
        }
    }

    public l excludeChildren(int i10, boolean z10) {
        this.mTargetIdChildExcludes = excludeId(this.mTargetIdChildExcludes, i10, z10);
        return this;
    }

    public l excludeChildren(View view, boolean z10) {
        this.mTargetChildExcludes = excludeView(this.mTargetChildExcludes, view, z10);
        return this;
    }

    public l excludeChildren(Class<?> cls, boolean z10) {
        this.mTargetTypeChildExcludes = excludeType(this.mTargetTypeChildExcludes, cls, z10);
        return this;
    }

    public l excludeTarget(int i10, boolean z10) {
        this.mTargetIdExcludes = excludeId(this.mTargetIdExcludes, i10, z10);
        return this;
    }

    public l excludeTarget(View view, boolean z10) {
        this.mTargetExcludes = excludeView(this.mTargetExcludes, view, z10);
        return this;
    }

    public l excludeTarget(Class<?> cls, boolean z10) {
        this.mTargetTypeExcludes = excludeType(this.mTargetTypeExcludes, cls, z10);
        return this;
    }

    public l excludeTarget(String str, boolean z10) {
        this.mTargetNameExcludes = excludeObject(this.mTargetNameExcludes, str, z10);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void forceToEnd(ViewGroup viewGroup) {
        q.a<Animator, d> runningAnimators = getRunningAnimators();
        int i10 = runningAnimators.f34737e;
        if (viewGroup == null || i10 == 0) {
            return;
        }
        a0 a0Var = u.f35140a;
        WindowId windowId = viewGroup.getWindowId();
        q.a aVar = new q.a(runningAnimators);
        runningAnimators.clear();
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            d dVar = (d) aVar.l(i11);
            if (dVar.f35110a != null) {
                d0 d0Var = dVar.f35113d;
                if ((d0Var instanceof c0) && ((c0) d0Var).f35077a.equals(windowId)) {
                    ((Animator) aVar.h(i11)).end();
                }
            }
        }
    }

    public long getDuration() {
        return this.mDuration;
    }

    public Rect getEpicenter() {
        f fVar = this.mEpicenterCallback;
        if (fVar == null) {
            return null;
        }
        return fVar.a(this);
    }

    public f getEpicenterCallback() {
        return this.mEpicenterCallback;
    }

    public TimeInterpolator getInterpolator() {
        return this.mInterpolator;
    }

    public r getMatchedTransitionValues(View view, boolean z10) {
        p pVar = this.mParent;
        if (pVar != null) {
            return pVar.getMatchedTransitionValues(view, z10);
        }
        ArrayList<r> arrayList = z10 ? this.mStartValuesList : this.mEndValuesList;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = -1;
        for (int i11 = 0; i11 < size; i11++) {
            r rVar = arrayList.get(i11);
            if (rVar == null) {
                return null;
            }
            if (rVar.f35133b == view) {
                i10 = i11;
                break;
            }
        }
        if (i10 >= 0) {
            return (z10 ? this.mEndValuesList : this.mStartValuesList).get(i10);
        }
        return null;
    }

    public String getName() {
        return this.mName;
    }

    public r1.g getPathMotion() {
        return this.mPathMotion;
    }

    public o getPropagation() {
        return this.mPropagation;
    }

    public long getStartDelay() {
        return this.mStartDelay;
    }

    public List<Integer> getTargetIds() {
        return this.mTargetIds;
    }

    public List<String> getTargetNames() {
        return this.mTargetNames;
    }

    public List<Class<?>> getTargetTypes() {
        return this.mTargetTypes;
    }

    public List<View> getTargets() {
        return this.mTargets;
    }

    public String[] getTransitionProperties() {
        return null;
    }

    public r getTransitionValues(View view, boolean z10) {
        p pVar = this.mParent;
        if (pVar != null) {
            return pVar.getTransitionValues(view, z10);
        }
        return (z10 ? this.mStartValues : this.mEndValues).f35135a.getOrDefault(view, null);
    }

    public boolean isTransitionRequired(r rVar, r rVar2) {
        if (rVar == null || rVar2 == null) {
            return false;
        }
        String[] transitionProperties = getTransitionProperties();
        if (transitionProperties == null) {
            Iterator<String> it = rVar.f35132a.keySet().iterator();
            while (it.hasNext()) {
                if (isValueChanged(rVar, rVar2, it.next())) {
                }
            }
            return false;
        }
        for (String str : transitionProperties) {
            if (!isValueChanged(rVar, rVar2, str)) {
            }
        }
        return false;
        return true;
    }

    public boolean isValidTarget(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id2 = view.getId();
        ArrayList<Integer> arrayList3 = this.mTargetIdExcludes;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id2))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.mTargetExcludes;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.mTargetTypeExcludes;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.mTargetTypeExcludes.get(i10).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.mTargetNameExcludes != null) {
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            if (e0.i.k(view) != null && this.mTargetNameExcludes.contains(e0.i.k(view))) {
                return false;
            }
        }
        if ((this.mTargetIds.size() == 0 && this.mTargets.size() == 0 && (((arrayList = this.mTargetTypes) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetNames) == null || arrayList2.isEmpty()))) || this.mTargetIds.contains(Integer.valueOf(id2)) || this.mTargets.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.mTargetNames;
        if (arrayList6 != null) {
            WeakHashMap<View, m0> weakHashMap2 = e0.f34354a;
            if (arrayList6.contains(e0.i.k(view))) {
                return true;
            }
        }
        if (this.mTargetTypes != null) {
            for (int i11 = 0; i11 < this.mTargetTypes.size(); i11++) {
                if (this.mTargetTypes.get(i11).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void pause(View view) {
        if (this.mEnded) {
            return;
        }
        for (int size = this.mCurrentAnimators.size() - 1; size >= 0; size--) {
            this.mCurrentAnimators.get(size).pause();
        }
        ArrayList<g> arrayList = this.mListeners;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
            int size2 = arrayList2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                ((g) arrayList2.get(i10)).onTransitionPause(this);
            }
        }
        this.mPaused = true;
    }

    public void playTransition(ViewGroup viewGroup) {
        d orDefault;
        this.mStartValuesList = new ArrayList<>();
        this.mEndValuesList = new ArrayList<>();
        matchStartAndEnd(this.mStartValues, this.mEndValues);
        q.a<Animator, d> runningAnimators = getRunningAnimators();
        int i10 = runningAnimators.f34737e;
        a0 a0Var = u.f35140a;
        WindowId windowId = viewGroup.getWindowId();
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            Animator animatorH = runningAnimators.h(i11);
            if (animatorH != null && (orDefault = runningAnimators.getOrDefault(animatorH, null)) != null && orDefault.f35110a != null) {
                d0 d0Var = orDefault.f35113d;
                boolean z10 = false;
                if ((d0Var instanceof c0) && ((c0) d0Var).f35077a.equals(windowId)) {
                    r rVar = orDefault.f35112c;
                    View view = orDefault.f35110a;
                    r transitionValues = getTransitionValues(view, true);
                    r matchedTransitionValues = getMatchedTransitionValues(view, true);
                    if (transitionValues == null && matchedTransitionValues == null) {
                        matchedTransitionValues = this.mEndValues.f35135a.get(view);
                    }
                    if ((transitionValues != null || matchedTransitionValues != null) && orDefault.f35114e.isTransitionRequired(rVar, matchedTransitionValues)) {
                        z10 = true;
                    }
                    if (z10) {
                        if (animatorH.isRunning() || animatorH.isStarted()) {
                            animatorH.cancel();
                        } else {
                            runningAnimators.remove(animatorH);
                        }
                    }
                }
            }
        }
        createAnimators(viewGroup, this.mStartValues, this.mEndValues, this.mStartValuesList, this.mEndValuesList);
        runAnimators();
    }

    public l removeListener(g gVar) {
        ArrayList<g> arrayList = this.mListeners;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(gVar);
        if (this.mListeners.size() == 0) {
            this.mListeners = null;
        }
        return this;
    }

    public l removeTarget(int i10) {
        if (i10 != 0) {
            this.mTargetIds.remove(Integer.valueOf(i10));
        }
        return this;
    }

    public l removeTarget(View view) {
        this.mTargets.remove(view);
        return this;
    }

    public l removeTarget(Class<?> cls) {
        ArrayList<Class<?>> arrayList = this.mTargetTypes;
        if (arrayList != null) {
            arrayList.remove(cls);
        }
        return this;
    }

    public l removeTarget(String str) {
        ArrayList<String> arrayList = this.mTargetNames;
        if (arrayList != null) {
            arrayList.remove(str);
        }
        return this;
    }

    public void resume(View view) {
        if (this.mPaused) {
            if (!this.mEnded) {
                for (int size = this.mCurrentAnimators.size() - 1; size >= 0; size--) {
                    this.mCurrentAnimators.get(size).resume();
                }
                ArrayList<g> arrayList = this.mListeners;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                    int size2 = arrayList2.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        ((g) arrayList2.get(i10)).onTransitionResume(this);
                    }
                }
            }
            this.mPaused = false;
        }
    }

    public void runAnimators() {
        start();
        q.a<Animator, d> runningAnimators = getRunningAnimators();
        for (Animator animator : this.mAnimators) {
            if (runningAnimators.containsKey(animator)) {
                start();
                runAnimator(animator, runningAnimators);
            }
        }
        this.mAnimators.clear();
        end();
    }

    public void setCanRemoveViews(boolean z10) {
        this.mCanRemoveViews = z10;
    }

    public l setDuration(long j10) {
        this.mDuration = j10;
        return this;
    }

    public void setEpicenterCallback(f fVar) {
        this.mEpicenterCallback = fVar;
    }

    public l setInterpolator(TimeInterpolator timeInterpolator) {
        this.mInterpolator = timeInterpolator;
        return this;
    }

    public void setMatchOrder(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.mMatchOrder = DEFAULT_MATCH_ORDER;
            return;
        }
        for (int i10 = 0; i10 < iArr.length; i10++) {
            if (!isValidMatch(iArr[i10])) {
                throw new IllegalArgumentException("matches contains invalid value");
            }
            if (alreadyContains(iArr, i10)) {
                throw new IllegalArgumentException("matches contains a duplicate value");
            }
        }
        this.mMatchOrder = (int[]) iArr.clone();
    }

    public void setPathMotion(r1.g gVar) {
        if (gVar == null) {
            gVar = STRAIGHT_PATH_MOTION;
        }
        this.mPathMotion = gVar;
    }

    public void setPropagation(o oVar) {
        this.mPropagation = oVar;
    }

    public l setStartDelay(long j10) {
        this.mStartDelay = j10;
        return this;
    }

    public void start() {
        if (this.mNumInstances == 0) {
            ArrayList<g> arrayList = this.mListeners;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((g) arrayList2.get(i10)).onTransitionStart(this);
                }
            }
            this.mEnded = false;
        }
        this.mNumInstances++;
    }

    public String toString() {
        return toString("");
    }

    public String toString(String str) {
        StringBuilder sbA = defpackage.a.a(str);
        sbA.append(getClass().getSimpleName());
        sbA.append("@");
        sbA.append(Integer.toHexString(hashCode()));
        sbA.append(": ");
        String string = sbA.toString();
        if (this.mDuration != -1) {
            string = android.support.v4.media.session.e.a(android.support.v4.media.c.a(string, "dur("), this.mDuration, ") ");
        }
        if (this.mStartDelay != -1) {
            string = android.support.v4.media.session.e.a(android.support.v4.media.c.a(string, "dly("), this.mStartDelay, ") ");
        }
        if (this.mInterpolator != null) {
            StringBuilder sbA2 = android.support.v4.media.c.a(string, "interp(");
            sbA2.append(this.mInterpolator);
            sbA2.append(") ");
            string = sbA2.toString();
        }
        if (this.mTargetIds.size() <= 0 && this.mTargets.size() <= 0) {
            return string;
        }
        String strA = i.f.a(string, "tgts(");
        if (this.mTargetIds.size() > 0) {
            for (int i10 = 0; i10 < this.mTargetIds.size(); i10++) {
                if (i10 > 0) {
                    strA = i.f.a(strA, ", ");
                }
                StringBuilder sbA3 = defpackage.a.a(strA);
                sbA3.append(this.mTargetIds.get(i10));
                strA = sbA3.toString();
            }
        }
        if (this.mTargets.size() > 0) {
            for (int i11 = 0; i11 < this.mTargets.size(); i11++) {
                if (i11 > 0) {
                    strA = i.f.a(strA, ", ");
                }
                StringBuilder sbA4 = defpackage.a.a(strA);
                sbA4.append(this.mTargets.get(i11));
                strA = sbA4.toString();
            }
        }
        return i.f.a(strA, ")");
    }
}
