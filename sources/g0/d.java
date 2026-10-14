package g0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.inscode.autoclicker.R;
import java.io.IOException;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f29663a = new ThreadLocal<>();

    public static ColorStateList a(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r31v0, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    public static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        int i10;
        int[] iArr;
        boolean z10;
        float f10;
        float f11;
        float f12;
        resources = resources;
        attributeSet = attributeSet;
        theme = theme;
        String name = xmlPullParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        ?? r10 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        Object[] objArr = new int[20][];
        int[] iArr2 = new int[20];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == r10 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                int[] iArr3 = c0.a.f3528a;
                ?? ObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr3) : theme.obtainStyledAttributes(attributeSet, iArr3, i12, i12);
                int resourceId = ObtainAttributes.getResourceId(i12, -1);
                if (resourceId == -1) {
                    color = ObtainAttributes.getColor(i12, -65281);
                } else {
                    ThreadLocal<TypedValue> threadLocal = f29663a;
                    TypedValue typedValue = threadLocal.get();
                    if (typedValue == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    }
                    resources.getValue(resourceId, typedValue, r10);
                    int i13 = typedValue.type;
                    if (((i13 < 28 || i13 > 31) ? i12 : r10) == 0) {
                        try {
                            color = a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                        } catch (Exception unused) {
                            color = ObtainAttributes.getColor(i12, -65281);
                        }
                    } else {
                        color = ObtainAttributes.getColor(i12, -65281);
                    }
                }
                float f13 = 1.0f;
                if (ObtainAttributes.hasValue(r10)) {
                    f13 = ObtainAttributes.getFloat(r10, 1.0f);
                } else if (ObtainAttributes.hasValue(3)) {
                    f13 = ObtainAttributes.getFloat(3, 1.0f);
                }
                float f14 = (Build.VERSION.SDK_INT < 31 || !ObtainAttributes.hasValue(2)) ? ObtainAttributes.getFloat(4, -1.0f) : ObtainAttributes.getFloat(2, -1.0f);
                ObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr4 = new int[attributeCount];
                int i14 = i12;
                while (i12 < attributeCount) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i12);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                        int i15 = i14 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i12, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr4[i14] = attributeNameResource;
                        i14 = i15;
                    }
                    i12++;
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr4, i14);
                boolean z11 = f14 >= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && f14 <= 100.0f;
                if (f13 != 1.0f || z11) {
                    int iJ = androidx.activity.i.j((int) ((Color.alpha(color) * f13) + 0.5f), 0, 255);
                    if (z11) {
                        b bVarA = b.a(color);
                        float f15 = bVarA.f29653a;
                        float f16 = bVarA.f29654b;
                        k kVar = k.f29688k;
                        if (f16 >= 1.0d && Math.round(f14) > 0.0d && Math.round(f14) < 100.0d) {
                            float fMin = f15 < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD ? StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD : Math.min(360.0f, f15);
                            boolean z12 = true;
                            b bVar = null;
                            float f17 = 0.0f;
                            float f18 = 100.0f;
                            float fA = f16;
                            while (true) {
                                if (Math.abs(f17 - f16) < 0.4f) {
                                    i10 = depth2;
                                    iArr = iArrTrimStateSet;
                                    z10 = true;
                                    if (bVar != null) {
                                        color = bVar.c(kVar);
                                        break;
                                    }
                                    break;
                                }
                                float f19 = 1000.0f;
                                b bVar2 = null;
                                float f20 = 0.0f;
                                float f21 = 1000.0f;
                                while (true) {
                                    if (Math.abs(f20 - f18) <= 0.01f) {
                                        i10 = depth2;
                                        f10 = fA;
                                        f11 = fMin;
                                        iArr = iArrTrimStateSet;
                                        z10 = true;
                                        break;
                                    }
                                    i10 = depth2;
                                    float fA2 = a.a(f18, f20, 2.0f, f20);
                                    float f22 = f20;
                                    int iC = b.b(fA2, fA, fMin).c(k.f29688k);
                                    float fB = c.b(Color.red(iC));
                                    float fB2 = c.b(Color.green(iC));
                                    float fB3 = c.b(Color.blue(iC));
                                    float[][] fArr = c.f29662d;
                                    z10 = true;
                                    float f23 = ((fB3 * fArr[1][2]) + ((fB2 * fArr[1][1]) + (fB * fArr[1][0]))) / 100.0f;
                                    float fCbrt = f23 <= 0.008856452f ? f23 * 903.2963f : (((float) Math.cbrt(f23)) * 116.0f) - 16.0f;
                                    float fAbs = Math.abs(f14 - fCbrt);
                                    if (fAbs < 0.2f) {
                                        b bVarA2 = b.a(iC);
                                        f10 = fA;
                                        b bVarB = b.b(bVarA2.f29655c, bVarA2.f29654b, fMin);
                                        f11 = fMin;
                                        float f24 = bVarA2.f29656d - bVarB.f29656d;
                                        f12 = f18;
                                        float f25 = bVarA2.f29657e - bVarB.f29657e;
                                        float f26 = bVarA2.f29658f - bVarB.f29658f;
                                        iArr = iArrTrimStateSet;
                                        float fPow = (float) (Math.pow(Math.sqrt((f26 * f26) + (f25 * f25) + (f24 * f24)), 0.63d) * 1.41d);
                                        if (fPow <= 1.0f) {
                                            f21 = fPow;
                                            bVar2 = bVarA2;
                                            f19 = fAbs;
                                        }
                                    } else {
                                        iArr = iArrTrimStateSet;
                                        f10 = fA;
                                        f11 = fMin;
                                        f12 = f18;
                                    }
                                    if (f19 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && f21 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                        break;
                                    }
                                    if (fCbrt < f14) {
                                        f20 = fA2;
                                        f18 = f12;
                                    } else {
                                        f20 = f22;
                                        f18 = fA2;
                                    }
                                    iArrTrimStateSet = iArr;
                                    depth2 = i10;
                                    fA = f10;
                                    fMin = f11;
                                }
                                b bVar3 = bVar2;
                                if (!z12) {
                                    if (bVar3 == null) {
                                        f16 = f10;
                                    } else {
                                        bVar = bVar3;
                                        f17 = f10;
                                    }
                                    fA = a.a(f16, f17, 2.0f, f17);
                                    f18 = 100.0f;
                                } else {
                                    if (bVar3 != null) {
                                        color = bVar3.c(kVar);
                                        break;
                                    }
                                    fA = a.a(f16, f17, 2.0f, f17);
                                    f18 = 100.0f;
                                    z12 = false;
                                }
                                iArrTrimStateSet = iArr;
                                depth2 = i10;
                                fMin = f11;
                            }
                        } else {
                            i10 = depth2;
                            iArr = iArrTrimStateSet;
                            z10 = true;
                        }
                        color = c.a(f14);
                        break;
                    }
                    i10 = depth2;
                    iArr = iArrTrimStateSet;
                    z10 = true;
                    color = (16777215 & color) | (iJ << 24);
                    r10 = z10;
                } else {
                    r10 = 1;
                    i10 = depth2;
                    iArr = iArrTrimStateSet;
                }
                int i16 = i11 + 1;
                if (i16 > iArr2.length) {
                    int[] iArr5 = new int[i11 <= 4 ? 8 : i11 * 2];
                    System.arraycopy(iArr2, 0, iArr5, 0, i11);
                    iArr2 = iArr5;
                }
                iArr2[i11] = color;
                if (i16 > objArr.length) {
                    Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i11 > 4 ? i11 * 2 : 8);
                    System.arraycopy(objArr, 0, objArr2, 0, i11);
                    objArr = objArr2;
                }
                objArr[i11] = iArr;
                objArr = (int[][]) objArr;
                i12 = 0;
                i11 = i16;
                depth2 = i10;
            } else {
                i12 = 0;
                depth2 = depth2;
            }
        }
        int[] iArr6 = new int[i11];
        int[][] iArr7 = new int[i11][];
        System.arraycopy(iArr2, 0, iArr6, 0, i11);
        System.arraycopy(objArr, 0, iArr7, 0, i11);
        return new ColorStateList(iArr7, iArr6);
    }
}
