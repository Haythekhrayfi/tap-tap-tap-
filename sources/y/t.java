package y;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.developer.filepicker.model.DialogConfigs;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.inscode.autoclicker.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f37853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z.f f37854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f37855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList<b> f37856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f37857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList<b> f37858f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SparseArray<androidx.constraintlayout.widget.c> f37859g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public HashMap<String, Integer> f37860h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SparseIntArray f37861i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f37862j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f37863k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public MotionEvent f37864l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f37865m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f37866n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public r.h f37867o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f37868p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a0 f37869q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f37870r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f37871s;

    public class a implements Interpolator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t.c f37872a;

        public a(t.c cVar) {
            this.f37872a = cVar;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            return (float) this.f37872a.a(f10);
        }
    }

    public t(Context context, r rVar, int i10) {
        this.f37854b = null;
        this.f37855c = null;
        this.f37856d = new ArrayList<>();
        this.f37857e = null;
        this.f37858f = new ArrayList<>();
        this.f37859g = new SparseArray<>();
        this.f37860h = new HashMap<>();
        this.f37861i = new SparseIntArray();
        this.f37862j = 400;
        this.f37863k = 0;
        this.f37865m = false;
        this.f37866n = false;
        this.f37853a = rVar;
        this.f37869q = new a0(rVar);
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            int eventType = xml.getEventType();
            b bVar = null;
            while (true) {
                boolean z10 = true;
                if (eventType != 1) {
                    if (eventType == 0) {
                        xml.getName();
                    } else if (eventType == 2) {
                        switch (xml.getName()) {
                            case "MotionScene":
                                m(context, xml);
                                break;
                            case "Transition":
                                ArrayList<b> arrayList = this.f37856d;
                                bVar = new b(this, context, xml);
                                arrayList.add(bVar);
                                if (this.f37855c == null && !bVar.f37874b) {
                                    this.f37855c = bVar;
                                    x xVar = bVar.f37884l;
                                    if (xVar != null) {
                                        xVar.c(this.f37868p);
                                    }
                                }
                                if (bVar.f37874b) {
                                    if (bVar.f37875c == -1) {
                                        this.f37857e = bVar;
                                    } else {
                                        this.f37858f.add(bVar);
                                    }
                                    this.f37856d.remove(bVar);
                                    break;
                                } else {
                                    break;
                                }
                                break;
                            case "OnSwipe":
                                if (bVar == null) {
                                    Log.v("MotionScene", " OnSwipe (" + context.getResources().getResourceEntryName(i10) + ".xml:" + xml.getLineNumber() + ")");
                                }
                                if (bVar != null) {
                                    bVar.f37884l = new x(context, this.f37853a, xml);
                                    break;
                                } else {
                                    break;
                                }
                                break;
                            case "OnClick":
                                if (bVar != null) {
                                    bVar.f37885m.add(new b.a(context, bVar, xml));
                                    break;
                                } else {
                                    break;
                                }
                                break;
                            case "StateSet":
                                this.f37854b = new z.f(context, xml);
                                break;
                            case "ConstraintSet":
                                j(context, xml);
                                break;
                            case "include":
                            case "Include":
                                l(context, xml);
                                break;
                            case "KeyFrameSet":
                                g gVar = new g(context, xml);
                                if (bVar != null) {
                                    bVar.f37883k.add(gVar);
                                    break;
                                } else {
                                    break;
                                }
                                break;
                            case "ViewTransition":
                                z zVar = new z(context, xml);
                                a0 a0Var = this.f37869q;
                                a0Var.f37605b.add(zVar);
                                a0Var.f37606c = null;
                                int i11 = zVar.f37935b;
                                if (i11 != 4) {
                                    if (i11 == 5) {
                                        z10 = false;
                                    }
                                    break;
                                }
                                a0Var.a(zVar, z10);
                                break;
                        }
                    }
                    eventType = xml.next();
                }
                this.f37859g.put(R.id.motion_base, new androidx.constraintlayout.widget.c());
                this.f37860h.put("motion_base", Integer.valueOf(R.id.motion_base));
                return;
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    public t(r rVar) {
        this.f37854b = null;
        this.f37855c = null;
        this.f37856d = new ArrayList<>();
        this.f37857e = null;
        this.f37858f = new ArrayList<>();
        this.f37859g = new SparseArray<>();
        this.f37860h = new HashMap<>();
        this.f37861i = new SparseIntArray();
        this.f37862j = 400;
        this.f37863k = 0;
        this.f37865m = false;
        this.f37866n = false;
        this.f37853a = rVar;
        this.f37869q = new a0(rVar);
    }

    public boolean a(r rVar, int i10) {
        b bVar;
        int i11;
        int i12;
        if (this.f37867o != null) {
            return false;
        }
        for (b bVar2 : this.f37856d) {
            if (bVar2.f37886n != 0 && ((bVar = this.f37855c) != bVar2 || !bVar.a(2))) {
                if (i10 == bVar2.f37876d && ((i12 = bVar2.f37886n) == 4 || i12 == 2)) {
                    r.l lVar = r.l.FINISHED;
                    rVar.setState(lVar);
                    rVar.setTransition(bVar2);
                    if (bVar2.f37886n == 4) {
                        rVar.q();
                        rVar.setState(r.l.SETUP);
                        rVar.setState(r.l.MOVING);
                    } else {
                        rVar.setProgress(1.0f);
                        rVar.d(true);
                        rVar.setState(r.l.SETUP);
                        rVar.setState(r.l.MOVING);
                        rVar.setState(lVar);
                        rVar.k();
                    }
                    return true;
                }
                if (i10 == bVar2.f37875c && ((i11 = bVar2.f37886n) == 3 || i11 == 1)) {
                    r.l lVar2 = r.l.FINISHED;
                    rVar.setState(lVar2);
                    rVar.setTransition(bVar2);
                    if (bVar2.f37886n == 3) {
                        rVar.b(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                        rVar.setState(r.l.SETUP);
                        rVar.setState(r.l.MOVING);
                    } else {
                        rVar.setProgress(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                        rVar.d(true);
                        rVar.setState(r.l.SETUP);
                        rVar.setState(r.l.MOVING);
                        rVar.setState(lVar2);
                        rVar.k();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public androidx.constraintlayout.widget.c b(int i10) {
        androidx.constraintlayout.widget.c cVar;
        int iA;
        z.f fVar = this.f37854b;
        if (fVar != null && (iA = fVar.a(i10, -1, -1)) != -1) {
            i10 = iA;
        }
        if (this.f37859g.get(i10) == null) {
            StringBuilder sbA = defpackage.a.a("Warning could not find ConstraintSet id/");
            sbA.append(y.a.c(this.f37853a.getContext(), i10));
            sbA.append(" In MotionScene");
            Log.e("MotionScene", sbA.toString());
            SparseArray<androidx.constraintlayout.widget.c> sparseArray = this.f37859g;
            cVar = sparseArray.get(sparseArray.keyAt(0));
        } else {
            cVar = this.f37859g.get(i10);
        }
        return cVar;
    }

    public int c() {
        b bVar = this.f37855c;
        return bVar != null ? bVar.f37880h : this.f37862j;
    }

    public int d() {
        b bVar = this.f37855c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f37875c;
    }

    public final int e(Context context, String str) {
        int identifier;
        if (str.contains(DialogConfigs.DIRECTORY_SEPERATOR)) {
            identifier = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), FacebookMediationAdapter.KEY_ID, context.getPackageName());
        } else {
            identifier = -1;
        }
        if (identifier != -1) {
            return identifier;
        }
        if (str.length() > 1) {
            return Integer.parseInt(str.substring(1));
        }
        Log.e("MotionScene", "error in parsing id");
        return identifier;
    }

    public Interpolator f() {
        b bVar = this.f37855c;
        int i10 = bVar.f37877e;
        if (i10 == -2) {
            return AnimationUtils.loadInterpolator(this.f37853a.getContext(), this.f37855c.f37879g);
        }
        if (i10 == -1) {
            return new a(t.c.c(bVar.f37878f));
        }
        if (i10 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i10 == 1) {
            return new AccelerateInterpolator();
        }
        if (i10 == 2) {
            return new DecelerateInterpolator();
        }
        if (i10 == 4) {
            return new BounceInterpolator();
        }
        if (i10 == 5) {
            return new OvershootInterpolator();
        }
        if (i10 != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    public void g(n nVar) {
        b bVar = this.f37855c;
        if (bVar != null) {
            Iterator<g> it = bVar.f37883k.iterator();
            while (it.hasNext()) {
                it.next().a(nVar);
            }
        } else {
            b bVar2 = this.f37857e;
            if (bVar2 != null) {
                Iterator<g> it2 = bVar2.f37883k.iterator();
                while (it2.hasNext()) {
                    it2.next().a(nVar);
                }
            }
        }
    }

    public float h() {
        x xVar;
        b bVar = this.f37855c;
        return (bVar == null || (xVar = bVar.f37884l) == null) ? StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD : xVar.f37928v;
    }

    public int i() {
        b bVar = this.f37855c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f37876d;
    }

    public final int j(Context context, XmlPullParser xmlPullParser) {
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.f1508e = false;
        int attributeCount = xmlPullParser.getAttributeCount();
        int iE = -1;
        int iE2 = -1;
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            Objects.requireNonNull(attributeName);
            switch (attributeName) {
                case "deriveConstraintsFrom":
                    iE2 = e(context, attributeValue);
                    break;
                case "constraintRotate":
                    try {
                        cVar.f1506c = Integer.parseInt(attributeValue);
                        break;
                    } catch (NumberFormatException unused) {
                        Objects.requireNonNull(attributeValue);
                        switch (attributeValue) {
                            case "x_left":
                                cVar.f1506c = 4;
                                break;
                            case "left":
                                cVar.f1506c = 2;
                                break;
                            case "none":
                                cVar.f1506c = 0;
                                break;
                            case "right":
                                cVar.f1506c = 1;
                                break;
                            case "x_right":
                                cVar.f1506c = 3;
                                break;
                        }
                    }
                    break;
                case "id":
                    iE = e(context, attributeValue);
                    HashMap<String, Integer> map = this.f37860h;
                    int iIndexOf = attributeValue.indexOf(47);
                    if (iIndexOf >= 0) {
                        attributeValue = attributeValue.substring(iIndexOf + 1);
                    }
                    map.put(attributeValue, Integer.valueOf(iE));
                    cVar.f1504a = y.a.c(context, iE);
                    break;
            }
        }
        if (iE != -1) {
            int i11 = this.f37853a.f37795w;
            cVar.k(context, xmlPullParser);
            if (iE2 != -1) {
                this.f37861i.put(iE, iE2);
            }
            this.f37859g.put(iE, cVar);
        }
        return iE;
    }

    public final int k(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return j(context, xml);
                }
            }
            return -1;
        } catch (IOException e10) {
            e10.printStackTrace();
            return -1;
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
            return -1;
        }
    }

    public final void l(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), z.d.f44959z);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                k(context, typedArrayObtainStyledAttributes.getResourceId(index, -1));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void m(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), z.d.f44949p);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                int i11 = typedArrayObtainStyledAttributes.getInt(index, this.f37862j);
                this.f37862j = i11;
                if (i11 < 8) {
                    this.f37862j = 8;
                }
            } else if (index == 1) {
                this.f37863k = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void n(int i10, r rVar) {
        androidx.constraintlayout.widget.c cVar = this.f37859g.get(i10);
        cVar.f1505b = cVar.f1504a;
        int i11 = this.f37861i.get(i10);
        if (i11 > 0) {
            n(i11, rVar);
            androidx.constraintlayout.widget.c cVar2 = this.f37859g.get(i11);
            if (cVar2 == null) {
                StringBuilder sbA = defpackage.a.a("ERROR! invalid deriveConstraintsFrom: @id/");
                sbA.append(y.a.c(this.f37853a.getContext(), i11));
                Log.e("MotionScene", sbA.toString());
                return;
            }
            cVar.f1505b += DialogConfigs.DIRECTORY_SEPERATOR + cVar2.f1505b;
            for (Integer num : cVar2.f1509f.keySet()) {
                int iIntValue = num.intValue();
                androidx.constraintlayout.widget.c.a aVar = cVar2.f1509f.get(num);
                if (!cVar.f1509f.containsKey(Integer.valueOf(iIntValue))) {
                    cVar.f1509f.put(Integer.valueOf(iIntValue), new androidx.constraintlayout.widget.c.a());
                }
                androidx.constraintlayout.widget.c.a aVar2 = cVar.f1509f.get(Integer.valueOf(iIntValue));
                if (aVar2 != null) {
                    androidx.constraintlayout.widget.c.b bVar = aVar2.f1514e;
                    if (!bVar.f1533b) {
                        bVar.a(aVar.f1514e);
                    }
                    androidx.constraintlayout.widget.c.d dVar = aVar2.f1512c;
                    if (!dVar.f1588a) {
                        dVar.a(aVar.f1512c);
                    }
                    androidx.constraintlayout.widget.c.e eVar = aVar2.f1515f;
                    if (!eVar.f1594a) {
                        eVar.a(aVar.f1515f);
                    }
                    androidx.constraintlayout.widget.c.C0027c c0027c = aVar2.f1513d;
                    if (!c0027c.f1574a) {
                        c0027c.a(aVar.f1513d);
                    }
                    for (String str : aVar.f1516g.keySet()) {
                        if (!aVar2.f1516g.containsKey(str)) {
                            aVar2.f1516g.put(str, aVar.f1516g.get(str));
                        }
                    }
                }
            }
        } else {
            cVar.f1505b = androidx.activity.k.a(new StringBuilder(), cVar.f1505b, "  layout");
            int childCount = rVar.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = rVar.getChildAt(i12);
                ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                int id2 = childAt.getId();
                if (cVar.f1508e && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (!cVar.f1509f.containsKey(Integer.valueOf(id2))) {
                    cVar.f1509f.put(Integer.valueOf(id2), new androidx.constraintlayout.widget.c.a());
                }
                androidx.constraintlayout.widget.c.a aVar3 = cVar.f1509f.get(Integer.valueOf(id2));
                if (aVar3 != null) {
                    if (!aVar3.f1514e.f1533b) {
                        aVar3.c(id2, bVar2);
                        if (childAt instanceof androidx.constraintlayout.widget.b) {
                            aVar3.f1514e.f1550j0 = ((androidx.constraintlayout.widget.b) childAt).getReferencedIds();
                            if (childAt instanceof Barrier) {
                                Barrier barrier = (Barrier) childAt;
                                aVar3.f1514e.f1560o0 = barrier.getAllowsGoneWidget();
                                aVar3.f1514e.f1544g0 = barrier.getType();
                                aVar3.f1514e.f1546h0 = barrier.getMargin();
                            }
                        }
                        aVar3.f1514e.f1533b = true;
                    }
                    androidx.constraintlayout.widget.c.d dVar2 = aVar3.f1512c;
                    if (!dVar2.f1588a) {
                        dVar2.f1589b = childAt.getVisibility();
                        aVar3.f1512c.f1591d = childAt.getAlpha();
                        aVar3.f1512c.f1588a = true;
                    }
                    androidx.constraintlayout.widget.c.e eVar2 = aVar3.f1515f;
                    if (!eVar2.f1594a) {
                        eVar2.f1594a = true;
                        eVar2.f1595b = childAt.getRotation();
                        aVar3.f1515f.f1596c = childAt.getRotationX();
                        aVar3.f1515f.f1597d = childAt.getRotationY();
                        aVar3.f1515f.f1598e = childAt.getScaleX();
                        aVar3.f1515f.f1599f = childAt.getScaleY();
                        float pivotX = childAt.getPivotX();
                        float pivotY = childAt.getPivotY();
                        if (pivotX != 0.0d || pivotY != 0.0d) {
                            androidx.constraintlayout.widget.c.e eVar3 = aVar3.f1515f;
                            eVar3.f1600g = pivotX;
                            eVar3.f1601h = pivotY;
                        }
                        aVar3.f1515f.f1603j = childAt.getTranslationX();
                        aVar3.f1515f.f1604k = childAt.getTranslationY();
                        aVar3.f1515f.f1605l = childAt.getTranslationZ();
                        androidx.constraintlayout.widget.c.e eVar4 = aVar3.f1515f;
                        if (eVar4.f1606m) {
                            eVar4.f1607n = childAt.getElevation();
                        }
                    }
                }
            }
        }
        for (androidx.constraintlayout.widget.c.a aVar4 : cVar.f1509f.values()) {
            if (aVar4.f1517h != null) {
                if (aVar4.f1511b != null) {
                    Iterator<Integer> it = cVar.f1509f.keySet().iterator();
                    while (it.hasNext()) {
                        androidx.constraintlayout.widget.c.a aVarI = cVar.i(it.next().intValue());
                        String str2 = aVarI.f1514e.f1554l0;
                        if (str2 != null && aVar4.f1511b.matches(str2)) {
                            aVar4.f1517h.e(aVarI);
                            aVarI.f1516g.putAll((HashMap) aVar4.f1516g.clone());
                        }
                    }
                } else {
                    aVar4.f1517h.e(cVar.i(aVar4.f1510a));
                }
            }
        }
    }

    public void o(r rVar) {
        boolean z10;
        for (int i10 = 0; i10 < this.f37859g.size(); i10++) {
            int iKeyAt = this.f37859g.keyAt(i10);
            int i11 = this.f37861i.get(iKeyAt);
            int size = this.f37861i.size();
            while (true) {
                if (i11 <= 0) {
                    z10 = false;
                    break;
                }
                if (i11 != iKeyAt) {
                    int i12 = size - 1;
                    if (size >= 0) {
                        i11 = this.f37861i.get(i11);
                        size = i12;
                    }
                }
                z10 = true;
                break;
            }
            if (z10) {
                Log.e("MotionScene", "Cannot be derived from yourself");
                return;
            }
            n(iKeyAt, rVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0031  */
    /* JADX WARN: Code duplicated, block: B:32:0x004b  */
    /* JADX WARN: Code duplicated, block: B:37:0x005f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    public void p(int i10, int i11) {
        int iA;
        int iA2;
        b bVar;
        Iterator<b> it;
        b bVar2;
        b bVar3;
        b next;
        int i12;
        x xVar;
        z.f fVar = this.f37854b;
        if (fVar != null) {
            iA = fVar.a(i10, -1, -1);
            if (iA == -1) {
                iA = i10;
            }
            iA2 = this.f37854b.a(i11, -1, -1);
            if (iA2 == -1) {
            }
            bVar = this.f37855c;
            if (bVar == null && bVar.f37875c == i11 && bVar.f37876d == i10) {
                return;
            }
            it = this.f37856d.iterator();
            while (true) {
                if (it.hasNext()) {
                    bVar2 = this.f37857e;
                    for (b bVar4 : this.f37858f) {
                        if (bVar4.f37875c == i11) {
                            bVar2 = bVar4;
                        }
                    }
                    bVar3 = new b(this, bVar2);
                    bVar3.f37876d = iA;
                    bVar3.f37875c = iA2;
                    if (iA != -1) {
                        this.f37856d.add(bVar3);
                    }
                    this.f37855c = bVar3;
                    return;
                }
                next = it.next();
                i12 = next.f37875c;
                if ((i12 != iA2 && next.f37876d == iA) || (i12 == i11 && next.f37876d == i10)) {
                    break;
                }
            }
            this.f37855c = next;
            xVar = next.f37884l;
            if (xVar != null) {
                xVar.c(this.f37868p);
            }
        }
        iA = i10;
        iA2 = i11;
        bVar = this.f37855c;
        if (bVar == null) {
        }
        it = this.f37856d.iterator();
        while (true) {
            if (it.hasNext()) {
                bVar2 = this.f37857e;
                while (r3.hasNext()) {
                    if (bVar4.f37875c == i11) {
                        bVar2 = bVar4;
                    }
                }
                bVar3 = new b(this, bVar2);
                bVar3.f37876d = iA;
                bVar3.f37875c = iA2;
                if (iA != -1) {
                    this.f37856d.add(bVar3);
                }
                this.f37855c = bVar3;
                return;
            }
            next = it.next();
            i12 = next.f37875c;
            if (i12 != iA2) {
            }
        }
        this.f37855c = next;
        xVar = next.f37884l;
        if (xVar != null) {
            xVar.c(this.f37868p);
        }
    }

    public boolean q() {
        Iterator<b> it = this.f37856d.iterator();
        while (it.hasNext()) {
            if (it.next().f37884l != null) {
                return true;
            }
        }
        b bVar = this.f37855c;
        return (bVar == null || bVar.f37884l == null) ? false : true;
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f37873a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f37874b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f37875c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f37876d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f37877e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f37878f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f37879g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f37880h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f37881i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final t f37882j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public ArrayList<g> f37883k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public x f37884l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public ArrayList<a> f37885m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f37886n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f37887o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f37888p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f37889q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f37890r;

        public static class a implements View.OnClickListener {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final b f37891c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f37892d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f37893e;

            public a(Context context, b bVar, XmlPullParser xmlPullParser) {
                this.f37892d = -1;
                this.f37893e = 17;
                this.f37891c = bVar;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), z.d.f44950q);
                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                for (int i10 = 0; i10 < indexCount; i10++) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i10);
                    if (index == 1) {
                        this.f37892d = typedArrayObtainStyledAttributes.getResourceId(index, this.f37892d);
                    } else if (index == 0) {
                        this.f37893e = typedArrayObtainStyledAttributes.getInt(index, this.f37893e);
                    }
                }
                typedArrayObtainStyledAttributes.recycle();
            }

            public a(b bVar, int i10, int i11) {
                this.f37892d = -1;
                this.f37893e = 17;
                this.f37891c = bVar;
                this.f37892d = i10;
                this.f37893e = i11;
            }

            public void a(r rVar, int i10, b bVar) {
                boolean z10;
                View viewFindViewById;
                int i11 = this.f37892d;
                View view = rVar;
                if (i11 != -1) {
                    viewFindViewById = rVar.findViewById(i11);
                }
                if (view == null) {
                    view = viewFindViewById;
                    StringBuilder sbA = defpackage.a.a("OnClick could not find id ");
                    sbA.append(this.f37892d);
                    Log.e("MotionScene", sbA.toString());
                    return;
                }
                int i12 = bVar.f37876d;
                int i13 = bVar.f37875c;
                if (i12 == -1) {
                    view = viewFindViewById;
                    view.setOnClickListener(this);
                    return;
                }
                int i14 = this.f37893e;
                int i15 = i14 & 1;
                boolean z11 = false;
                if (i15 == 0 || i10 != i12) {
                    view = viewFindViewById;
                    z10 = false;
                } else {
                    z10 = true;
                }
                boolean z12 = (i15 != 0 && i10 == i12) | z10 | ((i14 & 256) != 0 && i10 == i12) | ((i14 & 16) != 0 && i10 == i13);
                if ((i14 & 4096) != 0 && i10 == i13) {
                    z11 = true;
                }
                if (z12 || z11) {
                    view.setOnClickListener(this);
                }
            }

            public void b(r rVar) {
                int i10 = this.f37892d;
                if (i10 == -1) {
                    return;
                }
                View viewFindViewById = rVar.findViewById(i10);
                if (viewFindViewById != null) {
                    viewFindViewById.setOnClickListener(null);
                    return;
                }
                StringBuilder sbA = defpackage.a.a(" (*)  could not find id ");
                sbA.append(this.f37892d);
                Log.e("MotionScene", sbA.toString());
            }

            /* JADX WARN: Code duplicated, block: B:50:0x008e  */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                b bVar = this.f37891c;
                t tVar = bVar.f37882j;
                r rVar = tVar.f37853a;
                if (rVar.f37778l) {
                    if (bVar.f37876d == -1) {
                        int currentState = rVar.getCurrentState();
                        if (currentState == -1) {
                            rVar.r(this.f37891c.f37875c);
                            return;
                        }
                        b bVar2 = this.f37891c;
                        b bVar3 = new b(bVar2.f37882j, bVar2);
                        bVar3.f37876d = currentState;
                        bVar3.f37875c = this.f37891c.f37875c;
                        rVar.setTransition(bVar3);
                        rVar.q();
                        return;
                    }
                    b bVar4 = tVar.f37855c;
                    int i10 = this.f37893e;
                    boolean z10 = false;
                    boolean z11 = ((i10 & 1) == 0 && (i10 & 256) == 0) ? false : true;
                    boolean z12 = ((i10 & 16) == 0 && (i10 & 4096) == 0) ? false : true;
                    if (z11 && z12) {
                        if (bVar4 != bVar) {
                            rVar.setTransition(bVar);
                        }
                        if (rVar.getCurrentState() == rVar.getEndState() || rVar.getProgress() > 0.5f) {
                            z11 = false;
                        } else {
                            z12 = false;
                        }
                    }
                    b bVar5 = this.f37891c;
                    if (bVar5 == bVar4) {
                        z10 = true;
                    } else {
                        int i11 = bVar5.f37875c;
                        int i12 = bVar5.f37876d;
                        int i13 = rVar.f37770h;
                        if (i12 != -1 ? i13 == i12 || i13 == i11 : i13 != i11) {
                            z10 = true;
                        }
                    }
                    if (z10) {
                        if (z11 && (this.f37893e & 1) != 0) {
                            rVar.setTransition(bVar5);
                            rVar.q();
                            return;
                        }
                        if (z12 && (this.f37893e & 16) != 0) {
                            rVar.setTransition(bVar5);
                            rVar.b(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                        } else if (z11 && (this.f37893e & 256) != 0) {
                            rVar.setTransition(bVar5);
                            rVar.setProgress(1.0f);
                        } else {
                            if (!z12 || (this.f37893e & 4096) == 0) {
                                return;
                            }
                            rVar.setTransition(bVar5);
                            rVar.setProgress(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                        }
                    }
                }
            }
        }

        public b(int i10, t tVar, int i11, int i12) {
            this.f37873a = -1;
            this.f37874b = false;
            this.f37875c = -1;
            this.f37876d = -1;
            this.f37877e = 0;
            this.f37878f = null;
            this.f37879g = -1;
            this.f37880h = 400;
            this.f37881i = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            this.f37883k = new ArrayList<>();
            this.f37884l = null;
            this.f37885m = new ArrayList<>();
            this.f37886n = 0;
            this.f37887o = false;
            this.f37888p = -1;
            this.f37889q = 0;
            this.f37890r = 0;
            this.f37873a = i10;
            this.f37882j = tVar;
            this.f37876d = i11;
            this.f37875c = i12;
            this.f37880h = tVar.f37862j;
            this.f37889q = tVar.f37863k;
        }

        public boolean a(int i10) {
            return (i10 & this.f37890r) != 0;
        }

        public b(t tVar, Context context, XmlPullParser xmlPullParser) {
            int integer;
            androidx.constraintlayout.widget.c cVar;
            SparseArray<androidx.constraintlayout.widget.c> sparseArray;
            int i10;
            this.f37873a = -1;
            this.f37874b = false;
            this.f37875c = -1;
            this.f37876d = -1;
            this.f37877e = 0;
            this.f37878f = null;
            this.f37879g = -1;
            this.f37880h = 400;
            this.f37881i = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            this.f37883k = new ArrayList<>();
            this.f37884l = null;
            this.f37885m = new ArrayList<>();
            this.f37886n = 0;
            this.f37887o = false;
            this.f37888p = -1;
            this.f37889q = 0;
            this.f37890r = 0;
            this.f37880h = tVar.f37862j;
            this.f37889q = tVar.f37863k;
            this.f37882j = tVar;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), z.d.f44956w);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == 2) {
                    this.f37875c = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f37875c);
                    if ("layout".equals(resourceTypeName)) {
                        cVar = new androidx.constraintlayout.widget.c();
                        cVar.j(context, this.f37875c);
                        sparseArray = tVar.f37859g;
                        i10 = this.f37875c;
                        sparseArray.append(i10, cVar);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.f37875c = tVar.k(context, this.f37875c);
                    }
                } else if (index == 3) {
                    this.f37876d = typedArrayObtainStyledAttributes.getResourceId(index, this.f37876d);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.f37876d);
                    if ("layout".equals(resourceTypeName2)) {
                        cVar = new androidx.constraintlayout.widget.c();
                        cVar.j(context, this.f37876d);
                        sparseArray = tVar.f37859g;
                        i10 = this.f37876d;
                        sparseArray.append(i10, cVar);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.f37876d = tVar.k(context, this.f37876d);
                    }
                } else if (index == 6) {
                    int i12 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    if (i12 == 1) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.f37879g = resourceId;
                        if (resourceId != -1) {
                            this.f37877e = -2;
                        }
                    } else {
                        if (i12 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.f37878f = string;
                            if (string != null) {
                                if (string.indexOf(DialogConfigs.DIRECTORY_SEPERATOR) > 0) {
                                    this.f37879g = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                    this.f37877e = -2;
                                } else {
                                    integer = -1;
                                }
                            }
                        } else {
                            integer = typedArrayObtainStyledAttributes.getInteger(index, this.f37877e);
                        }
                        this.f37877e = integer;
                    }
                } else if (index == 4) {
                    int i13 = typedArrayObtainStyledAttributes.getInt(index, this.f37880h);
                    this.f37880h = i13;
                    if (i13 < 8) {
                        this.f37880h = 8;
                    }
                } else if (index == 8) {
                    this.f37881i = typedArrayObtainStyledAttributes.getFloat(index, this.f37881i);
                } else if (index == 1) {
                    this.f37886n = typedArrayObtainStyledAttributes.getInteger(index, this.f37886n);
                } else if (index == 0) {
                    this.f37873a = typedArrayObtainStyledAttributes.getResourceId(index, this.f37873a);
                } else if (index == 9) {
                    this.f37887o = typedArrayObtainStyledAttributes.getBoolean(index, this.f37887o);
                } else if (index == 7) {
                    this.f37888p = typedArrayObtainStyledAttributes.getInteger(index, -1);
                } else if (index == 5) {
                    this.f37889q = typedArrayObtainStyledAttributes.getInteger(index, 0);
                } else if (index == 10) {
                    this.f37890r = typedArrayObtainStyledAttributes.getInteger(index, 0);
                }
            }
            if (this.f37876d == -1) {
                this.f37874b = true;
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public b(t tVar, b bVar) {
            this.f37873a = -1;
            this.f37874b = false;
            this.f37875c = -1;
            this.f37876d = -1;
            this.f37877e = 0;
            this.f37878f = null;
            this.f37879g = -1;
            this.f37880h = 400;
            this.f37881i = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            this.f37883k = new ArrayList<>();
            this.f37884l = null;
            this.f37885m = new ArrayList<>();
            this.f37886n = 0;
            this.f37887o = false;
            this.f37888p = -1;
            this.f37889q = 0;
            this.f37890r = 0;
            this.f37882j = tVar;
            this.f37880h = tVar.f37862j;
            if (bVar != null) {
                this.f37888p = bVar.f37888p;
                this.f37877e = bVar.f37877e;
                this.f37878f = bVar.f37878f;
                this.f37879g = bVar.f37879g;
                this.f37880h = bVar.f37880h;
                this.f37883k = bVar.f37883k;
                this.f37881i = bVar.f37881i;
                this.f37889q = bVar.f37889q;
            }
        }
    }
}
