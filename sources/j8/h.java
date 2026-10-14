package j8;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.inscode.autoclicker.R;
import fd.j0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import jc.w;
import kc.c0;
import r1.r;
import x1.q;
import y9.v;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f31766a;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31767a;

        static {
            int[] iArr = new int[v.e.values().length];
            iArr[v.e.SET.ordinal()] = 1;
            iArr[v.e.SCALE.ordinal()] = 2;
            iArr[v.e.NATIVE.ordinal()] = 3;
            iArr[v.e.NO_ANIMATION.ordinal()] = 4;
            f31767a = iArr;
        }
    }

    static {
        v9.b.a aVar = v9.b.f36747a;
        f31766a = new v(aVar.a(100L), aVar.a(Double.valueOf(0.6d)), null, null, aVar.a(v.e.FADE), null, null, aVar.a(Double.valueOf(1.0d)), 108, null);
    }

    public static final Float a(Double d10) {
        if (d10 == null) {
            return null;
        }
        return Float.valueOf(bd.e.d((float) d10.doubleValue(), StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 1.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int[], java.lang.Object] */
    public static final void b(r rVar, uc.l<? super int[], w> lVar) {
        ?? r10 = new int[2];
        rVar.f35133b.getLocationOnScreen(r10);
        lVar.invoke(r10);
    }

    public static final ScaleAnimation c(float f10, float f11) {
        return new ScaleAnimation(f10, f11, f10, f11, 1, 0.5f, 1, 0.5f);
    }

    public static final View d(r1.l lVar, View view, ViewGroup viewGroup, r rVar, String str) {
        if (!q.k(view)) {
            return view;
        }
        Object obj = rVar.f35132a.get(str);
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.IntArray");
        return k.a(view, viewGroup, lVar, (int[]) obj);
    }

    public static final Float e(Double d10) {
        if (d10 == null) {
            return null;
        }
        return Float.valueOf(bd.e.a((float) d10.doubleValue(), StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD));
    }

    /* JADX WARN: Code duplicated, block: B:71:0x00d9  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Animation f(v vVar, v9.d dVar, boolean z10, View view) {
        Interpolator interpolatorB;
        float fFloatValue;
        ScaleAnimation scaleAnimationC;
        Object[] objArr;
        w wVar;
        Object[] objArr2;
        AlphaAnimation alphaAnimation;
        v.e eVarB = vVar.f43392e.b(dVar);
        int i10 = a.f31767a[eVarB.ordinal()];
        animationSet = 0;
        animationSet = 0;
        animationSet = 0;
        AnimationSet animationSet = 0;
        if (i10 != 1) {
            if (i10 == 2) {
                if (z10) {
                    v9.b<Double> bVar = vVar.f43389b;
                    Float fE = e(bVar == null ? null : bVar.b(dVar));
                    float fFloatValue2 = fE != null ? fE.floatValue() : 0.95f;
                    v9.b<Double> bVar2 = vVar.f43394g;
                    Float fE2 = e(bVar2 != null ? bVar2.b(dVar) : null);
                    scaleAnimationC = c(fFloatValue2, fE2 != null ? fE2.floatValue() : 1.0f);
                } else {
                    v9.b<Double> bVar3 = vVar.f43394g;
                    Float fE3 = e(bVar3 == null ? null : bVar3.b(dVar));
                    fFloatValue = fE3 != null ? fE3.floatValue() : 1.0f;
                    v9.b<Double> bVar4 = vVar.f43389b;
                    Float fE4 = e(bVar4 != null ? bVar4.b(dVar) : null);
                    scaleAnimationC = c(fFloatValue, fE4 != null ? fE4.floatValue() : 0.95f);
                }
                animationSet = scaleAnimationC;
            } else if (i10 != 3) {
                if (i10 != 4) {
                    if (z10) {
                        v9.b<Double> bVar5 = vVar.f43389b;
                        Float fA = a(bVar5 == null ? null : bVar5.b(dVar));
                        float fFloatValue3 = fA != null ? fA.floatValue() : 0.6f;
                        v9.b<Double> bVar6 = vVar.f43394g;
                        Float fA2 = a(bVar6 != null ? bVar6.b(dVar) : null);
                        alphaAnimation = new AlphaAnimation(fFloatValue3, fA2 != null ? fA2.floatValue() : 1.0f);
                    } else {
                        v9.b<Double> bVar7 = vVar.f43394g;
                        Float fA3 = a(bVar7 == null ? null : bVar7.b(dVar));
                        fFloatValue = fA3 != null ? fA3.floatValue() : 1.0f;
                        v9.b<Double> bVar8 = vVar.f43389b;
                        Float fA4 = a(bVar8 != null ? bVar8.b(dVar) : null);
                        alphaAnimation = new AlphaAnimation(fFloatValue, fA4 != null ? fA4.floatValue() : 0.6f);
                    }
                    animationSet = alphaAnimation;
                }
            } else if (view != null) {
                Drawable background = view.getBackground();
                LayerDrawable layerDrawable = background instanceof LayerDrawable ? (LayerDrawable) background : null;
                if (layerDrawable != null) {
                    bd.c cVarH = bd.e.h(0, layerDrawable.getNumberOfLayers());
                    if (!(cVarH instanceof Collection) || !((Collection) cVarH).isEmpty()) {
                        Iterator it = cVarH.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                objArr2 = true;
                                break;
                            }
                            if ((layerDrawable.getId(((c0) it).a()) == R.drawable.native_animation_background) != false) {
                                objArr2 = false;
                                break;
                            }
                        }
                    } else {
                        objArr2 = true;
                        break;
                    }
                    if (objArr2 == true) {
                        objArr = true;
                    } else {
                        objArr = false;
                    }
                } else {
                    objArr = true;
                }
                if (objArr != false) {
                    ArrayList arrayList = new ArrayList();
                    if (layerDrawable == null) {
                        wVar = null;
                    } else {
                        int numberOfLayers = layerDrawable.getNumberOfLayers();
                        int i11 = 0;
                        while (i11 < numberOfLayers) {
                            int i12 = i11 + 1;
                            Drawable drawable = layerDrawable.getDrawable(i11);
                            j0.h(drawable, "it.getDrawable(i)");
                            arrayList.add(drawable);
                            i11 = i12;
                        }
                        wVar = w.f31842a;
                    }
                    if (wVar == null) {
                        Drawable background2 = view.getBackground();
                        j0.h(background2, "view.background");
                        arrayList.add(background2);
                    }
                    Context context = view.getContext();
                    Object obj = e0.a.f28964a;
                    Drawable drawableB = e0.a.c.b(context, R.drawable.native_animation_background);
                    if (drawableB != null) {
                        arrayList.add(drawableB);
                    }
                    Object[] array = arrayList.toArray(new Drawable[0]);
                    Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    LayerDrawable layerDrawable2 = new LayerDrawable((Drawable[]) array);
                    layerDrawable2.setId(arrayList.size() - 1, R.drawable.native_animation_background);
                    view.setBackground(layerDrawable2);
                }
            }
        } else {
            animationSet = new AnimationSet(false);
            List<v> list = vVar.f43391d;
            if (list != null) {
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    Animation animationF = f((v) it2.next(), dVar, z10, view);
                    if (animationF != null) {
                        animationSet.addAnimation(animationF);
                    }
                }
            }
        }
        if (eVarB != v.e.SET) {
            if (animationSet != 0) {
                if (z10) {
                    Interpolator interpolatorB2 = f8.b.b(vVar.f43390c.b(dVar));
                    j0.i(interpolatorB2, "<this>");
                    interpolatorB = new q7.f(interpolatorB2);
                } else {
                    interpolatorB = f8.b.b(vVar.f43390c.b(dVar));
                }
                animationSet.setInterpolator(interpolatorB);
            }
            if (animationSet != 0) {
                animationSet.setDuration(vVar.f43388a.b(dVar).longValue());
            }
        }
        if (animationSet != 0) {
            animationSet.setStartOffset(vVar.f43393f.b(dVar).longValue());
        }
        if (animationSet != 0) {
            animationSet.setFillAfter(true);
        }
        return animationSet;
    }
}
