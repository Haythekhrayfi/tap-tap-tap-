package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Property;
import defpackage.a;
import java.util.ArrayList;
import java.util.List;
import o2.b;
import q.h;

/* JADX INFO: loaded from: classes2.dex */
public class MotionSpec {
    private static final String TAG = "MotionSpec";
    private final h<String, MotionTiming> timings = new h<>();
    private final h<String, PropertyValuesHolder[]> propertyValues = new h<>();

    private static void addInfoFromAnimator(MotionSpec motionSpec, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            motionSpec.setPropertyValues(objectAnimator.getPropertyName(), objectAnimator.getValues());
            motionSpec.setTiming(objectAnimator.getPropertyName(), MotionTiming.createFromAnimator(objectAnimator));
        } else {
            throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
        }
    }

    private PropertyValuesHolder[] clonePropertyValuesHolder(PropertyValuesHolder[] propertyValuesHolderArr) {
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i10 = 0; i10 < propertyValuesHolderArr.length; i10++) {
            propertyValuesHolderArr2[i10] = propertyValuesHolderArr[i10].clone();
        }
        return propertyValuesHolderArr2;
    }

    public static MotionSpec createFromAttribute(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        if (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return createFromResource(context, resourceId);
    }

    public static MotionSpec createFromResource(Context context, int i10) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i10);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return createSpecFromAnimators(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return createSpecFromAnimators(arrayList);
        } catch (Exception e10) {
            StringBuilder sbA = a.a("Can't load animation resource ID #0x");
            sbA.append(Integer.toHexString(i10));
            Log.w(TAG, sbA.toString(), e10);
            return null;
        }
    }

    private static MotionSpec createSpecFromAnimators(List<Animator> list) {
        MotionSpec motionSpec = new MotionSpec();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            addInfoFromAnimator(motionSpec, list.get(i10));
        }
        return motionSpec;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MotionSpec) {
            return this.timings.equals(((MotionSpec) obj).timings);
        }
        return false;
    }

    public <T> ObjectAnimator getAnimator(String str, T t10, Property<T, ?> property) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(t10, getPropertyValues(str));
        objectAnimatorOfPropertyValuesHolder.setProperty(property);
        getTiming(str).apply(objectAnimatorOfPropertyValuesHolder);
        return objectAnimatorOfPropertyValuesHolder;
    }

    public PropertyValuesHolder[] getPropertyValues(String str) {
        if (hasPropertyValues(str)) {
            return clonePropertyValuesHolder(this.propertyValues.getOrDefault(str, null));
        }
        throw new IllegalArgumentException();
    }

    public MotionTiming getTiming(String str) {
        if (hasTiming(str)) {
            return this.timings.getOrDefault(str, null);
        }
        throw new IllegalArgumentException();
    }

    public long getTotalDuration() {
        int i10 = this.timings.f34737e;
        long jMax = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            MotionTiming motionTimingL = this.timings.l(i11);
            jMax = Math.max(jMax, motionTimingL.getDuration() + motionTimingL.getDelay());
        }
        return jMax;
    }

    public boolean hasPropertyValues(String str) {
        return this.propertyValues.getOrDefault(str, null) != null;
    }

    public boolean hasTiming(String str) {
        return this.timings.getOrDefault(str, null) != null;
    }

    public int hashCode() {
        return this.timings.hashCode();
    }

    public void setPropertyValues(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.propertyValues.put(str, propertyValuesHolderArr);
    }

    public void setTiming(String str, MotionTiming motionTiming) {
        this.timings.put(str, motionTiming);
    }

    public String toString() {
        StringBuilder sbA = b.a('\n');
        sbA.append(getClass().getName());
        sbA.append('{');
        sbA.append(Integer.toHexString(System.identityHashCode(this)));
        sbA.append(" timings: ");
        sbA.append(this.timings);
        sbA.append("}\n");
        return sbA.toString();
    }
}
