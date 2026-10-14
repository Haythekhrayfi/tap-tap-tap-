package y;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.developer.filepicker.model.DialogConfigs;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.inscode.autoclicker.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37934a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f37938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g f37939f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public androidx.constraintlayout.widget.c.a f37940g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f37943j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f37944k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Context f37948o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f37935b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f37936c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f37937d = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f37941h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f37942i = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f37945l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f37946m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f37947n = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f37949p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f37950q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f37951r = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f37952s = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f37953t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f37954u = -1;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f37955a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f37956b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public n f37957c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f37958d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public a0 f37960f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Interpolator f37961g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f37963i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f37964j;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f37967m;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public t.d f37959e = new t.d();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f37962h = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Rect f37966l = new Rect();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f37965k = System.nanoTime();

        public a(a0 a0Var, n nVar, int i10, int i11, int i12, Interpolator interpolator, int i13, int i14) {
            this.f37967m = false;
            this.f37960f = a0Var;
            this.f37957c = nVar;
            this.f37958d = i11;
            a0 a0Var2 = this.f37960f;
            if (a0Var2.f37608e == null) {
                a0Var2.f37608e = new ArrayList<>();
            }
            a0Var2.f37608e.add(this);
            this.f37961g = interpolator;
            this.f37955a = i13;
            this.f37956b = i14;
            if (i12 == 3) {
                this.f37967m = true;
            }
            this.f37964j = i10 == 0 ? Float.MAX_VALUE : 1.0f / i10;
            a();
        }

        public void a() {
            if (this.f37962h) {
                long jNanoTime = System.nanoTime();
                long j10 = jNanoTime - this.f37965k;
                this.f37965k = jNanoTime;
                float f10 = this.f37963i - (((float) (j10 * 1.0E-6d)) * this.f37964j);
                this.f37963i = f10;
                if (f10 < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                    this.f37963i = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                }
                Interpolator interpolator = this.f37961g;
                float interpolation = interpolator == null ? this.f37963i : interpolator.getInterpolation(this.f37963i);
                n nVar = this.f37957c;
                boolean zC = nVar.c(nVar.f37728b, interpolation, jNanoTime, this.f37959e);
                if (this.f37963i <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                    int i10 = this.f37955a;
                    if (i10 != -1) {
                        this.f37957c.f37728b.setTag(i10, Long.valueOf(System.nanoTime()));
                    }
                    int i11 = this.f37956b;
                    if (i11 != -1) {
                        this.f37957c.f37728b.setTag(i11, null);
                    }
                    this.f37960f.f37609f.add(this);
                }
                if (this.f37963i > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD || zC) {
                    this.f37960f.f37604a.invalidate();
                    return;
                }
                return;
            }
            long jNanoTime2 = System.nanoTime();
            long j11 = jNanoTime2 - this.f37965k;
            this.f37965k = jNanoTime2;
            float f11 = (((float) (j11 * 1.0E-6d)) * this.f37964j) + this.f37963i;
            this.f37963i = f11;
            if (f11 >= 1.0f) {
                this.f37963i = 1.0f;
            }
            Interpolator interpolator2 = this.f37961g;
            float interpolation2 = interpolator2 == null ? this.f37963i : interpolator2.getInterpolation(this.f37963i);
            n nVar2 = this.f37957c;
            boolean zC2 = nVar2.c(nVar2.f37728b, interpolation2, jNanoTime2, this.f37959e);
            if (this.f37963i >= 1.0f) {
                int i12 = this.f37955a;
                if (i12 != -1) {
                    this.f37957c.f37728b.setTag(i12, Long.valueOf(System.nanoTime()));
                }
                int i13 = this.f37956b;
                if (i13 != -1) {
                    this.f37957c.f37728b.setTag(i13, null);
                }
                if (!this.f37967m) {
                    this.f37960f.f37609f.add(this);
                }
            }
            if (this.f37963i < 1.0f || zC2) {
                this.f37960f.f37604a.invalidate();
            }
        }

        public void b(boolean z10) {
            int i10;
            this.f37962h = z10;
            if (z10 && (i10 = this.f37958d) != -1) {
                this.f37964j = i10 == 0 ? Float.MAX_VALUE : 1.0f / i10;
            }
            this.f37960f.f37604a.invalidate();
            this.f37965k = System.nanoTime();
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007d  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public z(Context context, XmlPullParser xmlPullParser) {
        byte b10;
        this.f37948o = context;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case -1962203927:
                            if (!name.equals("ConstraintOverride")) {
                                b10 = -1;
                            } else {
                                b10 = 2;
                            }
                            break;
                        case -1239391468:
                            if (!name.equals("KeyFrameSet")) {
                                b10 = -1;
                            } else {
                                b10 = 1;
                            }
                            break;
                        case 61998586:
                            if (!name.equals("ViewTransition")) {
                                b10 = -1;
                            } else {
                                b10 = 0;
                            }
                            break;
                        case 366511058:
                            if (!name.equals("CustomMethod")) {
                                b10 = -1;
                            } else {
                                b10 = 4;
                            }
                            break;
                        case 1791837707:
                            if (!name.equals("CustomAttribute")) {
                                b10 = -1;
                            } else {
                                b10 = 3;
                            }
                            break;
                        default:
                            b10 = -1;
                            break;
                    }
                    if (b10 == 0) {
                        d(context, xmlPullParser);
                    } else if (b10 == 1) {
                        this.f37939f = new g(context, xmlPullParser);
                    } else if (b10 == 2) {
                        this.f37940g = androidx.constraintlayout.widget.c.d(context, xmlPullParser);
                    } else if (b10 == 3 || b10 == 4) {
                        androidx.constraintlayout.widget.a.e(context, xmlPullParser, this.f37940g.f1516g);
                    } else {
                        Log.e("ViewTransition", y.a.a() + " unknown tag " + name);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(".xml:");
                        sb2.append(xmlPullParser.getLineNumber());
                        Log.e("ViewTransition", sb2.toString());
                    }
                } else if (eventType == 3 && "ViewTransition".equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    public void a(a0 a0Var, r rVar, int i10, androidx.constraintlayout.widget.c cVar, View... viewArr) {
        Interpolator interpolatorLoadInterpolator;
        Interpolator yVar;
        if (this.f37936c) {
            return;
        }
        int i11 = this.f37938e;
        if (i11 == 2) {
            View view = viewArr[0];
            n nVar = new n(view);
            s sVar = nVar.f37732f;
            sVar.f37838e = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            sVar.f37839f = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            nVar.H = true;
            sVar.d(view.getX(), view.getY(), view.getWidth(), view.getHeight());
            nVar.f37733g.d(view.getX(), view.getY(), view.getWidth(), view.getHeight());
            nVar.f37734h.e(view);
            nVar.f37735i.e(view);
            ArrayList<d> arrayList = this.f37939f.f37654a.get(-1);
            if (arrayList != null) {
                nVar.f37749w.addAll(arrayList);
            }
            nVar.f(rVar.getWidth(), rVar.getHeight(), System.nanoTime());
            int i12 = this.f37941h;
            int i13 = this.f37942i;
            int i14 = this.f37935b;
            Context context = rVar.getContext();
            int i15 = this.f37945l;
            if (i15 != -2) {
                if (i15 == -1) {
                    yVar = new y(t.c.c(this.f37946m));
                } else if (i15 == 0) {
                    interpolatorLoadInterpolator = new AccelerateDecelerateInterpolator();
                } else if (i15 == 1) {
                    interpolatorLoadInterpolator = new AccelerateInterpolator();
                } else if (i15 == 2) {
                    interpolatorLoadInterpolator = new DecelerateInterpolator();
                } else if (i15 == 4) {
                    interpolatorLoadInterpolator = new BounceInterpolator();
                } else if (i15 != 5) {
                    interpolatorLoadInterpolator = i15 != 6 ? null : new AnticipateInterpolator();
                } else {
                    interpolatorLoadInterpolator = new OvershootInterpolator();
                }
                new a(a0Var, nVar, i12, i13, i14, yVar, this.f37949p, this.f37950q);
                return;
            }
            interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, this.f37947n);
            yVar = interpolatorLoadInterpolator;
            new a(a0Var, nVar, i12, i13, i14, yVar, this.f37949p, this.f37950q);
            return;
        }
        if (i11 == 1) {
            for (int i16 : rVar.getConstraintSetIds()) {
                if (i16 != i10) {
                    androidx.constraintlayout.widget.c cVarH = rVar.h(i16);
                    for (View view2 : viewArr) {
                        androidx.constraintlayout.widget.c.a aVarI = cVarH.i(view2.getId());
                        androidx.constraintlayout.widget.c.a aVar = this.f37940g;
                        if (aVar != null) {
                            androidx.constraintlayout.widget.c.a.C0026a c0026a = aVar.f1517h;
                            if (c0026a != null) {
                                c0026a.e(aVarI);
                            }
                            aVarI.f1516g.putAll(this.f37940g.f1516g);
                        }
                    }
                }
            }
        }
        androidx.constraintlayout.widget.c cVar2 = new androidx.constraintlayout.widget.c();
        cVar2.f1509f.clear();
        for (Integer num : cVar.f1509f.keySet()) {
            androidx.constraintlayout.widget.c.a aVar2 = cVar.f1509f.get(num);
            if (aVar2 != null) {
                cVar2.f1509f.put(num, aVar2.clone());
            }
        }
        for (View view3 : viewArr) {
            androidx.constraintlayout.widget.c.a aVarI2 = cVar2.i(view3.getId());
            androidx.constraintlayout.widget.c.a aVar3 = this.f37940g;
            if (aVar3 != null) {
                androidx.constraintlayout.widget.c.a.C0026a c0026a2 = aVar3.f1517h;
                if (c0026a2 != null) {
                    c0026a2.e(aVarI2);
                }
                aVarI2.f1516g.putAll(this.f37940g.f1516g);
            }
        }
        rVar.s(i10, cVar2);
        rVar.s(R.id.view_transition, cVar);
        rVar.setState(R.id.view_transition, -1, -1);
        t.b bVar = new t.b(-1, rVar.f37760c, R.id.view_transition, i10);
        for (View view4 : viewArr) {
            int i17 = this.f37941h;
            if (i17 != -1) {
                bVar.f37880h = Math.max(i17, 8);
            }
            bVar.f37888p = this.f37937d;
            int i18 = this.f37945l;
            String str = this.f37946m;
            int i19 = this.f37947n;
            bVar.f37877e = i18;
            bVar.f37878f = str;
            bVar.f37879g = i19;
            int id2 = view4.getId();
            g gVar = this.f37939f;
            if (gVar != null) {
                ArrayList<d> arrayList2 = gVar.f37654a.get(-1);
                g gVar2 = new g();
                Iterator<d> it = arrayList2.iterator();
                while (it.hasNext()) {
                    d dVarClone = it.next().clone();
                    dVarClone.f37611b = id2;
                    gVar2.b(dVarClone);
                }
                bVar.f37883k.add(gVar2);
            }
        }
        rVar.setTransition(bVar);
        androidx.appcompat.app.s sVar2 = new androidx.appcompat.app.s(this, viewArr);
        rVar.b(1.0f);
        rVar.f37769g0 = sVar2;
    }

    public boolean b(View view) {
        int i10 = this.f37951r;
        boolean z10 = i10 == -1 || view.getTag(i10) != null;
        int i11 = this.f37952s;
        return z10 && (i11 == -1 || view.getTag(i11) == null);
    }

    public boolean c(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.f37943j == -1 && this.f37944k == null) || !b(view)) {
            return false;
        }
        if (view.getId() == this.f37943j) {
            return true;
        }
        return this.f37944k != null && (view.getLayoutParams() instanceof ConstraintLayout.b) && (str = ((ConstraintLayout.b) view.getLayoutParams()).f1432c0) != null && str.matches(this.f37944k);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    public final void d(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), z.d.f44958y);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                this.f37934a = typedArrayObtainStyledAttributes.getResourceId(index, this.f37934a);
            } else if (index == 8) {
                if (r.f37757r0) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f37943j);
                    this.f37943j = resourceId;
                    if (resourceId == -1) {
                        this.f37944k = typedArrayObtainStyledAttributes.getString(index);
                    }
                } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                    this.f37944k = typedArrayObtainStyledAttributes.getString(index);
                } else {
                    this.f37943j = typedArrayObtainStyledAttributes.getResourceId(index, this.f37943j);
                }
            } else if (index == 9) {
                this.f37935b = typedArrayObtainStyledAttributes.getInt(index, this.f37935b);
            } else if (index == 12) {
                this.f37936c = typedArrayObtainStyledAttributes.getBoolean(index, this.f37936c);
            } else if (index == 10) {
                this.f37937d = typedArrayObtainStyledAttributes.getInt(index, this.f37937d);
            } else if (index == 4) {
                this.f37941h = typedArrayObtainStyledAttributes.getInt(index, this.f37941h);
            } else if (index == 13) {
                this.f37942i = typedArrayObtainStyledAttributes.getInt(index, this.f37942i);
            } else if (index == 14) {
                this.f37938e = typedArrayObtainStyledAttributes.getInt(index, this.f37938e);
            } else if (index == 7) {
                int i11 = typedArrayObtainStyledAttributes.peekValue(index).type;
                if (i11 == 1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    this.f37947n = resourceId2;
                    if (resourceId2 != -1) {
                        this.f37945l = -2;
                    }
                } else if (i11 == 3) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f37946m = string;
                    if (string == null || string.indexOf(DialogConfigs.DIRECTORY_SEPERATOR) <= 0) {
                        this.f37945l = -1;
                    } else {
                        this.f37947n = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.f37945l = -2;
                    }
                } else {
                    this.f37945l = typedArrayObtainStyledAttributes.getInteger(index, this.f37945l);
                }
            } else if (index == 11) {
                this.f37949p = typedArrayObtainStyledAttributes.getResourceId(index, this.f37949p);
            } else if (index == 3) {
                this.f37950q = typedArrayObtainStyledAttributes.getResourceId(index, this.f37950q);
            } else if (index == 6) {
                this.f37951r = typedArrayObtainStyledAttributes.getResourceId(index, this.f37951r);
            } else if (index == 5) {
                this.f37952s = typedArrayObtainStyledAttributes.getResourceId(index, this.f37952s);
            } else if (index == 2) {
                this.f37954u = typedArrayObtainStyledAttributes.getResourceId(index, this.f37954u);
            } else if (index == 1) {
                this.f37953t = typedArrayObtainStyledAttributes.getInteger(index, this.f37953t);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("ViewTransition(");
        sbA.append(y.a.c(this.f37948o, this.f37934a));
        sbA.append(")");
        return sbA.toString();
    }
}
