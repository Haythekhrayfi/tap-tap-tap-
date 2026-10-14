package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Arrays;
import java.util.HashMap;
import v.f;
import v.j;
import v.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends View {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f1493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f1495e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j f1496f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f1497g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f1498h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View[] f1499i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public HashMap<Integer, String> f1500j;

    public b(Context context) {
        super(context);
        this.f1493c = new int[32];
        this.f1499i = null;
        this.f1500j = new HashMap<>();
        this.f1495e = context;
        l(null);
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1493c = new int[32];
        this.f1499i = null;
        this.f1500j = new HashMap<>();
        this.f1495e = context;
        l(attributeSet);
    }

    public b(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1493c = new int[32];
        this.f1499i = null;
        this.f1500j = new HashMap<>();
        this.f1495e = context;
        l(attributeSet);
    }

    public final void e(String str) {
        if (str == null || str.length() == 0 || this.f1495e == null) {
            return;
        }
        String strTrim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int iK = k(strTrim);
        if (iK != 0) {
            this.f1500j.put(Integer.valueOf(iK), strTrim);
            f(iK);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
    }

    public final void f(int i10) {
        if (i10 == getId()) {
            return;
        }
        int i11 = this.f1494d + 1;
        int[] iArr = this.f1493c;
        if (i11 > iArr.length) {
            this.f1493c = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f1493c;
        int i12 = this.f1494d;
        iArr2[i12] = i10;
        this.f1494d = i12 + 1;
    }

    public final void g(String str) {
        if (str == null || str.length() == 0 || this.f1495e == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.b) && strTrim.equals(((ConstraintLayout.b) layoutParams).f1432c0)) {
                if (childAt.getId() == -1) {
                    StringBuilder sbA = defpackage.a.a("to use ConstraintTag view ");
                    sbA.append(childAt.getClass().getSimpleName());
                    sbA.append(" must have an ID");
                    Log.w("ConstraintHelper", sbA.toString());
                } else {
                    f(childAt.getId());
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f1493c, this.f1494d);
    }

    public void h(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i10 = 0; i10 < this.f1494d; i10++) {
            View viewById = constraintLayout.getViewById(this.f1493c[i10]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void i(ConstraintLayout constraintLayout) {
    }

    public final int j(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || (resources = this.f1495e.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            if (childAt.getId() != -1) {
                String resourceEntryName = null;
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public final int k(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int iJ = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object designInformation = constraintLayout.getDesignInformation(0, str);
            if (designInformation instanceof Integer) {
                iJ = ((Integer) designInformation).intValue();
            }
        }
        if (iJ == 0 && constraintLayout != null) {
            iJ = j(constraintLayout, str);
        }
        if (iJ == 0) {
            try {
                iJ = z.c.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return iJ == 0 ? this.f1495e.getResources().getIdentifier(str, FacebookMediationAdapter.KEY_ID, this.f1495e.getPackageName()) : iJ;
    }

    public void l(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, z.d.f44935b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 35) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f1497g = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f1498h = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void m(c.a aVar, k kVar, ConstraintLayout.b bVar, SparseArray<f> sparseArray) {
        c.b bVar2 = aVar.f1514e;
        int[] iArr = bVar2.f1550j0;
        int i10 = 0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = bVar2.f1552k0;
            if (str != null) {
                if (str.length() > 0) {
                    c.b bVar3 = aVar.f1514e;
                    String[] strArrSplit = bVar3.f1552k0.split(",");
                    getContext();
                    int[] iArrCopyOf = new int[strArrSplit.length];
                    int i11 = 0;
                    for (String str2 : strArrSplit) {
                        int iK = k(str2.trim());
                        if (iK != 0) {
                            iArrCopyOf[i11] = iK;
                            i11++;
                        }
                    }
                    if (i11 != strArrSplit.length) {
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i11);
                    }
                    bVar3.f1550j0 = iArrCopyOf;
                } else {
                    aVar.f1514e.f1550j0 = null;
                }
            }
        }
        if (kVar == null) {
            return;
        }
        kVar.a();
        if (aVar.f1514e.f1550j0 == null) {
            return;
        }
        while (true) {
            int[] iArr2 = aVar.f1514e.f1550j0;
            if (i10 >= iArr2.length) {
                return;
            }
            f fVar = sparseArray.get(iArr2[i10]);
            if (fVar != null) {
                kVar.b(fVar);
            }
            i10++;
        }
    }

    public void n(f fVar, boolean z10) {
    }

    public void o() {
        if (this.f1496f == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).f1468u0 = (f) this.f1496f;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f1497g;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f1498h;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f1497g = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f1494d = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i10);
            if (iIndexOf == -1) {
                e(str.substring(i10));
                return;
            } else {
                e(str.substring(i10, iIndexOf));
                i10 = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f1498h = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f1494d = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i10);
            if (iIndexOf == -1) {
                g(str.substring(i10));
                return;
            } else {
                g(str.substring(i10, iIndexOf));
                i10 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f1497g = null;
        this.f1494d = 0;
        for (int i10 : iArr) {
            f(i10);
        }
    }

    @Override // android.view.View
    public void setTag(int i10, Object obj) {
        super.setTag(i10, obj);
        if (obj == null && this.f1497g == null) {
            f(i10);
        }
    }
}
